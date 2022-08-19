package mx.com.sky.sel.services.beans.billetera;

import java.io.Serializable;

import mx.com.sky.sel.proxyclients.apigateway.ebf.orquestarprocesopago.types.RespuestaPagoTarjeta;
import mx.com.sky.sel.services.beans.common.HeaderResponse;


public class ResponseOrquestarProcesoPagoDTO implements Serializable {
    @SuppressWarnings("compatibility:3197912712173633349")
    private static final long serialVersionUID = -4709366141201913685L;
    
    private HeaderResponse header;
    private RespuestaPagoTarjeta respuestaPagoTarjeta;
    private String codigoError;
    private String descripcionError;
    public ResponseOrquestarProcesoPagoDTO() {
        super();
    }

    public void setHeader(HeaderResponse header) {
        this.header = header;
    }

    public HeaderResponse getHeader() {
        return header;
    }

    public void setRespuestaPagoTarjeta(RespuestaPagoTarjeta respuestaPagoTarjeta) {
        this.respuestaPagoTarjeta = respuestaPagoTarjeta;
    }

    public RespuestaPagoTarjeta getRespuestaPagoTarjeta() {
        return respuestaPagoTarjeta;
    }

    public void setCodigoError(String codigoError) {
        this.codigoError = codigoError;
    }

    public String getCodigoError() {
        return codigoError;
    }

    public void setDescripcionError(String descripcionError) {
        this.descripcionError = descripcionError;
    }

    public String getDescripcionError() {
        return descripcionError;
    }
}
