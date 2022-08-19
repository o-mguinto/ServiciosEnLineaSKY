package mx.com.sky.sel.proxyclients.apigateway.ebs.validarreto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class AutenticacionInfo implements Serializable {
    @SuppressWarnings("compatibility:2345666514510305433")
    private static final long serialVersionUID = 1L;


    private String modoTransaccion;
    private String transaccionId;
    
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

    public void setTransaccionId(String transaccionId) {
        this.transaccionId = transaccionId;
    }
        
    @JsonProperty("TransaccionId")
    public String getTransaccionId() {
        return transaccionId;
    }
}
