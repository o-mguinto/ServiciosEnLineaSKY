package mx.com.sky.sel.services.beans.btgew;

import java.io.Serializable;

import java.sql.Timestamp;

public class BTGEWElement implements Serializable {
    @SuppressWarnings("compatibility:-265689364881160926")
    private static final long serialVersionUID = 8864054135783410206L;

    private Integer id;
    private Integer idPais;
    private String habilitada;
    private boolean habilitadaB;
    private String carruselLogin;
    private boolean carruselLoginB;
    private String tipoCuenta;
    private String paquete;
    private String vetv;
    private boolean vetvB;
    private String nombre;
    private String imagen;
    private String linkActivo;
    private boolean linkActivoB;
    private String link;
    private String linkHttp;
    private String descripcion;
    private Timestamp fechaInicio;
    private Timestamp fechaFin;
    private String usernameCreador;
    private String usernameModificador;
    private Timestamp fechaCreacion;
    private Timestamp fechaActualizacion;

    /**
     *
     */
    public BTGEWElement() {
        // TODO Auto-generated constructor stub
    }

    /* (non-Javadoc)
         * @see java.lang.Object#toString()
         */

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("BTGEWElement [");
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
        if (habilitada != null) {
            builder.append("habilitada=");
            builder.append(habilitada);
            builder.append(", ");
        }
        if (carruselLogin != null) {
            builder.append("carruselLogin=");
            builder.append(carruselLogin);
            builder.append(", ");
        }
        if (tipoCuenta != null) {
            builder.append("tipoCuenta=");
            builder.append(tipoCuenta);
            builder.append(", ");
        }
        if (paquete != null) {
            builder.append("paquete=");
            builder.append(paquete);
            builder.append(", ");
        }
        if (vetv != null) {
            builder.append("vetv=");
            builder.append(vetv);
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
        if (linkActivo != null) {
            builder.append("linkActivo=");
            builder.append(linkActivo);
            builder.append(", ");
        }
        if (link != null) {
            builder.append("link=");
            builder.append(link);
            builder.append(", ");
        }
        if (descripcion != null) {
            builder.append("descripcion=");
            builder.append(descripcion);
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
        if (usernameCreador != null) {
            builder.append("usernameCreador=");
            builder.append(usernameCreador);
            builder.append(", ");
        }
        if (usernameModificador != null) {
            builder.append("usernameModificador=");
            builder.append(usernameModificador);
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
        }
        builder.append("]");
        return builder.toString();
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the idPais
     */
    public Integer getIdPais() {
        return idPais;
    }

    /**
     * @param idPais the idPais to set
     */
    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    /**
     * @return the habilitada
     */
    public String getHabilitada() {
        return habilitada;
    }

    /**
     * @param habilitada the habilitada to set
     */
    public void setHabilitada(String habilitada) {
        this.habilitada = habilitada;
        if (this.habilitada != null) {
            this.habilitadaB = habilitada.equalsIgnoreCase("Y");
        }
    }

    /**
     * @return the habilitadaB
     */
    public boolean isHabilitadaB() {
        return habilitadaB;
    }

    /**
     * @param habilitadaB the habilitadaB to set
     */
    public void setHabilitadaB(boolean habilitadaB) {
        this.habilitadaB = habilitadaB;
        this.habilitada = this.habilitadaB ? "Y" : "N";
    }

    /**
     * @return the carruselLogin
     */
    public String getCarruselLogin() {
        return carruselLogin;
    }

    /**
     * @param carruselLogin the carruselLogin to set
     */
    public void setCarruselLogin(String carruselLogin) {
        this.carruselLogin = carruselLogin;
        if (this.carruselLogin != null) {
            this.carruselLoginB = this.carruselLogin.equalsIgnoreCase("Y");
        }
    }

    /**
     * @return the carruselLoginB
     */
    public boolean isCarruselLoginB() {
        return carruselLoginB;
    }

    /**
     * @param carruselLoginB the carruselLoginB to set
     */
    public void setCarruselLoginB(boolean carruselLoginB) {
        this.carruselLoginB = carruselLoginB;
        this.carruselLogin = this.carruselLoginB ? "Y" : "N";
    }

    /**
     * @return the tipoCuenta
     */
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    /**
     * @param tipoCuenta the tipoCuenta to set
     */
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    /**
     * @return the paquete
     */
    public String getPaquete() {
        return paquete;
    }

    /**
     * @param paquete the paquete to set
     */
    public void setPaquete(String paquete) {
        this.paquete = paquete;
    }

    /**
     * @return the vetv
     */
    public String getVetv() {
        return vetv;
    }

    /**
     * @param vetv the vetv to set
     */
    public void setVetv(String vetv) {
        this.vetv = vetv;
        if (this.vetv != null) {
            this.vetvB = this.vetv.equalsIgnoreCase("Y");
        }
    }

    /**
     * @return the vetvB
     */
    public boolean isVetvB() {
        return vetvB;
    }

    /**
     * @param vetvB the vetvB to set
     */
    public void setVetvB(boolean vetvB) {
        this.vetvB = vetvB;
        this.vetv = this.vetvB ? "Y" : "N";
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

    /**
     * @return the linkActivo
     */
    public String getLinkActivo() {
        return linkActivo;
    }

    /**
     * @param linkActivo the linkActivo to set
     */
    public void setLinkActivo(String linkActivo) {
        this.linkActivo = linkActivo;
        if (this.linkActivo != null) {
            this.linkActivoB = this.linkActivo.equalsIgnoreCase("Y");
        }
    }

    /**
     * @return the linkActivoB
     */
    public boolean isLinkActivoB() {
        return linkActivoB;
    }

    /**
     * @param linkActivoB the linkActivoB to set
     */
    public void setLinkActivoB(boolean linkActivoB) {
        this.linkActivoB = linkActivoB;
        this.linkActivo = this.linkActivoB ? "Y" : "N";
    }

    /**
     * @return the link
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link the link to set
     */
    public void setLink(String link) {
        this.link = link;
        if (this.link != null) {
            if (this.link.contains("http://")) {
                this.linkHttp = this.link.toString();
            } else {
                this.linkHttp = "http://" + this.link.toString();
            }
        }
    }

    /**
     * @return the descripicion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripicion the descripicion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the fechaInicio
     */
    public Timestamp getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(Timestamp fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaFin
     */
    public Timestamp getFechaFin() {
        return fechaFin;
    }

    /**
     * @param fechaFin the fechaFin to set
     */
    public void setFechaFin(Timestamp fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * @return the usernameCreador
     */
    public String getUsernameCreador() {
        return usernameCreador;
    }

    /**
     * @param usernameCreador the usernameCreador to set
     */
    public void setUsernameCreador(String usernameCreador) {
        this.usernameCreador = usernameCreador;
    }

    /**
     * @return the usernameModificador
     */
    public String getUsernameModificador() {
        return usernameModificador;
    }

    /**
     * @param usernameModificador the usernameModificador to set
     */
    public void setUsernameModificador(String usernameModificador) {
        this.usernameModificador = usernameModificador;
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

    public void setLinkHttp(String linkHttp) {
        this.linkHttp = linkHttp;
    }

    public String getLinkHttp() {
        return linkHttp;
    }
    }
