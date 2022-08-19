package mx.com.sky.sel.proxyclients.apigateway.ebs.generarjwtoken.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class InformacionDeAutenticacionDeInvocacion implements Serializable {
    @SuppressWarnings("compatibility:-5830856512281983620")
    private static final long serialVersionUID = 1L;

    String accessToken;
    String urlParaCollecionDeDatos;
    String referenceId;
    String token;
    public InformacionDeAutenticacionDeInvocacion() {
        super();
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
    @JsonProperty("accessToken")
    public String getAccessToken() {
        return accessToken;
    }

    public void setUrlParaCollecionDeDatos(String urlParaCollecionDeDatos) {
        this.urlParaCollecionDeDatos = urlParaCollecionDeDatos;
    }
    @JsonProperty("UrlParaCollecionDeDatos")
    public String getUrlParaCollecionDeDatos() {
        return urlParaCollecionDeDatos;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }
    @JsonProperty("referenceId")
    public String getReferenceId() {
        return referenceId;
    }

    public void setToken(String token) {
        this.token = token;
    }
    @JsonProperty("token")
    public String getToken() {
        return token;
    }
}
