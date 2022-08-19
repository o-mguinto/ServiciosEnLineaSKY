package mx.com.sky.sel.services.beans.informacionfiscal;

import java.io.Serializable;

public class RegimenFiscalBean implements Serializable {
    @SuppressWarnings("compatibility:-8985689051786049318")
    private static final long serialVersionUID = 8253333394955926285L;
    
    private String idRegFiscal;
    private String descripcion;
    
    public RegimenFiscalBean() {
        super();
    }

    public void setIdRegFiscal(String idRegFiscal) {
        this.idRegFiscal = idRegFiscal;
    }

    public String getIdRegFiscal() {
        return idRegFiscal;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
