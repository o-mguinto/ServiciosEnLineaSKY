package mx.com.sky.sel.services.beans.portabilidad;

import java.io.Serializable;


public class PortabilidadBean implements Serializable{
    @SuppressWarnings("compatibility:4061955511259500868")
    private static final long serialVersionUID = 4193790952910003511L;

    public PortabilidadBean() {
        super();
    }
    private String cuenta;
    private String numeroPortar;
    private String operadorDonante;
    private String curp;
    private String nipConfirmation;
    private String vigenciaNip;
    private String region;
    private String imei;
    private String assetNumber;

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setNumeroPortar(String numeroPortar) {
        this.numeroPortar = numeroPortar;
    }

    public String getNumeroPortar() {
        return numeroPortar;
    }

    public void setOperadorDonante(String operadorDonante) {
        this.operadorDonante = operadorDonante;
    }

    public String getOperadorDonante() {
        return operadorDonante;
    }

    public void setCurp(String curp) {
        if(curp != null)
                    curp = curp.toUpperCase();
        this.curp = curp;
    }

    public String getCurp() {
        return curp;
    }

    public void setNipConfirmation(String nipConfirmation) {
        this.nipConfirmation = nipConfirmation;
    }

    public String getNipConfirmation() {
        return nipConfirmation;
    }

    public void setVigenciaNip(String vigenciaNip) {
        this.vigenciaNip = vigenciaNip;
    }

    public String getVigenciaNip() {
        return vigenciaNip;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getImei() {
        return imei;
    }

    public void setAssetNumber(String assetNumber) {
        this.assetNumber = assetNumber;
    }

    public String getAssetNumber() {
        return assetNumber;
    }
}
