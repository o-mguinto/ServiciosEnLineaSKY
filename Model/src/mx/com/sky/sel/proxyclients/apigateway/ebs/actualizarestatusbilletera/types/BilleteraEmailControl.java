package mx.com.sky.sel.proxyclients.apigateway.ebs.actualizarestatusbilletera.types;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BilleteraEmailControl implements Serializable {
    @SuppressWarnings("compatibility:-2544882258556644913")
    private static final long serialVersionUID = 1L;

    private String id;
    private String estatus;


    public void setId(String id) {
        this.id = id;
    }
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    
    @JsonProperty("estatus")
    public String getEstatus() {
        return estatus;
    }

    public BilleteraEmailControl() {
        super();
    }
}
