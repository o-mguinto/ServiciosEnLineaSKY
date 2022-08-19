package mx.com.sky.sel.services.beans.billetera;

import java.io.Serializable;

public class ActualizarTDCBilleteraResponseDTO implements Serializable {
    @SuppressWarnings("compatibility:1638239988256529861")
    private static final long serialVersionUID = 1L;

    private String codigoError;
    private String descripcionError;
    
    public ActualizarTDCBilleteraResponseDTO() {
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
