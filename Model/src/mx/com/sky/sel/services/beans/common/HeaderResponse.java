package mx.com.sky.sel.services.beans.common;

import java.io.Serializable;

public class HeaderResponse implements Serializable {
    @SuppressWarnings("compatibility:-8423288999983093202")
    private static final long serialVersionUID = 1L;

    private String codigoError;
    private String descripcionError;
    
    public HeaderResponse() {
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
