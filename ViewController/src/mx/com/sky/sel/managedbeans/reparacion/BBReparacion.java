package mx.com.sky.sel.managedbeans.reparacion;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import static mx.com.sky.sel.log.LogPC.println;
import static mx.com.sky.sel.log.LogPC.printlnError;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.utils.SolicitudServicioUtils;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import org.apache.myfaces.trinidad.context.RequestContext;
import org.apache.myfaces.trinidad.event.ReturnEvent;

/**
 * BackingBean para solicitud de reparacion de equipo (Servicio técnico)
 */
public class BBReparacion implements Serializable {
    @SuppressWarnings("compatibility:-3559245834825630879")
    private static final long serialVersionUID = -8327621643978375667L;

    private String comentarios;
    private transient RichPopup popupConfirmacion;
    private String mensajeRespuesta;
    private transient DCIteratorBinding dCSolicitud;
    private transient RichPopup popupMensajeRespuesta;
    private static final String MENSAJE_SOLICITUD_ENVIADA = "bbreparaciones.solicitudenviada";

    public BBReparacion() {
        dCSolicitud = ADFUtils.getIterador("obtenerSolicitudServicioIterator");
        println(this, "BBReparacion creado");
    }

    /**
     * Paso1: Se ejecuta cuando da clic en Aceptar para enviar la solicitud
     * Muestra el popup para confirmar envio de solicitud
     */
    public String confirmarSolicitudCambio() {
        ADFUtils.showPopup(popupConfirmacion);
        return null;
    }

    /**
     * Paso2: Se ejecuta cuando da clic en aceptar o cancelar del popup de confirmar
     * @param dialogEvent
     */
      /**
     * Paso 3: Envia la solicitud de reparacion con los comentarios dados
     * @return
     */
    public String enviarSolicitudCambio() {
        println(this, "Iniciar envio de Reparacion");
        //Descripcion
        String descripcion = this.comentarios;
        //crear bean de Solicitud de servicio
        SolicitudServicioBean solicitudServicio = new SolicitudServicioBean();
        //llenar bean

        try {
            
            solicitudServicio = SolicitudServicioUtils.convert(solicitudServicio, descripcion);
            //instanciar servicio
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.SERVICIO_TECNICO_CAMBIO_DOMICILIO);
            println(this, "Enviando Solicitud.. " + solicitudServicio);
            BindingContainer bindings = getBindings();
            OperationBinding stOp = bindings.getOperationBinding("crearSolicitudST");
            stOp.getParamsMap().put("solicitudServicio", (solicitudServicio));
            Object result = stOp.execute();
            //invokar
            
            String numSolicitud = String.valueOf(result);
            //si no hubo excepcion entonces OK
            mensajeRespuesta = ADFUtils.getString(MENSAJE_SOLICITUD_ENVIADA) + numSolicitud;
            println(this, "Respuesta: " + numSolicitud);
        } catch (Exception e) {
            e.printStackTrace();
            mensajeRespuesta = e.getMessage();
            printlnError(this, "Error en la Solicitud de Reporte" + e.getMessage());
        }
        dCSolicitud.invalidateCache(); //Limpiamos la Cache del DC para el refresh
        actualizarTablaSolicitudes();
        ADFUtils.showPopup(popupMensajeRespuesta);
        ADFUtils.hidePopup(popupConfirmacion);
        this.comentarios = "";
        return "OK";
    }
      
    /*ACTUALIZA LA TABLA*/
        public void reparaReturn(ReturnEvent returnEvent) {
            // Add event code here...
            
              RequestContext.getCurrentInstance().addPartialTarget(returnEvent.getComponent().getParent().getParent());
        }
    /**
         * Actualiza la tabla de pagos
         * @return
         */
        private boolean actualizarTablaSolicitudes() {
            BindingContainer bindings = getBindings();
            OperationBinding operationBinding = bindings.getOperationBinding("actualizarTablaSolicitudes");
            Object result = operationBinding.execute();
            if (!operationBinding.getErrors().isEmpty()) {
                return false;
            }
            return true;
        }
    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getComentarios() {
        return comentarios;
    }


    public void setPopupConfirmacion(RichPopup popupConfirmacion) {
        this.popupConfirmacion = popupConfirmacion;
    }

    public RichPopup getPopupConfirmacion() {
        return popupConfirmacion;
    }

    public void setPopupMensajeRespuesta(RichPopup popupMensajeRespuesta) {
        this.popupMensajeRespuesta = popupMensajeRespuesta;
    }

    public RichPopup getPopupMensajeRespuesta() {
        return popupMensajeRespuesta;
    }

    public void setMensajeRespuesta(String mensajeRespuesta) {
        this.mensajeRespuesta = mensajeRespuesta;
    }

    public String getMensajeRespuesta() {
        return mensajeRespuesta;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        LogPC.println(this, "Serializando BBReparaciones: " + comentarios);
    }

    private void readObject(ObjectInputStream in) throws IOException {
        try {
            in.defaultReadObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        LogPC.println(this, "DeSerializando BBReparaciones :" + comentarios);
    }
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String cancelarReparacion() {
        // Add event code here...
        ADFUtils.hidePopup(popupConfirmacion);
        return null;
    }
    public String aceptarSolicitud() {
        // Add event code here...
        ADFUtils.hidePopup(popupMensajeRespuesta);
        return null;
    }
}
