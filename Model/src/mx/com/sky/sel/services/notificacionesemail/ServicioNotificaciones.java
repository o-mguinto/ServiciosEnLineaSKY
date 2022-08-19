package mx.com.sky.sel.services.notificacionesemail;

import java.io.Serializable;

import java.util.ArrayList;

import mx.com.sky.sel.services.beans.utils.ArchivoAdjunto;
import java.util.List;

import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.proxyclients.pagwebnotificaciones.emailserviciosenlinea.EmailServiciosEnLinea;
import mx.com.sky.sel.proxyclients.pagwebnotificaciones.emailserviciosenlinea.EmailserviciosenlineaClientEp;
import mx.com.sky.sel.services.beans.notificacionesemail.ParametroEmail;
import mx.com.sky.sel.services.exception.ServicioException;

public class ServicioNotificaciones implements Serializable {
    private static final long serialVersionUID = 1L;

    public ServicioNotificaciones() {
        super();
    }

    /**
     *
     * @param codigo
     * @param para Es correo(s) del destinatario separado por ;
     * @param paisISO Puede ser null
     * @param parametros Puede ser null
     * @param adjuntos Puede ser null
     * @throws ServicioException
     */
    public void enviarEmailNotificacion(String codigo, String para, String paisISO, List<ParametroEmail> parametros,
                                        List<ArchivoAdjunto> adjuntos) throws ServicioException {
        EmailserviciosenlineaClientEp emailserviciosenlinea_client_ep;
        EmailServiciosEnLinea emailServiciosEnLinea = null;
        List<mx.com.sky.sel.proxyclients.pagwebnotificaciones.emailserviciosenlinea.types.AttachmentType> attachments;
        List<mx.com.sky.sel.proxyclients.pagwebnotificaciones.emailserviciosenlinea.types.ParametroType> parametrosTmp = null;
        String pais = "";
        try {
            emailserviciosenlinea_client_ep = new EmailserviciosenlineaClientEp();
            emailServiciosEnLinea = emailserviciosenlinea_client_ep.getEmailServiciosEnLineaPt();


            if (paisISO == null) {
                pais = "MX";
            } else {
                pais = paisISO;
            }

            parametrosTmp = new ArrayList<mx.com.sky.sel.proxyclients.pagwebnotificaciones.emailserviciosenlinea.types.ParametroType>();
            mx.com.sky.sel.proxyclients.pagwebnotificaciones.emailserviciosenlinea.types.ParametroType paramTmp = null;
            for (ParametroEmail parametroEmail : parametros) {
                paramTmp = new mx.com.sky.sel.proxyclients.pagwebnotificaciones.emailserviciosenlinea.types.ParametroType();
                paramTmp.setNombre(parametroEmail.getNombre());
                paramTmp.setValor(parametroEmail.getValor());
                parametrosTmp.add(paramTmp);
            }

            mx.com.sky.sel.proxyclients.pagwebnotificaciones.emailserviciosenlinea.types.AttachmentType attachment = null;
            attachments = new ArrayList<mx.com.sky.sel.proxyclients.pagwebnotificaciones.emailserviciosenlinea.types.AttachmentType>();
            if (adjuntos != null) {
                for (ArchivoAdjunto archivoAdjunto : adjuntos) {
                    attachment = new mx.com.sky.sel.proxyclients.pagwebnotificaciones.emailserviciosenlinea.types.AttachmentType();
                    attachment.setExtension(archivoAdjunto.getExtension());
                    attachment.setFileBase64(archivoAdjunto.getFileBase64());
                    attachment.setFileName(archivoAdjunto.getFileName());
                    attachments.add(attachment);
                }
            }
            emailServiciosEnLinea.process(codigo, para, pais, parametrosTmp, attachments);
        } catch (Exception e) {
            LogServicios.printlnError(e);
            throw new ServicioException("Ocurri\u00F3 un error al enviar el correo por favor intente m\u00E1s tarde");
        }
    }
}
