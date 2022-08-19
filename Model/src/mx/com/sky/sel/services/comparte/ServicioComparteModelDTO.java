package mx.com.sky.sel.services.comparte;

import java.io.Serializable;

public class ServicioComparteModelDTO implements Serializable {
    @SuppressWarnings("compatibility:-6614488391527256700")
    private static final long serialVersionUID = 7369100988654041208L;
    
    private String nombreProductoCRM;
    private String nombreProductoSEL;
    private String partNum;
    private String descripcion;
    private String vigencia;
    private String precio;
    
    public ServicioComparteModelDTO() {
        super();
    }

    public void setNombreProductoCRM(String nombreProductoCRM) {
        this.nombreProductoCRM = nombreProductoCRM;
    }

    public String getNombreProductoCRM() {
        return nombreProductoCRM;
    }

    public void setNombreProductoSEL(String nombreProductoSEL) {
        this.nombreProductoSEL = nombreProductoSEL;
    }

    public String getNombreProductoSEL() {
        return nombreProductoSEL;
    }

    public void setPartNum(String partNum) {
        this.partNum = partNum;
    }

    public String getPartNum() {
        return partNum;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getPrecio() {
        return precio;
    }
}
