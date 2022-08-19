package mx.com.sky.sel.proxyclients.apigateway.ebs.procesartransacciondm.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import mx.com.sky.sel.proxyclients.apigateway.headers.response.EBMHeaderResponse;


public class ResponseProcesarTransaccionDM implements Serializable {
    @SuppressWarnings("compatibility:5913739933932353937")
    private static final long serialVersionUID = 1L;


    private EBMHeaderResponse header;
    private String codigoReferencia;
    private String transaccionDecisionId;
    private String decision;
    private String tokenRespuesta;
    private String codigoRespuesta;
    private String codigoRespuestaAccion;
    
    public ResponseProcesarTransaccionDM() {
        super();
    }

    public void setHeader(EBMHeaderResponse header) {
        this.header = header;
    }
    @JsonProperty("EBMHeaderResponse")
    public EBMHeaderResponse getHeader() {
        return header;
    }

    public void setCodigoReferencia(String codigoReferencia) {
        this.codigoReferencia = codigoReferencia;
    }
    @JsonProperty("CodigoReferencia")
    public String getCodigoReferencia() {
        return codigoReferencia;
    }

    public void setTransaccionDecisionId(String transaccionDecisionId) {
        this.transaccionDecisionId = transaccionDecisionId;
    }
    @JsonProperty("TransaccionDecisionId")
    public String getTransaccionDecisionId() {
        return transaccionDecisionId;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }
    @JsonProperty("Decision")
    public String getDecision() {
        return decision;
    }

    public void setTokenRespuesta(String tokenRespuesta) {
        this.tokenRespuesta = tokenRespuesta;
    }
    @JsonProperty("TokenRespuesta")
    public String getTokenRespuesta() {
        return tokenRespuesta;
    }

    public void setCodigoRespuesta(String codigoRespuesta) {
        this.codigoRespuesta = codigoRespuesta;
    }
    @JsonProperty("CodigoRespuesta")
    public String getCodigoRespuesta() {
        return codigoRespuesta;
    }

    public void setCodigoRespuestaAccion(String codigoRespuestaAccion) {
        this.codigoRespuestaAccion = codigoRespuestaAccion;
    }
    @JsonProperty("CodigoRespuestaAccion")
    public String getCodigoRespuestaAccion() {
        return codigoRespuestaAccion;
    }
}
