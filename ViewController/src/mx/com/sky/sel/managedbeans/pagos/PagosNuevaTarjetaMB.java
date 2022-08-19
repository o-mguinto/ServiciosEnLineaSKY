package mx.com.sky.sel.managedbeans.pagos;

import java.io.Serializable;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.annotation.PostConstruct;

import javax.faces.application.FacesMessage;
import javax.faces.component.html.HtmlInputHidden;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

import mx.com.sky.enterpriseflowmessages.sel.gestionarpagocontdc.DatosTransaccionPagoInputMessageType;
import mx.com.sky.enterpriseflowmessages.sel.gestionarpagocontdc.DatosTransaccionPagoOutputMessageType;
import mx.com.sky.enterpriseflowmessages.sel.gestionarpagocontdc.GestionarPagoConTDCRequestEBMType;
import mx.com.sky.enterpriseflowmessages.sel.gestionarpagocontdc.GestionarPagoConTDCResponseEBMType;
import mx.com.sky.enterpriseobjects.sel.tarjetapagoebo.DatosTarjetaPagoType;
import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import static mx.com.sky.sel.log.LogPC.println;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.managedbeans.tarjeta.BBTarjeta;
import mx.com.sky.sel.services.beans.pagos.tarjetas.Bines;
import mx.com.sky.sel.services.beans.pagos.tarjetas.Tarjeta;
import mx.com.sky.sel.services.pagos.tarjetas.ServicioBines;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.Constantes;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.UtileriasMB;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.PopupCanceledEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;

public class PagosNuevaTarjetaMB extends UtileriasMB implements Serializable {
    @SuppressWarnings("compatibility:6586394571134049400")
    private static final long serialVersionUID = -1744489085950286612L;
    private static final String MENSAJE_PAGO_REALIZADO = "bbpago.pagorealizado";
    private transient RichInputText importe;
    private transient RichPopup popup;
    private transient HtmlInputHidden tarjetaProtegida;
    private String keyId;
    private transient HtmlInputHidden key_id;
    private transient HtmlInputHidden phase;

    public PagosNuevaTarjetaMB() {
        super();
    }
    private String numeroTarjeta;
    private String codigoSeguridad;
    private String tipoTarjeta;
    private String tipoTarjetaBines;
    private String mesVencimiento;
    private String anioVencimiento;
    private Boolean aceptaTerminos;
    private Boolean tajetaValida;
    private boolean pagarOk = false;
    private boolean guardarOk = false;
    private String nombreTarjetaHabiente;
    private List<SelectItem>  lstTipoTarjetas;
    private List<SelectItem>  lstMesVencimiento;
    private List<SelectItem>  lstAnioVencimiento;
    private String mensajeRespuestaPago;
    private String mensajeRespuestaGuardado;
    
    private Tarjeta tarjeta;
    private String ticketNumber;
    
    private String actionPopup;
    
    private transient RichPopup popupMensajeRespuesta;
    
    public void setMessagePopup(String messagePopup) {
        this.messagePopup = messagePopup;
    }

    public String getMessagePopup() {
        return messagePopup;
    }
    private String messagePopup;
    
    @PostConstruct
    void init() {
        limpiaCampos();  
        cargaAniosyMesesVencimiento();
    }

    private void limpiaCampos(){
        numeroTarjeta=null;
        codigoSeguridad=null;
        tipoTarjeta=null;
        tipoTarjetaBines="";
        mesVencimiento=null;
        anioVencimiento=null;
        aceptaTerminos=null;
        tajetaValida=null;
        nombreTarjetaHabiente=null;
        lstTipoTarjetas=null;
        lstMesVencimiento=null;
        lstAnioVencimiento=null;
        mensajeRespuestaPago =null;
        mensajeRespuestaGuardado= null;
            
        tarjeta = new Tarjeta();
    }
    
    private void limpiaDatosPago(){
        nombreTarjetaHabiente=null;        
        numeroTarjeta=null;  
        tipoTarjetaBines="";
        codigoSeguridad=null;
        aceptaTerminos=null;
        tajetaValida=null;
       
    }

    @SuppressWarnings("deprecation")
    private void cargaAniosyMesesVencimiento(){       
        Date fechaAux= new Date();
        if(lstMesVencimiento==null){   
          SimpleDateFormat formateador;
          String  strMes;
            int auxMes;
          lstMesVencimiento=new ArrayList <SelectItem>();
          formateador=new SimpleDateFormat("MMMM", new Locale("ES"));        
            for (int intMes=0; intMes<12; intMes++) { // Se llena el arreglo de meses 
                fechaAux.setMonth(intMes);
                strMes = formateador.format(fechaAux);
                strMes=Character.toUpperCase(strMes.charAt(0))+strMes.substring(1);
                if(intMes==1){
                    strMes="Febrero"; 
                }
                auxMes=intMes+1;
                if(intMes<9){                   
                    lstMesVencimiento.add(new SelectItem("0"+auxMes ,strMes));    
                }else{
                    lstMesVencimiento.add(new SelectItem(""+auxMes ,strMes)); 
                }                               
            }
        }       
        if(lstAnioVencimiento==null){  
            lstAnioVencimiento=new ArrayList <SelectItem>();
            Integer anioAux;
            anioAux=fechaAux.getYear()+1900;
            for (int intAnio=0; intAnio<Constantes.RANGO_ANIO_VENCIMIENTO_TARJETAS; intAnio++) { // Se llena el arreglo de años             
              lstAnioVencimiento.add(new SelectItem(anioAux.toString().substring(2) ,anioAux.toString()));
              anioAux++;
            }   
        } 
    }

    public void lstnrValueChangeTipoTarjeta(ValueChangeEvent valueChangeEvent) {
        tipoTarjeta = ( (String) valueChangeEvent.getNewValue());
     //   log.debug("anioVencimiento"+ tipoTarjeta);
    }
    
    /**
     * @param event
     */
    public void lstnrValueChangeMesVencimiento(ValueChangeEvent event){  
        if(event!=null && event.getNewValue()!=null){
           mesVencimiento =  event.getNewValue().toString();
        }
         
      //  log.debug("mesVencimiento"+ mesVencimiento);
    }
    
    /**
     * @param event
     */
    public void lstnrValueChangeAnioVencimiento(ValueChangeEvent event){  
        if(event!=null && event.getNewValue()!=null){
           anioVencimiento = event.getNewValue().toString();
        }
       // log.debug("anioVencimiento"+ anioVencimiento);
    }
    
    public void lstnrValueChangeNumeroTarjeta(ValueChangeEvent valueChangeEvent) {
        numeroTarjeta = valueChangeEvent.getNewValue().toString();
        tipoTarjeta="";
        key_id.setValue("");
        phase.setValue("");
        tarjetaProtegida.setValue("");
        if(numeroTarjeta!=null){
            if (numeroTarjeta.length()==Constantes.TAMANIO_TARJETA_AMEX || numeroTarjeta.length()==Constantes.TAMANIO_TARJETA){
                String bines=numeroTarjeta.substring(0,Constantes.TAMANIO_BINES);
                LogPC.println(this,"Codigo bin a validar de la tarjeta:"+bines);
                validaTarjeta(bines);
            }
        }
    }

    private void validaTarjeta(String bines){        
        tajetaValida=false;
        ConfigMenu sesion = (ConfigMenu) JSFUtils.getBean("sesion");
        String organizationId = sesion.getSuscriptor().getOrganizacion();
        
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_BINES);
        ServicioBines sb = new ServicioBines();
        Bines sbines = null;
        LogPC.println(this, "validarBines [" + organizationId + "] " + bines);
        sbines = sb.validarBines(bines, organizationId);
        
        if(sbines.isTarjetaValida()){
                LogPC.println(this,"tipo tarjeta pago? "+sbines.getCreditoDebito());
                tajetaValida=true;     
                tarjeta.setNumeroTarjeta(getNumeroTarjeta());
                tipoTarjetaBines=sbines.getTipoTarjeta();
                /*Se agregan los valores dela tarjeta*/
                tarjeta.setCreditoDebito(sbines.getCd());
                tarjeta.setTipo(sbines.getTipoTarjeta());
                tarjeta.setCreditoDebitoTexto(
                //si null entonces vacio
                sbines.getCd() == null ? "" :
                    //si 01 entonces credito
                    sbines.getCd().equals("01") ?
                    "Crédito" :
                    //si otro entonces debito
                    "Débito");
                /*---------------------------------*/
                if(tipoTarjetaBines!=null && !tipoTarjetaBines.isEmpty()){
                    if(tipoTarjetaBines.equalsIgnoreCase(getMensajeProperties("TIPO_TARJETA_VISA"))){
                        tipoTarjeta=getMensajeProperties("DESC_TARJETA_VISA");  
                        addScriptOnPartialRequest("protect_form();");
                    }else if(tipoTarjetaBines.equalsIgnoreCase(getMensajeProperties("TIPO_TARJETA_MASTER_CARD"))){
                        tipoTarjeta=getMensajeProperties("DESC_TARJETA_MASTER_CARD"); 
                        addScriptOnPartialRequest("protect_form();");
                    }else if(tipoTarjetaBines.equalsIgnoreCase(getMensajeProperties("TIPO_TARJETA_AMEX"))){
                        tipoTarjeta=getMensajeProperties("DESC_TARJETA_AMEX");
                        addScriptOnPartialRequest("protect_form();");
                    }else{
                        LogPC.printlnError(this, "Tipo de tarjeta no valida");  
                    }
                }                      
        }else{                
               LogPC.printlnError(this,"Error al realizar la validación de los bines de la tarjeta ingresada");
               mostrarMensaje("No se ha identificado el tipo de la marca de la tarjeta, favor de validar el número de tarjeta", FacesMessage.SEVERITY_INFO);  
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
    
    public String lstnrPagar(){       
        String flujo = ""; 
        if(tipoTarjetaBines!=null && !tipoTarjetaBines.isEmpty()){
            if(validarTarjeta()){
                actionPopup = "pagar";
                ADFUtils.showPopup(popup);
                flujo="stay";
            }
        } else{
            LogPC.printlnError(this,"Error al realizar el pago con una nueva tarjeta no se tiene identificado el tipo de la marca de la tarjeta");  
            mostrarMensaje("No se ha identificado el tipo de la marca de la tarjeta, favor de validar el número de tarjeta", FacesMessage.SEVERITY_INFO);  
        }
        return flujo;
    }  

    public String lstnrPagaryGuardar(){    
        String flujo = "";       
            if(tipoTarjetaBines!=null && !tipoTarjetaBines.isEmpty()){
                if(validarTarjeta()){
                    actionPopup = "pagaryguardar";
                    ADFUtils.showPopup(popup);
                    flujo="stay";
                }
           } else{
            LogPC.printlnError(this,"Error al realizar el pago con una nueva tarjeta no se tiene identificado el tipo de la marca de la tarjeta");  
            mostrarMensaje("No se ha identificado el tipo de la marca de la tarjeta, favor de validar el número de tarjeta", FacesMessage.SEVERITY_INFO);  
        }   
        return flujo;
    }  
    
    private boolean validarTarjeta(){
        boolean isvalida=false;
        if(!tajetaValida ){
            LogPC.printlnError(this,"No se ha identificado el tipo de la marca de la tarjeta, favor de validar el número de tarjeta");
            mostrarMensaje("No se ha identificado el tipo de la marca de la tarjeta, favor de validar el número de tarjeta", FacesMessage.SEVERITY_INFO);  
        }else{
            if( !tarjetaProtegida.getValue().toString().isEmpty()
               && !key_id.getValue().toString().isEmpty()
               && !phase.getValue().toString().isEmpty()){
                isvalida= true;
                isvalida = validarLongTDC(tarjeta.getNumeroTarjeta());
                    int anioTDC = 0;
                    int mesTDC = 0;
                    int anio = Calendar.getInstance().get(Calendar.YEAR);
                    int mes = Calendar.getInstance().get(Calendar.MONTH) + 1;
                    anio = anio % 100;
                    anioTDC = Integer.parseInt(getAnioVencimiento());
                    mesTDC = Integer.parseInt(getMesVencimiento());

                    LogPC.println(this, "MES[" + mes + "][" + mesTDC + "]");
                    LogPC.println(this, "ANIO[" + anio + "][" + anioTDC + "]");

                    if (anio == anioTDC) {
                        if (mesTDC < mes) {
                            ADFUtils.showErrorMessage("La tarjeta que captur\u00F3 no esta vigente");
                            isvalida = false;
                        }
                    }
            }else{
                mostrarMensaje(getMensajeProperties("msj_ErrFljPrg"), FacesMessage.SEVERITY_INFO);   
            }
        }
    return isvalida;
    }
    public boolean validarLongTDC(String numeroTarjeta) {
        boolean esvalida=true;
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
    private Boolean aplicarPago(){
        Boolean pagadoAplicado=false;      
        
        LogPC.println(this, "Se procede a realizar el pago con nueva tarjeta");
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("realizaPagoNuevaTarjetaPs");
        
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        GestionarPagoConTDCRequestEBMType skyProcesaPago = new GestionarPagoConTDCRequestEBMType();
        DatosTransaccionPagoInputMessageType datosTransaccionPagoInput = new DatosTransaccionPagoInputMessageType();
        DatosTarjetaPagoType datosTarjetaPagoType = new DatosTarjetaPagoType();
        datosTransaccionPagoInput.setCuentaSky(sesion.getCuentaSKY());
        
        if (importe.getValue() != null)
            datosTransaccionPagoInput.setMontoPago(Double.valueOf(importe.getValue().toString()).toString());
        
        //skyProcesaPago.setPaqueteActualAccount(sesion.getSuscriptor().getPaquete());
        datosTransaccionPagoInput.setOrganizacionId(sesion.getSuscriptor().getOrganizacion());
        //skyProcesaPago.setNewBillTypeWeb(sesion.getSuscriptor().getBillingCode());
        //skyProcesaPago.setEmail(sesion.getUsuario().getMail());
        //skyProcesaPago.setSistema(sesion.getSistema());
        datosTransaccionPagoInput.setPropositoPago("0");
        //sesion.getIdSesion());idsesion
        datosTransaccionPagoInput.setCodigoMoneda(sesion.getSuscriptor().getCurrencyCode());
        datosTransaccionPagoInput.setDescripcion("SEL: "+ADFUtils.getString("bbpago.comentario")); //skycomentario
        datosTransaccionPagoInput.setPais(sesion.getPais());
        
        datosTransaccionPagoInput.setServicio("SKY");
        datosTransaccionPagoInput.setEmailNotificacion(sesion.getUsuario().getMail());
        
        
        datosTransaccionPagoInput.setKeyId(key_id.getValue().toString());
        datosTransaccionPagoInput.setPhaseId(phase.getValue().toString());
        
        
        datosTarjetaPagoType.setNombreTitular(getNombreTarjetaHabiente());
        datosTarjetaPagoType.setTipoTarjeta(tarjeta.getCreditoDebito());//creditodebito
        //datosTarjetaPagoType.setNumero(ProcesaTarjeta.encriptar(getNumeroTarjeta()));
        datosTarjetaPagoType.setNumero(getTarjetaProtegida().getValue().toString());
        datosTarjetaPagoType.setCvv(getCodigoSeguridad());
        
        datosTarjetaPagoType.setAnioExp(getAnioVencimiento());
        datosTarjetaPagoType.setMesExp(getMesVencimiento());
        
        
        datosTarjetaPagoType.setMarcaTarjeta(tarjeta.getTipo()); //tipo tarjeta
        
        skyProcesaPago.setDatosTarjetaPago(datosTarjetaPagoType);
        skyProcesaPago.setDatosTransaccionPagoIn(datosTransaccionPagoInput);
        
        operationBinding.getParamsMap().put("pago",skyProcesaPago); 
        
        GestionarPagoConTDCResponseEBMType responseSkyPP = (GestionarPagoConTDCResponseEBMType) operationBinding.execute();
        DatosTransaccionPagoOutputMessageType datosTransaccionPagoOutputMessageType = responseSkyPP.getDatosTransaccionPagoOut();
        
        if(responseSkyPP!=null){
            System.out.println("responseSkyPP: "+responseSkyPP.toString());
            if(responseSkyPP.getEBMHeaderResponse()!=null && responseSkyPP.getEBMHeaderResponse().getErrorNegocio().getEstado().equalsIgnoreCase("ok")){
                //revisar cual de los tres es el ticket
                ticketNumber = datosTransaccionPagoOutputMessageType.getNumeroSolicitudServicio();
                pagadoAplicado=true;
            }else if(responseSkyPP.getEBMHeaderResponse()!=null && responseSkyPP.getEBMHeaderResponse().getErrorNegocio().getDescripcionError() != null){
                 LogPC.printlnError(this, "respuestarealizaPagoNuevaTarjeta: "+ responseSkyPP.getEBMHeaderResponse().getErrorNegocio().getDescripcionError());
                 if(responseSkyPP.getEBMHeaderResponse().getErrorNegocio().getDescripcionError().equalsIgnoreCase(getMensajeProperties("Rechazado_ACI")))
                   //mostrarMensaje(getMensajeProperties("msj_pago_rechazado_ACI"), FacesMessage.SEVERITY_INFO); 
                    mensajeRespuestaPago=getMensajeProperties("msj_pago_rechazado_ACI");
                 else
                   //mostrarMensaje(getMensajeProperties("msj_pago_rechazado_general"), FacesMessage.SEVERITY_INFO);
                    mensajeRespuestaPago=getMensajeProperties("msj_pago_rechazado_general");
            }else{
               LogPC.printlnError(this, "Error al realizar el pago con una nueva tarjeta");
               //mostrarMensaje(getMensajeProperties("msj_pago_rechazado_general"), FacesMessage.SEVERITY_INFO);
               mensajeRespuestaPago=getMensajeProperties("msj_pago_rechazado_general");
           }           
        }else{
            LogPC.printlnError(this, "Error al realizar el pago con una nueva tarjeta");
            //mostrarMensaje(getMensajeProperties("msj_pago_rechazado_general"), FacesMessage.SEVERITY_INFO); 
            mensajeRespuestaPago=getMensajeProperties("msj_pago_rechazado_general");
        }    
        
        return pagadoAplicado;
    }
    
    private boolean guardarTarjeta(){
        boolean flujo = false; 
        tarjeta.setAnio(getAnioVencimiento());
        tarjeta.setMes(getMesVencimiento());
        tarjeta.setNombre(getNombreTarjetaHabiente());
        tarjeta.setTipo(getTipoTarjeta());
        tarjeta.setKeyId(key_id.getValue().toString());
        tarjeta.setPhase(phase.getValue().toString());
        //tarjeta.setNumeroTarjeta(getNumeroTarjeta());
        /*Se utiliza el MB de Tarjetas para guardarla*/
        BBTarjeta bbt = new BBTarjeta();
        bbt.setTarjeta(tarjeta);
        bbt.setTarjetaProtegida(getTarjetaProtegida());
        bbt.setKey_Id(key_id);
        bbt.setPhase_Id(phase);
        try {
            String agregar = bbt.guardarTarjeta();
            if(agregar != null){
                //mostrarMensaje(ADFUtils.getString(MENSAJE_PAGO_REALIZADO) + ticketNumber, FacesMessage.SEVERITY_INFO);
                //mostrarMensaje(getMensajeProperties("msj_pago_aplicado_tarjeta_guardada"), FacesMessage.SEVERITY_INFO);
                mensajeRespuestaPago = ADFUtils.getString(MENSAJE_PAGO_REALIZADO) + ticketNumber;
                mensajeRespuestaGuardado = getMensajeProperties("msj_pago_aplicado_tarjeta_guardada");
                flujo=true;
            }else{
                       LogPC.printlnError(this,"Error al realizar el registro de una nueva tarjeta");
                       //mostrarMensaje(getMensajeProperties("msj_eror_guardado_tarjeta"), FacesMessage.SEVERITY_INFO);
                       mensajeRespuestaGuardado = getMensajeProperties("msj_eror_guardado_tarjeta");
                   }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
           return  flujo;    
        }
    
    private boolean guardarTarjeta2(){
        boolean flujo = false; 
        tarjeta.setAnio(getAnioVencimiento());
        tarjeta.setMes(getMesVencimiento());
        tarjeta.setNombre(getNombreTarjetaHabiente());
        //tarjeta.setNumeroTarjeta(getNumeroTarjeta());
        /*Se utiliza el MB de Tarjetas para guardarla*/
        BBTarjeta bbt = new BBTarjeta();
        bbt.setTarjeta(tarjeta);
        try {
            String agregar = bbt.agregarTarjeta();
            if(agregar != null){
                //mostrarMensaje(ADFUtils.getString(MENSAJE_PAGO_REALIZADO) + ticketNumber, FacesMessage.SEVERITY_INFO);
                //mostrarMensaje(getMensajeProperties("msj_pago_aplicado_tarjeta_guardada"), FacesMessage.SEVERITY_INFO);
                mensajeRespuestaPago = ADFUtils.getString(MENSAJE_PAGO_REALIZADO) + ticketNumber;
                mensajeRespuestaGuardado = getMensajeProperties("msj_pago_aplicado_tarjeta_guardada");
                flujo=true;
            }else{
                       LogPC.printlnError(this,"Error al realizar el registro de una nueva tarjeta");
                       //mostrarMensaje(getMensajeProperties("msj_eror_guardado_tarjeta"), FacesMessage.SEVERITY_INFO);
                       mensajeRespuestaGuardado = getMensajeProperties("msj_eror_guardado_tarjeta");
                   }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
           return  flujo;    
        }
    
    
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }
    

    public void setLstTipoTarjetas(List<SelectItem> lstTipoTarjetas) {
        this.lstTipoTarjetas = lstTipoTarjetas;
    }

    public List<SelectItem> getLstTipoTarjetas() {
        if (lstTipoTarjetas == null) {
            lstTipoTarjetas = new ArrayList<SelectItem>();
        }
        return lstTipoTarjetas;
    }
    
    public void setLstMesVencimiento(List<SelectItem> lstMesVencimiento) {
        this.lstMesVencimiento = lstMesVencimiento;
    }

    public List<SelectItem> getLstMesVencimiento() {       
        return lstMesVencimiento;
    }

    public void setLstAnioVencimiento(List<SelectItem> lstAnioVencimiento) {
        this.lstAnioVencimiento = lstAnioVencimiento;
    }

    public List<SelectItem> getLstAnioVencimiento() {
        if (lstAnioVencimiento == null) {
            lstAnioVencimiento = new ArrayList<SelectItem>();
        }
        return lstAnioVencimiento;
    }

    
    public void setMesVencimiento(String mesVencimiento) {
        this.mesVencimiento = mesVencimiento;
    }

    public String getMesVencimiento() {
        return mesVencimiento;
    }

    public void setAnioVencimiento(String anioVencimiento) {
        this.anioVencimiento = anioVencimiento;
    }

    public String getAnioVencimiento() {
        return anioVencimiento;
    }
    
    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }
    
    public void setAceptaTerminos(Boolean aceptaTerminos) {
        this.aceptaTerminos = aceptaTerminos;
    }

    public Boolean getAceptaTerminos() {
        return aceptaTerminos;
    }

    public void setNombreTarjetaHabiente(String nombreTarjetaHabiente) {
        this.nombreTarjetaHabiente = nombreTarjetaHabiente;
    }

    public String getNombreTarjetaHabiente() {
        return nombreTarjetaHabiente;
    }

    public Boolean getTajetaValida() {
        return tajetaValida;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setImporte(RichInputText importe) {
        this.importe = importe;
    }

    public RichInputText getImporte() {
        return importe;
    }

    public void setPopup(RichPopup popup) {
        this.popup = popup;
    }

    public RichPopup getPopup() {
        return popup;
    }

    public void popupCancelListener(PopupCanceledEvent popupCanceledEvent) {
        // Add event code here...
    }

    public void listenerPopup(DialogEvent dialogEvent) {
        // Add event code here...
        if (dialogEvent.getOutcome().ok == DialogEvent.Outcome.ok) {
            boolean pagarOk = false;
            boolean guardarOk = false;
            try {
                if (actionPopup.compareTo("pagar") == 0){
                    //this.mensajeRespuesta = agregarTarjeta();
                    pagarOk = aplicarPago();
                    if(pagarOk){
                        mostrarMensaje(ADFUtils.getString(MENSAJE_PAGO_REALIZADO) + ticketNumber, FacesMessage.SEVERITY_INFO);
                        limpiaDatosPago();
                    }
                }
                if (actionPopup.compareTo("pagaryguardar") == 0){
                    //this.mensajeRespuesta = eliminarTarjeta();
                    pagarOk = aplicarPago();
                    if(pagarOk){
                        guardarOk  = guardarTarjeta();
                                    
                                } else{
                                    mostrarMensaje(getMensajeProperties("msj_pago_no_aplicado_tarjeta_no_guardada"), FacesMessage.SEVERITY_INFO);   
                                }
                    limpiaDatosPago();
                }
            } catch (Exception e) {
                //operacionConError = true;
                //this.mensajeRespuesta = e.getMessage();
                e.printStackTrace();
                if (actionPopup.compareTo("pagar") == 0){
                    LogPC.printlnError(this,"Error al realizar el pago con una nueva tarjeta");
                    mostrarMensaje(getMensajeProperties("msj_pago_rechazado_general"), FacesMessage.SEVERITY_INFO);   
                }
                
                if (actionPopup.compareTo("pagaryguardar") == 0){
                    if(!pagarOk){
                        LogPC.printlnError(this,"Error al realizar el pago con una nueva tarjeta");
                        mostrarMensaje(getMensajeProperties("msj_pago_rechazado_general"), FacesMessage.SEVERITY_INFO);
                    } else if(!guardarOk) {
                        LogPC.printlnError(this,"Error al realizar el registro de una nueva tarjeta");
                        mostrarMensaje(ADFUtils.getString(MENSAJE_PAGO_REALIZADO) + ticketNumber + "\n" +getMensajeProperties("msj_eror_guardado_tarjeta"), FacesMessage.SEVERITY_INFO);
                    }
                }
            }
            println(this, "Popup OK");
        }
        //delete tarjeta
        
        //selectOneChoiceAviso.resetValue();
        //ADFUtils.showPopup(popupMensajeRespuesta);
        ADFUtils.hidePopup(popup);
        
        //actualizarTablaTarjetas();
    }

    public void setActionPopup(String actionPopup) {
        this.actionPopup = actionPopup;
    }

    public String getActionPopup() {
        return actionPopup;
    }

    public String cancelarPago() {
        // Add event code here...
        ADFUtils.hidePopup(popup);
        return null;
    }

    public String aceptarPago() {
        pagarOk = false;
        guardarOk = false;
        mensajeRespuestaPago = null;
        mensajeRespuestaGuardado = null;
        try {
            if (actionPopup.compareTo("pagar") == 0){
                pagarOk = aplicarPago();
                if(pagarOk){
                    //mostrarMensaje(ADFUtils.getString(MENSAJE_PAGO_REALIZADO) + ticketNumber, FacesMessage.SEVERITY_INFO);
                    mensajeRespuestaPago=ADFUtils.getString(MENSAJE_PAGO_REALIZADO) + ticketNumber;
                    limpiaDatosPago();
                }
            }
            if (actionPopup.compareTo("pagaryguardar") == 0){
                pagarOk = aplicarPago();
                if(pagarOk){
                    guardarOk  = guardarTarjeta();
                            } else{
                                //mostrarMensaje(getMensajeProperties("msj_pago_no_aplicado_tarjeta_no_guardada"), FacesMessage.SEVERITY_INFO);   
                                mensajeRespuestaGuardado = getMensajeProperties("msj_pago_no_aplicado_tarjeta_no_guardada");
                            }
                limpiaDatosPago();
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (actionPopup.compareTo("pagar") == 0){
                LogPC.printlnError(this,"Error al realizar el pago con una nueva tarjeta");
                //mostrarMensaje(getMensajeProperties("msj_pago_rechazado_general"), FacesMessage.SEVERITY_INFO);   
                mensajeRespuestaPago=getMensajeProperties("msj_pago_rechazado_general");
                mensajeRespuestaGuardado = "";
            }
            
            if (actionPopup.compareTo("pagaryguardar") == 0){
                if(!pagarOk){
                    LogPC.printlnError(this,"Error al realizar el pago con una nueva tarjeta");
                    //mostrarMensaje(getMensajeProperties("msj_pago_rechazado_general"), FacesMessage.SEVERITY_INFO);
                    mensajeRespuestaPago=getMensajeProperties("msj_pago_rechazado_general");
                    mensajeRespuestaGuardado = "";
                } else if(!guardarOk) {
                    LogPC.printlnError(this,"Error al realizar el registro de una nueva tarjeta");
                    //mostrarMensaje(ADFUtils.getString(MENSAJE_PAGO_REALIZADO) + ticketNumber, FacesMessage.SEVERITY_INFO);
                    //mostrarMensaje(getMensajeProperties("msj_eror_guardado_tarjeta"), FacesMessage.SEVERITY_INFO);
                    mensajeRespuestaPago=ADFUtils.getString(MENSAJE_PAGO_REALIZADO) + ticketNumber;
                    mensajeRespuestaGuardado = getMensajeProperties("msj_eror_guardado_tarjeta");
                }
            }
        }
        ADFUtils.showPopup(popupMensajeRespuesta);
        ADFUtils.hidePopup(popup);
        
        return null;
    }

    public void setMensajeRespuestaPago(String mensajeRespuestaPago) {
        this.mensajeRespuestaPago = mensajeRespuestaPago;
    }

    public String getMensajeRespuestaPago() {
        return mensajeRespuestaPago;
    }

    public void setMensajeRespuestaGuardado(String mensajeRespuestaGuardado) {
        this.mensajeRespuestaGuardado = mensajeRespuestaGuardado;
    }

    public String getMensajeRespuestaGuardado() {
        return mensajeRespuestaGuardado;
    }

    public void setPopupMensajeRespuesta(RichPopup popupMensajeRespuesta) {
        this.popupMensajeRespuesta = popupMensajeRespuesta;
    }

    public RichPopup getPopupMensajeRespuesta() {
        return popupMensajeRespuesta;
    }
    public String aceptar() {
        ADFUtils.hidePopup(popupMensajeRespuesta);
        if(pagarOk)    {
            return "regresarPago";
        }
        return "";
    }


    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setTarjetaProtegida(HtmlInputHidden tarjetaProtegida) {
        this.tarjetaProtegida = tarjetaProtegida;
    }

    public HtmlInputHidden getTarjetaProtegida() {
        return tarjetaProtegida;
    }

    public void setKey_id(HtmlInputHidden key_id) {
        this.key_id = key_id;
    }

    public HtmlInputHidden getKey_id() {
        return key_id;
    }

    public void setPhase(HtmlInputHidden phase) {
        this.phase = phase;
    }

    public HtmlInputHidden getPhase() {
        return phase;
    }
}
