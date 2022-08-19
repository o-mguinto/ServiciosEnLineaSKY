package mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarreto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import mx.com.sky.sel.proxyclients.apigateway.headers.request.EBMHeaderRequest;

public class RequestEvaluarReto3DS implements Serializable {
    @SuppressWarnings("compatibility:2957825373236093781")
    private static final long serialVersionUID = 1L;

    private EBMHeaderRequest header;
    private ComercioInfo comercio;
    private OrdenInfo ordenInfo;
    //private TarjetaPagoInfo tarjetaPago;
    private CompradorInfo compador;
    private AutenticacionInfo autenticacion;
    private InstrumentoDePago instrumentoDePago;


    public RequestEvaluarReto3DS() {
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

    public void setOrdenInfo(OrdenInfo ordenInfo) {
        this.ordenInfo = ordenInfo;
    }

    @JsonProperty("OrdenInfo")
    public OrdenInfo getOrdenInfo() {
        return ordenInfo;
    }
    /*
        public void setTarjetaPago(TarjetaPagoInfo tarjetaPago) {
            this.tarjetaPago = tarjetaPago;
        }
        @JsonProperty("TarjetaPagoInfo")
        public TarjetaPagoInfo getTarjetaPago() {
            return tarjetaPago;
        }
    */
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

    public void setInstrumentoDePago(InstrumentoDePago instrumentoDePago) {
        this.instrumentoDePago = instrumentoDePago;
    }

    @JsonProperty("InstrumentoDePagoInfo")
    public InstrumentoDePago getInstrumentoDePago() {
        return instrumentoDePago;
    }
}
