package mx.com.sky.sel.proxyclients.apigateway.ebs.validarreto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ComercioInfo implements Serializable {
    @SuppressWarnings("compatibility:-6183829727978307582")
    private static final long serialVersionUID = 1L;


    private String comercioId;
    private String codigoSKY;
    
    public ComercioInfo() {
        super();
    }

    public void setComercioId(String comercioId) {
        this.comercioId = comercioId;
    }
    
    @JsonProperty("ComercioId")
    public String getComercioId() {
        return comercioId;
    }

    public void setCodigoSKY(String codigoSKY) {
        this.codigoSKY = codigoSKY;
    }
    
    @JsonProperty("CodigoSKY")
    public String getCodigoSKY() {
        return codigoSKY;
    }
}