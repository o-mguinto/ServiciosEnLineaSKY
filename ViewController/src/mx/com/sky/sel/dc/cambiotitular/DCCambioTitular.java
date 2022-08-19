package mx.com.sky.sel.dc.cambiotitular;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import mx.com.sky.sel.services.beans.solicitudcambiotitular.DetalleSolicitudCambioTitular;
import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import mx.com.sky.sel.services.cambiotitular.ServicioCambioTitular;

public class DCCambioTitular implements Serializable {
    @SuppressWarnings("compatibility:7878847900441103300")
    private static final long serialVersionUID = -3774276975013099022L;

    public DCCambioTitular() {
        super();
    }
    
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
