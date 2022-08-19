package mx.com.sky.sel.proxyclients.apigateway.ebs.actualizarestatusbilletera.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import mx.com.sky.sel.proxyclients.apigateway.headers.response.EBMHeaderResponse;

public class ResponseActualizarEstatusBilletera implements Serializable {
    @SuppressWarnings("compatibility:-4732255120889370601")
    private static final long serialVersionUID = 1L;

    private EBMHeaderResponse header;
    
    public ResponseActualizarEstatusBilletera() {
        super();
    }

    public void setHeader(EBMHeaderResponse header) {
        this.header = header;
    }
    @JsonProperty("EBMHeaderResponse")
    public EBMHeaderResponse getHeader() {
        return header;
    }
}
