package mx.com.sky.sel.services.solicitudservicio;

import java.util.List;

import javax.ejb.Remote;

import mx.com.sky.sel.services.beans.solicitudservicio.Sugerencia;
import mx.com.sky.sel.services.exception.ServicioException;

@Remote
public interface SolicitudOtrosServiciosPSManagement {
    public List<Sugerencia> obtenerSolicitudServicio(String uid) throws ServicioException;
}
