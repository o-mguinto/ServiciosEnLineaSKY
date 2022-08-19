package mx.com.sky.sel.managedbeans.fiscal;

import java.io.Serializable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;
import java.util.List;

import java.util.TreeMap;

import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

import mx.com.sky.sel.beans.compradatos.PaqueteDatos;
import mx.com.sky.sel.dc.informacionfiscal.DCInformacionFiscal;
import mx.com.sky.sel.services.beans.corporativos.CuentaCV;
import mx.com.sky.sel.services.beans.informacionfiscal.DatosFiscales;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.beans.utils.Direccion;
import  mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import static mx.com.sky.sel.log.LogPC.println;
import static mx.com.sky.sel.log.LogPC.printlnError;
import mx.com.sky.sel.services.utils.SolicitudServicioUtils;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;

import mx.com.sky.sel.services.beans.informacionfiscal.RegimenFiscalBean;

import mx.com.sky.sel.services.beans.informacionfiscal.UsoCFDIBean;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectOneRadio;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;


/**
 * Backingbean de registro y actualizacion de datos fiscales
 */
public class BBFiscal implements Serializable {
    @SuppressWarnings("compatibility:5090069247037668623")
    private static final long serialVersionUID = -7675567429118989709L;

    private boolean readOnlyFiscal;
    private boolean readOnlyHotel;
    private transient RichPopup popupMensajeContratacion; //Popup que informa el estado de la Compra
    private String MensajeContratacion;
    private transient RichPopup popupConfirmar; //Popup de Confirmación de datos
    private transient DCIteratorBinding DCSolicitud_; //Permite tener una referencia al DC

    /*Datos de la Nueva Información Fiscal*/
    private transient RichInputText razonSocial;
    private transient RichInputText rfc;
    private transient RichInputText colonia;
    private transient RichInputText calle;
    private transient RichInputText numExt;
    private transient RichInputText numInt;
    private transient RichInputText poblacion;
    private transient RichInputText estado;
    private transient RichInputText delegMncp;
    private transient RichInputText cp;
    private String tipoPersona;
    private String regimenFiscal;
    private String usoCFDI;
    private List<SelectItem> tiposPersona;
    private List<SelectItem> regimenesFiscalesItemsPerFisicas;
    private List<SelectItem> regimenesFiscalesItemsPerMorales;
    private List<SelectItem> usosCFDIItems;
    private List<RegimenFiscalBean> regimenesFiscalesBeansPerFisicas = null;
    private List<RegimenFiscalBean> regimenesFiscalesBeansPerMorales = null;
    private List<UsoCFDIBean> usosCFDIbeans = null;
    
    private transient String beneficioSelect;
    private boolean botonEnvia;
    private boolean mensajeHotelRazonSocial;
        
    private static final String MENSAJE_SOLICITUD_ENVIADA = "bbfiscal.solicitudenviada";
    private static final String MENSAJE_ERROR_SOLICITUD = "bbfiscal.errorsolicitud";
    private static final String MENSAJE_ERROR_SOLICITUD_PROCESO = "bbfiscal.errorsolicitud.proceso";
    private static final String MENSAJE_MOD_REQUERIDA = "bbfiscal.modificacionrequerida";
    private static final String TIPO_PERSONA_FISICA = "FISICA";
    private static final String TIPO_PERSONA_MORAL = "MORAL";
    private static final String DESCRIPCION_ALTA_INFORMACION_FISCAL = "Alta de Informacion Fiscal Sky";
    private static final String DESCRIPCION_ACTUALIZACION_INFORMACION_FISCAL = "Actualizacion de Informacion Fiscal Sky";


    public BBFiscal() {
        println(this, "BackingBeanInformacionFiscal Creado");
        
        tiposPersona = new ArrayList<SelectItem>();
        tiposPersona.add(new SelectItem(TIPO_PERSONA_FISICA, TIPO_PERSONA_FISICA));
        tiposPersona.add(new SelectItem(TIPO_PERSONA_MORAL, TIPO_PERSONA_MORAL));
        
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        DCInformacionFiscal dcInfoFiscal = new DCInformacionFiscal();
        DatosFiscales datosFiscalesActuales = null;
        SolicitudServicioBean datosFiscalesActualesFromDB = null;
        
        datosFiscalesActuales = dcInfoFiscal.getDatosFiscales(sesion.getSuscriptor().getCuentaSKY(), sesion.getSuscriptor().getNombreSuscriptor());
        if( datosFiscalesActuales != null ) {
            tipoPersona = datosFiscalesActuales.getTipoPersona();
            regimenFiscal = datosFiscalesActuales.getRegimenFiscal();
            usoCFDI = datosFiscalesActuales.getUsoCFDI();
            println(this, "TipoPersona actual from Siebel: " + tipoPersona);
            println(this, "regimenFiscal actual from Siebel: " + regimenFiscal);
            println(this, "usoCFDI actual from Siebel: " + usoCFDI);
        }
        
        //Se comenta, ya no es necesario ir a la BD ya que el WS que va a siebel ya trae los 3 nuevos campos.
//        datosFiscalesActualesFromDB = dcInfoFiscal.consultarDatosFiscales(sesion.getCuentaSKY());
//        if( datosFiscalesActualesFromDB != null && datosFiscalesActualesFromDB.getDatosFiscales() != null ) {
//            tipoPersona = datosFiscalesActualesFromDB.getDatosFiscales().getTipoPersona();
//            regimenFiscal = datosFiscalesActualesFromDB.getDatosFiscales().getRegimenFiscal();
//            usoCFDI = datosFiscalesActualesFromDB.getDatosFiscales().getUsoCFDI();
//            println(this, "TipoPersona actual from DB: " + tipoPersona);
//            println(this, "regimenFiscal actual from DB: " + regimenFiscal);
//            println(this, "usoCFDI actual from DB: " + usoCFDI);
//        }
        
        this.usosCFDIbeans = dcInfoFiscal.consultarUsosCFDI();
        this.usosCFDIItems = crearComboBoxItemsUsosCFDI(this.usosCFDIbeans);
        
        regimenesFiscalesBeansPerFisicas = dcInfoFiscal.consultarRegimenesFiscales(TIPO_PERSONA_FISICA);
        regimenesFiscalesBeansPerMorales = dcInfoFiscal.consultarRegimenesFiscales(TIPO_PERSONA_MORAL);
        
        if( regimenesFiscalesBeansPerFisicas != null && !regimenesFiscalesBeansPerFisicas.isEmpty() ) {
            regimenesFiscalesItemsPerFisicas = this.crearComboBoxItemsRegFiscales(regimenesFiscalesBeansPerFisicas);
        }
        if( regimenesFiscalesBeansPerMorales != null && !regimenesFiscalesBeansPerMorales.isEmpty() ) {
            regimenesFiscalesItemsPerMorales = this.crearComboBoxItemsRegFiscales(regimenesFiscalesBeansPerMorales);
        }
        
        
                if (sesion.getSuscriptor().getOrganizationType().equalsIgnoreCase("Hotel")) {
                    if (!sesion.getSuscriptor().getRazonSocialHotel().isEmpty() && sesion.getSuscriptor().getRazonSocialHotel() != null && sesion.getSuscriptor().getRazonSocialHotel().length() != 0) {
                        botonEnvia = true;
                        mensajeHotelRazonSocial = false; 
                    }else{
                        botonEnvia = false;
                        mensajeHotelRazonSocial = true; 
                    }
                    readOnlyHotel = true;
                }else if (sesion.getUsuario().isCuentaJerarquia()) {
                    botonEnvia = false;
                    mensajeHotelRazonSocial = false; 
                }else{
                    botonEnvia = true;
                    mensajeHotelRazonSocial = false; 
                    readOnlyHotel = false;
                }
    }

    
    public void cancelarModificar(){
        ADFUtils.hidePopup(popupConfirmar);
    }
    /** Paso 1
     * Metodo invocado cuando se presiona el boton aceptar , y que muestra el popup de Confirmacion
     */
    /** Paso 2
     * Metodo llamado desde el Popup de Confirmar
     */
    public String Confirmar() {
        ADFUtils.showPopup(popupConfirmar);
        return "OK";
    }
    
    public void confirmarDatos(){
        modificar();
      }
   
    /* Paso 3
    * Se realiza la Modificación de Información Fiscal
    */

    public String modificar() {
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        List<CuentaCV> cuentasCV = null;
        String resultado = "";
        SolicitudServicioBean sc = new SolicitudServicioBean();
        DatosFiscales df = new DatosFiscales();
        DCInformacionFiscal dcInfoFiscal = new DCInformacionFiscal();

        Direccion direccion = new Direccion();
        direccion.setCalleNumero(calle.getValue().toString());
        direccion.setColonia(colonia.getValue().toString());
        direccion.setCp(cp.getValue().toString());
        direccion.setDelMun(delegMncp.getValue().toString());
        direccion.setEstado(estado.getValue().toString());
        direccion.setNumeroExt(numExt.getValue().toString());
        if (numInt == null) {
            direccion.setNumeroInt("");
        } else if ( numInt.getValue() == null ) {
            direccion.setNumeroInt("");
        } else {
            direccion.setNumeroInt(numInt.getValue().toString());
        }

        direccion.setPoblacion(poblacion.getValue().toString());

        df.setRfc(rfc.getValue().toString());
        df.setRazonSocial(razonSocial.getValue().toString());
        
        //Se comenta la seleccion del tipo de factura, ahora siempre se mandara: Papel y OTA
//        if (sesion.getSuscriptor().getOrganizationType().equalsIgnoreCase("Hotel")) {
//                    if (!beneficioSelect.isEmpty() || beneficioSelect != null) {
//                        if (beneficioSelect.equalsIgnoreCase("si")) {
//                            df.setTipoFactura("Papel Solo");
//                        }else{
//                            df.setTipoFactura("Sin Factura"); 
//                        }
//                    }
//                }else{
//                    df.setTipoFactura("Papel y OTA");
//                }
        df.setTipoFactura("Papel y OTA");
        df.setMetodoEnvio("Correo");
        //Nuevos campos CFDI 4
        df.setTipoPersona(this.tipoPersona);
        df.setRegimenFiscal(this.regimenFiscal);
        df.setUsoCFDI(this.usoCFDI);
        //Nuevos campos CFDI 4
        sc = SolicitudServicioUtils.convert(sc, "Cambio Información Fiscal");
        sc.setDireccion(direccion);
        sc.setDatosFiscales(df);
        sc.setArea("Facturacion");
        sc.setSubArea("Alta de Facturacion");

        String cuentaSKY = "";
        Object oResultado = null;
        try {
            BindingContainer bindings = getBindings();
            if (sesion.isCuentaCV()) {
                OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.REGISTRO_ACTUALIZACION_DATOS_FISCALES,sesion.getUsuario().getNombreCorporativo());
                
                OperationBinding ccaOp = bindings.getOperationBinding("consultarCuentasAsociadas");
                cuentaSKY = sesion.getSuscriptor().getCuentaSKY();
                ccaOp.getParamsMap().put("cuentaSKY", (cuentaSKY));
                cuentasCV = (List<CuentaCV>) ccaOp.execute();
                //operacion crear solicitud para corporativos: DCCorporativos
                OperationBinding scOp = bindings.getOperationBinding("crearSolicitudInfoFiscal");
                scOp.getParamsMap().put("solicitudServicio", (sc));
                scOp.getParamsMap().put("cuentasCV", (cuentasCV));
                scOp.getParamsMap().put("nombreCorporativo", (sesion.getUsuario().getNombreCorporativo()));
                scOp.getParamsMap().put("sistema", (sesion.getSistema()));
                
                oResultado = scOp.execute();

            } else {
                OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.REGISTRO_ACTUALIZACION_DATOS_FISCALES);
                //operacion crear solicitud para normal: DCInformacionFiscal
                
                //Se comentan estas lineas por el requerimiento CDFI 4
                /*OperationBinding sifOp = bindings.getOperationBinding("crearSolicitud");
                sifOp.getParamsMap().put("solicitudServicio", (sc));
                oResultado = sifOp.execute();*/
                //Se comentan estas lineas por el requerimiento CDFI 4
                
                if( this.isActualizarDatosFiscales(sesion.getSuscriptor().getCuentaSKY(), sesion.getSuscriptor().getNombreSuscriptor()) ) {
                    sc.setDescripcion(DESCRIPCION_ACTUALIZACION_INFORMACION_FISCAL);
                    oResultado = dcInfoFiscal.actualizarDatosFiscales(sc);
                } else {
                    sc.setDescripcion(DESCRIPCION_ALTA_INFORMACION_FISCAL);
                    oResultado = dcInfoFiscal.registrarDatosFiscales(sc);
                }
            }
            if (oResultado != null){
                resultado = String.valueOf(oResultado);
                MensajeContratacion = ADFUtils.getString(MENSAJE_SOLICITUD_ENVIADA) + resultado;
            }
            else{
                MensajeContratacion = ADFUtils.getString(MENSAJE_ERROR_SOLICITUD_PROCESO);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            MensajeContratacion = ADFUtils.getString(MENSAJE_ERROR_SOLICITUD);
            printlnError(this, "Error en la modificación de Información Fiscal");
        }
        DCSolicitud_ = ADFUtils.getIterador("obtenerSolicitudServicioIterator");
        DCSolicitud_.invalidateCache(); //Limpiamos la Cache del DC para el refresh
        ADFUtils.hidePopup(popupConfirmar);
        ADFUtils.showPopup(popupMensajeContratacion);
        return null;
    }
    
        public String aceptarCambio() {
            ADFUtils.hidePopup(popupMensajeContratacion);
            return "";
        }
    public void setReadOnlyFiscal(boolean readOnlyFiscal) {
        this.readOnlyFiscal = readOnlyFiscal;
    }

    public boolean isReadOnlyFiscal() {
        return readOnlyFiscal;
    }

    public void setRfc(RichInputText rfc) {
        this.rfc = rfc;
    }

    public RichInputText getRfc() {
        return rfc;
    }

    public void setColonia(RichInputText colonia) {
        this.colonia = colonia;
    }

    public RichInputText getColonia() {
        return colonia;
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

    public void setPoblacion(RichInputText poblacion) {
        this.poblacion = poblacion;
    }

    public RichInputText getPoblacion() {
        return poblacion;
    }

    public void setEstado(RichInputText estado) {
        this.estado = estado;
    }

    public RichInputText getEstado() {
        return estado;
    }

    public void setDelegMncp(RichInputText delegMncp) {
        this.delegMncp = delegMncp;
    }

    public RichInputText getDelegMncp() {
        return delegMncp;
    }

    public void setCp(RichInputText cp) {
        this.cp = cp;
    }

    public RichInputText getCp() {
        return cp;
    }



    public String getMensajeContratacion() {
        return MensajeContratacion;
    }

    public void setPopupMensajeContratacion(RichPopup popupMensajeContratacion) {
        this.popupMensajeContratacion = popupMensajeContratacion;
    }

    public RichPopup getPopupMensajeContratacion() {
        return popupMensajeContratacion;
    }

    public void setPopupConfirmar(RichPopup popupConfirmar) {
        this.popupConfirmar = popupConfirmar;
    }

    public RichPopup getPopupConfirmar() {
        return popupConfirmar;
    }

    public void setRazonSocial(RichInputText razonSocial) {
        this.razonSocial = razonSocial;
    }

    public RichInputText getRazonSocial() {
        return razonSocial;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException {
        try {
            in.defaultReadObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void setReadOnlyHotel(boolean readOnlyHotel) {
        this.readOnlyHotel = readOnlyHotel;
    }

    public boolean isReadOnlyHotel() {
        return readOnlyHotel;
    }

    public void setBeneficioSelect(String beneficioSelect) {
        this.beneficioSelect = beneficioSelect;
    }

    public String getBeneficioSelect() {
        return beneficioSelect;
    }

    public void setBotonEnvia(boolean botonEnvia) {
        this.botonEnvia = botonEnvia;
    }

    public boolean isBotonEnvia() {
        return botonEnvia;
    }

    public void setMensajeHotelRazonSocial(boolean mensajeHotelRazonSocial) {
        this.mensajeHotelRazonSocial = mensajeHotelRazonSocial;
    }

    public boolean isMensajeHotelRazonSocial() {
        return mensajeHotelRazonSocial;
    }
        public BindingContainer getBindings() {
            return BindingContext.getCurrent().getCurrentBindingsEntry();
        }

    public List<SelectItem> getTiposPersona() {
        return tiposPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setRegimenFiscal(String regimenFiscal) {
        this.regimenFiscal = regimenFiscal;
    }

    public String getRegimenFiscal() {
        return regimenFiscal;
    }
    
    public String getRegimenFiscalDescripcion() {
        String regimenFiscalDesc = "";
        
        if( this.tipoPersona != null && !this.tipoPersona.isEmpty() ) {
            if( this.tipoPersona.equalsIgnoreCase(TIPO_PERSONA_FISICA) &&
                this.regimenesFiscalesBeansPerFisicas != null && !this.regimenesFiscalesBeansPerFisicas.isEmpty() ) {
                for( RegimenFiscalBean regFiscal : regimenesFiscalesBeansPerFisicas ) {
                    if( regFiscal.getIdRegFiscal() != null && regFiscal.getIdRegFiscal().equalsIgnoreCase(this.regimenFiscal) ) {
                        regimenFiscalDesc = regFiscal.getIdRegFiscal() + "-" + regFiscal.getDescripcion();
                        break;
                    }
                }
            }
            
            if( this.tipoPersona.equalsIgnoreCase(TIPO_PERSONA_MORAL) &&
                this.regimenesFiscalesBeansPerMorales != null && !this.regimenesFiscalesBeansPerMorales.isEmpty() ) {
                for( RegimenFiscalBean regFiscal : regimenesFiscalesBeansPerMorales ) {
                    if( regFiscal.getIdRegFiscal() != null && regFiscal.getIdRegFiscal().equalsIgnoreCase(this.regimenFiscal) ) {
                        regimenFiscalDesc = regFiscal.getIdRegFiscal() + "-" + regFiscal.getDescripcion();
                        break;
                    }
                }
            }
        }
        
        return regimenFiscalDesc;
    }

    public void setUsoCFDI(String usoCFDI) {
        this.usoCFDI = usoCFDI;
    }

    public String getUsoCFDI() {
        return usoCFDI;
    }
    
    public String getUsoCFDIDescripcion() {
        String usoCFDIDesc = "";
        
        if( this.usoCFDI != null && !this.usoCFDI.isEmpty() &&
            this.usosCFDIbeans != null && !this.usosCFDIbeans.isEmpty() ) {
            for( UsoCFDIBean usoCFDITmp : usosCFDIbeans ) {
                if( usoCFDITmp.getIdUsoCFDI() != null && usoCFDITmp.getIdUsoCFDI().equalsIgnoreCase(this.usoCFDI) ) {
                    usoCFDIDesc = usoCFDITmp.getIdUsoCFDI() + "-" + usoCFDITmp.getDescripcion();
                    break;
                }
            }
        }
        
        return usoCFDIDesc;
    }

    public List<SelectItem> getRegimenesFiscales() {
        List<SelectItem> regimenesFiscales = null;
        println(this, "In getRegimenesFiscales...");
        println(this, "tipoPersona = " + this.tipoPersona);
        if( this.tipoPersona != null && !this.tipoPersona.isEmpty() ) {
            if( this.tipoPersona.equalsIgnoreCase(TIPO_PERSONA_MORAL) ) {
                regimenesFiscales = this.regimenesFiscalesItemsPerMorales;
            } else {
                regimenesFiscales = this.regimenesFiscalesItemsPerFisicas;
            }
        } else {
            regimenesFiscales = this.regimenesFiscalesItemsPerFisicas;
        }
        
        return regimenesFiscales;
    }

    private List<SelectItem> crearComboBoxItemsRegFiscales(List<RegimenFiscalBean> regimenesFiscalesBeans) {
        List<SelectItem> comboBoxItemsRegFiscales = new ArrayList<SelectItem>();
        
        for(RegimenFiscalBean regFiscalBean : regimenesFiscalesBeans) {
            comboBoxItemsRegFiscales.add(new SelectItem(regFiscalBean.getIdRegFiscal(), regFiscalBean.getIdRegFiscal() + "-" + regFiscalBean.getDescripcion()));
        }
        
        return comboBoxItemsRegFiscales;
    }
    
    private List<SelectItem> crearComboBoxItemsUsosCFDI(List<UsoCFDIBean> UsosCFDIBeans) {
        List<SelectItem> comboBoxItemsUsosCFDI = new ArrayList<SelectItem>();
        
        if( UsosCFDIBeans != null && !UsosCFDIBeans.isEmpty() ) {
            for(UsoCFDIBean usoCFDI : UsosCFDIBeans) {
                comboBoxItemsUsosCFDI.add(new SelectItem(usoCFDI.getIdUsoCFDI(), usoCFDI.getIdUsoCFDI() + "-" + usoCFDI.getDescripcion()));
            }
        }
        
        return comboBoxItemsUsosCFDI;
    }
    
    public void actualizarTipoPersonaListener(ValueChangeEvent valueChangeEvent) {
        this.tipoPersona = (String)valueChangeEvent.getNewValue();
        if(this.tipoPersona != null){
            LogPC.println(this, "In actualizarTipoPersonaListener... tipoPersona: " + this.tipoPersona);
        }
    }
    
    public void actualizarRegimenFiscalListener(ValueChangeEvent valueChangeEvent) {
        this.regimenFiscal = (String)valueChangeEvent.getNewValue();
        if(this.regimenFiscal != null){
            LogPC.println(this, "In actualizarRegimenFiscalListener... regimenFiscal: " + this.regimenFiscal);
        }
    }

    private boolean isActualizarDatosFiscales(String cuentaSKY, String nombreSuscriptor) {
        DatosFiscales datosFiscalesActualesCRM = null;
        boolean isActualizarDatosFiscales = false;
        DCInformacionFiscal dcInfoFiscal = new DCInformacionFiscal();

        datosFiscalesActualesCRM = dcInfoFiscal.getDatosFiscales(cuentaSKY, nombreSuscriptor);
        
        if( datosFiscalesActualesCRM != null && datosFiscalesActualesCRM.getDireccion() != null &&
            datosFiscalesActualesCRM.getDireccion().getCp() != null && !datosFiscalesActualesCRM.getDireccion().getCp().isEmpty() ) {
            isActualizarDatosFiscales = true;
        }
        
        
        return isActualizarDatosFiscales;
    }

    public List<SelectItem> getUsosCFDIItems() {
        return usosCFDIItems;
    }
}
