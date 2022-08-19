package mx.com.sky.sel.services.beans.billetera;

import java.io.Serializable;

public class RequestGenerarIdUnicoDePagoDTO implements Serializable {
    @SuppressWarnings("compatibility:8258057112749899130")
    private static final long serialVersionUID = 1L;


    private String cuenta;
    private String proceso;
    private String clearingHouse;
    private String sistemaOrigen;
    public RequestGenerarIdUnicoDePagoDTO() {
        super();
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }

    public String getProceso() {
        return proceso;
    }

    public void setClearingHouse(String clearingHouse) {
        this.clearingHouse = clearingHouse;
    }

    public String getClearingHouse() {
        return clearingHouse;
    }

    public void setSistemaOrigen(String sistemaOrigen) {
        this.sistemaOrigen = sistemaOrigen;
    }

    public String getSistemaOrigen() {
        return sistemaOrigen;
    }
}
