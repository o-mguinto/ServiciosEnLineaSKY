package mx.com.sky.sel.services.solicitudservicio;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Holder;

import mx.com.sky.enterpriseflowmessage.sel.ejecutarremotebooking.EjecutarRemoteBookingRequestEBFEBMType;
import mx.com.sky.enterpriseflowmessage.sel.ejecutarremotebooking.EjecutarRemoteBookingResponseEBFEBMType;
import mx.com.sky.enterpriseflowmessage.sel.ejecutarremotebooking.RemoteBookingRequestEBMType;
import mx.com.sky.sel.proxyclients.pagweb.pwremotebooking.BPELPWREMOTEBOOKING;
import mx.com.sky.sel.proxyclients.pagweb.pwremotebooking.BpelPwRemotebookingClientEp;
import mx.com.sky.sel.proxyclients.pagweb.pwremotebooking.types.RemotebookingTypeIN;
import mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.AltaSolicitudDeServicioWeb;
import mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.AltaSolicitudDeServicioWeb_Service;
import mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.types.AltaSolicitudDeServicioWebProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.types.AltaSolicitudDeServicioWebProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.types.CompraControlRemoto;
import mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.types.ContratacionServicios;
import mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.types.DatosFiscales;
import mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.types.Direccion;
import mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.types.InfoPPE;
import mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.types.RemoteBooking;
import mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.types.Solicitud;
import mx.com.sky.sel.proxyclients.pagwebss.cambiopaqueteaccess.CambioPaqueteAccess;
import mx.com.sky.sel.proxyclients.pagwebss.cambiopaqueteaccess.CambiopaqueteaccessClientEp;
import mx.com.sky.sel.proxyclients.pagwebss.consultasolicitudservicio.ConsultaSolicitudDeServicio;
import mx.com.sky.sel.proxyclients.pagwebss.consultasolicitudservicio.ConsultaSolicitudDeServicio_Service;
import com.oracle.xmlns.consultasolicituddeservicio.ConsultaSolicitudDeServicioProcessRequest;
import com.oracle.xmlns.consultasolicituddeservicio.ConsultaSolicitudDeServicioProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebss.consultasolicitudservicioindividual.ConsultaSolicitudDeServicioIndividual;
import mx.com.sky.sel.proxyclients.pagwebss.consultasolicitudservicioindividual.ConsultaSolicitudDeServicioIndividual_Service;
import mx.com.sky.sel.proxyclients.pagwebss.consultasolicitudservicioindividual.types.ConsultaSolicitudDeServicioIndividualProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebss.consultasolicitudservicioindividual.types.ConsultaSolicitudDeServicioIndividualProcessResponse;
import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.proxyclients.selebf.ejecutarremotebooking.EjecutarRemoteBookingSelEBF;
import mx.com.sky.sel.proxyclients.selebf.ejecutarremotebooking.EjecutarRemoteBookingSelEBFEp;


public class ServicioSolicituServicio implements Serializable {
    @SuppressWarnings("compatibility:-4984870704869279927")
    private static final long serialVersionUID = 73176348193698708L;

    public ServicioSolicituServicio() {
        super();
    }

    public List<DetalleSolicitudServicio> consultarSolicitudServicios(String rowId, String areaSS, String subAreaSS) {
        ConsultaSolicitudDeServicio_Service consultaSolicitudDeServicio_Service;
        ConsultaSolicitudDeServicio consultaSolicitudDeServicio = null;
        ConsultaSolicitudDeServicioProcessRequest payload = null;
        ConsultaSolicitudDeServicioProcessResponse respuesta = null;
        DetalleSolicitudServicio detalleSS = null;
        List<DetalleSolicitudServicio> solicitudes = null;


        try {

            solicitudes = new ArrayList<DetalleSolicitudServicio>();
            consultaSolicitudDeServicio_Service = new ConsultaSolicitudDeServicio_Service();
            consultaSolicitudDeServicio = consultaSolicitudDeServicio_Service.getConsultaSolicitudDeServicio();

            payload = new ConsultaSolicitudDeServicioProcessRequest();
            payload.setAreaSS(areaSS);
            payload.setRowId(rowId);
            payload.setSubAreaSS(subAreaSS);
            respuesta = consultaSolicitudDeServicio.process(payload);

            if (respuesta != null) {
                for (ConsultaSolicitudDeServicioProcessResponse.DetalleSolicitudDeServicio detalle : respuesta.getDetalleSolicitudDeServicio()) {
                    detalleSS = convert(detalle);
                    solicitudes.add(detalleSS);
                }
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }

        return solicitudes;

    }
    public String marcarCuentaCambioPaquete(String cuenta, String sistema) throws ServicioException{
        String respuesta = "";
        CambiopaqueteaccessClientEp CambiopaqueteaccessClientEp = new CambiopaqueteaccessClientEp();
        CambioPaqueteAccess cambioPaqueteAccess = CambiopaqueteaccessClientEp.getCambioPaqueteAccessPt();
        mx.com.sky.sel.proxyclients.pagwebss.cambiopaqueteaccess.types.Process proccess = new mx.com.sky.sel.proxyclients.pagwebss.cambiopaqueteaccess.types.Process();
        proccess.setAccount(cuenta);
        proccess.setDesc("MIGRACION A PAQUETE VETV PLUS, SUSCRIPTOR ACEPTA CONDICIONES");
        proccess.setSRArea("WEB");
        proccess.setSRClasificacion("Programacion");
        proccess.setSRSubClasificacion("Migracion ACCESS a VETVPLUS");
        proccess.setSRDetalle("");
        proccess.setSistema(sistema);
        Holder<String> errorCode = new Holder<String>();
        Holder<String> errorDesc = new Holder<String>();
        cambioPaqueteAccess.process(cuenta,"MIGRACION A PAQUETE VETV PLUS, SUSCRIPTOR ACEPTA CONDICIONES","WEB","Programacion","Migracion ACCESS a VETVPLUS","",sistema,errorCode,errorDesc);
        if (errorCode.equals("0")) {
            respuesta="";
        }else{
            respuesta = "Error";
            throw new ServicioException("Ocurri\u00F3 algo inesperado, por favor intente m\u00E1s tarde. ");
        }
        return respuesta;
    }
    public EjecutarRemoteBookingResponseEBFEBMType crearSolicitudRemoteBooking(RemoteBookingRequestEBMType solicitudServicio) throws ServicioException {
        EjecutarRemoteBookingSelEBFEp ejecutarRemoteBookingSelEBF_ep = new EjecutarRemoteBookingSelEBFEp();
        EjecutarRemoteBookingSelEBF ejecutarRemoteBookingSelEBF = ejecutarRemoteBookingSelEBF_ep.getEjecutarRemoteBookingSelEBFPt();
        EjecutarRemoteBookingRequestEBFEBMType request = new EjecutarRemoteBookingRequestEBFEBMType();
          EjecutarRemoteBookingResponseEBFEBMType response = null;
        mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType header = new mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType();    
    try {
      
      header.setOperacion("EjecutarRemoteBooking");
      header.setSistemaOrigen("SEL");
      request.setEBMHeaderRequest(header);
      RemoteBookingRequestEBMType remoteBooking = new RemoteBookingRequestEBMType();
      remoteBooking.setOperacion("Solicitud Servicio Integrada");
      remoteBooking.setGrupo("Remote Booking");
      remoteBooking.setTipo("Remote Booking");
      remoteBooking.setOrigen("Web");
      remoteBooking.setSistemaOrigen("ServiciosEnLinea");  
        
            remoteBooking.setNumeroCuenta(solicitudServicio.getNumeroCuenta());
            remoteBooking.setTarjetaInteligente(solicitudServicio.getTarjetaInteligente());
            remoteBooking.setNumeroComercial(solicitudServicio.getNumeroComercial());
            remoteBooking.setIdentificadorCanalUnico(solicitudServicio.getIdentificadorCanalUnico());
            remoteBooking.setNombreCanal(solicitudServicio.getNombreCanal());
            remoteBooking.setNombreEvento(solicitudServicio.getNombreEvento());
            remoteBooking.setEventId(solicitudServicio.getEventId());
            remoteBooking.setContentId(solicitudServicio.getContentId());
            remoteBooking.setContentProvider(solicitudServicio.getContentProvider());
            remoteBooking.setOriginalNetwork(solicitudServicio.getOriginalNetwork());
            remoteBooking.setTransportStream(solicitudServicio.getTransportStream());
            remoteBooking.setSeriesId(solicitudServicio.getSeriesId());
            remoteBooking.setProgramId(solicitudServicio.getProgramId());

            remoteBooking.setFechaInicio(solicitudServicio.getFechaInicio());
            remoteBooking.setFechaFin(solicitudServicio.getFechaFin());
            remoteBooking.setTipoGrabacion(solicitudServicio.getTipoGrabacion());
            remoteBooking.setDuracion(solicitudServicio.getDuracion());
            remoteBooking.setTipoContenido(solicitudServicio.getTipoContenido());
            remoteBooking.setRecurrencia(solicitudServicio.getRecurrencia());
            remoteBooking.setRecordatorio(solicitudServicio.getRecordatorio());
            remoteBooking.setUserName(solicitudServicio.getUserName());
            remoteBooking.setSessionID(solicitudServicio.getSessionID());
            remoteBooking.setCategoria(solicitudServicio.getCategoria());
            remoteBooking.setPais(solicitudServicio.getPais());
            //// Mapeo de datos de solicutud
      
      request.setEjecutarRemoteBookingRequest(remoteBooking);
      response = ejecutarRemoteBookingSelEBF.ejecutarRemoteBooking(request);
      
            if (!response.getEBMHeaderResponse().getErrorNegocio().getCodigoError().equalsIgnoreCase("0")) {
                throw new ServicioException("No es posible realizan la grabación, por favor llamar a atención a clientes.");
            }
        } catch (Exception e) {
            throw new ServicioException("No es posible realizan la grabación, por favor llamar a atención a clientes.");
            
        }
      return response;
    }
    public String crearSolicitud(SolicitudServicioBean solicitudServicio) throws ServicioException {
        AltaSolicitudDeServicioWeb_Service AltaSolicitudDeServicioWeb_Service;
        AltaSolicitudDeServicioWeb AltaSolicitudDeServicioWeb = null;
        AltaSolicitudDeServicioWebProcessRequest payload;
        AltaSolicitudDeServicioWebProcessResponse resultado = null;
        String respuesta = null;
        Solicitud value = null;


        try {

            if (solicitudServicio.getPais() == null) {
                LogServicios.println(this, "Pais NULL");
                throw new ServicioException("Por el momento no es posible crear la Solicitud de Reparaci\u00F3n, por favor cierre su sesi\u00F3n e intente nuevamente.");
            }
            AltaSolicitudDeServicioWeb_Service = new AltaSolicitudDeServicioWeb_Service();
            AltaSolicitudDeServicioWeb = AltaSolicitudDeServicioWeb_Service.getAltaSolicitudDeServicioWeb();

            payload = new AltaSolicitudDeServicioWebProcessRequest();


            value = convert(solicitudServicio);
            payload.setSolicitudDeServicio(value);
            LogServicios.println(this, "Creando Solicitud:" + solicitudServicio);
            resultado = AltaSolicitudDeServicioWeb.process(payload);
            if (resultado != null && resultado.getResultado().equalsIgnoreCase("0")) {
                respuesta = resultado.getNumeroSolicitud();
            } else if (resultado != null) {
                LogServicios.printlnWarn(this,
                                     "resultado:" + resultado + ":" + resultado.getResultado() + ":" + resultado.getResultadodesc() + ":" + resultado.getNumeroSolicitud());
                throw new ServicioException(resultado.getResultadodesc());
            } else {
                LogServicios.println(this, resultado);
                throw new ServicioException("Ocurri\u00F3 algo inesperado, por favor intente m\u00E1s tarde. ");
            }
        } catch (ServicioException e) {
            LogServicios.printlnError(e);
            throw e;
        } catch (Exception e) {
            LogServicios.printlnError(e);
            throw new ServicioException("Ocurri\u00F3 algo inesperado, por favor intente m\u00E1s tarde");
        } finally{
            if(solicitudServicio.getArea().equalsIgnoreCase("Remote Booking")){
                BpelPwRemotebookingClientEp BpelPwRemotebookingClientEp = new BpelPwRemotebookingClientEp();
                BPELPWREMOTEBOOKING bPEL_PW_REMOTEBOOKING = BpelPwRemotebookingClientEp.getBPELPWREMOTEBOOKINGPt();
                // Add your code to call the desired methods.
                RemotebookingTypeIN remoteBookingIn = new RemotebookingTypeIN();
                remoteBookingIn.setSESSIONID(solicitudServicio.getIdSesion());
                remoteBookingIn.setCTASKY(solicitudServicio.getCuenta());
                remoteBookingIn.setUSERNAME(solicitudServicio.getCorreoElectronico());
                remoteBookingIn.setCATEGORIA(solicitudServicio.getRemoteBooking().getTi().getCategoria());
                remoteBookingIn.setPAISISO(solicitudServicio.getPais());
                remoteBookingIn.setDESCRIPCION(solicitudServicio.getDescripcion());
                remoteBookingIn.setCANAL(solicitudServicio.getRemoteBooking().getCanal().getIdMostrado());
                remoteBookingIn.setMETODO(solicitudServicio.getRemoteBooking().getMethodType());
                String rt="Desconocido";
                if(solicitudServicio.getRemoteBooking().getMethodType().equalsIgnoreCase("01")){ // Grabaci\u00F3n por Contenido
                    rt = solicitudServicio.getRemoteBooking().getRecordingType();
                }else if(solicitudServicio.getRemoteBooking().getMethodType().equalsIgnoreCase("02")){ // Grabaci\u00F3n por Canal
                    rt = solicitudServicio.getRemoteBooking().getRecurringFlags();
                }
                remoteBookingIn.setRECURRENCIA(rt);
                remoteBookingIn.setSOLICITUD(resultado.getNumeroSolicitud());
                remoteBookingIn.setRESPUESTA(resultado.getResultado());
                remoteBookingIn.setPCMOVIL("PC");
                remoteBookingIn.setSISTEMA("SEL");
                bPEL_PW_REMOTEBOOKING.process(remoteBookingIn);
            }
        }
        return respuesta;
    }


    public DetalleSolicitudServicio consultaSolicitudServicio(String numeroSolicitud) {
        DetalleSolicitudServicio solicitud = null;
        ConsultaSolicitudDeServicioIndividualProcessRequest payload;
        ConsultaSolicitudDeServicioIndividualProcessResponse.DetalleSolicitudDeServicio detalle;
        ConsultaSolicitudDeServicioIndividualProcessResponse resultado = null;
        ConsultaSolicitudDeServicioIndividual_Service consultaSolicitudDeServicioIndividual_Service;
        ConsultaSolicitudDeServicioIndividual consultaSolicitudDeServicioIndividual = null;

        try {

            consultaSolicitudDeServicioIndividual_Service = new ConsultaSolicitudDeServicioIndividual_Service();
            consultaSolicitudDeServicioIndividual = consultaSolicitudDeServicioIndividual_Service.getConsultaSolicitudDeServicioIndividual();

            payload = new ConsultaSolicitudDeServicioIndividualProcessRequest();
            payload.setNoSolicitud(numeroSolicitud);
            resultado = consultaSolicitudDeServicioIndividual.process(payload);


            if (resultado != null) {
                detalle = resultado.getDetalleSolicitudDeServicio().get(0);
                solicitud = convert(detalle);

            }
        } catch (Exception e) {
            LogServicios.printlnError(e);
        }

        return solicitud;
    }


    private Solicitud convert(SolicitudServicioBean solicitudServicio) {
        Solicitud solicitud = new Solicitud();

        solicitud.setArea(solicitudServicio.getArea());
        solicitud.setContactoRowId(solicitudServicio.getContactoRowId());
        solicitud.setCuenta(solicitudServicio.getCuenta());
        solicitud.setDescripcion(solicitudServicio.getDescripcion());
        solicitud.setSubArea(solicitudServicio.getSubArea());
        solicitud.setTarjetaInteligente(solicitudServicio.getTarjetaInteligente());
        solicitud.setMailConfirmacion(solicitudServicio.getCorreoElectronico());
        solicitud.setPais(solicitudServicio.getPais());
        solicitud.setTipoCuenta(solicitudServicio.getTipoCuenta());
        solicitud.setNombreSuscriptor(solicitudServicio.getNombreSuscriptor());
        //se agrega el idSesion
        solicitud.setIdSesion(solicitudServicio.getIdSesion());
        
        DatosFiscales datosFiscales;
        Direccion direccion;
        ContratacionServicios contratacionServicios;
        CompraControlRemoto compraControlRemoto;
        InfoPPE infoPPE;


        datosFiscales = new DatosFiscales();
        datosFiscales.setCompania("");
        datosFiscales.setMetodoEnvio(solicitudServicio.getDatosFiscales().getMetodoEnvio());
        datosFiscales.setRFC(solicitudServicio.getDatosFiscales().getRfc());
        datosFiscales.setRazonSocial(solicitudServicio.getDatosFiscales().getRazonSocial());
        datosFiscales.setTipoFactura(solicitudServicio.getDatosFiscales().getTipoFactura());


        direccion = new Direccion();
        direccion.setCP(solicitudServicio.getDireccion().getCp());
        if (solicitudServicio.getSubArea().equalsIgnoreCase("Control Remoto") && !solicitudServicio.getPais().equalsIgnoreCase("CRICA")) {
            if (solicitudServicio.getDireccion().getCalleNumero().length() <=50) {
                direccion.setCalle(solicitudServicio.getDireccion().getCalleNumero());
            }else{
                direccion.setCalle(solicitudServicio.getDireccion().getCalleNumero().substring(0,50));
            }
            if (solicitudServicio.getDireccion().getColonia().length() <=50) {
                direccion.setColonia(solicitudServicio.getDireccion().getColonia());
            }else{
                direccion.setColonia(solicitudServicio.getDireccion().getColonia().substring(0, 50));
            } 
        }else{
            direccion.setCalle(solicitudServicio.getDireccion().getCalleNumero());
            direccion.setColonia(solicitudServicio.getDireccion().getColonia());
        }
        direccion.setDelMun(solicitudServicio.getDireccion().getDelMun());
        direccion.setEstado(solicitudServicio.getDireccion().getEstado());
        direccion.setNoExt(solicitudServicio.getDireccion().getNumeroExt());
        direccion.setNoInt(solicitudServicio.getDireccion().getNumeroInt());
        direccion.setPoblacion(solicitudServicio.getDireccion().getPoblacion());

        contratacionServicios = new ContratacionServicios();
        contratacionServicios.setPaqueteActual(solicitudServicio.getContratacionServicios().getPaqueteActual());
        contratacionServicios.setServicioAContratar(solicitudServicio.getContratacionServicios().getServicioAContratar());
        contratacionServicios.setNoCanalALaCarta(solicitudServicio.getContratacionServicios().getNumero());
        contratacionServicios.setPrecioCanalALaCarta(solicitudServicio.getContratacionServicios().getCosto());
        contratacionServicios.setNombreCanalALaCarta(solicitudServicio.getContratacionServicios().getNombre_display());
        contratacionServicios.setPenalizacionVETVCA(solicitudServicio.getContratacionServicios().getPenalizacionVeTVCA());

        compraControlRemoto = new CompraControlRemoto();
        compraControlRemoto.setBanderaDomicilioActual(solicitudServicio.getControlRemoto().getBanderaGarantia());
        compraControlRemoto.setIDControlRemoto("1-2UXRPU");
        compraControlRemoto.setNombreControl(solicitudServicio.getControlRemoto().getProducto());
        compraControlRemoto.setManualControlRemoto(solicitudServicio.getControlRemoto().getManual());
        compraControlRemoto.setImagenControlRemoto(solicitudServicio.getControlRemoto().getPathIcon());


        infoPPE = new InfoPPE();
        infoPPE.setCanal(solicitudServicio.getInfoPPE().getCanal());
        infoPPE.setFechaExpiracion(solicitudServicio.getInfoPPE().getHoraExpiracion());
        infoPPE.setFechaInicio(solicitudServicio.getInfoPPE().getHoraEvento());
        infoPPE.setIDEvento(solicitudServicio.getInfoPPE().getId());
        infoPPE.setTokenOverride("0");
        infoPPE.setCanalDisplay(solicitudServicio.getInfoPPE().getCanalDisplay());
        infoPPE.setNombreDelEvento(solicitudServicio.getInfoPPE().getTitulo());
        infoPPE.setTokenValue(solicitudServicio.getInfoPPE().getToken());
        infoPPE.setZonaHoraria(solicitudServicio.getInfoPPE().getDiferenciaHoraria());
        infoPPE.setDuracion(solicitudServicio.getInfoPPE().getDuracion());
        infoPPE.setCosto(solicitudServicio.getInfoPPE().getPrecio());
        infoPPE.setTipoEvento(solicitudServicio.getInfoPPE().getTipoEvento());
        infoPPE.setMailFechaInicio(solicitudServicio.getInfoPPE().getHoraPedido());
        infoPPE.setMailFechaTermino(solicitudServicio.getInfoPPE().getHoraCancelacion());
        //PARAMETROS NUEVOS HACIA SIEBEL
        LogServicios.println(this, "setPpvGenreId " + solicitudServicio.getInfoPPE().getPpvGenreId());
        infoPPE.setPpvGenreId(solicitudServicio.getInfoPPE().getPpvGenreId());
        infoPPE.setOrderType(solicitudServicio.getInfoPPE().getTipoOrden());
        infoPPE.setProviderEventId(solicitudServicio.getInfoPPE().getProviderEventId());
        LogServicios.println(this, "setSKYTrackingId " + solicitudServicio.getInfoPPE().getSkyTrackingId());
        infoPPE.setSKYTrackingId(solicitudServicio.getInfoPPE().getSkyTrackingId());
        
        //REMOTE BOOKING
        
        RemoteBooking remoteBooking = new RemoteBooking();
        if (solicitudServicio.getRemoteBooking() != null) {
            remoteBooking.setChannel(solicitudServicio.getRemoteBooking().getCanal().getIdMostrado());
            remoteBooking.setMethodType(solicitudServicio.getRemoteBooking().getMethodType());
            remoteBooking.setRecurringFlag(solicitudServicio.getRemoteBooking().getRecurringFlags());
            remoteBooking.setStartTime(solicitudServicio.getRemoteBooking().getStartTime());
            remoteBooking.setExpirationTime(solicitudServicio.getRemoteBooking().getExpirationTime());
            if (solicitudServicio.getRemoteBooking().getMethodType().equals(mx.com.sky.sel.services.beans.apg.RemoteBooking.POR_HORARIO_CANAL)) {
                remoteBooking.setDuration(solicitudServicio.getRemoteBooking().getDuracionCuandoEsHorarioCanal());
            } else {
                remoteBooking.setDuration(solicitudServicio.getRemoteBooking().getEvento().getDuracion());
            }

            remoteBooking.setEventID(solicitudServicio.getRemoteBooking().getEvento().getContentId());
            remoteBooking.setRecordingType(solicitudServicio.getRemoteBooking().getRecordingType());
            remoteBooking.setRecordConfiguration(solicitudServicio.getRemoteBooking().getRecordConfiguration());
            remoteBooking.setProductCategory(solicitudServicio.getRemoteBooking().getTi().getCategoria());
        }
        
        solicitud.setSistema(solicitudServicio.getSistema());
        solicitud.setCompraControlRemoto(compraControlRemoto);
        solicitud.setContratacionServicios(contratacionServicios);
        solicitud.setDatosFiscales(datosFiscales);
        solicitud.setDireccion(direccion);
        solicitud.setInfoPPE(infoPPE);
        //remote bookin
        solicitud.setActivaRemoteBooking(remoteBooking);


        return solicitud;
    }

    private DetalleSolicitudServicio convert(ConsultaSolicitudDeServicioProcessResponse.DetalleSolicitudDeServicio detalle) {
        DetalleSolicitudServicio dss = new DetalleSolicitudServicio();

        dss.setArea(detalle.getArea());
        dss.setComentario(detalle.getComentario());
        dss.setFechaCreacion(detalle.getFechaCreacion());
        dss.setNumeroSolicitud(detalle.getNumeroDeSolicitud());
        dss.setSubAarea(detalle.getSubAarea());
        dss.setTarjetaInteligente(detalle.getTarjetaInteligente());
        dss.setEstatus(detalle.getEstatus());
        
        return dss;
    }

    private DetalleSolicitudServicio convert(ConsultaSolicitudDeServicioIndividualProcessResponse.DetalleSolicitudDeServicio detalle) {
        DetalleSolicitudServicio dss = new DetalleSolicitudServicio();

        dss.setArea(detalle.getArea());
        dss.setComentario(detalle.getComentario());
        dss.setFechaCreacion(detalle.getFechaCreacion());
        dss.setNumeroSolicitud(detalle.getNumeroDeSolicitud());
        dss.setSubAarea(detalle.getSubAarea());
        

        return dss;
        }
}
