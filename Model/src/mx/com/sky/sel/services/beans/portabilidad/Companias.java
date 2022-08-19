package mx.com.sky.sel.services.beans.portabilidad;

import java.io.Serializable;

public class Companias implements Serializable{
    @SuppressWarnings("compatibility:9006238205687266145")
    private static final long serialVersionUID = 8229161290725945879L;

    public Companias() {
        super();
    }
    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
