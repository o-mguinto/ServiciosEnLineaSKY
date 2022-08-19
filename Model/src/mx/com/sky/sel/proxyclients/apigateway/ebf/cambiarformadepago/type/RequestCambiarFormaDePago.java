package mx.com.sky.sel.proxyclients.apigateway.ebf.cambiarformadepago.type;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import mx.com.sky.sel.proxyclients.apigateway.headers.request.EBMHeaderRequest;

public class RequestCambiarFormaDePago implements Serializable  {
    @SuppressWarnings("compatibility:-1072949355100273128")
    private static final long serialVersionUID = -1412012685781739491L;


    private EBMHeaderRequest header;
    private CambiarFormaDePagoInput cambiarFormaDePagoInput;
    
    public RequestCambiarFormaDePago() {
        super();
    }

    public void setHeader(EBMHeaderRequest header) {
        this.header = header;
    }
    @JsonProperty("EBMHeaderRequest")
    public EBMHeaderRequest getHeader() {
        return header;
    }

    public void setCambiarFormaDePagoInput(CambiarFormaDePagoInput cambiarFormaDePagoInput) {
        this.cambiarFormaDePagoInput = cambiarFormaDePagoInput;
    }
    @JsonProperty("CambiarFormaDePagoInput")
    public CambiarFormaDePagoInput getCambiarFormaDePagoInput() {
        return cambiarFormaDePagoInput;
    }
}
