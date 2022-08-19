package mx.com.sky.sel.proxyclients.apigateway.ebs.consultartipocambio.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ConsultarTipoCambioInput implements Serializable {
    @SuppressWarnings("compatibility:1465430583031082904")
    private static final long serialVersionUID = -844025015113843599L;

    private String pPais;
    private String pEstatus;
    
    public ConsultarTipoCambioInput() {
        super();
    }

    public void setPPais(String pPais) {
        this.pPais = pPais;
    }
    @JsonProperty("pPais")
    public String getPPais() {
        return pPais;
    }

    public void setPEstatus(String pEstatus) {
        this.pEstatus = pEstatus;
    }
    @JsonProperty("pEstatus")
    public String getPEstatus() {
        return pEstatus;
    }
}
