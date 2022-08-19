package mx.com.sky.sel.services.beans.notificacionesemail;

import java.io.Serializable;

public class ParametroEmail implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String valor;

    public ParametroEmail() {
        super();
    }

    public ParametroEmail(String nombre, String valor) {
        super();
        this.nombre = nombre;
        this.valor = valor;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
