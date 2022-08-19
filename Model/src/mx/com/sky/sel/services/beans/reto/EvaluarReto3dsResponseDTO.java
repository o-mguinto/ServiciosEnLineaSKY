package mx.com.sky.sel.services.beans.reto;

import java.io.Serializable;


import mx.com.sky.sel.services.beans.common.HeaderResponse;

public class EvaluarReto3dsResponseDTO implements Serializable {
    @SuppressWarnings("compatibility:-1338878768952106809")
    private static final long serialVersionUID = 1L;


    private HeaderResponse header;
    private String acsUrl;
    private String authenticationTransactionId;
    private String pareq;
    private String estatus;
    
    public EvaluarReto3dsResponseDTO() {
        super();
        this.header = new HeaderResponse();
    }

    public void setHeader(HeaderResponse header) {
        this.header = header;
    }

    public HeaderResponse getHeader() {
        return header;
    }

    public void setAcsUrl(String acsUrl) {
        this.acsUrl = acsUrl;
    }

    public String getAcsUrl() {
        return acsUrl;
    }

    public void setAuthenticationTransactionId(String authenticationTransactionId) {
        this.authenticationTransactionId = authenticationTransactionId;
    }

    public String getAuthenticationTransactionId() {
        return authenticationTransactionId;
    }

    public void setPareq(String pareq) {
        this.pareq = pareq;
    }

    public String getPareq() {
        return pareq;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getEstatus() {
        return estatus;
    }
}
