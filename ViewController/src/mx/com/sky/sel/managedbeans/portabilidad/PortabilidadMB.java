package mx.com.sky.sel.managedbeans.portabilidad;

import java.io.Serializable;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.managedbeans.sesion.SesionMB;
import mx.com.sky.sel.services.beans.portabilidad.PortabilidadBean;
import mx.com.sky.sel.services.beans.utils.LineaCelularDTO;
import mx.com.sky.sel.services.cofetel.ServicioCofetel;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.UtileriasMB;
import mx.com.sky.sel.utils.ValidadorCurp;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.component.rich.RichPopup;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class PortabilidadMB extends UtileriasMB implements Serializable{
    @SuppressWarnings("compatibility:2346726338092931690")
    private static final long serialVersionUID = 4529348919415726511L;

    private transient PortabilidadBean beanPortab;
    private transient RichPopup popupMensajeRespuesta;
    private String mensajeRespuesta;
    private String lada;
    private String telefono;
    
    ValidadorCurp valCurp= new ValidadorCurp();

    private static final String MENSAJE_ERROR_DEFAULT = "portabilidad.error.default";
    private static final String MENSAJE_SOLICITUD_OK = "portabilidad.silicitudrealizada";
    private static final String MENSAJE_SOLICITUD_ERROR = "portabilidad.errorsolicitud";
    
    // Campos para select de lineas celulares
    private String lineaCelularSeleccionada;
    private List<SelectItem> lineasCelularesComboBox;
    
    public PortabilidadMB() {
        super();
        beanPortab= new PortabilidadBean();
    }
    
    public String registrarOperacionBAM(){
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.MENU_PORTABILIDAD, "Acceso a menu de portabilidad");
        return "irIndex";
    }
    
    public String solicitarPortabilidad() {
        // Add event code here...
        if(validarDatos()){
        LogPC.println(this, "Se procede a realizar la solicitud de portabilidad...");
        BindingContainer bindings = getBindings();
        OperationBinding op = bindings.getOperationBinding("solicitarPortabilidad");
        
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        //Operaciones BAM de solicitudportabilidad
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.SOLICITUD_PORTABILIDAD, "Solicitud de portabilidad");
        try {        
            PortabilidadBean datosPortab= new PortabilidadBean();
            datosPortab = beanPortab;
            datosPortab.setAssetNumber(lineaCelularSeleccionada);
            datosPortab.setRegion(lada);
            datosPortab.setCuenta(sesion.getSuscriptor().getCuentaSKY());
            
            op.getParamsMap().put("datosPortabilidad", datosPortab);
            Object result = op.execute();
            if(result != null){
                //si hay ejecución correcta de la solicitud
                if(result.toString().equalsIgnoreCase("0")){
                   LogPC.println(this, ADFUtils.getString(MENSAJE_SOLICITUD_OK));
                    mensajeRespuesta = ADFUtils.getString(MENSAJE_SOLICITUD_OK); 
                }else{
                    mensajeRespuesta = ADFUtils.getString(MENSAJE_SOLICITUD_ERROR); 
                    LogPC.println(this, ADFUtils.getString(MENSAJE_SOLICITUD_ERROR));
                }
            }
        } catch (Exception e) {
                mensajeRespuesta = ADFUtils.getString(MENSAJE_ERROR_DEFAULT);
            LogPC.printlnError(this, e);
        }
            ADFUtils.showPopup(popupMensajeRespuesta);
        }
        
        return null;
    }
   
    private boolean validarDatos(){
        boolean resultado=true;
        resultado = validaNoCelular() && validarCurp() && validarFechaVig();
        return resultado;
    }
    private boolean validarCurp(){
        boolean isCurp=false;
        isCurp = valCurp.validarCurp(beanPortab.getCurp());
        if(!isCurp){
            ADFUtils.showErrorMessage(getMensajeProperties("msj_validacioncurp_error"));
        }
        return isCurp;
    }
    private boolean validarFechaVig(){
        boolean isFechaVig = false;
        final String sdate = beanPortab.getVigenciaNip();
               final SimpleDateFormat df = new SimpleDateFormat( "dd/MM/yyyy" );
               final Date fSeleccion;
               Date fActual = new Date();
        try {
            fSeleccion = df.parse(sdate);
            // conversion from String
            final java.util.Calendar cal = GregorianCalendar.getInstance();
            cal.setTime( fActual );
            cal.add( GregorianCalendar.DAY_OF_MONTH, 4 ); // date manipulation
            
            
            //si selecciona una fecha mayor a la actual y si la fecha seleccionada esta en el rango mayor de 1-4 dias máximo a la fecha actual
            if(fSeleccion.after(fActual) && fSeleccion.before(cal.getTime())){
                LogPC.println(this,  "+++ La fecha seleccionada es correcta"); 
                isFechaVig = true;
            }else{
                if(!isFechaVig){
                    LogPC.println(this,  "--- La fecha seleccionada NO es correcta"); 
                    ADFUtils.showErrorMessage(getMensajeProperties("msj_validacionFVig_error"));
                }
            }
            
        } catch (ParseException pe) {
            LogPC.println(this,  "error validacion fehca nip: ");
            LogPC.printlnError(this, pe);
        } 
        
        return isFechaVig;
    }
    
    public boolean validaNoCelular() {
        boolean respuesta = false;
        generaLadaConTelefono();
            ServicioCofetel sc = null;
            String modalidadMovil = "";

            try {
                sc = new ServicioCofetel();
                modalidadMovil = sc.validaTelefono(lada, telefono);
                if (!modalidadMovil.equalsIgnoreCase("MOVIL")) {
                    ADFUtils.showErrorMessage("Favor de ingresar un teléfono de celular valido");
                }else{
                    respuesta = true;
                    }
                                
            } catch (Exception e) {
                ADFUtils.showErrorMessage(getMensajeProperties("mensaje_PantallaError_generico"));
                LogPC.printlnError(this, e);
            }

        return respuesta;
    
}

private void generaLadaConTelefono(){
    String auxLada =beanPortab.getNumeroPortar().substring(0, 2);
    lada = "";
    telefono = "";
    //33 Guadalajara, Jal.   
    //55 Ciudad de México, D.F.
    //81 Monterrey, N.L.
    if(auxLada.equals("33")||auxLada.equals("55")||auxLada.equals("81")){
        lada = auxLada;
        telefono = beanPortab.getNumeroPortar().substring(2);
    }else{
        lada = beanPortab.getNumeroPortar().substring(0, 3);
        telefono = beanPortab.getNumeroPortar().substring(3);
    }
}
    
    /**
     *Obtiene el contenedor de bindings
     * @return
     */
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public void setBeanPortab(PortabilidadBean beanPortab) {
        this.beanPortab = beanPortab;
    }

    public PortabilidadBean getBeanPortab() {
        return beanPortab;
    }

    public void setPopupMensajeRespuesta(RichPopup popupMensajeRespuesta) {
        this.popupMensajeRespuesta = popupMensajeRespuesta;
    }

    public RichPopup getPopupMensajeRespuesta() {
        if(popupMensajeRespuesta != null)
            popupMensajeRespuesta.cancel();
        return popupMensajeRespuesta;
    }

    public void setMensajeRespuesta(String mensajeRespuesta) {
        this.mensajeRespuesta = mensajeRespuesta;
    }

    public String getMensajeRespuesta() {
        return mensajeRespuesta;
    }
    public String aceptarNotif() {
        // Add event code here...
        beanPortab= new PortabilidadBean();
        return "regresar";
    }
    public void aceptarNotifAction(ActionEvent actionEvent) {
        // Add event code here...
        ADFUtils.hidePopup(popupMensajeRespuesta);

    }

    public void setLineaCelularSeleccionada(String lineaCelularSeleccionada) {
        this.lineaCelularSeleccionada = lineaCelularSeleccionada;
    }

    public String getLineaCelularSeleccionada() {
        return lineaCelularSeleccionada;
    }

    public void setLineasCelularesComboBox(List<SelectItem> lineasCelularesComboBox) {
        this.lineasCelularesComboBox = lineasCelularesComboBox;
    }

    public List<SelectItem> getLineasCelularesComboBox() {
        if(lineasCelularesComboBox ==null){
            SesionMB sesion = null;
            sesion = (SesionMB)JSFUtils.getBean("sesion");
            if(sesion.getSuscriptor().getLineasCelulares() != null && !sesion.getSuscriptor().getLineasCelulares().isEmpty() ) {
                LogPC.println(this, "Total de lineas celulares del suscriptor: "+sesion.getSuscriptor().getLineasCelulares().size());
                this.lineasCelularesComboBox = new ArrayList<SelectItem>();
                for(LineaCelularDTO lnCel : sesion.getSuscriptor().getLineasCelulares()) {
                    lineasCelularesComboBox.add(new SelectItem(lnCel.getAssetNumber(),lnCel.getNumCelular()));
                }
            }
        }
        return lineasCelularesComboBox;
    }
}
