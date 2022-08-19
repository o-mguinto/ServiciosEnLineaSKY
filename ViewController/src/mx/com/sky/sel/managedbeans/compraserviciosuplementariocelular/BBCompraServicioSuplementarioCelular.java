package mx.com.sky.sel.managedbeans.compraserviciosuplementariocelular;

import java.io.Serializable;

import java.text.Normalizer;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputHidden;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;
import javax.faces.validator.ValidatorException;

import mx.com.sky.enterpriseobjects.soa.gestionacomponenteinterface.GestionaComponenteResponseEBMType;
import mx.com.sky.enterpriseobjects.soa.gestionarsscomprardatosinterface.GestionarSSComprarDatosResponseEBMType;
import mx.com.sky.sel.beans.compradatos.PaqueteDatos;
import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import static mx.com.sky.sel.log.LogPC.println;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.managedbeans.sesion.SesionMB;
import mx.com.sky.sel.managedbeans.tarjeta.BBTarjeta;
import mx.com.sky.sel.services.beans.pagos.tarjetas.Bines;
import mx.com.sky.sel.services.beans.pagos.tarjetas.Tarjeta;
import mx.com.sky.sel.services.compradatos.ServicioCompraDatos;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.pagos.tarjetas.ServicioBines;
import mx.com.sky.sel.services.saldo.ServicioSaldo;
import mx.com.sky.sel.services.beans.saldos.Saldo;
import mx.com.sky.sel.services.beans.utils.LineaCelularDTO;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.Constantes;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.UtileriasMB;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;

import org.apache.commons.lang.StringUtils;
import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;

public class BBCompraServicioSuplementarioCelular extends UtileriasMB implements Serializable {
    @SuppressWarnings("compatibility:-570183896729821995")
    private static final long serialVersionUID = 7561031801669491310L;

    private Map<String, List<PaqueteDatos>> mosaicoServicios = null;
    private List<PaqueteDatos> paquetesDeOferta;
    private String idPaquete;
    private String saldoActual;
    private String fecha_corte;
    private PaqueteDatos paquetes[];
    private Integer indexColor;
    
    private PaqueteDatos paqueteActiva;
    private Tarjeta tarjeta;
    private transient Object tarjetaObject;
    private Map<String, String> meses;
    private Map<String, String> tipos;
    private Map<String, String> anios;
    private Map<String, String> creditoDebitoMap;
    private boolean aviso;
    private String resultadoCompra;
    private transient RichPopup popupResultadoCompraTyA;
    private boolean sinPaquetes;
    private transient RichPopup popupResultadoCompraVeTV;
    private boolean saldoFavor;
    private transient RichPopup popupResultadoCompraTyAKo;
    private transient RichPopup popupResultadoCompraVeTVKo;
    
    // Campos para select de lineas celulares
    private String assetNumberLineaSeleccionada;
    private List<SelectItem> lineasCelularesComboBox;
    
    private String ofertaSeleccionada;
    private boolean mostrarPaisesIncluidos;
    private String nombreArchivoPaises;
    
    private String mensajeRespuesta;
    private static final String MENSAJE_PAGO_REALIZADO = "bbpago.pagorealizado";
    private static final String MENSAJE_ERROR_DEFAULT = "bbpago.error.default";
    private String exception;
    private String tipoTarjetaBines;
    private String tipoTarjeta;
    private Boolean tarjetaValida;
    private transient HtmlInputHidden tarjetaProtegida;
    private transient HtmlInputHidden key_Id;
    private transient HtmlInputHidden phase_Id;

    public BBCompraServicioSuplementarioCelular() {
        System.out.println("BBCompraServicioSuplementarioCelular creado...........................");
        crearComboBoxLineasCelulares();
        consultaSaldo();
        //obtenerCPaquetes();
        limpiarDatos();
        this.sinPaquetes = true;
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
        tipoTarjetaBines="";
        tipoTarjeta=null;
        tarjetaValida=false;
    }
    
    private void crearComboBoxLineasCelulares() {
        SesionMB sesion = null;
        sesion = (SesionMB)JSFUtils.getBean("sesion");
        
        if( sesion.getSuscriptor().getLineasCelulares() != null && !sesion.getSuscriptor().getLineasCelulares().isEmpty() ) {
            LogPC.println(this, "--------Lineas celulares del suscriptor (SesionMB):");
            this.lineasCelularesComboBox = new ArrayList<SelectItem>();
            for(LineaCelularDTO lnCel : sesion.getSuscriptor().getLineasCelulares()) {
                LogPC.println(this, "-----numCelular: " + lnCel.getNumCelular());
                lineasCelularesComboBox.add(new SelectItem(lnCel.getAssetNumber(),lnCel.getNumCelular()));
            }
        }
    }
    
    public void actualizarServicios(ValueChangeEvent valueChangeEvent) {
        this.assetNumberLineaSeleccionada = (String)valueChangeEvent.getNewValue();
        if(this.assetNumberLineaSeleccionada != null){
            LogPC.println(this, "En actualizarServicios... assetNumberLineaSeleccionada: " + this.assetNumberLineaSeleccionada);
            this.obtenerServiciosSuplementarios(this.assetNumberLineaSeleccionada);
        }else{
            mosaicoServicios = new TreeMap<String,List<PaqueteDatos>>();
        }
    }
    
    private void limpiarDatos() {
        paqueteActiva = new PaqueteDatos();
        
        tarjeta = new Tarjeta();
       // ServicioVeTV sVeTV = new ServicioVeTV();
        //if (sesion.getSuscriptor().isEquipoHD()) {
        //    precio = sVeTV.consultarPrecio("CANAL_CARTA_HD");
        //}else{
         //   precio = sVeTV.consultarPrecio("CANAL_CARTA");
      //  }
    }
    private void consultaSaldo(){
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        ServicioSaldo ss = new ServicioSaldo();
        LogPC.println(this, "Llamando al servicio consultaSaldo con la cuentaSKY: " + sesion.getSuscriptor().getCuentaSKY());
        Saldo responseSaldo = ss.consultaSaldo(sesion.getSuscriptor().getCuentaSKY(), "HIJUMP");
        fecha_corte = responseSaldo.getFecha_sig_corte();
        saldoActual = responseSaldo.getSaldoTotal();
        LogPC.println(this, "Fecha corte: " + fecha_corte);
        LogPC.println(this, "Saldo actual: " + saldoActual);
    }
    
    private void obtenerServiciosSuplementarios(String assetNumberLineaCelular) {
        mosaicoServicios = new TreeMap<String, List<PaqueteDatos>>();
        this.paquetes = new PaqueteDatos[20];
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        ServicioCompraDatos servCompraDatos = new ServicioCompraDatos();
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_SERVICIOS_SUPLEMENTARIOS_CELULAR, "Consulta de servicios suplementarios celular");
        mosaicoServicios = servCompraDatos.consultarServiciosSuplementarios(sesion.getSuscriptor().getCuentaSKY(), assetNumberLineaCelular, "",
                                                                            sesion.getSuscriptor().getPais());
        
        if (mosaicoServicios == null || mosaicoServicios.isEmpty()) {
            LogPC.println(this, "paquetes de internet null");
            sinPaquetes = true;
        } else {
            sinPaquetes = false;
            /*for (int i = 0; i < mosaicoServicios.size(); i++){
                //this.paquetes[i] = mosaicoServicios.get(i);
                this.paquetes[i].setSaldoCuenta(saldoActual);
            }*/
            LogPC.println(this, "[contadorPaquete][" + mosaicoServicios.size() + "]");
        }
        
    }
    
    /*método que se utiliza para obtener los paquetes de la oferta dependiento del valor de la oferta seleccionada*/
    public String mostrarPaquetes() {
        // Add event code here...
        if(this.ofertaSeleccionada != null){
            paquetesDeOferta = this.mosaicoServicios.get(this.ofertaSeleccionada);
            if(this.ofertaSeleccionada.toUpperCase().contains("ROAMING INTERNACIONAL") || this.ofertaSeleccionada.toUpperCase().contains("LARGA DISTANCIA")){
                this.mostrarPaisesIncluidos = true;
                this.nombreArchivoPaises = generarNombreArchivoPaises(this.ofertaSeleccionada);
            }else{
                this.mostrarPaisesIncluidos = false;
                this.nombreArchivoPaises = "";
            }
             
        }
        return null;
    }
    
    public String generarNombreArchivoPaises(String oferta){
        return Normalizer.normalize(oferta, Normalizer.Form.NFD).replaceAll("[^A-Za-z0-9]", "").toUpperCase();
    }
    
    public String cbSiguiente_action() {
        return "siguiente";
    }
    
    public String cbContrataDatosTyA_action() {
        GestionarSSComprarDatosResponseEBMType respuestaCompra= null;
        String fechaFormato = "";
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        SimpleDateFormat formatoFecha = new SimpleDateFormat("MM/dd/yyyy");
        fechaFormato = formatoFecha.format(new Date());
        ServicioCompraDatos compraDatos = new ServicioCompraDatos();
        respuestaCompra = compraDatos.comprarPaqueteDatos(sesion.getSuscriptor().getCuentaSKY(), sesion.getSuscriptor().getAssetNumberInternet(), sesion.getSuscriptor().getSecondAssetNumberInternet(),
                                        idPaquete, fechaFormato.concat(" 00:00:00"));
        
        
        System.out.println("******************************************* respuestaCompra" + respuestaCompra);
        if (respuestaCompra.getEBMHeaderResponse().getErrorNegocio().getCodigoError().equalsIgnoreCase("0")) {
            ADFUtils.showPopup(popupResultadoCompraTyA);
        }else{
            ADFUtils.showPopup(popupResultadoCompraTyAKo);
        }
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.COMPRA_SERVICIO_SUPLEMENTARIO_CELULAR, "Compra servicio suplementario celular: " + idPaquete);
        return "ok";
    }
    public String cbContrataDatosVeTV_action() {
        BindingContainer bindings = getBindings();
        OperationBinding op = bindings.getOperationBinding("procesaPago");
        
        mx.com.sky.sel.services.beans.pagos.FormatoPago fpago = new mx.com.sky.sel.services.beans.pagos.FormatoPago();
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        
        
        String respuesta = "";
        //ServicioPagos spagos = new ServicioPagos();
        //FormatoPago fpago = new FormatoPago();
        //SesionMB sesion = null;
        String skyComentario = "";
        try {
            //sesion = (Sesion)JSFUtils.getBean("sesion");
            /*Se Valida Que la cuenta tenga permitido realizar pagos con Tarjeta de Credito JASR*/
            if(!sesion.getSuscriptor().isPermitePagoTC()){
                   ADFUtils.showErrorMessage("Por el momento su cuenta no permite pagos. Para m\u00E1s informaci\u00F3n comun\u00EDquese a los tel\u00E9fonos de atenci\u00F3n a clientes.");
                   respuesta = null;
            } else {
                
                fpago.setCuentaSKY(sesion.getCuentaSKY());
                fpago.setPaqueteActual(sesion.getPaquete());
                fpago.setEmail(sesion.getUsuario().getMail());
                fpago.setRowIDSBL(sesion.getSuscriptor().getRowId());
                fpago.setOrganizationID(sesion.getSuscriptor().getOrganizacion());
                fpago.setSistemaFacturacion(sesion.getSistema());
                fpago.setTipoFacturacion(sesion.getSuscriptor().getBillingCode());
                fpago.setPais(sesion.getPais());
                fpago.setMoneda(sesion.getSuscriptor().getCurrencyCode());
                if (sesion.isUserVeTV()) {
                    fpago.setMonto(Double.parseDouble(paqueteActiva.getMontoDiferencia()));    
                }else{
                    fpago.setMonto(Double.parseDouble(paqueteActiva.getCosto()));
                }
                
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
                
                //fpago.setIdTarjeta(tarjeta.getId().toString());
                fpago.setTarjeta(tarjeta);
                skyComentario = "Pago WEB para contratar " + paqueteActiva.getNombre_display();
                fpago.setOrigenPago("SEL: " + skyComentario);
                fpago.setProposito("1");
                fpago.setIdSession(sesion.getIdSesion());
                
                OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.PAGO_ENLINEA, skyComentario);
                OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.COMPRA_SERVICIO_SUPLEMENTARIO_CELULAR, "Compra servicio suplementario celular: " + idPaquete);
                
                
                //spagos.procesaPago(fpago);
                try {        
                
                    op.getParamsMap().put("fpago", fpago);
                    Object result = op.execute();
                    if(result == null)
                        return null;
                    mensajeRespuesta = result.toString();//pago.procesaPago(fpago);
                    println(this, "Respuesta pago :" + mensajeRespuesta);
                    System.out.println( "Respuesta pago :" + mensajeRespuesta);
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
                
                
                
                //Proceso de pago
                GestionarSSComprarDatosResponseEBMType respuestaCompra= null;
                String fechaFormato = "";
                SimpleDateFormat formatoFecha = new SimpleDateFormat("MM/dd/yyyy");
                fechaFormato = formatoFecha.format(new Date());
                ServicioCompraDatos compraDatos = new ServicioCompraDatos();
                respuestaCompra = compraDatos.comprarPaqueteDatos(sesion.getSuscriptor().getCuentaSKY(), sesion.getSuscriptor().getAssetNumberInternet(), sesion.getSuscriptor().getSecondAssetNumberInternet(),
                                                idPaquete, fechaFormato.concat(" 00:00:00"));
                if (respuestaCompra.getEBMHeaderResponse().getErrorNegocio().getCodigoError().equalsIgnoreCase("0")) {
                    ADFUtils.showPopup(popupResultadoCompraVeTV);
                    respuesta = "ok";
                }else{
                    ADFUtils.showPopup(popupResultadoCompraVeTVKo);
                }
            }
        } catch (Exception e) {
            LogPC.printlnError(this, e.getMessage(), e);
            ADFUtils.showErrorMessage(getMensajeProperties("mensaje_PantallaError_generico"));
            respuesta = "warning";
        }
        return respuesta;
    }
    public String cbCancelar_action() {
        // Add event code here...
        LogPC.println(this, "cbCancelar_action");
        limpiarDatos();
        return "closeTaskFlow";
    }
    public String showPopupPaquete() {
        return "compra";
    }
    public void setmosaicoServicios(Map<String,List<PaqueteDatos>> mosaicoServicios) {
        this.mosaicoServicios = mosaicoServicios;
    }

    public Map<String,List<PaqueteDatos>> getmosaicoServicios() {
        return mosaicoServicios;
    }
    
    public void setAssetNumberLineaSeleccionada(String assetNumberLineaSeleccionada) {
        this.assetNumberLineaSeleccionada = assetNumberLineaSeleccionada;
    }

    public String getAssetNumberLineaSeleccionada() {
        return assetNumberLineaSeleccionada;
    }
    
    public List<SelectItem> getLineasCelulares() {
        return lineasCelularesComboBox;
    }
    
    public int getNumLineasCelular() {
        int numLineasCelular = 0;
        if( this.lineasCelularesComboBox != null ) {
            numLineasCelular = this.lineasCelularesComboBox.size();
        }
        return numLineasCelular;
    }
    
    public boolean isLineasCelDisponibles() {
        boolean lineasCelDisponibles = false;
        
        if( lineasCelularesComboBox != null && !lineasCelularesComboBox.isEmpty() )
            lineasCelDisponibles = true;
        
        return lineasCelDisponibles;
    }
    

    public void setIdPaquete(String idPaquete) {
        this.idPaquete = idPaquete;
    }

    public String getIdPaquete() {
        return idPaquete;
    }

    public void setFecha_corte(String fecha_corte) {
        this.fecha_corte = fecha_corte;
    }

    public String getFecha_corte() {
        return fecha_corte;
    }

    public void setPaqueteActiva(PaqueteDatos paqueteActiva) {
        this.paqueteActiva = paqueteActiva;
    }

    public PaqueteDatos getPaqueteActiva() {
        return paqueteActiva;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setIndexColor(Integer indexColor) {
        this.indexColor = indexColor;
    }

    public Integer getIndexColor() {
        return indexColor;
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
        tarjeta.setCreditoDebito((String)tarjetaRow.getAttribute("creditoDebito"));
        tarjeta.setId((Integer)tarjetaRow.getAttribute("id"));
        tarjeta.setMes((String)tarjetaRow.getAttribute("mes"));
        tarjeta.setNumeroTarjeta((String)tarjetaRow.getAttribute("numeroTarjeta"));
        tarjeta.setNombre((String)tarjetaRow.getAttribute("nombre"));
        tarjeta.setTipo((String)tarjetaRow.getAttribute("tipo"));
        this.tarjetaObject = tarjetaObject;
    }

    public Object getTarjetaObject() {
        return tarjetaObject;
    }
    public String cbSiguienteNTDC_action() {
        // Add event code here...
        tarjeta = new Tarjeta();
        setTarjetaProtegida(new HtmlInputHidden());
        setKey_Id(new HtmlInputHidden());
        setPhase_Id(new HtmlInputHidden());
        return "nuevaTDC";
    }
    public void validarNumeroTDC(FacesContext facesContext, UIComponent uIComponent, Object object) {
        String numeroTarjeta = (String)object;
        FacesMessage message = null;

        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String organizationId = sesion.getSuscriptor().getOrganizacion();

        try {
            tarjeta.setNumeroTarjeta(numeroTarjeta);
            tarjeta = consultarBinesTDC(tarjeta, organizationId);
        } catch (ServicioException e) {
            message = new FacesMessage(e.getMessage());
            throw new ValidatorException(message);
        }


        if (tarjeta.getTipo().equalsIgnoreCase("AMEX")) {
            if (numeroTarjeta.length() != 15) {
                message = new FacesMessage("Debe introducir los 15 d\u00EDgitos de su tarjeta");
                throw new ValidatorException(message);
            }
        } else {
            if (numeroTarjeta.length() != 16) {
                message = new FacesMessage("Debe introducir los 16 d\u00EDgitos de su tarjeta");
                throw new ValidatorException(message);
            }
        }
        tarjeta.setNumeroTarjeta(numeroTarjeta);
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
    public String cbActualizar_action() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("actualizarTarjetas");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public void setMeses(Map<String, String> meses) {
        this.meses = meses;
    }

    public Map<String, String> getMeses() {
        return meses;
    }

    public void setTipos(Map<String, String> tipos) {
        this.tipos = tipos;
    }

    public Map<String, String> getTipos() {
        return tipos;
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
            if(!tarjetaProtegida.getValue().toString().isEmpty()
                   && !key_Id.getValue().toString().isEmpty()
                   && !phase_Id.getValue().toString().isEmpty()){
                return true;
        }
    return false;
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

    public void setAviso(boolean aviso) {
        this.aviso = aviso;
    }

    public boolean isAviso() {
        return aviso;
    }

    public void setResultadoCompra(String resultadoCompra) {
        this.resultadoCompra = resultadoCompra;
    }

    public String getResultadoCompra() {
        return resultadoCompra;
    }

    public void setPopupResultadoCompraTyA(RichPopup popupResultadoCompraTyA) {
        this.popupResultadoCompraTyA = popupResultadoCompraTyA;
    }

    public RichPopup getPopupResultadoCompraTyA() {
        return popupResultadoCompraTyA;
    }

    public void setSinPaquetes(boolean sinPaquetes) {
        this.sinPaquetes = sinPaquetes;
    }

    public boolean isSinPaquetes() {
        return sinPaquetes;
    }

    public void setPopupResultadoCompraVeTV(RichPopup popupResultadoCompraVeTV) {
        this.popupResultadoCompraVeTV = popupResultadoCompraVeTV;
    }

    public RichPopup getPopupResultadoCompraVeTV() {
        return popupResultadoCompraVeTV;
    }

    public void setSaldoFavor(boolean saldoFavor) {
        this.saldoFavor = saldoFavor;
    }

    public boolean isSaldoFavor() {
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        
        if (paqueteActiva.getMontoDiferencia().contains("-") && sesion.isUserVeTV()) {
            saldoFavor = true;
        }else if (paqueteActiva.getMontoDiferencia().contains("-") && !sesion.isUserVeTV()) {
            saldoFavor = true;
        }else if (!sesion.isUserVeTV()) {
            saldoFavor = true;
        }else{
            saldoFavor = false;
        }
        return saldoFavor;
    }

    public void setPopupResultadoCompraTyAKo(RichPopup popupResultadoCompraTyAKo) {
        this.popupResultadoCompraTyAKo = popupResultadoCompraTyAKo;
    }

    public RichPopup getPopupResultadoCompraTyAKo() {
        return popupResultadoCompraTyAKo;
    }

    public void setPopupResultadoCompraVeTVKo(RichPopup popupResultadoCompraVeTVKo) {
        this.popupResultadoCompraVeTVKo = popupResultadoCompraVeTVKo;
    }

    public RichPopup getPopupResultadoCompraVeTVKo() {
        return popupResultadoCompraVeTVKo;
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

    public String cbAtrasNTDC_action() {
        // Add event code here...
        tarjeta = new Tarjeta();
        setTarjetaProtegida(new HtmlInputHidden());
        setKey_Id(new HtmlInputHidden());
        setPhase_Id(new HtmlInputHidden());
        return "regresar";
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public String getException() {
        return exception;
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
    
    public void setOfertaSeleccionada(String ofertaSeleccionada) {
        this.ofertaSeleccionada = ofertaSeleccionada;
    }

    public String getOfertaSeleccionada() {
        return ofertaSeleccionada;
    }

    public void setMostrarPaisesIncluidos(boolean mostrarPaisesIncluidos) {
        this.mostrarPaisesIncluidos = mostrarPaisesIncluidos;
    }

    public boolean isMostrarPaisesIncluidos() {
        return mostrarPaisesIncluidos;
    }

    public void setPaquetesDeOferta(List<PaqueteDatos> paquetesDeOferta) {
        this.paquetesDeOferta = paquetesDeOferta;
    }

    public List<PaqueteDatos> getPaquetesDeOferta() {
        return paquetesDeOferta;
    }

    public void setNombreArchivoPaises(String nombreArchivoPaises) {
        this.nombreArchivoPaises = nombreArchivoPaises;
    }

    public String getNombreArchivoPaises() {
        return nombreArchivoPaises;
    }
}
