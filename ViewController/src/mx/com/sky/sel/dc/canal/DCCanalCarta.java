package mx.com.sky.sel.dc.canal;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import mx.com.sky.sel.services.beans.canal.CanalCarta;
import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import mx.com.sky.sel.services.beans.utils.Suscriptor;
import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.services.canal.ServicioCanalPSManagementBean;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.exception.ServicioException;

public class DCCanalCarta implements Serializable {
    @SuppressWarnings("compatibility:5451036631045283180")
    private static final long serialVersionUID = -3413200341642661909L;

    public DCCanalCarta() {
        super();
    }
    public List<CanalCarta> obtenerCanalCarta(String paquete,
                                              String tipoCuenta,
                                              String categoria) {
        List<CanalCarta> canales = null;
        ServicioCanalPSManagementBean sc = null;
        sc = new ServicioCanalPSManagementBean();
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        Suscriptor suscriptor = sesion.getSuscriptor();
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_CAC);
        canales =
                sc.obtenerCanalCarta(paquete.trim(), tipoCuenta, suscriptor.isEquipoHD(),
                                     categoria);
        if (canales == null) {
            canales = new ArrayList<CanalCarta>();
        } else {
            for (CanalCarta canalCarta : canales) {
                if (canalCarta.getNombre().equalsIgnoreCase("BASICO SKYSPORTS")) {
                    if ((!sesion.getSuscriptor().getOrganizationType().equalsIgnoreCase("Direct To Home")) &&
                        (!sesion.getSuscriptor().getPais().equalsIgnoreCase("MEX")) &&
                        (!sesion.getSuscriptor().getPaquete().equalsIgnoreCase("BASICO"))) {
                         canales.remove(canalCarta);
                    }
                }else if (canalCarta.getNombre().contains("Mundial Total SKY")) {
                    if (sc.consultaMundialActivo(suscriptor.getCuentaSKY(), suscriptor.getMarketType())) {
                        canales.remove(canalCarta);
                        if (canales.size() <= 0) {
                              canales = new ArrayList<CanalCarta>();
                              break;
                        }
                    } else if (!sesion.isUserComercial() && !sesion.isUserResidencia()) {
                        canales.remove(canalCarta);
                        if (canales.size() <= 0) {
                              canales = new ArrayList<CanalCarta>();
                              break;
                        }   
                    }
                }
            }
        }
        return canales;
    } 

    public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID, boolean isStreaming){
        List<DetalleSolicitudServicio> SldServicio = null;
        ServicioCanalPSManagementBean sc = null;
        sc = new ServicioCanalPSManagementBean();
        SldServicio = sc.obtenerSolicitudServicio(rowID, isStreaming);
        if (SldServicio == null) {
            SldServicio = new ArrayList<DetalleSolicitudServicio>();
        }
        return SldServicio;
    }
    
    public String crearSolicitud(SolicitudServicioBean solicitudServicio) throws ServicioException {
        ServicioCanalPSManagementBean sc = new ServicioCanalPSManagementBean();
    
        return sc.crearSolicitud(solicitudServicio);
    }
    
    public String contratarServicioStreaming(String cuenta, String producto, String assetNumber, String secondAssetNumber){
        ServicioCanalPSManagementBean servicioCAC = new ServicioCanalPSManagementBean();
        String response = servicioCAC.contratarServicioStreaming(cuenta, producto, assetNumber, secondAssetNumber);
        System.out.println("SS DCCanalCarta " + response);
        return response;
    }
}

