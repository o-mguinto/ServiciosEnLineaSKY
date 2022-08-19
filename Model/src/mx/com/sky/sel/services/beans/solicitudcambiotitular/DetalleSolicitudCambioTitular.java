package mx.com.sky.sel.services.beans.solicitudcambiotitular;

import java.io.Serializable;

public class DetalleSolicitudCambioTitular implements Serializable {
    @SuppressWarnings("compatibility:-7746061434643518976")
    private static final long serialVersionUID = -6645984951557198580L;
    private String cuenta;
    private String num_solicitud;
    private String fecha_solicitud;
    private String estatus;
    private String sub_estatus;
    private String comentarios;

    /**
    *
    */
    public DetalleSolicitudCambioTitular() {
    // TODO Auto-generated constructor stub
    }


    /** (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("DetalleSolicitudDeServicio [");
    if (num_solicitud != null) {
        builder.append("numeroDeSolicitud=");
        builder.append(num_solicitud);
        builder.append(", ");
    }
    if (cuenta != null) {
        builder.append("cuenta=");
        builder.append(cuenta);
        builder.append(", ");
    }
    if (fecha_solicitud != null) {
        builder.append("fechaSolicitud=");
        builder.append(fecha_solicitud);
        builder.append(", ");
    }
    if (estatus != null) {
        builder.append("estatus=");
        builder.append(estatus);
        builder.append(", ");
    }
    if (sub_estatus != null) {
        builder.append("subStatus=");
        builder.append(sub_estatus);
    }
            if (comentarios != null) {
        builder.append("comentarios=");
        builder.append(comentarios);
    }
    builder.append("]");
    return builder.toString();
    }

    /**
    * @return the cuenta
    */
    public String getCuenta() {
    return cuenta;
    }

    /**
    * @param cta the cuenta to set
    */
    public void setCuenta(String cta) {
    this.cuenta = cta;
    }

    /**
    * @return the num_solicitud
    */
    public String getNumSolicitud() {
    return num_solicitud;
    }

    /**
    * @param num_solicitud the num_solicitud to set
    */
    public void setNumSolicitud(String ns) {
    this.num_solicitud = ns;
    }

    /**
    * @return the fecha_solicitud
    */
    public String getFechaSolicitud() {
    return fecha_solicitud;
    }

    /**
    * @param fecha_solicitud the fecha_solicitud to set
    */
    public void setFechaSolicitud(String fs) {
    this.fecha_solicitud = fs;
    }

    /**
    * @return the estatus
    */
    public String getEstatus() {
    return estatus;
    }

    /**
    * @param estatus the estatus to set
    */
    public void setEstatus(String es) {
    this.estatus = es;
    }

    /**
    * @return the sub_estatus
    */
    public String getSubEstatus() {
    return sub_estatus;
    }

    /**
    * @param sub_estatus the sub_estatus to set
    */
    public void setSubEstatus(String se) {
    this.sub_estatus = se;
    }


    public void setComentarios(String cm) {
    this.comentarios = cm;
    }

    public String getComentarios() {
    return comentarios;
    }
}
