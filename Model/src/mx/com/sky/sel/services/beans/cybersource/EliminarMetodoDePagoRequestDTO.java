package mx.com.sky.sel.services.beans.cybersource;

import java.io.Serializable;


public class EliminarMetodoDePagoRequestDTO implements Serializable {
    @SuppressWarnings("compatibility:2525741557050043281")
    private static final long serialVersionUID = 2603254307566309040L;


    private String paymentInstrument;
    private String comercioId;
    private String identificadorDeInstrumento;
    private String numeroCuenta;
        
    public EliminarMetodoDePagoRequestDTO() {
        super();
    }


    public void setPaymentInstrument(String paymentInstrument) {
        this.paymentInstrument = paymentInstrument;
    }

    public String getPaymentInstrument() {
        return paymentInstrument;
    }

    public void setComercioId(String comercioId) {
        this.comercioId = comercioId;
    }

    public String getComercioId() {
        return comercioId;
    }

    public void setIdentificadorDeInstrumento(String identificadorDeInstrumento) {
        this.identificadorDeInstrumento = identificadorDeInstrumento;
    }

    public String getIdentificadorDeInstrumento() {
        return identificadorDeInstrumento;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
}
