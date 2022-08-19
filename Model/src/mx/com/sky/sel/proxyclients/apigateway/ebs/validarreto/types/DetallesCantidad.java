package mx.com.sky.sel.proxyclients.apigateway.ebs.validarreto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
    
public class DetallesCantidad implements Serializable {
    @SuppressWarnings("compatibility:2222405333724071631")
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
