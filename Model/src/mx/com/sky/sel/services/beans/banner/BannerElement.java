package mx.com.sky.sel.services.beans.banner;
import java.io.Serializable;

import java.sql.Timestamp;

import java.util.ArrayList;
import java.util.List;


public class BannerElement implements Serializable {
    @SuppressWarnings("compatibility:-1240269090178213956")
    private static final long serialVersionUID = 92714569372375491L;

    private String id;
    private String idPais;
    private List<String> listaIdPais;
    private List<String> listaPaqueteCR;
    private List<String> listaPaqueteDO;
    private List<String> listaPaqueteGT;
    private List<String> listaPaqueteHN;
    private List<String> listaPaqueteMX;
    private List<String> listaPaqueteNI;
    private List<String> listaPaquetePA;
    private List<String> listaPaqueteSV;
    private String nombrePais;
    private String habilitada;
    private String tipoCuenta;
    private String paquete;
    private String nombre;
    private String imagen;
    private String linkActivo;
    private String link;
    private String descripcion;
    private Timestamp fechaInicio;
    private Timestamp fechaFin;
    private Timestamp fechaCreacion;
    private Timestamp fechaActualizacion;
    private boolean habilitadaBoolean;
    private boolean linkActivoBoolean;

    public BannerElement() {
        this.idPais = "";
        listaIdPais = new ArrayList<String>();
        listaPaqueteCR = new ArrayList<String>();
        listaPaqueteDO = new ArrayList<String>();
        listaPaqueteGT = new ArrayList<String>();
        listaPaqueteHN = new ArrayList<String>();
        listaPaqueteMX = new ArrayList<String>();
        listaPaqueteNI = new ArrayList<String>();
        listaPaquetePA = new ArrayList<String>();
        listaPaqueteSV = new ArrayList<String>();
        tipoCuenta = "";
    }

    /* (non-Javadoc)
             * @see java.lang.Object#toString()
             */

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("BannerElement [");
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
        if (nombrePais != null) {
            builder.append("nombrePais=");
            builder.append(nombrePais);
            builder.append(", ");
        }
        if (habilitada != null) {
            builder.append("habilitada=");
            builder.append(habilitada);
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

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setIdPais(String idPais) {
        this.idPais = idPais;
    }

    public String getIdPais() {
        return idPais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setHabilitada(String habilitada) {
        this.habilitada = habilitada;
        this.habilitadaBoolean =
                (habilitada == null || habilitada.equals("N")) ? false : true;
    }

    public String getHabilitada() {
        return habilitada;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setPaquete(String paquete) {
        this.paquete = paquete;
    }

    public String getPaquete() {
        return paquete;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getImagen() {
        return imagen;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
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

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaActualizacion(Timestamp fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public Timestamp getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setHabilitadaBoolean(boolean habilitadaBoolean) {
        this.habilitadaBoolean = habilitadaBoolean;
        this.habilitada = (habilitadaBoolean) ? "Y" : "N";
    }

    public boolean isHabilitadaBoolean() {
        return habilitadaBoolean;
    }


    public void setLinkActivo(String linkActivo) {
        this.linkActivo = linkActivo;
        this.linkActivoBoolean =
                (linkActivo == null || linkActivo.equals("N")) ? false : true;
    }

    public String getLinkActivo() {
        return linkActivo;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setLinkActivoBoolean(boolean linkActivoBoolean) {
        this.linkActivoBoolean = linkActivoBoolean;
        this.linkActivo = (linkActivoBoolean) ? "Y" : "N";
    }

    public boolean isLinkActivoBoolean() {
        return linkActivoBoolean;
    }


    public void setListaIdPais(List<String> listaIdPais) {
        this.listaIdPais = listaIdPais;
    }

    public List<String> getListaIdPais() {
        return listaIdPais;
    }


    public void setListaPaqueteCR(List<String> listaPaqueteCR) {
        this.listaPaqueteCR = listaPaqueteCR;
    }

    public List<String> getListaPaqueteCR() {
        return listaPaqueteCR;
    }

    public void setListaPaqueteDO(List<String> listaPaqueteDO) {
        this.listaPaqueteDO = listaPaqueteDO;
    }

    public List<String> getListaPaqueteDO() {
        return listaPaqueteDO;
    }

    public void setListaPaqueteGT(List<String> listaPaqueteGT) {
        this.listaPaqueteGT = listaPaqueteGT;
    }

    public List<String> getListaPaqueteGT() {
        return listaPaqueteGT;
    }

    public void setListaPaqueteHN(List<String> listaPaqueteHN) {
        this.listaPaqueteHN = listaPaqueteHN;
    }

    public List<String> getListaPaqueteHN() {
        return listaPaqueteHN;
    }

    public void setListaPaqueteMX(List<String> listaPaqueteMX) {
        this.listaPaqueteMX = listaPaqueteMX;
    }

    public List<String> getListaPaqueteMX() {
        return listaPaqueteMX;
    }

    public void setListaPaqueteNI(List<String> listaPaqueteNI) {
        this.listaPaqueteNI = listaPaqueteNI;
    }

    public List<String> getListaPaqueteNI() {
        return listaPaqueteNI;
    }

    public void setListaPaquetePA(List<String> listaPaquetePA) {
        this.listaPaquetePA = listaPaquetePA;
    }

    public List<String> getListaPaquetePA() {
        return listaPaquetePA;
    }

    public void setListaPaqueteSV(List<String> listaPaqueteSV) {
        this.listaPaqueteSV = listaPaqueteSV;
    }

    public List<String> getListaPaqueteSV() {
        return listaPaqueteSV;
    }
}
