package mx.com.sky.sel.services.solicitudservicio;

import javax.ejb.Local;
import java.util.List;
import mx.com.sky.sel.services.beans.solicitudservicio.Sugerencia;
import mx.com.sky.sel.services.exception.ServicioException;

@Local
public interface SolicitudOtrosServiciosPSManagementLocal {
    public List<Sugerencia> obtenerSolicitudServicio(String uid) throws ServicioException;
}
