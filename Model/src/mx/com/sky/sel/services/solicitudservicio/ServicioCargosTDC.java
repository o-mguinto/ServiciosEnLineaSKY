package mx.com.sky.sel.services.solicitudservicio;

import java.io.Serializable;

import java.util.Collections;
import java.util.List;

import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.exception.ServicioException;

public class ServicioCargosTDC implements IServicio, Serializable {
    public ServicioCargosTDC() {
        super();
    }

    @Override
    public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID) {
        List<DetalleSolicitudServicio> solicitudes;
        ServicioSolicituServicio sss = new ServicioSolicituServicio();
        solicitudes = sss.consultarSolicitudServicios(rowID, "Aclaracion de Pagos", "Cargo no Reconocido a TC");
        return solicitudes;
    }

    @Override
    public String crearSolicitud(SolicitudServicioBean solicitudServicio) throws ServicioException {
        ServicioSolicituServicio sss = new ServicioSolicituServicio();
        String respuesta = "";

        solicitudServicio.setArea("Aclaracion de Pagos");
        solicitudServicio.setSubArea("Cargo no Reconocido a TC");

        respuesta = sss.crearSolicitud(solicitudServicio);
        return respuesta;
    }
}
