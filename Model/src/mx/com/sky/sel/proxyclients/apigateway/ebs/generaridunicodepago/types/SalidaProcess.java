package mx.com.sky.sel.proxyclients.apigateway.ebs.generaridunicodepago.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class SalidaProcess implements Serializable {
    @SuppressWarnings("compatibility:-1011781050193617441")
    private static final long serialVersionUID = 643950758603512775L;
    
    private String idPagoSKY;
    public SalidaProcess() {
        super();
    }

    public void setIdPagoSKY(String idPagoSKY) {
        this.idPagoSKY = idPagoSKY;
    }
    @JsonProperty("IdPagoSKY")
    public String getIdPagoSKY() {
        return idPagoSKY;
    }
}
