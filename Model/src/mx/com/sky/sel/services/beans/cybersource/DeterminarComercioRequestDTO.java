package mx.com.sky.sel.services.beans.cybersource;

import java.io.Serializable;

public class DeterminarComercioRequestDTO implements Serializable {
    @SuppressWarnings("compatibility:5589306461600098496")
    private static final long serialVersionUID = -5407380107489467769L;


    private String pais;
    private String origen;
    private String tipoTarjeta;
    private String afiliacionRecurrente;
    
    public DeterminarComercioRequestDTO() {
        super();
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setAfiliacionRecurrente(String afiliacionRecurrente) {
        this.afiliacionRecurrente = afiliacionRecurrente;
    }

    public String getAfiliacionRecurrente() {
        return afiliacionRecurrente;
    }
}
