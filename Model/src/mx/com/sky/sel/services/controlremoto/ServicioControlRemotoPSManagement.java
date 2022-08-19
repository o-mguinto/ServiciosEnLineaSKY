package mx.com.sky.sel.services.controlremoto;

import java.util.List;

import javax.ejb.Remote;

import mx.com.sky.sel.services.beans.controlremoto.ControlRemotoBean;
import mx.com.sky.sel.services.beans.controlremoto.DireccionCR;
import mx.com.sky.sel.services.beans.controlremoto.Region;
import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.exception.ServicioException;

@Remote
public interface ServicioControlRemotoPSManagement {
    public List<Region> consultarRegiones(String organizationId);
    public List<DireccionCR> consultarDirecciones(String regionID);
    public List<ControlRemotoBean> obtenerControlRemoto(String organizationID, String tipoCuenta, boolean equipoHD, String rowID);
    public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID);
    public String crearSolicitud(SolicitudServicioBean solicitudServicio) throws ServicioException;
}
