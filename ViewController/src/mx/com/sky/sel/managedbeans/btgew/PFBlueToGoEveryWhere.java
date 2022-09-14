package mx.com.sky.sel.managedbeans.btgew;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;

import java.util.List;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import javax.script.ScriptException;

import javax.servlet.http.HttpServletRequest;


import mx.com.sky.sel.services.beans.btgew.ActivacionBean;
import mx.com.sky.sel.beans.utils.Usuario;
import mx.com.sky.sel.beans.utils.usuario.UsuarioRegistro;
import mx.com.sky.sel.enums.EnumOperacionBAM;
//import mx.com.sky.portal.log.mobile.LogMobile;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.services.btgew.ServicioBTGEWPSManagementBean;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.utils.usuario.ServicioUsuario;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;

import mx.com.sky.sel.proxyclients.pagwebss.consultasolicitudservicio.ConsultaSolicitudDeServicio_Service;
import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import mx.com.sky.sel.services.controlremoto.ServicioControlRemotoPSManagementBean;
import mx.com.sky.sel.services.solicitudservicio.ServicioSolicituServicio;

import nl.captcha.Captcha;

import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;

import org.apache.myfaces.trinidad.context.RequestContext;
import org.apache.myfaces.trinidad.event.ReturnEvent;


public class PFBlueToGoEveryWhere implements Serializable {
    @SuppressWarnings("compatibility:4850986693852949669")
    private static final long serialVersionUID = 3667488658106069422L;

    private boolean servicioOTT;
    private boolean servicioVEO;
    private boolean aceptaTC;
    private boolean aceptaTCOTT;
    private boolean aceptaTCVEO;
    private boolean leerTerminosVEO;
    private boolean leerTerminosBTG;
    private transient RichPopup popUpDesTC;
    private transient RichPopup popUpTC;
    private transient RichPanelBox pbB;
    //private transient RichPanelBox pbVEO;
    private String mensaje;
    //Productos
    private boolean servicioHotGo;
    private boolean servicioBTGEW;
    private boolean servicioBlim;

    public PFBlueToGoEveryWhere() {
        super();
        LogPC.println(this, "BBBlueToGo()");
        servicioOTT = false;
        aceptaTCOTT = false;
        aceptaTCVEO = false;
        servicioHotGo = false;
        servicioBTGEW = false;
        servicioBlim = false;
        consultarOTTLDAP();
        leerTerminosVEO = false;
        leerTerminosBTG = false;
        mensaje = "";
    
    }

    private void consultarOTTLDAP() {
        ServicioUsuario su = new ServicioUsuario();
        Usuario user = null;
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String uid = sesion.getUsuario().getUid();
        String cuentaSKY = sesion.getUsuario().getCuentaSKY();
        user = su.consultaAtributosUsuario(uid, cuentaSKY);
        LogPC.println(this, "Status_btg:" + user.getStatus_btg());
        mensaje = "";
        String statusBTG = user.getStatus_btg();
        
        servicioVEO = false;
        servicioOTT = false;

        if (statusBTG.contains("C_VEO")) {
            servicioVEO = true;
        }
        if (statusBTG.contains("C_BTG")) {
            servicioOTT = true;
        }
        if (statusBTG.contains("C_BTG") || statusBTG.contains("C_VEO")) {
            servicioBTGEW = true;
        }
        if (statusBTG.contains("C_HOT")) {
            servicioHotGo = true;
        }
        if (statusBTG.contains("C_BLM")){
            servicioBlim = true;
        }
        
        if ((statusBTG.contains("0") || statusBTG.contains("1")) && statusBTG.length() == 3) {
            if (statusBTG.equalsIgnoreCase("100")) {
                servicioBTGEW = true;
                servicioOTT = false;
                servicioVEO = false;
            } else if (statusBTG.equalsIgnoreCase("101")) {
                servicioBTGEW = true;
                servicioOTT = false;
                servicioVEO = true;
            } else if (statusBTG.equalsIgnoreCase("110")) {
                servicioBTGEW = true;
                servicioOTT = true;
                servicioVEO = false;
            } else if (statusBTG.equalsIgnoreCase("111")) {
                servicioBTGEW = true;
                servicioOTT = true;
                servicioVEO = true;
            } else {
                servicioBTGEW = false;
                servicioOTT = false;
                servicioVEO = false;
            }
        } else if ((statusBTG.contains("0") || statusBTG.contains("1")) && statusBTG.length() == 4) {
            if (statusBTG.equalsIgnoreCase("0001")) {
                servicioBTGEW = false;
                servicioOTT = false;
                servicioVEO = false;
            }
        } else if ((statusBTG.contains("0") || statusBTG.contains("1")) && statusBTG.length() == 5) {
            if (statusBTG.equalsIgnoreCase("11000") || statusBTG.equalsIgnoreCase("11100") || statusBTG.equalsIgnoreCase("11100")) {
                //servicioBTGEW = false;
                servicioOTT = true;
                servicioVEO = false;
            }
            if (statusBTG.equalsIgnoreCase("00110") || statusBTG.equalsIgnoreCase("00110") || statusBTG.equalsIgnoreCase("00110") || statusBTG.equalsIgnoreCase("01110")) {
                //servicioBTGEW = false;
                servicioOTT = false;
                servicioVEO = true;
            }
            if (statusBTG.equalsIgnoreCase("11110")) {
                //servicioBTGEW = false;
                servicioOTT = true;
                servicioVEO = true;
            }
            if (statusBTG.equalsIgnoreCase("00000") || statusBTG.equalsIgnoreCase("01100") || statusBTG.equalsIgnoreCase("01000") || statusBTG.equalsIgnoreCase("00100")) {
                //servicioBTGEW = false;
                servicioOTT = false;
                servicioVEO = false;
            }
        }
    }

    public String actualizarCampos() {
        mensaje = "";
        consultarOTTLDAP();
        LogPC.println(this, "actualizarCampos()");
        return "OK";
    }

    public void dialogReturnListener(ReturnEvent returnEvent) {
      
        LogPC.println(this, "dialogReturnListener ");
        actualizarCampos();
        RequestContext.getCurrentInstance().addPartialTarget(returnEvent.getComponent().getParent().getParent());
        
        
    }
   public String guardarCambios_action() {
       
             
        ServicioUsuario su = new ServicioUsuario();
        UsuarioRegistro usuarioRegistro;
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String uid = sesion.getUsuario().getUid();
        String cuentaSKY = sesion.getUsuario().getCuentaSKY();
        String contactoRowId = sesion.getSuscriptor().getContactoRowId();
        usuarioRegistro = new UsuarioRegistro();
        mensaje = "";
        try {
            usuarioRegistro.setContactoRowId(contactoRowId);
            usuarioRegistro.setCuentaSKY(cuentaSKY);
            usuarioRegistro.setUid(uid);

            usuarioRegistro.setAcl_ott(servicioOTT ? "1" : "0");
            usuarioRegistro.setStatus_ott(servicioOTT ? "Activa" : "Inactiva");
            su.modificarCuentaHija(usuarioRegistro);
            ADFUtils.showInfoMessage("Su configuraci\u00F3n se guard\u00F3 correctamente.");
        } catch (ServicioException e) {
            LogPC.printlnError(this, e);
            mensaje = e.getMessage();
            ADFUtils.showErrorMessage("Ocurri\u00F3 algo inesperado, por favor intente m\u00E1s tarde");
        } catch (Exception e) {
            mensaje = "Ocurri\u00F3 algo inesperado, por favor intente m\u00E1s tarde";
            LogPC.printlnError(this, e);
            ADFUtils.showErrorMessage(mensaje);
        }
        return null;
    }


    private String guardarCambios(boolean VEO, boolean OTT) {
        mensaje = "";
        ServicioBTGEWPSManagementBean sBTGEW = new ServicioBTGEWPSManagementBean();
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String cuentaSKY = sesion.getUsuario().getCuentaSKY();
        String paqueteSKY = sesion.getSuscriptor().getPaquete();
        ActivacionBean activacionBean = new ActivacionBean();
        //se agrega idSesion
        activacionBean.setIdSesion(sesion.getIdSesion());
        activacionBean.setCuentaSKY(cuentaSKY);
        activacionBean.setPaqueteSKY(paqueteSKY);
       
            

        if (VEO) {
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONTRATA_VEO);
            activacionBean.setVeo("YES");
        } else {
            activacionBean.setVeo("NO");
        }
        if (OTT) {
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONTRATA_BTGVEW);
            activacionBean.setOtt("YES");
        } else {
            activacionBean.setOtt("NO");
        }
        LogPC.println(this, "Contratando VEO BTG " + activacionBean);
        return sBTGEW.activarServicios(activacionBean);
    }


    public String activarServicioOTT_action() {
    
       String respuesta = null;
       
       
        if (aceptaTCOTT) {
            //if (verifyAnswer()) {
            respuesta = guardarCambios(false, true);

            if (respuesta.equalsIgnoreCase("0")) {
                respuesta = "index";
                this.servicioOTT = true;
                
            } else {
                mensaje = "Ocurri\u00F3 algo inesperado, por favor intenta m\u00E1s tarde";
                ADFUtils.showErrorMessage(mensaje);
                respuesta = null;
            }
            /*} else {
                ADFUtils.showErrorMessage("El c\u00F3digo de verificaci\u00F3n que ingres\u00F3 es incorrecto, intente nuevamente");
                respuesta = null;
            }*/
        } else {
            mensaje = "Debe aceptar los t\u00E9rminos y condiciones";
            ADFUtils.showErrorMessage(mensaje);
            respuesta = null;
        }
       
        return respuesta;
    }

    public String activarServicioVEO_action() {
    
        String respuesta = null;
        if (aceptaTCVEO) {
            //if (verifyAnswer()) {
            respuesta = guardarCambios(true, false);
            if (respuesta.equalsIgnoreCase("0")) {
                respuesta = "index";
                this.servicioVEO = true;
            } else {
                mensaje = "Ocurri\u00F3 algo inesperado, por favor intenta m\u00E1s tarde";
                ADFUtils.showErrorMessage(mensaje);
                respuesta = null;
            }
            /*} else {
                ADFUtils.showErrorMessage("El c\u00F3digo de verificaci\u00F3n que ingres\u00F3 es incorrecto, intente nuevamente");
                respuesta = null;
            }*/
        } else {
            mensaje = "Debe aceptar los t\u00E9rminos y condiciones";
            ADFUtils.showErrorMessage(mensaje, "mensajeBTG");

            //*********


            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("JavaScript");


            // JavaScript code in a String
            String script = "function desbloquea() {$.mobile.loading('hide');}";
            // evaluate script

            // javax.script.Invocable is an optional interface.
            // Check whether your script engine implements or not!
            // Note that the JavaScript engine implements Invocable interface.
            try {
                engine.eval(script);
            } catch (ScriptException e) {
            }
            Invocable inv = (Invocable)engine;

            // invoke the global function named "hello"


            //*********


            try {
                inv.invokeFunction("desbloquea");
            } catch (ScriptException e) {
            } catch (NoSuchMethodException e) {
            }
            respuesta = null;
        }

        return respuesta;
    }

/*
    public String desactivarServicio_action() {
        String respuesta = null;
        if (aceptaTC) {
            if (verifyAnswer()) {
                this.setServicioOTT(false);
                guardarCambios_action();
                respuesta = "index";
            } else {
                mensaje = "El c\u00F3digo de verificaci\u00F3n que ingres\u00F3 es incorrecto, intente nuevamente";
                ADFUtils.showErrorMessage(mensaje);
                respuesta = null;
            }
        } else {
            mensaje = "Debe aceptar los t\u00E9rminos y condiciones";
            ADFUtils.showErrorMessage(mensaje);
            respuesta = null;
        }

        return respuesta;
    }*/
    public boolean isPaqueteBlack(){
            boolean respuesta=false;
            ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
            if (sesion.getSuscriptor().getPaquete().equalsIgnoreCase("SKY HD BLACK")) {
                respuesta=true;
            }else{
                respuesta=false;
            }
            return respuesta;
        }
    /*
    public boolean verifyAnswer() {
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpServletRequest request = (HttpServletRequest)ectx.getRequest();
        Captcha captcha = (Captcha)ectx.getSessionMap().get(Captcha.NAME);
        try {
            request.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            //bad luck - but ignore
            LogMobile.println(this, "UTF not supported !");
        }
        String answer = (String)ectx.getRequestMap().get("bestGuess");
        if (answer != null && captcha.isCorrect(answer)) {
            return true;
        } else {
            return false;
        }
    }*/

    public void setServicioOTT(boolean servicioOTT) {
        this.servicioOTT = servicioOTT;
    }

    public boolean isServicioOTT() {
        return servicioOTT;
    }


    public void setAceptaTC(boolean aceptaTC) {
        this.aceptaTC = aceptaTC;
    }

    public boolean isAceptaTC() {
        return aceptaTC;
    }

    public void setPopUpDesTC(RichPopup popUpDesTC) {
        this.popUpDesTC = popUpDesTC;
    }

    public RichPopup getPopUpDesTC() {
        return popUpDesTC;
    }

    public void setPopUpTC(RichPopup popUpTC) {
        this.popUpTC = popUpTC;
    }

    public RichPopup getPopUpTC() {
        return popUpTC;
    }

    public void setPbB(RichPanelBox pbB) {
        this.pbB = pbB;
    }

    public RichPanelBox getPbB() {
        return pbB;
    }

    public void setServicioVEO(boolean servicioVEO) {
        this.servicioVEO = servicioVEO;
    }

    public boolean isServicioVEO() {
        return servicioVEO;
    }

    //public void setPbVEO(RichPanelBox pbVEO) {
      //  this.pbVEO = pbVEO;
    //}

    //public RichPanelBox getPbVEO() {
      //  return pbVEO;
   // }

    public void setAceptaTCOTT(boolean aceptaTCOTT) {
        this.aceptaTCOTT = aceptaTCOTT;
    }

    public boolean isAceptaTCOTT() {
        return aceptaTCOTT;
    }

    public void setAceptaTCVEO(boolean aceptaTCVEO) {
        this.aceptaTCVEO = aceptaTCVEO;
    }

    public boolean isAceptaTCVEO() {
        return aceptaTCVEO;
    }

    public void actionListenerLeerTerminosVEO(ActionEvent actionEvent) {
        // Add event code here...
        if (isLeerTerminosVEO())
            setLeerTerminosVEO(false);
        else
            setLeerTerminosVEO(true);
    }

    public void setLeerTerminosVEO(boolean leer) {
        this.leerTerminosVEO = leer;
    }

    public boolean isLeerTerminosVEO() {
        // Add event code here...
        return leerTerminosVEO;
    }

    public void actionListenerLeerTerminosBTG(ActionEvent actionEvent) {
        // Add event code here...
        if (isLeerTerminosBTG())
            setLeerTerminosBTG(false);
        else
            setLeerTerminosBTG(true);
    }

    public void setLeerTerminosBTG(boolean leer) {
        this.leerTerminosBTG = leer;
    }

    public boolean isLeerTerminosBTG() {
        // Add event code here...
        return leerTerminosBTG;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setServicioBTGEW(boolean servicioBTGEW) {
        this.servicioBTGEW = servicioBTGEW;
    }

    public boolean isServicioBTGEW() {
        return servicioBTGEW;
    }

    public void setServicioHotGo(boolean servicioHotGo) {
        this.servicioHotGo = servicioHotGo;
    }

    public boolean isServicioHotGo() {
        return servicioHotGo;
    }
    public void setServicioBlim(boolean servicioBlim) {
        this.servicioBlim = servicioBlim;
    }

    public boolean isServicioBlim() {
        return servicioBlim;
    }
}
