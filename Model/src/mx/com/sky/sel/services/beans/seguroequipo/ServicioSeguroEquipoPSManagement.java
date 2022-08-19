package mx.com.sky.sel.services.beans.seguroequipo;

import java.util.List;

import javax.ejb.Remote;

import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;

@Remote
public interface ServicioSeguroEquipoPSManagement {
    public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID);
}
