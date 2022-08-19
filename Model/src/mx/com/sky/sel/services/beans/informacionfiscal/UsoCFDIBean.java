package mx.com.sky.sel.services.beans.informacionfiscal;

import java.io.Serializable;

public class UsoCFDIBean implements Serializable {
    @SuppressWarnings("compatibility:5330041736621248099")
    private static final long serialVersionUID = 8092473681288830446L;
    
    private String idUsoCFDI;
    private String descripcion;
    
    public UsoCFDIBean() {
        super();
    }

    public void setIdUsoCFDI(String idUsoCFDI) {
        this.idUsoCFDI = idUsoCFDI;
    }

    public String getIdUsoCFDI() {
        return idUsoCFDI;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
