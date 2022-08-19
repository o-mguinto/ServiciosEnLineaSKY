package mx.com.sky.sel.exceptions;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import mx.com.sky.sel.utils.UtileriasMB;

import org.apache.log4j.Logger;

public class ExceptionHandlerFront extends UtileriasMB {
    @SuppressWarnings("compatibility:-8796646255636019792")
    private static final long serialVersionUID = 7607697815305592902L;
    private static Logger log = Logger.getLogger(ExceptionHandlerFront.class);

    private String causaError;

    public ExceptionHandlerFront() {
        super();
    }

    public void handlerExceptionFront() {
        Exception e = null;
        String mensaje = null;
        Severity tipoMensaje = FacesMessage.SEVERITY_INFO;
        FacesContext facesContext;
        ExternalContext externalContext;
        String strException;

        try {
            e = (Exception) getElExpression("#{controllerContext.currentViewPort.exceptionData}");
            strException = e.toString();

            if (strException.contains("AuthorizationException")) {
                log.debug("Error de Autorización");
                facesContext = FacesContext.getCurrentInstance();
                externalContext = facesContext.getExternalContext();
                externalContext.redirect(externalContext.getRequestContextPath() + "/adfAuthentication?logout=true&end_url=/faces/error");
            } else if (strException.contains("ViewExpiredException")) {
                log.debug("Sesión Expirada");
                facesContext = FacesContext.getCurrentInstance();
                externalContext = facesContext.getExternalContext();
                externalContext.redirect(externalContext.getRequestContextPath() + "/adfAuthentication?logout=true&end_url=/faces/bienvenido");
            } else if (strException.contains("SOAPFaultException")) {
                log.debug("Fault Exception");
                mensaje = e.getCause().getMessage();
                causaError = mensaje;
            } else {
                log.debug("Otro tipo de Excepción");
                mensaje = e.getCause().getMessage();
                causaError = mensaje;
                throw e;
            }
        } catch (Exception ex) {
            log.error("Ocurrio un error al obtener la excepcion del controller");
            mensaje = getMensajeProperties("msj_ErrFljPrg");
            causaError = mensaje;
        }

        log.error("ExceptionHandlerFront: " + causaError, e);
        mostrarMensaje(mensaje, tipoMensaje);
    }


}
