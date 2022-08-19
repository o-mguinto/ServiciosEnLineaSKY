package mx.com.sky.sel.services.beans.promociones;
import java.io.Serializable;

import java.sql.Timestamp;

public class Promocion implements Serializable {
    @SuppressWarnings("compatibility:3453300700475416251")
    private static final long serialVersionUID = -6623916071716147910L;
    private String id;
    private String idPais;
    private Timestamp fechaCreacion;
    private Timestamp fechaActualizacion;
    private Timestamp fechaInicio;
    private Timestamp fechaFin;
    private Boolean habilitada;
    private Boolean popUp;
    private String nombre;
    private String descripcion;
    private String imagen;
    private Boolean carrusel;
    private Boolean vetv;
    private Boolean login;


    /**
     *
     */
    public Promocion() {
        // TODO Auto-generated constructor stub
        this.habilitada=false;
        this.popUp=false;
        this.carrusel=false;
        this.vetv=false;
        this.login=false;
    }

    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Promocion [");
        if (id != null) {
            builder.append("id=");
            builder.append(id);
            builder.append(", ");
        }
        if (idPais != null) {
            builder.append("idPais=");
            builder.append(idPais);
            builder.append(", ");
        }
        if (nombre != null) {
            builder.append("nombre=");
            builder.append(nombre);
            builder.append(", ");
        }
        if (imagen != null) {
            builder.append("imagen=");
            builder.append(imagen);
            builder.append(", ");
        }
        if (habilitada != null) {
            builder.append("habilitada=");
            builder.append(habilitada);
            builder.append(", ");
        }
        if (popUp != null) {
            builder.append("popUp=");
            builder.append(popUp);
            builder.append(", ");
        }
        if (fechaInicio != null) {
            builder.append("fechaInicio=");
            builder.append(fechaInicio);
            builder.append(", ");
        }
        if (fechaFin != null) {
            builder.append("fechaFin=");
            builder.append(fechaFin);
            builder.append(", ");
        }
        if (fechaCreacion != null) {
            builder.append("fechaCreacion=");
            builder.append(fechaCreacion);
            builder.append(", ");
        }
        if (fechaActualizacion != null) {
            builder.append("fechaActualizacion=");
            builder.append(fechaActualizacion);
            builder.append(", ");
        }
        if (descripcion != null) {
            builder.append("descripcion=");
            builder.append(descripcion);
            builder.append(", ");
        }
        
            builder.append("login=");
            builder.append(login);
        
        builder.append("]");
        return builder.toString();
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the idPais
     */
    public String getIdPais() {
        return idPais;
    }

    /**
     * @param idPais the idPais to set
     */
    public void setIdPais(String idPais) {
        this.idPais = idPais;
    }

    /**
     * @return the fechaCreacion
     */
    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * @param fechaCreacion the fechaCreacion to set
     */
    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * @return the fechaActualizacion
     */
    public Timestamp getFechaActualizacion() {
        return fechaActualizacion;
    }

    /**
     * @param fechaActualizacion the fechaActualizacion to set
     */
    public void setFechaActualizacion(Timestamp fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    /**
     * @return the habilitada
     */
    public Boolean getHabilitada() {
        return habilitada;
    }

    /**
     * @param habilitada the habilitada to set
     */
    public void setHabilitada(Boolean habilitada) {
        this.habilitada = habilitada;
    }

    /**
     * @return the popUp
     */
    public Boolean getPopUp() {
        return popUp;
    }

    /**
     * @param popUp the popUp to set
     */
    public void setPopUp(Boolean popUp) {
        this.popUp = popUp;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }


    public void setCarrusel(Boolean carrusel) {
        this.carrusel = carrusel;
    }

    public Boolean getCarrusel() {
        return carrusel;
    }

    public void setVetv(Boolean vetv) {
        this.vetv = vetv;
    }

    public Boolean getVetv() {
        return vetv;
    }
    
    
    public void setFechaInicio(Timestamp fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Timestamp getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaFin(Timestamp fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Timestamp getFechaFin() {
        return fechaFin;
    }

    public void setLogin(Boolean login) {
        
        this.login = login;
    }

    public Boolean isLogin() {
        return login;
    }
    
    public Boolean getLogin() {
        return login;
    }
    
    
}
