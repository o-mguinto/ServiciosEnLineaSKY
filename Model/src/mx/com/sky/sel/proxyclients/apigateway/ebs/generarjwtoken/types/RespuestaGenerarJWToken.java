package mx.com.sky.sel.proxyclients.apigateway.ebs.generarjwtoken.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class RespuestaGenerarJWToken implements Serializable {
    @SuppressWarnings("compatibility:-447053588635716278")
    private static final long serialVersionUID = 1L;

    private InformacionDeAutenticacionDeInvocacion infoAutenticacionInvoc;
    private ReferenciaInfo referencia;
    private String fechaTransaccionUTC;
    private String estado;
    private String id;
    public RespuestaGenerarJWToken() {
        super();
    }

    public void setInfoAutenticacionInvoc(InformacionDeAutenticacionDeInvocacion infoAutenticacionInvoc) {
        this.infoAutenticacionInvoc = infoAutenticacionInvoc;
    }
    @JsonProperty("InformacionDeAutenticacionDeInvocacion")
    public InformacionDeAutenticacionDeInvocacion getInfoAutenticacionInvoc() {
        return infoAutenticacionInvoc;
    }

    public void setReferencia(ReferenciaInfo referencia) {
        this.referencia = referencia;
    }
    @JsonProperty("ReferenciaInfo")
    public ReferenciaInfo getReferencia() {
        return referencia;
    }

    public void setFechaTransaccionUTC(String fechaTransaccionUTC) {
        this.fechaTransaccionUTC = fechaTransaccionUTC;
    }
    @JsonProperty("FechaTransaccionUTC")
    public String getFechaTransaccionUTC() {
        return fechaTransaccionUTC;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    @JsonProperty("Estado")
    public String getEstado() {
        return estado;
    }

    public void setId(String id) {
        this.id = id;
    }
    @JsonProperty("id")
    public String getId() {
        return id;
    }
}
