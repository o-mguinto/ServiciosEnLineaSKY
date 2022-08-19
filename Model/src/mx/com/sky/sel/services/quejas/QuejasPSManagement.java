package mx.com.sky.sel.services.quejas;

import javax.ejb.Remote;

import mx.com.sky.sel.services.beans.solicitudservicio.Queja;
import java.util.List;

import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.exception.ServicioException;

@Remote
public interface QuejasPSManagement {
    public List<Queja> consultarQuejas(String uid) throws ServicioException;
    public String agregarQueja(String uid, String queja, SolicitudServicioBean ssBean) throws ServicioException;
}
