package mx.com.sky.sel.services.beans.utils;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import java.util.TimeZone;

import mx.com.sky.sel.services.beans.apg.HorarioPagina;
import mx.com.sky.sel.log.LogPC;

public class CalendarUtils {
    public static Date getDateGMT(Date date,TimeZone timezone){
        /*System.out.println(date);
        System.out.println(timezone.getRawOffset()/1000/3600);
        System.out.println(timezone.getOffset(date.getTime())/1000/3600);
        System.out.println(date);
        System.out.println(timezone.getDSTSavings());
        System.out.println(timezone.inDaylightTime(date));*/
        Date fechaGMT = new Date(date.getTime()-timezone.getOffset(date.getTime()));
        LogPC.println("CalendarUtils", "from: "+date+" GMT:"+fechaGMT);
        return fechaGMT;
    }
    /**
     *
     * @param date
     * @param timezone
     * @return
     */
    public static Date getDateLocal(Date date,TimeZone timezone){
        /*System.out.println(date);
        System.out.println(timezone.getRawOffset()/1000/3600);
        System.out.println(timezone.getOffset(date.getTime())/1000/3600);
        System.out.println(date);
        System.out.println(timezone.getDSTSavings());
        System.out.println(timezone.inDaylightTime(date));*/
        Date fechaGMT = new Date(date.getTime());
        System.out.println("GMT: "+date+" Local:"+fechaGMT);
        return fechaGMT;
    }
    /**
     * Recibe una fecha string y devuelve date
     * @param string con formato dd/MM/yyyy HH:mm
     * @return
     */
    public static Date getDateFromString(String string) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        try {
            return df.parse(string);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }
    /**
     *recibe un date y devuelve la parte de hora y minutos.
     * @param horaInicio
     * @return
     */
    static String getHoraFromDate(Date horaInicio) {
        SimpleDateFormat df = new SimpleDateFormat("HH:mm");
        return df.format(horaInicio);
    }
    static String getDiaHora(Date hora){
        SimpleDateFormat df = new SimpleDateFormat("EEE HH:mm");
        return df.format(hora);
    }
    /**
     * modifica la hora de inicio y devuelve la parte de los minutos de la fecha
     * ya modificada
     * @param horaInicio
     * @return
     */
    static String addMinutosToDate(Date horaInicio,int minutos) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(horaInicio);
        calendar.add(Calendar.MINUTE, minutos);
        horaInicio.setTime(calendar.getTime().getTime());
        return getDiaHora(calendar.getTime());
    }
    
    public static void main(String[] args) {
        /*Date horaInicio = CalendarUtils.getDateFromString("25/04/2014 10:00");
        int minutos = 30;        
        System.out.println(getListAddHoursFromDateUsingInterval(horaInicio,minutos,4));
        */
        Date fecha = CalendarUtils.getDateFromString("13/05/2014 20:00");
        fecha.getTime();
        //System.out.println(fecha.getTime());
        //System.out.println(getHoraInicioFromDate(fecha));
        
    }
    
    public static List<String> getListAddHoursFromDateUsingInterval(Date horaInicio,int minutos,int numIntervalos){
        List<String> horas = new ArrayList<String>();
        for(int i=0; i<numIntervalos; i++){
            horas.add(addMinutosToDate(horaInicio, minutos));
        }
        return horas;
    }
    /**
     * Calcula la hora con el limite inferior mas cercano
     * @param fecha
     * @return ej. 10:20 devolveria la 10:00
     */
    public static Date getHoraInicioFromDate(Date fecha) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        calendar.set(Calendar.MINUTE, 0);
        return calendar.getTime();
    }

    public static int getDiffInMinutes(Date fechaInicio, Date fechaFin) {
        //System.out.println("fechainicio: " + fechaInicio + ",fechaFin: " +                           fechaFin);
        long result =
            ((fechaFin.getTime() / 60000) - (fechaInicio.getTime() / 60000));
        return (int)result;
    }
    
    public static Date getFechaFin(Date fechaInicio, int minutos) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaInicio);
        calendar.add(Calendar.MINUTE, minutos);

        return calendar.getTime();
    }
    /**
     *
     * @param horaInicio
     * @param numIntervalos
     * @param intervaloMinutos
     * @param paginaLimite
     * @return
     */
    public static List<HorarioPagina> creaHorarios(Date horaInicio, int numIntervalos,
                                    int intervaloMinutos, int paginaLimite) {
        List<HorarioPagina> horarios = new ArrayList<HorarioPagina>();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(horaInicio);
        
        
        for(int i = 0; i < paginaLimite; i++){
            //sumar hora inicio
            HorarioPagina horario = new HorarioPagina(i,calendar.getTime(),CalendarUtils.getFechaFin(calendar.getTime(), numIntervalos*intervaloMinutos));
            calendar.setTime(horario.getHoraFin());
            horarios.add(horario); 
            LogPC.println("CalendarUtils", horario);
            
        }
        return horarios;
    }
}
