package mx.com.sky.sel.proxyclients.apigateway.ebf.orquestarprocesopago.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class RespuestaPagoTarjeta implements Serializable {
    @SuppressWarnings("compatibility:-9028666701641324466")
    private static final long serialVersionUID = 6689900793745816881L;
    
    private String respuestaMotorPago;
    private String mensajeRespuestaMotorPago;
    private String codigoRespuestaMotorPago;
    private String numeroAutorizacionPago;
    private String numeroReferenciaPago;
    private String respuestaBRM;
    private String nombreMotorPagos;
    private String origStan;
    private String origMsg;
    
    public RespuestaPagoTarjeta() {
        super();
    }

    public void setRespuestaMotorPago(String respuestaMotorPago) {
        this.respuestaMotorPago = respuestaMotorPago;
    }
    @JsonProperty("respuestaMotorPago")
    public String getRespuestaMotorPago() {
        return respuestaMotorPago;
    }

    public void setMensajeRespuestaMotorPago(String mensajeRespuestaMotorPago) {
        this.mensajeRespuestaMotorPago = mensajeRespuestaMotorPago;
    }
    @JsonProperty("mensajeRespuestaMotorPago")
    public String getMensajeRespuestaMotorPago() {
        return mensajeRespuestaMotorPago;
    }

    public void setCodigoRespuestaMotorPago(String codigoRespuestaMotorPago) {
        this.codigoRespuestaMotorPago = codigoRespuestaMotorPago;
    }
    @JsonProperty("codigoRespuestaMotorPago")
    public String getCodigoRespuestaMotorPago() {
        return codigoRespuestaMotorPago;
    }

    public void setNumeroAutorizacionPago(String numeroAutorizacionPago) {
        this.numeroAutorizacionPago = numeroAutorizacionPago;
    }
    @JsonProperty("numeroAutorizacionPago")
    public String getNumeroAutorizacionPago() {
        return numeroAutorizacionPago;
    }

    public void setNumeroReferenciaPago(String numeroReferenciaPago) {
        this.numeroReferenciaPago = numeroReferenciaPago;
    }
    @JsonProperty("numeroReferenciaPago")
    public String getNumeroReferenciaPago() {
        return numeroReferenciaPago;
    }

    public void setRespuestaBRM(String respuestaBRM) {
        this.respuestaBRM = respuestaBRM;
    }
    @JsonProperty("respuestaBRM")
    public String getRespuestaBRM() {
        return respuestaBRM;
    }

    public void setNombreMotorPagos(String nombreMotorPagos) {
        this.nombreMotorPagos = nombreMotorPagos;
    }
    @JsonProperty("nombreMotorPagos")
    public String getNombreMotorPagos() {
        return nombreMotorPagos;
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
}
