package mx.com.sky.sel.services.ti;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import mx.com.sky.sel.proxyclients.pagwebconsultas.consultatiirdprincipal.ConsultaTIIRDPrincipal;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultatiirdprincipal.ConsultatiIrdPrincipalClientEp;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultatiird.types.ConsultaTIIRDProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultatiird.types.ConsultaTIIRDProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultatiird.ConsultaTIIRD;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultatiird.ConsultaTIIRD_Service;
import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.beans.utils.TarjetaInteligente;
import mx.com.sky.sel.services.beans.utils.TarjetaInteligenteIRD;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.services.solicitudservicio.ServicioSolicituServicio;

public class SerivcioTarjetaInteligente implements Serializable {
    @SuppressWarnings("compatibility:1579631517048723719")
    private static final long serialVersionUID = 2667852327750836695L;

    public SerivcioTarjetaInteligente() {
        super();
    }

    public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID) {
        List<DetalleSolicitudServicio> solicitudes;
        ServicioSolicituServicio sss = new ServicioSolicituServicio();
        solicitudes = sss.consultarSolicitudServicios(rowID, "Tramites", "Tarjeta Inteligente");
        return solicitudes;
    }

    public List<TarjetaInteligente> getTarjetaInteligente(String rowID) {
        List<TarjetaInteligente> smartCards = null;
        TarjetaInteligente smartCard = null;
        ConsultaTIIRD_Service ConsultaTIIRD_Service;
        ConsultaTIIRD ConsultaTIIRD = null;
        ConsultaTIIRDProcessRequest payload = null;
        ConsultaTIIRDProcessResponse respuesta = null;

        System.out.println("++++ rowID: "+ rowID);
        smartCards = new ArrayList<TarjetaInteligente>();
        if (rowID == null || rowID.isEmpty()) {
            return smartCards;
        }
        try {


            ConsultaTIIRD_Service = new ConsultaTIIRD_Service();
            ConsultaTIIRD = ConsultaTIIRD_Service.getConsultaTIIRD();
            payload = new ConsultaTIIRDProcessRequest();
            payload.setRowID(rowID);
            System.out.println("++++----- obteniendo tarjetas -----");
            respuesta = ConsultaTIIRD.process(payload);
            System.out.println("++++ tarjetas "+payload.toString());
            if (respuesta != null) {
                for (ConsultaTIIRDProcessResponse.Tarjeta tarjeta : respuesta.getTarjeta()) {
                    smartCard = convertTarjetaToTarjetaInteligente(tarjeta);
                    smartCards.add(smartCard);
                }
            }
        } catch (Exception e) {
            LogServicios.printlnError(e);
        }
        return smartCards;
    }

    public List<String> getIRDConcatenado(String rowID) {
        List<String> irds = new ArrayList<String>();
        List<TarjetaInteligente> tarjetasI = null;
        tarjetasI = getTarjetaInteligente(rowID);
        for (TarjetaInteligente tarjetaInteligente : tarjetasI) {
            System.out.println("*****++++++ JAMM tarjetaInteligente.getTarjetaInteligente(): "+ tarjetaInteligente.getTarjetaInteligente());
            System.out.println("*****++++++ JAMM tarjetaInteligente.getIrd(): "+ tarjetaInteligente.getIrd());
            if( tarjetaInteligente.getIrd() != null && !tarjetaInteligente.getIrd().isEmpty() &&
                tarjetaInteligente.getIrd().length() >= 6 ) {
                irds.add(tarjetaInteligente.getIrd().substring(0, 6));
            }
        }
        return irds;

    }

    //***************************

    public TarjetaInteligenteIRD getTarjetaInteligenteIRD(String ctaSKY) {
        TarjetaInteligenteIRD smartCard = null;
        ConsultatiIrdPrincipalClientEp ConsultatiIrdPrincipalClientEp;
        ConsultaTIIRDPrincipal ConsultaTIIRDPrincipal = null;
        mx.com.sky.sel.proxyclients.pagwebconsultas.consultatiirdprincipal.types.CTINType payload = null;
        mx.com.sky.sel.proxyclients.pagwebconsultas.consultatiirdprincipal.types.CTOutType response = null;

        if (ctaSKY == null || ctaSKY.isEmpty()) {
            return smartCard;
        }
        try {
            ConsultatiIrdPrincipalClientEp = new ConsultatiIrdPrincipalClientEp();
            ConsultaTIIRDPrincipal = ConsultatiIrdPrincipalClientEp.getConsultaTIIRDPrincipalPt();
            payload = new mx.com.sky.sel.proxyclients.pagwebconsultas.consultatiirdprincipal.types.CTINType();
            payload.setCuentaSKY(ctaSKY);
            response = ConsultaTIIRDPrincipal.process(payload);


            if (response != null) {
                smartCard = convertTarjetaToTarjetaInteligenteIRD(response);
            }
        } catch (Exception e) {
            LogServicios.printlnError(e);
        }
        return smartCard;
    }

    public String obtenerTarjetaInteligenteMaster(String ctaSKY) {
        TarjetaInteligenteIRD tiIRD = null;
        tiIRD = getTarjetaInteligenteIRD(ctaSKY);
        return tiIRD.getTarjetaInteligente();
    }

    //*************************************************


    public String crearSolicitud(SolicitudServicioBean solicitudServicio) throws ServicioException {
        ServicioSolicituServicio sss = new ServicioSolicituServicio();
        //Codigo para contratar canal
        String respuesta = "";

        solicitudServicio.setArea("Tramites");
        solicitudServicio.setSubArea("Tarjeta Inteligente");

        respuesta = sss.crearSolicitud(solicitudServicio);
        return respuesta;
    }

    private TarjetaInteligente convertTarjetaToTarjetaInteligente(ConsultaTIIRDProcessResponse.Tarjeta tarjeta) {
        TarjetaInteligente smartCard = new TarjetaInteligente();

        smartCard.setIrd(tarjeta.getIRD());
        smartCard.setJerarquia(tarjeta.getJerarquia());
        smartCard.setStatus(tarjeta.getStatus());
        smartCard.setTarjetaInteligente(tarjeta.getTarjetaInteligente());
        smartCard.setUbicacion(tarjeta.getUbicacion());
        smartCard.setCategoria(tarjeta.getCategoria());
        return smartCard;
    }

    private TarjetaInteligenteIRD convertTarjetaToTarjetaInteligenteIRD(mx.com.sky.sel.proxyclients.pagwebconsultas.consultatiirdprincipal.types.CTOutType tarjeta) {
        TarjetaInteligenteIRD smartCard = new TarjetaInteligenteIRD();
        smartCard.setIRD(tarjeta.getIRD());
        smartCard.setResultado(tarjeta.getResultado());
        smartCard.setResultadoDesc(tarjeta.getResultadodesc());
        smartCard.setTarjetaInteligente(tarjeta.getTarjetaInteligente());
        return smartCard;
    }
}
