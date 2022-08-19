package mx.com.sky.sel.managedbeans.seguro;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.managedbeans.sesion.SesionMB;
import mx.com.sky.sel.services.beans.notificacionesemail.ParametroEmail;
import mx.com.sky.sel.services.beans.seguroequipo.ServicioSeguroEquipo;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.beans.utils.ArchivoAdjunto;
import mx.com.sky.sel.services.beans.utils.Suscriptor;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.notificacionesemail.ServicioNotificaciones;
import mx.com.sky.sel.services.utils.AdjuntadorArchivos;
import mx.com.sky.sel.services.utils.Files;
import mx.com.sky.sel.services.utils.SolicitudServicioUtils;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.Parametros;
import mx.com.sky.sel.utils.UtileriasMB;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.input.RichInputFile;
import oracle.adf.view.rich.component.rich.input.RichSelectBooleanRadio;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import org.apache.myfaces.trinidad.model.UploadedFile;

public class BBSeguro extends UtileriasMB implements Serializable {
    @SuppressWarnings("compatibility:-8615924402486218641")
    private static final long serialVersionUID = 1678914097788243248L;

    private String file;
    private Boolean check; //Permite Habilitar o deshabilitar el boton de Enviar Solicitud
    private transient RichPopup popupMensajeSeguro; //Popup que informa el estado
    private String mensajeSeguro;


    private static final String MENSAJE_SOLICITUD_ENVIADA = "bbseguro.solicitudenviada";
    private static final String MENSAJE_ERROR_SOLICITUD = "bbseguro.errorsolicitud";


    private boolean robo;
    private boolean siniestro;
    private boolean dano;
    private boolean sinArchivo;

    private transient RichSelectBooleanRadio sbrRobo;
    private transient RichSelectBooleanRadio sbrSiniestro;
    private transient RichSelectBooleanRadio sbrDano;
    private transient RichSelectBooleanRadio sbrSinArchivo;

    private String nombreDocumento;
    private transient RichInputFile documentoAdjunto;
    private transient UploadedFile documentoSeguro;


    public BBSeguro() {
        LogPC.println(this, "BBSeguro Creado");
        check = false;
    }

    /*Metodo invocado cuando se envia el formulario y que sube un archivo al Servidor*/

    public void upload(ValueChangeEvent valueChangeEvent) {
        Parametros par = new Parametros(true);
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        Suscriptor suscriptor = sesion.getSuscriptor();
        String cta = suscriptor.getCuentaSKY();
        UploadedFile sourceFile = null;
        String targetFile = null;

        try {
            sourceFile = (UploadedFile)valueChangeEvent.getNewValue();
            targetFile = par.getUrlSeguro() + cta + "_" + sourceFile.getFilename();
            LogPC.println(this, "Se subira el Archivo : " + sourceFile.getFilename() + " a la ruta :" + targetFile);
            Files.upload(sourceFile, targetFile);
            file = "";
        } catch (Exception e) {
            LogPC.printlnError(e);
        }

    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getFile() {
        return file;
    }

    /**
     * Invoca el servicio para crear la solicitud de reporte de robo o extravio
     * de equipo
     * @return
     */
    public String enviarSolicitud() {
        LogPC.println(this, "Iniciar envio de solicitud de reporte de robo");
        //Descripcion
        String descripcion = "Seguro Equipo";
        //crear bean de Solicitud de servicio
        SolicitudServicioBean solicitudServicio = new SolicitudServicioBean();
        //llenar bean
        try {
            solicitudServicio = SolicitudServicioUtils.convert(solicitudServicio, descripcion);

            //instanciar servicio
            ServicioSeguroEquipo servicioSE = new ServicioSeguroEquipo();
            LogPC.println(this, "Enviando Solicitud.. " + solicitudServicio);
            //invocar
            /*String numSolicitud = "12345678-TEST_Equipo";*/
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.SS_SEGURO_EQUIPO);
            String numSolicitud = servicioSE.crearSolicitud(solicitudServicio);
            //si no hubo excepcion entonces OK
            mensajeSeguro = ADFUtils.getString(MENSAJE_SOLICITUD_ENVIADA) + numSolicitud;
            LogPC.println(this, mensajeSeguro);
            //ADFUtils.showInfoMessage(mensajeSeguro);

            //se envia correo electronico con los archivos adjuntos
            //template: SEGURO
            List<ArchivoAdjunto> adjuntos = null;
            if (!((Boolean)this.sbrSinArchivo.getValue()).booleanValue()) {
                List<UploadedFile> archivos = new ArrayList<UploadedFile>();
                String[] nombreArchivos = { this.nombreDocumento };
                archivos.add(documentoSeguro);

                adjuntos = AdjuntadorArchivos.adjuntarArchivos(archivos, nombreArchivos);
            }
            enviarDocumentos(adjuntos, numSolicitud);
        } catch (Exception ex) {
            LogPC.printlnError(ex);
            mensajeSeguro = ADFUtils.getString(MENSAJE_ERROR_SOLICITUD);
            LogPC.printlnError(this, ex);
            ADFUtils.showErrorMessage(mensajeSeguro);
        }
        file = "";
        actualizarTabla();
        check = false;
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
        OperationBinding operationBinding = bindings.getOperationBinding("actualizarTabla");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String getMensajeSeguro() {
        return mensajeSeguro;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        LogPC.println(this, "Serializando BBSeguro: " + this);
    }

    private void readObject(ObjectInputStream in) throws IOException {
        try {
            in.defaultReadObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        LogPC.println(this, "DeSerializando BBSeguro:" + this);
    }

    @Override
    public String toString() {
        return "BBseguro[check = " + check + ", MensajeSeguro = " + mensajeSeguro + "]";
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public boolean isCheck() {
        return check;
    }

    public void seleccionTipoSeguro(ValueChangeEvent valueChangeEvent) {
        try {
            if (((Boolean)this.sbrRobo.getValue()).booleanValue()) {
                this.documentoAdjunto.setLabel("Acta de robo: ");
                this.nombreDocumento = "Acta de robo";
                this.documentoAdjunto.setVisible(true);
                this.documentoAdjunto.setRequired(true);
            } else if (((Boolean)this.sbrSiniestro.getValue()).booleanValue()) {
                this.documentoAdjunto.setLabel("Carta de hechos: ");
                this.nombreDocumento = "Carta de hechos";
                this.documentoAdjunto.setVisible(true);
                this.documentoAdjunto.setRequired(true);
            } else if (((Boolean)this.sbrDano.getValue()).booleanValue()) {
                this.documentoAdjunto.setLabel("Carta por da\u00F1os: ");
                this.nombreDocumento = "Carta por da\u00F1os";
                this.documentoAdjunto.setVisible(true);
                this.documentoAdjunto.setRequired(true);
            } else if (((Boolean)this.sbrSinArchivo.getValue()).booleanValue()) {
                this.documentoAdjunto.setVisible(false);
                this.documentoAdjunto.setRequired(false);
            }
    
            AdfFacesContext adfctx = AdfFacesContext.getCurrentInstance();
            adfctx.addPartialTarget(documentoAdjunto);
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
                sn.enviarEmailNotificacion("SEGURO_EQUIPO_MXVETV", para, paisISO, parametros, listaAdjuntos);
            } else if (!sesion.getPaisISO().equals("MX")) {
                sn.enviarEmailNotificacion("SEGURO_EQUIPO_CA", para, paisISO, parametros, listaAdjuntos);
            } else {
                sn.enviarEmailNotificacion("SEGURO_EQUIPO_MX", para, paisISO, parametros, listaAdjuntos);
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

    public void setSbrSiniestro(RichSelectBooleanRadio srbSiniestro) {
        this.sbrSiniestro = srbSiniestro;
    }

    public RichSelectBooleanRadio getSbrSiniestro() {
        return sbrSiniestro;
    }

    public void setSbrDano(RichSelectBooleanRadio srbDano) {
        this.sbrDano = srbDano;
    }

    public RichSelectBooleanRadio getSbrDano() {
        return sbrDano;
    }

    public void setRobo(boolean robo) {
        this.robo = robo;
    }

    public boolean isRobo() {
        return robo;
    }

    public void setSiniestro(boolean siniestro) {
        this.siniestro = siniestro;
    }

    public boolean isSiniestro() {
        return siniestro;
    }

    public void setDano(boolean dano) {
        this.dano = dano;
    }

    public boolean isDano() {
        return dano;
    }

    public void setDocumentoAdjunto(RichInputFile documentoAdjunto) {
        this.documentoAdjunto = documentoAdjunto;
    }

    public RichInputFile getDocumentoAdjunto() {
        return documentoAdjunto;
    }

    public void setSbrSinArchivo(RichSelectBooleanRadio sbrSinArchivo) {
        this.sbrSinArchivo = sbrSinArchivo;
    }

    public RichSelectBooleanRadio getSbrSinArchivo() {
        return sbrSinArchivo;
    }

    public void setSinArchivo(boolean sinArchivo) {
        this.sinArchivo = sinArchivo;
    }

    public boolean isSinArchivo() {
        return sinArchivo;
    }

    public void setDocumentoSeguro(UploadedFile documentoSeguro) {
        this.documentoSeguro = documentoSeguro;
    }

    public UploadedFile getDocumentoSeguro() {
        return documentoSeguro;
    }

    public void fileUpdate(ValueChangeEvent valueChangeEvent) {
        LogPC.println(this, "Procesando Documento ...");
        RichInputFile inputFileComponent = (RichInputFile)valueChangeEvent.getComponent();
        UploadedFile newFile = (UploadedFile)valueChangeEvent.getNewValue();
        if (newFile.getFilename().endsWith("png")) {
            FacesContext.getCurrentInstance().addMessage(inputFileComponent.getClientId(FacesContext.getCurrentInstance()),
                                                         new FacesMessage(FacesMessage.SEVERITY_INFO, "Archivos PNG no soportados",
                                                                          "El archivo: " + newFile.getFilename() +
                                                                          " no esta permitido; la extensión png no esta soportada"));
            inputFileComponent.resetValue();
            inputFileComponent.setValid(false);
        }      
    }

    public void setPopupMensajeSeguro(RichPopup popupMensajeSeguro) {
        this.popupMensajeSeguro = popupMensajeSeguro;
    }

    public RichPopup getPopupMensajeSeguro() {
        return popupMensajeSeguro;
    }
}