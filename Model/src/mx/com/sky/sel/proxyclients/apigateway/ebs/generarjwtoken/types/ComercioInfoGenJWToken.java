package mx.com.sky.sel.proxyclients.apigateway.ebs.generarjwtoken.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ComercioInfoGenJWToken implements Serializable {
    @SuppressWarnings("compatibility:1116038790335475059")
    private static final long serialVersionUID = 1L;

    private String comercioId;
    private String codigoSKY;
    public ComercioInfoGenJWToken() {
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
