package mx.com.sky.sel.managedbeans.multicanal;

import java.io.Serializable;
import javax.annotation.PostConstruct;

import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.services.multicanal.chat.ServicioChat;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.proxyclients.rnsoa.generaurlchat.types.GeneraChatRNOutputABM;

import oracle.adf.view.rich.render.ClientEvent;

public class BBContacto implements Serializable {
    @SuppressWarnings("compatibility:4294916921356029263")
    private static final long serialVersionUID = 8464087165703227379L;
    
    private String urlChat;
    private String urlAsk;
    private String urlAnswer;
    private String urlMail;
    
    public BBContacto() {
        super();
    }
    @PostConstruct
    private void init() {
        ServicioChat servicioChat = new ServicioChat();
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        GeneraChatRNOutputABM output = null;
        
        
        if (sesion.isCONTACTO_CHAT()) {
            // Invocacion para obtener la liga del Chat
            output = servicioChat.consultaURLChat(sesion.getUsuario().getCuentaSKY(), sesion.getUsuario().getMail(), "CHAT");
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_CONTACTO_CHAT);
            if (output != null && output.getCabeceraOutput() != null) {
                if (output.getCabeceraOutput().getCodigo().equals("0")) {
                    urlChat = output.getGeneraChatRNOutput().getURLRN();
                }
            }
        }
        
        if (sesion.isCONTACTO_ASK()) {
            // Invocacion para obtener la liga del Dejanos un recado
            output = servicioChat.consultaURLChat(sesion.getUsuario().getCuentaSKY(), sesion.getUsuario().getMail(), "ASK");
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_CONTACTO_DEJAR_DATOS);
            if (output != null && output.getCabeceraOutput() != null) {
                if (output.getCabeceraOutput().getCodigo().equals("0")) {
                    urlAsk = output.getGeneraChatRNOutput().getURLRN();
                }
            }
        }
        
        if (sesion.isCONTACTO_ANSWER()) {
            // Invocacion para obtener la liga de Preguntas Frecuentes
            output = servicioChat.consultaURLChat(sesion.getUsuario().getCuentaSKY(), sesion.getUsuario().getMail(), "PREGUNTAS");
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_CONTACTO_CENTRO_AYUDA);
            if (output != null && output.getCabeceraOutput() != null) {
                if (output.getCabeceraOutput().getCodigo().equals("0")) {
                    urlAnswer = output.getGeneraChatRNOutput().getURLRN();
                }
            }
        }
        
        if (sesion.isCONTACTO_MAIL()) {
            // Invocacion para obtener la liga de Preguntas Frecuentes
            output = servicioChat.consultaURLChat(sesion.getUsuario().getCuentaSKY(), sesion.getUsuario().getMail(), "EMAIL");
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_CONTACTO_EMAIL);
            if (output != null && output.getCabeceraOutput() != null) {
                if (output.getCabeceraOutput().getCodigo().equals("0")) {
                    urlMail = output.getGeneraChatRNOutput().getURLRN();
                }
            }
        }
        
    }

    public void setUrlChat(String urlChat) {
        this.urlChat = urlChat;
    }

    public String getUrlChat() {
        return urlChat;
    }

    public void setUrlAsk(String urlAsk) {
        this.urlAsk = urlAsk;
    }

    public String getUrlAsk() {
        return urlAsk;
    }

    public void setUrlAnswer(String urlAnswer) {
        this.urlAnswer = urlAnswer;
    }

    public String getUrlAnswer() {
        return urlAnswer;
    }

    public void setUrlMail(String urlMail) {
        this.urlMail = urlMail;
    }

    public String getUrlMail() {
        return urlMail;
    }
    public void abrirContactoChat(ClientEvent clientEvent) {
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.ABRIR_CONTACTO_CHAT);
    }
    public void abrirContactoDejarDato(ClientEvent clientEvent) {
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.ABRIR_CONTACTO_DEJAR_DATOS);
    }
    public void abrirContactoCentroAyuda(ClientEvent clientEvent) {
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.ABRIR_CONTACTO_CENTRO_AYUDA);
    }
    public void abrirContactoEmail(ClientEvent clientEvent) {
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.ABRIR_CONTACTO_EMAIL);
    }
}
