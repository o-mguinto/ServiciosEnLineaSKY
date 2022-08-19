package mx.com.sky.sel.managedbeans.cambiopaquetecelular;

import java.io.Serializable;

import mx.com.sky.sel.managedbeans.sesion.SesionMB;
import mx.com.sky.sel.utils.JSFUtils;

public class PaqueteCelularDTO implements Serializable {
    @SuppressWarnings("compatibility:2487949200400909559")
    private static final long serialVersionUID = -4049928193791737529L;

    private String nombreProducto;
    private String nombreProductoCRM;
    private String descripcion;
    private String precio;
    private String minutos;
    private String sms;
    private String datos;
    private String vigencia;
    
    public PaqueteCelularDTO() {
        super();
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    
    public String getNombreProducto() {
        return nombreProducto;
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

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setNombreProductoCRM(String nombreProductoCRM) {
        this.nombreProductoCRM = nombreProductoCRM;
    }

    public String getNombreProductoCRM() {
        return nombreProductoCRM;
    }
}
