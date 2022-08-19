package mx.com.sky.sel.services.portabilidad;

import java.util.List;

import javax.ejb.Remote;

import mx.com.sky.sel.services.beans.portabilidad.Companias;
import mx.com.sky.sel.services.beans.portabilidad.PortabilidadBean;
import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;

@Remote
public interface ServicioPortabilidadPSManagement {
    public List<DetalleSolicitudServicio> obtenerSolicitudesPortabilidad(String rowID);
    public String solicitarPortabilidad(PortabilidadBean datosPortabilidad);
    public List<Companias> obtenerOperadoresDonantes();
}
