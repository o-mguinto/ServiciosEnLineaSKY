package mx.com.sky.sel.services.utils;
import java.io.Serializable;

import mx.com.sky.sel.services.beans.cambiopaquete.Paquete;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.utils.JSFUtils;

public class SolicitudServicioUtils implements Serializable {
    @SuppressWarnings("compatibility:-2559524956832017205")
    private static final long serialVersionUID = -1038558537018158011L;

    public SolicitudServicioUtils() {
        super();
    }

    public static SolicitudServicioBean convert(SolicitudServicioBean solicitudServicio, String descripcion) {
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String contactoRowId = sesion.getSuscriptor().getContactoRowId();
        String tipoCuenta = sesion.getUserRole();
        String nombreSuscriptor = sesion.getSuscriptor().getNombreSuscriptor();
        String cuentaSKY = sesion.getSuscriptor().getCuentaSKY();
        String paqueteActual = sesion.getSuscriptor().getPaquete();
        String pais = sesion.getSuscriptor().getPais();
        //se agrega idSesion
        String idSesion=sesion.getIdSesion();

        Paquete contratacionServicios;

        if (solicitudServicio == null) {
            solicitudServicio = new SolicitudServicioBean();
        }

        contratacionServicios = new Paquete();
        contratacionServicios.setPaqueteActual(paqueteActual);
        solicitudServicio.setContactoRowId(contactoRowId);
        solicitudServicio.setNombreSuscriptor(nombreSuscriptor);
        solicitudServicio.setCuenta(cuentaSKY);
        solicitudServicio.setPais(pais);
        solicitudServicio.setTipoCuenta(tipoCuenta);
        solicitudServicio.setStatus("Abierto");
        solicitudServicio.setDescripcion(descripcion);
        solicitudServicio.setCorreoElectronico(sesion.getUsuario().getMail());
        solicitudServicio.setContratacionServicios(contratacionServicios);
        solicitudServicio.setSistema(sesion.getSistema());
        //se agrega idSesion
        solicitudServicio.setIdSesion(idSesion);

        return solicitudServicio;
    }

    public static SolicitudServicioBean convert(SolicitudServicioBean solicitudServicio) {
        return convert(solicitudServicio, "");
    }
}
