package mx.com.sky.sel.services.beans.eventos;

import java.io.Serializable;

import java.sql.Timestamp;


public class Horario implements Serializable {
    @SuppressWarnings("compatibility:7928835340217749677")
    private static final long serialVersionUID = 4824173250610350810L;

    private String ppveventid;
    private String fechaInicio;
    private String fechaFin;
    private String fechaExpiracion;
    private String modalidad;
    private String token;
    private String fecharegistro;
    private Timestamp fechaInicioTS;
    private Timestamp fechaExpiracionTS;
    private Timestamp fechaFinTS;
    private Timestamp fecharegistroTS;
    private Integer duration;

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


    public Horario() {

    }

    public Horario(Horario horario) {
        super();
        this.ppveventid = horario.ppveventid;
        this.fechaInicio = horario.fechaInicio;
        this.fechaFin = horario.fechaFin;
        this.fechaExpiracion = horario.fechaExpiracion;
        this.modalidad = horario.modalidad;
        this.token = horario.token;
        this.fecharegistro = horario.fecharegistro;
        this.fechaInicioTS = horario.fechaInicioTS;
        this.fechaExpiracionTS = horario.fechaExpiracionTS;
        this.fechaFinTS = horario.fechaFinTS;
        this.fecharegistroTS = horario.fecharegistroTS;
        this.duration = horario.duration;
        this.tituloCanal = horario.tituloCanal;
        this.isPackage = horario.isPackage;
        this.minutosPrevios = horario.minutosPrevios;
        this.tokenPSC = horario.tokenPSC;
        this.minutosLibres = horario.minutosLibres;
        this.eventoLibre = horario.eventoLibre;
        this.fechaUltimaOrden = horario.fechaUltimaOrden;
        this.fechaUltimaOrdenTS = horario.fechaUltimaOrdenTS;
        this.subjectMaterRating = horario.subjectMaterRating;
        this.tipoOrden = horario.tipoOrden;
        this.providerEventId = horario.providerEventId;
        this.ppvClass = horario.ppvClass;
        this.ppvGenreId = horario.ppvGenreId;
        this.skyTrackingId = horario.skyTrackingId;
    }


    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Horario [");
        if (ppveventid != null) {
            builder.append("ppveventid=");
            builder.append(ppveventid);
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
        if (fechaExpiracion != null) {
            builder.append("fechaExpiracion=");
            builder.append(fechaExpiracion);
            builder.append(", ");
        }
        if (modalidad != null) {
            builder.append("modalidad=");
            builder.append(modalidad);
            builder.append(", ");
        }
        if (token != null) {
            builder.append("token=");
            builder.append(token);
            builder.append(", ");
        }
        if (fecharegistro != null) {
            builder.append("fecharegistro=");
            builder.append(fecharegistro);
            builder.append(", ");
        }
        if (fechaInicioTS != null) {
            builder.append("fechaInicioTS=");
            builder.append(fechaInicioTS);
            builder.append(", ");
        }
        if (fechaExpiracionTS != null) {
            builder.append("fechaExpiracionTS=");
            builder.append(fechaExpiracionTS);
            builder.append(", ");
        }
        if (fechaFinTS != null) {
            builder.append("fechaFinTS=");
            builder.append(fechaFinTS);
            builder.append(", ");
        }
        if (fecharegistroTS != null) {
            builder.append("fecharegistroTS=");
            builder.append(fecharegistroTS);
            builder.append(", ");
        }
        if (duration != null) {
            builder.append("duration=");
            builder.append(duration);
            builder.append(", ");
        }
        if (tituloCanal != null) {
            builder.append("tituloCanal=");
            builder.append(tituloCanal);
            builder.append(", ");
        }
        if (isPackage != null) {
            builder.append("isPackage=");
            builder.append(isPackage);
            builder.append(", ");
        }
        if (minutosPrevios != null) {
            builder.append("minutosPrevios=");
            builder.append(minutosPrevios);
            builder.append(", ");
        }
        if (tokenPSC != null) {
            builder.append("tokenPSC=");
            builder.append(tokenPSC);
            builder.append(", ");
        }
        if (minutosLibres != null) {
            builder.append("minutosLibres=");
            builder.append(minutosLibres);
            builder.append(", ");
        }
        if (eventoLibre != null) {
            builder.append("eventoLibre=");
            builder.append(eventoLibre);
            builder.append(", ");
        }
        if (fechaUltimaOrden != null) {
            builder.append("fechaUltimaOrden=");
            builder.append(fechaUltimaOrden);
            builder.append(", ");
        }
        if (fechaUltimaOrdenTS != null) {
            builder.append("fechaUltimaOrdenTS=");
            builder.append(fechaUltimaOrdenTS);
            builder.append(", ");
        }
        if (subjectMaterRating != null) {
            builder.append("subjectMaterRating=");
            builder.append(subjectMaterRating);
            builder.append(", ");
        }
        if (tipoOrden != null) {
            builder.append("tipoOrden=");
            builder.append(tipoOrden);
            builder.append(", ");
        }
        if (providerEventId != null) {
            builder.append("providerEventId=");
            builder.append(providerEventId);
            builder.append(", ");
        }
        if (ppvClass != null) {
            builder.append("ppvClass=");
            builder.append(ppvClass);
            builder.append(", ");
        }
        if (ppvGenreId != null) {
            builder.append("ppvGenreId=");
            builder.append(ppvGenreId);
        }
        if (skyTrackingId != null) {
            builder.append("skyTrackingId=");
            builder.append(skyTrackingId);
        }
        builder.append("]");
        return builder.toString();
    }


    /**
     * @return the fechaInicio
     */
    public String getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaFin
     */
    public String getFechaFin() {
        return fechaFin;
    }

    /**
     * @param fechaFin the fechaFin to set
     */
    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
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


    public void setPpveventid(String ppveventid) {
        this.ppveventid = ppveventid;
    }

    public String getPpveventid() {
        return ppveventid;
    }

    public void setFecharegistro(String fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    public String getFecharegistro() {
        return fecharegistro;
    }


    public void setFechaInicioTS(Timestamp fechaInicioTS) {
        this.fechaInicioTS = fechaInicioTS;
    }

    public Timestamp getFechaInicioTS() {
        return fechaInicioTS;
    }

    public void setFechaFinTS(Timestamp fechaFinTS) {
        this.fechaFinTS = fechaFinTS;
    }

    public Timestamp getFechaFinTS() {
        return fechaFinTS;
    }

    public void setFecharegistroTS(Timestamp fecharegistroTS) {
        this.fecharegistroTS = fecharegistroTS;
    }

    public Timestamp getFecharegistroTS() {
        return fecharegistroTS;
    }


    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracionTS(Timestamp fechaExpiracionTS) {
        this.fechaExpiracionTS = fechaExpiracionTS;
    }

    public Timestamp getFechaExpiracionTS() {
        return fechaExpiracionTS;
    }


    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getDuration() {
        return duration;
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

    public void setFechaUltimaOrdenTS(Timestamp fechaUltimaOrdenTS) {
        this.fechaUltimaOrdenTS = fechaUltimaOrdenTS;
    }

    public Timestamp getFechaUltimaOrdenTS() {
        return fechaUltimaOrdenTS;
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
}
