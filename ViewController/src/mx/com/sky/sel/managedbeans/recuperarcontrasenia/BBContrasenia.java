package mx.com.sky.sel.managedbeans.recuperarcontrasenia;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import mx.com.sky.sel.services.utils.usuario.ServicioUsuario;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.UtileriasMB;

public class BBContrasenia extends UtileriasMB implements Serializable {
    @SuppressWarnings("compatibility:-2293243595604937691")
    private static final long serialVersionUID = 8296685958983710184L;

    private String identificador;
    
    public BBContrasenia() {
        super();
    }
    
    public String recuperarContraseniaPC2() {
        // Add event code here...
        ServicioUsuario su = new ServicioUsuario();

        try {
            su.passwordReset(identificador);
        } catch (Exception e) {
            ADFUtils.showErrorMessage(getMensajeProperties("mensaje_PantallaError_generico"));
            return null;
        }
        return "siguiente";
    }
    public String recuperarContraseniaPC() {
        // Add event code here...
        ServicioUsuario su = new ServicioUsuario();

        try {
            su.recuperarContrasenia(identificador);
        } catch (Exception e) {
            ADFUtils.showErrorMessage(getMensajeProperties("mensaje_Email_invalidoPass"));
            return null;
        }
        return "siguiente";
    }

    public String recuperarContrasenia() {
        // Add event code here...
        ServicioUsuario su = new ServicioUsuario();

        try {
            su.recuperarContrasenia(identificador);
        } catch (Exception e) {
            ADFUtils.showErrorMessage(getMensajeProperties("mensaje_PantallaError_generico"));
            return null;
        }
        return "siguiente";
    }
    
    public String recuperarContraseniaMovil() {
        // Add event code here...
        ServicioUsuario su = new ServicioUsuario();
        if(!identificador.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
            FacesMessage msg =
                new FacesMessage(FacesMessage.SEVERITY_INFO, null,
                                 "Introduzca un e-mail válido");
            FacesContext.getCurrentInstance().addMessage(null, msg);
            return null;
        }
        try {
            su.recuperarContrasenia(identificador);
        } catch (Exception e) {
            ADFUtils.showErrorMessage(getMensajeProperties("mensaje_Email_invalidoPass"));
            return null;
        }
        return "siguiente";
    }


    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getIdentificador() {
        return identificador;
    }
}
