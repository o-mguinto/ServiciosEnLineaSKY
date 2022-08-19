package mx.com.sky.sel.services.beans.billetera;

import java.io.Serializable;

public class EmailProspectoDTO implements Serializable {
    @SuppressWarnings("compatibility:-2023460811582868640")
    private static final long serialVersionUID = 1L;

    private String email;
    private String servicio;
    private String sistemaOrigen;
    private String cadenaValidacion;
    private String numCuenta;
    private String idProspecto;
    private String vigencia;
    
    public EmailProspectoDTO() {
        super();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getServicio() {
        return servicio;
    }

    public void setSistemaOrigen(String sistemaOrigen) {
        this.sistemaOrigen = sistemaOrigen;
    }

    public String getSistemaOrigen() {
        return sistemaOrigen;
    }

    public void setCadenaValidacion(String cadenaValidacion) {
        this.cadenaValidacion = cadenaValidacion;
    }

    public String getCadenaValidacion() {
        return cadenaValidacion;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setIdProspecto(String idProspecto) {
        this.idProspecto = idProspecto;
    }

    public String getIdProspecto() {
        return idProspecto;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public String getVigencia() {
        return vigencia;
    }
}
