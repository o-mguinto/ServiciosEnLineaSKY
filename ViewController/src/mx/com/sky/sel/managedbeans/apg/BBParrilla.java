package mx.com.sky.sel.managedbeans.apg;

import java.io.Serializable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.services.apg.ServicioAPG;
import mx.com.sky.sel.services.beans.apg.HorarioPagina;
import mx.com.sky.sel.services.beans.apg.Programacion;
import mx.com.sky.sel.services.beans.apg.RemoteBooking;
import mx.com.sky.sel.services.beans.utils.CalendarUtils;
import mx.com.sky.sel.services.beans.utils.TarjetaInteligente;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.solicitudservicio.ServicioSolicituServicio;
import mx.com.sky.sel.services.ti.SerivcioTarjetaInteligente;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.DVMUtils;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import oracle.adf.view.rich.component.rich.RichPopup;

public class BBParrilla implements Serializable {
    @SuppressWarnings("compatibility:-1182862212388398571")
    private static final long serialVersionUID = -5513860069914519040L;
    private static final String NO_DISPONIBLE = "0000";
    
    private final static String SKY_PLUS_HD = "SKY PLUS HD";
    private final static String HMC = "SKY HMC PHD";
    private final static String HMC_ULTRA_4K = "SKY HMC UHD";
        
        
    //fecha actual
    private Date fecha;
    
    //Popups
    private transient RichPopup popupRemoteBookingPorPrograma;
    private transient RichPopup popupRemoteBookingPorProgramaHMC;
    private transient RichPopup popupRemoteBookingPorHorario;
    
    //la lista de programaciones para hacer render
    private List<Programacion> programaciones;
    
    private List<HorarioPagina> horarios;
    
    //tamano del bloque
    private int intervaloMinutos;
    
    //bloques a mostrar
    private int numIntervalos;
    
    //subloques en los que se divide el bloque
    private int subintervaloMinutos;
    
    //num de registros a mostrar -1 sin limite 
    private int numRegistros;
    
    //fecha hora minuto en que empieza la parrilla
    private Date horaInicio;
    
    //fecha hora minuti en que termina la parrilla
    private Date horafin;
    
    //lista de strings con los encabezados de la parrilla, es decir las horas
    private List<String> encabezados = new ArrayList<String>();
    
    private String tipoProgramacion ="ALL";
    
    private int canalInicio = 1;
    
    private int canalFin = 900;
    
    private RemoteBooking remoteBooking = new RemoteBooking();;
    
    private int subintervalos;
    
    private HorarioPagina horarioPagina;
    
    private static final int PAGINA_LIMITE = 5;
    
    private int paginaActiva;
    
    private List<TarjetaInteligente> tarjetas = new ArrayList<TarjetaInteligente>();

    public BBParrilla() {
        
        //obtener la fecha hora minuto actual
        fecha = new Date();//CalendarUtils.getDateFromString("15/07/2014 09:15");//new Date(); //
        
        //se calcula la hora inicio en el minuto cero de la hora que esta corriendo
        horaInicio = CalendarUtils.getHoraInicioFromDate(fecha);
     
        //4 intervalos de 30 minutos
        //4 intervalos de 30 minutos = 4*6 = 24 subintervalos
        this.numIntervalos = 8;         
        
        //muestra todos los registros
        this.numRegistros = -1;
        
        //30 minutos es el intervalo que ve el usuario,  6 subintervalos
        this.intervaloMinutos = 30;  
        
        //5minutos es la unidad minima
        this.subintervaloMinutos = 5;
        
        //cuantos subintervalos tiene el intervalo
        this.subintervalos = this.intervaloMinutos/this.subintervaloMinutos;
        
        //se calcula hora fin con base a los parametros dados.
        this.horafin = CalendarUtils.getFechaFin(horaInicio,numIntervalos*intervaloMinutos);    
        
        //generamos los encabezados
        this.encabezados = CalendarUtils.getListAddHoursFromDateUsingInterval(CalendarUtils.getHoraInicioFromDate(fecha),intervaloMinutos,numIntervalos);
        
        //calculamos la lista de programas
        ServicioAPG servicioAPG = new ServicioAPG();
        int horas = (numIntervalos * intervaloMinutos) / 60;
        
        this.horarios = CalendarUtils.creaHorarios(horaInicio,numIntervalos,intervaloMinutos, BBParrilla.PAGINA_LIMITE);
        
        this.horarioPagina = horarios.get(0);
        this.programaciones = servicioAPG.consultarGuiaProgramacion("PARRILLA", getBouquetConsultaGuia(), subintervaloMinutos, horarioPagina.getHoraFin());
        //this.programaciones =
          //  servicioAPG.consultaProgramaciones(tipoProgramacion,
            //                                   horarioPagina.getHoraInicio(),
              //                                 horas,
                //                               canalInicio,
                  //                             canalFin,
                    //                           subintervaloMinutos,
                      //                         horarioPagina.getHoraFin());
        
        this.paginaActiva = 0;
        
        
        
    }

        public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setProgramaciones(List<Programacion> programaciones) {
        this.programaciones = programaciones;
    }

    public List<Programacion> getProgramaciones() {
        return programaciones;
    }

    public void setIntervaloMinutos(int intervaloMinutos) {
        this.intervaloMinutos = intervaloMinutos;
    }

    public int getIntervaloMinutos() {
        return intervaloMinutos;
    }

    public void setNumIntervalos(int numIntervalos) {
        this.numIntervalos = numIntervalos;
    }

    public int getNumIntervalos() {
        return numIntervalos;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }


    public void setWidth(String width) {
        //this.width = width;
    }
    
    public String getNombreCarpetaImg(){
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        DVMUtils dvmUtils = new DVMUtils();
        String respuesa = null;
        try {
          respuesa  =  dvmUtils.lookupValue("/u01/oracle/apps_data/pagWeb/archivos/dvm/CatalogoPaqueteGuia.dvm", "GP_NOMBRE_OFERTA", sesion.getSuscriptor().getPaquete(), "GP_CARP_IMG", "default");
        } catch (Exception e) {
            LogPC.printlnError(e);
        }
        return respuesa;
    }
    public String getBouquetConsultaGuia(){
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        DVMUtils dvmUtils = new DVMUtils();
        String respuesa = null;
        try {
          respuesa  =  dvmUtils.lookupValue("/u01/oracle/apps_data/pagWeb/archivos/dvm/CatalogoPaqueteGuia.dvm", "GP_NOMBRE_OFERTA", sesion.getSuscriptor().getPaquete(), "GB_BOUQUETID", "default");
        } catch (Exception e) {
            LogPC.printlnError(e);
        }
        return respuesa;
    }
    public static void main(String[] args) {
        System.out.println("ConsultarLaRutaImagen  ==== " );
        DVMUtils dvmUtils = new DVMUtils();
        String respuesta = null;
        try {
            respuesta = dvmUtils.lookupValue("C:\\u01\\oracle\\apps_data\\pagWeb\\archivos\\dvm\\CatalogoPaqueteGuia.dvm", "GP_NOMBRE_OFERTA", "FUN", "GB_BOUQUETID", "default");
        } catch (Exception e) {
        }
        System.out.println("RespuestaProceso   ===== " +respuesta);
    }
    public String getWidth() {
        return ""+(100/(this.numIntervalos+1))+"%";
    }

    public void setEncabezados(List<String> encabezados) {
        this.encabezados = encabezados;
    }

    public List<String> getEncabezados() {
        return encabezados;
    }

    public void setNumRegistros(int numRegistros) {
        this.numRegistros = numRegistros;
    }

    public int getNumRegistros() {
        return numRegistros;
    }

    public void setSubintervaloMinutos(int subintervaloMinutos) {
        this.subintervaloMinutos = subintervaloMinutos;
    }

    public int getSubintervaloMinutos() {
        return subintervaloMinutos;
    }
    
    public List<SelectItem> getTarjetasInteligentes(){
        List<SelectItem> items = new ArrayList<SelectItem>();
        for (TarjetaInteligente ti : this.tarjetas) {
            items.add(new SelectItem(ti,
                                     ti.getTarjetaInteligente().concat("/").concat(ti.getUbicacion())));
        }
        return items;
    }
    public void setTarjetasInteligentes(){
        //
    }
    
    public void setRemoteBooking(RemoteBooking remoteBooking) {
        this.remoteBooking = remoteBooking;
    }

    public RemoteBooking getRemoteBooking() {
        return remoteBooking;
    }
    
    public void validaGrabarEvento(ActionEvent actionEvent) {
        //se reciben los datos del canal y evento por setpropertylisten
        //si tiene equipos para remotebooking
        String rowId = (String)ADFUtils.getValue("sesion.suscriptor.rowId");
        SerivcioTarjetaInteligente servicio = new SerivcioTarjetaInteligente();
        List<TarjetaInteligente> tarjetas = servicio.getTarjetaInteligente(rowId);
        boolean puede = false;
        this.tarjetas.clear();
        
        for(TarjetaInteligente ti : tarjetas){
            if(ti.getCategoria().equals(BBParrilla.SKY_PLUS_HD) || ti.getCategoria().equals(BBParrilla.HMC) || ti.getCategoria().equals(BBParrilla.HMC_ULTRA_4K)){
                this.tarjetas.add(ti);
                puede = true;
            }
        }
        
            if (puede) {                 
            if (!this.remoteBooking.getCanal().isCanalGrabable() ||
                !this.remoteBooking.getEvento().esDisponibleParaGrabar()) {
                ADFUtils.showInfoMessage("Evento no disponible para grabar.");
                return;
            }
                for(TarjetaInteligente ti : tarjetas){
                    if(ti.getCategoria().equals(BBParrilla.SKY_PLUS_HD) || ti.getCategoria().equals(BBParrilla.HMC)){
                        ADFUtils.showPopup(popupRemoteBookingPorPrograma);
                    }else if (ti.getCategoria().equals(BBParrilla.HMC_ULTRA_4K)) {
                        ADFUtils.showPopup(popupRemoteBookingPorProgramaHMC);
                 }
                }
        } else {
            ADFUtils.showErrorMessage("Necesitas tener un equipo SKY+HD o SKY Super Plus HD para grabar programas. " +
                                      "Contrátelo llamando al 5169 00 00, opción 5.");
        }
    }
    /**
     *
     * @param actionEvent
     */
    
    /**
     * obtiene la psicion para mostrar la hora
     * @return
     */
    public int getPosicionHora(){
        Date horaActual = new Date();
        //System.out.println(horaActual +" "+this.horaInicio);
        long diferencia = horaActual.getTime() - this.horaInicio.getTime();
        //convertirla a minutos
        int minutos = (int)diferencia / 1000 /60;
        //posicion es subintervalos + minutos / subintervalomntos 
        int subloques = this.intervaloMinutos / this.subintervaloMinutos;
        
        int posicion = subloques +  (minutos / this.subintervaloMinutos);
        return posicion;      
    }
    
    /**
     * Permite al usuario enviar una señal de grabacion
     * @return
     */
    public String grabarRemoteBooking() {
        // Add event code here...
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        mx.com.sky.enterpriseflowmessage.sel.ejecutarremotebooking.RemoteBookingRequestEBMType request = new  mx.com.sky.enterpriseflowmessage.sel.ejecutarremotebooking.RemoteBookingRequestEBMType();
        request.setNumeroCuenta(sesion.getSuscriptor().getCuentaSKY());
        request.setTarjetaInteligente(this.remoteBooking.getTi().getTarjetaInteligente());
        request.setNumeroComercial(this.remoteBooking.getCanal().getIdMostrado());
        request.setIdentificadorCanalUnico(this.remoteBooking.getCanal().getIdentificador());
        request.setNombreCanal(this.remoteBooking.getCanal().getCanalNombre());
        request.setNombreEvento(this.remoteBooking.getEvento().getTitulo());
        request.setEventId(this.remoteBooking.getEvento().getEventId());
        request.setContentId(this.remoteBooking.getEvento().getContentId());
        request.setContentProvider(this.remoteBooking.getEvento().getContentProviderId());
        request.setOriginalNetwork(this.remoteBooking.getEvento().getNetworkId());
        request.setTransportStream(this.remoteBooking.getEvento().getTransportStreamId());
        request.setSeriesId(this.remoteBooking.getEvento().getSeriesId());
        request.setProgramId(this.remoteBooking.getEvento().getProgramId());
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        request.setFechaInicio(dateFormat.format(this.remoteBooking.getEvento().getFechaInicio()));
        request.setFechaFin(dateFormat.format(this.remoteBooking.getEvento().getFechaFin()));
        request.setTipoGrabacion(this.remoteBooking.getMethodType());
        request.setDuracion(this.remoteBooking.getEvento().getDuracion());
        request.setTipoContenido(this.remoteBooking.getRecordingType());
        //request.setRecurrencia(this.remoteBooking.());
        request.setRecordatorio(this.remoteBooking.getRecordatorioGrabacion());
        request.setUserName(sesion.getUsuario().getMail());
        request.setSessionID(sesion.getIdSesion());
        request.setCategoria(sesion.getSuscriptor().getPaquete());
        request.setPais(sesion.getSuscriptor().getPaisISO());
        
        /*SolicitudServicioBean solicitud = new SolicitudServicioBean();
        SolicitudServicioUtils.convert(solicitud, remoteBooking.getDescripcion());
        
        solicitud.setArea("Remote Booking");
        solicitud.setSubArea("Remote Booking");        
        solicitud.setRemoteBooking(this.remoteBooking);
        solicitud.setTarjetaInteligente(this.remoteBooking.getTi().getTarjetaInteligente());
        */
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.ACTIVAR_GRABACION_REMOTEBOOKING);
        ServicioSolicituServicio servicio = new ServicioSolicituServicio();
        try {
            String numSolicitud;
            mx.com.sky.enterpriseflowmessage.sel.ejecutarremotebooking.EjecutarRemoteBookingResponseEBFEBMType response = servicio.crearSolicitudRemoteBooking(request);
            ADFUtils.showInfoMessage("Se ha enviado la instrucción para grabar con el siguiente número de solicitud: " +
                                     response.getEjecutarRemoteBookingResponse().getSRNumber());
            ADFUtils.hidePopup(this.popupRemoteBookingPorProgramaHMC);
            ADFUtils.hidePopup(this.popupRemoteBookingPorPrograma);
        } catch (ServicioException e) {
            ADFUtils.showErrorMessage("Ocurrio un error al generar su solicitud",
                                      e.getMessage());
        }
        return null;
    }
    
    public void setHorarios(List<HorarioPagina> horarios) {
        this.horarios = horarios;
    }

    public List<HorarioPagina> getHorarios() {
        return horarios;
    }

    public void setHorarioPagina(HorarioPagina horarioPagina) {
        this.horarioPagina = horarioPagina;
    }

    public HorarioPagina getHorarioPagina() {
        return horarioPagina;
    }

    public void setPaginaActiva(int paginaActiva) {
        this.paginaActiva = paginaActiva;
    }

    public int getPaginaActiva() {
        return paginaActiva;
    }

    public String consultaProgramacionPorPagina() {
        // el numero de pagina fue enviado por listener previamente
        ServicioAPG servicioAPG = new ServicioAPG();
        int horas = (numIntervalos * intervaloMinutos) / 60;
        this.programaciones = servicioAPG.consultarGuiaProgramacion("PARRILLA", getBouquetConsultaGuia(), subintervaloMinutos, horarioPagina.getHoraFin());
        //this.programaciones =
          //  servicioAPG.consultaProgramaciones(tipoProgramacion,
            //                                   horarios.get(this.paginaActiva).getHoraInicio(),
              //                                 horas,
                //                               canalInicio,
                  //                             canalFin,
                    //                           subintervaloMinutos,
                      //                         horarios.get(this.paginaActiva).getHoraFin());
        Date fechaInicio = new Date();
        fechaInicio.setTime( horarios.get(this.paginaActiva).getHoraInicio().getTime());
        this.encabezados = CalendarUtils.getListAddHoursFromDateUsingInterval(fechaInicio,intervaloMinutos,numIntervalos);
        this.fecha = fechaInicio;
        return "";
    }

    public void consultaProgramacionPorPaginaListener(ActionEvent actionEvent) {
        // Add event code here...
        this.consultaProgramacionPorPagina();
    }
       
    public void setpopupRemoteBookingPorPrograma(RichPopup popupRemoteBookingPorPrograma) {
        this.popupRemoteBookingPorPrograma = popupRemoteBookingPorPrograma;
    }

    public RichPopup getpopupRemoteBookingPorPrograma() {
        return popupRemoteBookingPorPrograma;
    }
    
    public void setpopupRemoteBookingPorHorario(RichPopup popupRemoteBookingPorHorario) {
        this.popupRemoteBookingPorHorario = popupRemoteBookingPorHorario;
    }

    public RichPopup getpopupRemoteBookingPorHorario() {
        return popupRemoteBookingPorHorario;
    }
    
   /* public static void main(String[] args) {
        TimeZone timeZone1 = TimeZone.getTimeZone("America/Los_Angeles");
        TimeZone timeZone2 = TimeZone.getTimeZone("Europe/Copenhagen");

        Calendar calendar = Calendar.getInstance();

        long timeCPH = calendar.getTimeInMillis();
        LogPC.println("BBParrilla", "timeCPH  "+timeCPH);
        LogPC.println("BBparrilla", "hour   =  "+calendar.get(Calendar.HOUR_OF_DAY));

        calendar.setTimeZone(timeZone1);

        long timeLA = calendar.getTimeInMillis();
        LogPC.println("BBParrilla", "timeLA  =  "+timeLA);
        LogPC.println("BBparrilla", "hour  =  "+calendar.get(Calendar.HOUR_OF_DAY));
    }*/

    public void setTarjetas(List<TarjetaInteligente> tarjetas) {
        this.tarjetas = tarjetas;
    }

    public List<TarjetaInteligente> getTarjetas() {
        return tarjetas;
    }

    public void setPopupRemoteBookingPorProgramaHMC(RichPopup popupRemoteBookingPorProgramaHMC) {
        this.popupRemoteBookingPorProgramaHMC = popupRemoteBookingPorProgramaHMC;
    }

    public RichPopup getPopupRemoteBookingPorProgramaHMC() {
        return popupRemoteBookingPorProgramaHMC;
    }
}
