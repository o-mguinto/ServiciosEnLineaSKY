package mx.com.sky.sel.proxyclients.apigateway.ebs.consultarproducto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ContratoSiebel implements Serializable {
    @SuppressWarnings("compatibility:-1001270278381313862")
    private static final long serialVersionUID = 198594122617928352L;


    private Cabecera cabecera;
    private String proceso;
    private String categoria;
    private String cuenta;
    private String origen;
    private String numeroTarjeta;

    public ContratoSiebel() {
        super();
    }

    public void setCabecera(Cabecera cabecera) {
        this.cabecera = cabecera;
    }
    @JsonProperty("CABECERA")
    public Cabecera getCabecera() {
        return cabecera;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }
    @JsonProperty("Proceso")
    public String getProceso() {
        return proceso;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    @JsonProperty("Categoria")
    public String getCategoria() {
        return categoria;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    @JsonProperty("Cuenta")
    public String getCuenta() {
        return cuenta;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
    @JsonProperty("Origen")
    public String getOrigen() {
        return origen;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    @JsonProperty("NumeroTarjeta")
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }
}
