package mx.com.sky.sel.proxyclients.apigateway.headers.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EBMHeaderResponse implements Serializable {
    @SuppressWarnings("compatibility:-1662575492815519388")
    private static final long serialVersionUID = 6222377592076626222L;
    
    private ErrorTecnico errorTecnico;
    private ErrorNegocio errorNegocio;
    
    public EBMHeaderResponse() {
        super();
    }

    public void setErrorTecnico(ErrorTecnico errorTecnico) {
        this.errorTecnico = errorTecnico;
    }
    
    @JsonProperty("ErrorTecnico")
    public ErrorTecnico getErrorTecnico() {
        return errorTecnico;
    }

    public void setErrorNegocio(ErrorNegocio errorNegocio) {
        this.errorNegocio = errorNegocio;
    }
    
    @JsonProperty("ErrorNegocio")
    public ErrorNegocio getErrorNegocio() {
        return errorNegocio;
    }
}
