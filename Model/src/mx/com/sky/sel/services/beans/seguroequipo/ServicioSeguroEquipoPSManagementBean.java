package mx.com.sky.sel.services.beans.seguroequipo;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;

@Stateless(name = "ServicioSeguroEquipoPSManagement", mappedName = "SEL-ServicioSeguroEquipoPSManagement")
public class ServicioSeguroEquipoPSManagementBean implements Serializable, ServicioSeguroEquipoPSManagement,
                                                             ServicioSeguroEquipoPSManagementLocal {
    @SuppressWarnings("compatibility:-3371240232817702290")
    private static final long serialVersionUID = -7686817684510554720L;
    @Resource
    SessionContext sessionContext;

    public ServicioSeguroEquipoPSManagementBean() {
    }
    public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID) {
        List<DetalleSolicitudServicio> SldServicio = null;
        ServicioSeguroEquipo sr = null;
        sr = new ServicioSeguroEquipo();
        SldServicio = sr.obtenerSolicitudServicio(rowID);
        if (SldServicio == null) {
            LogPC.println(this, "SldServicio null");
            SldServicio = new ArrayList<DetalleSolicitudServicio>();
        }
        return SldServicio;
    }
}
