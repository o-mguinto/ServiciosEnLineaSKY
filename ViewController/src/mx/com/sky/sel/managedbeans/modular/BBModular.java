package mx.com.sky.sel.managedbeans.modular;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.services.beans.modulares.Modulo;
import mx.com.sky.sel.services.beans.utils.TarjetaInteligente;
import mx.com.sky.sel.services.ti.SerivcioTarjetaInteligente;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichPopup;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

/**
 * BackingBean asociado a Cambios de Modulos
 */
public class BBModular implements Serializable {
    @SuppressWarnings("compatibility:-2058584820309583365")
    private static final long serialVersionUID = 2774265619496374765L;

    //lista de modulos
    private List<Modulo> modulos = new ArrayList<Modulo>();
    private Map<String, Modulo> modulosNoAsociadosMap = new LinkedHashMap<String, Modulo>();
    //private ServicioModulos servicioModulos = new ServicioModulos();
    //AGREGAR CAMBIAR DESCONECTAR
    private String operacion;
    //nombre de la operacion que se trae desde el bundle
    private String operacionBundle;
    private Modulo modulo = new Modulo();
    private Modulo moduloCambiar = new Modulo();
    private transient RichPopup popupConfirmar;
    private String mensajeResultado;
    private transient RichPopup popupMensajeResultado;
    private transient RichPopup popupCambiar;
    private transient DCIteratorBinding dCSolicitud;
    private boolean editable = true;

    //mensajes
    private static final String MENSAJE_AGREGAR = ADFUtils.getString("bbmodular.agregar");
    private static final String MENSAJE_CAMBIAR = ADFUtils.getString("bbmodular.cambiar");
    private static final String MENSAJE_DESCONECTAR = ADFUtils.getString("bbmodular.desconectar");
    private static final String MENSAJE_MAX_MODULOS = ADFUtils.getString("bbmodular.mensaje.maxmodulos");
    private static final String MENSAJE_MOD_ASOCIADO = ADFUtils.getString("bbmodular.mensaje.moduloyaasociado");
    private static final String MENSAJE_AGREGADO = ADFUtils.getString("bbmodular.mensaje.agregado");
    private static final String MENSAJE_ERROR_AGREGAR = ADFUtils.getString("bbmodular.mensaje.erroralagregar");
    private static final String MENSAJE_NO_AGREGADO = ADFUtils.getString("bbmodular.mensaje.noagregado");
    private static final String MENSAJE_CAMBIADO = ADFUtils.getString("bbmodular.mensaje.cambiado");
    private static final String MENSAJE_ERROR_CAMBIAR = ADFUtils.getString("bbmodular.mensaje.erroralcambiar");
    private static final String MENSAJE_DESCONECTADO = ADFUtils.getString("bbmodular.mensaje.desconectado");
    private static final String MENSAJE_ERROR_DESCONECTAR = ADFUtils.getString("bbmodular.mensaje.erroraldesconectar");

    /**
     * Constructor
     */
    public BBModular() {
        dCSolicitud = ADFUtils.getIterador("consultarModulosAsociadosIterator");

        obtenerModulosNoAsociados();
        LogPC.println(this, "BBModular creado");
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        
        BindingContainer bindings = getBindings();
        OperationBinding opCp = bindings.getOperationBinding("consultarPermisoPs");
        
        opCp.getParamsMap().put("tarjetaInteligente", this.obtenerTarjetaInteligente(sesion.getSuscriptor().getRowId()));
        Object result = opCp.execute();
        editable = Boolean.parseBoolean(result.toString());
        //editable = servicioModulos.consultarPermiso(this.obtenerTarjetaInteligente(sesion.getSuscriptor().getRowId()));
    }

    /**
     * Obtiene los modulos no asociados
     */
    private void obtenerModulosNoAsociados() {
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        BindingContainer bindings = getBindings();
        OperationBinding opCmnoa = bindings.getOperationBinding("consultarModulosNoAsociadosPs");
        
        opCmnoa.getParamsMap().put("cuentaSKY", (sesion.getSuscriptor().getCuentaSKY()));
        Object result = opCmnoa.execute();
        List<Modulo> modulosNoAsociados = (List<Modulo>) result;

        this.modulos = modulosNoAsociados;

        for (Modulo modulo : modulosNoAsociados) {
            modulosNoAsociadosMap.put(modulo.getNombre(), modulo);
        }
    }

    /**
     * Paso 1: Si agrega, cambia o elimina se establece con setPropertyAction
     * la operacion ej. AGREGAR CAMBIAR o DESCONECTAR
     * @return
     */
    public String mostrarPopup() {
        if (this.operacion.equals("CAMBIAR")) {
            LogPC.println(this, "Cambiar modulo");
            ADFUtils.showPopup(popupCambiar);
        } else {
            LogPC.println(this, this.operacion + "modulo");
            ADFUtils.showPopup(popupConfirmar);
        }
        return null;
    }

    /**
     * Paso 3, ejecuta la operacion creando los mensajes
     * @param string
     * @param modulo
     * @param modulo1
     * @param cuentaSky
     * @param tarjetaInteligente
     */
    private void ejecutarOperacion(String operacion, Modulo modulo, Modulo moduloCambiar, String cuentaSky, String tarjetaInteligente) {
        LogPC.println(this, "ejecutar operacion");
        if (operacion.equals("AGREGAR")) {
            agregarModulo(modulo, cuentaSky, tarjetaInteligente);
        } else if (operacion.equals("CAMBIAR")) {
            cambiarModulo(modulo, moduloCambiar, cuentaSky, tarjetaInteligente);
        } else if (operacion.equals("DESCONECTAR")) {
            desconectarModulo(modulo, cuentaSky, tarjetaInteligente);
        }
        //obtener modulos no asociados
        obtenerModulosNoAsociados();
        if (dCSolicitud != null) {
            dCSolicitud.invalidateCache();
        }
    }


    /**
     * Paso 3: "Agregar Modulo", hace la invocacion para agregar el modulo
     * a la cuenta sky del usuario en sesion
     */
    private boolean agregarModulo(Modulo modulo, String cuentaSky, String tarjetaInteligente) {
        //TODO: tambien se podria buscar en los no asociados
        //para validar si se puede o no agregar
        //no se pueden mas de 4 modulos
        BindingContainer bindings = getBindings();
        OperationBinding op = bindings.getOperationBinding("consultarModulosAsociadosPs");
        
        op.getParamsMap().put("cuentaSKY", (cuentaSky));
        Object result = op.execute();
        List<Modulo> modulos = (List<Modulo>) result;
        if (modulos != null && modulos.size() == 4) {
            mensajeResultado = MENSAJE_MAX_MODULOS;
            return false;
        }

        if (!modulosNoAsociadosMap.containsKey(modulo.getNombre())) {
            //si esta asociado a la cuenta no puede continuar
            mensajeResultado = MENSAJE_MOD_ASOCIADO;
            return false;
        }
        boolean esAgregado = false;
        try {
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CAMBIO_DE_MODULO_ADD);
            op = bindings.getOperationBinding("agregarModuloPs");
            op.getParamsMap().put("modulo", (modulo));
            op.getParamsMap().put("cuentaSKY", (cuentaSky));
            op.getParamsMap().put("tarjetaInteligente", (tarjetaInteligente));
            result = op.execute();
            esAgregado = Boolean.parseBoolean(result.toString());
            if (esAgregado) {
                LogPC.println(this, "El modulo fue agregado correctamente");
                mensajeResultado = MENSAJE_AGREGADO;
            } else {
                mensajeResultado = MENSAJE_ERROR_AGREGAR;
                LogPC.printlnWarn(this, "El modulo no pudo ser agregado");
            }
        } catch (Exception e) {
            LogPC.printlnError(this, e.getMessage());
            mensajeResultado = MENSAJE_NO_AGREGADO + e.getMessage();
            esAgregado = false;
        }


        return esAgregado;
    }

    /**
     * Paso 3, Cambio de modulo
     * @param modulo
     * @param moduloCambiar
     * @param cuentaSky
     * @param tarjetaInteligente
     */
    private boolean cambiarModulo(Modulo modulo, Modulo moduloCambiar, String cuentaSky, String tarjetaInteligente) {
        //TODO: tambien se podria buscar en los no asociados
        //para validar si se puede o no cambiar
        if (!modulosNoAsociadosMap.containsKey(moduloCambiar.getNombre())) {
            //si esta asociado a la cuenta no puede continuar
            mensajeResultado = MENSAJE_MOD_ASOCIADO;
            return false;
        }
        boolean esCambiado = false;
        try {
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CAMBIO_DE_MODULO);
            
            BindingContainer bindings = getBindings();
            OperationBinding op = bindings.getOperationBinding("cambiarModuloPs");
            
            op.getParamsMap().put("moduloNuevo", (moduloCambiar));
            op.getParamsMap().put("moduloActual", (modulo));
            op.getParamsMap().put("cuentaSKY", (cuentaSky));
            op.getParamsMap().put("tarjetaInteligente", (tarjetaInteligente));
            
            Object result = op.execute();
            esCambiado = Boolean.parseBoolean(result.toString());
        } catch (Exception e) {
            e.printStackTrace();
            esCambiado = false;
        }
        if (esCambiado) {
            LogPC.println(this, "El modulo fue cambiado correctamente");
            mensajeResultado = MENSAJE_CAMBIADO;
        } else {
            mensajeResultado = MENSAJE_ERROR_CAMBIAR;
            LogPC.printlnWarn(this, "El modulo no pudo ser cambiado");
        }
        return esCambiado;
    }

    /**
     *Paso 3 Desconectar modulo
     * @param modulo
     * @param cuentaSky
     * @param tarjetaInteligente
     */
    private boolean desconectarModulo(Modulo modulo, String cuentaSky, String tarjetaInteligente) {
        boolean esEliminado = false;
        try {
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CAMBIO_DE_MODULO_DESCONECTAR);
            
            BindingContainer bindings = getBindings();
            OperationBinding op = bindings.getOperationBinding("desconectarModuloPs");
            op.getParamsMap().put("modulo", (modulo));
            op.getParamsMap().put("cuentaSKY", (cuentaSky));
            op.getParamsMap().put("tarjetaInteligente", (tarjetaInteligente));
            
            Object result = op.execute();
            esEliminado = Boolean.parseBoolean(result.toString());
        } catch (Exception e) {
            mensajeResultado = e.getMessage();
            e.printStackTrace();
            return false;
        }
        if (esEliminado) {
            LogPC.println(this, "El modulo fue desconectado correctamente");
            mensajeResultado = MENSAJE_DESCONECTADO;
        } else {
            mensajeResultado = MENSAJE_ERROR_DESCONECTAR;
            LogPC.printlnWarn(this, "El modulo no pudo ser desconectado");
        }
        return esEliminado;
    }

    /**
     * Obtiene la tarjeta con jerarquia Master
     * @return
     */
    private String obtenerTarjetaInteligente(String rowId) {
        //TODO: implementar como obtener la tarjeta
        SerivcioTarjetaInteligente sti = new SerivcioTarjetaInteligente();
        List<TarjetaInteligente> tarjetas = sti.getTarjetaInteligente(rowId);
        String tarjetaInteligente = null;
        if (tarjetas != null && !tarjetas.isEmpty()) {
            for (TarjetaInteligente tarjeta : tarjetas) {
                if (tarjeta.getJerarquia().equalsIgnoreCase("Master")) {
                    return tarjeta.getTarjetaInteligente();
                }
            }
            tarjetaInteligente = tarjetas.get(0).getIrd();
        }
        return tarjetaInteligente;
    }

    public void setModulos(List<Modulo> modulos) {
        this.modulos = modulos;
    }

    public List<Modulo> getModulos() {
        return modulos;
    }

    public void setModulo(Modulo moduloAgregar) {
        this.modulo = moduloAgregar;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setPopupConfirmar(RichPopup popupConfirmar) {
        this.popupConfirmar = popupConfirmar;
    }

    public RichPopup getPopupConfirmar() {
        return popupConfirmar;
    }


    public void setPopupMensajeResultado(RichPopup popupMensajeResultado) {
        this.popupMensajeResultado = popupMensajeResultado;
    }

    public RichPopup getPopupMensajeResultado() {
        return popupMensajeResultado;
    }

    public void setMensajeResultado(String mensajeResultado) {
        this.mensajeResultado = mensajeResultado;
    }

    public String getMensajeResultado() {
        return mensajeResultado;
    }

    public void setModuloCambiar(Modulo moduloCambiar) {
        this.moduloCambiar = moduloCambiar;
    }

    public Modulo getModuloCambiar() {
        return moduloCambiar;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
        if (operacion.equals("AGREGAR")) {
            this.operacionBundle = MENSAJE_AGREGAR;
        } else if (operacion.equals("CAMBIAR")) {
            this.operacionBundle = MENSAJE_CAMBIAR;
        } else if (operacion.equals("DESCONECTAR")) {
            this.operacionBundle = MENSAJE_DESCONECTAR;
        }
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacionBundle(String operacionBundle) {
        this.operacionBundle = operacionBundle;
    }

    public String getOperacionBundle() {
        return operacionBundle;
    }

    public void setPopupCambiar(RichPopup popupCambiar) {
        this.popupCambiar = popupCambiar;
    }

    public RichPopup getPopupCambiar() {
        return popupCambiar;
    }

    public void setModulosNoAsociadosMap(Map<String, Modulo> modulosNoAsociadosMap) {
        this.modulosNoAsociadosMap = modulosNoAsociadosMap;
    }

    public Map<String, Modulo> getModulosNoAsociadosMap() {
        return modulosNoAsociadosMap;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public boolean isEditable() {
        return editable;
    }


    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        LogPC.println(this, "Serializando BBModular: " + modulos);
    }

    private void readObject(ObjectInputStream in) throws IOException {
        try {
            in.defaultReadObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        LogPC.println(this, "DeSerializando BBModular :" + modulos);
    }
    
    /**
     *Obtiene el contenedor de bindings
     * @return
     */
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

   
    /**
     * Paso 2: Confirma o rechaza la operacion
     * para AGREGAR, CAMBIAR O DESCONECTAR un modulo
     * @param dialogEvent
     */
    public String confirmarPopUp() {
        // Add event code here...
        LogPC.println(this, "Se ha confirmado la op " + operacion);

        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");

        String cuentaSky = sesion.getSuscriptor().getCuentaSKY();

        String tarjetaInteligente = obtenerTarjetaInteligente(sesion.getSuscriptor().getRowId());

        ejecutarOperacion(this.operacion, this.modulo, this.moduloCambiar, cuentaSky, tarjetaInteligente);

        ADFUtils.showPopup(popupMensajeResultado);
        return null;
    }

    public String cancelarConfirmarPopup() {
        // Add event code here...
        ADFUtils.hidePopup(popupConfirmar);
        cancelarCambiarPopup();
        return null;
    }

    /**
     * Del popup par cambiar modulo
     * @param dialogEvent
     */
    public String cambiarPopup() {
        // Add event code here...
        LogPC.println(this, "Ha seleccionado modulo a cambiar");
        ADFUtils.showPopup(popupConfirmar);
        return null;
    }
    
    public String cancelarCambiarPopup() {
        // Add event code here...
        ADFUtils.hidePopup(popupCambiar);
        return null;
    }

    public String aceptarMensajePopUp() {
        // Add event code here...
        ADFUtils.hidePopup(popupMensajeResultado);
        cancelarConfirmarPopup();
        return null;
    }

    


}
