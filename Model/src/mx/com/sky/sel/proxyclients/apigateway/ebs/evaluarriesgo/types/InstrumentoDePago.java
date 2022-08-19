package mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarriesgo.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class InstrumentoDePago implements Serializable {
    @SuppressWarnings("compatibility:-8487599490111719421")
    private static final long serialVersionUID = 1L;

    private String instumentoDePagoId;

    public InstrumentoDePago() {
        super();
    }

    public void setInstumentoDePagoId(String instumentoDePagoId) {
        this.instumentoDePagoId = instumentoDePagoId;
    }

    @JsonProperty("InstrumentoDePagoId")
    public String getInstumentoDePagoId() {
        return instumentoDePagoId;
    }


}
