package mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarreto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class EstadoSKY implements Serializable {
    @SuppressWarnings("compatibility:6766839379518610191")
    private static final long serialVersionUID = 1L;

    private String id;
    private String mensaje;
    private String Estado;

    public EstadoSKY() {
        super();
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("Id")
    public String getId() {
        return id;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @JsonProperty("Mensaje")
    public String getMensaje() {
        return mensaje;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    @JsonProperty("Estado")
    public String getEstado() {
        return Estado;
    }
}
