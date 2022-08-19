package mx.com.sky.sel.managedbeans.adultos;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import java.sql.Timestamp;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.List;

import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.services.beans.eventos.Evento;
import mx.com.sky.sel.services.beans.eventos.Horario;
import mx.com.sky.sel.log.LogPC;
import static mx.com.sky.sel.log.LogPC.println;
import static mx.com.sky.sel.log.LogPC.printlnError;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.managedbeans.sesion.SesionMB;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.eventos.ServicioPagosEventosPSManagementBean;

import mx.com.sky.sel.services.utils.SolicitudServicioUtils;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.UtileriasMB;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.event.DialogEvent;

public class BBAdultos extends UtileriasMB implements Serializable{
    @SuppressWarnings("compatibility:5530295344540541093")
    private static final long serialVersionUID = 7513647322151604658L;
    private List<Evento> mosaicoEventos;
    private Evento eventos[];
    private Evento evento;
    private String tarjetaInteligente;
    private Horario horario;

    //Popup de Confirmacion de Operacion
    private transient RichPopup popup;
    private static final String MENSAJE_ADULTOS_CONTRATADO = "bbadultos.canalcontratado";

    public BBAdultos() {
        eventos = new Evento[1];
        println(this, "BBAdultos Creado");
        obtenerEventos();
        evento = new Evento();
        tarjetaInteligente = "";
    }

    /**
     *  Paso 1 : Al dar clic a la imagen para seleccionar un canal de adultos
     *  muestra el popup de confirmacion
     * @return
     */
    public String showPopupEvento() {
        //ADFUtils.showPopup(popup);
        return "ppe";
    }

    /**
     * Obtener eventos
     */
    private void obtenerEventos() {
        //DCAdultos dcAdultos = null;
        List<Evento> events = null;
        //dcAdultos = new DCAdultos();
        events = obtenerPPEventos("3");
        if (events == null) {
            println(this, "events null");
            mosaicoEventos = new ArrayList<Evento>();
        } else {
            mosaicoEventos = events;
            eventos = events.toArray(new Evento[] { });
        }
        
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_PPV_ADULTOS);
    }

        public List<Evento> obtenerPPEventos(String tipoPPE) {
            List<Evento> eventos = null;
            List<Evento> eventosSinHD = null;
            ServicioPagosEventosPSManagementBean spe = null;
            spe = new ServicioPagosEventosPSManagementBean();
            SesionMB sesion = null;
            sesion = (SesionMB)JSFUtils.getBean("sesion");
            String pais = sesion.getSuscriptor().getPais();
            String paquete = sesion.getSuscriptor().getPaquete().trim();
            String banderaHD = sesion.getSuscriptor().isEquipoHD() ? "Y" : "N";
            
            String tipoCuenta="";
            if (sesion.isCuentaNewEra()) {
                tipoCuenta ="%N%";
            }else if (sesion.isCuentaVETVHD() || sesion.isCuentaVETVPLUSHD()) {
                tipoCuenta ="%N%";
            }else{
                tipoCuenta = "%T%";
            }
            eventos = spe.obtenerPPEventos(tipoPPE, pais, banderaHD, paquete,tipoCuenta);
            if (eventos == null) {
                LogPC.printlnWarn(this, "eventos null");
                eventos = new ArrayList<Evento>();
            }
            return eventos;
        }

    /**
     * Paso 2 : aceptar o cancelar contratacion de adultos
     * @param dialogEvent
     */
    public void listenerPopupEvento(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome().ok == DialogEvent.Outcome.ok) {
            if (contratar()) {
                println(this, "Popup EventoAdults OK");
            } else {
                println(this, "Popup EventoAdults NOK");
            }
        }
        ADFUtils.hidePopup(popup);
    }

    /**
     * Paso 3 : Si acepta se realiza la contratacion
     * del canal de adulto.
     * @return
     */
    private boolean contratar() {
        String numeroSolicitud;
        boolean respuesta = false;

        //Coigo para contratar canal
        // Add event code here...
        ServicioPagosEventosPSManagementBean spe;
        spe = new ServicioPagosEventosPSManagementBean();

        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String diferenciaHoraria = sesion.getSuscriptor().getDiferenciaHoraria();
        SolicitudServicioBean solicitudServicio = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
        String tipoEvento = "";
        ;
        try {
            //tipoEvento=
            horario = new Horario();
            horario.setFechaInicio(ADFUtils.getValueStringBindings("fechaInicio.inputValue"));
            horario.setPpveventid(ADFUtils.getValueStringBindings("ppveventid.inputValue"));
            horario.setFechaExpiracionTS((Timestamp)ADFUtils.getValue("bindings.fechaExpiracionTS.inputValue"));
            horario.setFechaInicioTS((Timestamp)ADFUtils.getValue("bindings.fechaInicioTS.inputValue"));
            horario.setToken(ADFUtils.getValueStringBindings("token.inputValue"));
            horario.setDuration(Integer.valueOf(ADFUtils.getValueStringBindings("duration")));
            println(this, "setPpveventid:" + horario);
            solicitudServicio = SolicitudServicioUtils.convert(solicitudServicio, evento.getTitulo());

            evento.setId(horario.getPpveventid());
            evento.setDiferenciaHoraria(diferenciaHoraria);
            evento.setToken(horario.getToken());
            evento.setHoraExpiracion(sdf.format(horario.getFechaExpiracionTS()));
            evento.setHoraEvento(sdf.format(horario.getFechaInicioTS()));
            evento.setDuracion(horario.getDuration().toString());

            evento.setSubjectMaterRating(horario.getSubjectMaterRating());
            evento.setProviderEventId(horario.getProviderEventId());
            evento.setPpvClass(horario.getPpvClass());
            evento.setPpvGenreId(horario.getPpvGenreId());
            evento.setSkyTrackingId(horario.getSkyTrackingId());
            evento.setTipoOrden(horario.getTipoOrden());
            if (sesion.getSistema().equalsIgnoreCase("HIJUMP")) {
                evento.setId(horario.getSkyTrackingId());
            }

            evento.setTipoEvento(tipoEvento);
            sdf = new SimpleDateFormat("dd/MM/yyyy");
            String cadenaFecha = sdf.format(horario.getFechaInicioTS());
            cadenaFecha += " a las ";
            sdf = new SimpleDateFormat("HH:mm");
            cadenaFecha += sdf.format(horario.getFechaInicioTS());
            evento.setHoraPedido(cadenaFecha);

            sdf = new SimpleDateFormat("dd/MM/yyyy");
            cadenaFecha = sdf.format(horario.getFechaFinTS());
            cadenaFecha += " a las ";
            sdf = new SimpleDateFormat("HH:mm");
            cadenaFecha += sdf.format(horario.getFechaFinTS());
            evento.setHoraCancelacion(cadenaFecha);
            LogPC.println(this, "tarjetaInteligente:" + tarjetaInteligente);
            solicitudServicio.setTarjetaInteligente(tarjetaInteligente);
            solicitudServicio.setInfoPPE(evento);
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.PPV_ADULTOS);
            numeroSolicitud = spe.crearSolicitud(solicitudServicio);
            respuesta = true;
            tarjetaInteligente = "";

            ADFUtils.showInfoMessage(ADFUtils.getString(MENSAJE_ADULTOS_CONTRATADO));
        } catch (Exception e) {
            printlnError(this, "Error contratacion: " + e.getMessage());
            e.printStackTrace();
            ADFUtils.showErrorMessage(getMensajeProperties("mensaje_PantallaError_generico"));
            respuesta = false;
        }
        return respuesta;
    }


    public void setEventos(Evento[] eventos) {
        this.eventos = eventos;
    }

    public Evento[] getEventos() {
        return eventos;
    }
    
    public int getSizeEventos(){
        if(eventos==null){
            return 0;
        }
        return eventos.length;
    }


    public void setMosaicoEventos(List<Evento> mosaicoEventos) {
        this.mosaicoEventos = mosaicoEventos;
    }

    public List<Evento> getMosaicoEventos() {
        return mosaicoEventos;
    }

    public int getSizeMosaicoEventos() {
        if (mosaicoEventos == null) {
            return 0;
        }
        return mosaicoEventos.size();
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setPopup(RichPopup popup) {
        this.popup = popup;
    }

    public RichPopup getPopup() {
        return popup;
    }


    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Horario getHorario() {
        return horario;
    }


    public void setTarjetaInteligente(String tarjetaInteligente) {
        this.tarjetaInteligente = tarjetaInteligente;
    }

    public String getTarjetaInteligente() {
        return tarjetaInteligente;
    }


    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        LogPC.println(this, "Serializando BBAdultos: " + mosaicoEventos);
        LogPC.println(this, "Serializando BBAdultos: " + eventos);
    }

    private void readObject(ObjectInputStream in) throws IOException {
        try {
            in.defaultReadObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        LogPC.println(this, "DeSerializando BBAdultos :" + mosaicoEventos);
        LogPC.println(this, "DeSerializando BBAdultos :" + eventos);
    }
    }
