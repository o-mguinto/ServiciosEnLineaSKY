package mx.com.sky.sel.managedbeans.solicitudservicio;

import java.io.Serializable;

import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;

import mx.com.sky.sel.services.solicitudservicio.ServicioOtros;

import mx.com.sky.sel.services.sugerencias.ServicioSugerencias;
import mx.com.sky.sel.services.utils.SolicitudServicioUtils;
import mx.com.sky.sel.utils.ADFUtils;

import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import oracle.adf.view.rich.component.rich.RichPopup;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;
import oracle.adf.model.BindingContext;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.UtileriasMB;

public class BBOtrosServicios extends UtileriasMB implements Serializable {
    @SuppressWarnings("compatibility:-2202187913575491818")
    private static final long serialVersionUID = 8162996326530876440L;

    private String comentarios;
    private transient RichPopup popUpNS;

    public BBOtrosServicios() {
        super();
        this.comentarios = "";
    }

    public String cancelar() {
        cerrarPopUp();
        return null;
    }

    public String aceptar() {
        crearSolicitud();
        return null;
    }
    private void cerrarPopUp() {
        this.comentarios = "";
        popUpNS.cancel();
    }

    private String crearSolicitud() {
        ServicioOtros so = new ServicioOtros();
        SolicitudServicioBean solicitudServicio = null;
        String numeroSS= null;
        try {
            if (comentarios == null || comentarios.isEmpty()) {
                ADFUtils.showErrorMessage("Por favor intente m\u00E1s tarde.");
            } else {
                solicitudServicio = SolicitudServicioUtils.convert(solicitudServicio, "Otros Servicios: " + comentarios);
                OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.SOLICITUD_OTRA_INFORMACION);
                numeroSS = so.crearSolicitud(solicitudServicio);
                ServicioSugerencias servicioComentarios = new ServicioSugerencias();
                String cuentaSKY = null;
                ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
                cuentaSKY = sesion.getSuscriptor().getCuentaSKY();
                servicioComentarios.agregarSugerencia(cuentaSKY.concat("-01"), "Otros Servicios: " + comentarios, numeroSS);
                cerrarPopUp();
                actualizarTabla();
                ADFUtils.showInfoMessage("Los datos se han guardado correctamente");
            }
        } catch (Exception e) {
            ADFUtils.showErrorMessage(getMensajeProperties("mensaje_PantallaError_generico"));
            LogPC.printlnError(e);
        }
        return numeroSS;
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
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

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setPopUpNS(RichPopup popUpNS) {
        this.popUpNS = popUpNS;
    }

    public RichPopup getPopUpNS() {
        return popUpNS;
    }
}
