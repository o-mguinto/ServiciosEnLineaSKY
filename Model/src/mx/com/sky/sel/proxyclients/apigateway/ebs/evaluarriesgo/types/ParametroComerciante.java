package mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarriesgo.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ParametroComerciante implements Serializable {
    @SuppressWarnings("compatibility:-6771256543352669572")
    private static final long serialVersionUID = 6944532729788741461L;
    
    private String nombreParametro;
    private String valorParametro;
    
    public ParametroComerciante() {
        super();
    }

    public void setNombreParametro(String nombreParametro) {
        this.nombreParametro = nombreParametro;
    }
    @JsonProperty("NombreParametro")
    public String getNombreParametro() {
        return nombreParametro;
    }

    public void setValorParametro(String valorParametro) {
        this.valorParametro = valorParametro;
    }
    @JsonProperty("ValorParametro")
    public String getValorParametro() {
        return valorParametro;
    }
}
