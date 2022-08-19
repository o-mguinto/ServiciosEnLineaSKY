package mx.com.sky.sel.services.beans.apg;


import java.io.Serializable;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Locale;

public class HorarioPagina implements Serializable {
    @SuppressWarnings("compatibility:8181040227876332709")
    private static final long serialVersionUID = 2054210504456406569L;
    private int numPagina;
    private Date horaInicio;
    private Date horaFin;

    public HorarioPagina(int numPagina, Date horaInicio, Date horaFin) {
        super();
        this.numPagina = numPagina;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public void setNumPagina(int numPagina) {
        this.numPagina = numPagina;
    }

    public int getNumPagina() {
        return numPagina;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public Date getHoraFin() {
        return horaFin;
    }
    /**
     * Retorna la etiquete para mostrar en la UI
     * @return
     */
    public String getLabel(){
        SimpleDateFormat df = new SimpleDateFormat("EEE HH:mm",Locale.getDefault());
        StringBuffer sb = new StringBuffer();
        sb.append(df.format(this.horaInicio)).append("- ").append(df.format(this.horaFin));
        return sb.toString();
    }

    @Override
    public String toString() {
        return this.getLabel();
    }
}
