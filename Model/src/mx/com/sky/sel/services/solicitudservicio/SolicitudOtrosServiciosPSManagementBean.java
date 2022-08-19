package mx.com.sky.sel.services.solicitudservicio;

import java.io.Serializable;

import java.util.List;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.sky.sel.services.beans.solicitudservicio.Queja;
import mx.com.sky.sel.services.beans.solicitudservicio.Sugerencia;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.sugerencias.ServicioSugerencias;

@Stateless(name = "SolicitudOtrosServiciosPSManagement", mappedName = "SEL-SolicitudOtrosServiciosPSManagement")
public class SolicitudOtrosServiciosPSManagementBean implements Serializable, SolicitudOtrosServiciosPSManagement,
                                                                SolicitudOtrosServiciosPSManagementLocal {
    @SuppressWarnings("compatibility:-4268901629866080075")
    private static final long serialVersionUID = 5773118474397358408L;
    @Resource
    SessionContext sessionContext;

    public SolicitudOtrosServiciosPSManagementBean() {
    }
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Sugerencia> obtenerSolicitudServicio(String uid) throws ServicioException {
        ServicioSugerencias listSugerencias = new ServicioSugerencias();
        ServicioQuejas listQuejas = new ServicioQuejas();
        List<Queja> quejas = null;
        List<Sugerencia> sugerencias= null;
        Sugerencia sugerenciaQuejas = null;
        sugerencias = listSugerencias.consultarSugerencias(uid);
        quejas = listQuejas.consultarQuejas(uid);
        if (quejas != null) {
            for (Queja queja : quejas) {
                sugerenciaQuejas = new Sugerencia();
                sugerenciaQuejas.setFechaRegistro(queja.getFechaRegistro());
                sugerenciaQuejas.setNumero_ss(queja.getNumero_ss());
                sugerenciaQuejas.setSugerencia(queja.getQueja());
                sugerencias.add(sugerenciaQuejas);
            }
        }
        return sugerencias;
    }
}
