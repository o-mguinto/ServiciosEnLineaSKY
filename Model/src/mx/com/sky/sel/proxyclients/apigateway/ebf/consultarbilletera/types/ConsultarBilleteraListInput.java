package mx.com.sky.sel.proxyclients.apigateway.ebf.consultarbilletera.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ConsultarBilleteraListInput implements Serializable {
    @SuppressWarnings("compatibility:513007740681573942")
    private static final long serialVersionUID = 3299504796053262427L;

    private String id;
    private String paymentInstrument;
    private String idProspecto;
    private String numeroCuenta;
    private String numeroContrato;
    private String email;
    private String nombreTarjeta;
    private String fechaExp;
    private String cVV;
    private String tipoTarjeta;
    private String descripcionTipoTarjeta;
    private String instrumentId;
    private String maskedPan;
    private String recurrente;
    private String estatusDm;
    private String fechaDm;
    private String estatus3Ds;
    private String fecha3Ds;
    private String Referencia3Ds;
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
    private String codigoPostal;
    private String codPais;
    private String monto;
    private String tipoBin;
    
    public ConsultarBilleteraListInput() {
        super();
    }

    public void setId(String id) {
        this.id = id;
    }
    
    @JsonProperty("Id")
    public String getId() {
        return id;
    }

    public void setPaymentInstrument(String paymentInstrument) {
        this.paymentInstrument = paymentInstrument;
    }
    
    @JsonProperty("PaymentInstrument")
    public String getPaymentInstrument() {
        return paymentInstrument;
    }

    public void setIdProspecto(String idProspecto) {
        this.idProspecto = idProspecto;
    }
    
    @JsonProperty("IdProspecto")
    public String getIdProspecto() {
        return idProspecto;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    @JsonProperty("NumeroCuenta")
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroContrato(String numeroContrato) {
        this.numeroContrato = numeroContrato;
    }
    
    @JsonProperty("NumeroContrato")
    public String getNumeroContrato() {
        return numeroContrato;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @JsonProperty("Email")
    public String getEmail() {
        return email;
    }

    public void setNombreTarjeta(String nombreTarjeta) {
        this.nombreTarjeta = nombreTarjeta;
    }
    
    @JsonProperty("NombreTarjeta")
    public String getNombreTarjeta() {
        return nombreTarjeta;
    }

    public void setFechaExp(String fechaExp) {
        this.fechaExp = fechaExp;
    }
    
    @JsonProperty("FechaExp")
    public String getFechaExp() {
        return fechaExp;
    }
    
    public void setCVV(String cVV) {
        this.cVV = cVV;
    }
    
    @JsonProperty("CVV")
    public String getCVV() {
        return cVV;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }
    
    @JsonProperty("TipoTarjeta")
    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setDescripcionTipoTarjeta(String descripcionTipoTarjeta) {
        this.descripcionTipoTarjeta = descripcionTipoTarjeta;
    }
    
    @JsonProperty("DescripcionTipoTarjeta")
    public String getDescripcionTipoTarjeta() {
        return descripcionTipoTarjeta;
    }

    public void setInstrumentId(String instrumentId) {
        this.instrumentId = instrumentId;
    }
    
    @JsonProperty("InstrumentId")
    public String getInstrumentId() {
        return instrumentId;
    }

    public void setMaskedPan(String maskedPan) {
        this.maskedPan = maskedPan;
    }
    
    @JsonProperty("MaskedPan")
    public String getMaskedPan() {
        return maskedPan;
    }

    public void setRecurrente(String recurrente) {
        this.recurrente = recurrente;
    }
    
    @JsonProperty("Recurrente")
    public String getRecurrente() {
        return recurrente;
    }

    public void setEstatusDm(String estatusDm) {
        this.estatusDm = estatusDm;
    }
    
    @JsonProperty("EstatusDm")
    public String getEstatusDm() {
        return estatusDm;
    }

    public void setFechaDm(String fechaDm) {
        this.fechaDm = fechaDm;
    }
    
    @JsonProperty("FechaDm")
    public String getFechaDm() {
        return fechaDm;
    }

    public void setEstatus3Ds(String estatus3Ds) {
        this.estatus3Ds = estatus3Ds;
    }
    
    @JsonProperty("Estatus3Ds")
    public String getEstatus3Ds() {
        return estatus3Ds;
    }

    public void setFecha3Ds(String fecha3Ds) {
        this.fecha3Ds = fecha3Ds;
    }
    
    @JsonProperty("Fecha3Ds")
    public String getFecha3Ds() {
        return fecha3Ds;
    }

    public void setReferencia3Ds(String Referencia3Ds) {
        this.Referencia3Ds = Referencia3Ds;
    }
    
    @JsonProperty("Referencia3Ds")
    public String getReferencia3Ds() {
        return Referencia3Ds;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @JsonProperty("Nombre")
    public String getNombre() {
        return nombre;
    }

    public void setAPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }
    
    @JsonProperty("APaterno")
    public String getAPaterno() {
        return aPaterno;
    }

    public void setAMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }
    
    @JsonProperty("AMaterno")
    public String getAMaterno() {
        return aMaterno;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }
    
    @JsonProperty("NumTelefono")
    public String getNumTelefono() {
        return numTelefono;
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

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    @JsonProperty("Ciudad")
    public String getCiudad() {
        return ciudad;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    
    @JsonProperty("Colonia")
    public String getColonia() {
        return colonia;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
    @JsonProperty("CodigoPostal")
    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodPais(String codPais) {
        this.codPais = codPais;
    }
    
    @JsonProperty("CodPais")
    public String getCodPais() {
        return codPais;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }
    
    @JsonProperty("Monto")
    public String getMonto() {
        return monto;
    }
    
    public void setTipoBin(String tipoBin) {
        this.tipoBin = tipoBin;
    }

    @JsonProperty("TipoBin")
    public String getTipoBin() {
        return tipoBin;
    }
    
    
    @Override
    public String toString() {
        return String.format("id: %s paymentInstrument: %s idProspecto: %s numeroCuenta: %s numeroContrato: %s " +
                             "email: %s nombreTarjeta: %s fechaExp: %s cVV: %s tipoTarjeta: %s " +
                             "descripcionTipoTarjeta %s instrumentId: %s maskedPan: %s recurrente: %s estatusDm: %s " +
                             "fechaDm: %s estatus3Ds: %s fecha3Ds: %s Referencia3Ds %s nombre: %s aPaterno: %s " +
                             "aMaterno: %s numTelefono: %s calle: %s numExt: %s numInt: %s estado %s municipio: %s " +
                             "ciudad: %s colonia: %s codigoPostal: %s codPais: %s monto: %s tipoBin: %s",
                             id, paymentInstrument, idProspecto, numeroCuenta, numeroContrato, email, nombreTarjeta,
                             fechaExp, cVV, tipoTarjeta, descripcionTipoTarjeta, instrumentId, maskedPan, recurrente,
                             estatusDm, fechaDm, estatus3Ds, fecha3Ds, Referencia3Ds, nombre, aPaterno, aMaterno, numTelefono,
                             calle, numExt, numInt, estado, municipio, ciudad, colonia, codigoPostal, codPais, monto, tipoBin);
    }

    
}
