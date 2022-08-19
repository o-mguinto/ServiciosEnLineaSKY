package mx.com.sky.sel.services.beans.corporativos;
import java.io.Serializable;

import java.sql.Timestamp;


public class BatchDF implements Serializable {
    @SuppressWarnings("compatibility:2375161729763351405")
    private static final long serialVersionUID = 7557783783686336728L;
    private String bpelId;
    private String status;
    private Timestamp fechaCreacion;
    private String noSolicitud;
    private String noCuentaSKY;
    private String area;
    private String subArea;
    private String rfc;
    private String razonSocial;
    private String compania;
    private String tipoFactura;
    private String metodoEnvio;
    private String estado;
    private String poblacion;
    private String delMunicipio;
    private String colonia;
    private String codigoPostal;
    private String calle;
    private String noExterior;
    private String noInterior;
    private String nombreCorporativo;


    public BatchDF() {
        super();
    }


    public void setBpelId(String bpelId) {
        this.bpelId = bpelId;
    }

    public String getBpelId() {
        return bpelId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setNoSolicitud(String noSolicitud) {
        this.noSolicitud = noSolicitud;
    }

    public String getNoSolicitud() {
        return noSolicitud;
    }

    public void setNoCuentaSKY(String noCuentaSKY) {
        this.noCuentaSKY = noCuentaSKY;
    }

    public String getNoCuentaSKY() {
        return noCuentaSKY;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setSubArea(String subArea) {
        this.subArea = subArea;
    }

    public String getSubArea() {
        return subArea;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getCompania() {
        return compania;
    }

    public void setTipoFactura(String tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    public String getTipoFactura() {
        return tipoFactura;
    }

    public void setMetodoEnvio(String metodoEnvio) {
        this.metodoEnvio = metodoEnvio;
    }

    public String getMetodoEnvio() {
        return metodoEnvio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setDelMunicipio(String delMunicipio) {
        this.delMunicipio = delMunicipio;
    }

    public String getDelMunicipio() {
        return delMunicipio;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getColonia() {
        return colonia;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCalle() {
        return calle;
    }

    public void setNoExterior(String noExterior) {
        this.noExterior = noExterior;
    }

    public String getNoExterior() {
        return noExterior;
    }

    public void setNoInterior(String noInterior) {
        this.noInterior = noInterior;
    }

    public String getNoInterior() {
        return noInterior;
    }

    public void setNombreCorporativo(String nombreCorporativo) {
        this.nombreCorporativo = nombreCorporativo;
    }

    public String getNombreCorporativo() {
        return nombreCorporativo;
    }
}
