package mx.com.sky.sel.proxyclients.apigateway.headers.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ParametroItem implements Serializable {
    @SuppressWarnings("compatibility:-5266013129609260150")
    private static final long serialVersionUID = -4004451348733641464L;
    
    private String  nombre;
    private String valor;
    
    public ParametroItem() {
        super();
        this.nombre = "";
        this.valor = "";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @JsonProperty("Nombre")
    public String getNombre() {
        return nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    @JsonProperty("Valor")
    public String getValor() {
        return valor;
    }
}
