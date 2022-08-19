package mx.com.sky.sel.services.beans.billetera;

import java.io.Serializable;

public class ActualizarEstatusBilleteraResponseDTO implements Serializable {
    @SuppressWarnings("compatibility:4751834843170429789")
    private static final long serialVersionUID = 1L;

    private String codigoError;
    private String descripcionError;
    public ActualizarEstatusBilleteraResponseDTO() {
        super();
    }

    public void setCodigoError(String codigoError) {
        this.codigoError = codigoError;
    }

    public String getCodigoError() {
        return codigoError;
    }

    public void setDescripcionError(String descripcionError) {
        this.descripcionError = descripcionError;
    }

    public String getDescripcionError() {
        return descripcionError;
    }
}
