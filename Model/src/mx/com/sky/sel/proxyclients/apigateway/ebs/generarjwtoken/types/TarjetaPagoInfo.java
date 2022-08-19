package mx.com.sky.sel.proxyclients.apigateway.ebs.generarjwtoken.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class TarjetaPagoInfo implements Serializable {
    @SuppressWarnings("compatibility:4537604793052044122")
    private static final long serialVersionUID = 1L;

    private String tipo;
    private String mesExpiracion;
    private String anioExpiracion;
    private String numero;
    
    public TarjetaPagoInfo() {
        super();
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @JsonProperty("Tipo")
    public String getTipo() {
        return tipo;
    }

    public void setMesExpiracion(String mesExpiracion) {
        this.mesExpiracion = mesExpiracion;
    }
    @JsonProperty("MesExpiracion")
    public String getMesExpiracion() {
        return mesExpiracion;
    }

    public void setAnioExpiracion(String anioExpiracion) {
        this.anioExpiracion = anioExpiracion;
    }
    @JsonProperty("AnioExpiracion")
    public String getAnioExpiracion() {
        return anioExpiracion;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    @JsonProperty("Numero")
    public String getNumero() {
        return numero;
    }
}
