package mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarreto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class RespuestaGenerarReto implements Serializable {
    @SuppressWarnings("compatibility:-3091228587574927043")
    private static final long serialVersionUID = 1L;

    private String fechaTransaccionUTC;
    private String estado;
    private String id;
    private EstadoSKY estadoSky;
    private ReferenciaInfo refInfo;
    private ErrorInfo errorInfo;
    private InformacionDeAutenticacion infoDeAutenticacion;
    private InformacionDePago infoDePago;


    public RespuestaGenerarReto() {
        super();
    }


    public void setFechaTransaccionUTC(String fechaTransaccionUTC) {
        this.fechaTransaccionUTC = fechaTransaccionUTC;
    }

    @JsonProperty("FechaTransaccionUTC")
    public String getFechaTransaccionUTC() {
        return fechaTransaccionUTC;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @JsonProperty("Estado")
    public String getEstado() {
        return estado;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setRefInfo(ReferenciaInfo refInfo) {
        this.refInfo = refInfo;
    }

    @JsonProperty("ReferenciaInfo")
    public ReferenciaInfo getRefInfo() {
        return refInfo;
    }

    public void setErrorInfo(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    @JsonProperty("ErrorInfo")
    public ErrorInfo getErrorInfo() {
        return errorInfo;
    }

    public void setInfoDeAutenticacion(InformacionDeAutenticacion infoDeAutenticacion) {
        this.infoDeAutenticacion = infoDeAutenticacion;
    }

    @JsonProperty("InformacionDeAutenticacion")
    public InformacionDeAutenticacion getInfoDeAutenticacion() {
        return infoDeAutenticacion;
    }

    public void setInfoDePago(InformacionDePago infoDePago) {
        this.infoDePago = infoDePago;
    }

    @JsonProperty("InformacionDePago")
    public InformacionDePago getInfoDePago() {
        return infoDePago;
    }

    public void setEstadoSky(EstadoSKY estadoSky) {
        this.estadoSky = estadoSky;
    }

    @JsonProperty("EstadoSky")
    public EstadoSKY getEstadoSky() {
        return estadoSky;
    }
}
