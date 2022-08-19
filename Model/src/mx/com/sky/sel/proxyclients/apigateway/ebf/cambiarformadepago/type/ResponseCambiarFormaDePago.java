package mx.com.sky.sel.proxyclients.apigateway.ebf.cambiarformadepago.type;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import mx.com.sky.sel.proxyclients.apigateway.headers.response.EBMHeaderResponse;

public class ResponseCambiarFormaDePago implements Serializable {
    @SuppressWarnings("compatibility:-5514629520806704685")
    private static final long serialVersionUID = 6327224791939501114L;

    private EBMHeaderResponse header;
    
    public ResponseCambiarFormaDePago() {
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
