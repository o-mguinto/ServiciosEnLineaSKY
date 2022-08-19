package mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarreto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class CompradorInfo implements Serializable {
    @SuppressWarnings("compatibility:-5584063537667826944")
    private static final long serialVersionUID = 1L;
    private String telefonoMovil;

    public CompradorInfo() {
        super();
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    @JsonProperty("TelefonoMovil")
    public String getTelefonoMovil() {
        return telefonoMovil;
    }
}
