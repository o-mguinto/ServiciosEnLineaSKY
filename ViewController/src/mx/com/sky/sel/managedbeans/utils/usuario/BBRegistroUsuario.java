package mx.com.sky.sel.managedbeans.utils.usuario;

import java.io.Serializable;

import java.util.Enumeration;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.managedbeans.login.LoginMB;
import mx.com.sky.sel.managedbeans.utils.google.VerifyRecaptcha;
import mx.com.sky.sel.proxyclients.pagwebregistro.registrousuariolink.types.RegistroUsuarioLinkProcessResponse;
import mx.com.sky.sel.services.utils.usuario.ServicioUsuario;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.AgentUtil;

import mx.com.sky.sel.utils.EncriptadoTexto;

import mx.com.sky.sel.utils.UtileriasMB;

import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectBooleanCheckbox;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.component.rich.RichPopup;

import org.apache.myfaces.trinidad.component.core.input.CoreInputText;
import org.apache.myfaces.trinidad.component.core.input.CoreSelectBooleanCheckbox;

public class BBRegistroUsuario extends UtileriasMB implements Serializable {
    @SuppressWarnings("compatibility:-5183506161547406076")
    private static final long serialVersionUID = 5174379940032160287L;
    private String mensajeUsuario;
    private String tipoMensaje;
    private String mensaje;
    private String icono;
    private Boolean mostrarOKRegistro;
    private transient RichInputText cuentaSKY;
    private transient RichInputText tarjetaIngeligente;
    private transient RichInputText contrasena;
    private transient RichInputText confContrasena;
    private transient RichSelectBooleanCheckbox aceptaTC;
    private String codigoVerificacion;
    private String codigoLink;
    private transient RichInputText codigoLinkInput;
    private boolean accionOk;
    private boolean dispositivoMobile;
    private boolean dispositivoTablet;
    private boolean dispositivoPC;
    private transient RichOutputText mensajeUsuarioError;
    
    private boolean aceptaTCMobile;
    private transient CoreSelectBooleanCheckbox aceptaTDMob;
    private transient CoreInputText cuentaSKYMobile;
    private transient CoreInputText tarjetaInteligenteMobile;
    private transient CoreInputText contrasenaMobile;
    private transient CoreInputText confContrasenaMobile;

    private transient RichPopup popupRegistrarUsuario;
    private transient RichPopup popupRegistrarUsuarioTablet;

    public BBRegistroUsuario() {
        super();
        mostrarOKRegistro = false;
        icono = "activa.png";
        mensaje = "";
        //handleRequestMethod();
        aceptaTCMobile = false;
        mensajeUsuarioError = new RichOutputText();
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

    public boolean isRenderTablet() {
        AgentUtil agentUtil = new AgentUtil();
        String agent = agentUtil.getPhoneFamily();
        if (agent.equalsIgnoreCase("tablet")) {
            return true;
        } else {
            return false;
        }
    }
    
    public String completarPreRegistroMobile() {
        String response;
        String respuesta = null;
        FacesContext facesContext = FacesContext.getCurrentInstance();
        HttpSession session =
            (HttpSession)facesContext.getExternalContext().getSession(false);
        //Google Recaptcha
        FacesContext context = FacesContext.getCurrentInstance();
        HttpServletRequest request =
            (HttpServletRequest)context.getExternalContext().getRequest();


        try {
                if (getContrasenaMobile().getValue().toString().equalsIgnoreCase(getConfContrasenaMobile().getValue().toString())) {
                        ServicioUsuario su = new ServicioUsuario();
                        String cadenaLink = session.getAttribute("cadenaLink").toString();
                        String[] parametros = EncriptadoTexto.leerTexto(cadenaLink).split(",");
                        response =
                                su.terminarPreRegistro(EncriptadoTexto.obtenerParametro(parametros, "NumeroCuenta"),EncriptadoTexto.obtenerParametro(parametros, "Email"),EncriptadoTexto.obtenerParametro(parametros, "Tel"),EncriptadoTexto.obtenerParametro(parametros, "Servicio"),EncriptadoTexto.obtenerParametro(parametros, "TipoCuenta"),EncriptadoTexto.procesarTexto(contrasenaMobile.getValue().toString()),EncriptadoTexto.obtenerParametro(parametros, "IdPre"));
                        if (response == null) {
                            mensaje =
                                    "No se completo el registro, por favor comunicarse a servicios en línea.";
                            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, null, mensaje);
                            FacesContext.getCurrentInstance().addMessage(null, msg);
                        } else if (response.equalsIgnoreCase("OK") && EncriptadoTexto.obtenerParametro(parametros, "TipoCuenta").contains("N")) {
                            if (isRenderTablet()) {
                                ADFUtils.showPopup(popupRegistrarUsuarioTablet);
                                respuesta = "OK";
                            }else{
                                respuesta = "cerrar_mobile_ok";
                            }
                        } else if (response.equalsIgnoreCase("OK") && !EncriptadoTexto.obtenerParametro(parametros, "TipoCuenta").contains("N")){
                            if (isRenderTablet()) {
                                respuesta = "tablet_corporativo";
                            }else{
                                respuesta = "mobile_corporativo";
                            }
                        } else {
                            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, null, response);
                            FacesContext.getCurrentInstance().addMessage(null, msg);
                            respuesta = null;
                        }
                    } else {
                        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, null, "La contraseña no coincide con su confirmación");
                        FacesContext.getCurrentInstance().addMessage(null,msg);
                        mensaje =
                                "La contraseña no coincide con su confirmación";
                        respuesta = null;
                    }
            } catch (Exception e) {
                respuesta = null;
                LogPC.printlnError(this, e.getMessage(), e);
                mensaje= "No se completo el registro, por favor comunicarse a servicios en línea.";
                FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, null, mensaje);
                FacesContext.getCurrentInstance().addMessage(null, msg);
            }
        return respuesta;
    }

    public String completarPreRegistro() {
        String response;
        String respuesta = null;
        FacesContext facesContext = FacesContext.getCurrentInstance();
        HttpSession session =
            (HttpSession)facesContext.getExternalContext().getSession(false);


        try {
                ServicioUsuario su = new ServicioUsuario();
                if (contrasena.getValue().toString().equalsIgnoreCase(confContrasena.getValue().toString())) {
                String cadenaLink = session.getAttribute("cadenaLink").toString();
                String[] parametros = EncriptadoTexto.leerTexto(cadenaLink).split(",");
                response =
                        su.terminarPreRegistro(EncriptadoTexto.obtenerParametro(parametros, "NumeroCuenta"),EncriptadoTexto.obtenerParametro(parametros, "Email"),EncriptadoTexto.obtenerParametro(parametros, "Tel"),EncriptadoTexto.obtenerParametro(parametros, "Servicio"),EncriptadoTexto.obtenerParametro(parametros, "TipoCuenta"),EncriptadoTexto.procesarTexto(contrasena.getValue().toString()),EncriptadoTexto.obtenerParametro(parametros, "IdPre"));
                if (response == null) {
                    LogPC.printlnError(this,
                                       "No se completo el registro, por favor comunicarse a servicios en línea.");
                    ADFUtils.showErrorMessage("No se completo el registro, por favor comunicarse a servicios en línea.");
                    mensaje =
                            "No se completo el registro, por favor comunicarse a servicios en línea.";
                } else if (response.equalsIgnoreCase("OK") && EncriptadoTexto.obtenerParametro(parametros, "TipoCuenta").contains("N")) {
                        ADFUtils.showPopup(popupRegistrarUsuario);
                        respuesta = "OK";
                } else if (response.equalsIgnoreCase("OK") && !EncriptadoTexto.obtenerParametro(parametros, "TipoCuenta").contains("N")) {
                        respuesta = "pc_corporativo";
                } else {
                    ADFUtils.showErrorMessage(response);
                    respuesta = null;
                }
            } else {
                //ADFUtils.showErrorMessage(mensaje);
                FacesMessage msg =
                    new FacesMessage(FacesMessage.SEVERITY_INFO, null,
                                     "La contraseña no coincide con su confirmación");
                FacesContext.getCurrentInstance().addMessage(null, msg);
                mensaje = "La contraseña no coincide con su confirmación";
                respuesta = null;
            }
        } catch (Exception e) {
            respuesta = null;
            LogPC.printlnError(this, e.getMessage(), e);
            ADFUtils.showErrorMessage(getMensajeProperties("mensaje_PantallaError_generico"));
        }
        return respuesta;
    }

    public String handleRequestMethod() {
        LogPC.println(this, "In handleRequestMethod...");
        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext externalContext = context.getExternalContext();
        HttpServletRequest request =
            (HttpServletRequest)externalContext.getRequest();
        String cadenaLink = request.getParameter("code");
        String[] parametros = EncriptadoTexto.leerTexto(cadenaLink).split(",");
        
        if( parametros != null && parametros.length > 0 ) {
            LogPC.println(this, "Parametros enviados en la URL:");
            for( String param : parametros ) {
                LogPC.println(this, "param: " + param);
            }
        }
        
        codigoVerificacion = EncriptadoTexto.obtenerParametro(parametros, "IdPre");
        ServicioUsuario su = new ServicioUsuario();
        String estatusCodigo = "";
        String respuesta = "";

        if (codigoVerificacion != null && !codigoVerificacion.isEmpty()) {
            try {
                estatusCodigo =
                        su.consultarEstatusCodigoPre(codigoVerificacion);
                //estatusCodigo = "VIGENTE";
                tipoMensaje = estatusCodigo;
                LogPC.println(this,
                              "Codigo validado como [" +
                              estatusCodigo + "]");
                if (estatusCodigo.equalsIgnoreCase("EXPIRADO")) {
                    icono = "alerta.png";
                    mensajeUsuario =
                            "El registro ha caducado, para poder ingresar a servicios en línea deberá registrarse nuevamente.";
                    mensajeUsuarioError.setValue(mensajeUsuario);
                    respuesta = "error_pc";
                    accionOk = false;
                } else if (estatusCodigo.equalsIgnoreCase("PROCESADO")) {
                    mensajeUsuario =
                            "El código de verificación indica que ya se encuentra registrado en el sistema, si no puede ingresar intente con la opción de recuperación de contraseña.";
                    icono = "alerta.png";
                    mensajeUsuarioError.setValue(getMensajeUsuario());
                    respuesta = "error_pc";
                    accionOk = false;
                } else if (estatusCodigo.equalsIgnoreCase("VIGENTE")) {
                    LogPC.println(this,
                                  "Terminando Registro para el Codigo [" +
                                  codigoVerificacion + "]");
                    setCodigoLink(codigoVerificacion);
                    //mensajeUsuario = "Estimado Suscriptor le informamos que su registro en Servicios en Línea SKY está siendo procesado. En breve recibirá un correo electrónico en el que se notificará que su cuenta ha sido activada.";
                    //icono = "activa.png";
                    mostrarOKRegistro = true;
                    respuesta = "ok_pc";
                    accionOk = true;
                    FacesContext facesContext =
                        FacesContext.getCurrentInstance();
                    HttpSession session =
                        (HttpSession)facesContext.getExternalContext().getSession(false);
                    Enumeration e = session.getAttributeNames();
                    RegistroLink registroLink = new RegistroLink();
                    registroLink.setCadenaLink(cadenaLink);
                    session.setAttribute("cadenaLink",
                                         cadenaLink);
                    System.out.println(session.getAttribute("cadenaLink"));
                    //mensajeUsuario = "Estimado Suscriptor le informamos que su registro en Servicios en Línea SKY está siendo procesado. En breve recibirá un correo electrónico en el que se notificará que su cuenta ha sido activada.";
                } else {
                    LogPC.printlnWarn(this,
                                      "EstatusCodigoPre no regreso ESTATUS para Codigo[" +
                                      codigoVerificacion + "]");
                    mensajeUsuario =
                            "El link de registro es inválido o su código de verificación es incorrecto, por favor comúniquese a los teléfonos de SKY";
                    mensajeUsuarioError.setValue(mensajeUsuario);
                    icono = "alerta.png";
                    respuesta = "ok_pc";
                    accionOk = false;
                }
            } catch (Exception e) {
                LogPC.printlnError(this, e.getMessage(), e);
                //ADFUtils.showErrorMessage(e.getMessage());
                mensajeUsuario =
                        "No se completo el registro, por favor comunicarse a servicios en línea.";
                mensajeUsuarioError.setValue(mensajeUsuario);
                icono = "alerta.png";
                respuesta = "error_pc";
                accionOk = false;
            }
        } else {
            tipoMensaje = "VACIO";
            icono = "alerta.png";
            mensajeUsuario =
                    "El link de registro es inválido o su código de verificación es incorrecto. Si ya recibió su correo de bienvenida usted ya puede hacer uso de Servicios en Línea SKY, de lo contrario es necesario ingresar nuevamente sus datos.";
            mensajeUsuarioError.setValue(mensajeUsuario);
            respuesta = "error_pc";
            accionOk = false;
        }

        return "siguiente";
    }

    public String terminarRegistro() {
        String codigoVerificacion = "";

        ExternalContext ectx =
            FacesContext.getCurrentInstance().getExternalContext();
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


    public void setCuentaSKY(RichInputText cuentaSKY) {
        this.cuentaSKY = cuentaSKY;
    }

    public RichInputText getCuentaSKY() {
        return cuentaSKY;
    }

    public void setTarjetaIngeligente(RichInputText tarjetaIngeligente) {
        this.tarjetaIngeligente = tarjetaIngeligente;
    }

    public RichInputText getTarjetaIngeligente() {
        return tarjetaIngeligente;
    }

    public void setContrasena(RichInputText contrasena) {
        this.contrasena = contrasena;
    }

    public RichInputText getContrasena() {
        return contrasena;
    }

    public void setConfContrasena(RichInputText confContrasena) {
        this.confContrasena = confContrasena;
    }

    public RichInputText getConfContrasena() {
        return confContrasena;
    }

    public void setAceptaTC(RichSelectBooleanCheckbox aceptaTC) {
        this.aceptaTC = aceptaTC;
    }

    public RichSelectBooleanCheckbox getAceptaTC() {
        return aceptaTC;
    }

    public void setCodigoVerificacion(String codigoVerificacion) {
        this.codigoVerificacion = codigoVerificacion;
    }

    public String getCodigoVerificacion() {
        return codigoVerificacion;
    }


    public void setCodigoLink(String codigoLink) {
        this.codigoLink = codigoLink;
    }

    public String getCodigoLink() {
        return codigoLink;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setCodigoLinkInput(RichInputText codigoLinkInput) {
        this.codigoLinkInput = codigoLinkInput;
    }

    public RichInputText getCodigoLinkInput() {
        return codigoLinkInput;
    }

    public void setAccionOk(boolean accionOk) {
        this.accionOk = accionOk;
    }

    public boolean isAccionOk() {
        return accionOk;
    }

    public boolean isMobile() {
        boolean respuesta = false;
        LoginMB login = new LoginMB();
        if (login.isRenderADFSmartPhone()) {
            respuesta = true;
        } else {
            respuesta = false;
        }
        return respuesta;
    }

    public boolean isTablet() {
        boolean respuesta = false;
        LoginMB login = new LoginMB();
        if (login.isRenderTablet()) {
            respuesta = true;
        } else {
            respuesta = false;
        }
        return respuesta;
    }

    public boolean isLinkOk() {
        boolean respuesta = false;
        if (isAccionOk()) {
            respuesta = true;
        } else {
            respuesta = false;
        }
        return respuesta;
    }

    public void setMensajeUsuarioError(RichOutputText mensajeUsuarioError) {
        this.mensajeUsuarioError = mensajeUsuarioError;
    }

    public RichOutputText getMensajeUsuarioError() {
        return mensajeUsuarioError;
    }
    public void setAceptaTCMobile(boolean aceptaTCMobile) {
        this.aceptaTCMobile = aceptaTCMobile;
    }

    public boolean isAceptaTCMobile() {
        return aceptaTCMobile;
    }

    public void setAceptaTDMob(CoreSelectBooleanCheckbox aceptaTDMob) {
        this.aceptaTDMob = aceptaTDMob;
    }

    public CoreSelectBooleanCheckbox getAceptaTDMob() {
        return aceptaTDMob;
    }

    public void setCuentaSKYMobile(CoreInputText cuentaSKYMobile) {
        this.cuentaSKYMobile = cuentaSKYMobile;
    }

    public CoreInputText getCuentaSKYMobile() {
        return cuentaSKYMobile;
    }

    public void setTarjetaInteligenteMobile(CoreInputText tarjetaInteligenteMobile) {
        this.tarjetaInteligenteMobile = tarjetaInteligenteMobile;
    }

    public CoreInputText getTarjetaInteligenteMobile() {
        return tarjetaInteligenteMobile;
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

    public RichPopup getPopupRegistrarUsuario() {
        return popupRegistrarUsuario;
    }

    public void setPopupRegistrarUsuario(RichPopup popupRegistrarUsuario) {
        this.popupRegistrarUsuario = popupRegistrarUsuario;
    }

    public void setPopupRegistrarUsuarioTablet(RichPopup popupRegistrarUsuarioTablet) {
        this.popupRegistrarUsuarioTablet = popupRegistrarUsuarioTablet;
    }

    public RichPopup getPopupRegistrarUsuarioTablet() {
        return popupRegistrarUsuarioTablet;
    }
}
