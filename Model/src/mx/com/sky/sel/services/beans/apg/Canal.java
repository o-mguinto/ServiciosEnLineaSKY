package mx.com.sky.sel.services.beans.apg;

import java.io.Serializable;

public class Canal implements Serializable {
    @SuppressWarnings("compatibility:756978702101270555")
    private static final long serialVersionUID = -3117865548974983167L;

    private String identificador;
    private String idMostrado   ;
    private String canalNombre  ;
    private String nombre       ;
    private String descripcion  ;

    public Canal(String identificador, String idMostrado, String canalNombre,
                 String nombre, String descripcion) {
        super();
        this.identificador = identificador;
        this.idMostrado = idMostrado;
        this.canalNombre = canalNombre;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public boolean isCanalGrabable(){
        int canal = Integer.parseInt(this.idMostrado);
        return !((canal >799&& canal < 1000 ) || (canal > 1799 && canal < 2000));
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdMostrado(String idMostrado) {
        this.idMostrado = idMostrado;
    }

    public String getIdMostrado() {
        return idMostrado;
    }

    public void setCanalNombre(String canalNombre) {
        this.canalNombre = canalNombre;
    }

    public String getCanalNombre() {
        return canalNombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
