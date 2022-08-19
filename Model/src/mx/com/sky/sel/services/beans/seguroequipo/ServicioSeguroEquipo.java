package mx.com.sky.sel.services.beans.seguroequipo;

import java.io.Serializable;
import java.util.List;

import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.solicitudservicio.ServicioSolicituServicio;


public class ServicioSeguroEquipo implements Serializable {

    private static final long serialVersionUID = 1L;

    public ServicioSeguroEquipo() {
        super();
    }

    public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID) {
        List<DetalleSolicitudServicio> solicitudes;
        ServicioSolicituServicio sss = new ServicioSolicituServicio();
        solicitudes = sss.consultarSolicitudServicios(rowID, "Tramites", "Seguro de Equipo");
        return solicitudes;
    }

    public String crearSolicitud(SolicitudServicioBean solicitudServicio) throws ServicioException {
        ServicioSolicituServicio sss = new ServicioSolicituServicio();
        String respuesta = "";

        solicitudServicio.setArea("Tramites");
        solicitudServicio.setSubArea("Seguro de Equipo");

        respuesta = sss.crearSolicitud(solicitudServicio);
        return respuesta;
    }
}
