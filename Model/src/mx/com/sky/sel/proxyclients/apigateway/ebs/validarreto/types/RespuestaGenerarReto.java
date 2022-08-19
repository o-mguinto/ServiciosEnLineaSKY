package mx.com.sky.sel.proxyclients.apigateway.ebs.validarreto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class RespuestaGenerarReto implements Serializable {
    @SuppressWarnings("compatibility:-7552619701497572115")
    private static final long serialVersionUID = 1L;


    private String fechaTransaccionUTC;
    private String estado;
    private String id;
    private EstadoSky estadoSky;
    private ReferenciaInfo referenciaInfo;
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

    public void setReferenciaInfo(ReferenciaInfo referenciaInfo) {
        this.referenciaInfo = referenciaInfo;
    }
    @JsonProperty("ReferenciaInfo")
    public ReferenciaInfo getReferenciaInfo() {
        return referenciaInfo;
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

    public void setEstadoSky(EstadoSky estadoSky) {
        this.estadoSky = estadoSky;
    }
    @JsonProperty("EstadoSky")
    public EstadoSky getEstadoSky() {
        return estadoSky;
    }
}
