package mx.com.sky.sel.services.cambiotitular;

import java.util.List;

import javax.ejb.Local;

import mx.com.sky.sel.services.beans.solicitudcambiotitular.DetalleSolicitudCambioTitular;
import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;

@Local
public interface ServicioCambioTitularPSManagementLocal {
    public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID);
    public List<DetalleSolicitudCambioTitular> obtenerSolicitudCambioTitular(String rowID);
}
