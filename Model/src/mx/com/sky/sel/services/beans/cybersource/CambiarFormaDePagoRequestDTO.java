package mx.com.sky.sel.services.beans.cybersource;

import java.io.Serializable;

public class CambiarFormaDePagoRequestDTO implements Serializable {
    @SuppressWarnings("compatibility:4474458642995947187")
    private static final long serialVersionUID = 9129741042611906507L;


    private String paymentInstrument;
    private String numeroCuenta;
    private String pagoRecurrente;
    
    public CambiarFormaDePagoRequestDTO() {
        super();
    }

    public void setPaymentInstrument(String paymentInstrument) {
        this.paymentInstrument = paymentInstrument;
    }

    public String getPaymentInstrument() {
        return paymentInstrument;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }


    public void setPagoRecurrente(String pagoRecurrente) {
        this.pagoRecurrente = pagoRecurrente;
    }

    public String getPagoRecurrente() {
        return pagoRecurrente;
    }

}
