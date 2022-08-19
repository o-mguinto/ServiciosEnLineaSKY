package mx.com.sky.sel.services.canal;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Holder;

import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacanalescarta.ConsultaCanalesALaCarta;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacanalescarta.ConsultaCanalesALaCarta_Service;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacanalescarta.types.CanalALaCarta;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacanalescarta.types.ConsultaCanalesALaCartaProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacanalescarta.types.ConsultaCanalesALaCartaProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultamundialactivo.ConsultaMundialActivo;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultamundialactivo.ConsultaMundialActivoEp;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultamundialactivo.types.CodigoError;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapreciocanal.ConsultaPrecioCanal;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapreciocanal.ConsultapreciocanalClientEp;
import mx.com.sky.sel.services.beans.canal.CanalCarta;
import mx.com.sky.sel.services.beans.canal.PrecioCanal;
import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.solicitudservicio.ServicioSolicituServicio;


public class ServicioCanal implements Serializable {
    @SuppressWarnings("compatibility:-4684640123473798598")
    private static final long serialVersionUID = 4788638198300598271L;

    public ServicioCanal() {
        super();
    }
    public boolean consultaMundialActivo(String numeroCuenta, String tipoMercado){
    boolean respuesta = true;
        Holder<CodigoError> codigoError =  new Holder<CodigoError>();
        Holder<String> mundialActivo = new Holder<String>();
        ConsultaMundialActivoEp consultaMundialActivo_ep;
        consultaMundialActivo_ep = new ConsultaMundialActivoEp();
        ConsultaMundialActivo consultaMundialActivo = consultaMundialActivo_ep.getConsultaMundialActivoPt();
        consultaMundialActivo.consultaMundialActivo(numeroCuenta,tipoMercado,codigoError,mundialActivo);
    if (codigoError.value.getCodigo().getValue().equalsIgnoreCase("0")) {
        if (mundialActivo.value.equalsIgnoreCase("N")) {
            respuesta = false;
        }else{
            respuesta = true;
        }     
    }else{
        respuesta = false;
    }
        return respuesta;
    }

    /**
     *
     * @param paquete FUN,UNIVERSE,HBO etc
     * @param tipoCuenta Normal,etc
     * @return
     */
    public List<CanalCarta> obtenerCanalCarta(String paquete, String tipoCuenta, boolean isHD,String categoria) {
        List<CanalCarta> canales = null;
        CanalCarta canal = null;
        ConsultaCanalesALaCarta_Service consultaCanalesALaCarta_Service = null;
        ConsultaCanalesALaCarta consultaCanalesALaCarta = null;
        ConsultaCanalesALaCartaProcessRequest payload = null;
        ConsultaCanalesALaCartaProcessResponse resultado = null;
        //Agregar c\u00F3digo para consulta del PROXY

        canales = new ArrayList<CanalCarta>();

        try {
            consultaCanalesALaCarta_Service = new ConsultaCanalesALaCarta_Service();
            consultaCanalesALaCarta = consultaCanalesALaCarta_Service.getConsultaCanalesALaCarta();
            payload = new ConsultaCanalesALaCartaProcessRequest();
            payload.setPaquete(paquete);
            payload.setTipoCuenta(tipoCuenta);
            payload.setCategoria(categoria);
            resultado = consultaCanalesALaCarta.process(payload);
            if (resultado != null) {
                for (CanalALaCarta canalCarta : resultado.getListaCanalALaCarta().getCanalALaCarta()) {
                    canal = convertCanalCarta(canalCarta);
                    canal.setHabilitado(true);
                    if (isHD) {
                        canales.add(canal);
                    } else if (canal.getDefinicion().equalsIgnoreCase("SD")) {
                        canales.add(canal);
                    }
                }
            }

        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }


        return canales;
    }

    private CanalCarta convertCanalCarta(CanalALaCarta canalCarta) {
        CanalCarta canal = new CanalCarta();
        canal.setImagen(canalCarta.getImagen());
        canal.setId(canalCarta.getNombre());
        canal.setNombre(canalCarta.getNombre());
        canal.setNombre_display(canalCarta.getNombreDisplay());
        canal.setPrecio_display("");
        canal.setSinopsis(canalCarta.getSinopsis());
        canal.setCanal(canalCarta.getCanal());
        canal.setCanal_display(canalCarta.getCanalDisplay());
        canal.setDefinicion(canalCarta.getDefinicion());
        canal.setCategoria(canalCarta.getCategoria());
        return canal;
    }
    

    public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID) {
        List<DetalleSolicitudServicio> solicitudes;
        ServicioSolicituServicio sss = new ServicioSolicituServicio();
        solicitudes = sss.consultarSolicitudServicios(rowID, "Web", "Canales a la Carta");
        return solicitudes;
    }

    public String crearSolicitud(SolicitudServicioBean solicitudServicio) throws ServicioException {
        ServicioSolicituServicio sss = new ServicioSolicituServicio();
        //Codigo para contratar canal
        String respuesta = "";
        solicitudServicio.setArea("Web");
        solicitudServicio.setSubArea("Canales a la Carta");

        respuesta = sss.crearSolicitud(solicitudServicio);
        return respuesta;
    }
    //hijump

    public PrecioCanal consultarPrecioCanal(String numeroCanal, String paisISO, String ctaSky, String sistema, String tipoCuenta) {
        PrecioCanal precioCanal = new PrecioCanal();
        ConsultapreciocanalClientEp consultapreciocanal_client_ep;
        ConsultaPrecioCanal consultaPrecioCanal = null;
        Holder<String> resultado = new Holder<String>();
        Holder<String> resultadodesc = new Holder<String>();
        Holder<String> costo = new Holder<String>();
        Holder<String> pagoOportuno = new Holder<String>();
        
        try {
            consultapreciocanal_client_ep = new ConsultapreciocanalClientEp();
            consultaPrecioCanal = consultapreciocanal_client_ep.getConsultaPrecioCanalPt();
            consultaPrecioCanal.process(numeroCanal,paisISO,sistema,ctaSky,tipoCuenta,resultado,resultadodesc,costo,pagoOportuno);

            if (resultado.value.equalsIgnoreCase("0")) {
                precioCanal.setCosto(costo.value);
                precioCanal.setPagoOportuno(pagoOportuno.value);
            } else {
                precioCanal.setCosto("0");
                precioCanal.setPagoOportuno("0");
                LogServicios.printlnError(this, "MENSAJE DE PRECIO CAC " + resultadodesc.value);
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e);
            precioCanal.setCosto("0");
            precioCanal.setPagoOportuno("0");
        }

        return precioCanal;
    }
}
