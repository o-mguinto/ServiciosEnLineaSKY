package mx.com.sky.sel.proxyclients.apigateway.ebf.orquestarprocesopago.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import mx.com.sky.sel.proxyclients.apigateway.headers.response.EBMHeaderResponse;

public class ResponseOrquestarProcesoPagoPMP implements Serializable {
    @SuppressWarnings("compatibility:-9027041312678514296")
    private static final long serialVersionUID = -1969163844865945082L;
    
    private EBMHeaderResponse header;
    private RespuestaPagoTarjeta respuestaPagoTarjeta;
    public ResponseOrquestarProcesoPagoPMP() {
        super();
    }

    public void setHeader(EBMHeaderResponse header) {
        this.header = header;
    }
    @JsonProperty("EBMHeaderResponse")
    public EBMHeaderResponse getHeader() {
        return header;
    }

    public void setRespuestaPagoTarjeta(RespuestaPagoTarjeta respuestaPagoTarjeta) {
        this.respuestaPagoTarjeta = respuestaPagoTarjeta;
    }
    @JsonProperty("RespuestaPagoTarjeta")
    public RespuestaPagoTarjeta getRespuestaPagoTarjeta() {
        return respuestaPagoTarjeta;
    }
}
