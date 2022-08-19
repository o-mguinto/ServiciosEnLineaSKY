package mx.com.sky.sel.services.beans.riesgo;

import java.io.Serializable;

public class EvaluarRiesgoResponseDTO implements Serializable {
    @SuppressWarnings("compatibility:1907382081500344389")
    private static final long serialVersionUID = 4147487851532102217L;

    private String codigoError;
    private String descripcionError;
    private String estatusRiesgo;
    private String codigoSKY;
    private String idTransaccion;
    
    public EvaluarRiesgoResponseDTO() {
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

    public void setEstatusRiesgo(String estatusRiesgo) {
        this.estatusRiesgo = estatusRiesgo;
    }

    public String getEstatusRiesgo() {
        return estatusRiesgo;
    }

    public void setCodigoSKY(String codigoSKY) {
        this.codigoSKY = codigoSKY;
    }

    public String getCodigoSKY() {
        return codigoSKY;
    }

    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getIdTransaccion() {
        return idTransaccion;
    }
}
