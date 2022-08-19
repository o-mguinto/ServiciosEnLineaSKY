package mx.com.sky.sel.dc.controlremoto;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import mx.com.sky.sel.services.beans.controlremoto.ControlRemotoBean;
import mx.com.sky.sel.services.beans.controlremoto.DireccionCR;
import mx.com.sky.sel.services.beans.controlremoto.Region;
import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.services.controlremoto.ServicioControlRemotoPSManagementBean;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

public class DCControlRemoto implements Serializable {
    @SuppressWarnings("compatibility:2385375579248586369")
    private static final long serialVersionUID = -7841015916410084493L;

    public DCControlRemoto() {
        LogPC.println(this, "DCControlRemoto()");
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_CONTROL_REMOTO);
    }


    public List<ControlRemotoBean> obtenerControlRemoto(String organizationID, String tipoCuenta, boolean equipoHD) {
        LogPC.println(this, "Consulta de obtenerControlRemoto");
        List<ControlRemotoBean> controles = null;
        ServicioControlRemotoPSManagementBean scr = null;
        scr = new ServicioControlRemotoPSManagementBean();
        LogPC.println(this, "Consulta de control Remoto ");
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_CONTROL_REMOTO);
        LogPC.println(this, "ORGANIZACION ID DE LA CUENTA========"+organizationID);
        LogPC.println(this, "TIPO DE LA CUENTA ==============="+tipoCuenta);
        LogPC.println(this, "EQUIPO HD DE LA CUENTA=============="+equipoHD);
        controles = scr.obtenerControlRemoto(organizationID, tipoCuenta, equipoHD, "");
        if (controles == null) {
            controles = new ArrayList<ControlRemotoBean>();
        }
        return controles;
    }

    public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID) {
        List<DetalleSolicitudServicio> SldServicio = null;
        ServicioControlRemotoPSManagementBean scr = null;
        scr = new ServicioControlRemotoPSManagementBean();
        SldServicio = scr.obtenerSolicitudServicio(rowID);
        if (SldServicio == null) {
            SldServicio = new ArrayList<DetalleSolicitudServicio>();
        }
        return SldServicio;
    }

    /**
     * Consulta las regiones
     * @param organizationId
     * @return
     */
    public List<Region> consultarRegiones(String organizationId) {
        ServicioControlRemotoPSManagementBean scr = null;
        scr = new ServicioControlRemotoPSManagementBean();
        List<Region> regiones = scr.consultarRegiones(organizationId);
        if (regiones == null) {
            LogPC.printlnWarn(this, "regiones null");
            regiones = new ArrayList<Region>();
        }

        return regiones;
    }

    /**
     * Consultar direcciones
     * @param regionID
     * @return
     */
    public List<DireccionCR> consultarDirecciones(String regionID) {
        ServicioControlRemotoPSManagementBean scr = null;
        scr = new ServicioControlRemotoPSManagementBean();
        List<DireccionCR> direcciones = scr.consultarDirecciones(regionID);
        if (direcciones == null) {
            LogPC.printlnWarn(this, "direcciones null");
            direcciones = new ArrayList<DireccionCR>();
        }
        return direcciones;
    }
}
