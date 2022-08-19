package mx.com.sky.sel.managedbeans.utils.usuario;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import mx.com.sky.sel.beans.utils.usuario.UsuarioRegistro;
import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.services.beans.utils.TarjetaInteligenteIRD;
import mx.com.sky.sel.services.cofetel.ServicioCofetel;
import mx.com.sky.sel.services.ti.SerivcioTarjetaInteligente;
import mx.com.sky.sel.services.utils.usuario.ServicioUsuario;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.UtileriasMB;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.data.RichTable;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;

import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;

public class BBAdministracionUsuario extends UtileriasMB implements Serializable {
    @SuppressWarnings("compatibility:1639617636770225394")
    private static final long serialVersionUID = -195064441356542069L;
    private UsuarioRegistro usuario;
    private String contraseniaNueva;
    private String contraseniaNuevaC;
    private String contraseniaAutentica;
    private transient RichTable tableMenu;
    private boolean aceptaTC;
    private static final String MENSAJE_MOD_GUARDADA = "bbadmonusuario.modificar.guardado";
    private static final String MENSAJE_ALTA_GUARDADA = "bbadmonusuario.alta.guardado";
    private static final String MENSAJE_INFO_GUARDADA = "bbadmonusuario.infoguardada";
    private static final String MENSAJE_PASSWD_INCORRECTO = "bbadmonusuario.contrasenaincorrecta";
    private static final String MENSAJE_INFO_ELIMINADA = "bbadmonusuario.infoeliminada";
    private static final String MENSAJE_PASSWD_GUARDADA = "bbadmonusuario.contrasenaguardada";
    private transient RichPopup popUpMenus;

    public BBAdministracionUsuario() {
        super();
        usuario = new UsuarioRegistro();
        aceptaTC =false;
    }


    public String cbModificarMiCuenta_action() {
        String respuesta = "";
        if(isAceptaTC()){
            ServicioUsuario su = new ServicioUsuario();
            SerivcioTarjetaInteligente sti = new SerivcioTarjetaInteligente();
            UsuarioRegistro usrTmpActual = null;
            ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
            String diferencias = "";
            String ctaSKY = "";
            String paisISO;
            boolean actualiza = false;

            ServicioCofetel sc = null;
            String modalidadPrincipal = "";
            String modalidadMovil = "";
            String modalidadTrabajo = "";

            boolean mostrarMensajeConfirmarMail = false;
            TarjetaInteligenteIRD tarjetaI = null;
            try {
                sc = new ServicioCofetel();
                String uid = sesion.getUsuario().getUid();
                ctaSKY = sesion.getSuscriptor().getCuentaSKY();
                tarjetaI = sti.getTarjetaInteligenteIRD(ctaSKY);
                paisISO = sesion.getPaisISO();
                LogPC.println(this, "Pais: " + paisISO);
                usrTmpActual = su.obtenerMiCuenta(uid);
                usrTmpActual.setCuentaSKY(ctaSKY);
                llenarUsuarioRegistro();
                String lada = usuario.getTelefonoLada();
                String telefonoPrincipal = usuario.getTelefonoCasa();
                String ladaTrabajo = usuario.getTelefonoTrabajoLada();
                String telefonoTrabajo = usuario.getTelefonoTrabajo();
                String ladaMovil = usuario.getTelefonoMovilLada();
                String telefonoMovil = usuario.getTelefonoMovil();
                System.out.println("TELEFONO MOVILE  "+ telefonoMovil);
                if (!usrTmpActual.equals(usuario)) {
                    diferencias = usuario.obtenerDiferencias(usrTmpActual);
                    usuario.setTarjetaInteligente(tarjetaI.getTarjetaInteligente());
                    LogPC.println(this, "Diferencias al actualizar datos: " + diferencias);
                    usuario.setDescripcion(diferencias);
                    usuario.setPaisISO(paisISO);
                    actualiza = true;
                    //agregar codigo aqui para validar telefonos
                    if (paisISO.equalsIgnoreCase("MX")) {
                        if (lada.length() != 0) {
                            modalidadPrincipal = sc.validaTelefono(lada, telefonoPrincipal);
                            if (!modalidadPrincipal.equalsIgnoreCase("INVALIDO")) {
                                LogPC.println(this, "TELEFONO PRINCIPAL INVALIDO!!!");

                                if (ladaMovil.length() != 0 || telefonoMovil.length() != 0) {
                                    modalidadMovil = sc.validaTelefono(ladaMovil, telefonoMovil);
                                    if (!modalidadMovil.equalsIgnoreCase("MOVIL")) {
                                        ADFUtils.showErrorMessage("Favor de ingresar un telefono de celular valido");
                                        actualiza = false;
                                    }
                                }
                                if (ladaTrabajo.length() != 0 || telefonoTrabajo.length() != 0) {
                                    modalidadTrabajo = sc.validaTelefono(ladaTrabajo, telefonoTrabajo);
                                    if (modalidadTrabajo.equalsIgnoreCase("INVALIDO")) {
                                        ADFUtils.showErrorMessage("Favor de ingresar un telefono de oficina valido");
                                        actualiza = false;
                                    }
                                }
                            } else {
                                ADFUtils.showErrorMessage("Debe ingresar un telefono valido en telefono principal ");
                                actualiza = false;
                            }
                        } else {
                            ADFUtils.showErrorMessage("Debe ingresar la lada del telefono principal");
                            actualiza = false;
                        }
                    }
                } else {
                    //ADFUtils.showInfoMessage("No ha modificado ningun dato.");
                    respuesta="siguiente";
                }
                if (actualiza) {
                    if (usuario.isMismoEmail(usrTmpActual)) {
                        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.MI_CUENTA_CAMBIO_DATOS);
                        su.modificarCuentaHija(usuario);
                        mostrarMensajeConfirmarMail = false;
                        usuario = new UsuarioRegistro();
                        if (!sesion.getUsuario().getPrimerLogin().equalsIgnoreCase("Y")) {
                            respuesta="siguiente";
                        }else{
                            ADFUtils.showInfoMessage(ADFUtils.getString(MENSAJE_MOD_GUARDADA));
                            respuesta ="";
                        }
                        sesion.actualizarDatosUsuario();
                    } else {
                        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.MI_CUENTA_CAMBIO_EMAIL);
                        su.preRegistroActualizacion(usuario);
                        mostrarMensajeConfirmarMail = true;
                        usuario = new UsuarioRegistro();
                        if (!sesion.getUsuario().getPrimerLogin().equalsIgnoreCase("Y")) {
                            respuesta="siguiente";
                        }else{
                            ADFUtils.showInfoMessage("Enseguida el sistema le enviara un correo electronico de la direccion para confirmar sus nuevo correo electronico. Siga las instrucciones.");
                            respuesta ="";
                        }
                        sesion.actualizarDatosUsuario();
                    }
                }
            } catch (Exception e) {
                ADFUtils.showErrorMessage(getMensajeProperties("mensaje_PantallaError_generico"));
            }
        }else {
                                    FacesMessage msg =
                                        new FacesMessage(FacesMessage.SEVERITY_INFO, null,
                                                         "Debe aceptar los términos y condiciones");
                                    
                                    FacesContext.getCurrentInstance().addMessage(null, msg);
                                    //ADFUtils.showErrorMessage(mensaje);
                                    respuesta = null;
                }
        return respuesta;
    }

    public String cbGuardar_action() {
        ServicioUsuario su = new ServicioUsuario();
        try {
            llenarUsuarioRegistro();
            su.modificarCuentaHija(usuario);
            actualizarTabla();
            usuario = new UsuarioRegistro();
            closePopup("popUpMod");
            ADFUtils.showInfoMessage(ADFUtils.getString(MENSAJE_ALTA_GUARDADA));

        } catch (Exception e) {
            ADFUtils.showErrorMessage(getMensajeProperties("mensaje_PantallaError_generico"));
        }
        return null;
    }

    public String cbCrear_action() {
        ServicioUsuario su = new ServicioUsuario();
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        // Add event code here...
        try {
            if (contraseniaNueva.equalsIgnoreCase(contraseniaNuevaC)) {
                usuario.setCuentaSKY(sesion.getSuscriptor().getCuentaSKY());
                usuario.setUid("");
                usuario.setUserName(usuario.getEmail());
                usuario.setPassword(contraseniaNueva);
                LogPC.println(this, "CREANDO USER:" + usuario);
                su.nuevaCuentaHija(usuario);
                actualizarTabla();
                closePopup("popUpNuevoUsuario");
                usuario = new UsuarioRegistro();
                ADFUtils.showInfoMessage(ADFUtils.getString(MENSAJE_INFO_GUARDADA));
            } else {
                ADFUtils.showInfoMessage(ADFUtils.getString(MENSAJE_PASSWD_INCORRECTO));
            }
        } catch (Exception e) {
            ADFUtils.showErrorMessage(getMensajeProperties("mensaje_PantallaError_generico"));
        }
        return null;
    }

    public String cbEliminar_action() {
        ServicioUsuario su = new ServicioUsuario();
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String uid = (String)ADFUtils.getValue("bindings.uid.inputValue");
        // Add event code here...
        try {
            usuario.setCuentaSKY(sesion.getSuscriptor().getCuentaSKY());
            usuario.setUid(uid);
            su.eliminarCuentaHija(usuario);
            closePopup("popupEliminar");
            actualizarTabla();
            ADFUtils.showInfoMessage(ADFUtils.getString(MENSAJE_INFO_ELIMINADA));
        } catch (Exception e) {
            ADFUtils.showErrorMessage(getMensajeProperties("mensaje_PantallaError_generico"));
        }
        return null;
    }

    public String cbActualizarContrasenia_action() {
        ServicioUsuario su = new ServicioUsuario();
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String uid = (String)ADFUtils.getValue("bindings.uid.inputValue");
        String contactoRowId = sesion.getSuscriptor().getContactoRowId();
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.MI_CUENTA_CAMBIO_CONTRASENIA);
        if (contraseniaNueva.equalsIgnoreCase(contraseniaNuevaC)) {
            try {
                su.autenticarModificaContrasena(sesion.getUsuario().getNombreUsuario(), contraseniaAutentica.replaceAll("&","&amp;"));
                usuario.setContactoRowId(contactoRowId);
                usuario.setCuentaSKY(sesion.getSuscriptor().getCuentaSKY());
                usuario.setUid(uid);
                usuario.setPassword(contraseniaNueva);
                su.modificarCuentaHija(usuario);
                ADFUtils.showInfoMessage(ADFUtils.getString(MENSAJE_PASSWD_GUARDADA));
                contraseniaAutentica = "";
                contraseniaNueva ="";
                contraseniaNuevaC="";
            } catch (Exception e) {
                ADFUtils.showErrorMessage(getMensajeProperties("mensaje_PantallaError_generico"));
                contraseniaAutentica = "";
                contraseniaNueva ="";
                contraseniaNuevaC="";
            }
        } else {
            ADFUtils.showErrorMessage(ADFUtils.getString(MENSAJE_PASSWD_INCORRECTO));
        }
        return null;
    }


    private void selectAllPermisos(Boolean permiso) {
        // get the binding container
        BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
        // Get the iterator -> change the name to your iterator
        DCIteratorBinding it = (DCIteratorBinding)bindings.get("obtenerMenusIterator");
        RowSetIterator rit = it.getRowSetIterator();
        rit.reset();
        if (rit.first() != null) {
            Row r = rit.first();
            r.setAttribute("visible", permiso);
        }

        while (rit.hasNext()) {
            Row r = rit.next();
            if (r != null) {
                r.setAttribute("visible", permiso);
            }
        }
    }

    public String cancelar() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("actualizarMenus");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }

        return null;
    }

    public static void closePopup(String popupId) {
        FacesContext context = FacesContext.getCurrentInstance();

        ExtendedRenderKitService extRenderKitSrvc = Service.getRenderKitService(context, ExtendedRenderKitService.class);
        extRenderKitSrvc.addScript(context, "AdfPage.PAGE.findComponent('" + popupId + "').hide();");
    }


    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    private void llenarUsuarioRegistro() {
        String uid;
        String userName;
        String nombre;
        String apellidoPaterno;
        String apellidoMaterno;
        String email;
        String cuentaSKY;
        String telefonoLada;
        String telefonoCasa;
        String telefonoTrabajoLada;
        String telefonoTrabajo;
        String telefonoTrabajoExt;
        String telefonoMovilLada;
        String telefonoMovil;
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String contactoRowId = sesion.getSuscriptor().getContactoRowId();
        String titular = sesion.getSuscriptor().getNombreSuscriptor();
        uid = ADFUtils.getValue("bindings.uid") + "";
        userName = ADFUtils.getValue("bindings.userName") + "";
        nombre = ADFUtils.getValue("bindings.nombre") + "";
        apellidoPaterno = ADFUtils.getValue("bindings.apellidoPaterno") + "";
        apellidoMaterno = ADFUtils.getValue("bindings.apellidoMaterno") + "";
        email = ADFUtils.getValue("bindings.email") + "";
        cuentaSKY = sesion.getSuscriptor().getCuentaSKY();
        telefonoLada = ADFUtils.getValue("bindings.telefonoLada") + "";
        telefonoCasa = ADFUtils.getValue("bindings.telefonoCasa") + "";
        telefonoTrabajoLada = ADFUtils.getValue("bindings.telefonoTrabajoLada") + "";
        telefonoTrabajo = ADFUtils.getValue("bindings.telefonoTrabajo") + "";
        telefonoTrabajoExt = ADFUtils.getValue("bindings.telefonoTrabajoExt") + "";
        telefonoMovil = ADFUtils.getValue("bindings.telefonoMovil") + "";
        telefonoMovilLada = ADFUtils.getValue("bindings.telefonoMovilLada") + "";

        usuario.setContactoRowId(contactoRowId);
        usuario.setCuentaSKY(sesion.getSuscriptor().getCuentaSKY());
        usuario.setUid(uid);
        usuario.setApellidoMaterno(apellidoMaterno);
        usuario.setApellidoPaterno(apellidoPaterno);
        usuario.setCuentaSKY(cuentaSKY);
        usuario.setEmail(email);
        usuario.setNombre(nombre);
        usuario.setTelefonoCasa(telefonoCasa);
        usuario.setTelefonoLada(telefonoLada);
        usuario.setTelefonoMovil(telefonoMovil);
        usuario.setTelefonoTrabajo(telefonoTrabajo);
        usuario.setTelefonoTrabajoExt(telefonoTrabajoExt);
        usuario.setTelefonoTrabajoLada(telefonoTrabajoLada);
        usuario.setUserName(userName);
        usuario.setTitularCuentaSKY(titular);
        usuario.setDescripcion("");
        usuario.setTelefonoMovilLada(telefonoMovilLada);

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


    public void setUsuario(UsuarioRegistro usuario) {
        this.usuario = usuario;
    }

    public UsuarioRegistro getUsuario() {
        return usuario;
    }


    public void setContraseniaNueva(String contraseniaNueva) {
        this.contraseniaNueva = contraseniaNueva;
    }

    public String getContraseniaNueva() {
        return contraseniaNueva;
    }

    public void setContraseniaNuevaC(String contraseniaNuevaC) {
        this.contraseniaNuevaC = contraseniaNuevaC;
    }

    public String getContraseniaNuevaC() {
        return contraseniaNuevaC;
    }


    public String ctbMenus_action() {
        // Add event code here...
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("actualizarMenus");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        LogPC.println(this, "Actualizando Menus");
        ADFUtils.addPartialTarget(tableMenu);
        return null;
    }

    public String cbSeleccionarMenus_action() {
        selectAllPermisos(true);
        return null;
    }

    public String cbDeSeleccionarMenus_action() {
        selectAllPermisos(false);
        return null;
    }

    public String cbGuardaMenus_action() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("updateMenus");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }


        bindings = getBindings();
        operationBinding = bindings.getOperationBinding("actualizarMenus");
        result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }

        popUpMenus.cancel();
        return null;
    }

    public void setTableMenu(RichTable tableMenu) {
        this.tableMenu = tableMenu;
    }

    public RichTable getTableMenu() {
        return tableMenu;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        LogPC.println(this, "Serializando BBAdministracionUSuario: " + usuario);
    }

    private void readObject(ObjectInputStream in) throws IOException {
        try {
            in.defaultReadObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        LogPC.println(this, "DeSerializando BBAdministracionUSuario: " + usuario);
    }

    public void setPopUpMenus(RichPopup popUpMenus) {
        this.popUpMenus = popUpMenus;
    }

    public RichPopup getPopUpMenus() {
        return popUpMenus;
    }

    public void socLada_ValueChange(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        String telefonoLada = (String)valueChangeEvent.getNewValue();
        this.usuario.setTelefonoLada(telefonoLada);

        LogPC.println(this, "socLada_ValueChange:" + telefonoLada);


    }

    public void socLadaTrabajo_ValueChange(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        String telefonoTrabajoLada;
        telefonoTrabajoLada = (String)valueChangeEvent.getNewValue();
        usuario.setTelefonoTrabajoLada(telefonoTrabajoLada);

        LogPC.println(this, "socLadaTrabajo_ValueChange:" + telefonoTrabajoLada);


    }

    public void socLadaMovil_ValueChange(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        String telefonoLadaMovil;
        telefonoLadaMovil = (String)valueChangeEvent.getNewValue();
        usuario.setTelefonoLada(telefonoLadaMovil);

        LogPC.println(this, "socLadaMovil_ValueChange:" + telefonoLadaMovil);


    }

    public void setAceptaTC(boolean aceptaTC) {
        this.aceptaTC = aceptaTC;
    }

    public boolean isAceptaTC() {
        return aceptaTC;
    }

    public void setContraseniaAutentica(String contraseniaAutentica) {
        this.contraseniaAutentica = contraseniaAutentica;
    }

    public String getContraseniaAutentica() {
        return contraseniaAutentica;
    }
}
