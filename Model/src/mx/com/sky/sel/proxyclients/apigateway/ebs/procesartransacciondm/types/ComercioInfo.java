package mx.com.sky.sel.proxyclients.apigateway.ebs.procesartransacciondm.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ComercioInfo implements Serializable {
    @SuppressWarnings("compatibility:-2731051989108578796")
    private static final long serialVersionUID = 1L;


    private String comercioId;
    public ComercioInfo() {
        super();
    }

    public void setComercioId(String comercioId) {
        this.comercioId = comercioId;
    }
    @JsonProperty("ComercioId")
    public String getComercioId() {
        return comercioId;
    }
}
