package mx.com.sky.sel.services.beans.eventos;

import java.io.Serializable;

import java.sql.Timestamp;

public class Evento implements Serializable {
    @SuppressWarnings("compatibility:-6393297895732631742")
    private static final long serialVersionUID = 1L;
    private String id;
    private String titulo;
    private String sinopsis;
    private String modalidad;
    private String canal;
    private String canalDisplay;
    private String precio;
    private String image;
    private String horaEvento;
    private String horaPedido;
    private String horaExpiracion;
    private String horaCancelacion;
    private String token;
    private String languageCode;
    private String tituloAlternativo;
    private String serviceType;
    private String diferenciaHoraria;
    private String duracion;
    private String tipoEvento;
    private String status;

    private String tituloCanal;
    private String isPackage;
    private String minutosPrevios;
    private String tokenPSC;
    private String minutosLibres;
    private String eventoLibre;
    private String fechaUltimaOrden;
    private Timestamp fechaUltimaOrdenTS;
    private String subjectMaterRating;
    private String tipoOrden;
    private String providerEventId;
    private String ppvClass;
    private String ppvGenreId;
    private String skyTrackingId;
    
    ////Agregar campos de idioma de audio y subtitulos
    
    private String idioma;
    private String subtitulos;
    private String tituloMensaje;
    private String mensaje;

    /**
     *
     */
    public Evento() {
        super();
        titulo = null;
    }

    public void setEvento(Evento e) {
        this.id = e.getId();
        this.titulo = e.getTitulo();
        this.sinopsis = e.getSinopsis();
        this.modalidad = e.getModalidad();
        this.canal = e.getCanal();
        this.canalDisplay = e.getCanalDisplay();
        this.precio = e.getPrecio();
        this.image = e.getImage();
        this.horaEvento = e.getHoraEvento();
        this.horaPedido = e.getHoraPedido();
        this.horaExpiracion = e.getHoraExpiracion();
        this.horaCancelacion = e.getHoraCancelacion();
        this.token = e.getToken();
        this.languageCode = e.getLanguageCode();
        this.tituloAlternativo = e.getTituloAlternativo();
        this.serviceType = e.getServiceType();
        //agregando codigo de idioma y subtitulos
        this.idioma = e.getIdioma();
        this.subtitulos = e.getSubtitulos();
        this.tituloMensaje = e.getTituloMensaje();
        this.mensaje = e.getMensaje();
    }

    public void clear() {
        this.id = "";
        this.titulo = "";
        this.sinopsis = "";
        this.modalidad = "";
        this.canal = "";
        this.canalDisplay = "";
        this.precio = "";
        this.image = "";
        this.horaEvento = "";
        this.horaPedido = "";
        this.horaExpiracion = "";
        this.horaCancelacion = "";
        this.token = "";
        this.languageCode = "";
        this.tituloAlternativo = "";
        this.serviceType = "";
        ///codigo de idioma y subtitulos    
        this.idioma = "";
        this.subtitulos = "";
        this.tituloMensaje = "";
        this.mensaje = "";
    }

    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Evento [");
        if (tipoEvento != null) {
            builder.append("tipoEvento=");
            builder.append(tipoEvento);
            builder.append(", ");
        }

        if (id != null) {
            builder.append("id=");
            builder.append(id);
            builder.append(", ");
        }
        if (titulo != null) {
            builder.append("titulo=");
            builder.append(titulo);
            builder.append(", ");
        }
        if (modalidad != null) {
            builder.append("modalidad=");
            builder.append(modalidad);
            builder.append(", ");
        }
        if (canal != null) {
            builder.append("canal=");
            builder.append(canal);
            builder.append(", ");
        }
        if (precio != null) {
            builder.append("precio=");
            builder.append(precio);
            builder.append(", ");
        }
        if (image != null) {
            builder.append("image=");
            builder.append(image);
            builder.append(", ");
        }
        if (token != null) {
            builder.append("token=");
            builder.append(token);
            builder.append(", ");
        }
        if (horaExpiracion != null) {
            builder.append("horaExpiracion=");
            builder.append(horaExpiracion);
            builder.append(", ");
        }
        if (horaEvento != null) {
            builder.append("horaEvento=");
            builder.append(horaEvento);
            builder.append(", ");
        }
        if (horaPedido != null) {
            builder.append("horaPedido=");
            builder.append(horaPedido);
            builder.append(", ");
        }
        if (diferenciaHoraria != null) {
            builder.append("diferenciaHoraria=");
            builder.append(diferenciaHoraria);
            builder.append(", ");
        }
        if (duracion != null) {
            builder.append("duracion=");
            builder.append(duracion);
            builder.append(", ");
        }
        if (sinopsis != null) {
            builder.append("sinopsis=");
            builder.append(sinopsis);
        }
        //agregando codigo de audio y subtitulos
        if (idioma != null) {
            builder.append(" idioma= ");
            builder.append(idioma);
        }
        if (subtitulos != null) {
            builder.append(" subtitulos = ");
            builder.append(subtitulos);
        }
        if (tituloMensaje != null) {
            builder.append(" tituloMensaje = ");
            builder.append(tituloMensaje);
        }
        if (mensaje != null) {
            builder.append(" mensaje = ");
            builder.append(mensaje);
        }
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
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the sinopsis
     */
    public String getSinopsis() {
        return sinopsis;
    }

    /**
     * @param sinopsis the sinopsis to set
     */
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    /**
     * @return the modalidad
     */
    public String getModalidad() {
        return modalidad;
    }

    /**
     * @param modalidad the modalidad to set
     */
    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    /**
     * @return the canal
     */
    public String getCanal() {
        return canal;
    }

    /**
     * @param canal the canal to set
     */
    public void setCanal(String canal) {
        this.canal = canal;
    }

    /**
     * @return the canalDisplay
     */
    public String getCanalDisplay() {
        return canalDisplay;
    }

    /**
     * @param canalDisplay the canalDisplay to set
     */
    public void setCanalDisplay(String canalDisplay) {
        this.canalDisplay = canalDisplay;
    }

    /**
     * @return the precio
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return the horaEvento
     */
    public String getHoraEvento() {
        return horaEvento;
    }

    /**
     * @param horaEvento the horaEvento to set
     */
    public void setHoraEvento(String horaEvento) {
        this.horaEvento = horaEvento;
    }

    /**
     * @return the horaPedido
     */
    public String getHoraPedido() {
        return horaPedido;
    }

    /**
     * @param horaPedido the horaPedido to set
     */
    public void setHoraPedido(String horaPedido) {
        this.horaPedido = horaPedido;
    }

    /**
     * @return the horaExpiracion
     */
    public String getHoraExpiracion() {
        return horaExpiracion;
    }

    /**
     * @param horaExpiracion the horaExpiracion to set
     */
    public void setHoraExpiracion(String horaExpiracion) {
        this.horaExpiracion = horaExpiracion;
    }

    /**
     * @return the horaCancelacion
     */
    public String getHoraCancelacion() {
        return horaCancelacion;
    }

    /**
     * @param horaCancelacion the horaCancelacion to set
     */
    public void setHoraCancelacion(String horaCancelacion) {
        this.horaCancelacion = horaCancelacion;
    }

    /**
     * @return the token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token the token to set
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * @return the languageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * @param languageCode the languageCode to set
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * @return the tituloAlternativo
     */
    public String getTituloAlternativo() {
        return tituloAlternativo;
    }

    /**
     * @param tituloAlternativo the tituloAlternativo to set
     */
    public void setTituloAlternativo(String tituloAlternativo) {
        this.tituloAlternativo = tituloAlternativo;
    }

    /**
     * @return the serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * @param serviceType the serviceType to set
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setDiferenciaHoraria(String diferenciaHoraria) {
        this.diferenciaHoraria = diferenciaHoraria;
    }

    public String getDiferenciaHoraria() {
        return diferenciaHoraria;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setTituloCanal(String tituloCanal) {
        this.tituloCanal = tituloCanal;
    }

    public String getTituloCanal() {
        return tituloCanal;
    }

    public void setIsPackage(String isPackage) {
        this.isPackage = isPackage;
    }

    public String getIsPackage() {
        return isPackage;
    }

    public void setMinutosPrevios(String minutosPrevios) {
        this.minutosPrevios = minutosPrevios;
    }

    public String getMinutosPrevios() {
        return minutosPrevios;
    }

    public void setTokenPSC(String tokenPSC) {
        this.tokenPSC = tokenPSC;
    }

    public String getTokenPSC() {
        return tokenPSC;
    }

    public void setMinutosLibres(String minutosLibres) {
        this.minutosLibres = minutosLibres;
    }

    public String getMinutosLibres() {
        return minutosLibres;
    }

    public void setEventoLibre(String eventoLibre) {
        this.eventoLibre = eventoLibre;
    }

    public String getEventoLibre() {
        return eventoLibre;
    }

    public void setFechaUltimaOrden(String fechaUltimaOrden) {
        this.fechaUltimaOrden = fechaUltimaOrden;
    }

    public String getFechaUltimaOrden() {
        return fechaUltimaOrden;
    }

    public void setFechaUltimaOrdenTS(Timestamp fechaUltimaOrdenTS) {
        this.fechaUltimaOrdenTS = fechaUltimaOrdenTS;
    }

    public Timestamp getFechaUltimaOrdenTS() {
        return fechaUltimaOrdenTS;
    }

    public void setSubjectMaterRating(String subjectMaterRating) {
        this.subjectMaterRating = subjectMaterRating;
    }

    public String getSubjectMaterRating() {
        return subjectMaterRating;
    }

    public void setTipoOrden(String tipoOrden) {
        this.tipoOrden = tipoOrden;
    }

    public String getTipoOrden() {
        return tipoOrden;
    }

    public void setProviderEventId(String providerEventId) {
        this.providerEventId = providerEventId;
    }

    public String getProviderEventId() {
        return providerEventId;
    }

    public void setPpvClass(String ppvClass) {
        this.ppvClass = ppvClass;
    }

    public String getPpvClass() {
        return ppvClass;
    }

    public void setPpvGenreId(String ppvGenreId) {
        this.ppvGenreId = ppvGenreId;
    }

    public String getPpvGenreId() {
        return ppvGenreId;
    }

    public void setSkyTrackingId(String skyTrackingId) {
        this.skyTrackingId = skyTrackingId;
    }

    public String getSkyTrackingId() {
        return skyTrackingId;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setSubtitulos(String subtitulos) {
        this.subtitulos = subtitulos;
    }

    public String getSubtitulos() {
        return subtitulos;
    }

    public void setTituloMensaje(String tituloMensaje) {
        this.tituloMensaje = tituloMensaje;
    }

    public String getTituloMensaje() {
        return tituloMensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
