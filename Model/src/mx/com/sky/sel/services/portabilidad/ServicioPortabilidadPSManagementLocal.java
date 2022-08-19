package mx.com.sky.sel.services.portabilidad;

import java.util.List;

import javax.ejb.Local;

import mx.com.sky.sel.services.beans.portabilidad.Companias;
import mx.com.sky.sel.services.beans.portabilidad.PortabilidadBean;
import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;

@Local
public interface ServicioPortabilidadPSManagementLocal {
    public List<DetalleSolicitudServicio> obtenerSolicitudesPortabilidad(String rowID);
    public String solicitarPortabilidad(PortabilidadBean datosPortabilidad);
    public List<Companias> obtenerOperadoresDonantes();
}
