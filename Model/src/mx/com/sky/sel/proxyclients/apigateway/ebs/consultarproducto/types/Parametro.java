package mx.com.sky.sel.proxyclients.apigateway.ebs.consultarproducto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Parametro implements Serializable {
    @SuppressWarnings("compatibility:-6385505918893403768")
    private static final long serialVersionUID = 6069491488803317423L;


    private String nombre;
    private String valor;
    public Parametro() {
        super();
        nombre = "";
        valor = "";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @JsonProperty("NOMBRE")
    public String getNombre() {
        return nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    @JsonProperty("VALOR")
    public String getValor() {
        return valor;
    }
}
