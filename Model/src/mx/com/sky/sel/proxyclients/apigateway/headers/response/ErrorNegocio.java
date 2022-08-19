package mx.com.sky.sel.proxyclients.apigateway.headers.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ErrorNegocio implements Serializable {
    @SuppressWarnings("compatibility:-1229433896574058758")
    private static final long serialVersionUID = 2317507530442394857L;
    
    private String estado;
    private String codigoError;
    private String descripcionError;
    
    public ErrorNegocio() {
        super();
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    @JsonProperty("Estado")
    public String getEstado() {
        return estado;
    }

    public void setCodigoError(String codigoError) {
        this.codigoError = codigoError;
    }
    
    @JsonProperty("CodigoError")
    public String getCodigoError() {
        return codigoError;
    }
    
    public void setDescripcionError(String descripcionError) {
        this.descripcionError = descripcionError;
    }
    
    @JsonProperty("DescripcionError")
    public String getDescripcionError() {
        return descripcionError;
    }
}
