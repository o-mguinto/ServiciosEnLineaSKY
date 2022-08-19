package mx.com.sky.sel.services.beans.billetera;

import java.io.Serializable;

public class RegistrarTDCBilleteraResponseDTO implements Serializable {
    @SuppressWarnings("compatibility:5982980569296068924")
    private static final long serialVersionUID = 1L;

    private String codigoError;
    private String descripcionError;
    private String id;
    
    public RegistrarTDCBilleteraResponseDTO() {
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

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
