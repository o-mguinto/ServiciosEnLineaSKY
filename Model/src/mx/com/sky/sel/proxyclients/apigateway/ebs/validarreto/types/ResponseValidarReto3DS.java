package mx.com.sky.sel.proxyclients.apigateway.ebs.validarreto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


import mx.com.sky.sel.proxyclients.apigateway.headers.response.EBMHeaderResponse;

public class ResponseValidarReto3DS implements Serializable {
    @SuppressWarnings("compatibility:-7549621054229729243")
    private static final long serialVersionUID = 1L;


    private EBMHeaderResponse header;
    private RespuestaGenerarReto respuestaGenerarReto;
    
    public ResponseValidarReto3DS() {
        super();
    }

    public void setHeader(EBMHeaderResponse header) {
        this.header = header;
    }
    @JsonProperty("EBMHeaderResponse")
    public EBMHeaderResponse getHeader() {
        return header;
    }

    public void setRespuestaGenerarReto(RespuestaGenerarReto respuestaGenerarReto) {
        this.respuestaGenerarReto = respuestaGenerarReto;
    }
    @JsonProperty("RespuestaGenerarReto")
    public RespuestaGenerarReto getRespuestaGenerarReto() {
        return respuestaGenerarReto;
    }
}
