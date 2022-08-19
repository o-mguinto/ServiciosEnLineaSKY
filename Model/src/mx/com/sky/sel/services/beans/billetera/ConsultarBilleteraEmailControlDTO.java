package mx.com.sky.sel.services.beans.billetera;

import java.io.Serializable;

public class ConsultarBilleteraEmailControlDTO implements Serializable {
    @SuppressWarnings("compatibility:-41977673698751343")
    private static final long serialVersionUID = 1L;

    private String id;
    private String email;
    private String idProspecto;
    private String contrato;
    private String cuenta;

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getCuenta() {
        return cuenta;
    }
   
    public ConsultarBilleteraEmailControlDTO() {
        super();
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setIdProspecto(String idProspecto) {
        this.idProspecto = idProspecto;
    }

    public String getIdProspecto() {
        return idProspecto;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getContrato() {
        return contrato;
    }
}
