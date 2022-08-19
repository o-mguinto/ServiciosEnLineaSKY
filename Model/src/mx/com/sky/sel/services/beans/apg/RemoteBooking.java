package mx.com.sky.sel.services.beans.apg;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import mx.com.sky.sel.services.beans.utils.TarjetaInteligente;
import mx.com.sky.sel.log.LogPC;

public class RemoteBooking implements Serializable {
    @SuppressWarnings("compatibility:3943911071745477607")
    private static final long serialVersionUID = -8335862527328694785L;
    public static final String GRABAR_UNA_VEZ = "00";
    public static final String GRABAR_TODOS_LOS_DIAS = "80";
    public static final String GRABAR_EPISODIO = "08";
    public static final String GRABAR_SERIE = "88";
    public static final String POR_CONTENTID = "01";
    public static final String POR_HORARIO_CANAL = "02";

    private Canal canal;
    
    private Evento evento = new Evento();
    
    private boolean unaVez;
    private String recordatorioGrabacion;
    /**
     * (13)
     * tarjeta inteligente
     */
    //private String smc;
    /**
     * Cuando es por horario y canal
     */
    private String horario;

    /**
     * (02)
     * 01 por contenido
     * 02 por horario y canal
     */
    private String methodType;
    /**
     * (2)Metodo 2
     * 00 grabar una sola vez
     * 80 grabar todos los dias
     * 
     */
    private String recurringFlags;
    /**
     * (02) Metodo 1 
     * 50 siempre que episodeid = 000000000000
     * 50 Grabar episodio
     * D0 grabar serie
     */
    private String recordingType;
    /**
     *  00 Grabacion normal
     *  01 prioridad al
     */
    private String recordConfiguration;
    /**
     * Categoria del IRD, 
     */
    private TarjetaInteligente ti;
    
    
    public RemoteBooking() {
        super();
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }

    public Canal getCanal() {
        return canal;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
        //si no es una serie entonces es de una sola contratacion
        this.unaVez = !this.evento.isSerie();
    }

    public Evento getEvento() {
        return evento;
    }

    public void setUnaVez(boolean unaVez) {
        this.unaVez = unaVez;
    }

    public boolean isUnaVez() {
        return unaVez;
    }

    /*public void setSmc(String SMC) {
        this.smc = SMC;
    }

    public String getSmc() {
        return smc;
    }*/

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    public void setMethodType(String methodType) {
        this.methodType = methodType;
    }

    public String getMethodType() {
        return methodType;
    }

    public void setRecurringFlags(String recurringFlags) {
        this.recurringFlags = recurringFlags;
    }

    public String getRecurringFlags() {
        return recurringFlags;
    }

    public void setRecordingType(String recordingType) {
        this.recordingType = recordingType;
    }

    public String getRecordingType() {
        return recordingType;
    }

    public void setRecordConfiguration(String recordConfiguration) {
        this.recordConfiguration = recordConfiguration;
    }

    public String getRecordConfiguration() {
        return recordConfiguration;
    }
    
    public String getDescripcion(){
        if(POR_CONTENTID.equals(this.methodType)){
            //la descripcion es el evento
            return "Por evento: "+this.evento.getTitulo()+" "+this.evento.getHorario();
            
        }else{
            //la descripcion es el canal    
            return "Por horario/canal: "+canal.getIdMostrado()+this.canal.getCanalNombre();
        }
    }
    public XMLGregorianCalendar getStartTime(){
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(this.getDate());
        XMLGregorianCalendar date2;
        try {
            date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
            return date2;
        } catch (DatatypeConfigurationException e) {
            
        }
        return null;
    }
    public XMLGregorianCalendar getExpirationTime(){
        GregorianCalendar c = new GregorianCalendar();
        //mas 24 horas
        Date exp = new Date(new Date().getTime()+(24*60*60*1000));
        c.setTime(exp);
        XMLGregorianCalendar date2;
        try {
            date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
            return date2;
        } catch (DatatypeConfigurationException e) {
            
        }
        return null;
    }
    
    private Date getDate(){
        if(this.methodType == null){
         return new Date();
        }
        //ENVIAR HORARIO DEL EVENTO
        if(methodType.equals(POR_CONTENTID)){
            return this.evento.getDesde();
        //por horario y canal
        }else{
            LogPC.println(this, this.horario);
            String inicio = horario.split(",")[0];
            int minutosDeldia = Integer.parseInt(inicio);
            Calendar c = Calendar.getInstance();
            c.set(Calendar.HOUR_OF_DAY, 0);
            c.set(Calendar.MINUTE ,0);
            c.set(Calendar.SECOND ,0);
            c.set(Calendar.MILLISECOND ,0);
            c.add(Calendar.MINUTE, minutosDeldia);
            LogPC.println(this, c.getTime());
            return c.getTime();
        }
    }
    
    public String getDuracionCuandoEsHorarioCanal(){
        if(this.horario!=null){
            int ini = Integer.parseInt(this.horario.split(",")[0]);
            int fin = Integer.parseInt(this.horario.split(",")[1]);
            LogPC.println(this, "duracion: "+(fin-ini));
            return fin-ini+"";
        }
        return "60";
    }
    
    public static void main(String[] args) {
        int minutosDeldia = Integer.parseInt("360"); //360 6 horas
        Calendar c = Calendar.getInstance();
        LogPC.println("RemoteBooking", c.getTime());
        c.set(Calendar.HOUR, 0);
        c.set(Calendar.MINUTE ,0);
        c.set(Calendar.SECOND ,0);
        c.set(Calendar.MILLISECOND ,0);
        c.add(Calendar.MINUTE, minutosDeldia);
        LogPC.println("RemoteBooking", c.getTime());
       
    }

    /*public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }*/

    public void setTi(TarjetaInteligente ti) {
        this.ti = ti;
    }

    public TarjetaInteligente getTi() {
        return ti;
    }

    public void setRecordatorioGrabacion(String recordatorioGrabacion) {
        this.recordatorioGrabacion = recordatorioGrabacion;
    }

    public String getRecordatorioGrabacion() {
        return recordatorioGrabacion;
    }
}
