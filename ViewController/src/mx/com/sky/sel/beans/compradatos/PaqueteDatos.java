package mx.com.sky.sel.beans.compradatos;

import java.io.Serializable;

public class PaqueteDatos implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String nombre_display;
    private String costo;
    private String saldoCuenta;
    private String montoDiferencia;
    private String costoPagoOportuno;
    private String imagen;
    private String datos;
    private String mins;
    private String sms;
    
    public PaqueteDatos() {
        nombre="";
        nombre_display ="";
        costo="";
        costoPagoOportuno ="";
        imagen ="";
        saldoCuenta="";
        montoDiferencia ="";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre_display(String nombre_display) {
        this.nombre_display = nombre_display;
    }

    public String getNombre_display() {
        return nombre_display;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getCosto() {
        return costo;
    }

    public void setCostoPagoOportuno(String costoPagoOportuno) {
        this.costoPagoOportuno = costoPagoOportuno;
    }

    public String getCostoPagoOportuno() {
        return costoPagoOportuno;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getImagen() {
        return imagen;
    }

    public void setSaldoCuenta(String saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public String getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setMontoDiferencia(String montoDiferencia) {
        this.montoDiferencia = montoDiferencia;
    }

    public String getMontoDiferencia() {
        return montoDiferencia;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public String getDatos() {
        return datos;
    }

    public void setMins(String mins) {
        this.mins = mins;
    }

    public String getMins() {
        return mins;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public String getSms() {
        return sms;
    }
}
