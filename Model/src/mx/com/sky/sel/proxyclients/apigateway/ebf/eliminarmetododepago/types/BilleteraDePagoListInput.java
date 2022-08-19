package mx.com.sky.sel.proxyclients.apigateway.ebf.eliminarmetododepago.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


public class BilleteraDePagoListInput implements Serializable {
    @SuppressWarnings("compatibility:3976817686117357240")
    private static final long serialVersionUID = 8074187714296082573L;


    private String paymentInstrument;
    private String comercioId;
    private String identificadorDeInstrumento;
    private String numeroCuenta;


    public BilleteraDePagoListInput() {
        super();
    
    }


    public void setPaymentInstrument(String paymentInstrument) {
        this.paymentInstrument = paymentInstrument;
    }
    
    @JsonProperty("paymentInstrument")
    public String getPaymentInstrument() {
        return paymentInstrument;
    }

    public void setComercioId(String comercioId) {
        this.comercioId = comercioId;
    }
    @JsonProperty("ComercioId")
    public String getComercioId() {
        return comercioId;
    }

    public void setIdentificadorDeInstrumento(String identificadorDeInstrumento) {
        this.identificadorDeInstrumento = identificadorDeInstrumento;
    }
    @JsonProperty("IdentificadorDeInstrumento")
    public String getIdentificadorDeInstrumento() {
        return identificadorDeInstrumento;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    @JsonProperty("NumeroCuenta")
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

}
