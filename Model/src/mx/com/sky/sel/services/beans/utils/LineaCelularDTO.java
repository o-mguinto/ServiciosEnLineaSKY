package mx.com.sky.sel.services.beans.utils;

import java.io.Serializable;

public class LineaCelularDTO implements Serializable {
    @SuppressWarnings("compatibility:-6124777993970638365")
    private static final long serialVersionUID = -6453599886125561917L;

    private String numCelular;
    private String externalOffer;
    private String assetNumber;
    private boolean masterPaquetePrincipal;
    
    public LineaCelularDTO() {
        super();
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setExternalOffer(String externalOffer) {
        this.externalOffer = externalOffer;
    }

    public String getExternalOffer() {
        return externalOffer;
    }
    
    public void setAssetNumber(String assetNumber){
        this.assetNumber = assetNumber;
    }
    
    public String getAssetNumber(){
        return this.assetNumber;
    }

    public void setMasterPaquetePrincipal(boolean masterPaquetePrincipal) {
        this.masterPaquetePrincipal = masterPaquetePrincipal;
    }

    public boolean isMasterPaquetePrincipal() {
        return masterPaquetePrincipal;
    }
}
