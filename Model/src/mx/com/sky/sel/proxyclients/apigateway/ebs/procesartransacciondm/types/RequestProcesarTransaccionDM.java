package mx.com.sky.sel.proxyclients.apigateway.ebs.procesartransacciondm.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


import mx.com.sky.sel.proxyclients.apigateway.headers.request.EBMHeaderRequest;

public class RequestProcesarTransaccionDM implements Serializable {
    @SuppressWarnings("compatibility:1778706549944711976")
    private static final long serialVersionUID = 1L;


    private EBMHeaderRequest header;
    private ComercioInfo comercioInfo;
    private String codigoReferencia;
    private String codigoAccion;
    private String transaccionDecisionId;
    private String comentarios;
    public RequestProcesarTransaccionDM() {
        super();
    }

    public void setHeader(EBMHeaderRequest header) {
        this.header = header;
    }
    @JsonProperty("EBMHeaderRequest")
    public EBMHeaderRequest getHeader() {
        return header;
    }

    public void setComercioInfo(ComercioInfo comercioInfo) {
        this.comercioInfo = comercioInfo;
    }
    @JsonProperty("ComercioInfo")
    public ComercioInfo getComercioInfo() {
        return comercioInfo;
    }

    public void setCodigoReferencia(String codigoReferencia) {
        this.codigoReferencia = codigoReferencia;
    }
    @JsonProperty("CodigoReferencia")
    public String getCodigoReferencia() {
        return codigoReferencia;
    }

    public void setCodigoAccion(String codigoAccion) {
        this.codigoAccion = codigoAccion;
    }
    @JsonProperty("CodigoAccion")
    public String getCodigoAccion() {
        return codigoAccion;
    }

    public void setTransaccionDecisionId(String transaccionDecisionId) {
        this.transaccionDecisionId = transaccionDecisionId;
    }
    @JsonProperty("TransaccionDecisionId")
    public String getTransaccionDecisionId() {
        return transaccionDecisionId;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    @JsonProperty("Comentarios")
    public String getComentarios() {
        return comentarios;
    }
}
