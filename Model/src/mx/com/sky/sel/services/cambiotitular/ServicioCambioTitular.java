package mx.com.sky.sel.services.cambiotitular;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultadatoscs.ConsultaDatosCS;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultadatoscs.ConsultadatoscsClientEp;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultadatoscs.types.MensajeInType;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultadatoscs.types.MensajeOutType;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultasolicitudservicio.ConsultaSolcitudesServicio;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultasolicitudservicio.ConsultaSolcitudesservicioClientEp;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultasolicitudservicio.Consulta_SolcitudesServicio_ptClient;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultasolicitudservicio.types.CTINType;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultasolicitudservicio.types.CTSSOut;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultasolicitudservicio.types.CTSSOutType;
import mx.com.sky.sel.services.beans.cambiotitular.DatosCS;
import mx.com.sky.sel.services.beans.solicitudcambiotitular.DetalleSolicitudCambioTitular;
import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.solicitudservicio.ServicioSolicituServicio;

public class ServicioCambioTitular implements Serializable {
    @SuppressWarnings("compatibility:-6495887545691906869")
    private static final long serialVersionUID = 9034716411777298006L;

    public ServicioCambioTitular() {
        super();
    }
    
    
    public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID) {
        List<DetalleSolicitudServicio> solicitudes;
        ServicioSolicituServicio sss = new ServicioSolicituServicio();
        solicitudes = sss.consultarSolicitudServicios(rowID, "Tramites", "Cambio de Titular");
        return solicitudes;
    }


    public List<DetalleSolicitudCambioTitular> obtenerSolicitudCambioTitular(String rowID) {
        List<DetalleSolicitudCambioTitular> solicitudes = new ArrayList<DetalleSolicitudCambioTitular>();
        DetalleSolicitudCambioTitular solicitud = null;
        ConsultaSolcitudesservicioClientEp consulta_solcitudesservicio_client_ep = null;
        ConsultaSolcitudesServicio consulta_SolcitudesServicio = null;
        CTINType payload;
        CTSSOut response = null;

        try {
            consulta_solcitudesservicio_client_ep = new ConsultaSolcitudesservicioClientEp();
            consulta_SolcitudesServicio = consulta_solcitudesservicio_client_ep.getConsultaSolcitudesServicioPt();
            
            payload = new CTINType();
            payload.setCuentaSKY(rowID);
            response = consulta_SolcitudesServicio.process(payload);

            if (response != null) {
                for (CTSSOutType ctssol : response.getSolicitudes()) {
                    solicitud = convert(ctssol);
                    solicitudes.add(solicitud);
                }
            }
        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }
        return solicitudes;
    }


    //******************************************************************

    public DatosCS obtenerDatosCS(String ctaSKY) {
        DatosCS datos = null;
        ConsultadatoscsClientEp consultadatoscs_client_ep;
        ConsultaDatosCS consultaDatosCS = null;
        MensajeInType payload = null;
        MensajeOutType response = null;


        if (ctaSKY == null || ctaSKY.isEmpty()) {
            return datos;
        }


        try {

            consultadatoscs_client_ep = new ConsultadatoscsClientEp();
            consultaDatosCS = consultadatoscs_client_ep.getConsultaDatosCSPt();
            payload = new MensajeInType();
            payload.setCUENTASKY(ctaSKY);
            response = consultaDatosCS.process(payload);

            if (response != null) {
                datos = convertCS(response);
            }
        } catch (Exception e) {
            LogServicios.printlnError(e);
        }
        return datos;
    }
    //******************************************************************

    public String crearSolicitud(SolicitudServicioBean solicitudServicio) throws ServicioException {
        ServicioSolicituServicio sss = new ServicioSolicituServicio();
        //Codigo para contratar canal
        String respuesta = "";
        LogPC.println(this, "crearSolicitud Cambio de Titular ");

        solicitudServicio.setArea("Tramites");
        solicitudServicio.setSubArea("Cambio de Titular");

        respuesta = sss.crearSolicitud(solicitudServicio);
        return respuesta;
    }


    private DetalleSolicitudCambioTitular convert(CTSSOutType sol) {
        DetalleSolicitudCambioTitular dsct = new DetalleSolicitudCambioTitular();
        dsct.setComentarios(sol.getCOMENTARIOS());
        dsct.setEstatus(sol.getESTATUS());
        dsct.setCuenta(sol.getCUENTA());
        dsct.setFechaSolicitud(sol.getFECHASOLICITUD());
        dsct.setNumSolicitud(sol.getSOLICITUD());
        dsct.setSubEstatus(sol.getSUBESTATUS());

        return dsct;
    }


    private DatosCS convertCS(MensajeOutType sol) {
        DatosCS dcs = new DatosCS();
        dcs.setActivacion(String.valueOf(sol.getCLIENTEDESDE()));
        dcs.setAddr(sol.getADDR());
        dcs.setAddr_name(sol.getADDRNAME());
        dcs.setAddr_num(sol.getADDRNUM());
        dcs.setCity(sol.getCITY());
        dcs.setCountry(sol.getCOUNTRY());
        dcs.setCounty(sol.getCOUNTY());
        dcs.setFormaDePago(sol.getFORMADEPAGO());
        dcs.setPaquete(sol.getPAQUETEACTUAL());
        dcs.setProvince(sol.getPROVINCE());
        dcs.setState(sol.getSTATE());
        dcs.setSuscriptor(sol.getSUSCRIPTOR());
        dcs.setZip_code(sol.getZIPCODE());
        dcs.setUbicado();

        return dcs;
    }
    
    
}
