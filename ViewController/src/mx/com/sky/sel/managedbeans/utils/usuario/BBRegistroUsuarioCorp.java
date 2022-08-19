package mx.com.sky.sel.managedbeans.utils.usuario;

import java.io.Serializable;

import java.util.Enumeration;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.servlet.http.HttpServletRequest;

import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.services.utils.usuario.ServicioUsuario;
import mx.com.sky.sel.utils.ADFUtils;

public class BBRegistroUsuarioCorp implements Serializable {
    private String mensajeUsuario;
    private String tipoMensaje;
    private String icono;
    private Boolean mostrarOKRegistro;
    public BBRegistroUsuarioCorp() {
        super();
        mostrarOKRegistro = false;
        icono = "activa.png";
    }
    public void handleRequestMethod() {
        String codigoVerificacion = "";
        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext externalContext = context.getExternalContext();
        HttpServletRequest request = (HttpServletRequest)externalContext.getRequest();
        codigoVerificacion = request.getParameter("code");
        LogPC.println(this, "codigoVerificacion:" + codigoVerificacion);
        ServicioUsuario su = new ServicioUsuario();
        String estatusCodigo = "";
        if (codigoVerificacion != null && !codigoVerificacion.isEmpty()) {
            try {
                estatusCodigo = su.consultarEstatusCodigoPre(codigoVerificacion);
                tipoMensaje = estatusCodigo;

                if (estatusCodigo.equalsIgnoreCase("EXPIRADO")) {
                    icono = "alerta.png";
                    mensajeUsuario = "El registro ha caducado, para poder ingresar a servicios en línea deberá registrarse nuevamente.";
                } else if (estatusCodigo.equalsIgnoreCase("PROCESADO")) {
                    mensajeUsuario =
                            "El código de verificación indica que ya se encuentra registrado en el sistema, si no puede ingresar intente con la opción de recuperación de contraseña.";
                    icono = "alerta.png";
                } else if (estatusCodigo.equalsIgnoreCase("No Encontrado")) {
                    mensajeUsuario =
                            "El link de registro es inválido o su código de verificación no se encuentra en nuestro sistema. Si ya recibió su correo de bienvenida usted ya puede hacer uso de Servicios en Línea SKY, de lo contrario es posible que hayan transcurrido más de 72 horas o que no se haya registrado en nuestro sistema, en tal caso será necesario ingresar nuevamente sus datos.";
                    icono = "alerta.png";
                } else if (estatusCodigo.equalsIgnoreCase("VIGENTE")) {
                    LogPC.println(this, "Terminando Registro para el Codigo [" + codigoVerificacion + "]");
                    su.terminarPreRegistroCorp(codigoVerificacion);
                    //mensajeUsuario = "Estimado Suscriptor le informamos que su registro en Servicios en Línea SKY está siendo procesado. En breve recibirá un correo electrónico en el que se notificará que su cuenta ha sido activada.";
                    icono = "activa.png";
                    mostrarOKRegistro = true;
                    mensajeUsuario =
                            "Estimado suscriptor le informamos que su registro en Servicios en línea SKY está siendo procesado. En breve el sistema le enviará un correo electrónico desde cualquier de la siguientes direcciones de acuerdo a su país de residencia en el que se notificará que su cuenta ha sido activada.";
                } else {
                    LogPC.printlnWarn(this, "EstatusCodigoPre no regreso ESTATUS para Codigo[" + codigoVerificacion + "]");
                    mensajeUsuario =
                            "El link de registro es inválido o su código de verificación es incorrecto, por favor comúniquese a los teléfonos de SKY";
                    icono = "alerta.png";
                }
            } catch (Exception e) {
                LogPC.printlnError(this, e.getMessage(), e);
                ADFUtils.showErrorMessage(e.getMessage());
                mensajeUsuario = "Ocurrió algo inesperado, por favor intenta nuevamente más tarde";
                icono = "alerta.png";
            }
        } else {
            tipoMensaje = "VACIO";
            icono = "alerta.png";
            mensajeUsuario =
                    "El link de registro es inválido o su código de verificación es incorrecto. Si ya recibió su correo de bienvenida usted ya puede hacer uso de Servicios en Línea SKY, de lo contrario es necesario ingresar nuevamente sus datos.";
        }
    }


    public String terminarRegistro() {
        String codigoVerificacion = "";

        ExternalContext ectx = FacesContext.getCurrentInstance().getExternalContext();
        HttpServletRequest request = (HttpServletRequest)ectx.getRequest();
        Enumeration parameterNames = request.getParameterNames();

        while (parameterNames.hasMoreElements()) {
            LogPC.println(this, "name param:" + parameterNames.nextElement());
        }

        parameterNames = request.getAttributeNames();

        while (parameterNames.hasMoreElements()) {
            LogPC.println(this, "name att:" + parameterNames.nextElement());
        }

        LogPC.println(this, "codigo:" + request.getAttribute("code"));
        codigoVerificacion = request.getParameter("code");
        LogPC.println(this, "codigoVerificacion:" + codigoVerificacion);

        return "index";
    }


    public void setMensajeUsuario(String mensajeUsuario) {
        this.mensajeUsuario = mensajeUsuario;
    }

    public String getMensajeUsuario() {
        return mensajeUsuario;
    }

    public void setTipoMensaje(String tipoMensaje) {
        this.tipoMensaje = tipoMensaje;
    }

    public String getTipoMensaje() {
        return tipoMensaje;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public String getIcono() {
        return icono;
    }


    public void setMostrarOKRegistro(Boolean mostrarOKRegistro) {
        this.mostrarOKRegistro = mostrarOKRegistro;
    }

    public Boolean getMostrarOKRegistro() {
        return mostrarOKRegistro;
    }
}
