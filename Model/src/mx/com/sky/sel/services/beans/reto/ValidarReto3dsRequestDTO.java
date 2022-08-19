package mx.com.sky.sel.services.beans.reto;

import java.io.Serializable;

public class ValidarReto3dsRequestDTO implements Serializable {
    @SuppressWarnings("compatibility:-1554607485267109853")
    private static final long serialVersionUID = 1L;


    private String codigoSKY;
    //CommpradorInfo
    private String telMovilComprador;
    //AutenticacionInfo
    private String transaccionId;
    //ordeninfo
    private String cantidad;
    private String moneda;
    //instrumentodepagoinfo
    private String instrumentoDePagoId;

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setInstrumentoDePagoId(String instrumentoDePagoId) {
        this.instrumentoDePagoId = instrumentoDePagoId;
    }

    public String getInstrumentoDePagoId() {
        return instrumentoDePagoId;
    }
    
    public ValidarReto3dsRequestDTO() {
        super();
    }

    public void setCodigoSKY(String codigoSKY) {
        this.codigoSKY = codigoSKY;
    }

    public String getCodigoSKY() {
        return codigoSKY;
    }

    public void setTransaccionId(String transaccionId) {
        this.transaccionId = transaccionId;
    }

    public String getTransaccionId() {
        return transaccionId;
    }

    public void setTelMovilComprador(String telMovilComprador) {
        this.telMovilComprador = telMovilComprador;
    }

    public String getTelMovilComprador() {
        return telMovilComprador;
    }
}
