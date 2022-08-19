package mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarriesgo.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class PagoInfo implements Serializable {
    @SuppressWarnings("compatibility:7967841593198339804")
    private static final long serialVersionUID = 1L;

    private InstrumentoDePago instrumentoDePago;

    public PagoInfo() {
        super();
    }

    public void setInstrumentoDePago(InstrumentoDePago instrumentoDePago) {
        this.instrumentoDePago = instrumentoDePago;
    }

    @JsonProperty("InstrumentoDePago")
    public InstrumentoDePago getInstrumentoDePago() {
        return instrumentoDePago;
    }

}
