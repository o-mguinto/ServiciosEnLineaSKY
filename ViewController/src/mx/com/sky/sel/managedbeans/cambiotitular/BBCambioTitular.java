package mx.com.sky.sel.managedbeans.cambiotitular;

import java.io.Serializable;

import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.cambiotitular.ServicioCambioTitular;
import mx.com.sky.sel.services.utils.SolicitudServicioUtils;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import org.apache.myfaces.trinidad.event.ReturnEvent;

public class BBCambioTitular implements Serializable {
    @SuppressWarnings("compatibility:7526439844714386661")
    private static final long serialVersionUID = 7374847947861232711L;
    private transient RichPopup popupMensaje;
    private String mensaje;
    private static final String MENSAJE_SOLICITUD_ENVIADA = "bbcambiotitular.solicitudenviada";
    private static final String MENSAJE_SOLICITUD_ERROR = "bbcambiotitular.errorsolicitud";
    private transient RichPopup popupGenerarSolicitud;

    public BBCambioTitular() {
        LogPC.println(this, "BBCambioTitular Creado");
    }


    /*
     * Paso 1:
     */
    /*Metodo invocado cuando se presiona el boton Enviar Solicitud*/

    public void generarSolicitud(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome().ok == DialogEvent.Outcome.ok) {
            LogPC.println(this, "Cambio de Titular");
            Solicitud();
        }
    }


    /*
     * Paso 2 :
     */
    /*Generación de Solicitud*/

    public String Solicitud() {
        
        try {
            LogPC.println(this, "Cambio de Titular");
            ServicioCambioTitular sct = new ServicioCambioTitular();
            SolicitudServicioBean scb = new SolicitudServicioBean();
            scb = SolicitudServicioUtils.convert(scb, "Cambio de Titular");
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CAMBIO_TITULAR);
            mensaje = ADFUtils.getString(MENSAJE_SOLICITUD_ENVIADA) + sct.crearSolicitud(scb);
            LogPC.println(this, mensaje);
        } catch (Exception ex) {
            LogPC.printlnError(ex);
            mensaje = ADFUtils.getString(MENSAJE_SOLICITUD_ERROR);
            LogPC.printlnError(this, mensaje);
        }
        actualizarTabla();
        ADFUtils.showPopup(popupMensaje);
        ADFUtils.hidePopup(popupGenerarSolicitud);
        return  "OK";
    }
    public String cancelarSolicitud() {
        // Add event code here...
        ADFUtils.hidePopup(popupGenerarSolicitud);
        return null;
    }
    public String aceptarCambioTitular(){
        ADFUtils.hidePopup(popupMensaje);
        return null;
    }
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String actualizarTabla() {
        LogPC.println(this, "actualizarTabla");
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("actualizarTabla");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public void setPopupMensaje(RichPopup popupMensaje) {
        this.popupMensaje = popupMensaje;
    }

    public RichPopup getPopupMensaje() {
        return popupMensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void enviarDocumentosReturnListener(ReturnEvent returnEvent) {
        // Add event code here...
        actualizarTabla();
    }

    public void setPopupGenerarSolicitud(RichPopup popupGenerarSolicitud) {
        this.popupGenerarSolicitud = popupGenerarSolicitud;
    }

    public RichPopup getPopupGenerarSolicitud() {
        return popupGenerarSolicitud;
    }
}
