package mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarreto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ComercioInfo implements Serializable {
    @SuppressWarnings("compatibility:2393192766750050358")
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
