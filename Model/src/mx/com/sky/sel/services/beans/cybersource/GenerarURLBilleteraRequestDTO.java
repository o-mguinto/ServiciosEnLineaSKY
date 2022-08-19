package mx.com.sky.sel.services.beans.cybersource;

import java.io.Serializable;

public class GenerarURLBilleteraRequestDTO implements Serializable {
    @SuppressWarnings("compatibility:2404119989375100750")
    private static final long serialVersionUID = -2731369498909251181L;

    private String email;
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private String calle;
    private String numExt;
    private String numInt;
    private String colonia;
    private String paisIso;
    private String telefono;
    private String ciudad;
    private String estado;
    private String municipio;
    private String codigoPostal;
    private String vigencia;
    private String moneda;
    private String cuenta;
    
    
    public GenerarURLBilleteraRequestDTO() {
        super();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setAPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getAPaterno() {
        return aPaterno;
    }

    public void setAMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public String getAMaterno() {
        return aMaterno;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCalle() {
        return calle;
    }

    public void setNumExt(String numExt) {
        this.numExt = numExt;
    }

    public String getNumExt() {
        return numExt;
    }

    public void setNumInt(String numInt) {
        this.numInt = numInt;
    }

    public String getNumInt() {
        return numInt;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getColonia() {
        return colonia;
    }

    public void setPaisIso(String paisIso) {
        this.paisIso = paisIso;
    }

    public String getPaisIso() {
        return paisIso;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getCuenta() {
        return cuenta;
    }
    
}
