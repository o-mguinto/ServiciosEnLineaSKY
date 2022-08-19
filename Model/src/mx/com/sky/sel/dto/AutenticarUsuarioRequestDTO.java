package mx.com.sky.sel.dto;

import java.io.Serializable;

public class AutenticarUsuarioRequestDTO implements Serializable {
    @SuppressWarnings("compatibility:-6912663681661981963")
    private static final long serialVersionUID = -826156942503912757L;
    
    private String operacion;
    private String sistemaOrigen;
    private String email;
    private String passwordEncriptado;
    
    public AutenticarUsuarioRequestDTO() {
        super();
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setSistemaOrigen(String sistemaOrigen) {
        this.sistemaOrigen = sistemaOrigen;
    }

    public String getSistemaOrigen() {
        return sistemaOrigen;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPasswordEncriptado(String passwordEncriptado) {
        this.passwordEncriptado = passwordEncriptado;
    }

    public String getPasswordEncriptado() {
        return passwordEncriptado;
    }
    
    @Override
    public String toString() {
        return String.format("email: %s passwordEncriptado: %s operacion: %s sistemaOrigen: %s", email, passwordEncriptado, operacion, sistemaOrigen);
    }
}
