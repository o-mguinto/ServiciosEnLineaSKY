package mx.com.sky.sel.services.beans.riesgo;

import java.io.Serializable;

public class GenerarJWTokenResponseDTO implements Serializable {
    @SuppressWarnings("compatibility:-5015128119234333558")
    private static final long serialVersionUID = 1L;


    private String codigoError;
    private String descripcionError;
    private String estado;
    private String accessToken;
    private String urlParaCollecionDeDatos;
    private String referenceId;
    private String token;
    
    public GenerarJWTokenResponseDTO() {
        super();
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setUrlParaCollecionDeDatos(String urlParaCollecionDeDatos) {
        this.urlParaCollecionDeDatos = urlParaCollecionDeDatos;
    }

    public String getUrlParaCollecionDeDatos() {
        return urlParaCollecionDeDatos;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setCodigoError(String codigoError) {
        this.codigoError = codigoError;
    }

    public String getCodigoError() {
        return codigoError;
    }

    public void setDescripcionError(String descripcionError) {
        this.descripcionError = descripcionError;
    }

    public String getDescripcionError() {
        return descripcionError;
    }
}
