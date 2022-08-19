package mx.com.sky.sel.services.beans.reto;

import java.io.Serializable;

import mx.com.sky.sel.services.beans.common.HeaderResponse;

public class ValidarReto3dsResponseDTO implements Serializable {
    @SuppressWarnings("compatibility:4077150865501011826")
    private static final long serialVersionUID = 1L;


    private HeaderResponse header;
    private String token;
    private String eciRaw;
    private String authenticationTransactionId;
    private String estatus;

    public ValidarReto3dsResponseDTO() {
        super();
        this.header = new HeaderResponse();
    }
    
    public void setHeader(HeaderResponse header) {
        this.header = header;
    }

    public HeaderResponse getHeader() {
        return header;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setEciRaw(String eciRaw) {
        this.eciRaw = eciRaw;
    }

    public String getEciRaw() {
        return eciRaw;
    }

    public void setAuthenticationTransactionId(String authenticationTransactionId) {
        this.authenticationTransactionId = authenticationTransactionId;
    }

    public String getAuthenticationTransactionId() {
        return authenticationTransactionId;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getEstatus() {
        return estatus;
    }
}
