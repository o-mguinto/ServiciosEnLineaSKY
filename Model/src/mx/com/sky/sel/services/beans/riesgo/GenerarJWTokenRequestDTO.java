package mx.com.sky.sel.services.beans.riesgo;

import java.io.Serializable;

public class GenerarJWTokenRequestDTO implements Serializable {
    @SuppressWarnings("compatibility:-4143062583378676310")
    private static final long serialVersionUID = 1L;


    private String codigoSKY;
    private String tipoTarjeta;//001
    private String mesExpTarjeta;//12
    private String anioExpTarjeta;//2025
    private String numeroTarjeta;//4456530000001005
    private String instrumentoDePagoId;
    
    public GenerarJWTokenRequestDTO() {
        super();
    }

    public void setCodigoSKY(String codigoSKY) {
        this.codigoSKY = codigoSKY;
    }

    public String getCodigoSKY() {
        return codigoSKY;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setMesExpTarjeta(String mesExpTarjeta) {
        this.mesExpTarjeta = mesExpTarjeta;
    }

    public String getMesExpTarjeta() {
        return mesExpTarjeta;
    }

    public void setAnioExpTarjeta(String anioExpTarjeta) {
        this.anioExpTarjeta = anioExpTarjeta;
    }

    public String getAnioExpTarjeta() {
        return anioExpTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setInstrumentoDePagoId(String instrumentoDePagoId) {
        this.instrumentoDePagoId = instrumentoDePagoId;
    }

    public String getInstrumentoDePagoId() {
        return instrumentoDePagoId;
    }
}
