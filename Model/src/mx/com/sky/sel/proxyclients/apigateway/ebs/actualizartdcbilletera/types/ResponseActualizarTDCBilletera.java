package mx.com.sky.sel.proxyclients.apigateway.ebs.actualizartdcbilletera.types;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;

import mx.com.sky.sel.proxyclients.apigateway.headers.response.EBMHeaderResponse;

public class ResponseActualizarTDCBilletera implements Serializable {
    @SuppressWarnings("compatibility:-5860378966318609010")
    private static final long serialVersionUID = 1L;

    private EBMHeaderResponse header;
    
    public ResponseActualizarTDCBilletera() {
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
