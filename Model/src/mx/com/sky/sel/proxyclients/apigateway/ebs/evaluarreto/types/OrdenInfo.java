package mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarreto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class OrdenInfo implements Serializable {
    @SuppressWarnings("compatibility:1642010879381700663")
    private static final long serialVersionUID = 1L;
    
    
    //private DireccionFacturacion direccionFactura;
    private DetallesCantidad detallesCantidad;

    public OrdenInfo() {
        super();
    }

    /*public void setDireccionFactura(DireccionFacturacion direccionFactura) {
           this.direccionFactura = direccionFactura;
       }
       @JsonProperty("DireccionFacturacion")
       public DireccionFacturacion getDireccionFactura() {
           return direccionFactura;
       }*/

    public void setDetallesCantidad(DetallesCantidad detallesCantidad) {
        this.detallesCantidad = detallesCantidad;
    }

    @JsonProperty("DetallesCantidad")
    public DetallesCantidad getDetallesCantidad() {
        return detallesCantidad;
    }
}

