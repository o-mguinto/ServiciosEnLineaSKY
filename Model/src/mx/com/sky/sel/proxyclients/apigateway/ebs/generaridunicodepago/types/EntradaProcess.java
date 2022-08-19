package mx.com.sky.sel.proxyclients.apigateway.ebs.generaridunicodepago.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class EntradaProcess implements Serializable {
    @SuppressWarnings("compatibility:209120029714261536")
    private static final long serialVersionUID = -3243159074647703154L;
    
    private String cuenta;
    private String proceso;
    private String clearingHouse;
    private String sistemaOrigen;
    public EntradaProcess() {
        super();
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    @JsonProperty("Cuenta")
    public String getCuenta() {
        return cuenta;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }
    @JsonProperty("Proceso")
    public String getProceso() {
        return proceso;
    }

    public void setClearingHouse(String clearingHouse) {
        this.clearingHouse = clearingHouse;
    }
    @JsonProperty("ClearingHouse")
    public String getClearingHouse() {
        return clearingHouse;
    }

    public void setSistemaOrigen(String sistemaOrigen) {
        this.sistemaOrigen = sistemaOrigen;
    }
    @JsonProperty("SistemaOrigen")
    public String getSistemaOrigen() {
        return sistemaOrigen;
    }
}
