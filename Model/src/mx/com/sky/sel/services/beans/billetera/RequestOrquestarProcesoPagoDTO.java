package mx.com.sky.sel.services.beans.billetera;

import java.io.Serializable;

public class RequestOrquestarProcesoPagoDTO implements Serializable {
    @SuppressWarnings("compatibility:-1779271684023054989")
    private static final long serialVersionUID = -9004177649484560614L;
    
    //DatosTarjeta_Entrada
    private String tipoTarjeta;//token.tipoTarjeta
    private String numeroTarjeta;//toke.madkedPan
    private String fechaExpTarjeta;//token.fechaExp
    private String cvvTarjeta;//tokendto.getCVV()
    private String nombreTitularTarjeta;//tokendto -nombretarjeta
    private String nombreEmpresaTransaccion;
    //DatosTransaccion_Entrada
    private String tipoOperacion;
    private String idTransaccion;//parametrosReto.idTransaccion
    private String numeroCuentaClienteSky;
    private String loginUsr;
    private String horaActual;
    private String fechaActual;
    private String propositoPago;
    private String importePago;
    private String importePagoMonedaLocal;
    private String tipoCambio;
    
    
    
    private String pais;//token.codPais
    private String codeStore;
    private String authidresponse;//NULL
    private String clerkId;//NULL
    private String origFecha;//NULL
    private String origHora;//NULL
    private String origStan;//NULL
    private String origMsg;//NULL
    private String sistemaOrigenPago;
    private String codigoMoneda;
    
    
    private String entidadBancaria;
    private String tipoPago;
    private String tokenVoltage;
    private String comentarios;
    private String MerchantId;//parametros.merchantID
    private String CodigoSKY;//parametros.codigosky
    private String Captura;
    private String Token;
    private String IdSesion;
    private String EcommerceIndicator;
    
    
    private String AuthenticationTransactioId;
    private String Cavv;
    private String Eci;
    private String eciRaw;
    private String xid;
    private String transactionID;
    
    private String identificadorDeCobroUCAF;
    private String datosDeAutenticacionUCAF;
    private String identificadorTransaccionServidor;
    private String version3DS;
    private String credencialAlmacenadaEnArchivo;
    private String credencialAlmacenadaEnUso;
    private String identificadorTransaccionRed;
    private String datosEmisor;
    public RequestOrquestarProcesoPagoDTO() {
        super();
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setFechaExpTarjeta(String fechaExpTarjeta) {
        this.fechaExpTarjeta = fechaExpTarjeta;
    }

    public String getFechaExpTarjeta() {
        return fechaExpTarjeta;
    }

    public void setCvvTarjeta(String cvvTarjeta) {
        this.cvvTarjeta = cvvTarjeta;
    }

    public String getCvvTarjeta() {
        return cvvTarjeta;
    }

    public void setNombreTitularTarjeta(String nombreTitularTarjeta) {
        this.nombreTitularTarjeta = nombreTitularTarjeta;
    }

    public String getNombreTitularTarjeta() {
        return nombreTitularTarjeta;
    }

    public void setNombreEmpresaTransaccion(String nombreEmpresaTransaccion) {
        this.nombreEmpresaTransaccion = nombreEmpresaTransaccion;
    }

    public String getNombreEmpresaTransaccion() {
        return nombreEmpresaTransaccion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getIdTransaccion() {
        return idTransaccion;
    }

    public void setNumeroCuentaClienteSky(String numeroCuentaClienteSky) {
        this.numeroCuentaClienteSky = numeroCuentaClienteSky;
    }

    public String getNumeroCuentaClienteSky() {
        return numeroCuentaClienteSky;
    }

    public void setLoginUsr(String loginUsr) {
        this.loginUsr = loginUsr;
    }

    public String getLoginUsr() {
        return loginUsr;
    }

    public void setHoraActual(String horaActual) {
        this.horaActual = horaActual;
    }

    public String getHoraActual() {
        return horaActual;
    }

    public void setFechaActual(String fechaActual) {
        this.fechaActual = fechaActual;
    }

    public String getFechaActual() {
        return fechaActual;
    }

    public void setPropositoPago(String propositoPago) {
        this.propositoPago = propositoPago;
    }

    public String getPropositoPago() {
        return propositoPago;
    }

    public void setImportePago(String importePago) {
        this.importePago = importePago;
    }

    public String getImportePago() {
        return importePago;
    }

    public void setImportePagoMonedaLocal(String importePagoMonedaLocal) {
        this.importePagoMonedaLocal = importePagoMonedaLocal;
    }

    public String getImportePagoMonedaLocal() {
        return importePagoMonedaLocal;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setCodeStore(String codeStore) {
        this.codeStore = codeStore;
    }

    public String getCodeStore() {
        return codeStore;
    }

    public void setAuthidresponse(String authidresponse) {
        this.authidresponse = authidresponse;
    }

    public String getAuthidresponse() {
        return authidresponse;
    }

    public void setClerkId(String clerkId) {
        this.clerkId = clerkId;
    }

    public String getClerkId() {
        return clerkId;
    }

    public void setOrigFecha(String origFecha) {
        this.origFecha = origFecha;
    }

    public String getOrigFecha() {
        return origFecha;
    }

    public void setOrigHora(String origHora) {
        this.origHora = origHora;
    }

    public String getOrigHora() {
        return origHora;
    }

    public void setOrigStan(String origStan) {
        this.origStan = origStan;
    }

    public String getOrigStan() {
        return origStan;
    }

    public void setOrigMsg(String origMsg) {
        this.origMsg = origMsg;
    }

    public String getOrigMsg() {
        return origMsg;
    }

    public void setSistemaOrigenPago(String sistemaOrigenPago) {
        this.sistemaOrigenPago = sistemaOrigenPago;
    }

    public String getSistemaOrigenPago() {
        return sistemaOrigenPago;
    }

    public void setCodigoMoneda(String codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }

    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    public void setEntidadBancaria(String entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    public String getEntidadBancaria() {
        return entidadBancaria;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTokenVoltage(String tokenVoltage) {
        this.tokenVoltage = tokenVoltage;
    }

    public String getTokenVoltage() {
        return tokenVoltage;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    public String getMerchantId() {
        return MerchantId;
    }

    public void setCodigoSKY(String CodigoSKY) {
        this.CodigoSKY = CodigoSKY;
    }

    public String getCodigoSKY() {
        return CodigoSKY;
    }

    public void setCaptura(String Captura) {
        this.Captura = Captura;
    }

    public String getCaptura() {
        return Captura;
    }

    public void setToken(String Token) {
        this.Token = Token;
    }

    public String getToken() {
        return Token;
    }

    public void setIdSesion(String IdSesion) {
        this.IdSesion = IdSesion;
    }

    public String getIdSesion() {
        return IdSesion;
    }

    public void setEcommerceIndicator(String EcommerceIndicator) {
        this.EcommerceIndicator = EcommerceIndicator;
    }

    public String getEcommerceIndicator() {
        return EcommerceIndicator;
    }

    public void setAuthenticationTransactioId(String AuthenticationTransactioId) {
        this.AuthenticationTransactioId = AuthenticationTransactioId;
    }

    public String getAuthenticationTransactioId() {
        return AuthenticationTransactioId;
    }

    public void setCavv(String Cavv) {
        this.Cavv = Cavv;
    }

    public String getCavv() {
        return Cavv;
    }

    public void setEci(String Eci) {
        this.Eci = Eci;
    }

    public String getEci() {
        return Eci;
    }

    public void setXid(String xid) {
        this.xid = xid;
    }

    public String getXid() {
        return xid;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setIdentificadorDeCobroUCAF(String identificadorDeCobroUCAF) {
        this.identificadorDeCobroUCAF = identificadorDeCobroUCAF;
    }

    public String getIdentificadorDeCobroUCAF() {
        return identificadorDeCobroUCAF;
    }

    public void setDatosDeAutenticacionUCAF(String datosDeAutenticacionUCAF) {
        this.datosDeAutenticacionUCAF = datosDeAutenticacionUCAF;
    }

    public String getDatosDeAutenticacionUCAF() {
        return datosDeAutenticacionUCAF;
    }

    public void setIdentificadorTransaccionServidor(String identificadorTransaccionServidor) {
        this.identificadorTransaccionServidor = identificadorTransaccionServidor;
    }

    public String getIdentificadorTransaccionServidor() {
        return identificadorTransaccionServidor;
    }

    public void setVersion3DS(String version3DS) {
        this.version3DS = version3DS;
    }

    public String getVersion3DS() {
        return version3DS;
    }

    public void setEciRaw(String eciRaw) {
        this.eciRaw = eciRaw;
    }

    public String getEciRaw() {
        return eciRaw;
    }

    public void setCredencialAlmacenadaEnArchivo(String credencialAlmacenadaEnArchivo) {
        this.credencialAlmacenadaEnArchivo = credencialAlmacenadaEnArchivo;
    }

    public String getCredencialAlmacenadaEnArchivo() {
        return credencialAlmacenadaEnArchivo;
    }

    public void setCredencialAlmacenadaEnUso(String credencialAlmacenadaEnUso) {
        this.credencialAlmacenadaEnUso = credencialAlmacenadaEnUso;
    }

    public String getCredencialAlmacenadaEnUso() {
        return credencialAlmacenadaEnUso;
    }

    public void setIdentificadorTransaccionRed(String identificadorTransaccionRed) {
        this.identificadorTransaccionRed = identificadorTransaccionRed;
    }

    public String getIdentificadorTransaccionRed() {
        return identificadorTransaccionRed;
    }

    public void setDatosEmisor(String datosEmisor) {
        this.datosEmisor = datosEmisor;
    }

    public String getDatosEmisor() {
        return datosEmisor;
    }
}
