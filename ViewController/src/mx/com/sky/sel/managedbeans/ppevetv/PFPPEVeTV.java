package mx.com.sky.sel.managedbeans.ppevetv;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.List;

import javax.faces.component.html.HtmlInputHidden;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.managedbeans.PFTDC;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.managedbeans.sesion.SesionMB;
import mx.com.sky.sel.managedbeans.tarjeta.BBTarjeta;
import mx.com.sky.sel.services.beans.eventos.Evento;
import mx.com.sky.sel.services.beans.eventos.Horario;
import mx.com.sky.sel.services.beans.pagos.tarjetas.Bines;
import mx.com.sky.sel.services.beans.pagos.tarjetas.Tarjeta;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.corporativos.ServiciosCorporativosPSManagementBean;
import mx.com.sky.sel.services.eventos.ServicioPagosEventosPSManagementBean;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.pagos.tarjetas.ServicioBines;
import mx.com.sky.sel.services.utils.SolicitudServicioUtils;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.Constantes;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;

import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.ComponentReference;
import org.apache.myfaces.trinidad.util.Service;


public class PFPPEVeTV extends PFTDC implements Serializable {
    @SuppressWarnings("compatibility:1989695185956711156")
    private static final long serialVersionUID = -8072972229533549286L;
    private Evento evento;
    private String tarjetaInteligente;
    private Horario horario;
    private transient Object horarioObject;
    private String numeroSolicitud;
    private String horarioString;
    private transient Object tarjetaObject;


    private String ticketNumber;

    /*** CORPORATIVOS ***/
    private String seleccionCV;
    private String listaTIs;
    private List<String> listaManualTIs;
    private List<String> itemsTIRechazados;
    private List<SelectItem> itemsTotalTI;
    private boolean mostrarTIRechazados;

    //validaci\u00F3n de subtitulos null
    private boolean respuestaSubtituloNull;
    private boolean respuestaTituloMensajeNull;
    
    //TC ADF Component
    private ComponentReference numeroTCcomponent;

    public PFPPEVeTV() {
        super();
        mostrarTIRechazados = false;
        itemsTIRechazados = new ArrayList<String>();
        listaManualTIs = new ArrayList<String>();
        limpiarDatos();

        LogPC.println(this, "PFPPEVeTV()");
        llenarListaTIs();
    }

    private void llenarListaTIs() {
        LogPC.println(this, "llenarListaTIs()");
        ServiciosCorporativosPSManagementBean sc = new ServiciosCorporativosPSManagementBean();
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        List<String> tis = sc.consultarTIsAsociadas(sesion.getUsuario().getNombreCorporativo());
        itemsTotalTI = new ArrayList<SelectItem>();
        SelectItem si = null;
        for (String s : tis) {
            si = new SelectItem();
            si.setLabel(s);
            si.setValue(s);
            itemsTotalTI.add(si);
        }
    }


    private void limpiarDatos() {
        evento = new Evento();
        tarjetaInteligente = "";
        horario = new Horario();
        setTarjeta(new Tarjeta());
    }


    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    
    
    public Evento getEvento() {
        if (evento.getSubtitulos() == null || evento.getSubtitulos().isEmpty()) {
        respuestaSubtituloNull = false;
        }else{
                respuestaSubtituloNull = true;
            }
        if ((evento.getTituloMensaje() == null || evento.getTituloMensaje().isEmpty()) || evento.getMensaje() == null || evento.getMensaje().isEmpty()) {
            respuestaTituloMensajeNull = false;
        }else{
            respuestaTituloMensajeNull = true;
            }
        return evento;
    }


    public String cbCancelar_action() {
        // Add event code here...
        LogPC.println(this, "cbCancelar_action");
        limpiarDatos();
        return "closeTaskFlow";
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
        String numTarjetaClientID = this.numeroTCcomponent.getComponent().getClientId();
        LogPC.println(this, "Client component ID TC card number:" + numTarjetaClientID);
        if(tipoTarjetaBines.equalsIgnoreCase(getMensajeProperties("TIPO_TARJETA_VISA"))){
            tipoTarjeta=getMensajeProperties("DESC_TARJETA_VISA");  
            //addScriptOnPartialRequest("protect_form_2();");
            addScriptOnPartialRequest("protect_numero_tarjeta_byid('" + numTarjetaClientID + "');");
        }else if(tipoTarjetaBines.equalsIgnoreCase(getMensajeProperties("TIPO_TARJETA_MASTER_CARD"))){
            tipoTarjeta=getMensajeProperties("DESC_TARJETA_MASTER_CARD"); 
            //addScriptOnPartialRequest("protect_form_2();");
            addScriptOnPartialRequest("protect_numero_tarjeta_byid('" + numTarjetaClientID + "');");
        }else if(tipoTarjetaBines.equalsIgnoreCase(getMensajeProperties("TIPO_TARJETA_AMEX"))){
            tipoTarjeta=getMensajeProperties("DESC_TARJETA_AMEX");
            //addScriptOnPartialRequest("protect_form_2();");
            addScriptOnPartialRequest("protect_numero_tarjeta_byid('" + numTarjetaClientID + "');");
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

    public String cbSiguienteGuardarTDC_action() {
        String respuesta = null;
        try {
            //guardarTDC();
            guardarTarjeta();
            respuesta = "siguiente";
        } catch (Exception e) {
            LogPC.printlnError(e);
            ADFUtils.showErrorMessage("Ocurri\u00F3 algo inesperado al guardar sus datos, por favor intene m\u00E1s tarde");
        }
        return respuesta;
    }

    private boolean guardarTarjeta(){
        boolean flujo = false; 
        //tarjeta.setNumeroTarjeta(getTarjetaProtegida().getValue().toString());
        tarjeta.setKeyId(getKey_Id().getValue().toString());
        tarjeta.setPhase(getPhase_Id().getValue().toString());
        //tarjeta.setNumeroTarjeta(getNumeroTarjeta());
        /*Se utiliza el MB de Tarjetas para guardarla*/
        BBTarjeta bbt = new BBTarjeta();
        bbt.setTarjetaProtegida(getTarjetaProtegida());
        bbt.setTarjeta(tarjeta);
            bbt.setKey_Id(getKey_Id());
            bbt.setPhase_Id(getPhase_Id());
        try {
            String agregar = bbt.guardarTarjeta();
            if(agregar != null){
                /*mensajeRespuestaPago = ADFUtils.getString(MENSAJE_PAGO_REALIZADO) + ticketNumber;
                mensajeRespuestaGuardado = getMensajeProperties("msj_pago_aplicado_tarjeta_guardada");*/
                flujo=true;
            }else{
                       LogPC.printlnError(this,"Error al realizar el registro de una nueva tarjeta");
                       //mensajeRespuestaGuardado = getMensajeProperties("msj_eror_guardado_tarjeta");
                   }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
           return  flujo;    
        }

    private boolean contratar(boolean contratarCV) throws Exception {
        boolean respuesta = false;

        ServicioPagosEventosPSManagementBean spe;
        spe = new ServicioPagosEventosPSManagementBean();

        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String diferenciaHoraria = sesion.getSuscriptor().getDiferenciaHoraria();
        SolicitudServicioBean solicitudServicio = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
        String tipoEvento = "";
        String nombreCorporativo = "";
        try {
            solicitudServicio = SolicitudServicioUtils.convert(solicitudServicio, evento.getTitulo());
            tipoEvento = (String)ADFUtils.getValue("pageFlowScope.tipoEvento");
            evento.setId(horario.getPpveventid());
            LogPC.println(this, "Contratar Evento ID " + evento.getId());
            evento.setDiferenciaHoraria(diferenciaHoraria);
            evento.setToken(horario.getToken());
            evento.setDuracion(horario.getDuration().toString());
            evento.setHoraExpiracion(sdf.format(horario.getFechaExpiracionTS()));
            evento.setHoraEvento(sdf.format(horario.getFechaInicioTS()));

            evento.setTipoEvento(tipoEvento);
            sdf = new SimpleDateFormat("dd/MM/yyyy");
            String cadenaFecha = sdf.format(horario.getFechaInicioTS());
            cadenaFecha += " a las ";
            sdf = new SimpleDateFormat("HH:mm");
            cadenaFecha += sdf.format(horario.getFechaInicioTS());
            evento.setHoraPedido(cadenaFecha);

            sdf = new SimpleDateFormat("dd/MM/yyyy");
            cadenaFecha = sdf.format(horario.getFechaFinTS());
            cadenaFecha += " a las ";
            sdf = new SimpleDateFormat("HH:mm");
            cadenaFecha += sdf.format(horario.getFechaFinTS());
            evento.setHoraCancelacion(cadenaFecha);

            //campos agregados en INTERFACE_NSEL_OM
            evento.setTituloCanal(horario.getTituloCanal());
            evento.setIsPackage(horario.getIsPackage());
            evento.setMinutosPrevios(horario.getMinutosPrevios());
            evento.setTokenPSC(horario.getTokenPSC());
            evento.setMinutosLibres(horario.getMinutosLibres());
            evento.setEventoLibre(horario.getEventoLibre());
            evento.setFechaUltimaOrdenTS(horario.getFechaUltimaOrdenTS());
            evento.setFechaUltimaOrden(horario.getFechaUltimaOrden());

            evento.setSubjectMaterRating(horario.getSubjectMaterRating());
            evento.setProviderEventId(horario.getProviderEventId());
            evento.setPpvClass(horario.getPpvClass());
            evento.setPpvGenreId(horario.getPpvGenreId());
            evento.setSkyTrackingId(horario.getSkyTrackingId());
            evento.setTipoOrden(horario.getTipoOrden());
            if (sesion.getSistema().equalsIgnoreCase("HIJUMP")) {
                evento.setId(horario.getSkyTrackingId());
            }

            solicitudServicio.setTarjetaInteligente(tarjetaInteligente);
            solicitudServicio.setInfoPPE(evento);
            //se agrega idSesion
            solicitudServicio.setIdSesion(sesion.getIdSesion());
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.PPV_CONTRATA, evento.getTitulo());
            if (contratarCV) {
                nombreCorporativo = sesion.getUsuario().getNombreCorporativo();
                numeroSolicitud = spe.crearSolicitud(solicitudServicio, listaManualTIs, nombreCorporativo, sesion.getSistema());
            } else {
                numeroSolicitud = spe.crearSolicitud(solicitudServicio);
            }
            LogPC.println(this, "Contrataci\u00F3n de Evento Exitosa :" + numeroSolicitud);
            respuesta = true;
        } catch (Exception ex) {
            LogPC.printlnError(ex);
            respuesta = false;
            throw ex;
        }
        return respuesta;
    }

    public String cbContratar_action() {
        String resultado = null;
        try {
            if (contratar(false)) {
                resultado = "siguiente";
            } else {
                ADFUtils.showErrorMessage("No se pudo contratar " + evento.getTitulo() + " por favor llame a Servicio a Clientes.");
                /*No se pudo contratar  â€œt\u00EDtulo del eventoâ€�  por favor llame a Servicio a Clientes*/
            }
        } catch (Exception e) {
            LogPC.printlnError(this, e.getMessage(), e);
            if (e.getMessage() == null || e.getMessage().toString().equalsIgnoreCase("null")) {
                ADFUtils.showErrorMessage("No se pudo contratar " + evento.getTitulo() + " por favor llame a Servicio a Clientes.");
            } else {

                LogPC.println(this, "Regresando error al contratar evento");
                LogPC.printlnError(this, e.getMessage(), e);
                if (e.getMessage().contains("El evento ya se ha contratado con anterioridad ")) {
                    ADFUtils.showInfoMessage(e.getMessage()+". En caso de no visualizar el evento " + evento.getTitulo() + " por favor llame a Servicio a Clientes.");
                    //this.setException(e.getMessage());
                    //aviso = true;
                } else {
                    ADFUtils.showErrorMessage("No se pudo contratar " + evento.getTitulo() + " por favor llame a Servicio a Clientes.");
                    //this.setException(e.getMessage());
                    //resultado = "warning";
                }
                
                
            }
        }
        return resultado;
    }

    public String cbSiguiente_action() {
        // Add event code here...
        if (tarjetaInteligente == null || tarjetaInteligente.isEmpty()) {
            tarjetaInteligente = ADFUtils.getValueStringBindings("tarjetaInteligente.inputValue");
        }
        LogPC.println(this, "tarjetaInteligente[" + tarjetaInteligente + "]");
        return "siguiente";
    }

    public String cbSiguientePago_action() {
        return "siguiente";
    }

    public String cbSiguienteNTDC_action() {
        // Add event code here...
        tarjeta = new Tarjeta();
        setTarjetaProtegida(new HtmlInputHidden());
        setKey_Id(new HtmlInputHidden());
        setPhase_Id(new HtmlInputHidden());
        return "nuevaTDC";
    }
    public String cbAtrasNTDC_action() {
        // Add event code here...
        tarjeta = new Tarjeta();
        setTarjetaProtegida(new HtmlInputHidden());
        setKey_Id(new HtmlInputHidden());
        setPhase_Id(new HtmlInputHidden());
        return "regresar";
    }
    public String contratarVeTV_action() {
        String respuesta = "";
        //FormatoPago fpago = new FormatoPago();
        mx.com.sky.sel.services.beans.pagos.FormatoPago fpago = new mx.com.sky.sel.services.beans.pagos.FormatoPago();
        SesionMB sesion = null;
        String skyComentario = "";
        try {
            sesion = (SesionMB)JSFUtils.getBean("sesion");
            /*Se Valida Que la cuenta tenga permitido realizar pagos con Tarjeta de Credito JASR*/
            if(!sesion.getSuscriptor().isPermitePagoTC()){
                   ADFUtils.showErrorMessage("Por el momento su cuenta no permite pagos. Para m\u00E1s informaci\u00F3n comun\u00EDquese a los tel\u00E9fonos de Servicio a Clientes.");
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
                fpago.setMonto(Double.parseDouble(evento.getPrecio()));
                //fpago.setCCV(tarjeta.getCodigo());
                
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
                
                //fpago.setIdTarjeta(Integer.toString(tarjeta.getId()));
                fpago.setTarjeta(tarjeta);
                skyComentario = "Pago WEB para contratar " + evento.getTitulo();
                fpago.setOrigenPago("SEL: " + skyComentario);
                fpago.setProposito("1");
                fpago.setIdSession(sesion.getIdSesion());
                
                LogPC.println(this, "PROCESANDO PAGO EVENTO");
                OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.PAGO_ENLINEA, skyComentario);
                
                BindingContainer bindings = getBindings();
                OperationBinding op = bindings.getOperationBinding("procesaPagoPs");
                
                op.getParamsMap().put("fpago", fpago);
                
                LogPC.println(this, "Llamando al servicio procesaPagoPs para realizar el pago...");
                ticketNumber = String.valueOf(op.execute());
                LogPC.println(this, "Llamada al servicio procesaPagoPs finalizada, ticketNumber: " + ticketNumber);
                if(ticketNumber != null && !ticketNumber.equalsIgnoreCase("null")){
                    LogPC.println(this, "EVENTO PAGADO:" + ticketNumber);
                    if (contratar(false)) {
                        respuesta = "siguiente";
                    } else {
                        ADFUtils.showErrorMessage("Ocurri\u00F3 algo inesperado al contratar el evento, comuniquese a Servicio a Clientes lo antes posible");
                        respuesta = null;
                    }
                }else{
                    LogPC.println(this, "ticketNumber regresado por el servicio procesaPagoPs es null");
                    respuesta = null;
                }
            }
        } catch (Exception e) {
            LogPC.println(this, "Regresando error al contratar evento");
            LogPC.printlnError(this, e.getMessage(), e);
            if (e.getMessage().contains("El evento ya se ha contratado con anterioridad")) {
                ADFUtils.showInfoMessage(e.getMessage());
                //this.setException(e.getMessage());
                //aviso = true;
                respuesta = null;
            } else {
                ADFUtils.showErrorMessage(e.getMessage());
                //this.setException(e.getMessage());
                //resultado = "warning";
                respuesta= null;
            }
            //LogPC.println(this, "Regresando error al contratar evento");
            //LogPC.printlnError(this, e.getMessage(), e);
            //ADFUtils.showErrorMessage(e.getMessage());
            //respuesta = null;
        }
        return respuesta;
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

    public void setHorarioObject(Object horarioObject) {
        LogPC.println(this, "setHorarioObject:" + horarioObject);
        LogPC.println(this, "setHorarioObject Class:" + horarioObject.getClass());
        Object horarioObjectHorario = null;
        if (horarioObject != null) {
            ((oracle.jbo.uicli.binding.JUCtrlValueBindingRef)horarioObject).makeCurrentRow();
            horarioObjectHorario = ADFUtils.getValue("bindings.tablaHorarios.currentRow.dataProvider");
            LogPC.println(this, "horarioObject2:" + horarioObjectHorario);
            LogPC.println(this, "horarioObject2 Class:" + horarioObjectHorario.getClass());
        }

        if (horarioObjectHorario == null) {
            return;
        }
        horario = new Horario(((Horario)horarioObjectHorario));
        if (evento.getModalidad().equalsIgnoreCase("EVENT")) {
            horarioString = horario.getFechaInicio() + " a " + horario.getFechaFin();
        } else {
            horarioString = horario.getFechaInicio();
        }
        this.horarioObject = horarioObject;
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

    /*** CORPORATIVOS ***
     *** TODO ***/


    public String cbContratarCorporativos_action() {
        String resultado = null;
        try {
            procesarLista();
            if (contratar(true)) {
                resultado = "siguiente";
            } else {
                ADFUtils.showErrorMessage("No se pudo contratar " + evento.getTitulo() + " por favor llame a Servicio a Clientes.");
            }
        } catch (Exception e) {
            LogPC.printlnError(this, e.getMessage(), e);
            ADFUtils.showErrorMessage("No se pudo contratar " + evento.getTitulo() + " por favor llame a Servicio a Clientes.");
        }
        return resultado;
    }

    public String cbContratarCorporativosLM_action() {
        String resultado = null;
        try {
            procesarListaItems();
            if (contratar(true)) {
                resultado = "siguiente";
            } else {
                ADFUtils.showErrorMessage("No se pudo contratar " + evento.getTitulo() + " por favor llame a Servicio a Clientes.");
            }
        } catch (Exception e) {
            LogPC.printlnError(this, e);
            ADFUtils.showErrorMessage(e.getMessage() + " No se pudo contratar " + evento.getTitulo() + " por favor llame a Servicio a Clientes.");
        }
        return resultado;
    }

    private void procesarListaItems() {
        LogPC.println(this, listaManualTIs);
        LogPC.println(this, "listaManualTIs por itemsTI:" + listaManualTIs);

    }

    private void procesarLista() throws Exception {
        List<String> listaTempTIs = new ArrayList<String>();
        itemsTIRechazados = new ArrayList<String>();
        LogPC.println(this, listaTIs);
        LogPC.println(this, listaTIs.contains("\n"));
        String[] tis = listaTIs.split("\n");
        // TI:5000579746124
        for (String s : listaManualTIs) {
            if (s.length() >= 13 && s.matches("[0-9]{13}")) {
                listaTempTIs.add(s);
            } else {
                itemsTIRechazados.add(s);
                mostrarTIRechazados = true;
            }
        }

        listaManualTIs = listaTempTIs;
        if (listaManualTIs.size() <= 0) {
            throw new Exception("No hay tarjetas v\u00E1lidas para realizar la contrataci\u00F3n, verifique los n\u00FAmeros cada tarjeta inteligente SKY.");
        }
        LogPC.println(this, "listaManualTIs:" + listaManualTIs);
        LogPC.println(this, "itemsTIRechazados:" + itemsTIRechazados);
    }

    /*******************/
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public Object getHorarioObject() {
        return horarioObject;
    }

    public void setHorarioString(String horarioString) {
        this.horarioString = horarioString;
    }

    public String getHorarioString() {
        return horarioString;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTarjetaInteligente(String tarjetaInteligente) {
        this.tarjetaInteligente = tarjetaInteligente;
    }

    public String getTarjetaInteligente() {
        return tarjetaInteligente;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Horario getHorario() {
        return horario;
    }

    public Object getTarjetaObject() {
        return tarjetaObject;
    }

    public void setNumeroSolicitud(String numeroSolicitud) {
        this.numeroSolicitud = numeroSolicitud;
    }

    public String getNumeroSolicitud() {
        return numeroSolicitud;
    }

    public void setSeleccionCV(String seleccionCV) {
        this.seleccionCV = seleccionCV;
    }

    public String getSeleccionCV() {
        return seleccionCV;
    }

    public void setListaTIs(String listaTIs) {
        this.listaTIs = listaTIs;
    }

    public String getListaTIs() {
        return listaTIs;
    }


    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        LogPC.println(this, "Serializando PFPPEVeTV: " + tarjeta);
        LogPC.println(this, "Serializando PFPPEVeTV: " + evento);
    }

    private void readObject(ObjectInputStream in) throws IOException {
        try {
            in.defaultReadObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        LogPC.println(this, "DeSerializando PFPPEVeTV :" + tarjeta);
        LogPC.println(this, "DeSerializando PFPPEVeTV: " + evento);
    }

    public void setListaManualTIs(List<String> listaManualTIs) {
        this.listaManualTIs = listaManualTIs;
    }

    public List<String> getListaManualTIs() {
        return listaManualTIs;
    }

    public void setItemsTotalTI(List<SelectItem> itemsTotalTI) {
        this.itemsTotalTI = itemsTotalTI;
    }

    public List<SelectItem> getItemsTotalTI() {
        return itemsTotalTI;
    }

    public void setItemsTIRechazados(List<String> itemsTIRechazados) {
        this.itemsTIRechazados = itemsTIRechazados;
    }

    public List<String> getItemsTIRechazados() {
        return itemsTIRechazados;
    }

    public void setMostrarTIRechazados(boolean mostrarTIRechazados) {
        this.mostrarTIRechazados = mostrarTIRechazados;
    }

    public boolean isMostrarTIRechazados() {
        return mostrarTIRechazados;
    }

    public void setRespuestaSubtituloNull(boolean respuestaSubtituloNull) {
        this.respuestaSubtituloNull = respuestaSubtituloNull;
    }

    public boolean isRespuestaSubtituloNull() {
        return respuestaSubtituloNull;
    }

    public void setRespuestaTituloMensajeNull(boolean respuestaTituloMensajeNull) {
        this.respuestaTituloMensajeNull = respuestaTituloMensajeNull;
    }

    public boolean isRespuestaTituloMensajeNull() {
        return respuestaTituloMensajeNull;
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

    public void setNumeroTCcomponent(RichInputText tcClientInputText) {
        this.numeroTCcomponent = ComponentReference.newUIComponentReference(tcClientInputText);
    }

    public RichInputText getNumeroTCcomponent() {
        if( this.numeroTCcomponent != null ) {
            return (RichInputText) this.numeroTCcomponent.getComponent();
        } else {
            return null;
        }
    }
}
