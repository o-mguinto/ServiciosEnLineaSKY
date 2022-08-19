package mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarreto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class DireccionFacturacion implements Serializable {
    @SuppressWarnings("compatibility:-3210563289655340814")
    private static final long serialVersionUID = 1L;


    private String nombre;
    private String apellidoMaterno;
    private ApellidoPaterno apellidoPaterno;
    private Cia cia;
    private String direccion1;
    private String direccion2;
    private String localidad;
    private String areaAdministrativa;
    private String codigoPostal;
    private String pais;
    private String telefono;
    private String email;


    public DireccionFacturacion() {
        super();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @JsonProperty("Nombre")
    public String getNombre() {
        return nombre;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    @JsonProperty("ApellidoMaterno")
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoPaterno(ApellidoPaterno apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    @JsonProperty("ApellidoPaterno")
    public ApellidoPaterno getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setCia(Cia cia) {
        this.cia = cia;
    }

    @JsonProperty("Cia")
    public Cia getCia() {
        return cia;
    }

    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    @JsonProperty("Direccion1")
    public String getDireccion1() {
        return direccion1;
    }

    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    @JsonProperty("Direccion2")
    public String getDireccion2() {
        return direccion2;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @JsonProperty("Localidad")
    public String getLocalidad() {
        return localidad;
    }

    public void setAreaAdministrativa(String areaAdministrativa) {
        this.areaAdministrativa = areaAdministrativa;
    }

    @JsonProperty("AreaAdministrativa")
    public String getAreaAdministrativa() {
        return areaAdministrativa;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @JsonProperty("CodigoPostal")
    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @JsonProperty("Pais")
    public String getPais() {
        return pais;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @JsonProperty("Telefono")
    public String getTelefono() {
        return telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("Email")
    public String getEmail() {
        return email;
    }
}
