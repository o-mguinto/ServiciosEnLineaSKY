package mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarriesgo.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class OrdenInfo implements Serializable {
    @SuppressWarnings("compatibility:-8336349323708348600")
    private static final long serialVersionUID = 1L;

    private DetalleMonto detalleMonto;


    public OrdenInfo() {
        super();
    }

    public void setDetalleMonto(DetalleMonto detalleMonto) {
        this.detalleMonto = detalleMonto;
    }

    @JsonProperty("DetalleMonto")
    public DetalleMonto getDetalleMonto() {
        return detalleMonto;
    }

}
