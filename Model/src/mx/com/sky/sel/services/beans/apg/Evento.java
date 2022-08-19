package mx.com.sky.sel.services.beans.apg;

import java.io.Serializable;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Locale;

import mx.com.sky.sel.services.beans.utils.CalendarUtils;
import mx.com.sky.sel.log.LogPC;

public class Evento implements Serializable {
    @SuppressWarnings("compatibility:-4898726241623037476")
    private static final long serialVersionUID = 5002581745182396611L;

    private String tipo;
    private String titulo;
    private String duracion;
    private String sinopsis;
    private String contentId;
    private Date fechaInicio;
    private Date fechaFin;
    private int duracionMinutos;
    private int numIntervalos;
    private Date desde;
    private Date hasta;
    private int minutos;
    private String transportStreamId;
    private String eventId;
    private String seriesId;
    private String programId;
    private String contentProviderId;
    private String networkId;

    public Evento(String tipo, String titulo, String duracion, String sinopsis,
                  String contentId, Date fechaInicio, Date fechaFin,
                  int duracionMinutos, int minutos, Date desde, Date hasta, String transportStreamId, String eventId,
                  String seriesId, String programId, String contentProviderId, String networkId) {
        super();
        this.tipo = tipo;
        this.titulo = titulo;
        this.duracion = duracion;
        this.sinopsis = sinopsis;
        this.contentId = contentId;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.duracionMinutos = duracionMinutos;
        this.desde = desde;
        this.hasta = hasta;
        this.minutos = minutos;
        this.transportStreamId = transportStreamId;
        this.eventId = eventId;
        this.seriesId = seriesId;
        this.programId = programId;
        this.contentProviderId = contentProviderId;
        this.networkId = networkId;
    }

    public Evento() {

    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getContentId() {
        return contentId;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setNumIntervalos(int numIntervalos) {
        this.numIntervalos = numIntervalos;
    }

    public int getNumIntervalos() {
       return this.numIntervalos;
    }
    public int calculaIntervalos(){
        LogPC.println(this, "Evento intervalo:");
        if (numIntervalos == 0) {
            //si el evento esta dentro del rango mostrado en pantalla 
            if (!this.fechaInicio.before(desde) &&
                !this.fechaFin.after(hasta)) {
                //diferencia en minutos
                int diff =
                    CalendarUtils.getDiffInMinutes(fechaInicio, fechaFin);
                //cuantos intervalos tiene
                this.numIntervalos = diff / minutos;

            } else if (this.fechaInicio.before(desde)) {
                int diff = CalendarUtils.getDiffInMinutes(desde, fechaFin);
                //cuantos intervalos tiene
                this.numIntervalos = diff / minutos;
            } else if (this.fechaFin.after(hasta)) {
                int diff = CalendarUtils.getDiffInMinutes(fechaInicio, hasta);
                //cuantos intervalos tiene
                this.numIntervalos = diff / minutos;
            }
        }
        return this.numIntervalos;
    }

    /**
     * Caracteres 3 al 10
     * @return
     */
    public String getSeriesId() {
        return this.seriesId;
    }

    public String getEpisodeId() {
        return this.contentId;
    }

    public String getContentType() {
        return this.contentId.substring(0, 2);
    }

    public boolean isSerie() {
        //EnumContentID content
        EnumContentType tipo = EnumContentType.valueOf(getContentType());
        if ((tipo == EnumContentType.EP || tipo == EnumContentType.SH) && !getEpisodeId().equals("0000")) {
            return true;
        }
        return false;
    }

    public boolean esDisponibleParaGrabar() {
        EnumContentType tipo = EnumContentType.valueOf(getContentType());
        if (tipo == EnumContentType.EP &&
            this.getEpisodeId().equals(EnumContentType.EPISODE_NO_DISPONIBLE.getValue())) {
            return false;
        }
        return true;
    }
    
    public String toString(){
        /**        this.tipo = tipo;
        this.titulo = titulo;
        this.duracion = duracion;
        this.sinopsis = sinopsis;
        this.contentId = contentId;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.duracionMinutos = duracionMinutos;
        this.desde = desde;
        this.hasta = hasta;
        this.minutos = minutos;**/
    StringBuffer sb = new StringBuffer();
        sb.append("Evento[----------------------------")
            .append("\nfechaInicio: "+this.fechaInicio)
            .append("\nfechafin: "+this.fechaFin)
            .append("\ndesde: "+desde)
            .append("\nhasta: "+hasta)
            .append("\nintervalos: "+this.numIntervalos)
            .append("\ntitulo: "+titulo)
            .append("\nduracion: "+duracion)
            .append("\nsinopis: "+sinopsis)
            .append("\ncontentid: "+contentId)
            .append("\nduracionMinutos: "+duracionMinutos)
            .append("]");
        return sb.toString();
    }
    public String getHorario(){
            SimpleDateFormat df = new SimpleDateFormat("HH:mm",Locale.getDefault());
            StringBuffer sb = new StringBuffer();
            sb.append(df.format(this.fechaInicio)).append("- ").append(df.format(this.fechaFin));
            return sb.toString();
    }

    public void setDesde(Date desde) {
        this.desde = desde;
    }

    public Date getDesde() {
        return desde;
    }

    public void setHasta(Date hasta) {
        this.hasta = hasta;
    }

    public Date getHasta() {
        return hasta;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Evento){
            return this.fechaInicio.equals(((Evento)obj).getFechaInicio());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    public int getMaxCaracters(){
        if(this.numIntervalos < 20){
            return 1;
        }
        return 0;
    }

    public void setTransportStreamId(String transportStreamId) {
        this.transportStreamId = transportStreamId;
    }

    public String getTransportStreamId() {
        return transportStreamId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventId() {
        return eventId;
    }

    public void setSeriesId(String seriesId) {
        this.seriesId = seriesId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    public String getProgramId() {
        return programId;
    }

    public void setContentProviderId(String contentProviderId) {
        this.contentProviderId = contentProviderId;
    }

    public String getContentProviderId() {
        return contentProviderId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public String getNetworkId() {
        return networkId;
    }
    }
