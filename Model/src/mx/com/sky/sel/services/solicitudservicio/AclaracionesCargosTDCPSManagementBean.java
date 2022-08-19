package mx.com.sky.sel.services.solicitudservicio;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;

@Stateless(name = "AclaracionesCargosTDCPSManagement", mappedName = "SEL-AclaracionesCargosTDCPSManagement")
public class AclaracionesCargosTDCPSManagementBean implements Serializable, AclaracionesCargosTDCPSManagement,
                                                              AclaracionesCargosTDCPSManagementLocal {
    @SuppressWarnings("compatibility:984147492512346633")
    private static final long serialVersionUID = -1903754038865311481L;
    @Resource
    SessionContext sessionContext;

    public AclaracionesCargosTDCPSManagementBean() {
    }

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID) {
        List<DetalleSolicitudServicio> SldServicio = null;
        IServicio sr = null;
        sr = new ServicioCargosTDC();
        SldServicio = sr.obtenerSolicitudServicio(rowID);
        if (SldServicio == null) {
            SldServicio = new ArrayList<DetalleSolicitudServicio>();
        }
        return SldServicio;
    }
}
