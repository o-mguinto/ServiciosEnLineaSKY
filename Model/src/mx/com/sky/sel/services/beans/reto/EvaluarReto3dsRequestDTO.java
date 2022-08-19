package mx.com.sky.sel.services.beans.reto;

import java.io.Serializable;

public class EvaluarReto3dsRequestDTO implements Serializable {
    @SuppressWarnings("compatibility:2091025406154535796")
    private static final long serialVersionUID = 1L;


    private String codigoSKY;
    //TarjetaPagoInfo
    //private String tipoTarjeta;//001
    //private String mesExpTarjeta;//12
    //private String anioExpTarjeta;//2025
    //private String numeroTarjeta;//4456530000001005
    //instrumentodepagoinfo
    private String instrumentoDePagoId;
    //CompradorInfo
    private String telMovilComprador;
    //AutenticacionInfo
    //"ModoTransaccion": "MOTO",
     private String referenciaId;// "950503b9-3bc9-4519-b4bb-29509bad045c"
     //OrdenInfo
     //DireccionFacturacion
    /*private String nombre;
    private String apellidoMaterno;
    private String apellidoPaterno;
    private String cia;
    private String dir1;
    private String dir2;
    private String localidad;
    private String areaAdministrativa;
    private String codPostal;
    private String pais;
    private String telefono;
    private String email;*/
    //DetallesCantidad
    public void setCodigoSKY(String codigoSKY) {
        this.codigoSKY = codigoSKY;
    }

    public String getCodigoSKY() {
        return codigoSKY;
    }

    /*public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setMesExpTarjeta(String mesExpTarjeta) {
        this.mesExpTarjeta = mesExpTarjeta;
    }

    public String getMesExpTarjeta() {
        return mesExpTarjeta;
    }

    public void setAnioExpTarjeta(String anioExpTarjeta) {
        this.anioExpTarjeta = anioExpTarjeta;
    }

    public String getAnioExpTarjeta() {
        return anioExpTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }*/

    public void setTelMovilComprador(String telMovilComprador) {
        this.telMovilComprador = telMovilComprador;
    }

    public String getTelMovilComprador() {
        return telMovilComprador;
    }

    public void setReferenciaId(String referenciaId) {
        this.referenciaId = referenciaId;
    }

    public String getReferenciaId() {
        return referenciaId;
    }

    /*public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setCia(String cia) {
        this.cia = cia;
    }

    public String getCia() {
        return cia;
    }

    public void setDir1(String dir1) {
        this.dir1 = dir1;
    }

    public String getDir1() {
        return dir1;
    }

    public void setDir2(String dir2) {
        this.dir2 = dir2;
    }

    public String getDir2() {
        return dir2;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setAreaAdministrativa(String areaAdministrativa) {
        this.areaAdministrativa = areaAdministrativa;
    }

    public String getAreaAdministrativa() {
        return areaAdministrativa;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }*/

    public void setCantidadTotal(String cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public String getCantidadTotal() {
        return cantidadTotal;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getMoneda() {
        return moneda;
    }
    private String cantidadTotal;
    private String moneda;
    
    public EvaluarReto3dsRequestDTO() {
        super();
    }

    public void setInstrumentoDePagoId(String instrumentoDePagoId) {
        this.instrumentoDePagoId = instrumentoDePagoId;
    }

    public String getInstrumentoDePagoId() {
        return instrumentoDePagoId;
    }
}
