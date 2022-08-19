package mx.com.sky.sel.managedbeans.login;

import java.io.IOException;
import java.io.Serializable;

import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import javax.security.auth.Subject;
import javax.security.auth.login.FailedLoginException;
import javax.security.auth.login.LoginException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.sky.sel.dto.AutenticarUsuarioResponseDTO;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.utils.AgentUtil;
import mx.com.sky.sel.utils.Constantes;
import mx.com.sky.sel.utils.EncriptadoTexto;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.RememberMe;
import mx.com.sky.sel.utils.UtileriasMB;

import oracle.adf.view.rich.component.rich.nav.RichCommandButton;
import oracle.adf.view.rich.render.ClientEvent;

import weblogic.security.URLCallbackHandler;
import weblogic.security.services.Authentication;

/**
 * Bean asociado a la pagina login.jsf
 */

public class LoginMB extends UtileriasMB implements Serializable{
    @SuppressWarnings("compatibility:4506003884974187886")
    private static final long serialVersionUID = 4931094186057724381L;
    private String _username;
    private String _password;
    
    private String mensaje;
    //BTG/VEO
    private boolean infoVEO = false;
    private boolean infoBTG = false;
    //RememberMe
    private boolean _rememberme = false;
    private String cookies[] = { "SKY_SEL_VAL", "U0tZX1NFTF9US04" };

        public LoginMB() {
            super();
        }
        
    public void setUsername(String _username) {
        //eliminacion de " "
        this._username = _username.replaceAll("\\s+","");
        
    }

    public String getUsername() {
        return _username;
    }

    public void setPassword(String _password) {
        //eliminacion de " "
        this._password = _password.replaceAll("\\s+","");
    }

    public String getPassword() {
        return _password;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
    //RememberMe

    public void setRememberme(boolean _rememberme) {
        this._rememberme = _rememberme;
    }

    public boolean getRememberme() {
        return _rememberme;
    }

    /**
     * Acci&oacute;n para realizar el inicio de sesi&oacute;n y pedir autorizaci&oacute;n
     * mediante ADF Security.
     * @return
     */
    public String performLogin() {
        String un = _username.toLowerCase();
        byte[] pw = _password.getBytes();
        FacesContext ctx = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest)ctx.getExternalContext().getRequest();
        String loginUrl = "";
        try {
            URLCallbackHandler urlCallback = new URLCallbackHandler(un, pw);
            Subject subject = Authentication.login(urlCallback);
            weblogic.servlet.security.ServletAuthentication.runAs(subject, request);
            loginUrl = null;
            
            HttpServletResponse response = (HttpServletResponse)ctx.getExternalContext().getResponse();
            
            
            //Encriptar password
            String passEncriptado = EncriptadoTexto.procesarTexto(_password);
            String productoUsuario = null;
            String nombreUsuario = null;
            String aPaternoUsuario = null;
            String aMaternoUsuario = null;
            AutenticarUsuarioResponseDTO autenticarUsuarioInfo = this.obtenerInfoAutenticacion(un, passEncriptado);
            if( autenticarUsuarioInfo.getDescripcionError() != null && !autenticarUsuarioInfo.getDescripcionError().isEmpty() ) {
                throw new FailedLoginException(autenticarUsuarioInfo.getDescripcionError());
            } else {
                productoUsuario = autenticarUsuarioInfo.getProducto();
                nombreUsuario = autenticarUsuarioInfo.getNombre();
                aPaternoUsuario = autenticarUsuarioInfo.getApellidoPaterno();
                aMaternoUsuario = autenticarUsuarioInfo.getApedilloMaterno();
            }
            
            LogPC.println(this, "El usuario tiene contratado el producto: " + productoUsuario);
            
            if( productoUsuario == null || !productoUsuario.equalsIgnoreCase(Constantes.PRODUCTO_USUARIO_SKY) ) {
                LogPC.println(this, "El usuario no tiene contratado un producto de TV (SKY), no se permite el inicio de sesion en la aplicacion");
                throw new FailedLoginException("Esta cuenta no tiene contratado un producto de TV, no se puede iniciar session");
            }
            
            LogPC.println(this, "Guardando el nombre y apellidos del usuario en la sesion...");
            Map sessionState = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
            sessionState.put("nombreUsuario", nombreUsuario);
            sessionState.put("aPaternoUsuario", aPaternoUsuario);
            sessionState.put("aMaternoUsuario", aMaternoUsuario);
            

            //RememberMe
            if (this._rememberme) {
                LogPC.println(this,"Guarda cookie");
                RememberMe.remember(response, cookies[1], this._username + "|" + this._password + "|" + this._rememberme, 60 * 60 * 24 * 365);
            }
            loginUrl = Constantes.URL_PROMOCIONES;
            sendForward(request, response, loginUrl);
            LogPC.println(this, "direccionando a " + loginUrl);
        } catch (FailedLoginException fle) {
            _username = null;
            _password = null;
            _rememberme = false;
            LogPC.println(this, "FailedLoginException " + fle.getMessage());
            /*ADFUtils.showErrorMessage("Se especific\u00F3 un correo y/o contraseña incorrecta");
            mensaje = "Se especific\u00F3 un correo y/o contraseña incorrecta";
            ADFUtils.putValue("bindings.mensaje1.inputValue", "Se especific\u00F3 un correo y/o contraseña incorrecta");
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Correo y/o contraseña incorrecta", "Se especific\u00F3 un correo y/o contraseña incorrecta");
            ctx.addMessage(null, msg);*/
            JSFUtils.addFacesErrorMessage(getMensajeProperties("msj_error_login"));
        } catch (LoginException le) {
            /*ADFUtils.putValue("bindings.mensaje1.inputValue", "Se especific\u00F3 un correo y/o contraseña incorrecta");
            ADFUtils.showErrorMessage("Se especific\u00F3 un correo y/o contraseña incorrecta");
            mensaje = "Se especific\u00F3 un correo y/o contraseña incorrecta";
            reportUnexpectedLoginError("LoginException", le);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Correo y/o contraseña incorrecta", "Se especific\u00F3 un correo y/o contraseña incorrecta......-");
            ctx.addMessage(null, msg);*/
            JSFUtils.addFacesErrorMessage(getMensajeProperties("msj_error_login"));
        } catch (Exception e) {
            e.printStackTrace();
            LogPC.println(this, "Exception" + e.getMessage());
            /*ADFUtils.showErrorMessage("Se especific\u00F3 un correo y/o contraseña incorrecta");
            mensaje = "Se especific\u00F3 un correo y/o contraseña incorrecta";
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Correo y/o contraseña incorrecta", "Se especific\u00F3 un correo y/o contraseña incorrecta...............--");
            ctx.addMessage(null, msg);*/
            JSFUtils.addFacesErrorMessage(getMensajeProperties("mensaje_PantallaError_generico"));
        }
        return null;
    }

    /**
     * Metodo para hacer logout
     * @return
     */
    public String performLogout() {
        FacesContext ctx = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest)ctx.getExternalContext().getRequest();
        HttpServletResponse response = (HttpServletResponse)ctx.getExternalContext().getResponse();
        String logoutUrl = "/adfAuthentication?logout=true&end_url=/faces/bienvenido";
        //RememberMe
        RememberMe.remember(response, cookies[1], "", 0);
        request.getSession().invalidate();
        sendForward(request, response, Constantes.URL_LOGOUT);

        return null;
    }


    /**
     * Funci&oacute;n para realizar el direccionamiento hacia la pagina principal
     * si el inicio de sesi&oacute;n fue satisfactorio.
     * @param request
     * @param response
     * @param forwardUrl
     */
    private void sendForward(HttpServletRequest request, HttpServletResponse response, String forwardUrl) {
        try {
            response.sendRedirect(request.getContextPath() + forwardUrl);
            JSFUtils.getFacesContext().responseComplete();
        } catch (IOException ioe) {
            LogPC.printlnError(this, "Exception: " + ioe.getMessage(), ioe);
            JSFUtils.addFacesErrorMessage(getMensajeProperties("msj_error_inesperado_login"), getMensajeProperties("msj_error_max_intentos_login"));
        }
    }

    /**
     * Funci&oacute;n para reportar excepciones inesperadas durante el inicio de sesi&oacute;n.
     * @param errType
     * @param e
     */
    private void reportUnexpectedLoginError(String errType, Exception e) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Error inesperado durante el inicio de sesi\u00F3n", "Su usuario ha sido bloqueado por m\u00E1ximo n\u00FAmero de intentos, por favor intente nuevamente en 30 minutos");
        FacesContext.getCurrentInstance().addMessage(null, msg);
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
        if (agent != null && agent.equalsIgnoreCase("smartphone")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isRenderiPad() {
        FacesContext fc = FacesContext.getCurrentInstance();
        HttpServletRequest req = (HttpServletRequest)fc.getExternalContext().getRequest();
        String agent = req.getHeader("User-Agent");
        if (agent != null && agent.equalsIgnoreCase("iPad")) {
            return true;
        }
        return false;
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


    //RememberMe

    public void launchLogin(ClientEvent clientEvent) {
        try {
            FacesContext ctx = FacesContext.getCurrentInstance();
            HttpServletRequest request = (HttpServletRequest)ctx.getExternalContext().getRequest();
            Cookie rememberMe = RememberMe.leerCookie(request, cookies[1]);
            if (!rememberMe.getName().equals("NotFound")) {
                String[] params = RememberMe.leerDatos(rememberMe);
                this._username = params[0];
                this._password = params[1];
                this._rememberme = params[2].equalsIgnoreCase("TRUE") ? true : false;
                performLogin();
                encolarAccion("cbIniciaPC"); //BTN Que laza la accion de login
            } else {
            }
        } catch (Exception e) {
            ;
        }
    }

    //RememberMe

    public void encolarAccion(String idCommandButton) {
        try {
            FacesContext fctx = FacesContext.getCurrentInstance();
            UIViewRoot root = fctx.getViewRoot();
            RichCommandButton button = (RichCommandButton)root.findComponent(idCommandButton);
            ActionEvent actionEvent = new ActionEvent(button);
            actionEvent.queue();
        } catch (Exception e) {
            ;
        }
    }

    public void actionListenerBTG(ActionEvent actionEvent) {
        // Add event code here...
        LogPC.println(this, "actionListenerBTG");
        if (isInfoBTG())
            setInfoBTG(false);
        else
            setInfoBTG(true);
        LogPC.println(this, "BTG: " + this.infoBTG);
    }

    public void setInfoVEO(boolean infoVEO) {
        this.infoVEO = infoVEO;
    }

    public boolean isInfoVEO() {
        return infoVEO;
    }

    public void setInfoBTG(boolean infoBTG) {
        this.infoBTG = infoBTG;
    }

    public boolean isInfoBTG() {
        return infoBTG;
    }

    public void actionListenerVEO(ActionEvent actionEvent) {
        // Add event code here...
        LogPC.println(this, "actionListenerVEO  ");
        if (isInfoVEO())
            setInfoVEO(false);
        else
            setInfoVEO(true);
        LogPC.println(this, "VEO: " + this.infoVEO);
    }
    }