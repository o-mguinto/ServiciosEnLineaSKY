package mx.com.sky.sel.services.quejas;

import java.io.Serializable;

import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.services.beans.solicitudservicio.Queja;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.solicitudservicio.ServicioOtros;
import mx.com.sky.sel.services.solicitudservicio.ServicioQuejas;

@Stateless(name = "QuejasPSManagement", mappedName = "SEL-QuejasPSManagement")
public class QuejasPSManagementBean implements Serializable, QuejasPSManagement, QuejasPSManagementLocal {
    @SuppressWarnings("compatibility:-2051445253090079287")
    private static final long serialVersionUID = 7261147702522454487L;
    @Resource
    SessionContext sessionContext;

    public QuejasPSManagementBean() {
    }

    @Override
    public List<Queja> consultarQuejas(String uid) throws ServicioException {
        ServicioQuejas sq = new ServicioQuejas();
        List<Queja> quejas = null;
        try {
            quejas = sq.consultarQuejas(uid);
        } catch (ServicioException e) {
            e.printStackTrace();
            throw e;
        }
        return quejas;
    }

    @Override
    public String agregarQueja(String uid, String queja, SolicitudServicioBean ssBean) throws ServicioException {
        String respuesta = null;
        ServicioQuejas sq = new ServicioQuejas();
        String numeroSS = null;
        try {
            numeroSS = crearSolicitud(queja, ssBean);
            sq.agregarQueja(uid, queja, numeroSS);
            
        } catch (ServicioException e) {
            e.printStackTrace();
            throw e;
        }
        return respuesta;
    }
    
    private String crearSolicitud(String queja, SolicitudServicioBean ssBean) throws ServicioException {
        ServicioOtros so = new ServicioOtros();
        String numeroSS = null;
        numeroSS = so.crearSolicitud(ssBean);
       return numeroSS;
    }
}
