package mx.com.sky.sel.dto;

import java.io.Serializable;

public class AutenticarUsuarioResponseDTO implements Serializable {
    @SuppressWarnings("compatibility:-372304673146051197")
    private static final long serialVersionUID = 2331944168636951544L;

    private String numeroCuenta;
    private String nombreSuscriptor;
    private String producto;
    private String descripcionError;
    private String nombre;
    private String apellidoPaterno;
    private String apedilloMaterno;
    
    public AutenticarUsuarioResponseDTO() {
        super();
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNombreSuscriptor(String nombreSuscriptor) {
        this.nombreSuscriptor = nombreSuscriptor;
    }

    public String getNombreSuscriptor() {
        return nombreSuscriptor;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getProducto() {
        return producto;
    }

    public void setDescripcionError(String descripcionError) {
        this.descripcionError = descripcionError;
    }

    public String getDescripcionError() {
        return descripcionError;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApedilloMaterno(String apedilloMaterno) {
        this.apedilloMaterno = apedilloMaterno;
    }

    public String getApedilloMaterno() {
        return apedilloMaterno;
    }
    
    
    @Override
    public String toString() {
        return String.format("numeroCuenta: %s nombreSuscriptor: %s producto: %s descripcionError: %s nombre: %s " +
                             "apellidoPaterno: %s apedilloMaterno: %s",
                             numeroCuenta, nombreSuscriptor, producto, descripcionError, nombre, apellidoPaterno,
                             apedilloMaterno);
    }
}
