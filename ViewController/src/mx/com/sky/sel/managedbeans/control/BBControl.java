package mx.com.sky.sel.managedbeans.control;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import mx.com.sky.sel.managedbeans.datosgenerales.BBDatosGenerales;
import mx.com.sky.sel.services.beans.controlremoto.ControlRemotoBean;
import mx.com.sky.sel.services.beans.controlremoto.DireccionCR;
import mx.com.sky.sel.services.beans.controlremoto.Region;
import mx.com.sky.sel.services.beans.pagos.tarjetas.Tarjeta;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.beans.utils.Direccion;
import mx.com.sky.sel.beans.utils.ParametrosPago;
import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.services.controlremoto.ServicioControlRemotoPSManagementBean;
import mx.com.sky.sel.services.pagos.serviciopagos.ServicioPagosPSManagementBean;
import mx.com.sky.sel.services.utils.SolicitudServicioUtils;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.managedbeans.sesion.SesionMB;

import mx.com.sky.sel.utils.UtileriasMB;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import org.apache.myfaces.trinidad.context.RequestContext;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;

import org.apache.myfaces.trinidad.event.ReturnEvent;

public class BBControl extends UtileriasMB implements Serializable{
    @SuppressWarnings("compatibility:-1690919788982787293")
    private static final long serialVersionUID = -2991876675752715624L;

    private ServicioControlRemotoPSManagementBean dcControl;
    private List<ControlRemotoBean> controls;
    private int idxControl;
    private ControlRemotoBean control;
    private Boolean direccion = false;
    private boolean readOnlyDireccion;
    private transient RichPopup popupMensajeCompra; //Popup que informa el estado de la Compra
    private String mensajeCompra;
    private transient RichPopup popupConfirmar; //Popup de Confirmaci\u00F3n de datos

    private Map<String, String> selectRegiones = new LinkedHashMap<String, String>();
    private Map<String, String> selectDirecciones = new LinkedHashMap<String, String>();

    private Map<String, DireccionCR> selectDireccionesCR = new LinkedHashMap<String, DireccionCR>();
    private String idRegion;
    private String enviarA;
    private DireccionCR direccionCR;

    /*Datos de Nueva Direcci\u00F3n de Envio*/
    private transient RichInputText calle;
    private transient RichInputText numExt;
    private transient RichInputText numInt;
    private transient RichInputText colonia;
    private transient RichInputText poblacion;
    private transient RichInputText delegMncp;
    private transient RichInputText ciudad;
    private transient RichInputText estado;
    private transient RichInputText cp;
    private transient RichInputText telefono;
    private transient RichInputText lada;

    private Direccion direccionEnvio;
    private Tarjeta tarjeta;
    private transient Object tarjetaObject;
    private ParametrosPago parametrosPago = null;

    private static final String MENSAJE_CONTROL_COMPRA_REALIZADA = "bbcontrol.controlcomprado";
    private static final String MENSAJE_CONTROL_COMPRA_REALIZADA_CRICA = "bbcontrol.controlcompradocrica";
    private static final String MENSAJE_CONTROL_COMPRA_ERROR = "bbcontrol.errorcompra";
    private String ticketNumber;
    private String numeroSolicitud;

    public BBControl() {
        direccionCR = new DireccionCR();
        controls = new ArrayList<ControlRemotoBean>();
        control = new ControlRemotoBean();
        initControls();
        if (controls.size() > 0) {
            control = controls.get(0);
        }
        readOnlyDireccion = true;
        obtenerRegiones();
        LogPC.println(this, "BBControl Creado");

    }

    /*Obtenemos la lista de Controles*/

    private void initControls() {
        direccion = false;
        ServicioControlRemotoPSManagementBean dcC = new ServicioControlRemotoPSManagementBean();
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        boolean equipoHD = sesion.getSuscriptor().isEquipoHD();
        String rowID = sesion.getSuscriptor().getRowId();
        controls = dcC.obtenerControlRemoto(sesion.getSuscriptor().getOrganizacion(), sesion.getSuscriptor().getMarketType(), equipoHD, rowID);
        LogPC.println(this, controls.size() + " Controles obtenidos desde el DC");
        parametrosPago = new ParametrosPago();
        parametrosPago.setTipoPago("CONTROL_REMOTO");
        tarjeta = new Tarjeta();
        direccionSiguienteAction();
    }


    /*Metodo invocado cuando se da click al Checkbox de Cambio de Direcci\u00F3n*/

    public void direccionChanged(ValueChangeEvent e) {
        Boolean direccion = (Boolean)e.getNewValue();
        if (direccion)
            readOnlyDireccion = false;
        else
            readOnlyDireccion = true;
    }


    /* Paso 1
    * Metodo invocado cuando se selecciona un control
    */

    public void setIdxControl(int idxControl) {
        this.idxControl = idxControl;
        control = controls.get(idxControl);
        LogPC.println(this, "Control " + control.getProducto() + " Seleccionado");
    }


    /* Paso 2
    * Metodo llamado desde el Popup de Confirmar
    */

    public void confirmarPopup(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome().ok == DialogEvent.Outcome.ok) {
            enviarControl();
        }
    }


    /* Paso 3
     * Metodo que realiza la contrataci\u00F3n del control
     */

    public String enviarControl() {
        ServicioControlRemotoPSManagementBean scr = null;
        scr = new ServicioControlRemotoPSManagementBean();
        SolicitudServicioBean sc = new SolicitudServicioBean();
        sc = SolicitudServicioUtils.convert(sc);
        control.setBanderaGarantia(direccion == true ? "N" : "Y"); //Bandera para identificar a que direcci\u00F3n debe ser enviado el Control
        sc.setControlRemoto(control);
        Direccion direccionEnv = new Direccion();

        //Se crea la direcci\u00F3n de Env\u00EDo
        if (direccion) {
            direccionEnv = direccionEnvio;
            sc.setDireccion(direccionEnvio);
            sc.setDescripcion("Tipo Control: " + control.getProducto() + " - " + direccionEnv);
        } else {
            //Se env\u00EDa a la Direcci\u00F3n Existente
            BBDatosGenerales dbDatosG = (BBDatosGenerales)JSFUtils.getBean("DatosGeneralesBackingBean");
            Direccion direccionAct = dbDatosG.getDireccion();
            sc.setDireccion(direccionAct);
            sc.setDescripcion("Tipo Control: " + control.getProducto() + " - " + direccionAct);
            LogPC.println(this, "Se enviara el control a la direcci\u00F3n existente");
        }
        try {
            String respuesta = scr.crearSolicitud(sc);
            numeroSolicitud = respuesta;
            mensajeCompra = ADFUtils.getString(MENSAJE_CONTROL_COMPRA_REALIZADA) + respuesta;
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.COMPRA_CONTROL_REMOTO);
            LogPC.println(this, mensajeCompra);
        } catch (Exception ex) {
            LogPC.printlnError(ex);
            mensajeCompra = ADFUtils.getString(MENSAJE_CONTROL_COMPRA_ERROR);
            LogPC.println(this, mensajeCompra);
        }
        
        return "ir_detalle";
    }

        public String cancelarEnviarControl() {
            ADFUtils.hidePopup(popupConfirmar);
            return "";
        }
        
        public String aceptarCompraControl() {
            ADFUtils.hidePopup(popupMensajeCompra);
            return "";
        }
    public String comprarControlVeTV_action() {
        String respuesta = "";
        ServicioPagosPSManagementBean spagos = new ServicioPagosPSManagementBean();
        mx.com.sky.sel.services.beans.pagos.FormatoPago fpago = new mx.com.sky.sel.services.beans.pagos.FormatoPago();
        SesionMB sesion = null;
        String skyComentario = "";
        try {
            skyComentario = parametrosPago.getComentariosPago();
            sesion = (SesionMB)JSFUtils.getBean("sesion");
            /*Se Valida Que la cuenta tenga permitido realizar pagos con Tarjeta de Credito JASR*/
            if(!sesion.getSuscriptor().isPermitePagoTC()){
                   ADFUtils.showErrorMessage("Por el momento su cuenta no permite pagos. Para m\u00E1s informaci\u00F3n comun\u00EDquese a los tel\u00E9fonos de atenci\u00F3n a clientes.");
                   respuesta = null;
            } else {
                fpago.setCuentaSKY(sesion.getCuentaSKY());
                fpago.setPaqueteActual(sesion.getPaquete());
                fpago.setEmail(sesion.getUsuario().getMail());
                fpago.setRowIDSBL(sesion.getSuscriptor().getRowId());
                fpago.setOrganizationID(sesion.getSuscriptor().getOrganizacion());
                fpago.setSistemaFacturacion(sesion.getSistema());
                fpago.setTipoFacturacion(sesion.getSuscriptor().getBillingCode());
                fpago.setPais(sesion.getPais());
                fpago.setMoneda(sesion.getSuscriptor().getCurrencyCode());
                fpago.setMonto(parametrosPago.getMontoD());
                
                if (tarjeta.getTipo().equalsIgnoreCase("AMEX")) {
                    if (tarjeta.getCodigo().length() != 4) {
                        ADFUtils.showErrorMessage("Debe introducir 4 digitos en el c\u00F3digo de seguridad");
                        return null;
                    }
                } else {
                    if (tarjeta.getCodigo().length() != 3) {
                        ADFUtils.showErrorMessage("Debe introducir 3 digitos en el c\u00F3digo de seguridad");
                        return null;
                    }
                }

                fpago.setTarjeta(tarjeta);
                fpago.setOrigenPago("SEL: " + skyComentario);
                fpago.setProposito("1");
                fpago.setIdSession(sesion.getIdSesion());
                
                LogPC.println(this, "PROCESANDO PAGO CONTROL");
                OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.PAGO_ENLINEA);
                ticketNumber = spagos.procesaPago(fpago);
                LogPC.println(this, "EVENTO PAGADO:" + ticketNumber);
                if (ticketNumber != null){
                    enviarControl();
                    respuesta = "compra_exitoso";
                }
            }
        } catch (Exception e) {
            LogPC.println(this, "Regresando error al contratar evento");
            LogPC.printlnError(this, e.getMessage(), e);
            ADFUtils.showErrorMessage(getMensajeProperties("mensaje_PantallaError_generico"));
            respuesta = null;
        }
        //actualizarControles();
        //actualizarTabla();
        return respuesta;
    }

        
    public String cbActualizar_action() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("actualizarTarjetas");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String cbCancelar_action() {
        // Add event code here...
        LogPC.println(this, "cbCancelar_action");
        limpiarDatos();
        return "closeTaskFlow";
    }

    private void limpiarDatos() {
        tarjeta = new Tarjeta();
        direccionEnvio = null;
        direccionCR = null;
        direccionEnvio = new Direccion();
    }

    public boolean isControlDisponible() {
        if (controls != null && controls.size() > 0)
            return true;
        return false;
    }


    public String cbSiguientePago_action() {
        return "siguiente";
    }

    public ControlRemotoBean getControl() {
        return control;
    }

    public void setControl(ControlRemotoBean control) {
        this.control = control;
    }

    public void setDireccion(Boolean direccion) {
        this.direccion = direccion;
    }

    public Boolean getDireccion() {
        return direccion;
    }

    public boolean isReadOnlyDireccion() {
        return readOnlyDireccion;
    }

    public void setCalle(RichInputText calle) {
        this.calle = calle;
    }

    public RichInputText getCalle() {
        return calle;
    }

    public void setNumExt(RichInputText numExt) {
        this.numExt = numExt;
    }

    public RichInputText getNumExt() {
        return numExt;
    }

    public void setNumInt(RichInputText numInt) {
        this.numInt = numInt;
    }

    public RichInputText getNumInt() {
        return numInt;
    }

    public void setColonia(RichInputText colonia) {
        this.colonia = colonia;
    }

    public RichInputText getColonia() {
        return colonia;
    }

    public void setPoblacion(RichInputText poblacion) {
        this.poblacion = poblacion;
    }

    public RichInputText getPoblacion() {
        return poblacion;
    }

    public void setDelegMncp(RichInputText delegMncp) {
        this.delegMncp = delegMncp;
    }

    public RichInputText getDelegMncp() {
        return delegMncp;
    }

    public void setCiudad(RichInputText ciudad) {
        this.ciudad = ciudad;
    }

    public RichInputText getCiudad() {
        return ciudad;
    }

    public void setEstado(RichInputText estado) {
        this.estado = estado;
    }

    public RichInputText getEstado() {
        return estado;
    }

    public void setCp(RichInputText cp) {
        this.cp = cp;
    }

    public RichInputText getCp() {
        return cp;
    }

    public void setTelefono(RichInputText telefono) {
        this.telefono = telefono;
    }

    public RichInputText getTelefono() {
        return telefono;
    }

    public void setLada(RichInputText lada) {
        this.lada = lada;
    }

    public RichInputText getLada() {
        return lada;
    }

    public String getMensajeCompra() {
        return mensajeCompra;
    }

    public void setPopupMensajeCompra(RichPopup popupMensajeCompra) {
        this.popupMensajeCompra = popupMensajeCompra;
    }

    public RichPopup getPopupMensajeCompra() {
        return popupMensajeCompra;
    }

    public void setPopupConfirmar(RichPopup popupConfirmar) {
        this.popupConfirmar = popupConfirmar;
    }

    public RichPopup getPopupConfirmar() {
        return popupConfirmar;
    }

    public List<ControlRemotoBean> getControls() {
        return controls;
    }


    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        LogPC.println(this, "Serializando BBControl: " + controls);
    }

    private void readObject(ObjectInputStream in) throws IOException {
        try {
            in.defaultReadObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        LogPC.println(this, "DeSerializando BBControl :" + controls);
    }

    /**
     * Obtiene los valores para las regiones
     * @return
     */
    public Map<String, String> getSelectRegiones() {
        return selectRegiones;
    }

    /**
     * Obtiene las regiones
     * @return
     */
    private void obtenerRegiones() {
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        dcControl = new ServicioControlRemotoPSManagementBean();
        List<Region> regiones = dcControl.consultarRegiones(sesion.getSuscriptor().getOrganizacion());
        if (regiones != null) {
            for (Region region : regiones) {
                selectRegiones.put(region.getNombre(), region.getIdRegion());
            }
        }
        LogPC.println(this, "Combo de regiones creado");
    }

    public Map<String, String> getSelectDirecciones() {
        return selectDirecciones;
    }

    public void obtenerDirecciones() {
            dcControl = new ServicioControlRemotoPSManagementBean();
            List<DireccionCR> direccionesL = dcControl.consultarDirecciones(idRegion);
            selectDireccionesCR = new LinkedHashMap<String, DireccionCR>();
            if (direccionesL != null) {
                selectDirecciones = new LinkedHashMap<String, String>();
                for (DireccionCR dir : direccionesL) {
                    StringBuilder builder = new StringBuilder();
                    if (dir.getNombre() != null) {
                        builder.append(dir.getNombre());
                        builder.append(" c\u00F3digo:");
                    }
                    if (dir.getCodigoPostal() != null) {
                        builder.append(dir.getCodigoPostal());
                    }
                    selectDirecciones.put(builder.toString(), dir.getDireccionCompleta());
                    selectDireccionesCR.put(dir.getNombre(), dir);
                }
            }
            LogPC.println(this, "Se creo combo direcciones");
        }

    /**
     * Metodo que se ejecuta cuando se acepta enviar control a una direccion
     * en Costa Rica
     * @return
     */
    public String enviarControlCostaRica() {
        LogPC.println(this, "Enviar control a " + this.enviarA);
        if (this.enviarA == null || this.enviarA.isEmpty()) {
            ADFUtils.showErrorMessage("Elige una Region y una Direccion para poder coninuar");
            return "confirmar";
        }
        //crear servicio
        ServicioControlRemotoPSManagementBean scr = null;
        scr = new ServicioControlRemotoPSManagementBean();

        //crear bean
        SolicitudServicioBean sc = new SolicitudServicioBean();
        sc = SolicitudServicioUtils.convert(sc);
        control.setBanderaGarantia("Y");
        sc.setControlRemoto(control);

        //Se crea la direcci\u00F3n de Env\u00EDo
        sc.setDireccion(new Direccion());
        //sc.setDescripcion(this.enviarA);
        sc.setDescripcion("Tipo Control: " + control.getProducto() + " - " + this.enviarA);
        LogPC.println(this, "Se enviara el control a la direcci\u00F3n costa rica");

        try {
            String respuesta = scr.crearSolicitud(sc);
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.COMPRA_CONTROL_REMOTO);
            mensajeCompra = ADFUtils.getString(MENSAJE_CONTROL_COMPRA_REALIZADA_CRICA) + respuesta;
            LogPC.println(this, mensajeCompra);
        } catch (Exception ex) {
            LogPC.printlnError(ex);
            mensajeCompra = ADFUtils.getString(MENSAJE_CONTROL_COMPRA_ERROR);
            LogPC.println(this, mensajeCompra);
        }
        //DCSolicitud_.invalidateCache(); //Limpiamos la Cache del DC para el refresh
        //ADFUtils.showPopup(popupMensajeCompra);
        
        return "ir_detalle";
    }


    public void setIdRegion(String idRegion) {
        this.idRegion = idRegion;
        this.enviarA = "";
        obtenerDirecciones();
    }

    public String getIdRegion() {
        return idRegion;
    }

    public void setEnviarA(String enviarA) {
        this.enviarA = enviarA;
    }

    public String getEnviarA() {
        return enviarA;
    }

    public String actualizarTabla() {
        LogPC.println(this, "Actualizar");
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("obtenerSolicitudServicio");
        if (operationBinding != null) {
            Object result = operationBinding.execute();
            if (!operationBinding.getErrors().isEmpty()) {

            }
        }
        return null;
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String direccionSiguienteAction() {
        //crear la nueva direccion
        if (readOnlyDireccion) {
            BBDatosGenerales dbDatosG = (BBDatosGenerales)JSFUtils.getBean("DatosGeneralesBackingBean");
            Direccion direccionAct = dbDatosG.getDireccion();
            direccionEnvio = new Direccion(direccionAct);
            LogPC.println(this, "Se enviara el control a la nueva direcci\u00F3n");
        } else {
            LogPC.println(this, "NO SE CARGA NINGUNA DIRECCION:");
            LogPC.println(this, "DIRECCION:" + direccionEnvio);
        }
        return "siguiente";
    }

    public void setTarjetaObject(Object tarjetaObject) {
        Row tarjetaRow = null;
        if (tarjetaObject != null) {
            tarjetaRow = ((oracle.jbo.uicli.binding.JUCtrlValueBindingRef)tarjetaObject).getRow();
        }
        if (tarjetaRow == null) {
            return;
        }

        tarjeta.setAnio((String)tarjetaRow.getAttribute("anio"));
        tarjeta.setCodigo((String)tarjetaRow.getAttribute("codigo"));
        tarjeta.setCreditoDebito((String)tarjetaRow.getAttribute("creditoDebito"));
        tarjeta.setId((Integer)tarjetaRow.getAttribute("id"));
        tarjeta.setMes((String)tarjetaRow.getAttribute("mes"));
        tarjeta.setNumeroTarjeta((String)tarjetaRow.getAttribute("numeroTarjeta"));
        //tarjeta.setNoCodificado((String)tarjetaRow.getAttribute("noCodificado"));
        tarjeta.setNombre((String)tarjetaRow.getAttribute("nombre"));
        tarjeta.setTipo((String)tarjetaRow.getAttribute("tipo"));
        this.tarjetaObject = tarjetaObject;
    }

    public void setDireccionEnvio(Direccion direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public Direccion getDireccionEnvio() {
        if (direccionEnvio == null) {
            direccionSiguienteAction();
        }
        return direccionEnvio;
    }

    public void direccionChanged(ActionEvent actionEvent) {
        // cambiar valor
        readOnlyDireccion = !readOnlyDireccion;
        if (readOnlyDireccion) {
            BBDatosGenerales dbDatosG = (BBDatosGenerales)JSFUtils.getBean("DatosGeneralesBackingBean");
            Direccion direccionAct = dbDatosG.getDireccion();
            direccionEnvio = new Direccion(direccionAct);
            ADFUtils.addPartialTarget(calle);
            ADFUtils.addPartialTarget(numExt);
            ADFUtils.addPartialTarget(numInt);
            ADFUtils.addPartialTarget(colonia);
            ADFUtils.addPartialTarget(poblacion);
            ADFUtils.addPartialTarget(delegMncp);
            ADFUtils.addPartialTarget(ciudad);
            ADFUtils.addPartialTarget(estado);
            ADFUtils.addPartialTarget(cp);
            ADFUtils.addPartialTarget(telefono);
            ADFUtils.addPartialTarget(lada);
        }else{
            direccion = true;
        }
    }

    public void setSelectDireccionesCR(Map<String, DireccionCR> selectDireccionesCR) {
        this.selectDireccionesCR = selectDireccionesCR;
    }

    public Map<String, DireccionCR> getSelectDireccionesCR() {
        return selectDireccionesCR;
    }

    public void setDireccionCR(DireccionCR direccionCR) {
        this.direccionCR = direccionCR;
    }

    public DireccionCR getDireccionCR() {
        return direccionCR;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public Object getTarjetaObject() {
        return tarjetaObject;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setNumeroSolicitud(String numeroSolicitud) {
        this.numeroSolicitud = numeroSolicitud;
    }

    public String getNumeroSolicitud() {
        return numeroSolicitud;
    }

/*para actualizar la tabla despues de cerrar el popup*/
    public void contrataReturn(ReturnEvent returnEvent) {
        // Add event code here...
        BindingContext bc = BindingContext.getCurrent();
          DCBindingContainer dcb =
            (DCBindingContainer)bc.getCurrentBindingsEntry();
          DCIteratorBinding iter =
            dcb.findIteratorBinding("obtenerSolicitudServicioIterator");
          iter.executeQuery();
          RequestContext.getCurrentInstance().addPartialTarget(returnEvent.getComponent().getParent().getParent());
    }
}
