package mx.com.sky.sel.managedbeans.recuperarcontrasenia;

import java.io.Serializable;

import java.util.Enumeration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.faces.validator.ValidatorException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.managedbeans.utils.usuario.RegistroLink;
import mx.com.sky.sel.services.utils.usuario.ServicioUsuario;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.AgentUtil;
import mx.com.sky.sel.utils.EncriptadoTexto;

import mx.com.sky.sel.utils.UtileriasMB;

import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.output.RichOutputText;

import org.apache.myfaces.trinidad.component.core.input.CoreInputText;
import javax.faces.event.ActionEvent;

public class BBRecuperaCon extends UtileriasMB implements Serializable {
    @SuppressWarnings("compatibility:-6252683888059577805")
    private static final long serialVersionUID = 6366766621658668676L;
    private String mensaje;
    private String email;
    private String tipoMensaje;
    private String icono;
    private String mensajeUsuario;
    private boolean accionOk;
    private String codigoLink;
    private Boolean mostrarOKRegistro;
    private String contrasena;
    private String confContrasena;
    private transient RichPopup popupReestablecerCon;
    private transient RichPopup popupReestablecerConTablet;
    private transient RichPopup popupReestablecerConMobile;
    private transient RichOutputText mensajeUsuarioError;
    private transient CoreInputText contrasenaMobile;
    private transient CoreInputText confContrasenaMobile;

    public BBRecuperaCon() {
        super();
        mostrarOKRegistro = false;
        icono = "activa.png";
        mensaje = "";
        //aceptaTCMobile = false;
        mensajeUsuarioError = new RichOutputText();
        mensajeUsuarioError.setValue("No se completo el registro, por favor comunicarse a servicios en línea.");
    }

    public String handleRequestMethod() {
        LogPC.println(this, "In handleRequestMethod...");
        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext externalContext = context.getExternalContext();
        HttpServletRequest request = (HttpServletRequest) externalContext.getRequest();
        String cadenaLink = request.getParameter("code");
        LogPC.println(this, "cadena encriptada [" + cadenaLink + "]");
        String[] parametros = EncriptadoTexto.leerTexto(cadenaLink).split(",");
        email = EncriptadoTexto.obtenerParametro(parametros, "email");
        LogPC.println(this, "email recuperado NO encriptado [" + email + "]");
        if (email != null && !email.isEmpty()) {
            try {

                LogPC.println(this, "Terminando reset para el email [" + email + "]");

                mostrarOKRegistro = true;
                accionOk = true;
                FacesContext facesContext = FacesContext.getCurrentInstance();
                HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(false);
                Enumeration e = session.getAttributeNames();
                RegistroLink registroLink = new RegistroLink();
                registroLink.setCadenaLink(cadenaLink);
                session.setAttribute("cadenaLink", cadenaLink);


            } catch (Exception e) {
                LogPC.printlnError(this, e.getMessage(), e);

                mensajeUsuario = "No se completo el registro, por favor comunicarse a servicios en línea.";
                mensajeUsuarioError.setValue(mensajeUsuario);
                icono = "alerta.png";
                accionOk = false;
            }
        } else {
            tipoMensaje = "VACIO";
            icono = "alerta.png";
            mensajeUsuario =
                "El link de recuperación de contraseña es inválido o su email es incorrecto. Valide que el link sea correcto o comunicarse a Servicio a Clientes.";
            mensajeUsuarioError.setValue(mensajeUsuario);
            accionOk = false;
        }

        return "siguiente";
    }

    public String completarReestablecerCon() {
        String response;
        String respuesta = null;
        FacesContext facesContext = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(false);
        FacesContext context = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();

        if(contrasena == null || contrasena.isEmpty()){
            ADFUtils.showErrorMessage("Debe introducir un valor.");
            mensaje = "Debe introducir un valor.";
            return respuesta;
        }
        
        boolean passValido = true;               
        if(contrasena.length() < 8 || contrasena.length() > 20){
            ADFUtils.showErrorMessage("Le recordamos que debe utilizar entre 8 y 20 caracteres.");
            mensaje = "Le recordamos que debe utilizar entre 8 y 20 caracteres.";
            return null;
        }
        if(!contrasena.matches("\\S*[A-Z]+\\S*")){
            ADFUtils.showErrorMessage("Introduzca por lo menos una mayúscula.");
            mensaje = "Introduzca por lo menos una mayúscula.";
            passValido = false;
        }
        if(!contrasena.matches("\\S*[a-z]+\\S*")){   
            ADFUtils.showErrorMessage("Introduzca por lo menos una minúscula.");
            mensaje = "Introduzca por lo menos una minúscula.";
            passValido = false;  
        }       
        if(!contrasena.matches("\\S*\\d+\\S*")){
            ADFUtils.showErrorMessage("Introduzca por lo menos un dígito.");
            mensaje = "Introduzca por lo menos un dígito.";
            passValido = false;
        }                  
        if(!contrasena.matches("\\S*[^(A-Za-z0-9 )]+\\S*")){
            ADFUtils.showErrorMessage("Introduzca por lo menos un caracter especial.");
            mensaje = "Introduzca por lo menos un caracter especial.";
            passValido = false;
        }
        if(!contrasena.matches("[A-Za-z0-9!#%^*()\\-_=+~'\":;?|{}\\[\\],.<>$@]+")){
            ADFUtils.showErrorMessage("La contraseña puede contener letras, números y los símbolos:\n ! # % ^ * ( ) - _ = + ~ ' \" : ; ? | { } [ ] , . < > $ @");
            mensaje = "La contraseña contiene algún caracter inválido.";
            passValido = false;
        }  
        if(passValido){          
            LogPC.println(this, "Contraseña valida");
            if(!contrasena.equals(confContrasena)){
                ADFUtils.showErrorMessage("La contraseña no coincide con su confirmación");
                mensaje = "La contraseña no coincide con su confirmación";
                return null;
            }
            String cadenaLink = session.getAttribute("cadenaLink").toString();
            String[] parametros = EncriptadoTexto.leerTexto(cadenaLink).split(",");
            email = EncriptadoTexto.obtenerParametro(parametros, "Email");
            ServicioUsuario su = new ServicioUsuario();
            try {
                response = su.terminarRecuperarCon(email, EncriptadoTexto.procesarTexto(contrasena));
                if(response != null && response.equalsIgnoreCase("OK")) {
                    respuesta = "OK";
                }else{
                    LogPC.printlnError(this, "Ocurrió algo inesperado" + response);
                    ADFUtils.showErrorMessage(response);
                    mensaje = "Ocurrió algo inesperado, por favor intenta nuevamente más tarde";
                    respuesta = null;
                }
            } catch (Exception e) {
                respuesta = null;
                LogPC.printlnError(this, e.getMessage(), e);
                ADFUtils.showErrorMessage(getMensajeProperties("mensaje_PantallaError_generico"));
                
            }
        }
        
        return respuesta;
    }

    public String completarReestablecerConMobile() {
        String response;
        String respuesta = null;
        FacesContext facesContext = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(false);
        
        FacesContext context = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();

        if(contrasena == null || contrasena.isEmpty()){
            ADFUtils.showErrorMessage("Debe introducir un valor.");
            mensaje = "Debe introducir un valor.";
            
            return "";
        }
            try {
                         ServicioUsuario su = new ServicioUsuario();
            String password = contrasena;
           
            int validatorMessage = 0;
                
        
                
                         if(password!=null && !password.isEmpty() && password.length()>= 8){
                             Pattern pattern =  Pattern.compile("\\S*[A-Z]+\\S*");
                             Matcher  matcher = pattern.matcher(password);
                             if(!matcher.matches()){
                                 ADFUtils.showErrorMessage("Introduzca por lo menos una mayúscula.");
                                                     mensaje = "Introduzca por lo menos una mayúscula.";
                                 validatorMessage=1;
                             }
                                 pattern =  Pattern.compile("\\S*[a-z]+\\S*");
                                 matcher = pattern.matcher(password);
                                 if(!matcher.matches()){   
                                     
                                     ADFUtils.showErrorMessage("Introduzca por lo menos una minúscula.");
                                                         mensaje = "Introduzca por lo menos una minúscula.";
                                     validatorMessage=1;
                                 }
                                     pattern =  Pattern.compile("\\S*\\d+\\S*");
                                     matcher = pattern.matcher(password);
                                     if(!matcher.matches()){
                                         
                                         ADFUtils.showErrorMessage("Introduzca por lo menos un dígito.");
                                                             mensaje = "Introduzca por lo menos un dígito.";
                                         validatorMessage=1;
                                     }
                                         if(password.contains("&")){
                                             ADFUtils.showErrorMessage("La contrase\u00F1a no debe de tener el caracter ampersand: \u0026.");
                                                                 mensaje = "La contrase\u00F1a no debe de tener el caracter ampersand: \u0026.";
                                             validatorMessage=1;
                                             
                                         }      
                             
                                             pattern =  Pattern.compile("\\S*[^(A-Za-z0-9 )]+\\S*");
                                             matcher = pattern.matcher(password);
                                             if(!matcher.matches()){
                                             
                                                     ADFUtils.showErrorMessage("Introduzca por lo menos un caracter especial.");
                                                                         mensaje = "Introduzca por lo menos un caracter especial.";
                                                 validatorMessage=1;
                                                
                                                 }  
                                             
                                             
                                             
                                             if   (validatorMessage !=1){            
                                                 LogPC.println(this, "Contraseña valida");
                                                 if (contrasenaMobile.getValue()
                                                                     .toString()
                                                                     .equalsIgnoreCase(confContrasenaMobile.getValue().toString())) {
                                                     String cadenaLink = session.getAttribute("cadenaLink").toString();
                                                     String[] parametros = EncriptadoTexto.leerTexto(cadenaLink).split(",");
                                                     email = EncriptadoTexto.obtenerParametro(parametros, "Email");
                                                     response =
                                                         su.terminarRecuperarCon(email,
                                                                                 EncriptadoTexto.procesarTexto(contrasenaMobile.getValue().toString()));
                                                     if (response == null) {
                                                         LogPC.printlnError(this, "No se completo el registro, por favor comunicarse a servicios en línea.");
                                                         ADFUtils.showErrorMessage("No se completo el registro, por favor comunicarse a servicios en línea.");
                                                         mensaje = "No se completo el registro, por favor comunicarse a servicios en línea.";
                                                     } else if (response.equalsIgnoreCase("OK")) { //&& EncriptadoTexto.obtenerParametro(parametros, "TipoCuenta").contains("N")) {
                                                         ADFUtils.showPopup(popupReestablecerConMobile);
                                                         respuesta = "OK";

                                                     } /*else if (response.equalsIgnoreCase("OK") && !EncriptadoTexto.obtenerParametro(parametros, "TipoCuenta").contains("N")) {
                                                         if (isRenderADFPC()) {
                                                             respuesta = "pc_corporativo";
                                                         } else if (isRenderTablet()) {
                                                             respuesta = "tablet_corporativo";
                                                         } else {
                                                             respuesta = "mobile_corporativo";
                                                         }
                                                     } */ else {
                                                         ADFUtils.showErrorMessage(response);
                                                         respuesta = null;
                                                     }
                                                 } else {
                                                     //ADFUtils.showErrorMessage(mensaje);
                                                     FacesMessage msg =
                                                         new FacesMessage(FacesMessage.SEVERITY_INFO, null, "La contraseña no coincide con su confirmación");
                                                     FacesContext.getCurrentInstance().addMessage(null, msg);
                                                     mensaje = "La contraseña no coincide con su confirmación";
                                                     respuesta = null;
                                                 }
                                             }
          
                                         
                         } else {
                             
                                       //ADFUtils.showErrorMessage(mensaje);
                                       FacesMessage msg =
                                           new FacesMessage(FacesMessage.SEVERITY_INFO, null,
                                                            "Le recordamos que debe utilizar entre 8 y 20 caracteres.");
                                       FacesContext.getCurrentInstance().addMessage(null, msg);
                                       mensaje = "Le recordamos que debe utilizar entre 8 y 20 caracteres.";
                                       respuesta = null;
                                   }
                
            
        } catch (Exception e) {
            respuesta = null;
            LogPC.printlnError(this, e.getMessage(), e);
            ADFUtils.showErrorMessage(getMensajeProperties("mensaje_PantallaError_generico"));
        }
        return respuesta;
    }

    public boolean isRenderADFPC() {
        AgentUtil agentUtil = new AgentUtil();
        String agent = agentUtil.getPhoneFamily();
        if (agent.equalsIgnoreCase("smartphone")) {
            return false;
        } else if (agent.equalsIgnoreCase("tablet")) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isRenderADFSmartPhone() {
        AgentUtil agentUtil = new AgentUtil();
        String agent = agentUtil.getPhoneFamily();
        System.out.println("isRenderADFSmartPhone: " + agent);
        if (agent != null && agent.equalsIgnoreCase("smartphone")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isRenderTablet() {
        AgentUtil agentUtil = new AgentUtil();
        String agent = agentUtil.getPhoneFamily();
        if (agent.equalsIgnoreCase("tablet")) {
            return true;
        } else {
            return false;
        }
    }


    public void setMensajeUsuario(String mensajeUsuario) {
        this.mensajeUsuario = mensajeUsuario;
    }

    public String getMensajeUsuario() {
        return mensajeUsuario;
    }

    public void setCodigoLink(String codigoLink) {
        this.codigoLink = codigoLink;
    }

    public String getCodigoLink() {
        return codigoLink;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setConfContrasena(String confContrasena) {
        this.confContrasena = confContrasena;
    }

    public String getConfContrasena() {
        return confContrasena;
    }

    public void setPopupReestablecerCon(RichPopup popupReestablecerCon) {
        this.popupReestablecerCon = popupReestablecerCon;
    }

    public RichPopup getPopupReestablecerCon() {
        return popupReestablecerCon;
    }

    public void setAccionOk(boolean accionOk) {
        this.accionOk = accionOk;
    }

    public boolean isAccionOk() {
        return accionOk;
    }

    public void setMensajeUsuarioError(RichOutputText mensajeUsuarioError) {
        this.mensajeUsuarioError = mensajeUsuarioError;
    }

    public RichOutputText getMensajeUsuarioError() {
        return mensajeUsuarioError;
    }

    public void setPopupReestablecerConTablet(RichPopup popupReestablecerConTablet) {
        this.popupReestablecerConTablet = popupReestablecerConTablet;
    }

    public RichPopup getPopupReestablecerConTablet() {
        return popupReestablecerConTablet;
    }

    public void setContrasenaMobile(CoreInputText contrasenaMobile) {
        this.contrasenaMobile = contrasenaMobile;
    }

    public CoreInputText getContrasenaMobile() {
        return contrasenaMobile;
    }

    public void setConfContrasenaMobile(CoreInputText confContrasenaMobile) {
        this.confContrasenaMobile = confContrasenaMobile;
    }

    public CoreInputText getConfContrasenaMobile() {
        return confContrasenaMobile;
    }

    public void setPopupReestablecerConMobile(RichPopup popupReestablecerConMobile) {
        this.popupReestablecerConMobile = popupReestablecerConMobile;
    }

    public RichPopup getPopupReestablecerConMobile() {
        return popupReestablecerConMobile;
    }

    public String cerrarMobileOk() {
        System.out.println("Cerrar Mobile");
        return "cerrar_mobile_ok";
    }
}
