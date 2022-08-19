package mx.com.sky.sel.dc.cambiopaquete;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import mx.com.sky.sel.services.beans.cambiopaquete.Paquete;
import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.services.cambiopaquete.ServicioCambioPaquete;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

public class DCCambioPaquete implements Serializable  {
    @SuppressWarnings("compatibility:8571177021982484583")
    private static final long serialVersionUID = -4532214169069694172L;

    public DCCambioPaquete() {
    }

    public List<Paquete> obtenerPaquetes(String paqueteActual, String codigoPais, String tipoCuenta, String paisISO, String ctaSKY, String sistema) {
        List<Paquete> paquetes = null;
        ServicioCambioPaquete scp = null;
        scp = new ServicioCambioPaquete();
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_PAQUETES);
        paquetes = scp.obtenerPaquetes(paqueteActual.trim(), codigoPais, tipoCuenta, ctaSKY, paisISO, sistema);
        if (paquetes == null) {
            paquetes = new ArrayList<Paquete>();
        }
        return paquetes;
    }

    public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID) {
        List<DetalleSolicitudServicio> SldServicio = null;
        ServicioCambioPaquete scp = null;
        scp = new ServicioCambioPaquete();
        SldServicio = scp.obtenerSolicitudServicio(rowID);
        if (SldServicio == null) {
            SldServicio = new ArrayList<DetalleSolicitudServicio>();
        }
        return SldServicio;
    }

    public List<Paquete> obtenerPaquetesPorPais(String id_Pais) {
        ServicioCambioPaquete scp = null;
        scp = new ServicioCambioPaquete();
        return scp.obtenerPaquetesPorPais(id_Pais);
    }

    public List<Paquete> obtenerPaquetesCR() {
        ServicioCambioPaquete scp = null;
        String id_Pais = "2";
        scp = new ServicioCambioPaquete();
        return scp.obtenerPaquetesPorPais(id_Pais);
    }

    public List<Paquete> obtenerPaquetesDO() {
        ServicioCambioPaquete scp = null;
        String id_Pais = "7";
        scp = new ServicioCambioPaquete();
        return scp.obtenerPaquetesPorPais(id_Pais);
    }

    public List<Paquete> obtenerPaquetesGT() {
        ServicioCambioPaquete scp = null;
        String id_Pais = "3";
        scp = new ServicioCambioPaquete();
        return scp.obtenerPaquetesPorPais(id_Pais);
    }


    public List<Paquete> obtenerPaquetesHN() {
        ServicioCambioPaquete scp = null;
        String id_Pais = "4";
        scp = new ServicioCambioPaquete();
        return scp.obtenerPaquetesPorPais(id_Pais);
    }

    public List<Paquete> obtenerPaquetesMX() {
        ServicioCambioPaquete scp = null;
        String id_Pais = "1";
        scp = new ServicioCambioPaquete();
        return scp.obtenerPaquetesPorPais(id_Pais);
    }

    public List<Paquete> obtenerPaquetesNI() {
        ServicioCambioPaquete scp = null;
        String id_Pais = "5";
        scp = new ServicioCambioPaquete();
        return scp.obtenerPaquetesPorPais(id_Pais);
    }

    public List<Paquete> obtenerPaquetesPA() {
        ServicioCambioPaquete scp = null;
        String id_Pais = "6";
        scp = new ServicioCambioPaquete();
        return scp.obtenerPaquetesPorPais(id_Pais);
    }

    public List<Paquete> obtenerPaquetesSV() {
        ServicioCambioPaquete scp = null;
        String id_Pais = "8";
        scp = new ServicioCambioPaquete();
        return scp.obtenerPaquetesPorPais(id_Pais);
    }


    }