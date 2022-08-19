package mx.com.sky.sel.managedbeans.serviciocompartecelular;

import java.io.Serializable;

public class ServicioComparteDTO implements Serializable {
    @SuppressWarnings("compatibility:-5662296622374165461")
    private static final long serialVersionUID = 8641863963727583466L;
    
    private String nombreProducto;
    private String nombreProductoCRM;
    private String descripcion;
    private String precio;
    private String vigencia;
    
    public ServicioComparteDTO() {
        super();
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProductoCRM(String nombreProductoCRM) {
        this.nombreProductoCRM = nombreProductoCRM;
    }

    public String getNombreProductoCRM() {
        return nombreProductoCRM;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getPrecio() {
        return precio;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public String getVigencia() {
        return vigencia;
    }
}
