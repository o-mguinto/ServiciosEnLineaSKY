package mx.com.sky.sel.proxyclients.apigateway.ebs.validarreto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class EstadoSky implements Serializable {
    @SuppressWarnings("compatibility:2092532915500115393")
    private static final long serialVersionUID = 1L;


    private String id;
    private String mensaje;
    private String estado;
    
    public EstadoSky() {
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

    public void setEstado(String estado) {
        this.estado = estado;
    }
    @JsonProperty("Estado")
    public String getEstado() {
        return estado;
    }
}
