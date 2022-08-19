package mx.com.sky.sel.services.cambiopaquete;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Holder;

import mx.com.sky.sel.services.beans.cambiopaquete.Paquete;
import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.solicitudservicio.ServicioSolicituServicio;
import mx.com.sky.sel.utils.JavaUtils;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaquete.ConsultaPaquete;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaquete.types.ConsultaPaqueteProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaquete.types.ConsultaPaqueteProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaquete.ConsultaPaquete_Service;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaqueteall.ConsultaPaqueteAll;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaqueteall.ConsultapaqueteallClientEp;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaqueteall.types.PaquetesElementType;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaqueteall.types.PaquetesInType;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaqueteall.types.PaquetesOutType;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapreciopaquete.ConsultaPrecioPaquete;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapreciopaquete.ConsultapreciopaqueteClientEp;
//import mx.com.sky.proxy.cambiopaquete.consulta.sigmensualidad.ConsultaProrrateoPaquete;
//import mx.com.sky.proxy.cambiopaquete.consulta.sigmensualidad.Consultaprorrateopaquete_client_ep;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaaplicapenvetvca.ConsultaAplicaPenalizacionVeTVCA;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaaplicapenvetvca.types.ConsultaAplicaPenalizacionVeTVCAProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaaplicapenvetvca.types.ConsultaAplicaPenalizacionVeTVCAProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaaplicapenvetvca.ConsultaAplicaPenalizacionVeTVCA_Service;

public class ServicioCambioPaquete implements Serializable {

    public ServicioCambioPaquete() {
        super();
    }

    /*public String consultaSigMensualidad(String cuentaSKY) {
        LogServicios.println(this, "consultaSigMensualidad(" + cuentaSKY + ")");
        String sigMensualidad = "0.0";
        Consultaprorrateopaquete_client_ep consultaprorrateopaquete_client_ep = null;
        ConsultaProrrateoPaquete consultaProrrateoPaquete = null;
        Holder<String> resultado = new Holder<String>();
        Holder<String> resultadodesc = new Holder<String>();
        Holder<String> saldo = new Holder<String>();

        try {
            consultaprorrateopaquete_client_ep = new Consultaprorrateopaquete_client_ep();
            consultaProrrateoPaquete = consultaprorrateopaquete_client_ep.getConsultaProrrateoPaquete_pt();

            consultaProrrateoPaquete.process(cuentaSKY, resultado, resultadodesc, saldo);

            if (resultado.value.equalsIgnoreCase("0")) {
                sigMensualidad = saldo.value;
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e);
        }
        return sigMensualidad;
    }*/

    public boolean consultaPenalizacionVeTVCA(String cuentaSKY) throws ServicioException {
        LogServicios.println(this, "consultaPenalizacionVeTVCA(" + cuentaSKY + ")");
        ConsultaAplicaPenalizacionVeTVCA_Service consultaAplicaPenalizacionVeTVCA_Service;
        ConsultaAplicaPenalizacionVeTVCA consultaAplicaPenalizacionVeTVCA = null;
        ConsultaAplicaPenalizacionVeTVCAProcessRequest payload;
        ConsultaAplicaPenalizacionVeTVCAProcessResponse response;
        boolean penalizacion = false;

        try {

            consultaAplicaPenalizacionVeTVCA_Service = new ConsultaAplicaPenalizacionVeTVCA_Service();
            consultaAplicaPenalizacionVeTVCA = consultaAplicaPenalizacionVeTVCA_Service.getConsultaAplicaPenalizacionVeTVCA();

            payload = new ConsultaAplicaPenalizacionVeTVCAProcessRequest();
            payload.setCuentaSKY(cuentaSKY);
            response = consultaAplicaPenalizacionVeTVCA.process(payload);
            if (response == null) {
                throw new ServicioException("Servicio no disponible");
            } else if (!response.getResultado().equalsIgnoreCase("0")) {
                throw new ServicioException("Servicio no disponible");
            } else {
                penalizacion = response.getBanderaPenalizacionVeTVCA().equalsIgnoreCase("Y");
            }
        } catch (ServicioException e) {
            LogServicios.printlnError(this, e);
            throw e;
        } catch (Exception e) {
            LogServicios.printlnError(this, e);
            throw new ServicioException("Servicio no disponible");
        }

        return penalizacion;
    }

    public List<Paquete> obtenerPaquetes(String paqueteActual, String codigoPais, String tipoCuenta, String cuentaSKY, String paisISO,
                                         String sistema) {
        List<Paquete> paquetes = null;
        Paquete paquete = null;
        ConsultaPaquete_Service consultaPaquete_Service = null;
        ConsultaPaquete consultaPaquete = null;
        ConsultaPaqueteProcessRequest payload = null;
        ConsultaPaqueteProcessResponse resultado = null;
        //Agregar c\u00F3digo para consulta del PROXY
        paquetes = new ArrayList<Paquete>();
        String codigoConsultaVetv = "";
        //ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        
        try {
            consultaPaquete_Service = new ConsultaPaquete_Service();
            consultaPaquete = consultaPaquete_Service.getConsultaPaquete();
            payload = new ConsultaPaqueteProcessRequest();
            payload.setCodigoPais(codigoPais);
            payload.setPaqueteActual(paqueteActual);
            payload.setTipoCuenta(tipoCuenta);
            resultado = consultaPaquete.process(payload);
            if (resultado != null) {
                for (mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaquete.types.Paquete paqueteWS : resultado.getListaPaquetes().getPaquete()) {
                    paquete = convertPaquete(paqueteWS);
                    if (paqueteWS.getNombre().contains("VETV")) {
                        paquetes.add(paquete);
                    }else{
                        paquete = consultarPrecio(paquete, paisISO, sistema, cuentaSKY);
                        paquetes.add(paquete);
                    }
                    
                }
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }
        return paquetes;
    }

    public List<Paquete> obtenerPaquetesPorPais(String id_Pais) {
        List<Paquete> paquetes = null;
        Paquete paquete = null;
        ConsultapaqueteallClientEp consultapaqueteall_client_ep;
        ConsultaPaqueteAll consultaPaqueteAll = null;
        PaquetesOutType resultado = null;
        PaquetesInType payload;
        //Agregar c\u00F3digo para consulta del PROXY
        paquetes = new ArrayList<Paquete>();
        if (id_Pais == null || id_Pais.isEmpty()) {
            return paquetes;
        }
        try {
            consultapaqueteall_client_ep = new ConsultapaqueteallClientEp();
            consultaPaqueteAll = consultapaqueteall_client_ep.getConsultaPaqueteAllPt();
            payload = new PaquetesInType();
            payload.setIdPais(id_Pais);
            resultado = consultaPaqueteAll.process(payload);
            if (resultado != null) {
                for (PaquetesElementType paqueteWS : resultado.getPaquetes()) {
                    paquete = convertPaquete(paqueteWS);
                    paquetes.add(paquete);
                }
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }
        return paquetes;
    }

    public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID) {
        List<DetalleSolicitudServicio> solicitudes;
        ServicioSolicituServicio sss = new ServicioSolicituServicio();
        solicitudes = sss.consultarSolicitudServicios(rowID, "Web", "Cambio de Paquete");
        return solicitudes;
    }

    public String crearSolicitud(SolicitudServicioBean solicitudServicio) throws ServicioException {
        ServicioSolicituServicio sss = new ServicioSolicituServicio();
        //Codigo para contratar canal
        String respuesta = "";


        solicitudServicio.setArea("Web");
        solicitudServicio.setSubArea("Cambio de Paquete");
    
        respuesta = sss.crearSolicitud(solicitudServicio);
        return respuesta;
    }
    public String marcarCuentaAccess(String cuenta, String sistema) throws ServicioException{
        String respuesta = "";
        ServicioSolicituServicio cambioPaquete = new ServicioSolicituServicio();
        respuesta = cambioPaquete.marcarCuentaCambioPaquete(cuenta, sistema);
        return respuesta;
    }
    private Paquete consultarPrecio(Paquete paqueteTmp, String paisISO, String sistema, String cuentaSKY) {
        Holder<String> resultado = new Holder<String>();
        Holder<String> resultadodesc = new Holder<String>();
        Holder<String> precioLista = new Holder<String>();
        Holder<String> precioPagoOportuno = new Holder<String>();
        Holder<String> fechaIniPrecioLista = new Holder<String>();
        ConsultapreciopaqueteClientEp consultapreciopaquete_client_ep;
        ConsultaPrecioPaquete consultaPrecioPaquete = null;

        try {
            consultapreciopaquete_client_ep = new ConsultapreciopaqueteClientEp();
            consultaPrecioPaquete = consultapreciopaquete_client_ep.getConsultaPrecioPaquetePt();


            consultaPrecioPaquete.process(paqueteTmp.getNombre(), paisISO, sistema, cuentaSKY, resultado, resultadodesc, precioLista,
                                          precioPagoOportuno, fechaIniPrecioLista);
            if (resultado != null && resultado.value.equals("0")) {

                paqueteTmp.setCosto(JavaUtils.formatMoneda(precioLista.value));
                paqueteTmp.setCostoPagoOportuno(JavaUtils.formatMoneda(precioPagoOportuno.value));
            }

        } catch (Exception e) {
            LogServicios.printlnError(e);
        }
        return paqueteTmp;
    }
    private Paquete convertPaquete(mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaquete.types.Paquete paqueteWS) {
        Paquete paquete = new Paquete();

        paquete.setNombre(paqueteWS.getNombre());
        paquete.setImagen(paqueteWS.getImagen());
        if (paqueteWS.getNombre().contains("VETV")) {
            paquete.setMostrarVetvPlus(true);
        }else{
            paquete.setMostrarVetvPlus(false);
        }

        return paquete;
    }


    private Paquete convertPaquete(PaquetesElementType paqueteWS) {
        Paquete paquete = new Paquete();
        paquete.setNombre(paqueteWS.getNombre());
        return paquete;
    }
}
