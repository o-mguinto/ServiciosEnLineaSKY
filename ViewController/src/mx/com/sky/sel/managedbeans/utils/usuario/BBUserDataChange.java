package mx.com.sky.sel.managedbeans.utils.usuario;

import java.io.Serializable;

import java.util.Enumeration;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.servlet.http.HttpServletRequest;

import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.services.utils.usuario.ServicioUsuario;
import mx.com.sky.sel.utils.ADFUtils;

public class BBUserDataChange implements Serializable{
    @SuppressWarnings("compatibility:900118299463513419")
    private static final long serialVersionUID = 2480107132359200390L;

    private String mensajeUsuario;
    private String tipoMensaje;
    private String icono;
    private Boolean mostrarOKRegistro;

    public BBUserDataChange() {
        super();
        mostrarOKRegistro = false;
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
                estatusCodigo = su.consultarEstatusCodigoPreActualizacion(codigoVerificacion);
                tipoMensaje = estatusCodigo;

                if (estatusCodigo.equalsIgnoreCase("CONFIRMAR")) {
                    LogPC.println(this, "Terminando Actualización para el Codigo [" + codigoVerificacion + "]");
                    su.terminarPreActualizacion(codigoVerificacion);
                    mostrarOKRegistro = true;
                    icono = "activa.png";
                    mensajeUsuario =
                            "Estimado suscriptor le informamos que su solicitud de actualización de datos en Servicios en línea SKY será procesada. En breve el sistema le enviará un correo electrónico desde cualquier de la siguientes direcciones de acuerdo a su país de residencia en el que se notificará que sus datos han sido actualizados.";
                } else if (estatusCodigo.equalsIgnoreCase("CONFIRMANDO") || estatusCodigo.equalsIgnoreCase("PROCESAR") ||
                           estatusCodigo.equalsIgnoreCase("PROCESANDO")) {
                    mensajeUsuario =
                            "Estimado suscriptor le informamos que su solicitud de actualización de datos en Servicios en línea SKY se está procesando. En breve el sistema le enviará un correo electrónico desde cualquier de la siguientes direcciones de acuerdo a su país de residencia en el que se notificará que sus datos han sido actualizados.";
                    icono = "alerta.png";
                } else if (estatusCodigo.equalsIgnoreCase("OK")) {
                    icono = "activa.png";
                    mensajeUsuario =
                            "Estimado suscriptor le informamos que su solicitud de actualización de datos en Servicios en línea SKY ya fue procesada.";
                } else if (estatusCodigo.equalsIgnoreCase("NO_RECUPERABLE")) {
                    icono = "alerta.png";
                    mensajeUsuario =
                            "Estimado suscriptor le informamos que su solicitud de actualización de datos en Servicios en línea SKY no fue procesada. Por favor intente nuevamente la actualización de sus datos en el menú Mi Cuenta \\ Actualización de datos";
                } else {
                    LogPC.printlnWarn(this, "EstatusCodigoPre no regreso ESTATUS para Codigo[" + codigoVerificacion + "]");
                    mensajeUsuario =
                            "El link de actualización de datos es inválido o su código de verificación es incorrecto, por favor comúniquese a los teléfonos de SKY";
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
                    "El link de actualización de datos es inválido o su código de verificación es incorrecto, por favor comúniquese a los teléfonos de SKY";
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
