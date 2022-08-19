package mx.com.sky.sel.services.eventos;

import java.io.Serializable;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import java.text.Format;
import java.text.SimpleDateFormat;

import java.util.Date;

import java.sql.Timestamp;

import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.sky.sel.services.beans.eventos.Evento;
import mx.com.sky.sel.services.beans.eventos.Horario;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.proxyclients.pagweb.cargaarchivoeventos.BPELCargaArchivoEventos;
import mx.com.sky.sel.proxyclients.pagweb.cargaarchivoeventos.BpelcargaarchivoeventosClientEp;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultahrspagoporevento.ConsultaHorariosPagoPorEvento_Service;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultahrspagoporevento.types.ConsultaHorariosPagoPorEventoProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultahrspagoporevento.types.ConsultaHorariosPagoPorEventoProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultahrspagoporevento.ConsultaHorariosPagoPorEvento;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapagosporevento.ConsultaPagosPorEvento;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapagosporevento.ConsultaPagosPorEvento_Service;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapagosporevento.types.ConsultaPagosPorEventoProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapagosporevento.types.ConsultaPagosPorEventoProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultappecontratados.ConsultaPPEContratados;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultappecontratados.ConsultaPPEContratados_Service;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultappecontratados.types.ConsultaPPEContratadosProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultappecontratados.types.ConsultaPPEContratadosProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultappepermisos.ConsultaPPEPermisos;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultappepermisos.ConsultappepermisosClientEp;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultappepermisos.types.ConsultaPPEPermisosType;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultappepermisos.types.ConsultaPermisosInType;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultappepermisos.types.ConsultaPermisosOutType;
import mx.com.sky.sel.proxyclients.soainterface.consultappvcontratados.types.ResultadosConsultaPPVContratadosSalidaTYPE;
import mx.com.sky.sel.proxyclients.pagwebnotificaciones.emailserviciosenlinea.EmailServiciosEnLinea;
import mx.com.sky.sel.proxyclients.pagwebnotificaciones.emailserviciosenlinea.EmailserviciosenlineaClientEp;
import mx.com.sky.sel.proxyclients.pagweb.cargaarchivoeventos.types.ProcessResponse;
import mx.com.sky.sel.proxyclients.pagweb.cargaarchivoeventos.types.AttachmentType;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.beans.utils.ArchivoAdjunto;
import mx.com.sky.sel.services.corporativos.ServiciosCorporativosPSManagementBean;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.solicitudservicio.ServicioSolicituServicio;
import mx.com.sky.sel.utils.JavaUtils;

@Stateless(name = "ServicioPagosEventosPSManagement", mappedName = "SEL-ServicioPagosEventosPSManagement")
public class ServicioPagosEventosPSManagementBean implements Serializable, ServicioPagosEventosPSManagement,
                                                             ServicioPagosEventosPSManagementLocal {
    @SuppressWarnings("compatibility:4112375201594141814")
    private static final long serialVersionUID = 4478138753060599919L;
    @Resource
    SessionContext sessionContext;

    public ServicioPagosEventosPSManagementBean() {
    }

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
   public List<Evento> obtenerPPEventos(String tipoPPE, String pais, String banderaHD, String paquete,
                                          String tipoCuenta) {
        List<Evento> eventos = new ArrayList<Evento>();
        List<String> ppePermitidos = null;
        Evento event = null;
        String modalidad = "";
        ConsultaPagosPorEvento_Service consultaPagosPorEvento_Service;
        ConsultaPagosPorEvento consultaPagosPorEvento;
        ConsultaPagosPorEventoProcessRequest payload;
        ConsultaPagosPorEventoProcessResponse resultado;

        boolean filtrarPPE = false;
        if (tipoPPE.equalsIgnoreCase("2")) {
            modalidad = "EVENT";
        } else {
            modalidad = "ALL DAY";
        }
        
        //String pais = sesion.getSuscriptor().getPais();
        //banderaHD = sesion.getSuscriptor().isEquipoHD() ? "Y" : "N";
        //String paquete = sesion.getSuscriptor().getPaquete();
        /*String tipoCuenta="";
        if (sesion.isCuentaNewEra()) {
                tipoCuenta ="%N%";
        }else if (sesion.isCuentaVETVHD() || sesion.isCuentaVETVPLUSHD()) {
                tipoCuenta ="%N%";
        }else{
            tipoCuenta = "%T%";
        }*/
        
        try {
            consultaPagosPorEvento_Service = new ConsultaPagosPorEvento_Service();
            consultaPagosPorEvento = consultaPagosPorEvento_Service.getConsultaPagosPorEvento();

            payload = new ConsultaPagosPorEventoProcessRequest();
            payload.setCountry(pais);
            payload.setBanderaHD(banderaHD);
            payload.setTipoConsulta(tipoPPE);
            payload.setTipoCuenta(tipoCuenta);
            payload.setPaquete(paquete);
            resultado = consultaPagosPorEvento.process(payload);

            if (resultado != null) {
                for (ConsultaPagosPorEventoProcessResponse.PPE ppe : resultado.getPPE()) {
                    if (paquete.contains("ACCESS")) {
                        // Se agrega Reestriccion para PAQUETE ACCESS SOLO VE WWE en MODALIDAD EVENT
                        // Otro CASO ve TODOS
                        if (modalidad.equalsIgnoreCase("EVENT") && ppe.getDISPLAYVALUE().contains("WWE")) {
                            event = ppeToEvento(ppe, modalidad);
                            eventos.add(event);
                        } else if (modalidad.equalsIgnoreCase("ALL DAY")) {
                            event = ppeToEvento(ppe, modalidad);
                            eventos.add(event);
                        }
                    } else {
                        // Aqui se el m\u00E9todo NORMAL sin reestricciones de PAQUETE  ni otro ESTILO
                        event = ppeToEvento(ppe, modalidad);
                        eventos.add(event);
                    }
                }
                //}
            }
            else{
                LogPC.println(this, "eventos null");
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }
        LogServicios.println(this, "VALOR DEL RETURN DE EVENTOS DOS ++ =======" + eventos);
        LogPC.println(this, "RESULTADO DE CONSULTA EVENTOS DEL DC =====" + eventos);
        return eventos;
    }

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Horario> obtenerHorariosPPE(String canal, String tituloEvento, String diferenciaGMT, String pais,
                                             String tipoEvento) {
        List<Horario> horarios = new ArrayList<Horario>();
        Horario horario = null;
        ConsultaHorariosPagoPorEvento_Service consultaHorariosPagoPorEvento_Service;
        ConsultaHorariosPagoPorEvento consultaHorariosPagoPorEvento = null;
        ConsultaHorariosPagoPorEventoProcessRequest payload;
        ConsultaHorariosPagoPorEventoProcessResponse resultado = null;

        try {
            LogServicios.println(this,
                                 "obtenerHorariosPPE(String canal[" + canal + "], String tituloEvento[" + tituloEvento +
                                 "], String diferenciaGMT[" + diferenciaGMT + "], String pais[" + pais +
                                 "], String tipoEvento[" + tipoEvento + "])");
            consultaHorariosPagoPorEvento_Service = new ConsultaHorariosPagoPorEvento_Service();
            consultaHorariosPagoPorEvento = consultaHorariosPagoPorEvento_Service.getConsultaHorariosPagoPorEvento();

            payload = new ConsultaHorariosPagoPorEventoProcessRequest();
            payload.setCanal(canal);
            payload.setDiferenciaGMT(diferenciaGMT);
            payload.setPais(pais);
            payload.setNombrePelicula(tituloEvento);
            payload.setTipoEvento(tipoEvento);
            resultado = consultaHorariosPagoPorEvento.process(payload);

            if (resultado == null) {
                LogPC.printlnWarn(this, "horarios null");
            } else if (resultado.getResultCode().equalsIgnoreCase("0")) {
                for (ConsultaHorariosPagoPorEventoProcessResponse.Horarios horarioPPV : resultado.getHorarios()) {
                    horario = convertHorario(horarioPPV);
                    horarios.add(horario);
                }
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }

        return horarios;
    }
    
    private Evento ppeToEvento(ConsultaPagosPorEventoProcessResponse.PPE ppe, String modalidad) {
        Evento evento = new Evento();
        evento.setCanal(ppe.getCHANNEL() + "");
        evento.setSinopsis(ppe.getSINOPSISVALUE());
        evento.setModalidad(modalidad);
        evento.setPrecio(ppe.getPRICE());
        evento.setTitulo(ppe.getDISPLAYVALUE());
        evento.setCanalDisplay(ppe.getCHANNELDISPLAY());
        evento.setImage(ppe.getIMG());
        //agrega codigo de idioma y subtitulos de los ppe
        evento.setIdioma(ppe.getIDIOMA());
        evento.setSubtitulos(ppe.getSUBTITULOS());
        evento.setTituloMensaje(ppe.getTITULO());
        evento.setMensaje(ppe.getMENSAJE());
        return evento;
    }

    private Horario convertHorario(ConsultaHorariosPagoPorEventoProcessResponse.Horarios horarioPPV) {
        Horario horario = new Horario();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm aaa");
        Date fechaDate = null;
        Timestamp fechaTS = null;
        String fecha = "";

        try {
            LogServicios.println(this, horarioPPV.getPPVEVENTID());
            horario.setPpveventid(horarioPPV.getPPVEVENTID() + "");
            horario.setDuration(horarioPPV.getDURATION().intValue());
            horario.setToken(horarioPPV.getTOKENVALUE().toString());
            fechaDate = JavaUtils.asDate(horarioPPV.getSTARTDATE());
            fechaTS = JavaUtils.asTimestamp(horarioPPV.getSTARTDATE());
            if (fechaDate != null) {
                fecha = sdf.format(fechaDate);
                horario.setFechaInicio(fecha);
                horario.setFechaInicioTS(fechaTS);
            }
            fechaDate = JavaUtils.asDate(horarioPPV.getENDDATE());
            fechaTS = JavaUtils.asTimestamp(horarioPPV.getENDDATE());
            if (fechaDate != null) {
                fecha = sdf.format(fechaDate);
                horario.setFechaFin(fecha);
                horario.setFechaFinTS(fechaTS);
            }

            fechaDate = JavaUtils.asDate(horarioPPV.getEXPIRYDATE());
            fechaTS = JavaUtils.asTimestamp(horarioPPV.getEXPIRYDATE());
            if (fechaDate != null) {
                fecha = sdf.format(fechaDate);
                horario.setFechaExpiracion(fecha);
                horario.setFechaExpiracionTS(fechaTS);
            }
            horario.setTituloCanal(horarioPPV.getCHANNELTITLE());
            horario.setIsPackage(horarioPPV.getISPACKAGE());
            horario.setMinutosPrevios(horarioPPV.getPREVIEWMINUTES());
            horario.setTokenPSC(horarioPPV.getPSCTOKEN());
            horario.setMinutosLibres(horarioPPV.getFREEMINUTES());
            horario.setEventoLibre(horarioPPV.getFREEEVENT());
            if (horarioPPV.getLASTORDERDATE() != null) {
                fechaDate = JavaUtils.asDate(horarioPPV.getLASTORDERDATE());
                fechaTS = JavaUtils.asTimestamp(horarioPPV.getLASTORDERDATE());
                if (fechaDate != null) {
                    fecha = sdf.format(fechaDate);
                    horario.setFechaUltimaOrden(fecha);
                    horario.setFechaUltimaOrdenTS(fechaTS);
                }
            }
            horario.setSubjectMaterRating(horarioPPV.getSUBJECTMATTERRATING());
            horario.setTipoOrden(horarioPPV.getORDERTYPE());
            horario.setProviderEventId(horarioPPV.getPROVIDEREVENTID());
            horario.setPpvClass(horarioPPV.getPPVCLASS());
            if (horarioPPV.getPPVGENREID() != null) {
                horario.setPpvGenreId(horarioPPV.getPPVGENREID().toString());
            }
            horario.setSkyTrackingId(horarioPPV.getSKYTrackingId());
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }
        return horario;
    }


    public List<Evento> getPagoPorEventosContratados(String tarjetaInteligente, String cuentaSKY, String sistema) {
        ConsultaPPEContratados_Service consultaPPEContratados_Service;
        ConsultaPPEContratados consultaPPEContratados;
        List<Evento> eventos = new ArrayList<Evento>();
        Evento event = null;
        try {
            consultaPPEContratados_Service = new ConsultaPPEContratados_Service();
            consultaPPEContratados = consultaPPEContratados_Service.getConsultaPPEContratados();
            ConsultaPPEContratadosProcessRequest payload = new ConsultaPPEContratadosProcessRequest();
            ConsultaPPEContratadosProcessResponse resultado;

            payload.setTarjetaInteligente(tarjetaInteligente);
            payload.setCuentaSKY(cuentaSKY);
            payload.setSistema(sistema);

            resultado = consultaPPEContratados.process(payload);
            if (resultado != null) {
                LogServicios.println(this, resultado.getPPEContratados());
                for (ConsultaPPEContratadosProcessResponse.PPEContratados ppe : resultado.getPPEContratados()) {
                    event = ppeContratadoToEvento(ppe);
                    eventos.add(event);
                }
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }
        return eventos;
    }
    private Evento ppeContratadoToEvento(ConsultaPPEContratadosProcessResponse.PPEContratados ppe) {
        Evento evento = new Evento();

        evento.setCanal(ppe.getCanal() + "");
        evento.setSinopsis("");
        evento.setModalidad(ppe.getCurrency() + "");
        evento.setPrecio(ppe.getPRECIO() + "");
        evento.setTitulo(ppe.getEVENTO());
        if (ppe.getHoraExpiracion() != null) {
            evento.setHoraExpiracion(xmlGregorianCalendarToString(ppe.getHoraExpiracion()));
        }
        if (ppe.getHoraPedido() != null) {
            evento.setHoraPedido(xmlGregorianCalendarToString(ppe.getHoraPedido()));
        }
        evento.setHoraEvento(ppe.getFECHATRANSMISION());
        evento.setStatus(ppe.getESTATUSEVENTO());
        return evento;
    }
    private String xmlGregorianCalendarToString(XMLGregorianCalendar date) {
        if (date == null) {
            return "";
        }
        Format formatter = null;
        String fecha;
        Date fechaDate = null;

        try {
            fechaDate = date.toGregorianCalendar().getTime();
            formatter = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
            fecha = formatter.format(fechaDate);
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            fecha = "";
        }
        return fecha;
    }
    
    public List<String> consultarPPEPermisos(String paisISO, String tipoPPE, String paqute) throws ServicioException {
        List<String> listaPPEPermitidos = new ArrayList<String>();
        ConsultappepermisosClientEp consultappepermisos_client_ep = null;
        ConsultaPPEPermisos consultaPPEPermisos = null;
        ConsultaPermisosInType payload = null;
        ConsultaPermisosOutType response = null;

        try {
            consultappepermisos_client_ep = new ConsultappepermisosClientEp();
            consultaPPEPermisos = consultappepermisos_client_ep.getConsultaPPEPermisosPt();
            payload = new ConsultaPermisosInType();
            payload.setPais(paisISO);
            payload.setPaquete(paqute);
            payload.setTipoPPE(tipoPPE);

            response = consultaPPEPermisos.process(payload);

                if (response != null && response.getRespuesta().equals("0")) {
                if (response.getConsultaPPEPermisos() != null) {
                    for (ConsultaPPEPermisosType object : response.getConsultaPPEPermisos()) {
                        listaPPEPermitidos.add(object.getCANAL());
                    }
                }
            }
        } catch (Exception e) {
            LogServicios.printlnError(e);
            throw new ServicioException("Error al consumir servicio");
        }
        return listaPPEPermitidos;
    }
    
    private Evento ppeContratadoToEvento(ResultadosConsultaPPVContratadosSalidaTYPE ppe) {
        Evento evento = new Evento();

        evento.setCanal(ppe.getCANAL() + "");
        evento.setSinopsis("");
        evento.setPrecio(ppe.getPRECIO() + "");
        evento.setTitulo(ppe.getTITULO());

        //getHoraPedido
        if (ppe.getFECHAORDEN() != null) {
            evento.setHoraPedido(ppe.getFECHAORDEN());
        }
        evento.setHoraEvento(ppe.getFECHATRANSMISION());
        evento.setStatus(ppe.getESTATUSEVENTO());
        return evento;
    }
    
    public String crearSolicitud(SolicitudServicioBean solicitudServicio) throws Exception {
        ServicioSolicituServicio sss = new ServicioSolicituServicio();
        //Codigo para contratar canal
        String respuesta = "";

        solicitudServicio.setArea("Administracion de senal");
        solicitudServicio.setSubArea("Solicitud de OPPV");

        respuesta = sss.crearSolicitud(solicitudServicio);
        return respuesta;
    }
    public String crearSolicitud(SolicitudServicioBean solicitudServicio, List<String> tis, String nombreCorporativo,
                                 String sistema) throws ServicioException {
        //Codigo para contratar canal
        ServiciosCorporativosPSManagementBean sc = new ServiciosCorporativosPSManagementBean();
        String respuesta = "";

        solicitudServicio.setArea("Administracion de senal");
        solicitudServicio.setSubArea("Solicitud de OPPV");

        respuesta = sc.crearSolicitudPPV(solicitudServicio, tis, nombreCorporativo, sistema);
        return respuesta;
    }
    public String cargaEventosArchivos(List<ArchivoAdjunto> adjuntos) throws ServicioException {
        EmailserviciosenlineaClientEp emailserviciosenlinea_client_ep;

        EmailServiciosEnLinea emailServiciosEnLinea = null;
        BPELCargaArchivoEventos bpelCargaArchivoEventos;
        BpelcargaarchivoeventosClientEp bpelCargaArchivoEventosClientEp;
        Process payload;
        ProcessResponse response;
        List<AttachmentType> attachments;


        try {
            LogServicios.println(this, "cargaEventosArchivos adjuntos: " + adjuntos.size());
            bpelCargaArchivoEventosClientEp = new BpelcargaarchivoeventosClientEp();
            bpelCargaArchivoEventos = bpelCargaArchivoEventosClientEp.getBPELCargaArchivoEventosPt();
            AttachmentType attachment = null;
            //AttachmentType attachmentContent = null;
            attachments = new ArrayList<AttachmentType>();
            if (adjuntos != null) {
                for (ArchivoAdjunto archivoAdjunto : adjuntos) {
                    attachment = new AttachmentType();
                    //attachments

                    attachment.setFileBase64(archivoAdjunto.getFileBase64());
                    attachment.setFileName(archivoAdjunto.getFileName());

                    attachments.add(attachment);

                }
            }
            bpelCargaArchivoEventos.process(attachments);

        } catch (Exception e) {
            LogServicios.printlnError(e);
            throw new ServicioException("Ocurri\u00F3 un error al enviar el correo por favor intente m\u00E1s tarde");

        }
        return "OK";
    }
}
