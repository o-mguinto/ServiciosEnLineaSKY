package mx.com.sky.sel.proxyclients.apigateway.ebf.consultarbilletera.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import mx.com.sky.sel.proxyclients.apigateway.headers.request.EBMHeaderRequest;

public class RequestConsultarBilletera implements Serializable {
    @SuppressWarnings("compatibility:-1288746845577371081")
    private static final long serialVersionUID = 7339431708920857777L;
    
    private EBMHeaderRequest header;
    private String numeroCuenta;
    
    public RequestConsultarBilletera() {
        super();
    }

    public void setHeader(EBMHeaderRequest header) {
        this.header = header;
    }
    
    @JsonProperty("EBMHeaderRequest")
    public EBMHeaderRequest getHeader() {
        return header;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    @JsonProperty("NumeroCuenta")
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
}
