package mx.com.sky.sel.managedbeans.repordanoroboextravio;

import java.io.Serializable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.ArrayList;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.managedbeans.sesion.SesionMB;
import mx.com.sky.sel.services.beans.notificacionesemail.ParametroEmail;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.beans.utils.ArchivoAdjunto;
import mx.com.sky.sel.services.beans.utils.Suscriptor;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.notificacionesemail.ServicioNotificaciones;
import mx.com.sky.sel.services.ti.SerivcioTarjetaInteligente;
import mx.com.sky.sel.services.utils.AdjuntadorArchivos;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.Parametros;
import mx.com.sky.sel.services.utils.Files;
import mx.com.sky.sel.services.utils.SolicitudServicioUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;
import mx.com.sky.sel.utils.ADFUtils;

import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.input.RichInputFile;
import oracle.adf.view.rich.component.rich.input.RichSelectBooleanCheckbox;
import oracle.adf.view.rich.component.rich.input.RichSelectBooleanRadio;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.model.BindingContext;
import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import org.apache.myfaces.trinidad.model.UploadedFile;

public class BBTI implements Serializable {
    private static final long serialVersionUID = 1L;

    private transient RichInputFile file;
    private Boolean check; //Permite Habilitar o deshabilitar el boton de Enviar Solicitud
    private transient RichSelectBooleanCheckbox checkComponent;

    private transient RichPopup popupMensajeSeguro; //Popup que informa el estado de la Compra
    private String MensajeSeguro;

    private static final String MENSAJE_SOLICITUD_ENVIADA = "bbti.solicitudenviada";
    private static final String MENSAJE_ERROR_SOLICITUD = "bbti.errorsolicitud";

    private boolean robo;
    private boolean extravio;
    private boolean dano;
    private boolean sinArchivo;

    private transient RichSelectBooleanRadio sbrRobo;
    private transient RichSelectBooleanRadio sbrExtravio;
    private transient RichSelectBooleanRadio sbrDano;
    private transient RichSelectBooleanRadio sbrSinArchivo;

    private transient RichInputFile ifdocumentoIdentificacion;
    private transient UploadedFile documentoIdentificacion;

    private String nombreDocumento;
    private transient RichInputFile documentoAdjunto;
    private transient UploadedFile documentoSeguro;

    public BBTI() {
        LogPC.println(this, "BBTI Creado");
    }


    /*Metodo invocado cuando se envia el formulario y que sube un archivo al Servidor*/

    public void upload(ValueChangeEvent valueChangeEvent) {
        Parametros par = new Parametros(true);
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        Suscriptor suscriptor = sesion.getSuscriptor();
        String cta = suscriptor.getCuentaSKY();
        UploadedFile sourceFile = null;
        String targetFile = null;
        sourceFile = (UploadedFile)valueChangeEvent.getNewValue();
        targetFile = par.getUrlTI() + cta + "_" + sourceFile.getFilename();
        LogPC.println(this, "Se subira el Archivo : " + sourceFile.getFilename() + " a la ruta :" + targetFile);
        Files.upload(sourceFile, targetFile);
        file.resetValue();
    }

    /**
     * Invoca el servicio para crear la solicitud de reporte de robo o extravio
     * de equipo
     * @return
     */
    public String enviarSolicitud() {
        LogPC.println(this, "Iniciar envio de solicitud de reporte de robo");
        //Descripcion
        String descripcion = "Tarjeta Inteligente";
        //crear bean de Solicitud de servicio
        SolicitudServicioBean solicitudServicio = new SolicitudServicioBean();
        //llenar bean
        try {
            solicitudServicio = SolicitudServicioUtils.convert(solicitudServicio, descripcion);
            //instanciar servicio
            SerivcioTarjetaInteligente servicioSE = new SerivcioTarjetaInteligente();
            LogPC.println(this, "Enviando Solicitud.. " + solicitudServicio);
            //invocar TODO DESCOMENTAR
            //String numSolicitud = "123545678-TEST_TI";
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.SS_SMARTCARD);
            String numSolicitud = servicioSE.crearSolicitud(solicitudServicio);
            //si no hubo excepcion entonces OK
            MensajeSeguro = ADFUtils.getString(MENSAJE_SOLICITUD_ENVIADA) + numSolicitud;
            LogPC.println(this, MensajeSeguro);

            //se envia correo electronico con los archivos adjuntos
            //template: SEGUROTI
            List<ArchivoAdjunto> adjuntos = null;
            if (!((Boolean)this.sbrSinArchivo.getValue()).booleanValue()) {
                List<UploadedFile> archivos = new ArrayList<UploadedFile>();
                String[] nombreArchivos = { this.nombreDocumento, "Identificacion del titular" };
                archivos.add(documentoSeguro);
                archivos.add(documentoIdentificacion);

                adjuntos = AdjuntadorArchivos.adjuntarArchivos(archivos, nombreArchivos);
            }
            enviarDocumentos(adjuntos, numSolicitud);
        } catch (Exception ex) {
            LogPC.printlnError(ex);
            MensajeSeguro = ADFUtils.getString(MENSAJE_ERROR_SOLICITUD);
            LogPC.println(this, MensajeSeguro);
        }
        actualizarTabla();
        ADFUtils.showPopup(popupMensajeSeguro);
        return "OK";
    }
    public String aceptarSolicitudRobo() {
        ADFUtils.hidePopup(popupMensajeSeguro);
        return "";
    }
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String actualizarTabla() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("ActualizarTabla");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }


    public void checked(ValueChangeEvent e) {
        check = (Boolean)e.getNewValue();
    }

    public void setFile(RichInputFile file) {
        this.file = file;
    }

    public RichInputFile getFile() {
        return file;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }

    public Boolean getCheck() {
        return check;
    }

    public void setCheckComponent(RichSelectBooleanCheckbox checkComponent) {
        this.checkComponent = checkComponent;
    }

    public RichSelectBooleanCheckbox getCheckComponent() {
        return checkComponent;
    }

    public void setPopupMensajeSeguro(RichPopup popupMensajeSeguro) {
        this.popupMensajeSeguro = popupMensajeSeguro;
    }

    public RichPopup getPopupMensajeSeguro() {
        return popupMensajeSeguro;
    }

    public void setMensajeSeguro(String MensajeSeguro) {
        this.MensajeSeguro = MensajeSeguro;
    }

    public String getMensajeSeguro() {
        return MensajeSeguro;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        LogPC.println(this, "Serializando BBTI: ");
    }

    private void readObject(ObjectInputStream in) throws IOException {
        try {
            in.defaultReadObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        LogPC.println(this, "DeSerializando BBTI :");
    }

    public void seleccionTipoSeguro(ValueChangeEvent valueChangeEvent) {
        try {
            this.documentoAdjunto.setVisible(true);
            this.documentoAdjunto.setRequired(true);
            this.ifdocumentoIdentificacion.setVisible(true);
            this.ifdocumentoIdentificacion.setRequired(true);
            if (((Boolean)this.sbrRobo.getValue()).booleanValue()) {
                this.documentoAdjunto.setLabel("Acta de robo: ");
                this.nombreDocumento = "Acta de robo";
            } else if (((Boolean)this.sbrExtravio.getValue()).booleanValue()) {
                this.documentoAdjunto.setLabel("Carta de hechos: ");
                this.nombreDocumento = "Carta de hechos";
            } else if (((Boolean)this.sbrDano.getValue()).booleanValue()) {
                this.documentoAdjunto.setLabel("Carta por da\u00F1os: ");
                this.nombreDocumento = "Carta por da\u00F1os";
            } else if (((Boolean)this.sbrSinArchivo.getValue()).booleanValue()) {
                this.documentoAdjunto.setVisible(false);
                this.documentoAdjunto.setRequired(false);
                this.ifdocumentoIdentificacion.setVisible(false);
                this.ifdocumentoIdentificacion.setRequired(false);
            }
            AdfFacesContext adfctx = AdfFacesContext.getCurrentInstance();
            adfctx.addPartialTarget(documentoAdjunto);
            adfctx.addPartialTarget(ifdocumentoIdentificacion);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void enviarDocumentos(List<ArchivoAdjunto> listaAdjuntos, String numSolicitud) {
        ServicioNotificaciones sn = new ServicioNotificaciones();
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String paisISO = sesion.getSuscriptor().getPaisISO();
        String para = sesion.getUsuario().getMail();
        List<ParametroEmail> parametros = getParametrosCorreo(sesion);
        parametros.add(new ParametroEmail("[NUMSS]", numSolicitud));
        String adjuntos =
            listaAdjuntos == null ? "Solicitud sin archivos adjuntos" : "Solicitud con " + listaAdjuntos.size() + " archivo(s) adjunto(s)";
        parametros.add(new ParametroEmail("[ADJUNTOS]", adjuntos));
        String cuenta = sesion.getSuscriptor().getCuentaSKY();
        parametros.add(new ParametroEmail("[CUENTA]", cuenta));
        try {
            if (sesion.isUserVeTV()) {
                sn.enviarEmailNotificacion("SEGURO_TI_MXVETV", para, paisISO, parametros, listaAdjuntos);
            } else if (!sesion.getPaisISO().equals("MX")) {
                sn.enviarEmailNotificacion("SEGURO_TI_CA", para, paisISO, parametros, listaAdjuntos);
            } else {
                sn.enviarEmailNotificacion("SEGURO_TI_MX", para, paisISO, parametros, listaAdjuntos);
            }
        } catch (ServicioException e) {
            ADFUtils.showErrorMessage(e.getMessage());
        }
    }

    private List<ParametroEmail> getParametrosCorreo(SesionMB sesion) {
        List<ParametroEmail> parametros = new ArrayList<ParametroEmail>();

        String nombreSuscriptor = sesion.getSuscriptor().getNombreSuscriptor();
        parametros.add(new ParametroEmail("[NOMBRE_SUSCRIPTOR]", nombreSuscriptor));

        return parametros;
    }

    public void setSbrRobo(RichSelectBooleanRadio sbrRobo) {
        this.sbrRobo = sbrRobo;
    }

    public RichSelectBooleanRadio getSbrRobo() {
        return sbrRobo;
    }

    public void setSbrExtravio(RichSelectBooleanRadio sbrExtravio) {
        this.sbrExtravio = sbrExtravio;
    }

    public RichSelectBooleanRadio getSbrExtravio() {
        return sbrExtravio;
    }

    public void setSbrDano(RichSelectBooleanRadio sbrDano) {
        this.sbrDano = sbrDano;
    }

    public RichSelectBooleanRadio getSbrDano() {
        return sbrDano;
    }

    public void setSbrSinArchivo(RichSelectBooleanRadio sbrSinArchivo) {
        this.sbrSinArchivo = sbrSinArchivo;
    }

    public RichSelectBooleanRadio getSbrSinArchivo() {
        return sbrSinArchivo;
    }

    public void setRobo(boolean robo) {
        this.robo = robo;
    }

    public boolean isRobo() {
        return robo;
    }

    public void setExtravio(boolean extravio) {
        this.extravio = extravio;
    }

    public boolean isExtravio() {
        return extravio;
    }

    public void setDano(boolean dano) {
        this.dano = dano;
    }

    public boolean isDano() {
        return dano;
    }

    public void setSinArchivo(boolean sinArchivo) {
        this.sinArchivo = sinArchivo;
    }

    public boolean isSinArchivo() {
        return sinArchivo;
    }

    public void setIfdocumentoIdentificacion(RichInputFile ifdocumentoIdentificacion) {
        this.ifdocumentoIdentificacion = ifdocumentoIdentificacion;
    }

    public RichInputFile getIfdocumentoIdentificacion() {
        return ifdocumentoIdentificacion;
    }

    public void setDocumentoIdentificacion(UploadedFile documentoIdentificacion) {
        this.documentoIdentificacion = documentoIdentificacion;
    }

    public UploadedFile getDocumentoIdentificacion() {
        return documentoIdentificacion;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setDocumentoAdjunto(RichInputFile documentoAdjunto) {
        this.documentoAdjunto = documentoAdjunto;
    }

    public RichInputFile getDocumentoAdjunto() {
        return documentoAdjunto;
    }

    public void setDocumentoSeguro(UploadedFile documentoSeguro) {
        this.documentoSeguro = documentoSeguro;
    }

    public UploadedFile getDocumentoSeguro() {
        return documentoSeguro;
    }

    public void fileUpdate(ValueChangeEvent valueChangeEvent) {
        RichInputFile inputFileComponent = (RichInputFile)valueChangeEvent.getComponent();
        UploadedFile newFile = (UploadedFile)valueChangeEvent.getNewValue();
        if (newFile.getFilename().endsWith("png")) {
            FacesContext.getCurrentInstance().addMessage(inputFileComponent.getClientId(FacesContext.getCurrentInstance()),
                                                         new FacesMessage(FacesMessage.SEVERITY_INFO, "Archivos PNG no soportados",
                                                                          "El archivo: " + newFile.getFilename() +
                                                                          " no esta permitido; la extensi\u00F3n png no esta soportada"));
            ifdocumentoIdentificacion.resetValue();
            documentoAdjunto.resetValue();
            inputFileComponent.setValid(false);
        }
    }
}
