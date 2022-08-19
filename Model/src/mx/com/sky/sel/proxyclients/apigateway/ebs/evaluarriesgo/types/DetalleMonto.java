package mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarriesgo.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class DetalleMonto implements Serializable {
    @SuppressWarnings("compatibility:8193503276516315798")
    private static final long serialVersionUID = 1L;

    private String montoTotal;
    private String monedaISO;

    public DetalleMonto() {
        super();
    }

    public void setMontoTotal(String montoTotal) {
        this.montoTotal = montoTotal;
    }

    @JsonProperty("MontoTotal")
    public String getMontoTotal() {
        return montoTotal;
    }

    public void setMonedaISO(String monedaISO) {
        this.monedaISO = monedaISO;
    }

    @JsonProperty("MonedaISO")
    public String getMonedaISO() {
        return monedaISO;
    }
}
