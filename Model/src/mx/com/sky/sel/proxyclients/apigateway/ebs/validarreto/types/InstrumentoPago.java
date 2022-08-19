package mx.com.sky.sel.proxyclients.apigateway.ebs.validarreto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class InstrumentoPago implements Serializable {
    @SuppressWarnings("compatibility:2311533364965344927")
    private static final long serialVersionUID = 1L;


    private String id;
    
    public InstrumentoPago() {
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
