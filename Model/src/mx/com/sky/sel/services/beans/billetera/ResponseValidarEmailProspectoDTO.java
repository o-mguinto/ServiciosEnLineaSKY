package mx.com.sky.sel.services.beans.billetera;

import java.io.Serializable;

public class ResponseValidarEmailProspectoDTO implements Serializable {
    @SuppressWarnings("compatibility:6402805712011493976")
    private static final long serialVersionUID = 1L;

    private String error;
    private String descripcionError;
    private boolean valido;
    
    public ResponseValidarEmailProspectoDTO() {
        super();
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setDescripcionError(String descripcionError) {
        this.descripcionError = descripcionError;
    }

    public String getDescripcionError() {
        return descripcionError;
    }

    public void setValido(boolean valido) {
        this.valido = valido;
    }

    public boolean isValido() {
        return valido;
    }
}
