package mx.com.sky.sel.services.beans.solicitudservicio;

import java.io.Serializable;
import java.sql.Timestamp;

import mx.com.sky.sel.utils.JavaUtils;

public class Queja implements Serializable {
    private static final long serialVersionUID = 1L;


    private Timestamp fechaRegistro;
    private String queja;
    private String numero_ss;

    /**
     *
     */
    public Queja() {
        // TODO Auto-generated constructor stub
    }

    /* (non-Javadoc)
         * @see java.lang.Object#toString()
         */

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Queja [");
        if (fechaRegistro != null) {
            builder.append("fechaRegistro=");
            builder.append(fechaRegistro);
            builder.append(", ");
        }
        if (queja != null) {
            builder.append("queja=");
            builder.append(queja);
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
     * @return the queja
     */
    public String getQueja() {
        return queja;
    }

    /**
     * @param queja the queja to set
     */
    public void setQueja(String queja) {
        this.queja = queja;
    }


    public void setNumero_ss(String numero_ss) {
        this.numero_ss = numero_ss;
    }

    public String getNumero_ss() {
        return numero_ss;
    }
}
