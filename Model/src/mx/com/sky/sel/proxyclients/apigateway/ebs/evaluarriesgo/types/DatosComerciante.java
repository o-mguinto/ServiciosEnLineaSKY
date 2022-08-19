package mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarriesgo.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import java.util.List;

public class DatosComerciante implements Serializable {
    @SuppressWarnings("compatibility:6979780730886460368")
    private static final long serialVersionUID = -1112050921142753923L;

    private List<ParametroComerciante> parametro;
    
    public DatosComerciante() {
        super();
    }

    public void setParametro(List<ParametroComerciante> parametro) {
        this.parametro = parametro;
    }
    @JsonProperty("Parametro")
    public List<ParametroComerciante> getParametro() {
        return parametro;
    }
}
