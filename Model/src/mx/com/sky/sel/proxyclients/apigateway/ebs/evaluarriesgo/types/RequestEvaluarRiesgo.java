package mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarriesgo.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import mx.com.sky.sel.proxyclients.apigateway.headers.request.EBMHeaderRequest;

public class RequestEvaluarRiesgo implements Serializable {
    @SuppressWarnings("compatibility:8210971958778752611")
    private static final long serialVersionUID = 8336187277110158280L;

    private EBMHeaderRequest header;
    private ComercioInfo comercioInfo;
    private OrdenInfo orderInfo;
    private PagoInfo pagoInfo;
    private DatosComerciante datosComerciante;
    private String sesionId;
    
    public RequestEvaluarRiesgo() {
        super();
    }
    
    public void setHeader(EBMHeaderRequest header) {
        this.header = header;
    }
    
    @JsonProperty("EBMHeaderRequest")
    public EBMHeaderRequest getHeader() {
        return header;
    }

    public void setComercioInfo(ComercioInfo comercioInfo) {
        this.comercioInfo = comercioInfo;
    }

    @JsonProperty("ComercioInfo")
    public ComercioInfo getComercioInfo() {
        return comercioInfo;
    }

    public void setSesionId(String sesionId) {
        this.sesionId = sesionId;
    }
    
    @JsonProperty("SesionId")
    public String getSesionId() {
        return sesionId;
    }

    public void setOrderInfo(OrdenInfo orderInfo) {
        this.orderInfo = orderInfo;
    }
    @JsonProperty("OrdenInfo")
    public OrdenInfo getOrderInfo() {
        return orderInfo;
    }

    public void setPagoInfo(PagoInfo pagoInfo) {
        this.pagoInfo = pagoInfo;
    }
    @JsonProperty("PagoInfo")
    public PagoInfo getPagoInfo() {
        return pagoInfo;
    }
    
    public void setDatosComerciante(DatosComerciante datosComerciante) {
        this.datosComerciante = datosComerciante;
    }
    @JsonProperty("DatosComerciante")
    public DatosComerciante getDatosComerciante() {
        return datosComerciante;
    }
}
