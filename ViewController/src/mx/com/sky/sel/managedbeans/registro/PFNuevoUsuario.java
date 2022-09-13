package mx.com.sky.sel.managedbeans.registro;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import javax.servlet.http.HttpServletRequest;

import mx.com.sky.sel.beans.utils.usuario.UsuarioRegistro;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.services.utils.usuario.ServicioUsuario;
import mx.com.sky.sel.utils.ADFUtils;

import mx.com.sky.sel.dto.ConsultarCtaCelSkyRequestDTO;
import mx.com.sky.sel.dto.ConsultarCtaCelSkyResponseDTO;

import nl.captcha.Captcha;

import oracle.adf.view.rich.component.rich.RichPopup;

import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;

import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;

import javax.faces.model.SelectItem;


import mx.com.sky.sel.log.LogServicios;

import mx.com.sky.sel.utils.UtileriasMB;

import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class PFNuevoUsuario extends UtileriasMB implements Serializable {
    @SuppressWarnings("compatibility:-6317202121874544175")
    private static final long serialVersionUID = -9222819750978024827L;

    private UsuarioRegistro usuario;

    private String confpass;
    private String confemail;
    private String nip;
    private String telefonoBTCEL;
    private boolean aceptaTC;
    private String mensaje;
    private transient RichPopup popupObtenerCuentaSKY;
    List<SelectItem> listServicios;
    List<SelectItem> listPaises;
    private transient RichPopup popupCrearUsuarioPre;
    private String pais;
    private String producto;
    private boolean mx;
    private transient RichSelectOneChoice socServicios;
    private boolean captchaValido;
    private transient RichPanelGroupLayout pglRecaptcha;
    private transient RichInputText inputTextCuenta;
    private HashMap<String, Boolean> menu;
    public PFNuevoUsuario() {
        super();
        LogPC.println(this, "PFNuevoUsuario()");
        usuario = new UsuarioRegistro();
        mensaje = "";
    }


    public String reenviarConfirmacion() {
        String respuesta = null;
        LogPC.println(this, "reenviarConfirmacion()");
        String resultado = "";
        // Add event code here...
        if (usuario.getEmail().equalsIgnoreCase(confemail)) {
            //if (verifyAnswer()) {
              ServicioUsuario susuario = new ServicioUsuario();
                usuario.setEmail(usuario.getEmail().toLowerCase());
                usuario.setUserName(usuario.getEmail());
                try {
                    resultado = susuario.reenviarConfirmacion(usuario);
                    respuesta = "siguiente";
                } catch (Exception e) {
                    mensaje = e.getMessage();
                    ADFUtils.addFacesErrorMessage(mensaje);
                    ADFUtils.showErrorMessage(getMensajeProperties("mensaje_PantallaError_generico"));
                    LogPC.printlnError(this, e.getMessage(), e);
                    respuesta = null;
                }
                LogPC.println(this, "Resultado [" + resultado + "]respuesta["+respuesta+"]");
        } else {
            usuario.setEmail("");
            confemail = "";
            mensaje = "El correo no coincide con su confirmación";
            ADFUtils.addFacesErrorMessage(mensaje);
            ADFUtils.showErrorMessage(mensaje);
            respuesta = null;
        }
        return respuesta;
    }

    public String preparaNuevoUsuario() {
        LogPC.println(this, "preparaNuevoUsuario");
        aceptaTC = false;
        confpass = "";
        usuario = new UsuarioRegistro();
        return "ok";
    }
    public String botonAtras(){
        aceptaTC = false;
        usuario.setEmail("");
        setConfemail("");
        return "regresar";
    }
    public String botonCerrar(){
        aceptaTC = false;
        usuario.setEmail("");
        setConfemail("");
        return "index";
    }
    public boolean isChatPublico() {
        boolean respuesta = false;
        ServicioUsuario serUsuario = new ServicioUsuario(); 
        try {
            respuesta = serUsuario.consultarChatPublico();    
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }
        return respuesta;
    }
    
    public void consultarCuenta(ActionEvent actionEvent){
        if(this.telefonoBTCEL != null){
            ConsultarCtaCelSkyRequestDTO request = new ConsultarCtaCelSkyRequestDTO(this.telefonoBTCEL);
            BindingContainer bindings = this.getBindings();        
            OperationBinding operationBinding = bindings.getOperationBinding("consultarCuenta");
            operationBinding.getParamsMap().put("request", request);
            ConsultarCtaCelSkyResponseDTO response = (ConsultarCtaCelSkyResponseDTO) operationBinding.execute();
            System.out.println(response.getCodigoError());
            if(response.getCodigoError().equals("0")){
                System.out.println(response.getNumeroCuenta());
                this.usuario.setCuentaSKY(response.getNumeroCuenta());
                /*FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, null, "Tu número de cuenta es: " + response.getNumeroCuenta());
                FacesContext.getCurrentInstance().addMessage(null, msg);*/
            }else if(response.getCodigoError().equals("100")){
                this.usuario.setCuentaSKY(response.getNumeroCuenta());
                FacesMessage msg =
                    new FacesMessage(FacesMessage.SEVERITY_INFO, null,
                                     getMensajeProperties("msj_cuenta_no_encontrada"));
                FacesContext.getCurrentInstance().addMessage(null, msg);
            }else{
                FacesMessage msg =
                    new FacesMessage(FacesMessage.SEVERITY_INFO, null,
                                     getMensajeProperties("mensaje_PantallaError_generico"));
                FacesContext.getCurrentInstance().addMessage(null, msg);
            }
        }
    }
    
    public boolean validarCuentaSky(){
        System.out.println("Validando:" + this.usuario.getCuentaSKY());
        return this.usuario.getCuentaSKY() != null && this.usuario.getCuentaSKY().matches("\\d{12}");
    }
    
    public String crearUsuario() {
        LogPC.println(this, "crearUsuario()");
        String resultado = "";
        String respuesta = "";
        verificarCaptcha();
        if (isCaptchaValido()) {
            if(validarCuentaSky()){
                if (aceptaTC) {
                    ServicioUsuario susuario = new ServicioUsuario();
                    usuario.setEmail(usuario.getEmail().toLowerCase());
                    usuario.setUserName(usuario.getEmail());
                    try {
                        resultado = susuario.preRegistroUsuario(usuario);
                        LogPC.println(this,
                                          "resultado PRE REGISTRO:" + resultado);
                        ADFUtils.showPopup(popupCrearUsuarioPre);
                        respuesta = "ok";
                    } catch (Exception e) {
                        mensaje = e.getMessage();
                        //ADFUtils.addFacesErrorMessage(mensaje);
                        //ADFUtils.showErrorMessage(mensaje);
                        FacesMessage msg =
                            new FacesMessage(FacesMessage.SEVERITY_INFO, null,
                                             getMensajeProperties("mensaje_PantallaError_generico"));
                        FacesContext.getCurrentInstance().addMessage(null, msg);
                        LogPC.printlnError(this, e.getMessage(), e);
                        return null;
                    }
                } else {
                    mensaje = "Debe aceptar los términos y condiciones";
                    FacesMessage msg =
                        new FacesMessage(FacesMessage.SEVERITY_INFO, null,
                                         mensaje);
                    
                    FacesContext.getCurrentInstance().addMessage(null, msg);
                    //ADFUtils.showErrorMessage(mensaje);
                    respuesta = null;
                }
            }else{
                mensaje = "Introduzca un número de cuenta válido.";
                FacesMessage msg =
                    new FacesMessage(FacesMessage.SEVERITY_INFO, null,
                                     mensaje);
                
                FacesContext.getCurrentInstance().addMessage(null, msg);
                //ADFUtils.showErrorMessage(mensaje);
                respuesta = null;
            }
        } else {
            mensaje = "Debe validar el texto de la imagen";
            
            FacesMessage msg =
                new FacesMessage(FacesMessage.SEVERITY_INFO, null,
                                 mensaje);
            
            FacesContext.getCurrentInstance().addMessage(null, msg);
            
            respuesta = null;
        }
        LogPC.println(this, "Respuesta[" + respuesta + "]");
        return respuesta;
    }

   /* public boolean verifyAnswer() {
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpServletRequest request = (HttpServletRequest)ectx.getRequest();
        Captcha captcha = (Captcha)ectx.getSessionMap().get(Captcha.NAME);
        try {
            request.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            //bad luck - but ignore
            LogPC.println(this, "UTF not supported !");
        }
        String answer = (String)ectx.getRequestMap().get("bestGuess");
        if (answer != null && captcha.isCorrect(answer)) {
            return true;
        } else {
            // PROD return false;
            return false;
            //return true;
        }
    }
*/
    public void setUsuario(UsuarioRegistro usuario) {
        this.usuario = usuario;
    }

    public UsuarioRegistro getUsuario() {
        return usuario;
    }

    public void setConfpass(String confpass) {
        this.confpass = confpass;
    }

    public String getConfpass() {
        return confpass;
    }

    public void setAceptaTC(boolean aceptaTC) {
        this.aceptaTC = aceptaTC;
    }

    public boolean isAceptaTC() {
        return aceptaTC;
    }


    public void setConfemail(String confemail) {
        //eliminacion de " "
        this.confemail = confemail.replaceAll("\\s+","");
    }

    public String getConfemail() {
        return confemail;
    }

    public void socLada_ValueChange(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        usuario.setTelefonoLada((String)valueChangeEvent.getNewValue());

    }

    public void socLadaCelular_ValueChange(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        usuario.setTelefonoMovilLada((String)valueChangeEvent.getNewValue());
    }

    public void socLadaTrabajo_ValueChange(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        usuario.setTelefonoTrabajoLada((String)valueChangeEvent.getNewValue());
    }

  /*  public String validaTelefono() {
        DatosCS datosSuscriptor;
        ServicioCambioTitular sct;


        ServicioCofetel sc = null;
        String modalidadPrincipal = "";
        String modalidadMovil = "";
        String modalidadTrabajo = "";
        String respuesta = "";
        // Add event code here...
        try {
            sct = new ServicioCambioTitular();
            datosSuscriptor = sct.obtenerDatosCS(usuario.getCuentaSKY());
            if (datosSuscriptor.getCountry().equalsIgnoreCase("Mexico")) {
                usuario.setPaisISO("MX");
            }
            //obtiene modalidad telefono principal
            sc = new ServicioCofetel();
            respuesta = "siguiente";
            if (usuario.getPaisISO() != null && usuario.getPaisISO().equalsIgnoreCase("MX")) {
                if (usuario.getTelefonoLada().equalsIgnoreCase("")) {
                    ADFUtils.showErrorMessage("Debe ingresar la lada del teléfono principal");
                    respuesta = null;
                } else {

                    modalidadPrincipal = sc.validaTelefono(usuario.getTelefonoLada(), usuario.getTelefonoCasa());
                    if (!modalidadPrincipal.equalsIgnoreCase("INVALIDO")) {
                        if (usuario.getTelefonoMovilLada().length() != 0 || usuario.getTelefonoMovil().length() != 0) {
                            modalidadMovil = sc.validaTelefono(usuario.getTelefonoMovilLada(), usuario.getTelefonoMovil());
                            if (!modalidadMovil.equalsIgnoreCase("MOVIL")) {
                                ADFUtils.showErrorMessage("Favor de ingresar un teléfono celular válido");
                                respuesta = null;
                            }
                        }
                        if (usuario.getTelefonoTrabajoLada().length() != 0 || usuario.getTelefonoTrabajo().length() != 0) {
                            modalidadTrabajo = sc.validaTelefono(usuario.getTelefonoTrabajoLada(), usuario.getTelefonoTrabajo());
                            if (modalidadTrabajo.equalsIgnoreCase("INVALIDO")) {
                                ADFUtils.showErrorMessage("Favor de ingresar un teléfono celular válido");
                                respuesta = null;
                            }

                        }
                    } else {
                        ADFUtils.showErrorMessage("Debe ingresar un teléfono válido en teléfono principal");
                        respuesta = null;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return respuesta;
    }*/
    
  public List<SelectItem> getServicios() {
     if (listServicios == null) {
         listServicios = new ArrayList<SelectItem>();
         listServicios.add(new SelectItem("VeTV","VeTV"));
         listServicios.add(new SelectItem("Tradicional","Tradicional"));
     }
     return listServicios;
  }
    public String regresarANuevo(){
        
        return "regresar";
    }
    
    public String obtenerCuentaSKY() {
        ServicioUsuario susuario = new ServicioUsuario();
        LogPC.println(this, "El NIP es: " + nip);
        try {
            String cuentaSky = susuario.obtenerCuentaSky(nip);
            if (cuentaSky != null) {
                LogPC.println(this, "El numero de cuenta es: " + cuentaSky);
                usuario.setCuentaSKY(cuentaSky);
                ADFUtils.showPopup(popupObtenerCuentaSKY);
                return "OK";
            } else {
                mensaje = "No se pudo obtener el numero de cuenta, favor de verificar su información";
                FacesMessage msg =
                    new FacesMessage(FacesMessage.SEVERITY_INFO, null,
                                     mensaje);
                FacesContext.getCurrentInstance().addMessage(null, msg);
                LogPC.printlnError(this, mensaje);
                return null;
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
            FacesMessage msg =
                new FacesMessage(FacesMessage.SEVERITY_INFO, null, getMensajeProperties("mensaje_PantallaError_generico"));
            FacesContext.getCurrentInstance().addMessage(null, msg);
            LogPC.printlnError(this, e.getMessage(), e);
            return null;
        }
    }
    
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setPopupObtenerCuentaSKY(RichPopup popupObtenerCuentaSKY) {
        this.popupObtenerCuentaSKY = popupObtenerCuentaSKY;
    }

    public RichPopup getPopupObtenerCuentaSKY() {
        return popupObtenerCuentaSKY;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }
    
    public void setTelefonoBTCEL(String telefono){
        this.telefonoBTCEL = telefono;
    }
    
    public String getTelefonoBTCEL(){
        return this.telefonoBTCEL;    
    }
    
    public void setListServicios(List<SelectItem> listServicios) {
        this.listServicios = listServicios;
    }

    public void setListPaises(List<SelectItem> listPaises) {
        this.listPaises = listPaises;
    }

    public List<SelectItem> getPaises() {
        if (listPaises == null) {
                 listPaises = new ArrayList<SelectItem>();
                 listPaises.add(new SelectItem("MX","M\u00E9xico"));
                 listPaises.add(new SelectItem("CR","Costa Rica"));
            listPaises.add(new SelectItem("GT","Guatemala"));
            listPaises.add(new SelectItem("NI","Nicaragua"));
            listPaises.add(new SelectItem("SV","El Salvador"));
            listPaises.add(new SelectItem("HN","Honduras"));
            listPaises.add(new SelectItem("DO","Rep\u00FAblica Dominicana"));
            listPaises.add(new SelectItem("PA","Panam\u00E1"));
        }
        return listPaises;
    }

    public void setPopupCrearUsuarioPre(RichPopup popupCrearUsuarioPre) {
        this.popupCrearUsuarioPre = popupCrearUsuarioPre;
    }

    public RichPopup getPopupCrearUsuarioPre() {
        return popupCrearUsuarioPre;
    }

    public void socPaises_valueChange(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        pais = (String)valueChangeEvent.getNewValue();
        LogPC.println(this, "Pais Seleccionado: " + pais);
         mx =isMEX();
    }

    public void socProductos_ValueChange(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        producto = (String)valueChangeEvent.getNewValue();
    }

    
    public boolean isMEX() {
        if (pais != null && pais.equalsIgnoreCase("MX"))
            return true;
        return false;
    }

    public boolean isCRI() {
        if (pais != null && pais.equalsIgnoreCase("CR"))
            return true;
        return false;
    }

    public boolean isGTM() {
        if (pais != null && pais.equalsIgnoreCase("GT"))
            return true;
        return false;
    }

    public boolean isHND() {
        if (pais != null && pais.equalsIgnoreCase("HN"))
            return true;
        return false;
    }

    public boolean isNIC() {
        if (pais != null && pais.equalsIgnoreCase("NI"))
            return true;
        return false;
    }

    public boolean isPAN() {
        if (pais != null && pais.equalsIgnoreCase("PA"))
            return true;
        return false;
    }

    public boolean isDOM() {
        if (pais != null && pais.equalsIgnoreCase("DO"))
            return true;
        return false;
    }

    public boolean isSLV() {
        if (pais != null && pais.equalsIgnoreCase("SV"))
            return true;
        return false;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getProducto() {
        return producto;
    }
    
    public boolean isVeTV(){
        if (isMEX() && producto != null && producto.equalsIgnoreCase("VeTV")) {
            return true;
        }
        return false;
    }
    public boolean isTradicional(){
        if (isMEX() && producto != null && !producto.equalsIgnoreCase("VeTV")) {
            return true;
        }
        return false;
    }


    public void setSocServicios(RichSelectOneChoice socServicios) {
        this.socServicios = socServicios;
    }

    public RichSelectOneChoice getSocServicios() {
        return socServicios;
    }

    public void setMx(boolean mx) {
        this.mx = mx;
    }

    public boolean isMx() {
        return mx;
    }
    
    public void setInputTextCuenta(RichInputText inputText){
        this.inputTextCuenta = inputText;
    }
    
    public RichInputText getInputTextCuenta(){
        return this.inputTextCuenta;
    }

     /**
      * @param actionEvent
      */
     public void actualizarCaptcha(ActionEvent actionEvent){
         this.setCaptchaValido(false);
         FacesContext fc = FacesContext.getCurrentInstance();
         ExternalContext ec = fc.getExternalContext();
         HttpServletRequest request  = (HttpServletRequest)ec.getRequest();
         Captcha captcha = (Captcha)ec.getSessionMap().get(Captcha.NAME);
         UIComponent panelLabelAndMessage = ((UIComponent)actionEvent.getSource()).getParent().getParent();
         UIComponent panelFormLayout = panelLabelAndMessage.getParent();
         AdfFacesContext.getCurrentInstance().addPartialTarget(panelFormLayout);
     }

     /**
     * @param actionEvent
     */
    public void verificarCaptcha(ActionEvent actionEvent){
        String mensajeRespuesta = null;
        this.setCaptchaValido(false);
        FacesContext fc = FacesContext.getCurrentInstance();
        ExternalContext ec = fc.getExternalContext();
        HttpServletRequest request  = (HttpServletRequest)ec.getRequest();
        Captcha captcha = (Captcha)ec.getSessionMap().get(Captcha.NAME);
        try{
            request.setCharacterEncoding("UTF-8");
        }catch(UnsupportedEncodingException  e){
            mensaje = e.getMessage();
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, null, getMensajeProperties("mensaje_PantallaError_generico"));
            FacesContext.getCurrentInstance().addMessage(null, msg);
            LogPC.printlnError(this, e.getMessage(), e);
        }
        mensajeRespuesta = (String)ec.getRequestMap().get("captchaValue");
        if (mensajeRespuesta != null && captcha.isCorrect(mensajeRespuesta)){
            setMensajeRespuesta("Texto correcto");
            this.setCaptchaValido(true);
        }else{
            setMensajeRespuesta("Texto incorrecto, intente nuevamente");
            this.setCaptchaValido(false);
            UIComponent panelLabelAndMessage = ((UIComponent)actionEvent.getSource()).getParent().getParent();
            UIComponent panelFormLayout = panelLabelAndMessage.getParent();
            AdfFacesContext.getCurrentInstance().addPartialTarget(panelFormLayout);
        }
    }
     
    /**
    * valida el captcha
    */
    public void verificarCaptcha(){
       String mensajeRespuesta = null;
       this.setCaptchaValido(false);
       FacesContext fc = FacesContext.getCurrentInstance();
       ExternalContext ec = fc.getExternalContext();
       HttpServletRequest request  = (HttpServletRequest)ec.getRequest();
       Captcha captcha = (Captcha)ec.getSessionMap().get(Captcha.NAME);
       try{
           request.setCharacterEncoding("UTF-8");
       }catch(UnsupportedEncodingException  e){
           mensaje = e.getMessage();
           FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, null, getMensajeProperties("mensaje_PantallaError_generico"));
           FacesContext.getCurrentInstance().addMessage(null, msg);
           LogPC.printlnError(this, e.getMessage(), e);
       }
       mensajeRespuesta = (String)ec.getRequestMap().get("captchaValue");
       if (mensajeRespuesta != null && captcha.isCorrect(mensajeRespuesta)){
           //setMensajeRespuesta("Texto correcto");
           this.setCaptchaValido(true);
       }else{
           setMensajeRespuesta("Texto incorrecto, intente nuevamente");
           this.setCaptchaValido(false);
           //AdfFacesContext.getCurrentInstance().addPartialTarget(pglRecaptcha);
       }
    }

    private void setMensajeRespuesta(String mensajeRespuesta){
        FacesContext fc = FacesContext.getCurrentInstance();
        FacesMessage fm = new FacesMessage(mensajeRespuesta);
        fm.setDetail(mensajeRespuesta);
        fm.setSummary("");
        fm.setSeverity(FacesMessage.SEVERITY_INFO);
        fc.addMessage("it4", fm);
    }
    
    public boolean isCaptchaValido() {
        return captchaValido;
    }

    private void setCaptchaValido(boolean captchaValido) {
        this.captchaValido = captchaValido;
    }

    public void setPglRecaptcha(RichPanelGroupLayout pglRecaptcha) {
        this.pglRecaptcha = pglRecaptcha;
    }

    public RichPanelGroupLayout getPglRecaptcha() {
        return pglRecaptcha;
    }

    public void setMenu(HashMap<String, Boolean> menu) {
        this.menu = menu;
    }

    public HashMap<String, Boolean> getMenu() {
        return menu;
    }
}
