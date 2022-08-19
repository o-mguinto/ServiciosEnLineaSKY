package mx.com.sky.sel.services.solicitudservicio;

import java.util.List;

import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.exception.ServicioException;

public interface IServicio {
    public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID);
    public String crearSolicitud(SolicitudServicioBean solicitudServicio) throws ServicioException;
}
