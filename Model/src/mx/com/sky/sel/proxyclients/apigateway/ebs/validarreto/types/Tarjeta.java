package mx.com.sky.sel.proxyclients.apigateway.ebs.validarreto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Tarjeta implements Serializable {
    @SuppressWarnings("compatibility:-6188670033420485877")
    private static final long serialVersionUID = 1L;


    private String bin;
    private String tipo;
    
    public Tarjeta() {
        super();
    }

    public void setBin(String bin) {
        this.bin = bin;
    }
    @JsonProperty("Bin")
    public String getBin() {
        return bin;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @JsonProperty("Tipo")
    public String getTipo() {
        return tipo;
    }
}
