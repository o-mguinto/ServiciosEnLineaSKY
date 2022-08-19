package mx.com.sky.sel.proxyclients.apigateway.ebs.consultartipocambio.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class BilleteraTipoCambio implements Serializable  {
    @SuppressWarnings("compatibility:292904534283824463")
    private static final long serialVersionUID = -8508520323377613969L;

    private String id;
    private String estatus;
    private String pais;
    private String origen;
    private String destino;
    private String tasa;
    private String fechaVigenciaInicio;
    private String fechaVigenciaFin;
    private String fechaCreacion;
    private String fechaActualizacion;
    
    public BilleteraTipoCambio() {
        super();
    }

    public void setId(String id) {
        this.id = id;
    }
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    @JsonProperty("estatus")
    public String getEstatus() {
        return estatus;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    @JsonProperty("pais")
    public String getPais() {
        return pais;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
    @JsonProperty("origen")
    public String getOrigen() {
        return origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    @JsonProperty("destino")
    public String getDestino() {
        return destino;
    }

    public void setTasa(String tasa) {
        this.tasa = tasa;
    }
    @JsonProperty("tasa")
    public String getTasa() {
        return tasa;
    }

    public void setFechaVigenciaInicio(String fechaVigenciaInicio) {
        this.fechaVigenciaInicio = fechaVigenciaInicio;
    }
    @JsonProperty("fechaVigenciaInicio")
    public String getFechaVigenciaInicio() {
        return fechaVigenciaInicio;
    }
    
    public void setFechaVigenciaFin(String fechaVigenciaFin) {
        this.fechaVigenciaFin = fechaVigenciaFin;
    }
    @JsonProperty("fechaVigenciaFin")
    public String getFechaVigenciaFin() {
        return fechaVigenciaFin;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    @JsonProperty("fechaCreacion")
    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaActualizacion(String fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
    @JsonProperty("fechaActualizacion")
    public String getFechaActualizacion() {
        return fechaActualizacion;
    }
}
