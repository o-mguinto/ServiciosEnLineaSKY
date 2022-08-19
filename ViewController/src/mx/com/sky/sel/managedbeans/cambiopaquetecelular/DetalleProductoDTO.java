package mx.com.sky.sel.managedbeans.cambiopaquetecelular;

import java.io.Serializable;

public class DetalleProductoDTO implements Serializable {
    @SuppressWarnings("compatibility:9084858145216124991")
    private static final long serialVersionUID = -7186132730877604076L;
    
    private String nombre;
    private String descripcion;
    private String precio;
    private String minutos;
    private String sms;
    private String datos;
    private String funcionalidad;
    private String cobertura;
    private String vigencia;
    
    public DetalleProductoDTO() {
        super();
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

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getPrecio() {
        return precio;
    }

    public void setMinutos(String minutos) {
        this.minutos = minutos;
    }

    public String getMinutos() {
        return minutos;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public String getSms() {
        return sms;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public String getDatos() {
        return datos;
    }

    public void setFuncionalidad(String funcionalidad) {
        this.funcionalidad = funcionalidad;
    }

    public String getFuncionalidad() {
        return funcionalidad;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public String getVigencia() {
        return vigencia;
    }
}
