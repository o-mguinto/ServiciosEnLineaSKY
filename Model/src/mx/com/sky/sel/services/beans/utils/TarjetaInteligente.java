package mx.com.sky.sel.services.beans.utils;

import java.io.Serializable;

public class TarjetaInteligente implements Serializable {
    @SuppressWarnings("compatibility:2249097436654798926")
    private static final long serialVersionUID = 8674612320591464531L;
    protected String tarjetaInteligente;
    protected String ird;
    protected String ubicacion;
    protected String status;
    protected String jerarquia;
    protected String categoria;


    public TarjetaInteligente() {

    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("TarjetaInteligente [");
        if (tarjetaInteligente != null) {
            builder.append("tarjetaInteligente=");
            builder.append(tarjetaInteligente);
            builder.append(", ");
        }
        if (ird != null) {
            builder.append("ird=");
            builder.append(ird);
            builder.append(", ");
        }
        if (ubicacion != null) {
            builder.append("ubicacion=");
            builder.append(ubicacion);
            builder.append(", ");
        }
        if (status != null) {
            builder.append("status=");
            builder.append(status);
            builder.append(", ");
        }
        if (jerarquia != null) {
            builder.append("jerarquia=");
            builder.append(jerarquia);
        }
        builder.append("]");
        return builder.toString();
    }


    /**
     * @return the tarjetaInteligente
     */
    public String getTarjetaInteligente() {
        return tarjetaInteligente;
    }


    /**
     * @param tarjetaInteligente the tarjetaInteligente to set
     */
    public void setTarjetaInteligente(String tarjetaInteligente) {
        this.tarjetaInteligente = tarjetaInteligente;
    }


    /**
     * @return the ird
     */
    public String getIrd() {
        return ird;
    }


    /**
     * @param ird the ird to set
     */
    public void setIrd(String ird) {
        this.ird = ird;
    }


    /**
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }


    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }


    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }


    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * @return the jerarquia
     */
    public String getJerarquia() {
        return jerarquia;
    }


    /**
     * @param jerarquia the jerarquia to set
     */
    public void setJerarquia(String jerarquia) {
        this.jerarquia = jerarquia;
    }


    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }
}
