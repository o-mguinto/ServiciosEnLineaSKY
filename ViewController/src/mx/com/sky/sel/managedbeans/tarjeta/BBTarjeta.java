package mx.com.sky.sel.managedbeans.tarjeta;

import java.io.Serializable;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.PostConstruct;

import javax.faces.application.FacesMessage;
import javax.faces.component.UISelectItems;
import javax.faces.component.html.HtmlInputHidden;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import mx.com.sky.sel.beans.utils.Usuario;
import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import static mx.com.sky.sel.log.LogPC.println;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.services.beans.pagos.tarjetas.Bines;
import mx.com.sky.sel.services.beans.pagos.tarjetas.Tarjeta;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.pagos.administratarjeta.ServicioTarjetaPSManagementLocal;
import mx.com.sky.sel.services.pagos.tarjetas.ServicioBines;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.Constantes;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.UtileriasMB;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectOneRadio;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.event.PopupCanceledEvent;

import oracle.binding.BindingContainer;
import oracle.binding.DataControl;
import oracle.binding.OperationBinding;

import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;


public class BBTarjeta extends UtileriasMB implements Serializable {
    @SuppressWarnings("compatibility:3708490536466250668")
    private static final long serialVersionUID = -6736994067212321218L;

    private Boolean insert; //Permite identificar si se activa el boton Agregar, Eliminar o Cancelar
    private String actionPopup;
    private String messagePopup;
    private Boolean operacionConError;

    private static final String TARJETA_AMEX = "bbpago.tipotarjeta.amex";
    private static final String TARJETA_VISA = "bbpago.tipotarjeta.visa";
    private static final String TARJETA_MASTERCARD = "bbpago.tipotarjeta.mastercard";
    private static final String TARJETA_CREDITO = "bbpago.tipotarjeta.credito";
    private static final String TARJETA_DEBITO = "bbpago.tipotarjeta.debito";
    private static final String MENSAJE_AGREGAR_TARJETA = "bbpago.agregartarjeta";
    private static final String MENSAJE_ELIMINAR_TARJETA = "bbpago.eliminartarjeta";
    private static final String MENSAJE_MODIFICAR_TARJETA = "bbpago.modificartarjeta";
    private static final String MENSAJE_ERROR_AMEX = "tarjeta.error.numeroincorrectoamex";
    private static final String MENSAJE_ERROR_OTRO_TIPO = "tarjeta.error.numeroincorrectootrotipo";
    private static final String MENSAJE_ERROR_FECHA = "tarjeta.error.fechavigencia";
    private static final String MENSAJE_ERROR_CODIGO = "tarjeta.error.codigo";
    private static final String MENSAJE_ERROR_CODIGO_NO_AMEX = "tarjeta.error.codigootrotipo";

    private Tarjeta tarjeta;
    private List<Tarjeta> tarjetasPci;
    private String id;
    private transient RichPopup popup;
    private transient RichPopup popupMensajeRespuesta;
    private Map<String, String> tipos;
    private Map<String, String> meses;
    private Map<String, String> anios;
    private Map<String, String> creditoDebitoMap;
    private Map<String, String> terminos;
    private String mensajeRespuesta;
    private transient RichInputText inputTDCCod;
    private transient RichInputText inputTDC;
    private String refreshPage;
    private String sterminos;
    private String tipoTarjetaBines;
    private String tipoTarjeta;
    private Boolean tarjetaValida;
    private String phase;
    private String keyId;
    
    private transient RichSelectOneRadio selectOneChoiceAviso;
    private transient UISelectItems siAviso;
    private transient HtmlInputHidden tarjetaProtegida;
    private transient HtmlInputHidden key_Id;
    private transient HtmlInputHidden phase_Id;

    public BBTarjeta(){
        println(this, "BBTarjeta Creado");
        refreshPage = "";
        tipos = new LinkedHashMap<String, String>();
        tipos.put(ADFUtils.getString(TARJETA_VISA), "VISA");
        tipos.put(ADFUtils.getString(TARJETA_MASTERCARD), "MASTERCARD");
        tipos.put(ADFUtils.getString(TARJETA_AMEX), "AMEX"); //label, value

       
        
        /*meses = new LinkedHashMap<String, String>();
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
        int anio = Calendar.getInstance().get(Calendar.YEAR);
        anio = anio % 100;
        for (int i = anio; i <= (anio + 10); i++)
            anios.put(String.valueOf(i), String.valueOf(i));
        */
        creditoDebitoMap = new LinkedHashMap<String, String>();
        creditoDebitoMap.put(ADFUtils.getString(TARJETA_CREDITO), "01");
        creditoDebitoMap.put(ADFUtils.getString(TARJETA_DEBITO), "02");


        tarjeta = new Tarjeta();
        insert = true;
        
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_TDC);
        tipoTarjetaBines="";
        tipoTarjeta=null;
        tarjetaValida=false;
    }
    @PostConstruct
    void init() {
        //limpiaCampos();  
        cargaAniosyMesesVencimiento();
        //para el onechoice de terminos y condiciones
        selectOneChoiceAviso = new RichSelectOneRadio();
        selectOneChoiceAviso.resetValue();
        ADFUtils.addPartialTarget(selectOneChoiceAviso);
        terminos = new LinkedHashMap<String, String>();
        sterminos = ADFUtils.getString("mensaje_terminos1")+ADFUtils.getString("mensaje_terminos2");
        terminos.put(ADFUtils.getString("mensaje_terminos1"), sterminos);
        tarjetasPci =obtenerTarjetas();
    }
    
    @SuppressWarnings("deprecation")
    private void cargaAniosyMesesVencimiento(){  
        Calendar hoy = Calendar.getInstance(new Locale("ES"));
        
        Date fechaAux= new Date();
        //if(lstMesVencimiento==null){   
          SimpleDateFormat formateador;
          String  strMes;
            int auxMes;
          //lstMesVencimiento=new ArrayList <SelectItem>();
          meses = new LinkedHashMap<String, String>();
          formateador=new SimpleDateFormat("MMMM", new Locale("ES"));        
            for (int intMes=0; intMes<12; intMes++) { // Se llena el arreglo de meses 
                
                fechaAux.setMonth(intMes);
                hoy.set(Calendar.MONTH, intMes);
                
                strMes = formateador.format(hoy.getTime());
                //strMes = formateador.format(fechaAux);
                strMes=Character.toUpperCase(strMes.charAt(0))+strMes.substring(1);
                if(intMes==1){
                    strMes="Febrero"; 
                }
                auxMes=intMes+1;
                if(intMes<9){                   
                    meses.put(strMes, "0"+auxMes);//lstMesVencimiento.add(new SelectItem("0"+auxMes ,strMes));    
                }else{
                    meses.put(strMes , ""+auxMes);//lstMesVencimiento.add(new SelectItem(""+auxMes ,strMes)); 
                }                               
            }
            
        anios = new LinkedHashMap<String, String>();
        Integer anio;
        anio = Calendar.getInstance().get(Calendar.YEAR);
        //anio = anio % 100;
        //for (int i = anio; i < (anio + Constantes.RANGO_ANIO_VENCIMIENTO_TARJETAS); i++)
        for (int i = 0; i < Constantes.RANGO_ANIO_VENCIMIENTO_TARJETAS; i++){
            //anios.put(String.valueOf(i), String.valueOf(i));
            anios.put(String.valueOf(anio), anio.toString().substring(2));
            anio++;
        }
        //} 
    }
    /**
     *Metodo que carga los datos de una tarjeta para editarla en version iPad
     * Metodo invocado cuando se da click en el enlace Editar
     * @return
     */
    public String selectTarjetaUpdate() {
        for (Tarjeta t : obtenerTarjetas()) {
            if (Integer.valueOf(id).equals(t.getId())) {
                tarjeta = t;
            }
        }
        return "modificar";
    }

    /**
     * Metodo Invocado cuando se da Click al boton Agregar
     * @return
     */
    public String popupAgregar() {
        boolean esValido = true;
        actionPopup = "agregarTarjeta";
        if(!tarjetaValida ){
            LogPC.printlnError(this,"No se ha identificado el tipo de la marca de la tarjeta, favor de validar el número de tarjeta");
            mostrarMensaje("No se ha identificado el tipo de la marca de la tarjeta, favor de validar el número de tarjeta", FacesMessage.SEVERITY_INFO);  
        }else{
            if(!validarTarjeta()){
                mostrarMensaje(getMensajeProperties("msj_ErrFljPrg"), FacesMessage.SEVERITY_INFO);   
            }
            else{
            if (!validaLongTipoTarjeta(this.tarjeta)) {
                if (this.tarjeta
                        .getTipo()
                        .equalsIgnoreCase(getMensajeProperties("DESC_TARJETA_AMEX")))
                    ADFUtils.showErrorMessage(ADFUtils.getString(MENSAJE_ERROR_AMEX));
                else
                    ADFUtils.showErrorMessage(ADFUtils.getString(MENSAJE_ERROR_OTRO_TIPO));
                esValido = false;
            }
            if (!validaFecha(tarjeta.getMes(), tarjeta.getAnio())) {
                ADFUtils.showErrorMessage(ADFUtils.getString(MENSAJE_ERROR_FECHA));
                esValido = false;
            }
            /* PCI ya no guardamos el CVV
            if (!validaCodigo(tarjeta)) {
                if (this.tarjeta.getTipo().equalsIgnoreCase("AMEX"))
                    ADFUtils.showErrorMessage(ADFUtils.getString(MENSAJE_ERROR_CODIGO));
                else
                    ADFUtils.showErrorMessage(ADFUtils.getString(MENSAJE_ERROR_CODIGO_NO_AMEX));
                esValido = false;
            }*/
            if (esValido) {
                messagePopup = ADFUtils.getString(MENSAJE_AGREGAR_TARJETA);
                ADFUtils.showPopup(popup);
            }
        }
        }
        return "stay";
    }
    private boolean validarTarjeta(){
                if((!tarjetaProtegida.getValue().toString().isEmpty()) 
                   && !key_Id.getValue().toString().isEmpty()
                   && !phase_Id.getValue().toString().isEmpty()){
                return true;
        }
    return false;
    }
    /**
     * Valida si la tarjeta es AMEX que tenga 15 digitos.
     * @param tarjeta
     * @return
     */
    private boolean validaLongTipoTarjeta(Tarjeta tarjeta) {
        LogPC.println(this, "validaLongTipoTarjeta!!!" + tarjeta);
        if (tarjeta.getTipo() == null) {
            return false;
        }
        if (tarjeta.getTipo().equals(getMensajeProperties("DESC_TARJETA_AMEX"))) {
            return (tarjeta.getNumeroTarjeta().length() == 15);
        } else {
            return (tarjeta.getNumeroTarjeta().length() == 16);
        }
        //return true;
    }

    private boolean validaCodigo(Tarjeta tarjeta) {
        if (tarjeta.getTipo() == null) {
            return false;
        }
        if (tarjeta.getTipo().equals("AMEX")) {
            return (tarjeta.getCodigo().length() == 4);
        } else {
            return (tarjeta.getCodigo().length() == 3);
        }
        //return true;
    }

    /**
     * Metodo Invocado cuando se da Click al enlace Eliminar
     * @return
     */
    public String popupEliminar() {
        //if(selectOneChoiceAviso.getValue().equals(null)){
            selectOneChoiceAviso.setValue(sterminos);
            ADFUtils.addPartialTarget(selectOneChoiceAviso);
        //}
        actionPopup = "eliminarTarjeta";
        messagePopup = ADFUtils.getString(MENSAJE_ELIMINAR_TARJETA);
        for (Tarjeta t : obtenerTarjetas()) {
            if (t.getId().equals(Integer.valueOf(id))) {
                tarjeta = t;
            }
        }
        ADFUtils.showPopup(popup);
        return "stay";
    }

    /**
     * Metodo que Deselecciona la Tarjeta
     */
    public void deseleccionarTarjeta() {
        tarjeta = new Tarjeta();
        insert = true;
    }

    /**
     * Metodo que Valida que se de Click en el Boton Aceptar
     * @param dialogEvent
     */
    public String listenerPopup() {
        
            operacionConError = false;
            try {
                if (actionPopup.compareTo("agregarTarjeta") == 0){
                    //valores voltage
                    tarjeta.setKeyId(getKey_Id().getValue().toString());
                    tarjeta.setPhase(getPhase_Id().getValue().toString());
                    this.mensajeRespuesta = guardarTarjeta();
                }
                if (actionPopup.compareTo("eliminarTarjeta") == 0)
                    this.mensajeRespuesta = eliminarTarjeta();
            } catch (Exception e) {
                operacionConError = true;
                this.mensajeRespuesta = e.getMessage();
                if (this.mensajeRespuesta == null || this.mensajeRespuesta.isEmpty()) {
                    this.mensajeRespuesta = "Intente mas tarde";

                }
                e.printStackTrace();
            }
            println(this, "Popup OK");
        
        //delete tarjeta
        
        selectOneChoiceAviso.resetValue();
        ADFUtils.showPopup(popupMensajeRespuesta);
        ADFUtils.hidePopup(popup);
        actualizarTablaTarjetas();
        return null;
    }

    public String cancelarOperacion(){
        selectOneChoiceAviso.resetValue();
        ADFUtils.addPartialTarget(selectOneChoiceAviso);
        ADFUtils.hidePopup(popup);
        return null;
    }
    
    /**
     * Metodo que permite agregar la Tarjeta Seleccionada
     * @return
     * @throws Exception
     */

    public String agregarTarjeta() throws Exception {
        BindingContainer bindings = getBindings();
        OperationBinding opAdd = bindings.getOperationBinding("agregarTarjetaPs");

        ConfigMenu sesion = (ConfigMenu) JSFUtils.getBean("sesion");
        Usuario user = sesion.getUsuario();
        String uuid = user.getUid();
        String organizationID = sesion.getSuscriptor().getOrganizacion();

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

    /**
     * Metodo que permite agregar la Tarjeta Seleccionada
     * @return
     * @throws Exception
     */

    public String guardarTarjeta() throws Exception {
        BindingContainer bindings = getBindings();
        OperationBinding opAdd = bindings.getOperationBinding("guardarTarjetaPs");

        ConfigMenu sesion = (ConfigMenu) JSFUtils.getBean("sesion");
        String organizationID = sesion.getSuscriptor().getOrganizacion();

        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.MIS_TARJETAS_ADD);
        Tarjeta tarjetaV = tarjeta;
        tarjetaV.setNumeroTarjeta(getTarjetaProtegida().getValue().toString());
        
        opAdd.getParamsMap().put("tarjeta", tarjetaV);
        opAdd.getParamsMap().put("numeroCuentaCliente", sesion.getSuscriptor().getCuentaSKY());
        opAdd.getParamsMap().put("organizationID", organizationID);
        Object result = opAdd.execute();

        String salida = result.toString();
        println(this, "Agregando tarjeta : " + salida);
        clear();
        return salida;
    }
    
    /**
     *
     * @param tarjeta
     * @param organizationId
     * @return
     * @throws ServicioException
     */
    public Tarjeta consultarBinesTDC(Tarjeta tarjeta, String organizationId) throws ServicioException {
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_BINES);
        tarjetaValida=false;
        ServicioBines sb = new ServicioBines();
        Bines bines = null;
        LogPC.println(this, "consultarBinesTDC [" + organizationId + "] " + tarjeta);
        bines = sb.validarBines(tarjeta.getNumeroTarjeta(), organizationId);
        if (bines.isTarjetaValida()) {
            tarjetaValida=true;
            tipoTarjetaBines=bines.getTipoTarjeta();
            tarjeta.setCreditoDebito(bines.getCd());
            tarjeta.setTipo(bines.getTipoTarjeta());
            tarjeta.setCreditoDebitoTexto(
            //si null entonces vacio
            bines.getCd() == null ? "" :
                //si 01 entonces credito
                bines.getCd().equals("01") ?
                "Crédito" :
                //si otro entonces debito
                "Débito");

            if(tipoTarjetaBines!=null && !tipoTarjetaBines.isEmpty()){
                if(tipoTarjetaBines.equalsIgnoreCase(getMensajeProperties("TIPO_TARJETA_VISA"))){
                    tipoTarjeta=getMensajeProperties("DESC_TARJETA_VISA");  
                    addScriptOnPartialRequest("protect_form_tarjeta();");
                }else if(tipoTarjetaBines.equalsIgnoreCase(getMensajeProperties("TIPO_TARJETA_MASTER_CARD"))){
                    tipoTarjeta=getMensajeProperties("DESC_TARJETA_MASTER_CARD"); 
                    addScriptOnPartialRequest("protect_form_tarjeta();");
                }else if(tipoTarjetaBines.equalsIgnoreCase(getMensajeProperties("TIPO_TARJETA_AMEX"))){
                    tipoTarjeta=getMensajeProperties("DESC_TARJETA_AMEX");
                    addScriptOnPartialRequest("protect_form_tarjeta();");
                }else{
                    LogPC.printlnError(this, "Tipo de tarjeta no valida");  
                }
                tarjeta.setTipo(tipoTarjeta);
            }          
        } else {
            getTarjetaProtegida().resetValue();
            getKey_Id().resetValue();
            getPhase_Id().resetValue();
            LogPC.printlnError(this,"Error al realizar la validación de los bines de la tarjeta ingresada");
        }
        return tarjeta;
    }

    /**
     * Obtiene el usuario uid de la sesion
     * @return
     */
    private List<Tarjeta> obtenerTarjetas() {
        List<Tarjeta> tarjetas = new ArrayList<Tarjeta>();
        DCIteratorBinding DCTarjetas_ = ADFUtils.getIterador("consultarTarjetasIterator");
        DCDataControl dcd = DCTarjetas_.getDataControl();
        DataControl dc = dcd.getAdaptedDC();
        ServicioTarjetaPSManagementLocal dcT = (ServicioTarjetaPSManagementLocal) dc.getDataProvider();
        ConfigMenu sesion = (ConfigMenu) JSFUtils.getBean("sesion");
        String numeroCuentaCliente = sesion.getSuscriptor().getCuentaSKY();
        //tarjetas = dcT.obtenerTarjetas(uuid);
        tarjetas = dcT.consultarTarjetasPs(numeroCuentaCliente, "1", "1");

        println(this, tarjetas.size() + " Tarjetas obtenidas desde el DC");

        return tarjetas;
    }

    /**
     * Metodo que permite Eliminar la Tarjeta Seleccionada
     * */
    private String eliminarTarjeta() throws Exception {
        
        BindingContainer bindings = getBindings();
        OperationBinding opDel = bindings.getOperationBinding("eliminarTarjetaPs");

        ConfigMenu sesion = (ConfigMenu) JSFUtils.getBean("sesion");
        String numeroCuentaCliente = sesion.getSuscriptor().getCuentaSKY();
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.MIS_TARJETAS_DELETE);

        opDel.getParamsMap().put("numeroCuentaCliente", numeroCuentaCliente);
        opDel.getParamsMap().put("idTarjeta", tarjeta.getId());
        opDel.getParamsMap().put("keyId", tarjeta.getKeyId());
        opDel.getParamsMap().put("phase", tarjeta.getPhase());

        Object result = opDel.execute();

        String salida = result.toString();

        println(this, "Eliminando tarjeta : " + salida);
        /* Inicializamos el DCTarjetas para refrescar la tabla de Tarjetas*/
        clear();
        return salida;
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
    private boolean actualizarTablaTarjetas() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("actualizarTablaTarjetas");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return false;
        }
        return true;
    }

    /**Metodo de limpieza*/
    private void clear() {
        tarjetaValida=false;
        deseleccionarTarjeta();
        tipoTarjetaBines="";
        tipoTarjeta=null;
        getTarjetaProtegida().resetValue();
        getKey_Id().resetValue();
        getPhase_Id().resetValue();
    }
   
    public void setInsert(Boolean insert) {
        this.insert = insert;
    }

    public Boolean getInsert() {
        return insert;
    }

    public void setActionPopup(String actionPopup) {
        this.actionPopup = actionPopup;
    }

    public String getActionPopup() {
        return actionPopup;
    }

    public void setMessagePopup(String messagePopup) {
        this.messagePopup = messagePopup;
    }

    public String getMessagePopup() {
        return messagePopup;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setPopup(RichPopup popup) {
        this.popup = popup;
    }

    public RichPopup getPopup() {
        return popup;
    }

    public void setTipos(Map<String, String> tipos) {
        this.tipos = tipos;
    }

    public Map<String, String> getTipos() {
        return tipos;
    }

    public void setMeses(Map<String, String> meses) {
        this.meses = meses;
    }

    public Map<String, String> getMeses() {
        return meses;
    }

    public void setAnios(Map<String, String> anios) {
        this.anios = anios;
    }

    public Map<String, String> getAnios() {
        return anios;
    }

    public void setCreditoDebitoMap(Map<String, String> creditoDebitoMap) {
        this.creditoDebitoMap = creditoDebitoMap;
    }

    public Map<String, String> getCreditoDebitoMap() {
        return creditoDebitoMap;
    }

    public void setPopupMensajeRespuesta(RichPopup popupMensajeRespuesta) {
        this.popupMensajeRespuesta = popupMensajeRespuesta;
    }

    public RichPopup getPopupMensajeRespuesta() {
        return popupMensajeRespuesta;
    }

    public void setMensajeRespuesta(String mensajeRespuesta) {
        this.mensajeRespuesta = mensajeRespuesta;
    }

    public String getMensajeRespuesta() {
        return mensajeRespuesta;
    }


    private boolean validaFecha(String mesSelected, String anioSelected) {
        //si uno de los dos es null
        Calendar hoy = Calendar.getInstance();
        int mesActual = hoy.get(Calendar.MONTH) + 1;
        int anioActual = hoy.get(Calendar.YEAR) - 2000;

        int anioSelected_ = 0;
        int mesSelected_ = 0;


        anioSelected_ = Integer.parseInt(anioSelected);
        mesSelected_ = Integer.parseInt(mesSelected);

        //comparo
        if (anioSelected_ < anioActual) {
            return false;
        } else if (anioSelected_ == anioActual) {
            //valido mes

            if (mesSelected_ < mesActual) {
                return false;
            }

        }

        return true;

    }

    public void setOperacionConError(Boolean operacionConError) {
        this.operacionConError = operacionConError;
    }

    public Boolean getOperacionConError() {
        return operacionConError;
    }

    public void setInputTDCCod(RichInputText inputTDCCod) {
        this.inputTDCCod = inputTDCCod;
    }

    public RichInputText getInputTDCCod() {
        return inputTDCCod;
    }

    public void setInputTDC(RichInputText inputTDC) {
        this.inputTDC = inputTDC;
    }

    public RichInputText getInputTDC() {
        return inputTDC;
    }

   
    
    public String aceptarOperacion() {
        ADFUtils.hidePopup(popupMensajeRespuesta);
        return "";
    }

    public void popupCancelListener(PopupCanceledEvent popupCanceledEvent) {
        // Add event code here...
        //para controlar cuando es eliminacion
        selectOneChoiceAviso.resetValue();
        ADFUtils.addPartialTarget(selectOneChoiceAviso);
    }
    
    public void setSelectOneChoiceAviso(RichSelectOneRadio selectOneChoiceAviso) {
        this.selectOneChoiceAviso = selectOneChoiceAviso;
    }

    public RichSelectOneRadio getSelectOneChoiceAviso() {
        return selectOneChoiceAviso;
    }

    public void setTerminos(Map<String, String> terminos) {
        this.terminos = terminos;
    }

    public Map<String, String> getTerminos() {
        return terminos;
    }

    public void setSiAviso(UISelectItems siAviso) {
        this.siAviso = siAviso;
    }

    public UISelectItems getSiAviso() {
        return siAviso;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getPhase() {
        return phase;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getKeyId() {
        return keyId;
    }


    public void lstnrValueChangeNumeroTarjeta(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        cambiarTarjeta(valueChangeEvent.getNewValue().toString());
    }
    public void cambiarTarjeta(String noTarjeta){
        tarjeta.setNumeroTarjeta(noTarjeta);
        tipoTarjeta="";
        key_Id.setValue("");
        phase_Id.setValue("");
        tarjetaProtegida.setValue("");
        if(tarjeta.getNumeroTarjeta()!=null){
            if (tarjeta.getNumeroTarjeta().length()==Constantes.TAMANIO_TARJETA_AMEX || tarjeta.getNumeroTarjeta().length()==Constantes.TAMANIO_TARJETA){
                String bines=tarjeta.getNumeroTarjeta().substring(0,Constantes.TAMANIO_BINES);
                LogPC.println(this,"Codigo bin a validar de la tarjeta:"+bines);
                //validaTarjeta(bines);
                ConfigMenu sesion = (ConfigMenu) JSFUtils.getBean("sesion");
                        String organizationId = sesion.getSuscriptor().getOrganizacion();

                try {
                            this.tarjeta = consultarBinesTDC(tarjeta, organizationId);
                        } catch (ServicioException e) {
                            ADFUtils.showErrorMessage(e.getMessage());
                            /*esValido = false;
                            return "stay";*/
                        }
            }
        }
    }
    /*
    * Add a script to the render kit
    */
    public static void addScriptOnPartialRequest(String script) {
        FacesContext context = FacesContext.getCurrentInstance();
        if (AdfFacesContext.getCurrentInstance().isPartialRequest(context)) {
            ExtendedRenderKitService erks =
            Service.getRenderKitService(context, ExtendedRenderKitService.class);
            erks.addScript(context, script);
        }
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTarjetaValida(Boolean tarjetaValida) {
        this.tarjetaValida = tarjetaValida;
    }

    public Boolean getTarjetaValida() {
        return tarjetaValida;
    }

    public void setTarjetaProtegida(HtmlInputHidden tarjetaProtegida) {
        this.tarjetaProtegida = tarjetaProtegida;
    }

    public HtmlInputHidden getTarjetaProtegida() {
        return tarjetaProtegida;
    }

    public void setKey_Id(HtmlInputHidden key_Id) {
        this.key_Id = key_Id;
    }

    public HtmlInputHidden getKey_Id() {
        return key_Id;
    }

    public void setPhase_Id(HtmlInputHidden phase_Id) {
        this.phase_Id = phase_Id;
    }

    public HtmlInputHidden getPhase_Id() {
        return phase_Id;
    }

    public void setTarjetasPci(List<Tarjeta> tarjetasPci) {
        this.tarjetasPci = tarjetasPci;
    }

    public List<Tarjeta> getTarjetasPci() {
        return tarjetasPci;
    }
}
