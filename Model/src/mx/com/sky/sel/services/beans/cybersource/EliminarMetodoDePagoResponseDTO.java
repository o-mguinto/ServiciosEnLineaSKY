package mx.com.sky.sel.services.beans.cybersource;

import java.io.Serializable;

public class EliminarMetodoDePagoResponseDTO implements Serializable {
    @SuppressWarnings("compatibility:7093976903382938216")
    private static final long serialVersionUID = -8908383072496565906L;

    private boolean metodoPagoEliminado;
    private String descripcionError;
    
    public EliminarMetodoDePagoResponseDTO() {
        super();
    }

    public void setMetodoPagoEliminado(boolean metodoPagoEliminado) {
        this.metodoPagoEliminado = metodoPagoEliminado;
    }

    public boolean isMetodoPagoEliminado() {
        return metodoPagoEliminado;
    }

    public void setDescripcionError(String descripcionError) {
        this.descripcionError = descripcionError;
    }

    public String getDescripcionError() {
        return descripcionError;
    }
}
