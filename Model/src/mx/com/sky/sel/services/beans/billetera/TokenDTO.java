package mx.com.sky.sel.services.beans.billetera;

import java.io.Serializable;

public class TokenDTO implements Serializable {
    @SuppressWarnings("compatibility:5936151706337567798")
    private static final long serialVersionUID = 6814160751969920016L;

    private String id;
    private String paymentInstrument;
    private String idProspecto;
    private String numeroCuenta;
    private String numeroContrato;
    private String email;
    private String nombreTarjeta;
    private String fechaExp;
    private String cvv;
    private String tipoTarjeta;
    private String instrumentId;
    private String maskedPan;
    private String recurrente;
    private String estatusDm;
    private String fechaDm;
    private String estatus3Ds;
    private String fecha3Ds;
    private String referencia3Ds;
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private String numTelefono;
    private String calle;
    private String numExt;
    private String numInt;
    private String estado;
    private String municipio;
    private String ciudad;
    private String colonia;
    private String codigopostal;
    private String codPais;
    private String tipoBin;
    
    public TokenDTO() {
        super();
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setPaymentInstrument(String paymentInstrument) {
        this.paymentInstrument = paymentInstrument;
    }

    public String getPaymentInstrument() {
        return paymentInstrument;
    }

    public void setIdProspecto(String idProspecto) {
        this.idProspecto = idProspecto;
    }

    public String getIdProspecto() {
        return idProspecto;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroContrato(String numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public String getNumeroContrato() {
        return numeroContrato;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setNombreTarjeta(String nombreTarjeta) {
        this.nombreTarjeta = nombreTarjeta;
    }

    public String getNombreTarjeta() {
        return nombreTarjeta;
    }

    public void setFechaExp(String fechaExp) {
        this.fechaExp = fechaExp;
    }

    public String getFechaExp() {
        return fechaExp;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getCvv() {
        return cvv;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setInstrumentId(String instrumentId) {
        this.instrumentId = instrumentId;
    }

    public String getInstrumentId() {
        return instrumentId;
    }

    public void setMaskedPan(String maskedPan) {
        this.maskedPan = maskedPan;
    }

    public String getMaskedPan() {
        return maskedPan;
    }

    public void setRecurrente(String recurrente) {
        this.recurrente = recurrente;
    }

    public String getRecurrente() {
        return recurrente;
    }

    public void setEstatusDm(String estatusDm) {
        this.estatusDm = estatusDm;
    }

    public String getEstatusDm() {
        return estatusDm;
    }

    public void setFechaDm(String fechaDm) {
        this.fechaDm = fechaDm;
    }

    public String getFechaDm() {
        return fechaDm;
    }

    public void setEstatus3Ds(String estatus3Ds) {
        this.estatus3Ds = estatus3Ds;
    }

    public String getEstatus3Ds() {
        return estatus3Ds;
    }

    public void setFecha3Ds(String fecha3Ds) {
        this.fecha3Ds = fecha3Ds;
    }

    public String getFecha3Ds() {
        return fecha3Ds;
    }

    public void setReferencia3Ds(String referencia3Ds) {
        this.referencia3Ds = referencia3Ds;
    }

    public String getReferencia3Ds() {
        return referencia3Ds;
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

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getNumTelefono() {
        return numTelefono;
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

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getColonia() {
        return colonia;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodPais(String codPais) {
        this.codPais = codPais;
    }

    public String getCodPais() {
        return codPais;
    }

    public void setTipoBin(String tipoBin) {
        this.tipoBin = tipoBin;
    }

    public String getTipoBin() {
        return tipoBin;
    }
}
