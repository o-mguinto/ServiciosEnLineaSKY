package mx.com.sky.sel.services.beans.seguroequipo;

import java.util.List;

import javax.ejb.Local;

import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;

@Local
public interface ServicioSeguroEquipoPSManagementLocal {
    public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID);
}
