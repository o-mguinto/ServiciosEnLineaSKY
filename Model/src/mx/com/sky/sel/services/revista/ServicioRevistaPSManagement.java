package mx.com.sky.sel.services.revista;

import java.util.List;

import javax.ejb.Remote;

import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.exception.ServicioException;

@Remote
public interface ServicioRevistaPSManagement {
    public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID);
    public String crearSolicitud(SolicitudServicioBean solicitudServicio) throws ServicioException;
    public boolean revistaContratada(String cuenta);
}
