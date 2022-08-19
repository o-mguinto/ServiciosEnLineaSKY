package mx.com.sky.sel.managedbeans.canal;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.component.html.HtmlInputHidden;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.managedbeans.sesion.SesionMB;
import mx.com.sky.sel.managedbeans.tarjeta.BBTarjeta;
import mx.com.sky.sel.services.beans.cambiopaquete.Paquete;
import mx.com.sky.sel.services.beans.canal.CanalCarta;
import mx.com.sky.sel.services.beans.pagos.tarjetas.Bines;
import mx.com.sky.sel.services.beans.pagos.tarjetas.Tarjeta;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.pagos.tarjetas.ServicioBines;
import mx.com.sky.sel.services.utils.SolicitudServicioUtils;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.Constantes;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.UtileriasMB;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;

import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;
//import mx.com.sky.sel.services.pagos.administratarjeta.ServicioTarjetaPSManagementBean;

public class PFCanalesContrata extends UtileriasMB implements Serializable{
    @SuppressWarnings("compatibility:7276736150513633611")
    private static final long serialVersionUID = 7483574543192206508L;

    private CanalCarta canal;
        private String tarjetaInteligente;
        private Tarjeta tarjeta;
        private String numeroSolicitud;
        private transient Object tarjetaObject;
        private Map<String, String> tipos;
        private Map<String, String> meses;
        private Map<String, String> anios;
        private Map<String, String> creditoDebitoMap;
        private String ticketNumber = "";
        private String exception;
        private boolean aviso;
        private double precio;
        private boolean aceptaContrataHotGo;
    private String tipoTarjetaBines;
    private String tipoTarjeta;
    private Boolean tarjetaValida;
    private transient HtmlInputHidden tarjetaProtegida;
    private transient HtmlInputHidden key_Id;
    private transient HtmlInputHidden phase_Id;

    public PFCanalesContrata() {
            super();
            limpiarDatos();
            tipos = new LinkedHashMap<String, String>();
            tipos.put(getMensajeProperties("TIPO_TARJETA_VISA"), getMensajeProperties("DESC_TARJETA_VISA"));
            tipos.put(getMensajeProperties("TIPO_TARJETA_MASTER_CARD"), getMensajeProperties("DESC_TARJETA_MASTER_CARD"));
            tipos.put(getMensajeProperties("TIPO_TARJETA_AMEX"), getMensajeProperties("DESC_TARJETA_AMEX")); //label, value

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
            int anio = Calendar.getInstance().get(Calendar.YEAR);
            anio = anio % 100;
            for (int i = anio; i <= (anio + 10); i++)
                anios.put(String.valueOf(i), String.valueOf(i));

            creditoDebitoMap = new LinkedHashMap<String, String>();
            creditoDebitoMap.put("Cr\u00E9dito", "01");
            creditoDebitoMap.put("D\u00E9bito", "02");
            aceptaContrataHotGo=false;
            LogPC.println(this, "PFCanalesContrata()");
            tipoTarjetaBines="";
            tipoTarjeta=null;
            tarjetaValida=false;
        }


        private void limpiarDatos() {
            canal = new CanalCarta();
            tarjetaInteligente = "";
            tarjeta = new Tarjeta();
        }

        public String cbCancelar_action() {
            // Add event code here...
            LogPC.println(this, "cbCancelar_action");
            limpiarDatos();
            return "closeTaskFlow";
        }


        private boolean contratar() throws Exception {
            boolean respuesta = false;

            //Coigo para contratar canal
            ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
            Paquete paquete = new Paquete();
            SolicitudServicioBean solicitudServicio;
            try {
                solicitudServicio = new SolicitudServicioBean();
                solicitudServicio = SolicitudServicioUtils.convert(solicitudServicio, canal.getNombre());
                if (sesion.getSuscriptor().getMarketType().equalsIgnoreCase("Normal VeTV PLUS")) {
                    if (sesion.isCuentaVETVPLUSHD()) {
                        paquete.setPaqueteActual("VETV PLUS HD");
                    }else{
                       paquete.setPaqueteActual("VETV PLUS");
                    }
                }else if (sesion.getSuscriptor().getMarketType().equalsIgnoreCase("Normal VeTV")) {
                    if (sesion.isCuentaVETVHD()) {
                        paquete.setPaqueteActual("VETV HD");
                    }else{
                        paquete.setPaqueteActual("VETV");
                    }
                }else{
                    paquete.setPaqueteActual(sesion.getSuscriptor().getPaquete());
                }
                paquete.setServicioAContratar(canal.getNombre());
                paquete.setCosto("$ " + getPrecio());
                paquete.setNumero(canal.getCanal());
                paquete.setNombre_display(canal.getNombre_display());

                solicitudServicio.setContratacionServicios(paquete);
                solicitudServicio.setTarjetaInteligente(tarjetaInteligente);
                
                BindingContainer bindings = getBindings();
                OperationBinding op = bindings.getOperationBinding("crearSolicitudPs");
                
                op.getParamsMap().put("solicitudServicio", solicitudServicio);
                
                
                numeroSolicitud = String.valueOf(op.execute());
                
                OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CAC, numeroSolicitud);
                respuesta = true;
            } catch (Exception e) {
                LogPC.printlnError(this, e.getMessage(), e);
                throw e;
            }
            return respuesta;
        }

        public String cbContratar_action() {
            String resultado = null;
            aviso = false;
            try {
                if (contratar()) {
                    resultado = "siguiente";
                } else {
                    ADFUtils.showErrorMessage("No puede contratar " + canal.getNombre() + " por favor llame a atenci\u00F3n a clientes.");
                    resultado = "warning";
                }
            } catch (Exception e) {
                if(e.getMessage().contains("Estimado suscriptor el canal solicitado ya se encuentra activo en su cuenta")){
                    ADFUtils.showInfoMessage(e.getMessage());
                    this.setException(e.getMessage());
                    aviso = true;
                    resultado = "warning";
                }else{
                    ADFUtils.showErrorMessage(getMensajeProperties("mensaje_PantallaError_generico"));
                    this.setException(getMensajeProperties("mensaje_PantallaError_generico"));
                    resultado = "warning";
                    
                }
                
                
            }
            LogPC.println(this, "Valor de var resultado:   ");
            LogPC.println(this, resultado);
            return resultado;
        }
        public String contratarHotGo() {
            String respuesta = null;
            if (aceptaContrataHotGo) {
            }else{
                
            }
            return null;
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
        
        public String cbSiguienteGuardarTDC_action() {
            String respuesta = null;
            ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
            int anioTDC = 0;
            int mesTDC = 0;
            int anio = Calendar.getInstance().get(Calendar.YEAR);
            int mes = Calendar.getInstance().get(Calendar.MONTH) + 1;
            String organizationID = sesion.getSuscriptor().getOrganizacion();
            try {
                anio = anio % 100;
                anioTDC = Integer.parseInt(tarjeta.getAnio());
                mesTDC = Integer.parseInt(tarjeta.getMes());

                LogPC.println(this, "MES[" + mes + "][" + mesTDC + "]");
                LogPC.println(this, "ANIO[" + anio + "][" + anioTDC + "]");

                if (anio == anioTDC) {
                    if (mesTDC < mes) {
                        ADFUtils.showErrorMessage("La tarjeta que captur\u00F3 no esta vigente");
                        return null;
                    }
                }
                guardarTarjeta();
                respuesta = "siguiente";
            } catch (Exception e) {
                this.aviso = false;
                LogPC.printlnError(e);
                ADFUtils.showErrorMessage("Ocurri\u00F3 algo inesperado al guardar sus datos, por favor intente m\u00E1s tarde");
                this.setException("Ocurri\u00F3 algo inesperado al guardar sus datos, por favor intente m\u00E1s tarde");
                respuesta = "warning";
            }
            return respuesta;
        }
        private boolean guardarTarjeta(){
            boolean flujo = false; 
            //tarjeta.setNumeroTarjeta(getTarjetaProtegida().getValue().toString());
            tarjeta.setKeyId(key_Id.getValue().toString());
            tarjeta.setPhase(phase_Id.getValue().toString());
            //tarjeta.setNumeroTarjeta(getNumeroTarjeta());
            /*Se utiliza el MB de Tarjetas para guardarla*/
            BBTarjeta bbt = new BBTarjeta();
            bbt.setTarjetaProtegida(getTarjetaProtegida());
            bbt.setTarjeta(tarjeta);
                bbt.setKey_Id(key_Id);
                bbt.setPhase_Id(phase_Id);
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
        public String contratarVeTV_action() {
            String respuesta = "";
            mx.com.sky.sel.services.beans.pagos.FormatoPago process = new mx.com.sky.sel.services.beans.pagos.FormatoPago();
            SesionMB sesion = null;
            String skyComentario = "";

            try {
                sesion = (SesionMB)JSFUtils.getBean("sesion");
                /*Se Valida Que la cuenta tenga permitido realizar pagos con Tarjeta de Credito JASR*/
                if(!sesion.getSuscriptor().isPermitePagoTC()){
                       ADFUtils.showErrorMessage("Por el momento su cuenta no permite pagos. Para m\u00E1s informaci\u00F3n comun\u00EDquese a los tel\u00E9fonos de atenci\u00F3n a clientes.");
                       respuesta = null;
                } else {
                    
                    process.setCuentaSKY(sesion.getCuentaSKY());
                    process.setPaqueteActual(sesion.getPaquete());
                    process.setEmail(sesion.getUsuario().getMail());
                    process.setRowIDSBL(sesion.getSuscriptor().getRowId());
                    process.setOrganizationID(sesion.getSuscriptor().getOrganizacion());
                    process.setSistemaFacturacion(sesion.getSistema());
                    process.setTipoFacturacion(sesion.getSuscriptor().getBillingCode());
                    process.setPais(sesion.getPais());
                    process.setMoneda(sesion.getSuscriptor().getCurrencyCode());
                    process.setMonto(Double.parseDouble(canal.getPrecio_display()));
                    //process.setCCV(tarjeta.getCodigo());
                    
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
                    
                    //process.setIdTarjeta(Integer.toString(tarjeta.getId()));
                    process.setTarjeta(tarjeta);
                    skyComentario = "Pago WEB para contratar " + canal.getNombre_display();
                    process.setOrigenPago("SEL: " + skyComentario);
                    process.setProposito("1");
                    process.setIdSession(sesion.getIdSesion());
                    
                    OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.PAGO_ENLINEA, skyComentario);
                    BindingContainer bindings = getBindings();
                    OperationBinding op = bindings.getOperationBinding("procesaPagoPs");
                    
                    op.getParamsMap().put("fpago", process);
                    
                    ticketNumber = String.valueOf(op.execute());
                    if(ticketNumber != null && !ticketNumber.equalsIgnoreCase("null")){
                        if (contratar()) {
                            respuesta = "siguiente";
                        } else {
                            this.setException("Ocurri\u00F3 algo inesperado al contratar el evento, comuniquese a atenci\u00F3n a clientes lo antes posible");
                            ADFUtils.showErrorMessage("Ocurri\u00F3 algo inesperado al contratar el evento, comuniquese a atenci\u00F3n a clientes lo antes posible");
                            respuesta = "warning";
                        }
                    }else{
                        respuesta = null;
                    }
                }
            } catch (Exception e) {
                LogPC.printlnError(this, e.getMessage(), e);
                this.setException(e.getMessage());
                ADFUtils.showErrorMessage(getMensajeProperties("mensaje_PantallaError_generico"));
                respuesta = "warning";
            }
            return respuesta;
        }

        public void setTarjetaObject(Object tarjetaObject) {
            Row tarjetaRow = null;
            if (tarjetaObject != null) {
                tarjetaRow = ((oracle.jbo.uicli.binding.JUCtrlValueBindingRef)tarjetaObject).getRow();
            }
            if (tarjetaRow == null) {
                LogPC.println(this, "horarioRow: null");
                return;
            }

            tarjeta.setAnio((String)tarjetaRow.getAttribute("anio"));
            //tarjeta.setCodigo((String)tarjetaRow.getAttribute("codigo"));
            tarjeta.setCreditoDebito((String)tarjetaRow.getAttribute("creditoDebito"));
            tarjeta.setId((Integer)tarjetaRow.getAttribute("id"));
            tarjeta.setMes((String)tarjetaRow.getAttribute("mes"));
            tarjeta.setNumeroTarjeta((String)tarjetaRow.getAttribute("numeroTarjeta"));
            //tarjeta.setNoCodificado((String)tarjetaRow.getAttribute("noCodificado"));
            tarjeta.setNombre((String)tarjetaRow.getAttribute("nombre"));
            tarjeta.setTipo((String)tarjetaRow.getAttribute("tipo"));
            this.tarjetaObject = tarjetaObject;
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

        public boolean validarLongTDC(String numeroTarjeta) {
            boolean esvalida=true;
            FacesMessage message = null;
            if (tarjeta.getTipo() == null) {
                return false;
            }

            if (tarjeta.getTipo().equalsIgnoreCase(getMensajeProperties("DESC_TARJETA_AMEX"))) {
                if (numeroTarjeta.length() != 15) {
                    esvalida = false;
                    ADFUtils.showErrorMessage("Debe introducir los 15 d\u00EDgitos de su tarjeta");
                }
            } else {
                if (numeroTarjeta.length() != 16) {
                    esvalida = false;
                    ADFUtils.showErrorMessage("Debe introducir los 16 d\u00EDgitos de su tarjeta");
                }
            }
            return esvalida;
        }

        public String cbSiguienteCaptura_action() {
            // Add event code here...
            String flujo="siguiente";
            if(!tarjetaValida ){
                LogPC.printlnError(this,"No se ha identificado el tipo de la marca de la tarjeta, favor de validar el número de tarjeta");
                mostrarMensaje("No se ha identificado el tipo de la marca de la tarjeta, favor de validar el número de tarjeta", FacesMessage.SEVERITY_INFO);  
                return "stay";
            }else{
                if(!validarTarjeta()){
                    mostrarMensaje(getMensajeProperties("msj_ErrFljPrg"), FacesMessage.SEVERITY_INFO);   
                    return "stay";
                }
                else{
                    if(!validarLongTDC(tarjeta.getNumeroTarjeta()))
                        flujo =  "stay"; 
                    
                    int anioTDC = 0;
                    int mesTDC = 0;
                    int anio = Calendar.getInstance().get(Calendar.YEAR);
                    int mes = Calendar.getInstance().get(Calendar.MONTH) + 1;

                    anio = anio % 100;
                    anioTDC = Integer.parseInt(tarjeta.getAnio());
                    mesTDC = Integer.parseInt(tarjeta.getMes());

                    LogPC.println(this, "MES[" + mes + "][" + mesTDC + "]");
                    LogPC.println(this, "ANIO[" + anio + "][" + anioTDC + "]");

                    if (anio == anioTDC) {
                        if (mesTDC < mes) {
                            ADFUtils.showErrorMessage("La tarjeta que captur\u00F3 no esta vigente");
                            return null;
                        }
                    }
                }   
            }
            return flujo;
        }
    private boolean validarTarjeta(){
            if((tarjetaProtegida.getValue()!=null && !tarjetaProtegida.getValue().toString().isEmpty()) 
                   && (key_Id.getValue()!=null && !key_Id.getValue().toString().isEmpty())
                   && (phase_Id.getValue()!=null && !phase_Id.getValue().toString().isEmpty())){
                return true;
        }
    return false;
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
                    addScriptOnPartialRequest("protect_form_2();");
                }else if(tipoTarjetaBines.equalsIgnoreCase(getMensajeProperties("TIPO_TARJETA_MASTER_CARD"))){
                    tipoTarjeta=getMensajeProperties("DESC_TARJETA_MASTER_CARD"); 
                    addScriptOnPartialRequest("protect_form_2();");
                }else if(tipoTarjetaBines.equalsIgnoreCase(getMensajeProperties("TIPO_TARJETA_AMEX"))){
                    tipoTarjeta=getMensajeProperties("DESC_TARJETA_AMEX");
                    addScriptOnPartialRequest("protect_form_2();");
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

        public BindingContainer getBindings() {
            return BindingContext.getCurrent().getCurrentBindingsEntry();
        }

        public void setTarjeta(Tarjeta tarjeta) {
            this.tarjeta = tarjeta;
        }

        public Tarjeta getTarjeta() {
            return tarjeta;
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

        public Object getTarjetaObject() {
            return tarjetaObject;
        }

        public void setNumeroSolicitud(String numeroSolicitud) {
            this.numeroSolicitud = numeroSolicitud;
        }

        public String getNumeroSolicitud() {
            return numeroSolicitud;
        }


        public void setCanal(CanalCarta canal) {
            this.canal = canal;
        }
        
        public void setException(String exception){
            this.exception = exception;
        }
        
        public String getException(){
            return exception;
        }

        public CanalCarta getCanal() {
            return canal;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public double getPrecio() {
            return precio;
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            out.defaultWriteObject();
            LogPC.println(this, "Serializando PFCanalesContrata: " + tarjeta);
            LogPC.println(this, "Serializando PFCanalesContrata: " + canal);
        }

        private void readObject(ObjectInputStream in) throws IOException {
            try {
                in.defaultReadObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            LogPC.println(this, "DeSerializando PFCanalesContrata :" + tarjeta);
            LogPC.println(this, "DeSerializando PFCanalesContrata: " + canal);
        }


        public void setAviso(boolean aviso) {
            this.aviso = aviso;
        }

        public boolean isAviso() {
            return aviso;
        }

        public void setAceptaContrataHotGo(boolean aceptaContrataHotGo) {
            this.aceptaContrataHotGo = aceptaContrataHotGo;
        }

        public boolean isAceptaContrataHotGo() {
            return aceptaContrataHotGo;
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
}
