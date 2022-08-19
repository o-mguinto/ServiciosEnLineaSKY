package mx.com.sky.sel.services.stcd;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.solicitudservicio.ServicioSolicituServicio;

@Stateless(name = "ServicioSTCDPSManagement", mappedName = "SKY-ServicioSTCDPSManagement")
public class ServicioSTCDPSManagementBean implements Serializable, ServicioSTCDPSManagement, ServicioSTCDPSManagementLocal {
    @SuppressWarnings("compatibility:532794473132908559")
    private static final long serialVersionUID = 8260071652376126271L;
    @Resource
    SessionContext sessionContext;
    
        private static final String AREASS = "Reparaciones";
        private static final String SUBAREASS = "Servicio Web";
        
    public ServicioSTCDPSManagementBean() {
        super();
    }
        @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID) {
        List<DetalleSolicitudServicio> solicitudes;
        ServicioSolicituServicio sss = new ServicioSolicituServicio();
        solicitudes = sss.consultarSolicitudServicios(rowID, AREASS, SUBAREASS);
        if (solicitudes == null){
            LogServicios.println(this, "SldServicio null");
            solicitudes = new ArrayList<DetalleSolicitudServicio>();
        }
        
        return solicitudes;
    }
    
        @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public String crearSolicitudST(SolicitudServicioBean solicitudServicio) throws ServicioException {
        ServicioSolicituServicio sss = new ServicioSolicituServicio();
        //Codigo para contratar canal
        String respuesta = "";

        solicitudServicio.setArea(AREASS);
        solicitudServicio.setSubArea(SUBAREASS);

        respuesta = sss.crearSolicitud(solicitudServicio);
        return respuesta;
    }
    
        @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public String crearSolicitudCD(SolicitudServicioBean solicitudServicio) throws ServicioException {
        ServicioSolicituServicio sss = new ServicioSolicituServicio();
        //Codigo para contratar canal
        String respuesta = "";

        solicitudServicio.setArea(AREASS);
        solicitudServicio.setSubArea("Cambio de Domicilio");

        respuesta = sss.crearSolicitud(solicitudServicio);
        return respuesta;
    }
    }

