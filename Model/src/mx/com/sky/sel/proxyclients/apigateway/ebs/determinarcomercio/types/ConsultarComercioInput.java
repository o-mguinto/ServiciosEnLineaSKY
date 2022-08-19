package mx.com.sky.sel.proxyclients.apigateway.ebs.determinarcomercio.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ConsultarComercioInput implements Serializable {
    @SuppressWarnings("compatibility:-3368460443913008776")
    private static final long serialVersionUID = -6356577249513128212L;


    private String pais;
    private String sistema;
    private String tipoTarjeta;
    private String afiliacionRecurrente;
    
    public ConsultarComercioInput() {
        super();
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    @JsonProperty("Pais")
    public String getPais() {
        return pais;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }
    @JsonProperty("Sistema")
    public String getSistema() {
        return sistema;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }
    @JsonProperty("CodigoTarjeta")
    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setAfiliacionRecurrente(String afiliacionRecurrente) {
        this.afiliacionRecurrente = afiliacionRecurrente;
    }
    @JsonProperty("AfiliacionRecurrente")
    public String getAfiliacionRecurrente() {
        return afiliacionRecurrente;
    }
}
