package mx.com.sky.sel.services.beans.utils;
import java.io.Serializable;
import java.util.List;

public class ServiciosCuenta implements Serializable{
    @SuppressWarnings("compatibility:-1207495231944059809")
    private static final long serialVersionUID = 5733966215384621067L;
    
    private boolean cuentaDualPlay;
    private String paqueteVideo;
    private String paqueteInternet;
    private String paqueteCelular;
    private String velocidadInternet;
    private String proveedorServicios;
    private String statusServicioInternet;
    private String msisdn;
    private String assetNumber;
    private String secondAssetNumber;
    private String assetNumberVideo;
    private String secondAssetNumberVideo;
    private String statusCodeMasterVideo;
    private String externalOffer;
    private List<LineaCelularDTO> lineasCelulares;
    
    public ServiciosCuenta() {
        super();
    }

    public void setCuentaDualPlay(boolean cuentaDualPlay) {
        this.cuentaDualPlay = cuentaDualPlay;
    }

    public boolean isCuentaDualPlay() {
        return cuentaDualPlay;
    }

    public void setPaqueteVideo(String paqueteVideo) {
        this.paqueteVideo = paqueteVideo;
    }

    public String getPaqueteVideo() {
        return paqueteVideo;
    }

    public void setPaqueteInternet(String paqueteInternet) {
        this.paqueteInternet = paqueteInternet;
    }

    public String getPaqueteInternet() {
        return paqueteInternet;
    }


    public void setPaqueteCelular(String paqueteCelular) {
        this.paqueteCelular = paqueteCelular;
    }

    public String getPaqueteCelular() {
        return paqueteCelular;
    }

    public void setVelocidadInternet(String velocidadInternet) {
        this.velocidadInternet = velocidadInternet;
    }

    public String getVelocidadInternet() {
        return velocidadInternet;
    }

    public void setProveedorServicios(String proveedorServicios) {
        this.proveedorServicios = proveedorServicios;
    }

    public String getProveedorServicios() {
        return proveedorServicios;
    }

    public void setStatusServicioInternet(String statusServicioInternet) {
        this.statusServicioInternet = statusServicioInternet;
    }

    public String getStatusServicioInternet() {
        return statusServicioInternet;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setAssetNumber(String assetNumber) {
        this.assetNumber = assetNumber;
    }

    public String getAssetNumber() {
        return assetNumber;
    }

    public void setSecondAssetNumber(String secondAssetNumber) {
        this.secondAssetNumber = secondAssetNumber;
    }
    
    public String getSecondAssetNumber() {
        return secondAssetNumber;
    }

    public void setAssetNumberVideo(String assetNumberVideo) {
        this.assetNumberVideo = assetNumberVideo;
    }
    
    public String getAssetNumberVideo() {
        return assetNumberVideo;
    }
    
    public void setSecondAssetNumberVideo(String secondAssetNumberVideo) {
        this.secondAssetNumberVideo = secondAssetNumberVideo;
    }
    
    public String getSecondAssetNumberVideo() {
        return this.secondAssetNumberVideo;
    }

    public void setStatusCodeMasterVideo(String statusCodeMasterVideo) {
        this.statusCodeMasterVideo = statusCodeMasterVideo;
    }

    public String getStatusCodeMasterVideo() {
        return statusCodeMasterVideo;
    }

    public void setExternalOffer(String externalOffer) {
        this.externalOffer = externalOffer;
    }

    public String getExternalOffer() {
        return externalOffer;
    }

    public void setLineasCelulares(List<LineaCelularDTO> lineasCelulares) {
        this.lineasCelulares = lineasCelulares;
    }

    public List<LineaCelularDTO> getLineasCelulares() {
        return lineasCelulares;
    }
}
