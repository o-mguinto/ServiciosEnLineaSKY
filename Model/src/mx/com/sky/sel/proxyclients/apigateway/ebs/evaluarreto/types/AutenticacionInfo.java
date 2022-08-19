package mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarreto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class AutenticacionInfo implements Serializable {
    @SuppressWarnings("compatibility:2964737945854013349")
    private static final long serialVersionUID = 1L;
    
    private String modoTransaccion;
    private String referenciaId;

    public AutenticacionInfo() {
        super();
    }

    public void setModoTransaccion(String modoTransaccion) {
        this.modoTransaccion = modoTransaccion;
    }

    @JsonProperty("ModoTransaccion")
    public String getModoTransaccion() {
        return modoTransaccion;
    }

    public void setReferenciaId(String referenciaId) {
        this.referenciaId = referenciaId;
    }

    @JsonProperty("ReferenciaId")
    public String getReferenciaId() {
        return referenciaId;
    }
}
