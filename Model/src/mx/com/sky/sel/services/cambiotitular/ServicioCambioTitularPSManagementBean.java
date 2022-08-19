package mx.com.sky.sel.services.cambiotitular;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.sky.sel.services.beans.solicitudcambiotitular.DetalleSolicitudCambioTitular;
import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;

@Stateless(name = "ServicioCambioTitularPSManagement", mappedName = "SEL-ServicioCambioTitularPSManagement")
public class ServicioCambioTitularPSManagementBean implements Serializable, ServicioCambioTitularPSManagement,
                                                              ServicioCambioTitularPSManagementLocal {
    @SuppressWarnings("compatibility:-4292941540204346657")
    private static final long serialVersionUID = 4412380228708736598L;
    @Resource
    SessionContext sessionContext;

    public ServicioCambioTitularPSManagementBean() {
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID) {
        List<DetalleSolicitudServicio> SldServicio = null;
        ServicioCambioTitular sr = null;
        sr = new ServicioCambioTitular();
        SldServicio = sr.obtenerSolicitudServicio(rowID);
        if (SldServicio == null) {
            SldServicio = new ArrayList<DetalleSolicitudServicio>();
        }
        return SldServicio;
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<DetalleSolicitudCambioTitular> obtenerSolicitudCambioTitular(String rowID) {
        List<DetalleSolicitudCambioTitular> slct = null;
        ServicioCambioTitular sct = null;
        sct = new ServicioCambioTitular();
        slct = sct.obtenerSolicitudCambioTitular(rowID);
        if (slct == null) {
            slct = new ArrayList<DetalleSolicitudCambioTitular>();
        }
        return slct;
    }
}
