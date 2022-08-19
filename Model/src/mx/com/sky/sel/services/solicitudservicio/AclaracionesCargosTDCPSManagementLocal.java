package mx.com.sky.sel.services.solicitudservicio;

import javax.ejb.Local;
import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import java.util.List;

@Local
public interface AclaracionesCargosTDCPSManagementLocal {
    public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID);
}
