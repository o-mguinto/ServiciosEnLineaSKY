package mx.com.sky.sel.managedbeans.aclaracionescargos;

import java.io.Serializable;

import java.util.ArrayList;

import mx.com.sky.sel.log.LogPC;

import mx.com.sky.sel.utils.ADFUtils;

import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.input.RichInputFile;

import oracle.adf.view.rich.component.rich.input.RichSelectBooleanCheckbox;

import org.apache.myfaces.trinidad.model.UploadedFile;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.managedbeans.sesion.SesionMB;
import mx.com.sky.sel.services.beans.notificacionesemail.ParametroEmail;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.beans.utils.ArchivoAdjunto;
import mx.com.sky.sel.services.beans.utils.Suscriptor;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.notificacionesemail.ServicioNotificaciones;
import mx.com.sky.sel.services.solicitudservicio.IServicio;
import mx.com.sky.sel.services.solicitudservicio.ServicioCargosTDC;
import mx.com.sky.sel.services.utils.Files;
import mx.com.sky.sel.services.utils.SolicitudServicioUtils;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.Parametros;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import mx.com.sky.sel.services.utils.AdjuntadorArchivos;
import mx.com.sky.sel.utils.UtileriasMB;


public class BBCargosTDC extends UtileriasMB implements Serializable {
    @SuppressWarnings("compatibility:4305603493812344657")
    private static final long serialVersionUID = -845845209274444261L;

    private transient UploadedFile estadoCuenta;

    private transient RichInputFile file;
    private Boolean check; //Permite Habilitar o eshabilitar el boton de Enviar Solicitud
    private transient RichSelectBooleanCheckbox checkComponent;

    private transient DCIteratorBinding DCSolicitud_; //Permite tener una referencia al DC
    private transient RichPopup popupMensajeSeguro; //Popup que informa el estado de la Compra
    private String MensajeSeguro;

    private static final String MENSAJE_SOLICITUD_ENVIADA = "bbcargos.solicitudenviada";
    private static final String MENSAJE_ERROR_SOLICITUD = "bbcargos.errorsolicitud";

    public BBCargosTDC() {
        LogPC.println(this, "BBCargosTDC Creado");
        DCSolicitud_ = ADFUtils.getIterador("obtenerSolicitudServicioIter");
    }

    /*Metodo invocado cuando se envia el formulario y que sube un archivo al Servidor*/

    public void upload(ValueChangeEvent valueChangeEvent) {
        Parametros par = new Parametros(true);
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        Suscriptor suscriptor = sesion.getSuscriptor();
        String cta = sesion.getCuentaSKY();
        UploadedFile sourceFile = null;
        String targetFile = null;
        sourceFile = (UploadedFile)valueChangeEvent.getNewValue();
        targetFile = par.getUrlCTDC() + cta + "_" + sourceFile.getFilename();
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
        System.out.println("JAM - enviarSolicitud()");
        //Descripcion
        String descripcion = "Cargos no Reconocidos";
        //crear bean de Solicitud de servicio
        SolicitudServicioBean solicitudServicio = new SolicitudServicioBean();
        try {
            //Llenar el BEAN
            solicitudServicio = SolicitudServicioUtils.convert(solicitudServicio, descripcion);
            //instanciar servicio
            IServicio servicioSE = new ServicioCargosTDC();
            LogPC.println(this, "Enviando Solicitud.. " + solicitudServicio);
            //invocar
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CARGOS_NO_RECONOCIDOS);
            String numSolicitud = servicioSE.crearSolicitud(solicitudServicio);
            //si no hubo excepcion entonces OK
            MensajeSeguro = ADFUtils.getString(MENSAJE_SOLICITUD_ENVIADA) + numSolicitud;
            LogPC.println(this, MensajeSeguro);

            //se envia correo electronico con los archivos adjuntos
            //template: CARGOSNORECONOCIDOS
            List<UploadedFile> archivos = new ArrayList<UploadedFile>();
            String[] nombreArchivos = { "Estado de Cuenta" };
            archivos.add(estadoCuenta);

            List<ArchivoAdjunto> adjuntos = AdjuntadorArchivos.adjuntarArchivos(archivos, nombreArchivos);
            enviarDocumentos(adjuntos, numSolicitud);

        } catch (Exception ex) {
            LogPC.printlnError(ex);
            MensajeSeguro = ADFUtils.getString(MENSAJE_ERROR_SOLICITUD);
            LogPC.printlnError(this, "Error en la Solicitud de Reporte");
        }
        DCSolicitud_.invalidateCache(); //Limpiamos la Cache del DC para el refresh
        ADFUtils.showPopup(popupMensajeSeguro);
        return "OK";
    }
    
    /**
     * Invoca el servicio para crear la solicitud de reporte de robo o extravio
     * de equipo a trav\u00E9s del iPad o Tablet.
     * @return
     */
    public String enviarSolicitudTablet() {
        LogPC.println(this, "Iniciar envio de solicitud de reporte de robo Tablet");
        //Descripcion
        String descripcion = "Cargos no Reconocidos";
        //crear bean de Solicitud de servicio
        SolicitudServicioBean solicitudServicio = new SolicitudServicioBean();
        try {
            //Llenar el BEAN
            solicitudServicio = SolicitudServicioUtils.convert(solicitudServicio, "Aclaracion Cargo NO Reconocido a TDC");
            //instanciar servicio
            ServicioCargosTDC servicioSE = new ServicioCargosTDC();
            LogPC.println(this, "Enviando Solicitud.. " + solicitudServicio);
            //invocar
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CARGOS_NO_RECONOCIDOS);
            String numSolicitud = servicioSE.crearSolicitud(solicitudServicio);
            //si no hubo excepcion entonces OK
            MensajeSeguro = ADFUtils.getString(MENSAJE_SOLICITUD_ENVIADA) + numSolicitud;
            LogPC.println(this, MensajeSeguro);

            //se envia correo electronico
            enviarDocumentos(numSolicitud);

        } catch (Exception ex) {
            LogPC.printlnError(ex);
            MensajeSeguro = ADFUtils.getString(MENSAJE_ERROR_SOLICITUD);
            LogPC.printlnError(this, "Error en la Solicitud de Reporte");
        }
        DCSolicitud_.invalidateCache(); //Limpiamos la Cache del DC para el refresh
        ADFUtils.showPopup(popupMensajeSeguro);
        return "OK";
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

    public void setDCSolicitud_(DCIteratorBinding DCSolicitud_) {
        this.DCSolicitud_ = DCSolicitud_;
    }

    public DCIteratorBinding getDCSolicitud_() {
        return DCSolicitud_;
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

    public String aceptarAclaracion() {
        // Add event code here...
        ADFUtils.hidePopup(popupMensajeSeguro);
        return null;
    }
    
    private void enviarDocumentos(List<ArchivoAdjunto> listaAdjuntos, String numSolicitud) {
        ServicioNotificaciones sn = new ServicioNotificaciones();
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String paisISO = sesion.getSuscriptor().getPaisISO();
        String para = sesion.getUsuario().getMail();
        List<ParametroEmail> parametros = getParametrosCorreo(sesion);
        parametros.add(new ParametroEmail("[NUMSS]", numSolicitud));
        String cuenta = sesion.getSuscriptor().getCuentaSKY();
        parametros.add(new ParametroEmail("[CUENTA]", cuenta));
        try {
            if (sesion.isUserVeTV()) {
                sn.enviarEmailNotificacion("CARGOSNORECONOCIDOS_MXVETV", para, paisISO, parametros, listaAdjuntos);
            } else if (!sesion.getPaisISO().equals("MX")) {
                sn.enviarEmailNotificacion("CARGOSNORECONOCIDOS_CA", para, paisISO, parametros, listaAdjuntos);
            } else {
                sn.enviarEmailNotificacion("CARGOSNORECONOCIDOS_MX", para, paisISO, parametros, listaAdjuntos);
            }
        } catch (ServicioException e) {
            ADFUtils.showErrorMessage(e.getMessage());
        }
    }
    
    private void enviarDocumentos(String numSolicitud) {
        ServicioNotificaciones sn = new ServicioNotificaciones();
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String paisISO = sesion.getSuscriptor().getPaisISO();
        String para = sesion.getUsuario().getMail();
        List<ParametroEmail> parametros = getParametrosCorreo(sesion);
        parametros.add(new ParametroEmail("[NUMSS]", numSolicitud));
        String cuenta = sesion.getSuscriptor().getCuentaSKY();
        parametros.add(new ParametroEmail("[CUENTA]", cuenta));
        try {
            if (sesion.isUserVeTV()) {
                sn.enviarEmailNotificacion("CARGOSNORECONOCIDOS_MXVETV", para, paisISO, parametros, null);
            } else if (!sesion.getPaisISO().equals("MX")) {
                sn.enviarEmailNotificacion("CARGOSNORECONOCIDOS_CA", para, paisISO, parametros, null);
            } else {
                sn.enviarEmailNotificacion("CARGOSNORECONOCIDOS_MX", para, paisISO, parametros, null);
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

    public void setEstadoCuenta(UploadedFile estadoCuenta) {
        System.out.println("JAM - setEstadoCuenta: " + estadoCuenta);
        this.estadoCuenta = estadoCuenta;
    }

    public UploadedFile getEstadoCuenta() {
        System.out.println("JAM - getEstadoCuenta: " + estadoCuenta);
        return estadoCuenta;
    }

    public void fileUpdate(ValueChangeEvent valueChangeEvent) {
        
        LogPC.println(this, "Entrando a fileUpload");
        System.out.println("JAM -----> subiendo archivo...");
        RichInputFile inputFileComponent = (RichInputFile)valueChangeEvent.getComponent();
        UploadedFile newFile = (UploadedFile)valueChangeEvent.getNewValue();
        System.out.println("JAM fileName to upload: " + newFile.getFilename());
        if (newFile.getFilename().endsWith("png")) {
            FacesContext.getCurrentInstance().addMessage(inputFileComponent.getClientId(FacesContext.getCurrentInstance()),
                                                         new FacesMessage(FacesMessage.SEVERITY_INFO, "Archivos PNG no soportados",
                                                                          "El archivo: " + newFile.getFilename() +
                                                                          " no esta permitido; la extensi\u00F3n png no esta soportada"));
            inputFileComponent.resetValue();
            inputFileComponent.setValid(false);
        }
        
        LogPC.println(this, "Terminando File Upload");
    }
}
