package mx.com.sky.sel.services.beans.billetera;

import java.io.Serializable;

public class TarjetaBilletera implements Serializable {
    @SuppressWarnings("compatibility:-5133983757841505769")
    private static final long serialVersionUID = 2873799883564591323L;

    /**
     * numeroTarjeta indica el numero de esta tarjeta.
     */
    private String numeroTarjeta;
    /**
     * numeroTarjetaOculta indica el numero de esta tarjeta de forma oculta.
     */
    private String numeroTarjetaOculta;
    /**
     * tipoTarjeta indica si la tarjeta es de credito o debito.
     */
    private String tipoTarjeta;
    /**
     * tipoTarjeta indica si la tarjeta es de credito o debito.
     */
    private String tipoTarjetaParaMostrar;
    /**
     * redFinanciera indica la red financiera de esta tarjeta, puede ser Visa, Mastercard o Amex.
     */
    private String redFinanciera;
    /**
     * codigoRedFinanciera indica el codigo de la red financiera de esta tarjeta, puede ser 001 (Visa), 002 (Mastercard)
     * o 003 (Amex).
     */
    private String codigoRedFinanciera;
    /**
     * recurrente indica si esta tarjeta es utilizada para pagos recurrentes del suscriptor.
     */
    private boolean recurrente;
    /**
     * instrumentId indica el instrumentId de cyber para esta tarjeta.
     */
    private String instrumentId;
    /**
     * paymentInstrument indica el paymentInstrument de cyber para esta tarjeta.
     */
    private String paymentInstrument;
    /**
     * maskedPan indica el numero de tarjeta de forma cifrada.
     */
    private String maskedPan;
    /**
     * id Identificador de la tarjeta.
     */
    private String id;
    /**
     * fechaExp fecha de expiracion de la tarjeta.
     */
    private String fechaExp;
    /**
     * nombreTarjeta nombre del propietario de la tarjeta.
     */
    private String nombreTarjeta;
    
    
    private static final String RED_VISA = "VISA";
    private static final String RED_MASTERCARD = "MASTERCARD";
    private static final String RED_AMEX = "AMEX";
    
    
    public TarjetaBilletera() {
        super();
    }
    
    public boolean isVisa() {
        return (this.redFinanciera != null && this.redFinanciera.contains(RED_VISA));
    }
    
    public boolean isMasterCard() {
        return (this.redFinanciera != null && this.redFinanciera.contains(RED_MASTERCARD));
    }
    
    public boolean isAmex() {
        return (this.redFinanciera != null && this.redFinanciera.contains(RED_AMEX));
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setRedFinanciera(String redFinanciera) {
        this.redFinanciera = redFinanciera;
    }

    public String getRedFinanciera() {
        return redFinanciera;
    }

    public void setRecurrente(boolean recurrente) {
        this.recurrente = recurrente;
    }

    public boolean isRecurrente() {
        return recurrente;
    }

    public void setNumeroTarjetaOculta(String numeroTarjetaOculta) {
        this.numeroTarjetaOculta = numeroTarjetaOculta;
    }

    public String getNumeroTarjetaOculta() {
        return numeroTarjetaOculta;
    }

    public void setTipoTarjetaParaMostrar(String tipoTarjetaParaMostrar) {
        this.tipoTarjetaParaMostrar = tipoTarjetaParaMostrar;
    }

    public String getTipoTarjetaParaMostrar() {
        return tipoTarjetaParaMostrar;
    }

    public void setInstrumentId(String instrumentId) {
        this.instrumentId = instrumentId;
    }

    public String getInstrumentId() {
        return instrumentId;
    }

    public void setPaymentInstrument(String paymentInstrument) {
        this.paymentInstrument = paymentInstrument;
    }

    public String getPaymentInstrument() {
        return paymentInstrument;
    }

    public void setMaskedPan(String maskedPan) {
        this.maskedPan = maskedPan;
    }

    public String getMaskedPan() {
        return maskedPan;
    }

    public void setCodigoRedFinanciera(String codigoRedFinanciera) {
        this.codigoRedFinanciera = codigoRedFinanciera;
    }

    public String getCodigoRedFinanciera() {
        return codigoRedFinanciera;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setFechaExp(String fechaExp) {
        this.fechaExp = fechaExp;
    }

    public String getFechaExp() {
        return fechaExp;
    }

    public void setNombreTarjeta(String nombreTarjeta) {
        this.nombreTarjeta = nombreTarjeta;
    }

    public String getNombreTarjeta() {
        return nombreTarjeta;
    }
}
