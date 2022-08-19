package mx.com.sky.sel.proxyclients.apigateway.ebs.validarreto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import mx.com.sky.sel.proxyclients.apigateway.headers.request.EBMHeaderRequest;

public class RequestValidarReto3DS implements Serializable {
    @SuppressWarnings("compatibility:-6315057565801214848")
    private static final long serialVersionUID = 1L;


    private EBMHeaderRequest header;
    private ComercioInfo comercio;
    private OrdenInfo ordenInfo;
    private InstrumentoPago instrumentoDePago;
    //private TarjetaPagoInfo tarjetaPago;
    private CompradorInfo compador;
    private AutenticacionInfo autenticacion;
    public RequestValidarReto3DS() {
        super();
    }

    public void setHeader(EBMHeaderRequest header) {
        this.header = header;
    }
    @JsonProperty("EBMHeaderRequest")
    public EBMHeaderRequest getHeader() {
        return header;
    }

    public void setComercio(ComercioInfo comercio) {
        this.comercio = comercio;
    }
    @JsonProperty("ComercioInfo")
    public ComercioInfo getComercio() {
        return comercio;
    }

    public void setCompador(CompradorInfo compador) {
        this.compador = compador;
    }
    @JsonProperty("CompradorInfo")
    public CompradorInfo getCompador() {
        return compador;
    }

    public void setAutenticacion(AutenticacionInfo autenticacion) {
        this.autenticacion = autenticacion;
    }
    @JsonProperty("AutenticacionInfo")
    public AutenticacionInfo getAutenticacion() {
        return autenticacion;
    }

    public void setOrdenInfo(OrdenInfo ordenInfo) {
        this.ordenInfo = ordenInfo;
    }
    @JsonProperty("OrdenInfo")
    public OrdenInfo getOrdenInfo() {
        return ordenInfo;
    }

    public void setInstrumentoDePago(InstrumentoPago instrumentoDePago) {
        this.instrumentoDePago = instrumentoDePago;
    }
    @JsonProperty("InstrumentoDePagoInfo")
    public InstrumentoPago getInstrumentoDePago() {
        return instrumentoDePago;
    }
}
