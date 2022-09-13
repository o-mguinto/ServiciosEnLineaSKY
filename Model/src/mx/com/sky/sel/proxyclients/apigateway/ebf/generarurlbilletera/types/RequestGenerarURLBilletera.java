package mx.com.sky.sel.proxyclients.apigateway.ebf.generarurlbilletera.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import mx.com.sky.sel.proxyclients.apigateway.headers.request.EBMHeaderRequest;

public class RequestGenerarURLBilletera implements Serializable {
    @SuppressWarnings("compatibility:-3618081688048871203")
    private static final long serialVersionUID = 3829814783655778639L;

    private EBMHeaderRequest header;
    private String email;
    private String estatus;
    private String servicio;
    private String operacion;
    private String origen;
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private String calle;
    private String numExt;
    private String numInt;
    private String colonia;
    private String paisISO;
    private String telefono;
    private String ciudad;
    private String estado;
    private String municipio;
    private String codigoPostal;
    private String vigencia;
    private String moneda;
    private String cuenta;
    private String urlBTGS;
    
    
    public RequestGenerarURLBilletera() {
        super();
    }

    public void setHeader(EBMHeaderRequest header) {
        this.header = header;
    }

    @JsonProperty("EBMHeaderRequest")
    public EBMHeaderRequest getHeader() {
        return header;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @JsonProperty("Email")
    public String getEmail() {
        return email;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    
    @JsonProperty("Estatus")
    public String getEstatus() {
        return estatus;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    @JsonProperty("Servicio")
    public String getServicio() {
        return servicio;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    @JsonProperty("Operacion")
    public String getOperacion() {
        return operacion;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @JsonProperty("Origen")
    public String getOrigen() {
        return origen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @JsonProperty("Nombre")
    public String getNombre() {
        return nombre;
    }

    public void setAPaterno(String paterno) {
        this.aPaterno = paterno;
    }

    @JsonProperty("Paterno")
    public String getAPaterno() {
        return aPaterno;
    }

    public void setAMaterno(String materno) {
        this.aMaterno = materno;
    }

    @JsonProperty("Materno")
    public String getAMaterno() {
        return aMaterno;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    @JsonProperty("Calle")
    public String getCalle() {
        return calle;
    }

    public void setNumExt(String numExt) {
        this.numExt = numExt;
    }

    @JsonProperty("NumExt")
    public String getNumExt() {
        return numExt;
    }

    public void setNumInt(String numInt) {
        this.numInt = numInt;
    }

    @JsonProperty("NumInt")
    public String getNumInt() {
        return numInt;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    @JsonProperty("Colonia")
    public String getColonia() {
        return colonia;
    }

    public void setPaisISO(String paisISO) {
        this.paisISO = paisISO;
    }

    @JsonProperty("PaisISO")
    public String getPaisISO() {
        return paisISO;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @JsonProperty("Telefono")
    public String getTelefono() {
        return telefono;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @JsonProperty("Ciudad")
    public String getCiudad() {
        return ciudad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @JsonProperty("Estado")
    public String getEstado() {
        return estado;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @JsonProperty("Municipio")
    public String getMunicipio() {
        return municipio;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @JsonProperty("CodigoPostal")
    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    @JsonProperty("Vigencia")
    public String getVigencia() {
        return vigencia;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    @JsonProperty("Moneda")
    public String getMoneda() {
        return moneda;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    @JsonProperty("Cuenta")
    public String getCuenta() {
        return cuenta;
    }

    public void setUrlBTGS(String urlBTGS) {
        this.urlBTGS = urlBTGS;
    }

    @JsonProperty("UrlBTGS")
    public String getUrlBTGS() {
        return urlBTGS;
    }
}
