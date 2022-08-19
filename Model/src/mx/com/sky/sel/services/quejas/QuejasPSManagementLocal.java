package mx.com.sky.sel.services.quejas;

import java.util.List;

import javax.ejb.Local;

import mx.com.sky.sel.services.beans.solicitudservicio.Queja;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.exception.ServicioException;

@Local
public interface QuejasPSManagementLocal {
    public List<Queja> consultarQuejas(String uid) throws ServicioException;
    public String agregarQueja(String uid, String queja, SolicitudServicioBean ssBean) throws ServicioException;
}
