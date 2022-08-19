package mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarreto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ErrorInfo implements Serializable {
    @SuppressWarnings("compatibility:381252062776908097")
    private static final long serialVersionUID = 1L;

    private String razon;
    private String mensaje;


    public ErrorInfo() {
        super();
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    @JsonProperty("Razon")
    public String getRazon() {
        return razon;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @JsonProperty("Mensaje")
    public String getMensaje() {
        return mensaje;
    }

}
