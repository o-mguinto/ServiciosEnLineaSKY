package mx.com.sky.sel.managedbeans.cambiopaquete;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import mx.com.sky.sel.services.beans.cambiopaquete.Paquete;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.beans.utils.ServiciosCuenta;
import mx.com.sky.sel.services.beans.utils.Suscriptor;
import mx.com.sky.sel.services.beans.utils.TarjetaInteligente;
import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.services.cambiopaquete.ServicioCambioPaquete;
import mx.com.sky.sel.services.cambiopaquete.ServicioUpgradePaquete;
import mx.com.sky.sel.services.dualplay.consulta.ServicioDualPlay;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.ordenpendiente.ServicioOrdenPendiente;
import mx.com.sky.sel.services.saldo.ServicioSaldo;
import mx.com.sky.sel.services.ti.SerivcioTarjetaInteligente;
import mx.com.sky.sel.services.utils.SolicitudServicioUtils;
import mx.com.sky.sel.services.vetv.ServicioVeTV;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.managedbeans.sesion.SesionMB;

import mx.com.sky.sel.utils.UtileriasMB;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import org.apache.myfaces.trinidad.context.RequestContext;
import org.apache.myfaces.trinidad.event.ReturnEvent;

public class BBCambioPaquete extends UtileriasMB implements Serializable{
    @SuppressWarnings("compatibility:1238058215230384216")
    private static final long serialVersionUID = -4916419139078057517L;
    private transient RichPopup popupConfirmacion;
    private transient RichPopup popupPenalizacion;

    private List<List<Paquete>> mosaicoPaquetes;
    private String idPaquete;
    private Paquete paquetes[];
    private Paquete paquete; //Contiene el paquete seleccionado

    private String mensaje;
    private transient RichPopup popupMensaje;

    private Boolean cambioExitoso = false;
    private boolean requierePenalizacion = false;

    private static final String MENSAJE_SOLICITUD_ENVIADA = "bbcambiopaquete.solicitudenviada";
    private static final String MENSAJE_SOLICITUD_ENVIADA_ACCESS = "bbcambiopaquete.solicitudenviada.vetv";
    private static final String MENSAJE_ERROR = "bbcambiopaquete.errorsolicitud";
    private boolean paqueteVETV;
    private boolean cambioPaqueteVETV;
    private Double CostoVetvEquipo = 0.0;
    private Double CostoVetvDosEquipo = 0.0;
    private ServicioVeTV costoPaquete = null;
    public BBCambioPaquete() {
        LogPC.println(this, "BBCambioPaquete Creado");
        obtenerCPaquetes();
    }
    
    @PostConstruct
    public void init(){
        
    }
    /*Obtenemos la lista de Paquetes para pintar el Mosaico*/

    private void obtenerCPaquetes() {
        this.paquetes = new Paquete[10];
        mosaicoPaquetes = new ArrayList<List<Paquete>>();
        int contadorInterno = 0;
        int contadorPaquete = 0;
        List<Paquete> rowPaquetes = null;
        ServicioCambioPaquete servicioCPaquete = null;

        List<Paquete> paquetes = null;
        servicioCPaquete = new ServicioCambioPaquete();
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        if (sesion.getSuscriptor().getMarketType().equalsIgnoreCase("Normal VeTV PLUS")) {
        int numerorecarga = sesion.getSuscriptor().getNumeroRecargas() == null ? 0: Integer.parseInt(sesion.getSuscriptor().getNumeroRecargas());
            if (numerorecarga >=3) {
                cambioPaqueteVETV= false;
            }else{
                cambioPaqueteVETV = true;        
            }
        }else{
            cambioPaqueteVETV = false;
        }
        Suscriptor suscriptor = sesion.getSuscriptor();
        String paqueteCuenta =suscriptor.getPaquete();
        String paisISO = sesion.getSuscriptor().getPaisISO();

        String ctaSKY = sesion.getCuentaSKY();
        String sistema = sesion.getSistema();
        paquetes =
                servicioCPaquete.obtenerPaquetes(paqueteCuenta, suscriptor.getOrganizacion(), suscriptor.getMarketType(), ctaSKY, paisISO,
                                                 sistema);
        if (paquetes == null) {
            LogPC.println(this, "paquetes null");
        } else {
            contadorPaquete = 0;
            do {
                rowPaquetes = new ArrayList<Paquete>();
                for (contadorInterno = 1; contadorInterno <= 3 && contadorPaquete < paquetes.size(); contadorInterno++) {
                    rowPaquetes.add(paquetes.get(contadorPaquete++));
                }
                if (rowPaquetes.size() > 0) {
                    mosaicoPaquetes.add(rowPaquetes);
                }
                LogPC.println(this, "[" + contadorPaquete + "][" + paquetes.size() + "]");
            } while (contadorPaquete < paquetes.size());

            for (int i = 0; i < paquetes.size(); i++)
                this.paquetes[i] = paquetes.get(i);
            LogPC.println(this, paquetes.size() + " Paquetes Obtenidos");
        }
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_PAQUETES);
    }
    public Boolean consultaSaldo(String cuentaSKY, String sistema){
        Boolean respuesta = false;        
        ServicioSaldo saldo = new ServicioSaldo();
        String saldoCuenta = saldo.consultaSaldo(cuentaSKY, sistema).getSaldoTotal();
        Double saldoD = new Double(saldoCuenta);   
        if (saldoD <= 0) {
            respuesta= true;
        }
        return respuesta;
    }
    public Boolean consultaOrdenPendiente(String numeroCuenta, String rowID){
        Boolean respuesta = true;
        ServicioOrdenPendiente orden = new ServicioOrdenPendiente();
        SerivcioTarjetaInteligente tarjetas = new SerivcioTarjetaInteligente();
        List<TarjetaInteligente> lista = tarjetas.getTarjetaInteligente(rowID);
        for (TarjetaInteligente tarjetaInteligente : lista) {
            String ordenModificacion = orden.consultaOrdenModificacion(numeroCuenta, tarjetaInteligente.getTarjetaInteligente());
            if (ordenModificacion.equalsIgnoreCase("Y")) {
                respuesta= false;
            }
        }
        return respuesta;
    }
    public Boolean consultaRevistaSKY(String numeroCuenta){
        BindingContainer bindings = getBindings();
        OperationBinding revistaOp = bindings.getOperationBinding("revistaContratadaPs");
        revistaOp.getParamsMap().put("cuenta", (numeroCuenta));
        Object result = revistaOp.execute();
        
        return Boolean.parseBoolean(result.toString());
    }

    /*
   * Paso 1 : Se establece el idPaquete a Cambiar
   */

    public void setIdPaquete(String idPaquete) {
        this.idPaquete = idPaquete;
    }


    /*Metodo invocado para mostrar el Popup de Confirmacion, este es llamado inmediatamente despues de llamar al metodo setIdPaquete*/

    public String showPopupPaquete() {
            try {
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        ServicioDualPlay dualPlay = new ServicioDualPlay();
        ServiciosCuenta cuentaD = dualPlay.consultaCuentaDualPlay(sesion.getSuscriptor().getCuentaSKY());
        
        LogPC.println(this, "ID Paquete :" + idPaquete);
        costoPaquete = new ServicioVeTV();
        for (Paquete p : paquetes)
            if (p.getNombre().equalsIgnoreCase(idPaquete)) {
                paquete = p;
                ADFUtils.showPopup(popupConfirmacion);
                if (paquete.getNombre().contains("VETV")) {
                    if (paquete.getNombre().equalsIgnoreCase("VETV")) {
                        if (sesion.isCuentaDualPlay()) {
                            if (cuentaD.getVelocidadInternet().equalsIgnoreCase("5")) {
                                CostoVetvEquipo = costoPaquete.consultarPrecio("REC_VETV_DUAL_5");
                                CostoVetvDosEquipo = costoPaquete.consultarPrecio("REC_VETV_2_DUAL_5");   
                            }else if (cuentaD.getVelocidadInternet().equalsIgnoreCase("10")) {
                                CostoVetvEquipo = costoPaquete.consultarPrecio("REC_VETV_DUAL_10");
                                CostoVetvDosEquipo = costoPaquete.consultarPrecio("REC_VETV_2_DUAL_10");
                            }
                        }else{
                            CostoVetvEquipo = costoPaquete.consultarPrecio("RECARGA");
                            CostoVetvDosEquipo = costoPaquete.consultarPrecio("RECARGA_2_EQUIPOS");
                        }
                    }else if (paquete.getNombre().equalsIgnoreCase("VETV PLUS")){
                        if (sesion.isCuentaDualPlay()) {
                            if (cuentaD.getVelocidadInternet().equalsIgnoreCase("5")) {
                                CostoVetvEquipo = costoPaquete.consultarPrecio("REC_VETVPLUS_DUAL_5");
                                CostoVetvDosEquipo = costoPaquete.consultarPrecio("REC_VETVPLUS_2_DUAL_5");   
                            }else if (cuentaD.getVelocidadInternet().equalsIgnoreCase("10")) {
                                CostoVetvEquipo = costoPaquete.consultarPrecio("REC_VETVPLUS_DUAL_10");
                                CostoVetvDosEquipo = costoPaquete.consultarPrecio("REC_VETVPLUS_2_DUAL_10");
                            }
                        }else{
                            CostoVetvEquipo = costoPaquete.consultarPrecio("RECARGA_VETVPLUS");
                            CostoVetvDosEquipo = costoPaquete.consultarPrecio("RECARGA_2_VETVPLUS");
                        }
                    }else if (paquete.getNombre().equalsIgnoreCase("VETV HD")){
                        CostoVetvEquipo = costoPaquete.consultarPrecio("RECARGA_VETVHD");
                        CostoVetvDosEquipo = costoPaquete.consultarPrecio("RECARGA_2_VETVHD");
                    }else{
                        if (paquete.getNombre().equalsIgnoreCase("COMBO BTI VETV HD")){
                                                if (cuentaD.getVelocidadInternet().equalsIgnoreCase("5")) {
                                                    CostoVetvEquipo = costoPaquete.consultarPrecio("REC_VETVHD_DUAL_5");
                                                    CostoVetvDosEquipo = costoPaquete.consultarPrecio("REC_VETVHD_2_DUAL_5");
                                                }else if (cuentaD.getVelocidadInternet().equalsIgnoreCase("10")) {
                                                    CostoVetvEquipo = costoPaquete.consultarPrecio("REC_VETVHD_DUAL_10");
                                                    CostoVetvDosEquipo = costoPaquete.consultarPrecio("REC_VETVHD_2_DUAL_10");
                                                }
                                            }else{
                        if (sesion.isCuentaDualPlay()) {
                            if (cuentaD.getVelocidadInternet().equalsIgnoreCase("5")) {
                                CostoVetvEquipo = costoPaquete.consultarPrecio("REC_VETVPLUSHD_DUAL_5");
                                CostoVetvDosEquipo = costoPaquete.consultarPrecio("REC_VETVPLUSHD_2_DUAL_5");   
                            }else if (cuentaD.getVelocidadInternet().equalsIgnoreCase("10")) {
                                CostoVetvEquipo = costoPaquete.consultarPrecio("REC_VETVPLUSHD_DUAL_10");
                                CostoVetvDosEquipo = costoPaquete.consultarPrecio("REC_VETVPLUSHD_2_DUAL_10");
                            }
                        }else{
                            CostoVetvEquipo = costoPaquete.consultarPrecio("RECARGA_VETVPLUSHD");
                            CostoVetvDosEquipo = costoPaquete.consultarPrecio("RECARGA_2_VETVPLUSHD");
                        }
                        }
                    }
                    paqueteVETV= false;
                }else{
                    paqueteVETV = true;
                }
                return "OK";
            }
        } catch (ServicioException e) {
        }
        return "Fail";
    }
    

    /*
     * Paso 2 : Se confirma el Paquete a Cambiar
     */

    public void cambioPaquete(DialogEvent dialogEvent) {
        ServicioCambioPaquete scp = null;
        SesionMB sesion = null;
        if (dialogEvent.getOutcome().ok == DialogEvent.Outcome.ok) {
            LogPC.println(this, "Cambio de Paquete");
            sesion = (SesionMB)JSFUtils.getBean("sesion");
            if (sesion.getSuscriptor().getPaquete().toUpperCase().contains("VETV") && !sesion.getSuscriptor().getPaisISO().equalsIgnoreCase("MX") &&
                !sesion.getSuscriptor().getPaisISO().equalsIgnoreCase("DO")) {
                scp = new ServicioCambioPaquete();
                try {
                    requierePenalizacion = scp.consultaPenalizacionVeTVCA(sesion.getUsuario().getCuentaSKY());
                    if (requierePenalizacion) {
                        //Show que hay penalizaci\u00F3n
                        ADFUtils.showPopup(popupPenalizacion);
                    } else {
                        cambio();
                    }
                } catch (Exception e) {
                    ADFUtils.showErrorMessage(getMensajeProperties("mensaje_PantallaError_generico"));
                    LogPC.printlnError(this, e);
                }
            } else {
                cambio();
            }
        }
    } 

    public void muestraPenalizacion(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome() == DialogEvent.Outcome.yes) {
            LogPC.println(this, "Cambio de Paquete PROCEDE CON PENALIZACION");
            cambio();
        }
    }
    
    /*
     * Paso 3 : Se realiza la Solicitud de Servicio de Cambio de Paquete
     */
    private void cambio() {
        LogPC.println(this, "Iniciando cambio de paquete...");
        ServicioCambioPaquete scp = new ServicioCambioPaquete();
        SolicitudServicioBean scb = new SolicitudServicioBean();
        ServicioUpgradePaquete up = new ServicioUpgradePaquete();

        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        Suscriptor suscriptor = sesion.getSuscriptor();
        boolean upgradePaqueteBTGVEW = false;
        cambioExitoso = false;
        //String sigMensualidad = "";
        //String cuentaSKY = sesion.getSuscriptor().getCuentaSKY();
        String descripcionPaquete = "";
        try {
            //sigMensualidad = scp.consultaSigMensualidad(cuentaSKY);
            if (paquete.getNombre() == null || paquete.getNombre().isEmpty()) {
                mensaje = "Por el momento no se puede generar su Solicitud de Cambio de Paquete. Por favor cierre su sesión e intentelo de nuevo.";
                cambioExitoso = false;
            } else {
                descripcionPaquete = "Paquete: " + paquete.getNombre();
                //se agrega el idSesion
                scb.setIdSesion(sesion.getIdSesion());
                scb = SolicitudServicioUtils.convert(scb, descripcionPaquete);
                scb.setContratacionServicios(paquete);
                paquete.setPenalizacionVeTVCA(requierePenalizacion ? "Y" : "N");
                paquete.setPaqueteActual(suscriptor.getPaquete());
                paquete.setServicioAContratar(paquete.getNombre());
                OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CAMBIO_PAQUETE,paquete.getNombre());
                /*if (suscriptor.getPaquete().equalsIgnoreCase("ACCESS") && paquete.getNombre().equalsIgnoreCase("VETV PLUS")) {
                    mensaje = ADFUtils.getString(MENSAJE_SOLICITUD_ENVIADA_ACCESS) + scp.marcarCuentaAccess(suscriptor.getCuentaSKY(), sesion.getSistema());
                }else*/ if (suscriptor.getPaquete().contains("VETV") || paquete.getNombre().contains("VETV")) {
                    //mensaje = ADFUtils.getString(MENSAJE_SOLICITUD_ENVIADA) + scp.crearSolicitud(scb);
                    if(sesion.isCuentaVETVHD()){
                        paquete.setPaqueteActual("VETV HD");
                        paquete.setServicioAContratar("VETV PLUS HD");
                    }
                    else{
                        if(sesion.isCuentaVETVPLUSHD()){
                            paquete.setPaqueteActual("VETV PLUS HD");
                            paquete.setServicioAContratar("VETV HD");
                        }
                    }
                    LogPC.println(this, "Creando solicitud de cambio de paquete para la cuenta VETV: "+scb.getCuenta());
                    LogPC.println(this, "PaqueteActual: "+paquete.getPaqueteActual());
                    LogPC.println(this, "ServicioAContratar: "+paquete.getServicioAContratar());
                    scb.setContratacionServicios(paquete);
                    scp.crearSolicitud(scb);
                    mensaje="La solicitud de cambio de paquete fue enviada. " +
                        "Tu nuevo paquete de programación quedará activo en las próximas horas.";
                }else{
                    LogPC.println(this, "Creando solicitud de cambio de paquete para la cuenta: "+scb.getCuenta());
                    LogPC.println(this, "PaqueteActual: "+paquete.getPaqueteActual());
                    LogPC.println(this, "ServicioAContratar: "+paquete.getServicioAContratar());
                mensaje =
                        ADFUtils.getString(MENSAJE_SOLICITUD_ENVIADA) + scp.crearSolicitud(scb) + " Recuerde su pago mensual serÃ¡ de $" + paquete.getCostoPagoOportuno() +
                        " " + sesion.getMoneda() + " en pago oportuno. No incluye prorrateo por el cambio de paquete, cargos administrativos u otros consumos";
                }
                //si se realizo con exito entonces actualizar datos de usuario
                if (sesion != null) {
                    LogPC.println(this, "Actualizando datos suscriptor");
                    sesion.actualizarDatosSuscriptor();
                    LogPC.println(this, "Datos actualizados");
                }
                // Llamar upgrade de BTGEW

                    if (sesion.getUsuario().getStatus_ott() != null && (sesion.getUsuario().getStatus_ott()).equalsIgnoreCase("Activa")) {
                        //upgradePaqueteBTGVEW = up.upgradePaquete(cuentaSKY, suscriptor.getPaquete(), paquete.getNombre());
                        LogPC.println(this, "status-ott Activa");
                    }else{
                        upgradePaqueteBTGVEW = true;
                    }
                cambioExitoso = true && upgradePaqueteBTGVEW;
                LogPC.println(this, "+++++++++++++++++++++++CambioExitoso: " + cambioExitoso);
            }
        } catch (Exception ex) {
            LogPC.printlnError(ex);
            LogPC.printlnError(this, "Error al Generar la Solicitud de Cambio de Paquete");
            mensaje = ADFUtils.getString(MENSAJE_ERROR);
            cambioExitoso = false;
        }
        ADFUtils.showPopup(popupMensaje);
        actualizarTabla();
        obtenerCPaquetes();
        //ADFUtils.addPartialTarget(pgPaquetes);
        LogPC.println(this, "cambioPaqueteReturnListener---------------------------");
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String actualizarTabla() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("ExecuteDetalleSolicitudServicio");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public void cambioPaqueteReturnListener(ReturnEvent returnEvent) {
        // Add event code here...
        actualizarTabla();
        RequestContext.getCurrentInstance().addPartialTarget(returnEvent.getComponent().getParent().getParent());
    }


    public void setPopupConfirmacion(RichPopup popupConfirmacion) {
        this.popupConfirmacion = popupConfirmacion;
    }

    public RichPopup getPopupConfirmacion() {
        return popupConfirmacion;
    }

    public void setMosaicoPaquetes(List<List<Paquete>> mosaicoPaquetes) {
        this.mosaicoPaquetes = mosaicoPaquetes;
    }

    public List<List<Paquete>> getMosaicoPaquetes() {
        return mosaicoPaquetes;
    }

    public Integer getMosaicoPaquetesSize() {
        int resultado = 0;
        if (mosaicoPaquetes == null) {
            resultado = 0;
        } else {
            resultado = mosaicoPaquetes.size();
        }
        return resultado;
    }

    public String getIdPaquete() {
        return idPaquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPopupMensaje(RichPopup popupMensaje) {
        this.popupMensaje = popupMensaje;
    }

    public RichPopup getPopupMensaje() {
        return popupMensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        LogPC.println(this, "Serializando BBCambioPaquete: " + paquetes);
    }

    private void readObject(ObjectInputStream in) throws IOException {
        try {
            in.defaultReadObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        LogPC.println(this, "DeSerializando BBCambioPaquete :" + paquetes);
    }

    public void setCambioExitoso(Boolean cambioExitoso) {
        this.cambioExitoso = cambioExitoso;
    }

    public Boolean getCambioExitoso() {
        return cambioExitoso;
    }

    public void setPopupPenalizacion(RichPopup popupPenalizacion) {
        this.popupPenalizacion = popupPenalizacion;
    }

    public RichPopup getPopupPenalizacion() {
        return popupPenalizacion;
    }

    public void setPaqueteVETV(boolean paqueteVETV) {
        this.paqueteVETV = paqueteVETV;
    }

    public boolean isPaqueteVETV() {
        return paqueteVETV;
    }

    public void setCambioPaqueteVETV(boolean cambioPaqueteVETV) {
        this.cambioPaqueteVETV = cambioPaqueteVETV;
    }

    public boolean isCambioPaqueteVETV() {
        return cambioPaqueteVETV;
    }
    public boolean isPosibleCambioPaquete(){
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        boolean respuesta = false;
        if (sesion.getSuscriptor().getPaquete().equalsIgnoreCase("ACCESS") && sesion.getSuscriptor().getPais().equalsIgnoreCase("MEX")) {
            if (consultaSaldo(sesion.getUsuario().getCuentaSKY(),sesion.getSistema()) && consultaOrdenPendiente(sesion.getUsuario().getCuentaSKY(), sesion.getSuscriptor().getRowId()) && !consultaRevistaSKY(sesion.getUsuario().getCuentaSKY())) {
                respuesta=false;
            }
        }else/* if (sesion.isCuentaVETVPLUSHD() && sesion.isCuentaDualPlay()) { //codigo para no permitir cambio de paquete de una VETV PLUS HD a VETV HD dual play
            respuesta = false;
        }else*/ if (sesion.isUserVeTV()) {
            respuesta = cambioPaqueteVETV;
        }
        return    respuesta;
    }

    public void setCostoVetvEquipo(Double CostoVetvEquipo) {
        this.CostoVetvEquipo = CostoVetvEquipo;
    }

    public Double getCostoVetvEquipo() {
        return CostoVetvEquipo;
    }

    public void setCostoVetvDosEquipo(Double CostoVetvDosEquipo) {
        this.CostoVetvDosEquipo = CostoVetvDosEquipo;
    }

    public Double getCostoVetvDosEquipo() {
        return CostoVetvDosEquipo;
    }
    public String cambioPaquete() {
        // Add event code here...
        ServicioCambioPaquete scp = null;
        SesionMB sesion = null;
            LogPC.println(this, "Cambio de Paquete");
            sesion = (SesionMB)JSFUtils.getBean("sesion");
            if (sesion.getSuscriptor().getPaquete().toUpperCase().contains("VETV") && !sesion.getSuscriptor().getPaisISO().equalsIgnoreCase("MX") &&
                !sesion.getSuscriptor().getPaisISO().equalsIgnoreCase("DO")) {
                scp = new ServicioCambioPaquete();
                try {
                    requierePenalizacion = scp.consultaPenalizacionVeTVCA(sesion.getUsuario().getCuentaSKY());
                    if (requierePenalizacion) {
                        //Show que hay penalizaci\u00F3n
                        ADFUtils.showPopup(popupPenalizacion);
                    } else {
                        cambio();
                    }
                } catch (Exception e) {
                    ADFUtils.showErrorMessage(getMensajeProperties("mensaje_PantallaError_generico"));
                    LogPC.printlnError(this, e);
                }
            } else {
                cambio();
        }
        
        return null;
    }
    
    public String aceptarMensajePopUp() {
        // Add event code here...
        ADFUtils.hidePopup(popupMensaje);
        ADFUtils.hidePopup(popupPenalizacion);
        ADFUtils.hidePopup(popupConfirmacion);
        return null;
    }
    
    public String cancelarCambioPopUp() {
        // Add event code here...
        ADFUtils.hidePopup(popupPenalizacion);
        ADFUtils.hidePopup(popupConfirmacion);
        return null;
    }
    
    public String muestraPenalizacion() {
            LogPC.println(this, "Cambio de Paquete PROCEDE CON PENALIZACION");
            cambio();
        return null;
    }
}
