package mx.com.sky.sel.managedbeans.pagos;

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

import mx.com.sky.sel.beans.utils.ParametrosPago;
import mx.com.sky.sel.beans.utils.Usuario;
import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;

import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.services.beans.pagos.tarjetas.Tarjeta;
import mx.com.sky.sel.services.beans.pagos.FormatoPago;
import mx.com.sky.sel.services.beans.pagos.tarjetas.Bines;
import mx.com.sky.sel.services.beans.saldos.Saldo;
import mx.com.sky.sel.services.beans.utils.Suscriptor;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.pagos.tarjetas.ServicioBines;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;
import mx.com.sky.sel.utils.JSFUtils;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectOneRadio;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;
import oracle.binding.DataControl;
import oracle.binding.OperationBinding;

import static mx.com.sky.sel.log.LogPC.println;


public class BBPagoGeneral implements Serializable {
    private static final long serialVersionUID = 1L;

    //Componentes del Formulario Tarjetas
    private transient RichInputText nombre;
    private transient RichInputText no;
    //private transient RichInputText codigo;
    private Map<String, String> tipos;
    private String tipo;
    private Map<String, String> meses;
    private String mes;
    private Map<String, String> anios;
    private String anio;
    private Map<String, String> creditoDebitoMap;
    private String creditoDebito;
    private String id;
    private transient RichPopup popup; //Popup de Confirmacion de Operacion
    private String actionPopup; //String que define que accion realizara el Popup
    private String messagePopup;
    private String mensajeRespuesta;

    //Componentes de Control
    private Boolean insert; //Permite identificar si se activa el boton Agregar, Eliminar o Cancelar
    private transient DCIteratorBinding DCTarjetas_; //Permite tener una referencia al DC
    private List<Tarjeta> tarjetas; //Lista de tarjetas en el DC
    private Tarjeta tarjeta; //La tarjeta que esta Seleccionada por Default

    private boolean operacionExitosa;

    //Componentes del Formulario Pago
    private Map<String, String> tiposPago;
    private String tipoPago;
    private String cVVTemp;
    private Saldo saldo;
    private transient RichInputText importe;
    private transient RichInputText comentarios;
    private transient RichPopup popupPagar;
    private transient RichPopup popupMensajeRespuesta;
    private transient RichSelectOneRadio creditoDebitoSelectRadio; //Popup de Confirmacion de Pago

    private static final String TARJETA_AMEX = "bbpago.tipotarjeta.amex";
    private static final String TARJETA_DINES = "bbpago.tipotarjeta.dinners";
    private static final String TARJETA_LVP = "bbpago.tipotarjeta.lvp";
    private static final String TARJETA_VISA = "bbpago.tipotarjeta.visa";
    private static final String TARJETA_MASTERCARD =
        "bbpago.tipotarjeta.mastercard";
    private static final String TARJETA_CREDITO = "bbpago.tipotarjeta.credito";
    private static final String TARJETA_DEBITO = "bbpago.tipotarjeta.debito";
    private static final String MENSAJE_AGREGAR_TARJETA =
        "bbpago.agregartarjeta";
    private static final String MENSAJE_PAGO_REALIZADO = "bbpago.pagorealizado";
     private static final String MENSAJE_ERROR_PAGO= "bbpago.errorpago";
    private static final String MENSAJE_ERROR_DEFAULT = "bbpago.error.default";

    public BBPagoGeneral() throws Exception {
        
        tipos = new LinkedHashMap<String, String>();
        tipos.put(ADFUtils.getString(TARJETA_AMEX), "AMEX"); //label, value
        tipos.put(ADFUtils.getString(TARJETA_DINES), "Diners Club");
        tipos.put(ADFUtils.getString(TARJETA_LVP), "LVP");
        tipos.put(ADFUtils.getString(TARJETA_VISA), "VISA");
        tipos.put(ADFUtils.getString(TARJETA_MASTERCARD), "MASTERCARD");

        meses = new LinkedHashMap<String, String>();
        meses.put("01", "01");
        meses.put("02", "02");
        meses.put("03", "03");
        meses.put("04", "04");
        meses.put("05", "05");
        meses.put("06", "06");
        meses.put("07", "07");
        meses.put("08", "08");
        meses.put("09", "09");
        meses.put("10", "10");
        meses.put("11", "11");
        meses.put("12", "12");

        anios = new LinkedHashMap<String, String>();
        for (int i = 12; i <= 25; i++)
            anios.put(String.valueOf(i), String.valueOf(i));

        creditoDebitoMap = new LinkedHashMap<String, String>();
        creditoDebitoMap.put(ADFUtils.getString(TARJETA_CREDITO), "01");
        creditoDebitoMap.put(ADFUtils.getString(TARJETA_DEBITO), "02");


        tarjeta = new Tarjeta();
        initTarjetas();
        consultaSaldo();
        insert = true;
        println(this, "BBPago Creado");
    }

    // ############## Seccion tarjetas ##############

    /*Obtenemos las tarjetas desde el DC*/

    private void initTarjetas() {
        tarjetas = new ArrayList<Tarjeta>();
        BindingContainer bindings = getBindings();
        OperationBinding opGet = bindings.getOperationBinding("obtenerTarjetas");
        
        DCTarjetas_ = ADFUtils.getIterador("obtenerTarjetasIterator");
        /*DCDataControl dcd = DCTarjetas_.getDataControl();
        DataControl dc = dcd.getAdaptedDC();
        DCTarjetas dcT = (DCTarjetas)dc.getDataProvider();*/
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String uuid = sesion.getUsuario().getUid();
        //tarjetas = dcT.obtenerTarjetas(uuid);
        opGet.getParamsMap().put("uuid", uuid);
        Object tarjetasObj = opGet.execute();
        tarjetas = (List<Tarjeta>) tarjetasObj;
        
        println(this, tarjetas.size() + " Tarjetas obtenidas desde el DC");

        //Establecemos los valores para el Combo de Tipo Pago
        tiposPago = new LinkedHashMap<String, String>();
        for (Tarjeta t : tarjetas) {
            tiposPago.put(t.getNumeroTarjeta() + " - " + t.getTipo(),
                          t.getNumeroTarjeta());

        }
        println(this, tiposPago.size() + " Elementos para el Combo Tipo Pago");
    }

    /*Metodo que permite agregar la Tarjeta Seleccionada*/

    private String agregarTarjeta() throws Exception {
        BindingContainer bindings = getBindings();
        OperationBinding opAdd = bindings.getOperationBinding("agregarTarjetaPs");
        /*DCTarjetas dcTarjetas = null;
        dcTarjetas = new DCTarjetas();*/
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        Usuario user = sesion.getUsuario();
        String uuid = user.getUid();
        String organizationID = sesion.getSuscriptor().getOrganizacion();
        //String salida = dcTarjetas.agregarTarjeta(tarjeta, uuid,organizationID);
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.MIS_TARJETAS_ADD);
        
        opAdd.getParamsMap().put("tarjeta", tarjeta);
        opAdd.getParamsMap().put("uuid", uuid);
        opAdd.getParamsMap().put("organizationID", organizationID);
        Object result = opAdd.execute();

        String salida = result.toString();
        println(this, "Agregando tarjeta : " + salida);
        clear();
        return salida;
    }

    /*Metodo de limpieza*/

    private void clear() {
        deseleccionarTarjeta();
        DCTarjetas_.invalidateCache(); //Limpiamos la Cache del DC para el refresh
        initTarjetas();
    }

    /*Metodo que Deselecciona la Tarjeta*/

    public String deseleccionarTarjeta() {
        tarjeta = new Tarjeta();
        //codigo.setValue("");
        insert = true;
        return "OK";
    }

    /*Metodo que carga los datos de una Tarjeta para Editarla*/
    /*Metodo Invocado cuando se da Click en el enlace Editar*/

    public String seleccionarTarjeta() {
        initTarjetas();
        for (Tarjeta t : tarjetas)
            if (Integer.valueOf(id).equals(t.getId()))
                tarjeta = t;
        insert = false;
        return null;
    }

    /**
     * Metodo Invocado cuando se da Click al boton Agregar
     * @return
     */
    public String popupAgregar() {
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String organizationId = sesion.getSuscriptor().getOrganizacion();
        actionPopup = "agregarTarjeta";
        messagePopup = ADFUtils.getString(MENSAJE_AGREGAR_TARJETA);
        Tarjeta t = new Tarjeta();
        //t.setCodigo(codigo.getValue().toString());
        t.setNumeroTarjeta(no.getValue().toString());
        t.setNombre(nombre.getValue().toString());
        t.setAnio(anio);
        t.setMes(mes);
        tarjeta = t;
        try {
            this.tarjeta = consultarBinesTDC(tarjeta, organizationId);
            ADFUtils.showPopup(popup);
        } catch (ServicioException e) {
            LogPC.printlnWarn(this, e);
            ADFUtils.showInfoMessage(e.getMessage());
        }catch (Exception e) {
            LogPC.printlnWarn(this, e);
            ADFUtils.showErrorMessage("Ocurri\u00F3 algo inesperado ,por favor intente m\u00E1s tarde.");
        }
        
        return null;
    }
    
    private Tarjeta consultarBinesTDC(Tarjeta tarjeta, String organizationId) throws ServicioException {
        ServicioBines sb = new ServicioBines();
        Bines bines = null;
        LogPC.println(this,
                      "consultarBinesTDC [" + organizationId + "] " + tarjeta);
        bines = sb.validarBines(tarjeta.getNumeroTarjeta(), organizationId);
        if (bines.isTarjetaValida()) {
            tarjeta.setCreditoDebito(bines.getCd());
            tarjeta.setTipo(bines.getTipoTarjeta());
        }else{
            throw new ServicioException("Para poder registrar su tarjeta deber\u00E1 llamar a servicio a clientes");
        }
        return tarjeta;
    }

    /**
     *Metodo que Valida que se de Click en el Boton Aceptar
     * @param dialogEvent
     */
    public void listenerPopup(DialogEvent dialogEvent) {
        this.operacionExitosa = true;
        if (dialogEvent.getOutcome().ok == DialogEvent.Outcome.ok) {
            try {
                if (actionPopup.compareTo("agregarTarjeta") == 0)
                    this.mensajeRespuesta = agregarTarjeta();
            } catch (Exception e) {
                operacionExitosa = false;
                mensajeRespuesta = ADFUtils.getString(MENSAJE_ERROR_DEFAULT);
                e.printStackTrace();
            }
            println(this, "Popup OK");
        }
        ADFUtils.showPopup(popupMensajeRespuesta);
        ADFUtils.hidePopup(popup);
    }

    // ############## Seccion pagos ##############

    /*Permite obtener el Saldo de la Cuenta*/

    private void consultaSaldo() {
        ParametrosPago parametrosPago = (ParametrosPago)JSFUtils.getBean("ParametrosPago");
        parametrosPago.setTipoPago("CONTROL_REMOTO");
    }

    /*Metodo que se invoca cuando se presiona el boton Pagar*/

    public String popupPagar() {
        ADFUtils.showPopup(popupPagar);
        return "OK";
    }

    /**
     * Metodo que invoka el pago y muestra el resultado en un popup
     * @return
     */
    public String pagar() {
        //DCPagos pago = new DCPagos();
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        Suscriptor suscriptor = sesion.getSuscriptor();
        Usuario usuario = sesion.getUsuario();

        mx.com.sky.sel.services.beans.pagos.FormatoPago fpago = new mx.com.sky.sel.services.beans.pagos.FormatoPago();
        if (importe.getValue() != null)
            fpago.setMonto(Double.valueOf(importe.getValue().toString()));
        fpago.setCuentaSKY(sesion.getCuentaSKY());
        fpago.setPaqueteActual(sesion.getPaquete());
        fpago.setEmail(sesion.getUsuario().getMail());
        fpago.setRowIDSBL(sesion.getSuscriptor().getRowId());
        fpago.setOrganizationID(sesion.getSuscriptor().getOrganizacion());
        fpago.setSistemaFacturacion(sesion.getSistema());
        fpago.setTipoFacturacion(sesion.getSuscriptor().getBillingCode());
        fpago.setPais(sesion.getPais());
        fpago.setMoneda(sesion.getSuscriptor().getCurrencyCode());
        
        Tarjeta tarjetaPago = null;
        for (Tarjeta t : tarjetas)
            if (t.getNumeroTarjeta().equalsIgnoreCase(tipoPago))
                tarjetaPago = t;
        
        if (tarjetaPago.getTipo().equalsIgnoreCase("AMEX")) {
            if (cVVTemp.length() != 4) {
                ADFUtils.showErrorMessage("Debe introducir 4 digitos en el c\u00F3digo de seguridad");
                return null;
            }
        } else {
            if (cVVTemp.length() != 3) {
                ADFUtils.showErrorMessage("Debe introducir 3 digitos en el c\u00F3digo de seguridad");
                return null;
            }
        }
        tarjetaPago.setCodigo(cVVTemp);//cVVTemp
    
        /*fpago.setCCV(cVVTemp);
        fpago.setIdTarjeta(tarjetaPago.getId().toString());*/
        fpago.setTarjeta(tarjetaPago);
        
        fpago.setOrigenPago("SEL: " + comentarios.getValue().toString());
        fpago.setProposito("0");
        fpago.setIdSession(sesion.getIdSesion());
        
        //si hubo error mandar mensaje de error o de aprobado
        operacionExitosa = true;
        
        try {
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.PAGO_ENLINEA,fpago.getOrigenPago());
            BindingContainer bindings = getBindings();
            OperationBinding op = bindings.getOperationBinding("procesaPagoPs");
            op.getParamsMap().put("fpago", fpago);
            Object result = op.execute();
            
            mensajeRespuesta = result.toString();
            println(this, "Respuesta pago :" + mensajeRespuesta);
            mensajeRespuesta = ADFUtils.getString(MENSAJE_PAGO_REALIZADO) + mensajeRespuesta;
        } catch (Exception e) {
            
            //obtiene el mensaje desde el servicio a traves de la excepcion
            mensajeRespuesta = e.getMessage();
            if(mensajeRespuesta == null || mensajeRespuesta.isEmpty()){
              mensajeRespuesta = ADFUtils.getString(MENSAJE_ERROR_PAGO);
            }
            operacionExitosa = false;
            
        }
        
        println(this, "mensaje para el usuario: " + mensajeRespuesta);
        
        //muestra popup indicando si el hubo pagoExitoso
        ADFUtils.showPopup(popupMensajeRespuesta);
        return null;
    }

    /* El Id nos permite realizar las operaciones de Delete y Update*/

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    /**
     *Obtiene el contenedor de bindings
     * @return
     */
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    /**
     * Actualiza la tabla de pagos
     * @return
     */
    private boolean actualizarTablaPagos() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("actualizarTablaPagos");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return false;
        }
        return true;
    }
    public void tipoChanged(ValueChangeEvent e) {
        tipo = e.getNewValue().toString();
    }

    public void mesChanged(ValueChangeEvent e) {
        mes = e.getNewValue().toString();
    }

    public void anioChanged(ValueChangeEvent e) {
        anio = e.getNewValue().toString();
    }

    public Map<String, String> getTipos() {
        return this.tipos;
    }

    public Map<String, String> getMeses() {
        return this.meses;
    }

    public Map<String, String> getAnios() {
        return this.anios;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getAnio() {
        return anio;
    }

    public void setNombre(RichInputText nombre) {
        this.nombre = nombre;
    }

    public RichInputText getNombre() {
        return nombre;
    }

    public void setNo(RichInputText no) {
        this.no = no;
    }

    public RichInputText getNo() {
        return no;
    }

    /*public void setCodigo(RichInputText codigo) {
        this.codigo = codigo;
    }

    public RichInputText getCodigo() {
        return codigo;
    }*/

    public void setInsert(Boolean insert) {
        this.insert = insert;
    }

    public Boolean getInsert() {
        return insert;
    }

    public void setPopup(RichPopup popup) {
        this.popup = popup;
    }

    public void setActionPopup(String actionPopup) {
        this.actionPopup = actionPopup;
    }

    public String getActionPopup() {
        return actionPopup;
    }

    public RichPopup getPopup() {
        return popup;
    }


    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public String getMessagePopup() {
        return messagePopup;
    }

    public void tipoPagoChanged(ValueChangeEvent e) {
        tipoPago = e.getNewValue().toString();
    }

    public void setTiposPago(Map<String, String> tiposPago) {
        this.tiposPago = tiposPago;
    }

    public Map<String, String> getTiposPago() {
        return tiposPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public Saldo getSaldo() {
        return saldo;
    }

    public void setImporte(RichInputText importe) {
        this.importe = importe;
    }

    public RichInputText getImporte() {
        return importe;
    }

    public void setComentarios(RichInputText comentarios) {
        this.comentarios = comentarios;
    }

    public RichInputText getComentarios() {
        return comentarios;
    }

    public void setPopupPagar(RichPopup popupPagar) {
        this.popupPagar = popupPagar;
    }

    public RichPopup getPopupPagar() {
        return popupPagar;
    }

    public void setMensajeRespuesta(String mensajeRespuesta) {
        this.mensajeRespuesta = mensajeRespuesta;
    }

    public String getMensajeRespuesta() {
        return mensajeRespuesta;
    }

    public void setPopupMensajeRespuesta(RichPopup popupMensajeRespuesta) {
        this.popupMensajeRespuesta = popupMensajeRespuesta;
    }

    public RichPopup getPopupMensajeRespuesta() {
        return popupMensajeRespuesta;
    }

    public void setCreditoDebitoMap(Map<String, String> creditoDebitoMap) {
        this.creditoDebitoMap = creditoDebitoMap;
    }

    public Map<String, String> getCreditoDebitoMap() {
        return creditoDebitoMap;
    }

    public void setCreditoDebito(String creditoDebito) {
        this.creditoDebito = creditoDebito;
    }

    public String getCreditoDebito() {
        return creditoDebito;
    }

    public void setCreditoDebitoSelectRadio(RichSelectOneRadio creditoDebitoSelectRadio) {
        this.creditoDebitoSelectRadio = creditoDebitoSelectRadio;
    }

    public RichSelectOneRadio getCreditoDebitoSelectRadio() {
        return creditoDebitoSelectRadio;
    }

    public void creditoDebitChanged(ValueChangeEvent e) {
        this.creditoDebito = e.getNewValue().toString();
    }

    public void cancelarActionListener(ActionEvent actionEvent) {
        this.deseleccionarTarjeta();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        LogPC.println(this, "Serializando BBPago: " + tarjeta);
        LogPC.println(this, "Serializando BBPago: " + id);
    }

    private void readObject(ObjectInputStream in) throws IOException {
        try {
            in.defaultReadObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        LogPC.println(this, "DeSerializando BBPago :" + tarjeta);
        LogPC.println(this, "DeSerializando BBPago: " + id);
    }


    public void setOperacionExitosa(boolean pagoExitoso) {
        this.operacionExitosa = pagoExitoso;
    }

    public boolean isOperacionExitosa() {
        return operacionExitosa;
    }

    /**
     * Termina el pago retornando exitoso o fallido
     * @param dialogEvent
     * @return
     */
    public String terminarPago() {
        if(operacionExitosa){
          return "pago_exitoso";
        }
        return "pago_fallido";
    }

    public void setcVVTemp(String cVVTemp) {
        this.cVVTemp = cVVTemp;
    }

    public String getcVVTemp() {
        return cVVTemp;
    }
    }
