package mx.com.sky.sel.services.revista;

import java.io.Serializable;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import java.util.List;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import javax.xml.ws.Holder;

import javax.xml.ws.WebServiceRef;

import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.solicitudservicio.ServicioSolicituServicio;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultarevistasky.ConsultaRevistaSKY;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultarevistasky.ConsultarevistaskyClientEp;
@Stateless(name = "ServicioRevistaPSManagement", mappedName = "SEL-ServicioRevistaPSManagement")
public class ServicioRevistaPSManagementBean implements Serializable, ServicioRevistaPSManagement, ServicioRevistaPSManagementLocal {
    @SuppressWarnings("compatibility:-984245242546474036")
    private static final long serialVersionUID = 7766448813517143242L;
    private static final String AREASS = "Revista";
    private static final String SUBAREASS = "Reactivacion de Revista";
    @Resource
    SessionContext sessionContext;
    
    @WebServiceRef
    ConsultarevistaskyClientEp consultarevistasky_client_ep;

    public ServicioRevistaPSManagementBean() {
        LogServicios.println(this, "DCRevista Creado");
    }
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID) {
        List<DetalleSolicitudServicio> solicitudes;
        ServicioSolicituServicio sss = new ServicioSolicituServicio();
        solicitudes = sss.consultarSolicitudServicios(rowID, AREASS, SUBAREASS);
        return solicitudes;
    }
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public String crearSolicitud(SolicitudServicioBean solicitudServicio) throws ServicioException {
        ServicioSolicituServicio sss = new ServicioSolicituServicio();
        //Codigo para contratar canal
        String respuesta = "";

        solicitudServicio.setArea(AREASS);
        solicitudServicio.setSubArea(SUBAREASS);

        respuesta = sss.crearSolicitud(solicitudServicio);
        return respuesta;
    }
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public boolean revistaContratada(String cuenta) {
        ConsultaRevistaSKY consultaRevistaSKY = null;
        consultarevistasky_client_ep = null;

        try {
            consultarevistasky_client_ep = new ConsultarevistaskyClientEp();
            consultaRevistaSKY = consultarevistasky_client_ep.getConsultaRevistaSKYPt();
            Holder<String> revistaSKY = new Holder<String>();
            Holder<String> resultado = new Holder<String>();
            Holder<String> resultadodesc = new Holder<String>();
            Holder<String> claseDeCuenta = new Holder<String>();
            Holder<String> statusCuenta = new Holder<String>();
            consultaRevistaSKY.process(cuenta, resultado, resultadodesc, revistaSKY, claseDeCuenta, statusCuenta);

            if ((resultado != null) && (resultado.value.equalsIgnoreCase("0"))) {
                if (revistaSKY.value.equalsIgnoreCase("0")) {
                    return false;
                } else
                    return true;
            }

        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }
        return false;
    }

}
