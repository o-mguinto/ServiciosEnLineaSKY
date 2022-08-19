package mx.com.sky.sel.proxyclients.apigateway.ebf.orquestarprocesopago.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class DatosTarjeta_Entrada implements Serializable {
    @SuppressWarnings("compatibility:-2170622069501793374")
    private static final long serialVersionUID = -5226152273279328318L;
    
    private String tipoTarjeta;
    private String numeroTarjeta;
    private String fechaExpTarjeta;
    private String cvvTarjeta;
    private String nombreTitularTarjeta;
    private String nombreEmpresaTransaccion;
    public DatosTarjeta_Entrada() {
        super();
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }
    @JsonProperty("tipoTarjeta")
    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    @JsonProperty("numeroTarjeta")
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setFechaExpTarjeta(String fechaExpTarjeta) {
        this.fechaExpTarjeta = fechaExpTarjeta;
    }
    @JsonProperty("fechaExpTarjeta")
    public String getFechaExpTarjeta() {
        return fechaExpTarjeta;
    }

    public void setCvvTarjeta(String cvvTarjeta) {
        this.cvvTarjeta = cvvTarjeta;
    }
    @JsonProperty("cvvTarjeta")
    public String getCvvTarjeta() {
        return cvvTarjeta;
    }

    public void setNombreTitularTarjeta(String nombreTitularTarjeta) {
        this.nombreTitularTarjeta = nombreTitularTarjeta;
    }
    @JsonProperty("nombreTitularTarjeta")
    public String getNombreTitularTarjeta() {
        return nombreTitularTarjeta;
    }

    public void setNombreEmpresaTransaccion(String nombreEmpresaTransaccion) {
        this.nombreEmpresaTransaccion = nombreEmpresaTransaccion;
    }
    @JsonProperty("nombreEmpresaTransaccion")
    public String getNombreEmpresaTransaccion() {
        return nombreEmpresaTransaccion;
    }
}
