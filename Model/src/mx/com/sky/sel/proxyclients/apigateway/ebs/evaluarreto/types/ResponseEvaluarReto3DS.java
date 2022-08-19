package mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarreto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import mx.com.sky.sel.proxyclients.apigateway.headers.response.EBMHeaderResponse;

public class ResponseEvaluarReto3DS implements Serializable {
    @SuppressWarnings("compatibility:-7780706934887509924")
    private static final long serialVersionUID = 1L;

    private EBMHeaderResponse header;
    private RespuestaGenerarReto respuesta;


    public ResponseEvaluarReto3DS() {
        super();
    }

    public void setHeader(EBMHeaderResponse header) {
        this.header = header;
    }

    @JsonProperty("EBMHeaderResponse")
    public EBMHeaderResponse getHeader() {
        return header;
    }

    public void setRespuesta(RespuestaGenerarReto respuesta) {
        this.respuesta = respuesta;
    }

    @JsonProperty("RespuestaGenerarReto")
    public RespuestaGenerarReto getRespuesta() {
        return respuesta;
    }
}
