package mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarriesgo.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import mx.com.sky.sel.proxyclients.apigateway.headers.response.EBMHeaderResponse;

public class ResponseEvaluarRiesgo implements Serializable {
    @SuppressWarnings("compatibility:-6925798724800635259")
    private static final long serialVersionUID = 1L;

    private EBMHeaderResponse header;
    private String CodigoSKY;
    private String FechaTransaccionUTC;
    private String TokenAutenticacion;
    private String TransaccionId;
    private InstrumentoDePago InstrumentoDePago;
    private String EstatusRiesgo;

    public ResponseEvaluarRiesgo() {
        super();
    }

    public void setHeader(EBMHeaderResponse header) {
        this.header = header;
    }


    @JsonProperty("EBMHeaderResponse")
    public EBMHeaderResponse getHeader() {
        return header;
    }

    public void setCodigoSKY(String CodigoSKY) {
        this.CodigoSKY = CodigoSKY;
    }

    @JsonProperty("CodigoSKY")
    public String getCodigoSKY() {
        return CodigoSKY;
    }

    public void setFechaTransaccionUTC(String FechaTransaccionUTC) {
        this.FechaTransaccionUTC = FechaTransaccionUTC;
    }

    @JsonProperty("FechaTransaccionUTC")
    public String getFechaTransaccionUTC() {
        return FechaTransaccionUTC;
    }

    public void setTokenAutenticacion(String TokenAutenticacion) {
        this.TokenAutenticacion = TokenAutenticacion;
    }

    @JsonProperty("TokenAutenticacion")
    public String getTokenAutenticacion() {
        return TokenAutenticacion;
    }

    public void setTransaccionId(String TransaccionId) {
        this.TransaccionId = TransaccionId;
    }

    @JsonProperty("TransaccionId")
    public String getTransaccionId() {
        return TransaccionId;
    }

    public void setEstatusRiesgo(String EstatusRiesgo) {
        this.EstatusRiesgo = EstatusRiesgo;
    }

    @JsonProperty("EstatusRiesgo")
    public String getEstatusRiesgo() {
        return EstatusRiesgo;
    }

    public void setInstrumentoDePago(InstrumentoDePago InstrumentoDePago) {
        this.InstrumentoDePago = InstrumentoDePago;
    }

    @JsonProperty("InstrumentoDePago")
    public InstrumentoDePago getInstrumentoDePago() {
        return InstrumentoDePago;
    }
}

