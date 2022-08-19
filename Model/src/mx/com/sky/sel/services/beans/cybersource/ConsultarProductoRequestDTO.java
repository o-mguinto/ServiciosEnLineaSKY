package mx.com.sky.sel.services.beans.cybersource;
import java.io.Serializable;

public class ConsultarProductoRequestDTO implements Serializable {
    @SuppressWarnings("compatibility:-110975016549083119")
    private static final long serialVersionUID = -2184963816616587687L;


    private String proceso;
    private String categoria;
    private String cuenta;
    private String origen;
    private String numeroTarjeta;
    public ConsultarProductoRequestDTO() {
        super();
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }

    public String getProceso() {
        return proceso;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }
}
