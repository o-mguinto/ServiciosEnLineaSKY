package mx.com.sky.sel.services.beans.reto;

import java.io.Serializable;

public class ProcesarTransaccionDMRequestDTO implements Serializable {
    @SuppressWarnings("compatibility:6151936773704326837")
    private static final long serialVersionUID = 1L;


    private String comercioId;
    private String codigoReferencia;
    private String codigoAccion;
    private String transaccionDecisionId;
    private String comentarios;
    
    public ProcesarTransaccionDMRequestDTO() {
        super();
    }

    public void setComercioId(String comercioId) {
        this.comercioId = comercioId;
    }

    public String getComercioId() {
        return comercioId;
    }

    public void setCodigoReferencia(String codigoReferencia) {
        this.codigoReferencia = codigoReferencia;
    }

    public String getCodigoReferencia() {
        return codigoReferencia;
    }

    public void setCodigoAccion(String codigoAccion) {
        this.codigoAccion = codigoAccion;
    }

    public String getCodigoAccion() {
        return codigoAccion;
    }

    public void setTransaccionDecisionId(String transaccionDecisionId) {
        this.transaccionDecisionId = transaccionDecisionId;
    }

    public String getTransaccionDecisionId() {
        return transaccionDecisionId;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getComentarios() {
        return comentarios;
    }
}
