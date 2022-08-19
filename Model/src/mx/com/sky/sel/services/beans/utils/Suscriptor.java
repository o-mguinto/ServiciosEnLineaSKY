package mx.com.sky.sel.services.beans.utils;

import java.io.Serializable;

import java.util.List;

import mx.com.sky.sel.log.LogServicios;

public class Suscriptor implements Serializable{
    @SuppressWarnings("compatibility:5927388906942080081")
    private static final long serialVersionUID = 3691630909396653280L;
    
    protected String billingCode;
    protected String cuentaSKY;
    protected String currencyCode;
    protected String marketClass;
    protected String marketType;
    protected String nombreSuscriptor;
    protected String organizacion;
    protected String paquete;
    protected String paqueteBanner;
    protected String promocionActivacion;
    protected String respuesta;
    protected String respuestadesc;
    protected String rowId;
    protected String contactoRowId;
    protected String statusCuenta;
    protected String statusRecarga;
    protected String pais;
    protected String diferenciaHoraria;
    protected String organizationType;
    protected boolean equipoHD;
    protected boolean oppv;
    protected boolean ippv;
    protected String skyModemInternet;
    protected String skyPaqueteInternet;
    protected String msisdnInternet;
    protected String externalOffer;
    protected String proveedorServicioInternet;
    protected String statusServicioIntenet;
    protected String assetNumberInternet;
    protected String secondAssetNumberInternet;
    protected String assetNumberVideo;
    protected String secondAssetNumberVideo;
    protected String statusCodeMasterVideo;
    protected boolean permitePagoTC;
    protected String razonSocialHotel;
    protected String rfcHotel;
    protected String numeroRecargas;
    //variable para asiganar el paquete en Mi perfil
    protected String paqueteMiPerfil;
    protected List<LineaCelularDTO> lineasCelulares;
    protected String paqueteCelular;


    public Suscriptor() {
        super();
    }


    /** (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Suscriptor [");
        if (pais != null) {
            builder.append("pais=");
            builder.append(pais);
            builder.append(", ");
        }

        if (cuentaSKY != null) {
            builder.append("cuentaSKY=");
            builder.append(cuentaSKY);
            builder.append(", ");
        }
        if (paquete != null) {
            builder.append("paquete=");
            builder.append(paquete);
            builder.append(", ");
        }
        if (nombreSuscriptor != null) {
            builder.append("nombreSuscriptor=");
            builder.append(nombreSuscriptor);
        }
        builder.append("]");
        return builder.toString();
    }


    /**
     * @return the billingCode
     */
    public String getBillingCode() {
        return billingCode;
    }

    /**
     * @param billingCode the billingCode to set
     */
    public void setBillingCode(String billingCode) {
        this.billingCode = billingCode;
    }

    /**
     * @return the cuentaSKY
     */
    public String getCuentaSKY() {
        return cuentaSKY;
    }

    /**
     * @param cuentaSKY the cuentaSKY to set
     */
    public void setCuentaSKY(String cuentaSKY) {
        this.cuentaSKY = cuentaSKY;
    }

    /**
     * @return the currencyCode
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * @param currencyCode the currencyCode to set
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * @return the marketClass
     */
    public String getMarketClass() {
        return marketClass;
    }

    /**
     * @param marketClass the marketClass to set
     */
    public void setMarketClass(String marketClass) {
        this.marketClass = marketClass;
    }

    /**
     * @return the marketType
     */
    public String getMarketType() {
        return marketType;
    }

    /**
     * @param marketType the marketType to set
     */
    public void setMarketType(String marketType) {
        this.marketType = marketType;
    }

    /**
     * @return the nombreSuscriptor
     */
    public String getNombreSuscriptor() {
        return nombreSuscriptor;
    }

    /**
     * @param nombreSuscriptor the nombreSuscriptor to set
     */
    public void setNombreSuscriptor(String nombreSuscriptor) {
        this.nombreSuscriptor = nombreSuscriptor;
    }

    /**
     * @return the organizacion
     */
    public String getOrganizacion() {
        return organizacion;
    }

    /**
     * @param organizacion the organizacion to set
     */
    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
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
        if(paquete != null && paquete.contains("MOVIE CITY")){
            this.paqueteMiPerfil = "FOX+";
        }else{
            this.paqueteMiPerfil = paquete;   
        }
    }

    /**
     * @return the promocionActivacion
     */
    public String getPromocionActivacion() {
        return promocionActivacion;
    }

    /**
     * @param promocionActivacion the promocionActivacion to set
     */
    public void setPromocionActivacion(String promocionActivacion) {
        this.promocionActivacion = promocionActivacion;
    }

    /**
     * @return the respuesta
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * @param respuesta the respuesta to set
     */
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    /**
     * @return the respuestadesc
     */
    public String getRespuestadesc() {
        return respuestadesc;
    }

    /**
     * @param respuestadesc the respuestadesc to set
     */
    public void setRespuestadesc(String respuestadesc) {
        this.respuestadesc = respuestadesc;
    }

    /**
     * @return the rowId
     */
    public String getRowId() {
        return rowId;
    }

    /**
     * @param rowId the rowId to set
     */
    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    /**
     * @return the statusCuenta
     */
    public String getStatusCuenta() {
        return statusCuenta;
    }

    /**
     * @param statusCuenta the statusCuenta to set
     */
    public void setStatusCuenta(String statusCuenta) {
        this.statusCuenta = statusCuenta;
    }

    /**
     * @return the statusRecarga
     */
    public String getStatusRecarga() {
        return statusRecarga;
    }

    /**
     * @param statusRecarga the statusRecarga to set
     */
    public void setStatusRecarga(String statusRecarga) {
        this.statusRecarga = statusRecarga;
    }


    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public String getPaisISO() {
        String paisISO = "";
        if (pais == null) {
            return "";
        }
        if (pais.equalsIgnoreCase("MEX")) {
            paisISO = "MX";
        } else if (pais.equalsIgnoreCase("CRICA")) {
            paisISO = "CR";
        } else if (pais.equalsIgnoreCase("GT")) {
            paisISO = "GT";
        } else if (pais.equalsIgnoreCase("HON")) {
            paisISO = "HN";
        } else if (pais.equalsIgnoreCase("NIC")) {
            paisISO = "NI";
        } else if (pais.equalsIgnoreCase("PAN")) {
            paisISO = "PA";
        } else if (pais.equalsIgnoreCase("DOM")) {
            paisISO = "DO";
        } else if (pais.equalsIgnoreCase("SAL")) {
            paisISO = "SV";
        } else {
            LogServicios.printlnWarn(this, "PAIS NO ENCONTRADO:" + pais);
        }
        return paisISO;
    }

    public void setDiferenciaHoraria(String diferenciaHoraria) {
        this.diferenciaHoraria = diferenciaHoraria;
    }

    public String getDiferenciaHoraria() {
        return diferenciaHoraria;
    }


    public void setContactoRowId(String contactoRowId) {
        this.contactoRowId = contactoRowId;
    }

    public String getContactoRowId() {
        return contactoRowId;
    }


    public void setOppv(boolean oppv) {
        this.oppv = oppv;
    }

    public boolean isOppv() {
        return oppv;
    }


    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

    public String getOrganizationType() {
        return organizationType;
    }

    public void setIppv(boolean ippv) {
        this.ippv = ippv;
    }

    public boolean isIppv() {
        return ippv;
    }

    public void setEquipoHD(boolean equipoHD) {
        this.equipoHD = equipoHD;
    }

    public boolean isEquipoHD() {
        return equipoHD;
    }

    public void setSkyModemInternet(String skyModemInternet) {
        this.skyModemInternet = skyModemInternet;
    }

    public String getSkyModemInternet() {
        return skyModemInternet;
    }

    public void setSkyPaqueteInternet(String skyPaqueteInternet) {
        this.skyPaqueteInternet = skyPaqueteInternet;
    }

    public String getSkyPaqueteInternet() {
        return skyPaqueteInternet;
    }

    public void setPermitePagoTC(boolean permitePagoTC) {
        this.permitePagoTC = permitePagoTC;
    }

    public boolean isPermitePagoTC() {
        return permitePagoTC;
    }

    public void setPaqueteBanner(String paqueteBanner) {
        this.paqueteBanner = paqueteBanner;
    }

    public String getPaqueteBanner() {
        return paqueteBanner;
    }

    public void setPaqueteMiPerfil(String paqueteMiPerfil) {
        this.paqueteMiPerfil = paqueteMiPerfil;
    }

    public String getPaqueteMiPerfil() {
        /*if(paquete.contains("MOVIE CITY")){
            paqueteMiPerfil ="FOX+";
        }else{
            setPaqueteMiPerfil(getPaquete());
            //paqueteMiPerfil = getPaquete();
            }*/
        return paqueteMiPerfil;
    }

    public void setNumeroRecargas(String numeroRecargas) {
        this.numeroRecargas = numeroRecargas;
    }

    public String getNumeroRecargas() {
        return numeroRecargas;
    }

    public void setRazonSocialHotel(String razonSocialHotel) {
        this.razonSocialHotel = razonSocialHotel;
    }

    public String getRazonSocialHotel() {
        return razonSocialHotel;
    }

    public void setRfcHotel(String rfcHotel) {
        this.rfcHotel = rfcHotel;
    }

    public String getRfcHotel() {
        return rfcHotel;
    }

    public void setMsisdnInternet(String msisdnInternet) {
        this.msisdnInternet = msisdnInternet;
    }

    public String getMsisdnInternet() {
        return msisdnInternet;
    }

    public void setProveedorServicioInternet(String proveedorServicioInternet) {
        this.proveedorServicioInternet = proveedorServicioInternet;
    }

    public String getProveedorServicioInternet() {
        return proveedorServicioInternet;
    }

    public void setStatusServicioIntenet(String statusServicioIntenet) {
        this.statusServicioIntenet = statusServicioIntenet;
    }

    public String getStatusServicioIntenet() {
        return statusServicioIntenet;
    }

    public void setAssetNumberInternet(String assetNumberInternet) {
        this.assetNumberInternet = assetNumberInternet;
    }

    public String getAssetNumberInternet() {
        return assetNumberInternet;
    }

    public void setSecondAssetNumberInternet(String secondAssetNumberInternet) {
        this.secondAssetNumberInternet = secondAssetNumberInternet;
    }

    public String getSecondAssetNumberInternet() {
        return secondAssetNumberInternet;
    }
    
    public void setAssetNumberVideo(String assetNumberVideo) {
        this.assetNumberVideo = assetNumberVideo;
    }

    public String getAssetNumberVideo() {
        return assetNumberVideo;
    }

    public void setStatusCodeMasterVideo(String statusCodeMasterVideo) {
        this.statusCodeMasterVideo = statusCodeMasterVideo;
    }

    public String getStatusCodeMasterVideo() {
        return statusCodeMasterVideo;
    }

    public void setSecondAssetNumberVideo(String secondAssetNumberVideo) {
        this.secondAssetNumberVideo = secondAssetNumberVideo;
    }

    public String getSecondAssetNumberVideo() {
        return secondAssetNumberVideo;
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

    public void setPaqueteCelular(String paqueteCelular) {
        this.paqueteCelular = paqueteCelular;
    }

    public String getPaqueteCelular() {
        return paqueteCelular;
    }
    
    public int getNumLineasCelular() {
        int numLineasCelulares = 0;
        
        if( this.lineasCelulares != null ) {
            numLineasCelulares = this.lineasCelulares.size();
        }
        
        return numLineasCelulares;
    }
    
    public boolean isCuentaCelular() {
        return this.lineasCelulares != null;
    }
}
