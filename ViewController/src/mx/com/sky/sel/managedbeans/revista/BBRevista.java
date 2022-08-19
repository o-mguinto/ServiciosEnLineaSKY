package mx.com.sky.sel.managedbeans.revista;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.beans.utils.Direccion;
import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.services.datosgenerales.ServicioDatosGenerales;
import mx.com.sky.sel.services.utils.SolicitudServicioUtils;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class BBRevista implements Serializable{
    @SuppressWarnings("compatibility:8192253256922357987")
    private static final long serialVersionUID = 228107772982489626L;
    private transient DCIteratorBinding DCSolicitud_; //Permite tener una referencia al DC
    private transient RichPopup popupMensajeContratacion; //Popup que informa el estado de la Compra
    private String mensajeContratacion;
    private transient RichPopup popupConfirmacion; //Popup de Confirmaci\u00F3n de datos
    private static final String MENSAJE_REVISTA_CONTRATADA =
        "bbrevista.revistacontratada";
    private static final String MENSAJE_REVISTA_ERROR =
        "bbrevista.errorcontratacion";

    private Boolean direccion = false;
    private boolean readOnlyDireccion;

    public BBRevista() {
        LogPC.println(this, "BBrevista Creado");
        DCSolicitud_ =
                ADFUtils.getIterador("obtenerSolicitudServicioIterator");
        readOnlyDireccion = true;
    }


    /* Paso 1
    * Metodo invocado cuando se presiona el boton Aceptar y que muestra el Popup de Confirmaci\u00F3n
    */

    public String showPopupConfirmacion() {
        ADFUtils.showPopup(popupConfirmacion);
        return "OK";
    }

    /* Paso 2
    * Metodo invocado cuando se presiona el boton Contratar
    */


    /* Paso 3
    * Metodo que contrata la Revista
    */

    public String contratarRevista() {
        SolicitudServicioBean sc = new SolicitudServicioBean();
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        sc = SolicitudServicioUtils.convert(sc);
        Direccion direccion = null;
        ServicioDatosGenerales sdg = null;
        LogPC.println(this,
                      ".:: Invocacion a ServicioDatosGenerales 'obtenerDireccionEnvio' ::.");
        sdg = new ServicioDatosGenerales();
        direccion =
                sdg.obtenerDireccionEnvio(sesion.getSuscriptor().getRowId());
        if (direccion != null) {
            sc.setDescripcion(direccion.getDireccion());
        }else{
            sc.setDescripcion("Solicitud de revista");
        }

        try {
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.COMPRA_REVISTA_SKYVIEW);
            sc.setIdSesion(sesion.getIdSesion());
            
            BindingContainer bindings = getBindings();
            OperationBinding op = bindings.getOperationBinding("crearSolicitudPs");
            op.getParamsMap().put("solicitudServicio", sc);
            
            
            String respuesta = String.valueOf(op.execute());
            mensajeContratacion =
                    ADFUtils.getString(MENSAJE_REVISTA_CONTRATADA) + respuesta;
            LogPC.println(this, mensajeContratacion);
        } catch (Exception ex) {
            LogPC.printlnError(ex);
            mensajeContratacion = ADFUtils.getString(MENSAJE_REVISTA_ERROR);
            LogPC.printlnError(this, mensajeContratacion);
        }
        DCSolicitud_.invalidateCache(); //Limpiamos la Cache del DC para el refresh
        // comentarios.setValue("");
        ADFUtils.showPopup(popupMensajeContratacion);
        ADFUtils.hidePopup(popupConfirmacion);
        return "contratado";
    }
       
    public String aceptarContratacion() {
        ADFUtils.hidePopup(popupMensajeContratacion);
        return "";
    }
    /*Metodo invocado cuando se da click al Checkbox de Cambio de Direcci\u00F3n*/

    public void direccionChanged(ValueChangeEvent e) {
        Boolean direccion = (Boolean)e.getNewValue();
        if (direccion)
            readOnlyDireccion = false;
        else
            readOnlyDireccion = true;
    }

    public void setPopupMensajeContratacion(RichPopup popupMensajeContratacion) {
        this.popupMensajeContratacion = popupMensajeContratacion;
    }

    public RichPopup getPopupMensajeContratacion() {
        return popupMensajeContratacion;
    }

    public String getMensajeContratacion() {
        return mensajeContratacion;
    }


    public void setPopupConfirmacion(RichPopup popupConfirmacion) {
        this.popupConfirmacion = popupConfirmacion;
    }

    public RichPopup getPopupConfirmacion() {
        return popupConfirmacion;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        LogPC.println(this, "Serializando BBRevista: " + this);
    }

    private void readObject(ObjectInputStream in) throws IOException {
        try {
            in.defaultReadObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        LogPC.println(this, "DeSerializando BBRevista:" + this);
    }

    @Override
    public String toString() {
        return "BBRevista[ MensajeContratacion = " + mensajeContratacion + "]";
    }

    public void setDireccion(Boolean direccion) {
        this.direccion = direccion;
    }

    public Boolean getDireccion() {
        return direccion;
    }

    public void setReadOnlyDireccion(boolean readOnlyDireccion) {
        this.readOnlyDireccion = readOnlyDireccion;
    }

    public boolean isReadOnlyDireccion() {
        return readOnlyDireccion;
    }

    public void direccionChanged(ActionEvent actionEvent) {
        // Add event code here...
        readOnlyDireccion = !readOnlyDireccion;
    }
    public boolean isRevistaContratada(){
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        
        BindingContainer bindings = getBindings();
        OperationBinding op = bindings.getOperationBinding("revistaContratadaPs");
        op.getParamsMap().put("cuenta", sesion.getSuscriptor().getCuentaSKY());
        
        boolean revistaContratada=Boolean.valueOf(String.valueOf(op.execute()));
        
        LogPC.println(this, "+++++++++++++++++++++++++++++++++RevistaContratada BBREVISTA: "+revistaContratada);
        return revistaContratada;
        
    }
        public BindingContainer getBindings() {
            return BindingContext.getCurrent().getCurrentBindingsEntry();
        }

    public String cancelarContratacionRevista() {
        // Add event code here...
        ADFUtils.hidePopup(popupMensajeContratacion);
        ADFUtils.hidePopup(popupConfirmacion);
        return null;
    }
}
