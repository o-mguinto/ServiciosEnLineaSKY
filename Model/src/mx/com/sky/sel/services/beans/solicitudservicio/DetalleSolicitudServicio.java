package mx.com.sky.sel.services.beans.solicitudservicio;

import java.io.Serializable;

public class DetalleSolicitudServicio implements Serializable {
    @SuppressWarnings("compatibility:-1439921570903898199")
    private static final long serialVersionUID = -619628030602359573L;
    protected String numeroSolicitud;
    protected String area;
    protected String subAarea;
    protected String comentario;
    protected String fechaCreacion;
    protected String tarjetaInteligente;
    protected String apellidoDeContrato;
    protected String estatus;
    

    /**
     *
     */
    public DetalleSolicitudServicio() {
        // TODO Auto-generated constructor stub
    }


    /** (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("DetalleSolicitudDeServicio [");
        if (numeroSolicitud != null) {
            builder.append("numeroDeSolicitud=");
            builder.append(numeroSolicitud);
            builder.append(", ");
        }
        if (area != null) {
            builder.append("area=");
            builder.append(area);
            builder.append(", ");
        }
        if (subAarea != null) {
            builder.append("subAarea=");
            builder.append(subAarea);
            builder.append(", ");
        }
        if (comentario != null) {
            builder.append("comentario=");
            builder.append(comentario);
            builder.append(", ");
        }
        if (fechaCreacion != null) {
            builder.append("fechaCreacion=");
            builder.append(fechaCreacion);
            builder.append(", ");
        }
        if (estatus != null) {
            builder.append(" estatus=");
            builder.append(estatus);
        }
        builder.append("]");
        return builder.toString();
    }

    /**
     * @return the numeroSolicitud
     */
    public String getNumeroSolicitud() {
        return numeroSolicitud;
    }

    /**
     * @param numeroDeSolicitud the numeroSolicitud to set
     */
    public void setNumeroSolicitud(String numeroDeSolicitud) {
        this.numeroSolicitud = numeroDeSolicitud;
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return the subAarea
     */
    public String getSubAarea() {
        return subAarea;
    }

    /**
     * @param subAarea the subAarea to set
     */
    public void setSubAarea(String subAarea) {
        this.subAarea = subAarea;
    }

    /**
     * @return the comentario
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * @param comentario the comentario to set
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * @return the fechaCreacion
     */
    public String getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * @param fechaCreacion the fechaCreacion to set
     */
    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }


    public void setTarjetaInteligente(String tarjetaInteligente) {
        this.tarjetaInteligente = tarjetaInteligente;
    }

    public String getTarjetaInteligente() {
        return tarjetaInteligente;
    }


    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setApellidoDeContrato(String apellidoDeContrato) {
        this.apellidoDeContrato = apellidoDeContrato;
    }

    public String getApellidoDeContrato() {
        return apellidoDeContrato;
    }
}
