package mx.com.sky.sel.managedbeans.pagos;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import java.util.TimeZone;
import java.util.UUID;

import javax.annotation.PostConstruct;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UISelectItems;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import mx.com.sky.sel.beans.utils.ParametrosPago;
import mx.com.sky.sel.beans.utils.Usuario;
import mx.com.sky.sel.enums.CodigoPais;
import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import static mx.com.sky.sel.log.LogPC.println;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.proxyclients.apigateway.ebf.orquestarprocesopago.types.RespuestaPagoTarjeta;
import mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarriesgo.types.DatosComerciante;
import mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarriesgo.types.ParametroComerciante;
import mx.com.sky.sel.services.beans.billetera.ActualizarTDCBilleteraResponseDTO;
import mx.com.sky.sel.services.beans.billetera.RequestGenerarIdUnicoDePagoDTO;
import mx.com.sky.sel.services.beans.billetera.RequestOrquestarProcesoPagoDTO;
import mx.com.sky.sel.services.beans.billetera.ResponseGenerarIdUnicoDePagoDTO;
import mx.com.sky.sel.services.beans.billetera.ResponseOrquestarProcesoPagoDTO;
import mx.com.sky.sel.services.beans.billetera.TarjetaBilletera;
import mx.com.sky.sel.services.beans.billetera.TokenDTO;
import mx.com.sky.sel.services.beans.cybersource.ConsultarTipoCambioRequestDTO;
import mx.com.sky.sel.services.beans.cybersource.ConsultarTipoCambioResponseDTO;
import mx.com.sky.sel.services.beans.cybersource.DeterminarComercioRequestDTO;
import mx.com.sky.sel.services.beans.cybersource.DeterminarComercioResponseDTO;
import mx.com.sky.sel.services.beans.pagos.FormatoPago;
import mx.com.sky.sel.services.beans.pagos.tarjetas.Bines;
import mx.com.sky.sel.services.beans.pagos.tarjetas.Tarjeta;
import mx.com.sky.sel.services.beans.riesgo.EvaluarRiesgoRequestDTO;
import mx.com.sky.sel.services.beans.riesgo.EvaluarRiesgoResponseDTO;
import mx.com.sky.sel.services.beans.saldos.Saldo;
import mx.com.sky.sel.services.beans.tipocambio.TipoDeCambio;
import mx.com.sky.sel.services.beans.utils.ServiciosCuenta;
import mx.com.sky.sel.services.beans.utils.Suscriptor;
import mx.com.sky.sel.services.cybersource.billetera.BilleteraManagementBean;
import mx.com.sky.sel.services.dualplay.consulta.ServicioDualPlay;
import mx.com.sky.sel.services.pagos.administratarjeta.ServicioTarjetaPSManagementLocal;
import mx.com.sky.sel.services.pagos.tarjetas.ServicioBines;
import mx.com.sky.sel.services.tipocambio.ServicioTipoCambio;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.JavaUtils;
import mx.com.sky.sel.utils.UtileriasMB;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import oracle.adf.controller.ControllerContext;
import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.input.RichSelectOneRadio;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.binding.BindingContainer;
import oracle.binding.DataControl;
import oracle.binding.OperationBinding;

import org.apache.commons.lang.StringUtils;


/**
 * BackingBean de pagos
 */
public class BBPago implements Serializable {
    @SuppressWarnings("compatibility:-2229638350576772058")
    private static final long serialVersionUID = 1932078694747936173L;
    //Componentes del Formulario Tarjetas
    private transient RichInputText nombre;
    private transient RichInputText no;
    private transient RichInputText codigo;
    private Map<String, String> tipos;
    private String tipo;
    private Map<String, String> meses;
    private String mes;
    private Map<String, String> anios;
    private String anio;
    private Map<String, String> creditoDebitoMap;
    private String creditoDebito;
    private String id;
    private transient RichPopup popup; //Popup de Confirmacion de Operacion
    private String actionPopup; //String que define que accion realizara el Popup
    private String messagePopup;
    private String mensajeRespuesta;

    //Componentes de Control
    private Boolean insert; //Permite identificar si se activa el boton Agregar, Eliminar o Cancelar
    private transient DCIteratorBinding DCTarjetas_, DCPagos_; //Permite tener una referencia al DC
    private List<Tarjeta> tarjetas; //Lista de tarjetas en el DC
    private List<TarjetaBilletera> tarjetasBilletera;
    private boolean hayTarjetas;
    private Tarjeta tarjeta; //La tarjeta que esta Seleccionada por Default
    private String cVVTemp;
    private Double tipoCambio = 0.0;
    private String importeMonedaLocal = "";

    //Componentes del Formulario Pago
    private Map<String, String> tiposPago;
    private Map<String, String> tiposPagoInversa;
    private String tipoPago;
    private Saldo saldo;
    private transient RichInputText importe;
    
    //private transient RichInputText comentarios;
    private transient RichPopup popupPagar;
    private transient RichPopup popupMensajeRespuesta;
    private transient RichSelectOneRadio creditoDebitoSelectRadio; //Popup de Confirmacion de Pago

    private static final String TARJETA_AMEX = "bbpago.tipotarjeta.amex";
    private static final String TARJETA_DINES = "bbpago.tipotarjeta.dinners";
    private static final String TARJETA_LVP = "bbpago.tipotarjeta.lvp";
    private static final String TARJETA_VISA = "bbpago.tipotarjeta.visa";
    private static final String TARJETA_MASTERCARD = "bbpago.tipotarjeta.mastercard";
    private static final String TARJETA_CREDITO = "bbpago.tipotarjeta.credito";
    private static final String TARJETA_DEBITO = "bbpago.tipotarjeta.debito";
    private static final String MENSAJE_AGREGAR_TARJETA = "bbpago.agregartarjeta";
    private static final String MENSAJE_ELIMINAR_TARJETA = "bbpago.eliminartarjeta";
    private static final String MENSAJE_MODIFICAR_TARJETA = "bbpago.modificartarjeta";
    private static final String MENSAJE_PAGO_REALIZADO = "bbpago.pagorealizado";
    private static final String MENSAJE_ERROR_DEFAULT = "bbpago.error.default";
    
    private static final String CODIGO_CYBER_AMEX = "003";
    
    private transient RichInputText costoRecarga;
    private transient RichSelectOneChoice numeroRecargas;
    private transient RichSelectOneChoice numeroRecargasMini;
    private Map<String, String> recargasVeTv;
    private Map<String, String> recargasMini;
    private transient UISelectItems siRecargasVeTv;
    private String noRecargaVeTv;
    private String tipoRecarga;
    private transient UISelectItems siRecargasMini;

    public BBPago() throws Exception {
        println(this, "BBPago Creado");
        tipos = new LinkedHashMap<String, String>();
        tipos.put(ADFUtils.getString(TARJETA_VISA), "VISA");
        tipos.put(ADFUtils.getString(TARJETA_MASTERCARD), "MASTERCARD");
        tipos.put(ADFUtils.getString(TARJETA_AMEX), "AMEX"); //label, value
        tipos.put(ADFUtils.getString(TARJETA_DINES), "Diners Club");
        tipos.put(ADFUtils.getString(TARJETA_LVP), "LVP");

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
        for (int i = 12; i <= 25; i++)
            anios.put(String.valueOf(i), String.valueOf(i));

        creditoDebitoMap = new LinkedHashMap<String, String>();
        creditoDebitoMap.put(ADFUtils.getString(TARJETA_CREDITO), "01");
        creditoDebitoMap.put(ADFUtils.getString(TARJETA_DEBITO), "02");


        tarjeta = new Tarjeta();
        
        insert = true;
        
        noRecargaVeTv = "0";
        tipoRecarga = "0";
    }
    @PostConstruct
    void init() {
        //refresca el valor por unica vez y solo cuando NO sea Corporativa
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        if(! sesion.isCuentaCV() ){
            initTarjetas();
            tarjetasBilletera = consultarTarjetasBilletera();
            actualizarComboBoxFormasPagoBilletera();
        }
        consultaSaldo();
    }
    /*valores para la lista de recargas vetv*/
    void obtenerRecargasVeTv() {
        recargasVeTv = new LinkedHashMap<String, String>();
        recargasVeTv.put("1 Recarga", "1");
        recargasVeTv.put("2 Recargas", "2");
        recargasVeTv.put("3 Recargas", "3");
        recargasVeTv.put("4 Recargas", "4");
        recargasVeTv.put("5 Recargas", "5");
        recargasVeTv.put("6 Recargas", "6");
        recargasVeTv.put("7 Recargas", "7");
        recargasVeTv.put("8 Recargas", "8");
        recargasVeTv.put("9 Recargas", "9");
        recargasVeTv.put("10 Recargas", "10");
        recargasVeTv.put("11 Recargas", "11");
        recargasVeTv.put("12 Recargas", "12");
        recargasVeTv.put("13 Recargas", "13");
        recargasVeTv.put("14 Recargas", "14");
        recargasVeTv.put("15 Recargas", "15");
        recargasVeTv.put("16 Recargas", "16");
        recargasVeTv.put("17 Recargas", "17");
        recargasVeTv.put("18 Recargas", "18");
    }

    /*valores para la lista de recargas mini*/
    void obtenerRecargasMini() {
        recargasMini = new LinkedHashMap<String, String>();
        recargasMini.put("1 Recarga", "1");
        recargasMini.put("2 Recargas", "2");
        recargasMini.put("3 Recargas", "3");
        recargasMini.put("4 Recargas", "4");
        recargasMini.put("5 Recargas", "5");
        recargasMini.put("6 Recargas", "6");
    }
    private void initTipoCambio(String organization) {
        ServicioTipoCambio stc = new ServicioTipoCambio();
        TipoDeCambio tipoCambio = stc.obtenerTipoCambio(organization);
        this.tipoCambio = tipoCambio.getTipoCambio();
    }
    
    // ############## Seccion tarjetas ##############

    /*Obtenemos las tarjetas desde el DC*/

    private void initTarjetas() {
        tarjetas = new ArrayList<Tarjeta>();
        DCTarjetas_ = ADFUtils.getIterador("consultarTarjetasIterator");
        DCDataControl dcd = DCTarjetas_.getDataControl();
        DataControl dc = dcd.getAdaptedDC();
        ServicioTarjetaPSManagementLocal dcT = (ServicioTarjetaPSManagementLocal)dc.getDataProvider();
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String numeroCuentaCliente = sesion.getSuscriptor().getCuentaSKY();
        //tarjetas = dcT.obtenerTarjetas(uuid);
        tarjetas = dcT.consultarTarjetasPs(numeroCuentaCliente, "1", "1");
        
        println(this, tarjetas.size() + " Tarjetas obtenidas desde el DC");
        if(tarjetas.size()>0){
            hayTarjetas=true;
        }else{
            hayTarjetas=false;
        }
        //Establecemos los valores para el Combo de Tipo Pago
//        tiposPago = new LinkedHashMap<String, String>();
//        for (Tarjeta t : tarjetas) {
//            tiposPago.put(t.getNumeroTarjeta() + " - " + t.getTipo(), t.getNumeroTarjeta());
//
//        }
//        println(this, tiposPago.size() + " Elementos para el Combo Tipo Pago");
    }
    
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
        if( tarjetasConsultadas.size() > 0 ) {
            hayTarjetas=true;
        } else {
            hayTarjetas=false;
        }
        
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

    
    /*Metodo que permite agregar la Tarjeta Seleccionada*/
/*
    private String agregarTarjeta() throws Exception {
        ServicioTarjetaPSManagementLocal dcTarjetas = null;
        dcTarjetas = new ServicioTarjetaPSManagementLocal();
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        Usuario user = sesion.getUsuario();
        String uuid = user.getUid();
        String organizationID = sesion.getSuscriptor().getOrganizacion();
        String salida = dcTarjetas.agregarTarjeta(tarjeta, uuid, organizationID);
        println(this, "Agregando tarjeta : " + salida);
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.MIS_TARJETAS_ADD);
        clear();
        return salida;
    }
*/
    /*Metodo que permite Eliminar la Tarjeta Seleccionada*/
/*
    private String eliminarTarjeta() throws Exception {
        ServicioTarjetaPSManagementLocal dcTarjetas = null;
        dcTarjetas = new ServicioTarjetaPSManagementLocal();
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        Usuario user = sesion.getUsuario();
        String uuid = user.getUid();
        String salida = dcTarjetas.eliminarTarjeta(tarjeta, uuid);
        println(this, "Eliminando tarjeta : " + salida);
        /* Inicializamos el DCTarjetas para refrescar la tabla de Tarjetas*/
    /*
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.MIS_TARJETAS_DELETE);
        clear();
        return salida;
    }
*/
    /*Metodo que permite Modificar la Tarjeta Seleccionada*/
/*
    private String modificarTarjeta() throws Exception {
        ServicioTarjetaPSManagementBean dcTarjetas = null;
        dcTarjetas = new ServicioTarjetaPSManagementBean();
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        Usuario user = sesion.getUsuario();
        String uuid = user.getUid();
        String salida = dcTarjetas.modificarTarjeta(tarjeta, uuid);
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.MIS_TARJETAS_UPDATE);
        println(this, "Modificando tarjeta : " + salida);
        /* Inicializamos el DCTarjetas para refrescar la tabla de Tarjetas*/
       /* clear();
        return salida;
    }
*/
    /*Metodo de limpieza*/

    private void clear() {
        deseleccionarTarjeta();
        DCTarjetas_.invalidateCache(); //Limpiamos la Cache del DC para el refresh
        initTarjetas();
    }

    /*Metodo que Deselecciona la Tarjeta*/

    public String deseleccionarTarjeta() {
        tarjeta = new Tarjeta();
        codigo.setValue("");
        insert = true;
        return "OK";
    }

    /*Metodo que carga los datos de una Tarjeta para Editarla*/
    /*Metodo Invocado cuando se da Click en el enlace Editar*/

    public String seleccionarTarjeta() {
        initTarjetas();
        for (Tarjeta t : tarjetas)
            if (Integer.valueOf(id).equals(t.getId()))
                tarjeta = t;
        insert = false;
        Map<String, Object> pageFlowScope = AdfFacesContext.getCurrentInstance().getPageFlowScope();
        ControllerContext ctx = ControllerContext.getInstance();
        ctx.markScopeDirty(pageFlowScope);
        return "OK";
    }

    /* El Id nos permite realizar las operaciones de Delete y Update*/

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    /*Metodo Invocado cuando se da Click al boton Agregar*/

    public String popupAgregar() {
        actionPopup = "agregarTarjeta";
        messagePopup = ADFUtils.getString(MENSAJE_AGREGAR_TARJETA);
        Tarjeta t = new Tarjeta();
        t.setCodigo(codigo.getValue().toString());
        t.setNumeroTarjeta(no.getValue().toString());
        t.setNombre(nombre.getValue().toString());
        t.setAnio(anio);
        t.setMes(mes);
        t.setTipo(tipo);
        t.setCreditoDebito(creditoDebito);
        tarjeta = t;
        ADFUtils.showPopup(popup);
        return null;
    }

    /*Metodo Invocado cuando se da Click al enlace Eliminar*/

    public String popupEliminar() {
        actionPopup = "eliminarTarjeta";
        messagePopup = ADFUtils.getString(MENSAJE_ELIMINAR_TARJETA);
        for (Tarjeta t : tarjetas)
            if (t.getId().equals(Integer.valueOf(id)))
                tarjeta = t;
        ADFUtils.showPopup(popup);
        return "OK";
    }

    /*Metodo Invocado cuando se da Click al boton Modificar*/

    public String popupModificar() {
        actionPopup = "modificarTarjeta";
        messagePopup = ADFUtils.getString(MENSAJE_MODIFICAR_TARJETA);
        tarjeta.setCodigo(codigo.getValue().toString());
        if (anio != null)
            tarjeta.setAnio(anio);
        if (mes != null)
            tarjeta.setMes(mes);
        if (tipo != null)
            tarjeta.setTipo(tipo);
        tarjeta.setNumeroTarjeta(no.getValue().toString());
        tarjeta.setNombre(nombre.getValue().toString());
        tarjeta.setCreditoDebito(creditoDebito);
        tarjeta.setCodigo(codigo.getValue().toString());
        ADFUtils.showPopup(popup);
        return "OK";
    }

    /*Metodo que Valida que se de Click en el Boton Aceptar*/
/*
    public void listenerPopup(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome().ok == DialogEvent.Outcome.ok) {
            try {
                if (actionPopup.compareTo("agregarTarjeta") == 0)
                    this.mensajeRespuesta = agregarTarjeta();
                if (actionPopup.compareTo("modificarTarjeta") == 0)
                    this.mensajeRespuesta = modificarTarjeta();
                if (actionPopup.compareTo("eliminarTarjeta") == 0)
                    this.mensajeRespuesta = eliminarTarjeta();
            } catch (Exception e) {
                e.printStackTrace();
            }
            println(this, "Popup OK");
        }
        ADFUtils.showPopup(popupMensajeRespuesta);
        ADFUtils.hidePopup(popup);
    }
*/
    // ############## Seccion pagos ##############

    /*Permite obtener el Saldo de la Cuenta*/

    private void consultaSaldo() {
        //ServicioSaldo saldo = null;
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String cuentaSKY = sesion.getCuentaSKY();
        String sistema = sesion.getSistema();
        Double saldoD = 0.0;
        //saldo = new ServicioSaldo();
        LogPC.println(this, "consultaSaldo() " + sistema);
        /*if (sesion.isUserVeTV() && sistema.equalsIgnoreCase("KENAN")) {
            this.saldo = new Saldo();
            saldoD = saldo.obtenerSaldoRealVeTV(cuentaSKY);
            this.saldo.setSaldoTotal(saldoD.toString());
            ParametrosPago parametrosPago = (ParametrosPago)JSFUtils.getBean("ParametrosPago");
            parametrosPago.setTipoPago(sesion.getCodigoRecargaVeTV());
        } else */{
            //hijump
            //this.saldo = saldo.consultaSaldo(cuentaSKY, sistema);
            BindingContainer bindings = getBindings();
            OperationBinding op = bindings.getOperationBinding("consultaSaldo");
            Object responseSaldo = op.execute();
            this.saldo = (mx.com.sky.sel.services.beans.saldos.Saldo) responseSaldo;
            LogPC.println(this, "consultaSaldo HIJUMP " + this.saldo);
            
            if(sesion.isUserVeTV()){
                    ParametrosPago parametrosPago = (ParametrosPago)JSFUtils.getBean("ParametrosPago");
                    parametrosPago.setTipoPago(sesion.getCodigoRecargaVeTV());
                }
        }
        initTipoCambio(sesion.getSuscriptor().getOrganizacion());
    }

    /*Metodo que se invoca cuando se presiona el boton Pagar*/

    public String popupPagar() {
        TarjetaBilletera tarjetaBillParaPago = null;
        
        for( TarjetaBilletera tarjetaBill : tarjetasBilletera ) {
            if( tarjetaBill.getNumeroTarjeta().equalsIgnoreCase(this.tipoPago) ) {
                tarjetaBillParaPago = tarjetaBill;
                break;
            }
        }
        
        LogPC.println(this, "El pago se realizara con esta tarjeta: " + tarjetaBillParaPago.getNumeroTarjeta());
        
        
        if (tarjetaBillParaPago.getCodigoRedFinanciera().equalsIgnoreCase(CODIGO_CYBER_AMEX)) {
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
        
        ADFUtils.showPopup(popupPagar);
        return "OK";
    }
    
    public String pagarCyber() {
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
                        evalRiesgoRequestWSDTO.setMontoTotal(this.importe.getValue().toString());
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
                                            numeroAutorizacionPago = procesaPagoTarjetaResponseWS.getNumeroAutorizacionPago();
                                            isPagoExitoso = true;
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
            consultaSaldo();
            mensajeRespuesta = ADFUtils.getString(MENSAJE_PAGO_REALIZADO) + numeroAutorizacionPago +
                               ". La actualización de su saldo puede tardar unos minutos.";
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
        
        ADFUtils.showPopup(popupMensajeRespuesta);
        ADFUtils.hidePopup(popupPagar);
        actualizarTablaPagos();
        
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
        println(this, "fechaHoraActual: " + fechaHoraActual);
        println(this, "HoraActual: "+ timeTransaction[1].substring(0, timeTransaction[1].length() - 1).replace(":", ""));
        println(this, "FechaActual: "+ timeTransaction[0].substring(2).replace("-", ""));
        requestDTO.setHoraActual(timeTransaction[1].substring(0, timeTransaction[1].length() - 1).replace(":", ""));
        requestDTO.setFechaActual(timeTransaction[0].substring(2).replace("-", ""));
        requestDTO.setPropositoPago("1");
        
        imPagoMonLocal = Double.parseDouble(this.importe.getValue().toString()) * Double.parseDouble(tipoCambio);
        
        requestDTO.setImportePago(this.importe.getValue().toString());
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
    

    /*Metodo que realiza el Pago */

    public String pagar() {
        LogPC.println(this, "Se procede a realizar el pago de la recarga");
        BindingContainer bindings = getBindings();
        OperationBinding op = bindings.getOperationBinding("procesaPagoPs");
       
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        Suscriptor suscriptor = sesion.getSuscriptor();
        Usuario usuario = sesion.getUsuario();

        FormatoPago fpago = new FormatoPago();
        if (importe.getValue() != null)
        fpago.setMonto(Double.valueOf(importe.getValue().toString()));
        fpago.setCuentaSKY(sesion.getCuentaSKY());
        fpago.setPaqueteActual(sesion.getPaquete());
        fpago.setEmail(sesion.getUsuario().getMail());
        fpago.setRowIDSBL(sesion.getSuscriptor().getRowId());
        fpago.setOrganizationID(sesion.getSuscriptor().getOrganizacion());
        fpago.setSistemaFacturacion(sesion.getSistema());
        fpago.setTipoFacturacion(sesion.getSuscriptor().getBillingCode());
        fpago.setPais(sesion.getPais());
        fpago.setMoneda(sesion.getSuscriptor().getCurrencyCode());
        
        Tarjeta tarjetaPago = null;
        for (Tarjeta t : tarjetas)
            if (t.getNumeroTarjeta().equalsIgnoreCase(tipoPago))
                tarjetaPago = t;
        
        if (tarjetaPago.getTipo().equalsIgnoreCase("AMEX")) {
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
        tarjetaPago.setCodigo(cVVTemp);//cVVTemp
        /*fpago.setCCV(cVVTemp);
        fpago.setIdTarjeta(tarjetaPago.getId().toString());*/
        fpago.setTarjeta(tarjetaPago);
        fpago.setOrigenPago("SEL: " + ADFUtils.getString("bbpago.comentario"));
        fpago.setProposito("0");
        fpago.setIdSession(sesion.getIdSesion());
        
        //si hubo error mandar mensaje de error o de aprobado
        try {        
        
            op.getParamsMap().put("fpago", fpago);
            Object result = op.execute();
            mensajeRespuesta = result.toString();
            println(this, "Respuesta pago :" + mensajeRespuesta);
            consultaSaldo();
            mensajeRespuesta = ADFUtils.getString(MENSAJE_PAGO_REALIZADO) + mensajeRespuesta;
            //Operaciones BAM de pago web versi\u00F3n PC
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.PAGO_ENLINEA, "Pago Web-PC Exitoso");
        } catch (Exception e) {
            mensajeRespuesta = e.getMessage();
            if (StringUtils.isEmpty(mensajeRespuesta)) {
                mensajeRespuesta = ADFUtils.getString(MENSAJE_ERROR_DEFAULT);
            }
            //Operaciones BAM pago web versi\u00F3n PC
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.PAGO_ENLINEA, "Pago Web-PC Error");
        }

        println(this, "mensaje para el usuario: " + mensajeRespuesta);
        /*Redireccion a Siguiente Pagina para Otros Pagos*/
    
        ADFUtils.showPopup(popupMensajeRespuesta);
        ADFUtils.hidePopup(popupPagar);
        actualizarTablaPagos();
        return "";
    }
    
    
    public void montoValidate(FacesContext facesContext, UIComponent uIComponent, Object object) {
        FacesContext fc = FacesContext.getCurrentInstance();
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        ParametrosPago parametrosPago = null;
        Suscriptor suscriptor = sesion.getSuscriptor();
        String pais = suscriptor.getPaisISO();
        try {
            if (pais.equalsIgnoreCase("MX")) {
                if (sesion.isUserVeTV()) {
                    parametrosPago = (ParametrosPago)JSFUtils.getBean("ParametrosPago");
                    if (Double.parseDouble((String)object) < 29.99) {
                        FacesMessage message =
                            new FacesMessage(FacesMessage.SEVERITY_INFO, "Monto no v\u00E1lido", "El monto minimo es 29.99 pesos");
                        fc.addMessage(uIComponent.getClientId(fc), message);
                        ((RichInputText)uIComponent).setValid(false);
                    }
                } else {
                    if (Double.parseDouble((String)object) > 15555.0) {
                        FacesMessage message =
                            new FacesMessage(FacesMessage.SEVERITY_INFO, "Monto no v\u00E1lido", "El monto m\u00E1ximo es $15,555.00 pesos");
                        fc.addMessage(uIComponent.getClientId(fc), message);
                        ((RichInputText)uIComponent).setValid(false);
                    }else if (Double.parseDouble((String)object) < 29.99) {
                        FacesMessage message =
                            new FacesMessage(FacesMessage.SEVERITY_INFO, "Monto no v\u00E1lido", "El monto minimo es 29.99 pesos");
                        fc.addMessage(uIComponent.getClientId(fc), message);
                        ((RichInputText)uIComponent).setValid(false);
                    }
                }
            } else if (pais.equalsIgnoreCase("DO")) {
                if (Double.parseDouble((String) object) > 54000.0) {
                    FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Montono v\u00E1lido", "El monto m\u00E1ximo es de $54,000.00 pesos dominicanos");
                    fc.addMessage(uIComponent.getClientId(fc), message);
                    ((RichInputText)uIComponent).setValid(false);
                }
            }else {
                if (Double.parseDouble((String)object) > 1200.0) {
                    FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Monto no v\u00E1lido", "El monto m\u00E1ximo es $1,200.00 USD");
                    fc.addMessage(uIComponent.getClientId(fc), message);
                    ((RichInputText)uIComponent).setValid(false);
                }
            }
        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }

    }
    public void recargasVeTVdiasValueChange(ValueChangeEvent valueChangeEvent) {
            Object diasRecarga = valueChangeEvent.getNewValue();
            try{
            if(diasRecarga != null){
                ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
                tipoRecarga =diasRecarga.toString();

                ParametrosPago parametrosPago = null;
                parametrosPago = (ParametrosPago)JSFUtils.getBean("ParametrosPago");

                if (sesion.isUserVeTV() || sesion.isUserMini()) {
                    //1 tipo recarga - 30dias, mini & vetv
                    //2 tipo recarga - 14dias solo vetv
                    if (valueChangeEvent.getNewValue().toString().equalsIgnoreCase("1") || valueChangeEvent.getNewValue().toString().equalsIgnoreCase("2")) {
                        //codeRecarga="RECARGA";
                        numeroRecargas.setVisible(true);
                        numeroRecargas.setRequired(true);
                    }else{
                        //codeRecarga="RECARGA_VETV15";
                        numeroRecargas.setVisible(false);
                        numeroRecargas.setRequired(false);
                    }
                } 
                sesion.setCodigoRecargaVeTV(tipoRecarga);
                parametrosPago.actualizarMontoRecarga(sesion.getSuscriptor().getCuentaSKY(), tipoRecarga);
                ADFUtils.addPartialTarget(costoRecarga);
                parametrosPago.calcularRecargas(1);
                importe.resetValue();
                ADFUtils.addPartialTarget(importe);
                numeroRecargas.setValue("1");
                ADFUtils.addPartialTarget(numeroRecargas);
            }
            } catch (Exception e) {
                LogPC.printlnError(this, e.getMessage());
            }
        }
    /*public void recargasVeTVdiasValueChange(ValueChangeEvent valueChangeEvent) {
            Object diasRecarga = valueChangeEvent.getNewValue();
            try{
            if(diasRecarga != null){
                ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
                tipoRecarga =diasRecarga.toString();

                ParametrosPago parametrosPago = null;
                parametrosPago = (ParametrosPago)JSFUtils.getBean("ParametrosPago");
                //String codeRecarga="";
                ServicioDualPlay dualPlay = new ServicioDualPlay();
                ServiciosCuenta cuentaD =  dualPlay.consultaCuentaDualPlay(sesion.getSuscriptor().getCuentaSKY());

                if (sesion.isUserVeTV()) {
                    if (valueChangeEvent.getNewValue().toString().equalsIgnoreCase("1")) {
                        //codeRecarga="RECARGA";
                        numeroRecargas.setVisible(true);
                        numeroRecargas.setRequired(true);
                    }else{
                        //codeRecarga="RECARGA_VETV15";
                        numeroRecargas.setVisible(false);
                        numeroRecargas.setRequired(false);
                    }
                } 
                parametrosPago.actualizarMontoRecarga(sesion.getSuscriptor().getCuentaSKY(), tipoRecarga);
                ADFUtils.addPartialTarget(costoRecarga);
                parametrosPago.calcularRecargas(1);
                importe.resetValue();
                ADFUtils.addPartialTarget(importe);
                numeroRecargas.setValue("1");
                numeroRecargasMini.setValue("1");
                numeroRecargasMini.setVisible(numeroRecargas.isVisible());
                numeroRecargasMini.setRequired(numeroRecargas.isRequired());
                ADFUtils.addPartialTarget(numeroRecargas);
                ADFUtils.addPartialTarget(numeroRecargasMini); 
            }
            } catch (Exception e) {
                LogPC.printlnError(this, e.getMessage());
            }
        }*/
    
    public void recargasVeTVValueChange(ValueChangeEvent valueChangeEvent) {
        ParametrosPago parametrosPago = null;
        int numRecargas = 1;
        try {
            parametrosPago = (ParametrosPago)JSFUtils.getBean("ParametrosPago");
            numRecargas = Integer.parseInt(valueChangeEvent.getNewValue().toString());
            LogPC.println(this, "recargasVeTVValueChange " + numRecargas);
            noRecargaVeTv = valueChangeEvent.getNewValue().toString();
            parametrosPago.calcularRecargas(numRecargas);
            
            importe.resetValue();
            ADFUtils.addPartialTarget(importe);
        } catch (Exception e) {
            LogPC.printlnWarn(this, e.getMessage());
        }
    }


    /**
     *Obtiene el contenedor de bindings
     * @return
     */
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    /**
     * Actualiza la tabla de pagos
     * @return
     */
    private boolean actualizarTablaPagos() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("actualizarTablaPagos");
        Object result = operationBinding.execute();
        
        if (!operationBinding.getErrors().isEmpty()) {
            return false;
        }
        return true;
    }    
    
    private void consultaSaldoPs(){
        BindingContainer bindings = getBindings();
        OperationBinding op = bindings.getOperationBinding("consultaSaldo");
        Object responseSaldo = op.execute();
        this.saldo = (mx.com.sky.sel.services.beans.saldos.Saldo) responseSaldo;
    }
    
    public String actualizarTPagos() {
        actualizarTablaPagos();
        return null;
    }


    public void tipoChanged(ValueChangeEvent e) {
        tipo = e.getNewValue().toString();
    }

    public void mesChanged(ValueChangeEvent e) {
        mes = e.getNewValue().toString();
    }

    public void anioChanged(ValueChangeEvent e) {
        anio = e.getNewValue().toString();
    }

    public Map<String, String> getTipos() {
        return this.tipos;
    }

    public Map<String, String> getMeses() {
        return this.meses;
    }

    public Map<String, String> getAnios() {
        return this.anios;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getAnio() {
        return anio;
    }

    public void setNombre(RichInputText nombre) {
        this.nombre = nombre;
    }

    public RichInputText getNombre() {
        return nombre;
    }

    public void setNo(RichInputText no) {
        this.no = no;
    }

    public RichInputText getNo() {
        return no;
    }

    public void setCodigo(RichInputText codigo) {
        this.codigo = codigo;
    }

    public RichInputText getCodigo() {
        return codigo;
    }

    public void setInsert(Boolean insert) {
        this.insert = insert;
    }

    public Boolean getInsert() {
        return insert;
    }

    public void setPopup(RichPopup popup) {
        this.popup = popup;
    }

    public void setActionPopup(String actionPopup) {
        this.actionPopup = actionPopup;
    }

    public String getActionPopup() {
        return actionPopup;
    }

    public RichPopup getPopup() {
        return popup;
    }


    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public String getMessagePopup() {
        return messagePopup;
    }

    public void tipoPagoChanged(ValueChangeEvent e) {
        tipoPago = e.getNewValue().toString();
    }

    public void setTiposPago(Map<String, String> tiposPago) {
        this.tiposPago = tiposPago;
    }

    public Map<String, String> getTiposPago() {
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        //refresca el valor solo cuando sea Corporativa porque es cuando realmente se hace un cambio de cuentas
        if( sesion.isCuentaCV() ){
            initTarjetas();
            tarjetasBilletera = consultarTarjetasBilletera();
            actualizarComboBoxFormasPagoBilletera();
        }
        return tiposPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public Saldo getSaldo() {
        return saldo;
    }

    public void setImporte(RichInputText importe) {
        this.importe = importe;
    }

    public RichInputText getImporte() {
        return importe;
    }


    public void setPopupPagar(RichPopup popupPagar) {
        this.popupPagar = popupPagar;
    }

    public RichPopup getPopupPagar() {
        return popupPagar;
    }

    public void setMensajeRespuesta(String mensajeRespuesta) {
        this.mensajeRespuesta = mensajeRespuesta;
    }

    public String getMensajeRespuesta() {
        return mensajeRespuesta;
    }

    public void setPopupMensajeRespuesta(RichPopup popupMensajeRespuesta) {
        this.popupMensajeRespuesta = popupMensajeRespuesta;
    }

    public RichPopup getPopupMensajeRespuesta() {
        return popupMensajeRespuesta;
    }

    public void setCreditoDebitoMap(Map<String, String> creditoDebitoMap) {
        this.creditoDebitoMap = creditoDebitoMap;
    }

    public Map<String, String> getCreditoDebitoMap() {
        return creditoDebitoMap;
    }

    public void setCreditoDebito(String creditoDebito) {
        this.creditoDebito = creditoDebito;
    }

    public String getCreditoDebito() {
        return creditoDebito;
    }

    public void setCreditoDebitoSelectRadio(RichSelectOneRadio creditoDebitoSelectRadio) {
        this.creditoDebitoSelectRadio = creditoDebitoSelectRadio;
    }

    public RichSelectOneRadio getCreditoDebitoSelectRadio() {
        return creditoDebitoSelectRadio;
    }

    public void creditoDebitChanged(ValueChangeEvent e) {
        this.creditoDebito = e.getNewValue().toString();
    }

    public void cancelarActionListener(ActionEvent actionEvent) {
        this.deseleccionarTarjeta();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        LogPC.println(this, "Serializando BBPago: " + tarjeta);
        LogPC.println(this, "Serializando BBPago: " + id);
    }

    private void readObject(ObjectInputStream in) throws IOException {
        try {
            in.defaultReadObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //LogPC.println(this, "DeSerializando BBPago :" + tarjeta);
        //LogPC.println(this, "DeSerializando BBPago: " + id);
    }


    public void setTipoCambio(Double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public Double getTipoCambio() {
        return tipoCambio;
    }

    public void setImporteMonedaLocal(String importeMonedaLoca) {
        this.importeMonedaLocal = importeMonedaLoca;
    }

    public String getImporteMonedaLocal() {
        try {
            importeMonedaLocal = JavaUtils.asMoneda(Double.parseDouble(importe.getValue().toString()) * tipoCambio);
        } catch (Exception e) {

        }

        return importeMonedaLocal;
    }

   public void setHayTarjetas(boolean hayTarjetas) {
        this.hayTarjetas = hayTarjetas;
    }

    public boolean isHayTarjetas() {
        return hayTarjetas;
    }

    public void setcVVTemp(String cVVTemp) {
        this.cVVTemp = cVVTemp;
    }

    public String getcVVTemp() {
        return cVVTemp;
    }

    public void setCostoRecarga(RichInputText costoRecarga) {
        this.costoRecarga = costoRecarga;
    }

    public RichInputText getCostoRecarga() {
        return costoRecarga;
    }

    public void setNumeroRecargas(RichSelectOneChoice numeroRecargas) {
        this.numeroRecargas = numeroRecargas;
    }

    public RichSelectOneChoice getNumeroRecargas() {
        return numeroRecargas;
    }

    public String cancelarPago() {
        // Add event code here...
        ADFUtils.hidePopup(popupPagar);
        return null;
    }
    
    public String aceptarPago() {
        // Add event code here...
        ADFUtils.hidePopup(popupMensajeRespuesta);
        return null;
    }

    public void setNumeroRecargasMini(RichSelectOneChoice numeroRecargasMini) {
        this.numeroRecargasMini = numeroRecargasMini;
    }

    public RichSelectOneChoice getNumeroRecargasMini() {
        return numeroRecargasMini;
    }

    public void setRecargasVeTv(Map<String, String> recargasVeTv) {
        this.recargasVeTv = recargasVeTv;
    }

    public Map<String, String> getRecargasVeTv() {        
        obtenerRecargasVeTv();
        return recargasVeTv;
    }

       public void setSiRecargasVeTv(UISelectItems siRecargasVeTv) {
        this.siRecargasVeTv = siRecargasVeTv;
    }

    public UISelectItems getSiRecargasVeTv() {
        return siRecargasVeTv;
    }

    public void setNoRecargaVeTv(String noRecargaVeTv) {
        this.noRecargaVeTv = noRecargaVeTv;
    }

    public String getNoRecargaVeTv() {
        return noRecargaVeTv;
    }

    public void setRecargasMini(Map<String, String> recargasMini) {
        this.recargasMini = recargasMini;
    }

    public Map<String, String> getRecargasMini() {
        obtenerRecargasMini();
        return recargasMini;
    }

    public void setSiRecargasMini(UISelectItems siRecargasMini) {
        this.siRecargasMini = siRecargasMini;
    }

    public UISelectItems getSiRecargasMini() {
        return siRecargasMini;
    }

    public void setTipoRecarga(String tipoRecarga) {
        this.tipoRecarga = tipoRecarga;
    }

    public String getTipoRecarga() {
        return tipoRecarga;
    }

    
}
