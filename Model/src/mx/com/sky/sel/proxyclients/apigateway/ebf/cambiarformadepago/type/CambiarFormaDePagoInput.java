package mx.com.sky.sel.proxyclients.apigateway.ebf.cambiarformadepago.type;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class CambiarFormaDePagoInput implements Serializable {
    @SuppressWarnings("compatibility:4353620260664353923")
    private static final long serialVersionUID = 1327998648658074049L;


    private String paymentInstrument;
    private String numeroCuenta;
    private String pagoRecurrente;
    
    public CambiarFormaDePagoInput() {
        super();
    }

    public void setPaymentInstrument(String paymentInstrument) {
        this.paymentInstrument = paymentInstrument;
    }

    @JsonProperty("PaymentInstrument")
    public String getPaymentInstrument() {
        return paymentInstrument;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @JsonProperty("NumeroCuenta")
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setPagoRecurrente(String pagoRecurrente) {
        this.pagoRecurrente = pagoRecurrente;
    }

    @JsonProperty("PagoRecurrente")
    public String getPagoRecurrente() {
        return pagoRecurrente;
    }
}
