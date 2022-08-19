package mx.com.sky.sel.proxyclients.apigateway.ebs.generarjwtoken.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import mx.com.sky.sel.proxyclients.apigateway.headers.request.EBMHeaderRequest;


public class RequestGenerarJWToken implements Serializable {
    @SuppressWarnings("compatibility:5041409899740441201")
    private static final long serialVersionUID = 1L;


    private EBMHeaderRequest header;
    private ComercioInfoGenJWToken comercioInfo;
    //private TarjetaPagoInfo tarjetaPagoInfo;
    private InstrumentoDePago instrumentoDePago;
    public RequestGenerarJWToken() {
        super();
    }

    public void setHeader(EBMHeaderRequest header) {
        this.header = header;
    }
    @JsonProperty("EBMHeaderRequest")
    public EBMHeaderRequest getHeader() {
        return header;
    }

    public void setComercioInfo(ComercioInfoGenJWToken comercioInfo) {
        this.comercioInfo = comercioInfo;
    }
    @JsonProperty("ComercioInfo")
    public ComercioInfoGenJWToken getComercioInfo() {
        return comercioInfo;
    }

    /*public void setTarjetaPagoInfo(TarjetaPagoInfo tarjetaPagoInfo) {
        this.tarjetaPagoInfo = tarjetaPagoInfo;
    }
    @JsonProperty("TarjetaPagoInfo")
    public TarjetaPagoInfo getTarjetaPagoInfo() {
        return tarjetaPagoInfo;
    }*/
    public void setInstrumentoDePago(InstrumentoDePago instrumentoDePago) {
        this.instrumentoDePago = instrumentoDePago;
    }
    @JsonProperty("InstrumentoDePagoInfo")
    public InstrumentoDePago getInstrumentoDePago() {
        return instrumentoDePago;
    }
}
