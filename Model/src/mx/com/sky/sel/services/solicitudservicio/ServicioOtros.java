package mx.com.sky.sel.services.solicitudservicio;

import java.io.Serializable;

import java.util.List;

import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.exception.ServicioException;

public class ServicioOtros implements IServicio, Serializable {
    private static final long serialVersionUID = 1L;

    public ServicioOtros() {
        super();
    }

    @Override
    public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID) {
        List<DetalleSolicitudServicio> solicitudes;
        ServicioSolicituServicio sss = new ServicioSolicituServicio();
        solicitudes = sss.consultarSolicitudServicios(rowID, "Web", "Otros servicios");
        return solicitudes;
    }

    @Override
    public String crearSolicitud(SolicitudServicioBean solicitudServicio) throws ServicioException {
        ServicioSolicituServicio sss = new ServicioSolicituServicio();
        //Codigo para contratar canal
        String respuesta = "";

        solicitudServicio.setArea("Web");
        solicitudServicio.setSubArea("Otros servicios");

        respuesta = sss.crearSolicitud(solicitudServicio);
        return respuesta;
    }
}
