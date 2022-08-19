package mx.com.sky.sel.services.beans.pagos;
import java.io.Serializable;

public class Pago implements Serializable {
    @SuppressWarnings("compatibility:3884988812783186760")
    private static final long serialVersionUID = 714358398875885694L;

    private String tarjeta;
    private String tipo;
    private String importe;
    private String referencia;
    private String fecha;
    private String estatus;


    /**
     *
     */
    public Pago() {
        // TODO Auto-generated constructor stub
    }

    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Pago [");
        if (tarjeta != null) {
            builder.append("tarjeta=");
            builder.append(tarjeta);
            builder.append(", ");
        }
        if (fecha != null) {
            builder.append("fecha=");
            builder.append(fecha);
            builder.append(", ");
        }
        if (tipo != null) {
            builder.append("tipo=");
            builder.append(tipo);
            builder.append(", ");
        }
        if (importe != null) {
            builder.append("importe=");
            builder.append(importe);
            builder.append(", ");
        }
        if (estatus != null) {
            builder.append("estatus=");
            builder.append(estatus);
            builder.append(", ");
        }
        if (referencia != null) {
            builder.append("referencia=");
            builder.append(referencia);
        }
        builder.append("]");
        return builder.toString();
    }

    /**
     * @return the tarjeta
     */
    public String getTarjeta() {
        return tarjeta;
    }

    /**
     * @param tarjeta the tarjeta to set
     */
    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the importe
     */
    public String getImporte() {
        return importe;
    }

    /**
     * @param importe the importe to set
     */
    public void setImporte(String importe) {
        this.importe = importe;
    }

    /**
     * @return the referencia
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getEstatus() {
        return estatus;
    }
}
