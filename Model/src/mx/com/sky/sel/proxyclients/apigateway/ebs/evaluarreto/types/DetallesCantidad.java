package mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarreto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class DetallesCantidad implements Serializable {
    @SuppressWarnings("compatibility:1802406983817638659")
    private static final long serialVersionUID = 1L;
    private String cantidadTotal;
    private String moneda;

    public DetallesCantidad() {
        super();
    }

    public void setCantidadTotal(String cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    @JsonProperty("CantidadTotal")
    public String getCantidadTotal() {
        return cantidadTotal;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    @JsonProperty("Moneda")
    public String getMoneda() {
        return moneda;
    }

}
