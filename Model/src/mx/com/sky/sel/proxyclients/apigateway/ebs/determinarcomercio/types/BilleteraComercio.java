package mx.com.sky.sel.proxyclients.apigateway.ebs.determinarcomercio.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties({"sacPr", "sacAk", "sacSk", "carOr", "carAk", "carAi", "dfpOr"})
public class BilleteraComercio implements Serializable {
    @SuppressWarnings("compatibility:7667514521765430800")
    private static final long serialVersionUID = -7996806702353787565L;


    private String pais;
    private String sistema;
    private String mid;
    private String afiliacion;
    private String clearingHouse;
    private String monedaIso;
    private String codigoMoneda;
    private String codigoTarjeta;
    private String tipoTarjeta;
    private String afiliacionRecurrente;
    
    public BilleteraComercio() {
        super();
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    @JsonProperty("pais")
    public String getPais() {
        return pais;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }
    @JsonProperty("sistema")
    public String getSistema() {
        return sistema;
    }

    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
    }
    @JsonProperty("afiliacion")
    public String getAfiliacion() {
        return afiliacion;
    }

    public void setClearingHouse(String clearingHouse) {
        this.clearingHouse = clearingHouse;
    }
    @JsonProperty("clearingHouse")
    public String getClearingHouse() {
        return clearingHouse;
    }

    public void setMonedaIso(String monedaIso) {
        this.monedaIso = monedaIso;
    }
    @JsonProperty("monedaIso")
    public String getMonedaIso() {
        return monedaIso;
    }

    public void setCodigoTarjeta(String codigoTarjeta) {
        this.codigoTarjeta = codigoTarjeta;
    }
    @JsonProperty("codigoTarjeta")
    public String getCodigoTarjeta() {
        return codigoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }
    @JsonProperty("tipoTarjeta")
    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setAfiliacionRecurrente(String afiliacionRecurrente) {
        this.afiliacionRecurrente = afiliacionRecurrente;
    }
    @JsonProperty("afiliacionRecurrente")
    public String getAfiliacionRecurrente() {
        return afiliacionRecurrente;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }
    @JsonProperty("mid")
    public String getMid() {
        return mid;
    }

    public void setCodigoMoneda(String codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }
    @JsonProperty("codigoMoneda")
    public String getCodigoMoneda() {
        return codigoMoneda;
    }
}
