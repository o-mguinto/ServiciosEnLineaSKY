package mx.com.sky.sel.proxyclients.apigateway.ebs.validarreto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Cia implements Serializable {
    @SuppressWarnings("compatibility:-1550707504741046586")
    private static final long serialVersionUID = 1L;


    private String selfClosing;
    public Cia() {
        super();
    }
    
    public void setSelfClosing(String selfClosing) {
        this.selfClosing = selfClosing;
    }
    @JsonProperty("-self-closing")
    public String getSelfClosing() {
        return selfClosing;
    }
}
