package mx.com.sky.sel.proxyclients.apigateway.ebf.orquestarprocesopago.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class DatosTransaccion_Entrada implements Serializable {
    @SuppressWarnings("compatibility:-673315169389597819")
    private static final long serialVersionUID = 5258207594829250514L;
    
    private String tipoOperacion;
    private String idTransaccion;
    private String numeroCuentaClienteSky;
    private String loginUsr;
    private String horaActual;
    private String fechaActual;
    private String propositoPago;
    private String importePago;
    private String importePagoMonedaLocal;
    private String tipoCambio;
    private String pais;
    private String codeStore;
    private String authidresponse;
    private String clerkId;
    private String origFecha;
    private String origHora;
    private String origStan;
    private String origMsg;
    private String sistemaOrigenPago;
    private String codigoMoneda;
    private String entidadBancaria;
    private String tipoPago;
    private String tokenVoltage;
    private String comentarios;
    private String MerchantId;
    private String CodigoSKY;
    private String Captura;
    private String Token;
    private String IdSesion;
    private String EcommerceIndicator;
    private String AuthenticationTransactioId;
    private String Cavv;
    private String Eci;

    private String xid;
    private String transactionID;
    private String eciRaw;
    private String identificadorDeCobroUCAF;
    private String datosDeAutenticacionUCAF;
    private String identificadorTransaccionServidor;
    private String version3DS;
    private String credencialAlmacenadaEnArchivo;
    private String credencialAlmacenadaEnUso;
    private String identificadorTransaccionRed;
    private String datosEmisor;

    public DatosTransaccion_Entrada() {
        super();
    }


    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    @JsonProperty("tipoOperacion")
    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    @JsonProperty("idTransaccion")
    public String getIdTransaccion() {
        return idTransaccion;
    }

    public void setNumeroCuentaClienteSky(String numeroCuentaClienteSky) {
        this.numeroCuentaClienteSky = numeroCuentaClienteSky;
    }

    @JsonProperty("numeroCuentaClienteSky")
    public String getNumeroCuentaClienteSky() {
        return numeroCuentaClienteSky;
    }

    public void setLoginUsr(String loginUsr) {
        this.loginUsr = loginUsr;
    }

    @JsonProperty("loginUsr")
    public String getLoginUsr() {
        return loginUsr;
    }

    public void setHoraActual(String horaActual) {
        this.horaActual = horaActual;
    }

    @JsonProperty("horaActual")
    public String getHoraActual() {
        return horaActual;
    }

    public void setFechaActual(String fechaActual) {
        this.fechaActual = fechaActual;
    }

    @JsonProperty("fechaActual")
    public String getFechaActual() {
        return fechaActual;
    }

    public void setPropositoPago(String propositoPago) {
        this.propositoPago = propositoPago;
    }

    @JsonProperty("propositoPago")
    public String getPropositoPago() {
        return propositoPago;
    }

    public void setImportePago(String importePago) {
        this.importePago = importePago;
    }

    @JsonProperty("importePago")
    public String getImportePago() {
        return importePago;
    }

    public void setImportePagoMonedaLocal(String importePagoMonedaLocal) {
        this.importePagoMonedaLocal = importePagoMonedaLocal;
    }

    @JsonProperty("importePagoMonedaLocal")
    public String getImportePagoMonedaLocal() {
        return importePagoMonedaLocal;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    @JsonProperty("tipoCambio")
    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @JsonProperty("pais")
    public String getPais() {
        return pais;
    }

    public void setCodeStore(String codeStore) {
        this.codeStore = codeStore;
    }

    @JsonProperty("codeStore")
    public String getCodeStore() {
        return codeStore;
    }

    public void setAuthidresponse(String authidresponse) {
        this.authidresponse = authidresponse;
    }

    @JsonProperty("authidresponse")
    public String getAuthidresponse() {
        return authidresponse;
    }

    public void setClerkId(String clerkId) {
        this.clerkId = clerkId;
    }

    @JsonProperty("clerkId")
    public String getClerkId() {
        return clerkId;
    }

    public void setOrigFecha(String origFecha) {
        this.origFecha = origFecha;
    }

    @JsonProperty("origFecha")
    public String getOrigFecha() {
        return origFecha;
    }

    public void setOrigHora(String origHora) {
        this.origHora = origHora;
    }

    @JsonProperty("origHora")
    public String getOrigHora() {
        return origHora;
    }

    public void setOrigStan(String origStan) {
        this.origStan = origStan;
    }

    @JsonProperty("origStan")
    public String getOrigStan() {
        return origStan;
    }

    public void setOrigMsg(String origMsg) {
        this.origMsg = origMsg;
    }

    @JsonProperty("origMsg")
    public String getOrigMsg() {
        return origMsg;
    }

    public void setSistemaOrigenPago(String sistemaOrigenPago) {
        this.sistemaOrigenPago = sistemaOrigenPago;
    }

    @JsonProperty("sistemaOrigenPago")
    public String getSistemaOrigenPago() {
        return sistemaOrigenPago;
    }

    public void setCodigoMoneda(String codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }

    @JsonProperty("codigoMoneda")
    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    public void setEntidadBancaria(String entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    @JsonProperty("entidadBancaria")
    public String getEntidadBancaria() {
        return entidadBancaria;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    @JsonProperty("tipoPago")
    public String getTipoPago() {
        return tipoPago;
    }

    public void setTokenVoltage(String tokenVoltage) {
        this.tokenVoltage = tokenVoltage;
    }

    @JsonProperty("tokenVoltage")
    public String getTokenVoltage() {
        return tokenVoltage;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @JsonProperty("comentarios")
    public String getComentarios() {
        return comentarios;
    }

    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    @JsonProperty("MerchantId")
    public String getMerchantId() {
        return MerchantId;
    }

    public void setCodigoSKY(String CodigoSKY) {
        this.CodigoSKY = CodigoSKY;
    }

    @JsonProperty("CodigoSKY")
    public String getCodigoSKY() {
        return CodigoSKY;
    }

    public void setCaptura(String Captura) {
        this.Captura = Captura;
    }

    @JsonProperty("Captura")
    public String getCaptura() {
        return Captura;
    }

    public void setToken(String Token) {
        this.Token = Token;
    }

    @JsonProperty("Token")
    public String getToken() {
        return Token;
    }

    public void setIdSesion(String IdSesion) {
        this.IdSesion = IdSesion;
    }

    @JsonProperty("IdSesion")
    public String getIdSesion() {
        return IdSesion;
    }

    public void setEcommerceIndicator(String EcommerceIndicator) {
        this.EcommerceIndicator = EcommerceIndicator;
    }

    @JsonProperty("EcommerceIndicator")
    public String getEcommerceIndicator() {
        return EcommerceIndicator;
    }

    public void setAuthenticationTransactioId(String AuthenticationTransactioId) {
        this.AuthenticationTransactioId = AuthenticationTransactioId;
    }

    @JsonProperty("AuthenticationTransactioId")
    public String getAuthenticationTransactioId() {
        return AuthenticationTransactioId;
    }

    public void setCavv(String Cavv) {
        this.Cavv = Cavv;
    }

    @JsonProperty("Cavv")
    public String getCavv() {
        return Cavv;
    }

    public void setEci(String Eci) {
        this.Eci = Eci;
    }

    @JsonProperty("Eci")
    public String getEci() {
        return Eci;
    }

    public void setXid(String xid) {
        this.xid = xid;
    }

    @JsonProperty("xid")
    public String getXid() {
        return xid;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    @JsonProperty("transactionID")
    public String getTransactionID() {
        return transactionID;
    }

    public void setEciRaw(String eciRaw) {
        this.eciRaw = eciRaw;
    }

    @JsonProperty("EciRaw")
    public String getEciRaw() {
        return eciRaw;
    }

    public void setIdentificadorDeCobroUCAF(String identificadorDeCobroUCAF) {
        this.identificadorDeCobroUCAF = identificadorDeCobroUCAF;
    }

    @JsonProperty("IndicadorDeCobroUcaf")
    public String getIdentificadorDeCobroUCAF() {
        return identificadorDeCobroUCAF;
    }

    public void setDatosDeAutenticacionUCAF(String datosDeAutenticacionUCAF) {
        this.datosDeAutenticacionUCAF = datosDeAutenticacionUCAF;
    }

    @JsonProperty("DatosDeAutenticacionUcaf")
    public String getDatosDeAutenticacionUCAF() {
        return datosDeAutenticacionUCAF;
    }

    public void setIdentificadorTransaccionServidor(String identificadorTransaccionServidor) {
        this.identificadorTransaccionServidor = identificadorTransaccionServidor;
    }

    @JsonProperty("IdentificadorTransaccionServidor")
    public String getIdentificadorTransaccionServidor() {
        return identificadorTransaccionServidor;
    }

    public void setVersion3DS(String version3DS) {
        this.version3DS = version3DS;
    }

    @JsonProperty("Version3DS")
    public String getVersion3DS() {
        return version3DS;
    }

    public void setCredencialAlmacenadaEnArchivo(String credencialAlmacenadaEnArchivo) {
        this.credencialAlmacenadaEnArchivo = credencialAlmacenadaEnArchivo;
    }
    @JsonProperty("CredencialAlmacenadaEnArchivo")
    public String getCredencialAlmacenadaEnArchivo() {
        return credencialAlmacenadaEnArchivo;
    }

    public void setCredencialAlmacenadaEnUso(String credencialAlmacenadaEnUso) {
        this.credencialAlmacenadaEnUso = credencialAlmacenadaEnUso;
    }
    @JsonProperty("CredencialAlmacenadaEnUso")
    public String getCredencialAlmacenadaEnUso() {
        return credencialAlmacenadaEnUso;
    }

    public void setIdentificadorTransaccionRed(String identificadorTransaccionRed) {
        this.identificadorTransaccionRed = identificadorTransaccionRed;
    }
    @JsonProperty("IdentificadorTransaccionRed")
    public String getIdentificadorTransaccionRed() {
        return identificadorTransaccionRed;
    }

    public void setDatosEmisor(String datosEmisor) {
        this.datosEmisor = datosEmisor;
    }
    @JsonProperty("DatosEmisor")
    public String getDatosEmisor() {
        return datosEmisor;
    }
}
