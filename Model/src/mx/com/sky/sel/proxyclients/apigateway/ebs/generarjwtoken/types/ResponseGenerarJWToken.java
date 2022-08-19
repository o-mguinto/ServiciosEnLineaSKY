package mx.com.sky.sel.proxyclients.apigateway.ebs.generarjwtoken.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


import mx.com.sky.sel.proxyclients.apigateway.headers.response.EBMHeaderResponse;

public class ResponseGenerarJWToken implements Serializable {
    @SuppressWarnings("compatibility:8736156518384569984")
    private static final long serialVersionUID = 1L;


    private EBMHeaderResponse header;
    private RespuestaGenerarJWToken respuestaJwToken;
    public ResponseGenerarJWToken() {
        super();
    }

    public void setHeader(EBMHeaderResponse header) {
        this.header = header;
    }
    @JsonProperty("EBMHeaderResponse")
    public EBMHeaderResponse getHeader() {
        return header;
    }

    public void setRespuestaJwToken(RespuestaGenerarJWToken respuestaJwToken) {
        this.respuestaJwToken = respuestaJwToken;
    }
    @JsonProperty("RespuestaGenerarJWToken")
    public RespuestaGenerarJWToken getRespuestaJwToken() {
        return respuestaJwToken;
    }
}
