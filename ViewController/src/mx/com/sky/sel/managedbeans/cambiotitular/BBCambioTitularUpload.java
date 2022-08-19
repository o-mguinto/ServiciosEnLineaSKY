package mx.com.sky.sel.managedbeans.cambiotitular;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.managedbeans.sesion.SesionMB;
import mx.com.sky.sel.services.beans.cambiotitular.DatosCS;
import mx.com.sky.sel.services.beans.notificacionesemail.ParametroEmail;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.beans.utils.ArchivoAdjunto;
import mx.com.sky.sel.services.cambiotitular.ServicioCambioTitular;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.notificacionesemail.ServicioNotificaciones;
import mx.com.sky.sel.services.utils.SolicitudServicioUtils;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import org.apache.myfaces.trinidad.model.UploadedFile;

import sun.misc.BASE64Encoder;

public class BBCambioTitularUpload implements Serializable {
    @SuppressWarnings("compatibility:-1875158093644079133")
    private static final long serialVersionUID = 8388247529380966290L;
    private transient UploadedFile cartaResponsiva;
    private transient UploadedFile identificacionCedente;
    private transient UploadedFile identificacionCesionario;
    private transient UploadedFile comprobanteDomicilio;
    private transient UploadedFile poderNotarial;
    private List<ArchivoAdjunto> listaAdjuntos = null;
    private String solicitudServicio = null;


    public BBCambioTitularUpload() {
        super();
    }

    public String cbEnviarDocumentos_action() {
        InputStream isArchivo = null;
        ArchivoAdjunto archivoAd = null;
        String extensionArchivo = "";
        BASE64Encoder base64 = new BASE64Encoder();
        String base64String = "";
        LogPC.println(this, "cbEnviarDocumentos_action");
        byte[] fileBase64 = null;
        try {
            listaAdjuntos = new ArrayList<ArchivoAdjunto>();
            if (cartaResponsiva != null && cartaResponsiva.getInputStream() != null) {
                LogPC.println(this, "cartaResponsiva cargado exitosamente: " + cartaResponsiva);
                isArchivo = cartaResponsiva.getInputStream();
                fileBase64 = getBytes(isArchivo);
                base64String = base64.encode(fileBase64);
                archivoAd = new ArchivoAdjunto();
                extensionArchivo = getExtensionArchivo(cartaResponsiva.getFilename());
                archivoAd.setExtension(extensionArchivo);
                LogPC.println(this, cartaResponsiva.getContentType());
                archivoAd.setFileBase64(base64String);
                archivoAd.setFileName("Carta_CesionDerechos");
                listaAdjuntos.add(archivoAd);

            }
            if (identificacionCedente != null && identificacionCedente.getInputStream() != null) {
                LogPC.println(this, "identificacionCedente cargado exitosamente: " + identificacionCedente);
                isArchivo = identificacionCedente.getInputStream();
                fileBase64 = getBytes(isArchivo);
                base64String = base64.encode(fileBase64);
                archivoAd = new ArchivoAdjunto();
                extensionArchivo = getExtensionArchivo(identificacionCedente.getFilename());
                archivoAd.setExtension(extensionArchivo);
                LogPC.println(this, identificacionCedente.getContentType());
                archivoAd.setFileBase64(base64String);
                archivoAd.setFileName("Identificacion_Cedente");
                listaAdjuntos.add(archivoAd);

            }
            if (identificacionCesionario != null && identificacionCesionario.getInputStream() != null) {
                LogPC.println(this, "identificacionCesionario cargado exitosamente: " + identificacionCesionario);
                isArchivo = identificacionCesionario.getInputStream();
                fileBase64 = getBytes(isArchivo);
                base64String = base64.encode(fileBase64);
                archivoAd = new ArchivoAdjunto();
                extensionArchivo = getExtensionArchivo(identificacionCesionario.getFilename());
                archivoAd.setExtension(extensionArchivo);
                LogPC.println(this, identificacionCesionario.getContentType());
                archivoAd.setFileBase64(base64String);
                archivoAd.setFileName("Identificacion_Cesionario");
                listaAdjuntos.add(archivoAd);

            }
            if (comprobanteDomicilio != null && comprobanteDomicilio.getInputStream() != null) {
                LogPC.println(this, "comprobanteDomicilio cargado exitosamente: " + comprobanteDomicilio);
                isArchivo = comprobanteDomicilio.getInputStream();
                fileBase64 = getBytes(isArchivo);
                base64String = base64.encode(fileBase64);
                archivoAd = new ArchivoAdjunto();
                extensionArchivo = getExtensionArchivo(comprobanteDomicilio.getFilename());
                archivoAd.setExtension(extensionArchivo);
                LogPC.println(this, comprobanteDomicilio.getContentType());
                archivoAd.setFileBase64(base64String);
                archivoAd.setFileName("ComprobanteDomicilio");
                listaAdjuntos.add(archivoAd);

            }

            if (poderNotarial != null && poderNotarial.getInputStream() != null) {
                LogPC.println(this, "poderNotarial cargado exitosamente: " + poderNotarial);
                isArchivo = poderNotarial.getInputStream();

                fileBase64 = getBytes(isArchivo);
                base64String = base64.encode(fileBase64);
                archivoAd = new ArchivoAdjunto();
                extensionArchivo = getExtensionArchivo(poderNotarial.getFilename());
                archivoAd.setExtension(extensionArchivo);
                LogPC.println(this, poderNotarial.getContentType());
                archivoAd.setFileBase64(base64String);
                archivoAd.setFileName("PoderNotarial");
                listaAdjuntos.add(archivoAd);
            }

            LogPC.println(this, "GENERAR SS");
            LogPC.println(this, "numero de documentos cargados: " + listaAdjuntos.size());
            generarSS();
            enviarDocumentos();
        } catch (IOException e) {
            LogPC.printlnError(e);
            ADFUtils.showErrorMessage("Ocurrio algo inesperado al procesar los documentos, por favor intene mas tarde");
        } catch (Exception e) {
            LogPC.printlnError(e);
            ADFUtils.showErrorMessage("Ocurrio algo inesperado al procesar los documentos, por favor intene mas tarde");
        }
        return "closeTaskFlow";
    }

    private void enviarDocumentos() {
        ServicioNotificaciones sn = new ServicioNotificaciones();
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String paisISO = sesion.getSuscriptor().getPaisISO();
        //String para = sesion.getUsuario().getMail() + ";DocsMesaMx@sky.com.mx";
        String para = sesion.getUsuario().getMail();
        List<ParametroEmail> parametros = getParametrosCAMBIOTITULAR(sesion);
        try {
            if (sesion.isUserVeTV()) {
                sn.enviarEmailNotificacion("CAMBIOTITULAR_MXVETV", para, paisISO, parametros, listaAdjuntos);
            }else {
                sn.enviarEmailNotificacion("CAMBIOTITULAR", para, paisISO, parametros, listaAdjuntos);
            }
        } catch (ServicioException e) {
            ADFUtils.showErrorMessage(e.getMessage());
        }
    }

    public byte[] getBytes(InputStream is) throws IOException {

        int len;
        int size = 1024;
        byte[] buf;

        if (is instanceof ByteArrayInputStream) {
            size = is.available();
            buf = new byte[size];
            len = is.read(buf, 0, size);
        } else {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            buf = new byte[size];
            while ((len = is.read(buf, 0, size)) != -1) {
                bos.write(buf, 0, len);
            }
            buf = bos.toByteArray();
        }
        return buf;
    }


    private List<ParametroEmail> getParametrosCAMBIOTITULAR(SesionMB sesion) {
        List<ParametroEmail> parametros = new ArrayList<ParametroEmail>();
        ServicioCambioTitular sct = new ServicioCambioTitular();
        DatosCS dcs = new DatosCS();

        dcs = sct.obtenerDatosCS(sesion.getSuscriptor().getCuentaSKY());
        String NOMBRE_SUSCRIPTOR = sesion.getSuscriptor().getNombreSuscriptor();
        String NUM_SS_SIEBEL = solicitudServicio;
        String CUENTA = sesion.getSuscriptor().getCuentaSKY();
        String FECHA_SS = getDate();
        String FECHA_ACTIVACION = getDate(dcs.getActivacion());
        String FORMA_PAGO = dcs.getFormaDePago();
        String PAQUETE = sesion.getSuscriptor().getPaquete();
        String UBICADO = dcs.getState();


        parametros.add(new ParametroEmail("[NOMBRE_SUSCRIPTOR]", NOMBRE_SUSCRIPTOR));
        parametros.add(new ParametroEmail("[NUM_SS_SIEBEL]", NUM_SS_SIEBEL));
        parametros.add(new ParametroEmail("[CUENTA]", CUENTA));
        parametros.add(new ParametroEmail("[FECHA_SS]", FECHA_SS));
        parametros.add(new ParametroEmail("[FECHA_ACTIVACION]", FECHA_ACTIVACION));
        parametros.add(new ParametroEmail("[FORMA_PAGO]", FORMA_PAGO));
        parametros.add(new ParametroEmail("[PAQUETE]", PAQUETE));
        parametros.add(new ParametroEmail("[UBICADO]", UBICADO));


        return parametros;
    }

    private String getExtensionArchivo(String nombreArchivo) {
        int lengthNombre = nombreArchivo.length();
        String extension = nombreArchivo.substring(lengthNombre - 3, lengthNombre);
        return extension;
    }


    public void setCartaResponsiva(UploadedFile cartaResponsiva) {
        this.cartaResponsiva = cartaResponsiva;
    }

    public UploadedFile getCartaResponsiva() {
        return cartaResponsiva;
    }

    public void setIdentificacionCedente(UploadedFile identificacionCedente) {
        this.identificacionCedente = identificacionCedente;
    }

    public UploadedFile getIdentificacionCedente() {
        return identificacionCedente;
    }

    public void setIdentificacionCesionario(UploadedFile identificacionCesionario) {
        this.identificacionCesionario = identificacionCesionario;
    }

    public UploadedFile getIdentificacionCesionario() {
        return identificacionCesionario;
    }

    public void setComprobanteDomicilio(UploadedFile comprobanteDomicilio) {
        this.comprobanteDomicilio = comprobanteDomicilio;
    }

    public UploadedFile getComprobanteDomicilio() {
        return comprobanteDomicilio;
    }

    public void setPoderNotarial(UploadedFile poderNotarial) {
        this.poderNotarial = poderNotarial;
    }

    public UploadedFile getPoderNotarial() {
        return poderNotarial;
    }

    private String generarSS() {
        SolicitudServicioBean ssb;
        ServicioCambioTitular sct;
        ssb = new SolicitudServicioBean();
        sct = new ServicioCambioTitular();

        try {
            ssb = SolicitudServicioUtils.convert(ssb, "Cambio de Titular");
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CAMBIO_TITULAR);
            setSolicitudServicio(sct.crearSolicitud(ssb));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return getSolicitudServicio();
    }

    public void setSolicitudServicio(String solicitudServicio) {
        this.solicitudServicio = solicitudServicio;
    }

    public String getSolicitudServicio() {
        return solicitudServicio;
    }

    public String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date1 = new Date();
        return dateFormat.format(date1);
    }

    public String getDate(String fecha) {
        //DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        fecha = fecha.substring(0, fecha.indexOf("T"));
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date fechaA = null;
        try {
            fechaA = dateFormat.parse(fecha);
            dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        } catch (ParseException e) {
            LogPC.printlnWarn(this, "Excepci\u00F3n al convertir a Fecha " + e);
        }
        return dateFormat.format(fechaA);
    }
}
