package mx.com.sky.sel.services.solicitudservicio;

import javax.ejb.Remote;
import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import java.util.List;

@Remote
public interface AclaracionesCargosTDCPSManagement {
    public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID);
}
