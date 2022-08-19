package mx.com.sky.sel.services.cambiopaquetecelular;

import java.io.Serializable;

public class PaqueteCelularModelDTO implements Serializable {
    @SuppressWarnings("compatibility:5813723918991476438")
    private static final long serialVersionUID = 4163942624930679746L;

    private String nombreProductoCRM;
    private String nombreProductoSEL;
    private String partNum;
    private String descripcion;
    private String minutos;
    private String sms;
    private String datos;
    private String vigencia;
    private String precio;
    private String costo;
    
    public PaqueteCelularModelDTO() {
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

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getCosto() {
        return costo;
    }
}
