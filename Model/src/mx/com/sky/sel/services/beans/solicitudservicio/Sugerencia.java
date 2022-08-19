package mx.com.sky.sel.services.beans.solicitudservicio;

import java.io.Serializable;

import java.sql.Timestamp;

import mx.com.sky.sel.utils.JavaUtils;

public class Sugerencia implements Serializable {
    private static final long serialVersionUID = 1L;

    private Timestamp fechaRegistro;
    private String sugerencia;
    private String numero_ss;

    /**
     *
     */
    public Sugerencia() {
        // TODO Auto-generated constructor stub
        sugerencia = "";
        numero_ss = "";
    }

    /* (non-Javadoc)
         * @see java.lang.Object#toString()
         */

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Sugerencia [");
        if (fechaRegistro != null) {
            builder.append("fechaRegistro=");
            builder.append(fechaRegistro);
            builder.append(", ");
        }
        if (sugerencia != null) {
            builder.append("sugerencia=");
            builder.append(sugerencia);
        }
        if (numero_ss != null) {
            builder.append("numero_ss=");
            builder.append(numero_ss);
        }
        builder.append("]");
        return builder.toString();
    }

    /**
     * @return the fechaRegistro
     */
    public Timestamp getFechaRegistro() {
        return fechaRegistro;
    }

    public String getFechaRegistroString() {
        return JavaUtils.asString(fechaRegistro);
    }

    /**
     * @param fechaRegistro the fechaRegistro to set
     */
    public void setFechaRegistro(Timestamp fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    /**
     * @return the sugerencia
     */
    public String getSugerencia() {
        return sugerencia;
    }


    /**
     * @param sugerencia the sugerencia to set
     */
    public void setSugerencia(String sugerencia) {
        this.sugerencia = sugerencia;
    }


    public void setNumero_ss(String numero_ss) {
        this.numero_ss = numero_ss;
    }

    public String getNumero_ss() {
        return numero_ss;
    }
}
