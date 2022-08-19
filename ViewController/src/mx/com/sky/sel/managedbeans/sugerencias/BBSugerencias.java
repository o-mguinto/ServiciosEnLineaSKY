package mx.com.sky.sel.managedbeans.sugerencias;

import java.io.Serializable;

import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.solicitudservicio.ServicioOtros;
import mx.com.sky.sel.services.sugerencias.ServicioSugerencias;
import mx.com.sky.sel.services.utils.SolicitudServicioUtils;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.UtileriasMB;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import oracle.adf.model.BindingContext;

import oracle.adf.view.rich.component.rich.RichPopup;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class BBSugerencias extends UtileriasMB implements Serializable {
    @SuppressWarnings("compatibility:-87088382717445114")
    private static final long serialVersionUID = -718470221121859418L;
    private String sugerencias;
        private String uid;
    private transient RichPopup popupSugerencia;


    /**
     * Constructor
     */
    public BBSugerencias() {
        this.sugerencias = "";
    }

    /**
     * Obtiene el contendor de bindings
     * @return
     */
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    /**
     *Agrega sugerencia y actualza tabla
     * @return
     */    
    public String cbAgregarSugerencia_action() {
        crearSolicitud();
        return null;
    }
    
    private String crearSolicitud() {
        ServicioOtros so = new ServicioOtros();
        SolicitudServicioBean solicitudServicio = null;
        String numeroSS= null;
        try {
            if (sugerencias == null || sugerencias.isEmpty()) {
                ADFUtils.showErrorMessage("Por favor intente m\u00E1s tarde.");
            } else {
                solicitudServicio = SolicitudServicioUtils.convert(solicitudServicio, "Sugerencia: " + sugerencias);
                OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.SUGERENCIAS);
                numeroSS = so.crearSolicitud(solicitudServicio);
                ServicioSugerencias servicioSugerencias = new ServicioSugerencias();
                servicioSugerencias.agregarSugerencia(this.uid, sugerencias, numeroSS);
                actualizarTabla();
                ADFUtils.showInfoMessage("Los datos se han guardado correctamente");
            }
        } catch (Exception e) {
            ADFUtils.showErrorMessage(getMensajeProperties("mensaje_PantallaError_generico"));
            LogPC.printlnError(e);
        }
        cerrarPopUp();
        return numeroSS;
    }
    public String cancelarSolicitud() {
        popupSugerencia.cancel();
        return "";
    }
    private void cerrarPopUp() {
        this.sugerencias = "";
        popupSugerencia.cancel();
    }


    public String actualizarTabla() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("actualizarTabla");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public void setSugerencias(String sugerencias) {
        this.sugerencias = sugerencias;
    }

    public String getSugerencias() {
        return sugerencias;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUid() {
        return uid;
    }

    public void setPopupSugerencia(RichPopup popupSugerencia) {
        this.popupSugerencia = popupSugerencia;
    }

    public RichPopup getPopupSugerencia() {
        return popupSugerencia;
    }
}
