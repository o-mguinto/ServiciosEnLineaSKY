package mx.com.sky.sel.services.stcd;

import java.util.List;

import javax.ejb.Remote;

import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.exception.ServicioException;

@Remote
public interface ServicioSTCDPSManagement {
    public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID);
    public String crearSolicitudST(SolicitudServicioBean solicitudServicio) throws ServicioException;
    public String crearSolicitudCD(SolicitudServicioBean solicitudServicio) throws ServicioException;
}
