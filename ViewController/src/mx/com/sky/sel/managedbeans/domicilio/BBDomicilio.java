package mx.com.sky.sel.managedbeans.domicilio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import static mx.com.sky.sel.log.LogPC.println;
import static   mx.com.sky.sel.log.LogPC.printlnError;
import mx.com.sky.sel.services.utils.SolicitudServicioUtils;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;

import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import org.apache.myfaces.trinidad.context.RequestContext;
import org.apache.myfaces.trinidad.event.ReturnEvent;

public class BBDomicilio implements Serializable {
    @SuppressWarnings("compatibility:6615072238201431634")
    private static final long serialVersionUID = 6890024106028076692L;

    private String comentarios;
    private transient RichPopup popupConfirmacion;
    private String mensajeRespuesta;
    private transient DCIteratorBinding dCSolicitud;
    private transient RichPopup popupMensajeRespuesta;
    private static final String MENSAJE_SOLICITUD_ENVIADA = "bbcambiodomicilio.solicitudenviada";

    public BBDomicilio() {
        dCSolicitud = ADFUtils.getIterador("obtenerSolicitudServicioIterator");
        println(this, "BBDomicilio creado");
    }

    /**
     * Paso 1: Se ejecuta cuando da clic en Aceptar para enviar la solicitud
     * Muestra el popup de confirmacion
     */
    public String confirmarSolicitudCambio() {
        ADFUtils.showPopup(popupConfirmacion);
        return null;
    }

    /**
     * Paso 2: Se ejecuta cuando da clic en aceptar o cancelar del popup de confirmar
     * @param dialogEvent
     */
    /**
     * Paso 3: Envia la solicitud de cambio de domicilio
     * @return
     */
    public String enviarSolicitudCambio() {
        println(this, "Iniciar envio de solicitud de cambio de domicilio");
        //obtengo la sesion
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        //Descripcion
        String descripcion = this.comentarios;
        //RowId
        String rowId = sesion.getSuscriptor().getRowId();
        //Cuenta
        String cuentaSKY = sesion.getSuscriptor().getCuentaSKY();
        //crear bean de Solicitud de servicio
        SolicitudServicioBean solicitudServicio = new SolicitudServicioBean();
        //llenar bean
        solicitudServicio.setDescripcion(descripcion);
        solicitudServicio.setContactoRowId(rowId);
        solicitudServicio.setCuenta(cuentaSKY);

        try {
            //instanciar servicio
            println(this, "Enviando Solicitud De Domicilio.. " + solicitudServicio);
            //invokar
            solicitudServicio = SolicitudServicioUtils.convert(solicitudServicio, descripcion);
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CAMBIO_DOMICILIO);
            
            BindingContainer bindings = getBindings();
            OperationBinding scdOp = bindings.getOperationBinding("crearSolicitudST");
            scdOp.getParamsMap().put("solicitudServicio", (solicitudServicio));
            Object result = scdOp.execute();
            
            String numSolicitud = String.valueOf(result);
            //si no hubo excepcion entonces OK
            mensajeRespuesta = ADFUtils.getString(MENSAJE_SOLICITUD_ENVIADA) + numSolicitud;
            println(this, "Respuesta: " + numSolicitud);
        } catch (Exception e) {
            e.printStackTrace();
            mensajeRespuesta = e.getMessage();
            printlnError(this, "Error en la Solicitud de Reporte");
        }
        dCSolicitud.invalidateCache(); //Limpiamos la Cache del DC para el refresh
        actualizarTablaSolicitudes();
        ADFUtils.showPopup(popupMensajeRespuesta);
        ADFUtils.hidePopup(popupConfirmacion);
        this.comentarios = "";
        return "OK";
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
                          
    public String cancelarSolicitudCambio(){
        ADFUtils.hidePopup(popupConfirmacion);
        return null;
    }
        public String aceptarSolicitudCambio(){
            ADFUtils.hidePopup(popupMensajeRespuesta);
            return null;
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
        LogPC.println(this, "Serializando BBDomicilio: " + comentarios);
    }

    private void readObject(ObjectInputStream in) throws IOException {
        try {
            in.defaultReadObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        LogPC.println(this, "DeSerializando BBDomicilio :" + comentarios);
    }
        public BindingContainer getBindings() {
            return BindingContext.getCurrent().getCurrentBindingsEntry();
        }
/*ACTUALIZA LA TABLA*/
    public void cambioDomReturn(ReturnEvent returnEvent) {
        // Add event code here...
        
          RequestContext.getCurrentInstance().addPartialTarget(returnEvent.getComponent().getParent().getParent());
    }
}
