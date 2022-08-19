package mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarreto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ApellidoPaterno implements Serializable {
    @SuppressWarnings("compatibility:-7238354665206117359")
    private static final long serialVersionUID = 1L;
    private String selfClosing;

    public ApellidoPaterno() {
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
