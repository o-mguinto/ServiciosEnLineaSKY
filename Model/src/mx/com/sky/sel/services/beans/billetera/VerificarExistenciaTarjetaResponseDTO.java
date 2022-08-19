package mx.com.sky.sel.services.beans.billetera;

import java.io.Serializable;

public class VerificarExistenciaTarjetaResponseDTO implements Serializable {
    @SuppressWarnings("compatibility:-2002307364479941120")
    private static final long serialVersionUID = 1L;

    private boolean existe;
    private String codigoError;
    private String descripcionError;
    
    public VerificarExistenciaTarjetaResponseDTO() {
        super();
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }

    public boolean isExiste() {
        return existe;
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
