package mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarreto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class InstrumentoDePago implements Serializable {
    @SuppressWarnings("compatibility:5253722709640407311")
    private static final long serialVersionUID = 1L;

    private String id;

    public InstrumentoDePago() {
        super();
    }


    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("Id")
    public String getId() {
        return id;
    }
}
