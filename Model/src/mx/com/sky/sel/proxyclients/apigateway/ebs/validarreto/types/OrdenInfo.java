package mx.com.sky.sel.proxyclients.apigateway.ebs.validarreto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class OrdenInfo implements Serializable {
    @SuppressWarnings("compatibility:-1466239499204210380")
    private static final long serialVersionUID = 1L;


    //private DireccionFacturacion direccionFactura;
    private DetallesCantidad detallesCantidad;
    
    public OrdenInfo() {
        super();
    }

    public void setDetallesCantidad(DetallesCantidad detallesCantidad) {
        this.detallesCantidad = detallesCantidad;
    }
    @JsonProperty("DetallesCantidad")
    public DetallesCantidad getDetallesCantidad() {
        return detallesCantidad;
    }
}
