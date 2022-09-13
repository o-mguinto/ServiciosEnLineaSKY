package mx.com.sky.sel.managedbeans.canal;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import java.util.TimeZone;
import java.util.UUID;

import javax.faces.application.FacesMessage;
import javax.faces.component.html.HtmlInputHidden;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import mx.com.sky.sel.enums.CodigoPais;
import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import static mx.com.sky.sel.log.LogPC.println;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.managedbeans.sesion.SesionMB;
import mx.com.sky.sel.managedbeans.tarjeta.BBTarjeta;
import mx.com.sky.sel.proxyclients.apigateway.ebf.orquestarprocesopago.types.RespuestaPagoTarjeta;
import mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarriesgo.types.ParametroComerciante;
import mx.com.sky.sel.services.beans.billetera.ActualizarTDCBilleteraResponseDTO;
import mx.com.sky.sel.services.beans.billetera.RequestGenerarIdUnicoDePagoDTO;
import mx.com.sky.sel.services.beans.billetera.RequestOrquestarProcesoPagoDTO;
import mx.com.sky.sel.services.beans.billetera.ResponseGenerarIdUnicoDePagoDTO;
import mx.com.sky.sel.services.beans.billetera.ResponseOrquestarProcesoPagoDTO;
import mx.com.sky.sel.services.beans.billetera.TarjetaBilletera;
import mx.com.sky.sel.services.beans.billetera.TokenDTO;
import mx.com.sky.sel.services.beans.cambiopaquete.Paquete;
import mx.com.sky.sel.services.beans.canal.CanalCarta;
import mx.com.sky.sel.services.beans.cybersource.ConsultarTipoCambioRequestDTO;
import mx.com.sky.sel.services.beans.cybersource.ConsultarTipoCambioResponseDTO;
import mx.com.sky.sel.services.beans.cybersource.DeterminarComercioRequestDTO;
import mx.com.sky.sel.services.beans.cybersource.DeterminarComercioResponseDTO;
import mx.com.sky.sel.services.beans.pagos.tarjetas.Bines;
import mx.com.sky.sel.services.beans.pagos.tarjetas.Tarjeta;
import mx.com.sky.sel.services.beans.riesgo.EvaluarRiesgoRequestDTO;
import mx.com.sky.sel.services.beans.riesgo.EvaluarRiesgoResponseDTO;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.cybersource.billetera.BilleteraManagementBean;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.pagos.tarjetas.ServicioBines;
import mx.com.sky.sel.services.utils.SolicitudServicioUtils;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.Constantes;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.UtileriasMB;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;

import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;
//import mx.com.sky.sel.services.pagos.administratarjeta.ServicioTarjetaPSManagementBean;

public class PFCanalesContrata extends UtileriasMB implements Serializable{
    @SuppressWarnings("compatibility:7276736150513633611")
    private static final long serialVersionUID = 7483574543192206508L;

    private CanalCarta canal;
        private String tarjetaInteligente;
        private Tarjeta tarjeta;
        private String numeroSolicitud;
        private transient Object tarjetaObject;
        private Map<String, String> tipos;
        private Map<String, String> meses;
        private Map<String, String> anios;
        private Map<String, String> creditoDebitoMap;
        private String ticketNumber = "";
        private String exception;
        private boolean aviso;
        private double precio;
        private boolean aceptaContrataHotGo;
    private String tipoTarjetaBines;
    private String tipoTarjeta;
    private Boolean tarjetaValida;
    private transient HtmlInputHidden tarjetaProtegida;
    private transient HtmlInputHidden key_Id;
    private transient HtmlInputHidden phase_Id;
    
    //Cyber
    private List<TarjetaBilletera> tarjetasBilletera;
    private Map<String, String> tiposPago;
    private String tipoPago;
    private TarjetaBilletera tarjetaBillParaPago = null;
    private static final String CODIGO_CYBER_AMEX = "003";
    private String cVVTemp;
    private String mensajeRespuesta;
    private static final String MENSAJE_PAGO_REALIZADO = "bbpago.pagorealizado";
    private static final String MENSAJE_ERROR_DEFAULT = "bbpago.error.default";
    //Cyber

    public PFCanalesContrata() {
            super();
            limpiarDatos();
            tipos = new LinkedHashMap<String, String>();
            tipos.put(getMensajeProperties("TIPO_TARJETA_VISA"), getMensajeProperties("DESC_TARJETA_VISA"));
            tipos.put(getMensajeProperties("TIPO_TARJETA_MASTER_CARD"), getMensajeProperties("DESC_TARJETA_MASTER_CARD"));
            tipos.put(getMensajeProperties("TIPO_TARJETA_AMEX"), getMensajeProperties("DESC_TARJETA_AMEX")); //label, value

            meses = new LinkedHashMap<String, String>();
            meses.put("01", "01");
            meses.put("02", "02");
            meses.put("03", "03");
            meses.put("04", "04");
            meses.put("05", "05");
            meses.put("06", "06");
            meses.put("07", "07");
            meses.put("08", "08");
            meses.put("09", "09");
            meses.put("10", "10");
            meses.put("11", "11");
            meses.put("12", "12");


            anios = new LinkedHashMap<String, String>();
            int anio = Calendar.getInstance().get(Calendar.YEAR);
            anio = anio % 100;
            for (int i = anio; i <= (anio + 10); i++)
                anios.put(String.valueOf(i), String.valueOf(i));

            creditoDebitoMap = new LinkedHashMap<String, String>();
            creditoDebitoMap.put("Cr\u00E9dito", "01");
            creditoDebitoMap.put("D\u00E9bito", "02");
            aceptaContrataHotGo=false;
            LogPC.println(this, "PFCanalesContrata()");
            tipoTarjetaBines="";
            tipoTarjeta=null;
            tarjetaValida=false;
            
            //Cyber
            tarjetasBilletera = consultarTarjetasBilletera();
            actualizarComboBoxFormasPagoBilletera();
            //Cyber
        }
    
    //Metodos cyber
    private List<TarjetaBilletera> consultarTarjetasBilletera() {
        List<TarjetaBilletera> tarjetasConsultadas = null;
        BilleteraManagementBean billeteraMB = null;
        
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String organizationId = sesion.getSuscriptor().getOrganizacion();
        String cuentaSKY = sesion.getSuscriptor().getCuentaSKY();
        LogPC.println(this, "organizationId: " + organizationId);
        LogPC.println(this, "cuentaSKY: " + cuentaSKY);
        
        billeteraMB = new BilleteraManagementBean();
        
        tarjetasConsultadas = billeteraMB.consultarBilletera(cuentaSKY);
        
        //DUMMY
        //tarjetasConsultadas = billeteraMB.consultarBilletera("501248988964");
        //DUMMY
        
        println(this, tarjetasConsultadas.size() + " Tarjetas obtenidas desde la billetera");
//        if( tarjetasConsultadas.size() > 0 ) {
//            hayTarjetas=true;
//        } else {
//            hayTarjetas=false;
//        }
        
        if( tarjetasConsultadas != null && !tarjetasConsultadas.isEmpty() ) {
            for(TarjetaBilletera tarBill : tarjetasConsultadas ) {
                if( tarBill.getTipoTarjeta() != null ) {
                    if( tarBill.getTipoTarjeta().equalsIgnoreCase("CREDITO") ) {
                        tarBill.setTipoTarjetaParaMostrar("crédito");
                    } else if( tarBill.getTipoTarjeta().equalsIgnoreCase("DEBITO") ) {
                        tarBill.setTipoTarjetaParaMostrar("débito");
                    }
                }
                
                
                if( tarBill.getNumeroTarjeta() != null ) {
                    if( tarBill.getNumeroTarjeta().length() >= 4 ) {
                        tarBill.setNumeroTarjetaOculta("************" + tarBill.getNumeroTarjeta().substring(tarBill.getNumeroTarjeta().length()-4, tarBill.getNumeroTarjeta().length()));
                    }
                }
            }
        }
        
        return tarjetasConsultadas;
    }
    
    private void actualizarComboBoxFormasPagoBilletera(){
        if( this.tarjetasBilletera != null && !this.tarjetasBilletera.isEmpty() ) {
            tiposPago = new LinkedHashMap<String, String>();
            for (TarjetaBilletera tarjetaBilletera : tarjetasBilletera) {
                tiposPago.put(tarjetaBilletera.getNumeroTarjetaOculta() + " - " + tarjetaBilletera.getTipoTarjetaParaMostrar(), tarjetaBilletera.getNumeroTarjeta());
    
            }
        }
    }
    
    public boolean isEmptyTarjetasBilletera() {
        return (this.tarjetasBilletera == null || this.tarjetasBilletera.isEmpty());
    }
    //Metodos cyber


        private void limpiarDatos() {
            canal = new CanalCarta();
            tarjetaInteligente = "";
            tarjeta = new Tarjeta();
        }

        public String cbCancelar_action() {
            // Add event code here...
            LogPC.println(this, "cbCancelar_action");
            limpiarDatos();
            return "closeTaskFlow";
        }


        private boolean contratar() throws Exception {
            boolean respuesta = false;

            //Coigo para contratar canal
            ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
            Paquete paquete = new Paquete();
            SolicitudServicioBean solicitudServicio;
            try {
                solicitudServicio = new SolicitudServicioBean();
                solicitudServicio = SolicitudServicioUtils.convert(solicitudServicio, canal.getNombre());
                if (sesion.getSuscriptor().getMarketType().equalsIgnoreCase("Normal VeTV PLUS")) {
                    if (sesion.isCuentaVETVPLUSHD()) {
                        paquete.setPaqueteActual("VETV PLUS HD");
                    }else{
                       paquete.setPaqueteActual("VETV PLUS");
                    }
                }else if (sesion.getSuscriptor().getMarketType().equalsIgnoreCase("Normal VeTV")) {
                    if (sesion.isCuentaVETVHD()) {
                        paquete.setPaqueteActual("VETV HD");
                    }else{
                        paquete.setPaqueteActual("VETV");
                    }
                }else{
                    paquete.setPaqueteActual(sesion.getSuscriptor().getPaquete());
                }
                paquete.setServicioAContratar(canal.getNombre());
                paquete.setCosto("$ " + getPrecio());
                paquete.setNumero(canal.getCanal());
                paquete.setNombre_display(canal.getNombre_display());

                solicitudServicio.setContratacionServicios(paquete);
                solicitudServicio.setTarjetaInteligente(tarjetaInteligente);
                
                BindingContainer bindings = getBindings();
                OperationBinding op = bindings.getOperationBinding("crearSolicitudPs");
                
                op.getParamsMap().put("solicitudServicio", solicitudServicio);
                
                
                numeroSolicitud = String.valueOf(op.execute());
                
                OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CAC, numeroSolicitud);
                respuesta = true;
            } catch (Exception e) {
                LogPC.printlnError(this, e.getMessage(), e);
                throw e;
            }
            return respuesta;
        }

        public String cbContratar_action() {
            String resultado = null;
            aviso = false;
            try {
                if (contratar()) {
                    resultado = "siguiente";
                } else {
                    ADFUtils.showErrorMessage("No puede contratar " + canal.getNombre() + " por favor llame a atenci\u00F3n a clientes.");
                    resultado = "warning";
                }
            } catch (Exception e) {
                if(e.getMessage().contains("Estimado suscriptor el canal solicitado ya se encuentra activo en su cuenta")){
                    ADFUtils.showInfoMessage(e.getMessage());
                    this.setException(e.getMessage());
                    aviso = true;
                    resultado = "warning";
                }else{
                    ADFUtils.showErrorMessage(getMensajeProperties("mensaje_PantallaError_generico"));
                    this.setException(getMensajeProperties("mensaje_PantallaError_generico"));
                    resultado = "warning";
                    
                }
                
                
            }
            LogPC.println(this, "Valor de var resultado:   ");
            LogPC.println(this, resultado);
            return resultado;
        }
        public String contratarHotGo() {
            String respuesta = null;
            if (aceptaContrataHotGo) {
            }else{
                
            }
            return null;
        }
        public String cbSiguiente_action() {
            // Add event code here...
            if (tarjetaInteligente == null || tarjetaInteligente.isEmpty()) {
                tarjetaInteligente = ADFUtils.getValueStringBindings("tarjetaInteligente.inputValue");
            }
            LogPC.println(this, "tarjetaInteligente[" + tarjetaInteligente + "]");
            return "siguiente";
        }


        public String cbSiguientePago_action() {
            //Cyber
            
            for( TarjetaBilletera tarjetaBill : this.tarjetasBilletera ) {
                if( tarjetaBill.getNumeroTarjeta().equalsIgnoreCase(this.tipoPago) ) {
                    this.tarjetaBillParaPago = tarjetaBill;
                    break;
                }
            }
            
            LogPC.println(this, "El pago se realizara con esta tarjeta: " + this.tarjetaBillParaPago.getNumeroTarjeta());
            
            
            if (this.tarjetaBillParaPago.getCodigoRedFinanciera().equalsIgnoreCase(CODIGO_CYBER_AMEX)) {
                if (cVVTemp.length() != 4) {
                    ADFUtils.showErrorMessage("Debe introducir 4 digitos en el c\u00F3digo de seguridad");
                    return null;
                }
            } else {
                if (cVVTemp.length() != 3) {
                    ADFUtils.showErrorMessage("Debe introducir 3 digitos en el c\u00F3digo de seguridad");
                    return null;
                }
            }
            //Cyber
            
            return "siguiente";
        }

        public String cbSiguienteNTDC_action() {
            // Add event code here...
            tarjeta = new Tarjeta();
            setTarjetaProtegida(new HtmlInputHidden());
            setKey_Id(new HtmlInputHidden());
            setPhase_Id(new HtmlInputHidden());
            return "nuevaTDC";
        }

        public String cbAtrasNTDC_action() {
            // Add event code here...
            tarjeta = new Tarjeta();
            setTarjetaProtegida(new HtmlInputHidden());
            setKey_Id(new HtmlInputHidden());
            setPhase_Id(new HtmlInputHidden());
            return "regresar";
        }
        
        public String cbSiguienteGuardarTDC_action() {
            String respuesta = null;
            ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
            int anioTDC = 0;
            int mesTDC = 0;
            int anio = Calendar.getInstance().get(Calendar.YEAR);
            int mes = Calendar.getInstance().get(Calendar.MONTH) + 1;
            String organizationID = sesion.getSuscriptor().getOrganizacion();
            try {
                anio = anio % 100;
                anioTDC = Integer.parseInt(tarjeta.getAnio());
                mesTDC = Integer.parseInt(tarjeta.getMes());

                LogPC.println(this, "MES[" + mes + "][" + mesTDC + "]");
                LogPC.println(this, "ANIO[" + anio + "][" + anioTDC + "]");

                if (anio == anioTDC) {
                    if (mesTDC < mes) {
                        ADFUtils.showErrorMessage("La tarjeta que captur\u00F3 no esta vigente");
                        return null;
                    }
                }
                guardarTarjeta();
                respuesta = "siguiente";
            } catch (Exception e) {
                this.aviso = false;
                LogPC.printlnError(e);
                ADFUtils.showErrorMessage("Ocurri\u00F3 algo inesperado al guardar sus datos, por favor intente m\u00E1s tarde");
                this.setException("Ocurri\u00F3 algo inesperado al guardar sus datos, por favor intente m\u00E1s tarde");
                respuesta = "warning";
            }
            return respuesta;
        }
        private boolean guardarTarjeta(){
            boolean flujo = false; 
            //tarjeta.setNumeroTarjeta(getTarjetaProtegida().getValue().toString());
            tarjeta.setKeyId(key_Id.getValue().toString());
            tarjeta.setPhase(phase_Id.getValue().toString());
            //tarjeta.setNumeroTarjeta(getNumeroTarjeta());
            /*Se utiliza el MB de Tarjetas para guardarla*/
            BBTarjeta bbt = new BBTarjeta();
            bbt.setTarjetaProtegida(getTarjetaProtegida());
            bbt.setTarjeta(tarjeta);
                bbt.setKey_Id(key_Id);
                bbt.setPhase_Id(phase_Id);
            try {
                String agregar = bbt.guardarTarjeta();
                if(agregar != null){
                    /*mensajeRespuestaPago = ADFUtils.getString(MENSAJE_PAGO_REALIZADO) + ticketNumber;
                    mensajeRespuestaGuardado = getMensajeProperties("msj_pago_aplicado_tarjeta_guardada");*/
                    flujo=true;
                }else{
                           LogPC.printlnError(this,"Error al realizar el registro de una nueva tarjeta");
                           //mensajeRespuestaGuardado = getMensajeProperties("msj_eror_guardado_tarjeta");
                       }
            } catch (Exception e) {
                e.printStackTrace();
            }
            
               return  flujo;    
            }
        
        
        
        
    public String contratarVeTV_actionCyber() {
        String flujo = "";
        boolean isPagoExitoso = false;
        boolean isTarjetaRechazada = false;
        mensajeRespuesta = "";
        String numeroAutorizacionPago = null;
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        TarjetaBilletera tarjetaBillParaPago = null;
        ServicioBines binesWS = new ServicioBines();
        Bines binesWSResponse = null;
        String organizationId = null;
        String clearingHouseBines = null;
        String tipoTarjetaCodigo = null;
        String clearingHouseDeterminarComercio = null;
        
        DeterminarComercioRequestDTO determinarComercioRequestWSDTO = null;
        DeterminarComercioResponseDTO determinarComercioResponseWSDTO = null;
        BilleteraManagementBean billeteraMB = null;
        billeteraMB = new BilleteraManagementBean();
        String afiliacion = null;
        String codigoMoneda = null;
        String merchanId = null;
        
        ResponseGenerarIdUnicoDePagoDTO generarIDPagoUnicoResponseDTO = null;
        RequestGenerarIdUnicoDePagoDTO generarIDPagoUnicoRequestDTO = null;
        
        String codigoSKY = null;
        String idPagoUnico = null;
        
        EvaluarRiesgoRequestDTO evalRiesgoRequestWSDTO = null;
        EvaluarRiesgoResponseDTO evalRiesgoResponseWSDTO = null;
        String codigoSKYEvalRiesgo = null;
        String idTransaccionEvalRiesgo = null;
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        String fechaActual = dateFormat.format(new Date());
        TokenDTO tokenDTO = null;
        ActualizarTDCBilleteraResponseDTO actualizarTDCBilleteraResponseWSDTO = null;
        
        ConsultarTipoCambioRequestDTO consultarTipoCambioRequestWSDTO = null;
        ConsultarTipoCambioResponseDTO consultarTipoCambioResponseWSDTO = null;
        String tipoCambioCyber = null;
        RespuestaPagoTarjeta procesaPagoTarjetaResponseWS = null;
        
        
        if(!sesion.getSuscriptor().isPermitePagoTC()){
               ADFUtils.showErrorMessage("Por el momento su cuenta no permite pagos. Para m\u00E1s informaci\u00F3n comun\u00EDquese a los tel\u00E9fonos de atenci\u00F3n a clientes.");
               return null;
        }
        
        LogPC.println(this, "Se procede a realizar el pago desde cyber");
        for( TarjetaBilletera tarjetaBill : tarjetasBilletera ) {
            if( tarjetaBill.getNumeroTarjeta().equalsIgnoreCase(this.tipoPago) ) {
                tarjetaBillParaPago = tarjetaBill;
                break;
            }
        }
        LogPC.println(this, "El pago se realizara con esta tarjeta: " + tarjetaBillParaPago.getNumeroTarjeta());
        LogPC.println(this, "TipoPagoCyber: " + tarjetaBillParaPago.getTipoTarjeta().substring(0, 1) +
                            tarjetaBillParaPago.getTipoTarjeta().substring(1).toLowerCase());
        
        organizationId = sesion.getSuscriptor().getOrganizacion();
        //Llamada al servicio
        binesWSResponse = binesWS.validarBines(tarjetaBillParaPago.getNumeroTarjeta(), organizationId);
        if( binesWSResponse != null ) {
            LogPC.println(this, "binesWSResponse.isTarjetaValida from WS: " + binesWSResponse.isTarjetaValida());
        }
        //DUMMY
        binesWSResponse.setTarjetaValida(true);
        //DUMMY
        
        if( binesWSResponse != null && binesWSResponse.isTarjetaValida() ) {
            LogPC.println(this, "binesWSResponse.isTarjetaValida: " + binesWSResponse.isTarjetaValida());
            LogPC.println(this, "Los bines de la tarjeta de pago " + tarjetaBillParaPago.getNumeroTarjeta() + " son validos");
            LogPC.println(this, "binesWSResponse: " + binesWSResponse);
            clearingHouseBines = binesWSResponse.getClearingHouse();
            tipoTarjetaCodigo = binesWSResponse.getCd();
            LogPC.println(this, "clearingHouseBines (binesWSResponse): " + clearingHouseBines);
            
            determinarComercioRequestWSDTO = new DeterminarComercioRequestDTO();
            determinarComercioRequestWSDTO.setPais(sesion.getPaisISO());
            determinarComercioRequestWSDTO.setTipoTarjeta(tarjetaBillParaPago.getCodigoRedFinanciera());
            //Llamada al servicio
            determinarComercioResponseWSDTO = billeteraMB.determinarComercio(determinarComercioRequestWSDTO);
            
            if( determinarComercioResponseWSDTO != null &&
                determinarComercioResponseWSDTO.getAfiliacion() != null &&
                !determinarComercioResponseWSDTO.getAfiliacion().isEmpty() &&
                determinarComercioResponseWSDTO.getCodigoMoneda() != null &&
                !determinarComercioResponseWSDTO.getCodigoMoneda().isEmpty() ) {
                    afiliacion = determinarComercioResponseWSDTO.getAfiliacion();
                    codigoMoneda = determinarComercioResponseWSDTO.getCodigoMoneda();
                    clearingHouseDeterminarComercio = determinarComercioResponseWSDTO.getClearingHouse();
                    merchanId = determinarComercioResponseWSDTO.getMerchanId();
                    LogPC.println(this, "afiliacion (determinarComercio): " + afiliacion);
                    LogPC.println(this, "codigoMoneda (determinarComercio): " + codigoMoneda);
                    LogPC.println(this, "clearingHouseDeterminarComercio (determinarComercio): " + clearingHouseDeterminarComercio);
                    
                    //Obtener el id del pago único
                    generarIDPagoUnicoRequestDTO = new RequestGenerarIdUnicoDePagoDTO();
                    generarIDPagoUnicoRequestDTO.setCuenta(sesion.getCuentaSKY());
                    generarIDPagoUnicoRequestDTO.setClearingHouse(clearingHouseDeterminarComercio);
                //Llamada al servicio
                    generarIDPagoUnicoResponseDTO = billeteraMB.generarIdUnicoDePago(generarIDPagoUnicoRequestDTO);
                    if( generarIDPagoUnicoResponseDTO != null && generarIDPagoUnicoResponseDTO.getIdPagoSKY() != null &&
                        !generarIDPagoUnicoResponseDTO.getIdPagoSKY().isEmpty() ) {
                        LogPC.println(this, "IdPagoSKY (generarIDPagoUnico): " + generarIDPagoUnicoResponseDTO.getIdPagoSKY());
                        codigoSKY = generarIDPagoUnicoResponseDTO.getIdPagoSKY();
                        if( codigoSKY != null ) {
                            String[] codigoSKYParts = codigoSKY.split("_");
                            if( codigoSKYParts != null && codigoSKYParts.length == 3 ) {
                                idPagoUnico = codigoSKYParts[2];
                                LogPC.println(this, "idPagoUnico: " + idPagoUnico);
                            }
                            
                        }
                        
                        //Llamar al servicio evaluarRiesgo
                        evalRiesgoRequestWSDTO = new EvaluarRiesgoRequestDTO();
                        evalRiesgoRequestWSDTO.setInstrumentoDePagoId(tarjetaBillParaPago.getPaymentInstrument());
                        evalRiesgoRequestWSDTO.setMId(merchanId);
                        evalRiesgoRequestWSDTO.setMonedaISO(sesion.getSuscriptor().getCurrencyCode());
                        evalRiesgoRequestWSDTO.setMontoTotal(canal.getPrecio_display());
                        evalRiesgoRequestWSDTO.setCodigoSKY(codigoSKY);
                        evalRiesgoRequestWSDTO.setSesionId(sesion.getIdSesion());
                        //evalRiesgoRequestWSDTO.setIdentificadorUnico(idPagoUnico);
                        
                        List<ParametroComerciante> parametrosComerciante = new ArrayList<ParametroComerciante> ();
                        ParametroComerciante paramComerciante = new ParametroComerciante();
                        paramComerciante.setNombreParametro("25");
                        paramComerciante.setValorParametro("PAGO_UNICO");
                        parametrosComerciante.add(paramComerciante);
                        evalRiesgoRequestWSDTO.setDatosComerciante(parametrosComerciante);
                        
                        //Llamada al servicio
                        evalRiesgoResponseWSDTO = billeteraMB.EvaluarRiesgoTdcTdd(evalRiesgoRequestWSDTO);
                        if( evalRiesgoResponseWSDTO != null && evalRiesgoResponseWSDTO.getEstatusRiesgo() != null &&
                            !evalRiesgoResponseWSDTO.getEstatusRiesgo().isEmpty() ) {
                            LogPC.println(this, "codigoError (GwEvaluarRiesgoEBS): " + evalRiesgoResponseWSDTO.getCodigoError());
                            LogPC.println(this, "descripcionError (GwEvaluarRiesgoEBS): " + evalRiesgoResponseWSDTO.getDescripcionError());
                            LogPC.println(this, "codigoSKY (GwEvaluarRiesgoEBS): " + evalRiesgoResponseWSDTO.getCodigoSKY());
                            LogPC.println(this, "estatusRiesgo (GwEvaluarRiesgoEBS): " + evalRiesgoResponseWSDTO.getEstatusRiesgo());
                            LogPC.println(this, "idTransaccion (GwEvaluarRiesgoEBS): " + evalRiesgoResponseWSDTO.getIdTransaccion());
                            codigoSKYEvalRiesgo = evalRiesgoResponseWSDTO.getCodigoSKY();
                            idTransaccionEvalRiesgo = evalRiesgoResponseWSDTO.getIdTransaccion();
                            tokenDTO = new TokenDTO();
                            tokenDTO.setId(tarjetaBillParaPago.getId());
                            tokenDTO.setFechaDm(fechaActual);
                            tokenDTO.setEstatusDm(evalRiesgoResponseWSDTO.getEstatusRiesgo());
                            actualizarTDCBilleteraResponseWSDTO = billeteraMB.actualizarTDCBilletera(tokenDTO);
                            if( actualizarTDCBilleteraResponseWSDTO != null &&
                                actualizarTDCBilleteraResponseWSDTO.getCodigoError() != null &&
                                actualizarTDCBilleteraResponseWSDTO.getCodigoError().equalsIgnoreCase("0") ) {
                                LogPC.println(this, "codigoError (actualizarTDCBilletera): " + actualizarTDCBilleteraResponseWSDTO.getCodigoError());
                                
                                if( evalRiesgoResponseWSDTO.getEstatusRiesgo().equalsIgnoreCase("ACCEPTED") ) {
                                    //Se procede a realizar el pago
                                    consultarTipoCambioRequestWSDTO = new ConsultarTipoCambioRequestDTO();
                                    consultarTipoCambioRequestWSDTO.setPEstatus("1");
                                    consultarTipoCambioRequestWSDTO.setPPais(sesion.getPaisISO());
                                    consultarTipoCambioResponseWSDTO = billeteraMB.consultarTipoCambio(consultarTipoCambioRequestWSDTO);
                                    if( consultarTipoCambioResponseWSDTO != null &&
                                        consultarTipoCambioResponseWSDTO.getBilleteraTipoCambioCollection() != null &&
                                        consultarTipoCambioResponseWSDTO.getBilleteraTipoCambioCollection().getBilleteraTipoCambio() != null &&
                                        !consultarTipoCambioResponseWSDTO.getBilleteraTipoCambioCollection().getBilleteraTipoCambio().isEmpty() ) {
                                        tipoCambioCyber = consultarTipoCambioResponseWSDTO.getBilleteraTipoCambioCollection().getBilleteraTipoCambio().get(0).getTasa();
                                        LogPC.println(this, "tipoCambioCyber (GwConsultarTipoCambioEBS): " + tipoCambioCyber);
                                        procesaPagoTarjetaResponseWS = this.procesarPago(tarjetaBillParaPago, tipoTarjetaCodigo, idPagoUnico, tipoCambioCyber, codigoMoneda, clearingHouseDeterminarComercio, merchanId, codigoSKYEvalRiesgo);
                                        if( procesaPagoTarjetaResponseWS != null &&
                                            procesaPagoTarjetaResponseWS.getNumeroReferenciaPago() != null ) {
                                            LogPC.println(this, "NumeroAutorizacionPago (GwOrquestarProcesoPagoPMPEBF): " + procesaPagoTarjetaResponseWS.getNumeroAutorizacionPago());
                                            LogPC.println(this, "NumeroReferenciaPago (GwOrquestarProcesoPagoPMPEBF): " + procesaPagoTarjetaResponseWS.getNumeroReferenciaPago());
                                            ticketNumber = procesaPagoTarjetaResponseWS.getNumeroAutorizacionPago();
                                            isPagoExitoso = true;
                                            flujo = "siguiente";
                                        } else {
                                            LogPC.println(this, "El servicio GwOrquestarProcesoPagoPMPEBF presento un error");
                                        }
                                    } else {
                                        LogPC.println(this, "El servicio GwConsultarTipoCambioEBS presento un error");
                                    }
                                } else if( evalRiesgoResponseWSDTO.getEstatusRiesgo().equalsIgnoreCase("PENDING_REVIEW") ) {
                                    //Por el momento se van a rechazar las tarjetas en PENDING_REVIEW, quitar esta
                                    //instruccion al implementar el reto.
                                    isTarjetaRechazada = true;
                                    //TODO ejecutar reto
                                } else {
                                    isTarjetaRechazada = true;
                                }
                            } else {
                                LogPC.println(this, "El servicio GwActualizarTDCBilleteraEBS presento un error");
                            }
                        } else {
                            LogPC.println(this, "El servicio GwEvaluarRiesgoEBS presento un error");
                        }
                    } else {
                        LogPC.println(this, "El servicio GwGenerarIdentificadorUnicoDePagoEBS presento un error");
                    }
            } else {
                LogPC.println(this, "El servicio GwDeterminarComercioEBS presento un error");
            }            
        } else {
            if( binesWSResponse != null ) {
                LogPC.println(this, "binesWSResponse.isTarjetaValida: " + binesWSResponse.isTarjetaValida());
                LogPC.println(this, "Los bines de la tarjeta de pago " + tarjetaBillParaPago.getNumeroTarjeta() + " son invalidos");
                mensajeRespuesta = "La forma de pago seleccionada ya no es valida, por favor intentar con otra. ";
            }
        }
        
        if( isPagoExitoso ) {
            //consultaSaldo();
            mensajeRespuesta = ADFUtils.getString(MENSAJE_PAGO_REALIZADO) + ticketNumber +
                               ".";
            //Operaciones BAM de pago web versi\u00F3n PC
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.PAGO_ENLINEA, "Pago Web-PC Exitoso");
        } else if( !isTarjetaRechazada ) {
            mensajeRespuesta = mensajeRespuesta + "Error al procesar el pago. " + ADFUtils.getString(MENSAJE_ERROR_DEFAULT);
            //Operaciones BAM pago web versi\u00F3n PC
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.PAGO_ENLINEA, "Pago Web-PC Error");
        } else {
            mensajeRespuesta = "Su forma de pago fue rechazada, por favor intente con otra.";
        }
        
        println(this, "mensaje para el usuario: " + mensajeRespuesta);
        
        ADFUtils.showInfoMessage(mensajeRespuesta);
        //ADFUtils.showPopup(popupMensajeRespuesta);
        //ADFUtils.hidePopup(popupPagar);
        //actualizarTablaPagos();
        
        return flujo;
    }
    
    
    private RespuestaPagoTarjeta procesarPago(TarjetaBilletera tarjetaPago, String tipoTarjetaCodigo, String idPagoUnico, String tipoCambio, String codigoMoneda, String clearingHouse, String merchanId, String codigoSKY) {
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String fechaHoraActual = null;
        double imPagoMonLocal;
        String randomUUID = null;
        BilleteraManagementBean billeteraMB = null;
        billeteraMB = new BilleteraManagementBean();
        ResponseOrquestarProcesoPagoDTO orquestarProcesoPagoResponseWSDTO = null;
        RespuestaPagoTarjeta procesaPagoTarjetaResponseWS = null;
        
        RequestOrquestarProcesoPagoDTO requestDTO = new RequestOrquestarProcesoPagoDTO();
        
        requestDTO.setTipoTarjeta(tipoTarjetaCodigo);
        requestDTO.setNumeroTarjeta(tarjetaPago.getNumeroTarjeta());
        
        String[] partsFechaExp = tarjetaPago.getFechaExp().split("/");
        requestDTO.setFechaExpTarjeta(partsFechaExp[1].substring(2) +  partsFechaExp[0]);
        
        requestDTO.setCvvTarjeta(this.cVVTemp);
        requestDTO.setNombreTitularTarjeta(tarjetaPago.getNombreTarjeta());
        requestDTO.setNombreEmpresaTransaccion(tarjetaPago.getRedFinanciera().toLowerCase());
        requestDTO.setTipoOperacion("AplicarPago");
        requestDTO.setIdTransaccion(idPagoUnico);
        requestDTO.setNumeroCuentaClienteSky(sesion.getCuentaSKY());
        randomUUID = UUID.randomUUID().toString();
        requestDTO.setLoginUsr(randomUUID);
        requestDTO.setIdSesion(randomUUID);
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        fechaHoraActual = sdf.format(new Date());
        
        String[] timeTransaction = fechaHoraActual.split("T");
        System.out.println("fechaHoraActual: " + fechaHoraActual);
        System.out.println("HoraActual: "+ timeTransaction[1].substring(0, timeTransaction[1].length() - 1).replace(":", ""));
        System.out.println("FechaActual: "+ timeTransaction[0].substring(2).replace("-", ""));
        requestDTO.setHoraActual(timeTransaction[1].substring(0, timeTransaction[1].length() - 1).replace(":", ""));
        requestDTO.setFechaActual(timeTransaction[0].substring(2).replace("-", ""));
        requestDTO.setPropositoPago("1");
        
        imPagoMonLocal = Double.parseDouble(canal.getPrecio_display()) * Double.parseDouble(tipoCambio);
        
        requestDTO.setImportePago(canal.getPrecio_display());
        requestDTO.setImportePagoMonedaLocal( String.format("%.2f", imPagoMonLocal));//String.format("%.2f", imPagoMonLocal));
        requestDTO.setTipoCambio(tipoCambio);
        
        CodigoPais CP = CodigoPais.valueOf(sesion.getPaisISO().toUpperCase());
        requestDTO.setPais(CP.getNombrePais());
        requestDTO.setCodeStore(null);
        requestDTO.setAuthidresponse(null);
        requestDTO.setClerkId(null);
        requestDTO.setOrigFecha(null);
        requestDTO.setOrigHora(null);
        requestDTO.setOrigStan(null);
        requestDTO.setOrigMsg(null);
        
        requestDTO.setCodigoMoneda(codigoMoneda);
        
        requestDTO.setEntidadBancaria(clearingHouse);
        
        requestDTO.setTipoPago("Tarjeta de " + tarjetaPago.getTipoTarjeta().substring(0, 1) + tarjetaPago.getTipoTarjeta().substring(1).toLowerCase());
        requestDTO.setTokenVoltage("Y");
        requestDTO.setComentarios("");
        requestDTO.setMerchantId(merchanId);
        requestDTO.setCodigoSKY(codigoSKY);
        requestDTO.setCaptura("true"); 
        requestDTO.setToken(tarjetaPago.getPaymentInstrument());
        requestDTO.setEcommerceIndicator(null);
        requestDTO.setAuthenticationTransactioId(null);
        requestDTO.setTransactionID(null);
        
        //Estos parametros se obtienen del validarReto3Ds
        requestDTO.setCavv(null);
        requestDTO.setEciRaw(null);
        requestDTO.setEci(null);
        requestDTO.setXid(null);
        
        //Descomentar solo si estos parametros se obtienen del validarReto3Ds
    //        if(this.nombreEmpresaTransaccion!=null && (this.nombreEmpresaTransaccion.equalsIgnoreCase("VISA")
    //           || this.nombreEmpresaTransaccion.equalsIgnoreCase("AMEX")
    //           || this.nombreEmpresaTransaccion.equalsIgnoreCase("AMERICAN EXPRESS"))
    //        ){
    //            requestDTO.setCavv(this.cavv);
    //            requestDTO.setEciRaw(this.eciRaw);
    //            requestDTO.setEci(this.eciRaw);
    //            requestDTO.setXid(this.xid);
    //        }
        
        //Estos parametros se obtienen del validarReto3Ds
        requestDTO.setIdentificadorDeCobroUCAF(null);    
        requestDTO.setDatosDeAutenticacionUCAF(null);
        requestDTO.setIdentificadorTransaccionServidor(null);
        requestDTO.setVersion3DS(null);
        
        //Descomentar solo si estos parametros se obtienen del validarReto3Ds
    //        if(this.nombreEmpresaTransaccion!=null && (this.nombreEmpresaTransaccion.equalsIgnoreCase("MASTERCARD"))
    //        ){
    //            requestDTO.setIdentificadorDeCobroUCAF(this.ucafCollectionIndicator);
    //            requestDTO.setDatosDeAutenticacionUCAF(this.ucafAuthenticationData);
    //            requestDTO.setIdentificadorTransaccionServidor(this.directoryServerTransactionId);
    //            requestDTO.setVersion3DS(this.specificationVersion);
    //        }
        
        //Llamada al WS de pago
        orquestarProcesoPagoResponseWSDTO = billeteraMB.orquestarProcesoPago(requestDTO);
        
        if( orquestarProcesoPagoResponseWSDTO != null &&
            orquestarProcesoPagoResponseWSDTO.getCodigoError().equalsIgnoreCase("0") &&
            orquestarProcesoPagoResponseWSDTO.getRespuestaPagoTarjeta() != null ) {
            procesaPagoTarjetaResponseWS = orquestarProcesoPagoResponseWSDTO.getRespuestaPagoTarjeta();
        }
        
        return procesaPagoTarjetaResponseWS;
    }
        
        
        
        
        public String contratarVeTV_action() {
            String respuesta = "";
            mx.com.sky.sel.services.beans.pagos.FormatoPago process = new mx.com.sky.sel.services.beans.pagos.FormatoPago();
            SesionMB sesion = null;
            String skyComentario = "";

            try {
                sesion = (SesionMB)JSFUtils.getBean("sesion");
                /*Se Valida Que la cuenta tenga permitido realizar pagos con Tarjeta de Credito JASR*/
                if(!sesion.getSuscriptor().isPermitePagoTC()){
                       ADFUtils.showErrorMessage("Por el momento su cuenta no permite pagos. Para m\u00E1s informaci\u00F3n comun\u00EDquese a los tel\u00E9fonos de atenci\u00F3n a clientes.");
                       respuesta = null;
                } else {
                    
                    process.setCuentaSKY(sesion.getCuentaSKY());
                    process.setPaqueteActual(sesion.getPaquete());
                    process.setEmail(sesion.getUsuario().getMail());
                    process.setRowIDSBL(sesion.getSuscriptor().getRowId());
                    process.setOrganizationID(sesion.getSuscriptor().getOrganizacion());
                    process.setSistemaFacturacion(sesion.getSistema());
                    process.setTipoFacturacion(sesion.getSuscriptor().getBillingCode());
                    process.setPais(sesion.getPais());
                    process.setMoneda(sesion.getSuscriptor().getCurrencyCode());
                    process.setMonto(Double.parseDouble(canal.getPrecio_display()));
                    //process.setCCV(tarjeta.getCodigo());
                    
                    if (tarjeta.getTipo().equalsIgnoreCase("AMEX")) {
                        if (tarjeta.getCodigo().length() != 4) {
                            ADFUtils.showErrorMessage("Debe introducir 4 digitos en el c\u00F3digo de seguridad");
                            return null;
                        }
                    } else {
                        if (tarjeta.getCodigo().length() != 3) {
                            ADFUtils.showErrorMessage("Debe introducir 3 digitos en el c\u00F3digo de seguridad");
                            return null;
                        }
                    }
                    
                    //process.setIdTarjeta(Integer.toString(tarjeta.getId()));
                    process.setTarjeta(tarjeta);
                    skyComentario = "Pago WEB para contratar " + canal.getNombre_display();
                    process.setOrigenPago("SEL: " + skyComentario);
                    process.setProposito("1");
                    process.setIdSession(sesion.getIdSesion());
                    
                    OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.PAGO_ENLINEA, skyComentario);
                    BindingContainer bindings = getBindings();
                    OperationBinding op = bindings.getOperationBinding("procesaPagoPs");
                    
                    op.getParamsMap().put("fpago", process);
                    
                    ticketNumber = String.valueOf(op.execute());
                    if(ticketNumber != null && !ticketNumber.equalsIgnoreCase("null")){
                        if (contratar()) {
                            respuesta = "siguiente";
                        } else {
                            this.setException("Ocurri\u00F3 algo inesperado al contratar el evento, comuniquese a atenci\u00F3n a clientes lo antes posible");
                            ADFUtils.showErrorMessage("Ocurri\u00F3 algo inesperado al contratar el evento, comuniquese a atenci\u00F3n a clientes lo antes posible");
                            respuesta = "warning";
                        }
                    }else{
                        respuesta = null;
                    }
                }
            } catch (Exception e) {
                LogPC.printlnError(this, e.getMessage(), e);
                this.setException(e.getMessage());
                ADFUtils.showErrorMessage(getMensajeProperties("mensaje_PantallaError_generico"));
                respuesta = "warning";
            }
            return respuesta;
        }

        public void setTarjetaObject(Object tarjetaObject) {
            Row tarjetaRow = null;
            if (tarjetaObject != null) {
                tarjetaRow = ((oracle.jbo.uicli.binding.JUCtrlValueBindingRef)tarjetaObject).getRow();
            }
            if (tarjetaRow == null) {
                LogPC.println(this, "horarioRow: null");
                return;
            }

            tarjeta.setAnio((String)tarjetaRow.getAttribute("anio"));
            //tarjeta.setCodigo((String)tarjetaRow.getAttribute("codigo"));
            tarjeta.setCreditoDebito((String)tarjetaRow.getAttribute("creditoDebito"));
            tarjeta.setId((Integer)tarjetaRow.getAttribute("id"));
            tarjeta.setMes((String)tarjetaRow.getAttribute("mes"));
            tarjeta.setNumeroTarjeta((String)tarjetaRow.getAttribute("numeroTarjeta"));
            //tarjeta.setNoCodificado((String)tarjetaRow.getAttribute("noCodificado"));
            tarjeta.setNombre((String)tarjetaRow.getAttribute("nombre"));
            tarjeta.setTipo((String)tarjetaRow.getAttribute("tipo"));
            this.tarjetaObject = tarjetaObject;
        }

        public String cbActualizar_action() {
            //Cyber
            tarjetasBilletera = consultarTarjetasBilletera();
            actualizarComboBoxFormasPagoBilletera();
            //Cyber
//            BindingContainer bindings = getBindings();
//            OperationBinding operationBinding = bindings.getOperationBinding("actualizarTarjetas");
//            Object result = operationBinding.execute();
//            if (!operationBinding.getErrors().isEmpty()) {
//                return null;
//            }
            return null;
        }

        public boolean validarLongTDC(String numeroTarjeta) {
            boolean esvalida=true;
            FacesMessage message = null;
            if (tarjeta.getTipo() == null) {
                return false;
            }

            if (tarjeta.getTipo().equalsIgnoreCase(getMensajeProperties("DESC_TARJETA_AMEX"))) {
                if (numeroTarjeta.length() != 15) {
                    esvalida = false;
                    ADFUtils.showErrorMessage("Debe introducir los 15 d\u00EDgitos de su tarjeta");
                }
            } else {
                if (numeroTarjeta.length() != 16) {
                    esvalida = false;
                    ADFUtils.showErrorMessage("Debe introducir los 16 d\u00EDgitos de su tarjeta");
                }
            }
            return esvalida;
        }

        public String cbSiguienteCaptura_action() {
            // Add event code here...
            String flujo="siguiente";
            if(!tarjetaValida ){
                LogPC.printlnError(this,"No se ha identificado el tipo de la marca de la tarjeta, favor de validar el número de tarjeta");
                mostrarMensaje("No se ha identificado el tipo de la marca de la tarjeta, favor de validar el número de tarjeta", FacesMessage.SEVERITY_INFO);  
                return "stay";
            }else{
                if(!validarTarjeta()){
                    mostrarMensaje(getMensajeProperties("msj_ErrFljPrg"), FacesMessage.SEVERITY_INFO);   
                    return "stay";
                }
                else{
                    if(!validarLongTDC(tarjeta.getNumeroTarjeta()))
                        flujo =  "stay"; 
                    
                    int anioTDC = 0;
                    int mesTDC = 0;
                    int anio = Calendar.getInstance().get(Calendar.YEAR);
                    int mes = Calendar.getInstance().get(Calendar.MONTH) + 1;

                    anio = anio % 100;
                    anioTDC = Integer.parseInt(tarjeta.getAnio());
                    mesTDC = Integer.parseInt(tarjeta.getMes());

                    LogPC.println(this, "MES[" + mes + "][" + mesTDC + "]");
                    LogPC.println(this, "ANIO[" + anio + "][" + anioTDC + "]");

                    if (anio == anioTDC) {
                        if (mesTDC < mes) {
                            ADFUtils.showErrorMessage("La tarjeta que captur\u00F3 no esta vigente");
                            return null;
                        }
                    }
                }   
            }
            return flujo;
        }
    private boolean validarTarjeta(){
            if((tarjetaProtegida.getValue()!=null && !tarjetaProtegida.getValue().toString().isEmpty()) 
                   && (key_Id.getValue()!=null && !key_Id.getValue().toString().isEmpty())
                   && (phase_Id.getValue()!=null && !phase_Id.getValue().toString().isEmpty())){
                return true;
        }
    return false;
    }
            /**
     *
     * @param tarjeta
     * @param organizationId
     * @return
     * @throws ServicioException
     */
    public Tarjeta consultarBinesTDC(Tarjeta tarjeta, String organizationId) throws ServicioException {
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_BINES);
        tarjetaValida=false;
        ServicioBines sb = new ServicioBines();
        Bines bines = null;
        LogPC.println(this, "consultarBinesTDC [" + organizationId + "] " + tarjeta);
        bines = sb.validarBines(tarjeta.getNumeroTarjeta(), organizationId);
        if (bines.isTarjetaValida()) {
            tarjetaValida=true;
            tipoTarjetaBines=bines.getTipoTarjeta();
            tarjeta.setCreditoDebito(bines.getCd());
            tarjeta.setTipo(bines.getTipoTarjeta());
            tarjeta.setCreditoDebitoTexto(
            //si null entonces vacio
            bines.getCd() == null ? "" :
                //si 01 entonces credito
                bines.getCd().equals("01") ?
                "Crédito" :
                //si otro entonces debito
                "Débito");

            if(tipoTarjetaBines!=null && !tipoTarjetaBines.isEmpty()){
                if(tipoTarjetaBines.equalsIgnoreCase(getMensajeProperties("TIPO_TARJETA_VISA"))){
                    tipoTarjeta=getMensajeProperties("DESC_TARJETA_VISA");  
                    addScriptOnPartialRequest("protect_form_2();");
                }else if(tipoTarjetaBines.equalsIgnoreCase(getMensajeProperties("TIPO_TARJETA_MASTER_CARD"))){
                    tipoTarjeta=getMensajeProperties("DESC_TARJETA_MASTER_CARD"); 
                    addScriptOnPartialRequest("protect_form_2();");
                }else if(tipoTarjetaBines.equalsIgnoreCase(getMensajeProperties("TIPO_TARJETA_AMEX"))){
                    tipoTarjeta=getMensajeProperties("DESC_TARJETA_AMEX");
                    addScriptOnPartialRequest("protect_form_2();");
                }else{
                    LogPC.printlnError(this, "Tipo de tarjeta no valida");  
                }
                tarjeta.setTipo(tipoTarjeta);
            }          
        } else {
            getTarjetaProtegida().resetValue();
            getKey_Id().resetValue();
            getPhase_Id().resetValue();
            LogPC.printlnError(this,"Error al realizar la validación de los bines de la tarjeta ingresada");
        }
        return tarjeta;
    }

        public BindingContainer getBindings() {
            return BindingContext.getCurrent().getCurrentBindingsEntry();
        }

        public void setTarjeta(Tarjeta tarjeta) {
            this.tarjeta = tarjeta;
        }

        public Tarjeta getTarjeta() {
            return tarjeta;
        }

        public void setTipos(Map<String, String> tipos) {
            this.tipos = tipos;
        }

        public Map<String, String> getTipos() {
            return tipos;
        }

        public void setMeses(Map<String, String> meses) {
            this.meses = meses;
        }

        public Map<String, String> getMeses() {
            return meses;
        }

        public void setAnios(Map<String, String> anios) {
            this.anios = anios;
        }

        public Map<String, String> getAnios() {
            return anios;
        }

        public void setCreditoDebitoMap(Map<String, String> creditoDebitoMap) {
            this.creditoDebitoMap = creditoDebitoMap;
        }

        public Map<String, String> getCreditoDebitoMap() {
            return creditoDebitoMap;
        }


        public void setTicketNumber(String ticketNumber) {
            this.ticketNumber = ticketNumber;
        }

        public String getTicketNumber() {
            return ticketNumber;
        }

        public void setTarjetaInteligente(String tarjetaInteligente) {
            this.tarjetaInteligente = tarjetaInteligente;
        }

        public String getTarjetaInteligente() {
            return tarjetaInteligente;
        }

        public Object getTarjetaObject() {
            return tarjetaObject;
        }

        public void setNumeroSolicitud(String numeroSolicitud) {
            this.numeroSolicitud = numeroSolicitud;
        }

        public String getNumeroSolicitud() {
            return numeroSolicitud;
        }


        public void setCanal(CanalCarta canal) {
            this.canal = canal;
        }
        
        public void setException(String exception){
            this.exception = exception;
        }
        
        public String getException(){
            return exception;
        }

        public CanalCarta getCanal() {
            return canal;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public double getPrecio() {
            return precio;
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            out.defaultWriteObject();
            LogPC.println(this, "Serializando PFCanalesContrata: " + tarjeta);
            LogPC.println(this, "Serializando PFCanalesContrata: " + canal);
        }

        private void readObject(ObjectInputStream in) throws IOException {
            try {
                in.defaultReadObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            LogPC.println(this, "DeSerializando PFCanalesContrata :" + tarjeta);
            LogPC.println(this, "DeSerializando PFCanalesContrata: " + canal);
        }


        public void setAviso(boolean aviso) {
            this.aviso = aviso;
        }

        public boolean isAviso() {
            return aviso;
        }

        public void setAceptaContrataHotGo(boolean aceptaContrataHotGo) {
            this.aceptaContrataHotGo = aceptaContrataHotGo;
        }

        public boolean isAceptaContrataHotGo() {
            return aceptaContrataHotGo;
        }

    public void lstnrValueChangeNumeroTarjeta(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        cambiarTarjeta(valueChangeEvent.getNewValue().toString());
    }
        public void cambiarTarjeta(String noTarjeta){
            tarjeta.setNumeroTarjeta(noTarjeta);
            tipoTarjeta="";
            key_Id.setValue("");
            phase_Id.setValue("");
            tarjetaProtegida.setValue("");
            if(tarjeta.getNumeroTarjeta()!=null){
                if (tarjeta.getNumeroTarjeta().length()==Constantes.TAMANIO_TARJETA_AMEX || tarjeta.getNumeroTarjeta().length()==Constantes.TAMANIO_TARJETA){
                    String bines=tarjeta.getNumeroTarjeta().substring(0,Constantes.TAMANIO_BINES);
                    LogPC.println(this,"Codigo bin a validar de la tarjeta:"+bines);
                    //validaTarjeta(bines);
                    ConfigMenu sesion = (ConfigMenu) JSFUtils.getBean("sesion");
                            String organizationId = sesion.getSuscriptor().getOrganizacion();

                    try {
                                this.tarjeta = consultarBinesTDC(tarjeta, organizationId);
                            } catch (ServicioException e) {
                                ADFUtils.showErrorMessage(e.getMessage());
                                /*esValido = false;
                                return "stay";*/
                            }
                }
            }
        }
        /*
        * Add a script to the render kit
        */
        public static void addScriptOnPartialRequest(String script) {
            FacesContext context = FacesContext.getCurrentInstance();
            if (AdfFacesContext.getCurrentInstance().isPartialRequest(context)) {
                ExtendedRenderKitService erks =
                Service.getRenderKitService(context, ExtendedRenderKitService.class);
                erks.addScript(context, script);
            }
        }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTarjetaProtegida(HtmlInputHidden tarjetaProtegida) {
        this.tarjetaProtegida = tarjetaProtegida;
    }

    public HtmlInputHidden getTarjetaProtegida() {
        return tarjetaProtegida;
    }

    public void setKey_Id(HtmlInputHidden key_Id) {
        this.key_Id = key_Id;
    }

    public HtmlInputHidden getKey_Id() {
        return key_Id;
    }

    public void setPhase_Id(HtmlInputHidden phase_Id) {
        this.phase_Id = phase_Id;
    }

    public HtmlInputHidden getPhase_Id() {
        return phase_Id;
    }
    
    //Accessors Cyber
    public Map<String, String> getTiposPago() {
        return tiposPago;
    }

    public void setTiposPago(Map<String, String> tiposPago) {
        this.tiposPago = tiposPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setCVVTemp(String cVVTemp) {
        this.cVVTemp = cVVTemp;
    }

    public String getCVVTemp() {
        return cVVTemp;
    }
    
    public TarjetaBilletera getTarjetaBillParaPago() {
        return tarjetaBillParaPago;
    }
    
    //Accessors Cyber
    
}
