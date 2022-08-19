package mx.com.sky.sel.managedbeans.cambioformapago;

import java.io.Serializable;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.xml.ws.Holder;

import mx.com.sky.sel.services.beans.formapago.CambioFormaPago;
import mx.com.sky.sel.services.beans.formapago.MensajeRespuestaProxy;
import mx.com.sky.sel.services.beans.pagos.tarjetas.Bines;
import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.formapago.ServicioCambioFormaPago;
import mx.com.sky.sel.services.pagos.tarjetas.ServicioBines;
import mx.com.sky.sel.services.ti.SerivcioTarjetaInteligente;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaflagtccuenta.BPELConsultaFlagCuenta;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaflagtccuenta.BpelConsultaflagcuentaClientEp;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaflagtccuenta.types.Cuenta;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaflagtccuenta.types.Process;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaflagtccuenta.types.ProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebnotificaciones.emailserviciosenlinea.types.AttachmentType;
import mx.com.sky.sel.proxyclients.pagwebnotificaciones.emailserviciosenlinea.EmailServiciosEnLinea;
import mx.com.sky.sel.proxyclients.pagwebnotificaciones.emailserviciosenlinea.EmailserviciosenlineaClientEp;
import mx.com.sky.sel.proxyclients.pagwebnotificaciones.emailserviciosenlinea.types.ParametroType;

import mx.com.sky.sel.utils.Constantes;

import mx.com.sky.sel.utils.UtileriasMB;

import oracle.adf.controller.ControllerContext;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.input.RichSelectOneRadio;


public class PFCambioFormaPago extends UtileriasMB implements Serializable {
    @SuppressWarnings("compatibility:1484539773356311502")
    private static final long serialVersionUID = -7947094162285627710L;

    private static final String MENSAJE_ERROR_AMEX = "tarjeta.error.numeroincorrectoamex";
    private static final String MENSAJE_ERROR_OTRO_TIPO = "tarjeta.error.numeroincorrectootrotipo";
    private static final String MENSAJE_ERROR_FECHA = "tarjeta.error.fechavigencia";
    private static final String MENSAJE_ERROR_CODIGO = "tarjeta.error.codigo";
    private static final String MENSAJE_ERROR_CODIGO_NO_AMEX = "tarjeta.error.codigootrotipo";

    private transient RichPopup popup;
    private Map<String, String> meses;
    private Map<String, String> anios;
    private CambioFormaPago formaPago;
    private MensajeRespuestaProxy respuestaBeneficio;
    private boolean isBasicoAHBO_UNIVERSE;
    private boolean isUniverseBeneficio2;
    private String errorMessage;
    private String errorMessageSel;
    private String productoSel1;
    private String productoSel2;
    private boolean isTimeOut;
    
   private boolean aceptaBeneficios1;
   private boolean aceptaBeneficios2;
   private String producto1;
   private String producto2;
    private String respuestaCambioFormaPago;
    //variables de validacion 
    private String mensajeConsultaBeneficio;
    private boolean validaMenuAceptar;
    private String beneficioSelect;
    private boolean paisMex;
    //Proxy de consulta flag TC cuenta en siebel
    //refresh de pagina
    public String indexPC =  ControllerContext.getInstance().getGlobalViewActivityURL("indexPC");
    
    private Map<String, String> terminos;
    private String sterminos;
    
    public PFCambioFormaPago() {
        super();
        init();
    }

    private void init() {
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
        meses.put("12", "12");*/
         mensajeConsultaBeneficio = "Sistema no disponible, por favor intentar m\u00E1s tarde.";
        /*anios = new LinkedHashMap<String, String>();
        int anio = Calendar.getInstance().get(Calendar.YEAR);
        anio = anio % 100;
        for (int i = anio; i <= (anio + 10); i++)
            anios.put(String.valueOf(i), String.valueOf(i));
       */
       cargaAniosyMesesVencimiento();

        formaPago = new CambioFormaPago();
        
        consultarBeneficiosCambioFormaPago();
         validaMenuAceptar =true;
         beneficioSelect ="";
         terminos = new LinkedHashMap<String, String>();
         sterminos = ADFUtils.getString("mensaje_terminos1")+ADFUtils.getString("mensaje_terminos2");
         terminos.put(ADFUtils.getString("mensaje_terminos1"), sterminos);
     }
    
    @SuppressWarnings("deprecation")
    private void cargaAniosyMesesVencimiento(){  
        Calendar hoy = Calendar.getInstance(new Locale("ES"));
        
        Date fechaAux= new Date();
          SimpleDateFormat formateador;
          String  strMes;
          int auxMes;
          meses = new LinkedHashMap<String, String>();
          formateador=new SimpleDateFormat("MMMM", new Locale("ES"));        
            for (int intMes=0; intMes<12; intMes++) { // Se llena el arreglo de meses 
                
                fechaAux.setMonth(intMes);
                hoy.set(Calendar.MONTH, intMes);
                
                strMes = formateador.format(hoy.getTime());
                strMes=Character.toUpperCase(strMes.charAt(0))+strMes.substring(1);
                if(intMes==1){
                    strMes="Febrero"; 
                }
                auxMes=intMes+1;
                if(intMes<9){                   
                    meses.put(strMes, "0"+auxMes);
                }else{
                    meses.put(strMes , ""+auxMes);
                }                               
            }
            
        anios = new LinkedHashMap<String, String>();
        Integer anio;
        anio = Calendar.getInstance().get(Calendar.YEAR);

        for (int i = 0; i < Constantes.RANGO_ANIO_VENCIMIENTO_TARJETAS; i++){
            anios.put(String.valueOf(anio), anio.toString().substring(2));
            anio++;
        }
    }
    
     private void consultarBeneficiosCambioFormaPago(){
            ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
                respuestaBeneficio = new MensajeRespuestaProxy();
            if (sesion.getCambioFormaPago().equalsIgnoreCase("false")) {
            
            paisMex = true;
            ServicioCambioFormaPago cambioFormaPago = new ServicioCambioFormaPago();
            BpelConsultaflagcuentaClientEp BpelConsultaflagcuentaClientEp = null;
            BpelConsultaflagcuentaClientEp = new BpelConsultaflagcuentaClientEp();
            BPELConsultaFlagCuenta bPEL_ConsultaFlagCuenta = BpelConsultaflagcuentaClientEp.getBPELConsultaFlagCuentaPt();
            
            Cuenta cuenta = new Cuenta();
                Holder<String> errorCOD = new Holder<String>();
                Holder<String> errorDESC= new Holder<String>();
            cuenta.setCtaSKY(sesion.getCuentaSKY());
            
            bPEL_ConsultaFlagCuenta.process(cuenta,errorCOD,errorDESC);
            
             if (errorCOD.value.equalsIgnoreCase("0")) {
                 if (sesion.getSuscriptor().getPais().equalsIgnoreCase("MEX")) {
             if(sesion.getSuscriptor().getOrganizationType().equalsIgnoreCase("Bar/Restaurant")){
                 isTimeOut = true;
                 isBasicoAHBO_UNIVERSE = true;
                 isUniverseBeneficio2 = true;
                 respuestaBeneficio.setErrorMessage("No tiene beneficios");
             }else{
              if (sesion.getPaquete().equalsIgnoreCase("BASICO")||sesion.getPaquete().equalsIgnoreCase("FUN")||sesion.getPaquete().equalsIgnoreCase("MOVIE CITY") ||sesion.getPaquete().equalsIgnoreCase("FOX+") || sesion.getPaquete().equalsIgnoreCase("HBO")) {
                respuestaBeneficio = cambioFormaPago.consultaBeneficio(sesion.getCuentaSKY(),sesion.getSistema(),sesion.getPaquete(),sesion.getPais());
                if (respuestaBeneficio.getErrorCode().equalsIgnoreCase("0")) {
                    setErrorMessage(respuestaBeneficio.getErrorMessage());
                    setErrorMessageSel(respuestaBeneficio.getBeneficioMessage());
                    setProductoSel1(getErrorMessageSel());
                    isTimeOut = true;
                    isBasicoAHBO_UNIVERSE = false;
                    isUniverseBeneficio2 = true;
                    setProducto1(respuestaBeneficio.getErrorMessage());
                }else if (respuestaBeneficio.getErrorCode().equalsIgnoreCase("4")) {
                    mensajeConsultaBeneficio = "Se ha cambiado su forma de pago actual a Tarjeta de Cr\u00E9dito.";
                    isTimeOut = false;
                    isBasicoAHBO_UNIVERSE = true;
                    isUniverseBeneficio2 = true;
                }else if (respuestaBeneficio.getErrorCode().equalsIgnoreCase("5")) {
                    respuestaBeneficio.setErrorMessage("No tiene beneficios");
                    isTimeOut = true;
                    isBasicoAHBO_UNIVERSE = true;
                    isUniverseBeneficio2 = true;
                }else {
                            isTimeOut = false;
                            isBasicoAHBO_UNIVERSE = true;
                            isUniverseBeneficio2 = true;
                        }
                
            }else if (sesion.getPaquete().contains("UNIVERSE")) {
                    respuestaBeneficio = cambioFormaPago.consultaBeneficio(sesion.getCuentaSKY(),sesion.getSistema(),sesion.getPaquete(),sesion.getPais());
                    if (respuestaBeneficio.getErrorCode().equalsIgnoreCase("0")) {
                        isUniverseBeneficio2 = false;
                        isBasicoAHBO_UNIVERSE = false;
                        String[] totalBeneficios = respuestaBeneficio.getErrorMessage().split(",");
                        String[] beneficiosUniverse = respuestaBeneficio.getBeneficioMessage().split(",");
                        setProducto1(totalBeneficios[0]);
                        setProducto2(totalBeneficios[1]);
                        setProductoSel1(beneficiosUniverse[0]);
                        setProductoSel2(beneficiosUniverse[1]);
                        setErrorMessage(getProducto1().concat(" o ").concat(getProducto2()));
                        setErrorMessageSel(getProductoSel1().concat(" o ").concat(getProductoSel2()));
                        
                        isTimeOut = true;
                    }else if (respuestaBeneficio.getErrorCode().equalsIgnoreCase("4")) {
                        mensajeConsultaBeneficio = "Se ha cambiado su forma de pago actual ha Tarjeta de Cr\u00E9dito.";
                        isTimeOut = false;
                        isBasicoAHBO_UNIVERSE = true;
                        isUniverseBeneficio2 = true;
                    }else if (respuestaBeneficio.getErrorCode().equalsIgnoreCase("5")) {
                        respuestaBeneficio.setErrorMessage("No tiene beneficios");
                        isTimeOut = true;
                        isBasicoAHBO_UNIVERSE = true;
                        isUniverseBeneficio2 = true;
                    }else{
                        isTimeOut = false;
                        isBasicoAHBO_UNIVERSE = true;
                        isUniverseBeneficio2 = true;
                    }
                    
                }else if (sesion.getPaquete().contains("ACCESS") || sesion.getPaquete().contains("VETV")|| sesion.getPaquete().contains("BASE") || sesion.getSuscriptor().getMarketType().equalsIgnoreCase("Normal SKY HD")) {
                    isTimeOut = true;
                    isBasicoAHBO_UNIVERSE = true;
                    isUniverseBeneficio2 = true;
                    respuestaBeneficio.setErrorMessage("No tiene beneficios");
                }else {
                    isTimeOut = false;
                }
               }
            }else{
                    isTimeOut = true;
                    isBasicoAHBO_UNIVERSE = true;
                    isUniverseBeneficio2 = true;
                    respuestaBeneficio.setErrorMessage("No tiene beneficios");
                }
             }else{
                    if (sesion.getSuscriptor().getPais().equalsIgnoreCase("MEX")) {
                        mensajeConsultaBeneficio = "Para realizar esta operaci\u00F3n por favor comun\u00EDquese a Servicio a Clientes de lunes a viernes en horario de 09:00 a 14:00 hrs y de 16:00 a 18:00 hrs.";
                    }else{
                        mensajeConsultaBeneficio = "Para realizar esta operaci\u00F3n por favor comun\u00EDquese a Servicio a Clientes de lunes a viernes";
                    }
                     
                     isTimeOut = false;
                     isBasicoAHBO_UNIVERSE = true;
                     isUniverseBeneficio2 = true;
                 }
            }else{
                    mensajeConsultaBeneficio = "Se ha cambiado su forma de pago actual a Tarjeta de Cr\u00E9dito.";
                    isTimeOut = false;
                    isBasicoAHBO_UNIVERSE = true;
                    isUniverseBeneficio2 = true;
                }
            
            
            }
    
    /**
     * Metodo Invocado cuando se da Click al boton Agregar
     * */
    public String popupAgregar() {
        boolean esValido = true;
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String organizationId = sesion.getSuscriptor().getOrganizacion();
        
        try {
            this.formaPago = consultarBinesTDC(formaPago, organizationId);
        } catch (ServicioException e) {
            ADFUtils.showErrorMessage(e.getMessage());
            esValido = false;
            return "stay";
        }
        if (!validaLongTipoTarjeta(this.formaPago)) {
            if (this.formaPago.getTipoTarjeta().equalsIgnoreCase("AMEX"))
                ADFUtils.showErrorMessage(ADFUtils.getString(MENSAJE_ERROR_AMEX));
            else
                ADFUtils.showErrorMessage(ADFUtils.getString(MENSAJE_ERROR_OTRO_TIPO));
            esValido = false;
        }
        if (!validaFecha(formaPago.getMes(), formaPago.getAnio())) {
            ADFUtils.showErrorMessage(ADFUtils.getString(MENSAJE_ERROR_FECHA));
            esValido = false;
        }
        /*if (!validaCodigo(formaPago)) {
            if (this.formaPago.getTipoTarjeta().equalsIgnoreCase("AMEX"))
                ADFUtils.showErrorMessage(ADFUtils.getString(MENSAJE_ERROR_CODIGO));
            else
                ADFUtils.showErrorMessage(ADFUtils.getString(MENSAJE_ERROR_CODIGO_NO_AMEX));
            esValido = false;
        }*/
        if (esValido) {
            if (this.formaPago.getCreditoDebito().equalsIgnoreCase("01")) {
                ADFUtils.showPopup(popup);
            }else{
                ADFUtils.showInfoMessage("Los datos que proporcion\u00F3 no pertenecen a una tarjeta de cr\u00E9dito, por favor verifique o intente con otra tarjeta de cr\u00E9dito.");
                isBasicoAHBO_UNIVERSE = false;
            }
        }
        return null;
    }
    /**
     * Valida si la tarjeta es AMEX que tenga 15 digitos.
     * @param tarjeta
     * @return
     */
    private boolean validaLongTipoTarjeta(CambioFormaPago tarjeta) {
        LogPC.println(this, "validaLongTipoTarjeta!!!" + tarjeta);
        if (tarjeta.getTipoTarjeta() == null) {
            return false;
        }
        if (tarjeta.getTipoTarjeta().equals("AMEX")) {
            return (tarjeta.getNumeroTarjeta().length() == 15);
        } else {
            return (tarjeta.getNumeroTarjeta().length() == 16);
        }
        //return true;
    }

    public String cancelaGuardarTarjeta(){
            ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
            ServicioCambioFormaPago servicioFormaPago = new ServicioCambioFormaPago();
            servicioFormaPago.noAceptaCambioNiBeneficio(sesion.getCuentaSKY(), respuestaBeneficio.getErrorMessage(), sesion.getSistema(),sesion.getPais());
            enviarCorreoNoBeneficioNoCambionTDC();
            //registrar operaciones BAM
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CAMBIO_FORMA_PAGO, "CambioFormaPago Web-PC Cancelaci\u00F3n TC NAB");
            ADFUtils.hidePopup(popup);
        return "null";
        }
    private void enviarCorreoNoBeneficioNoCambionTDC(){
            ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
            List<ParametroType> listaParametros = new ArrayList<ParametroType>();
            List<AttachmentType> listaAdjuntos = new ArrayList<AttachmentType>();
            ParametroType parametros = new ParametroType();
            parametros.setNombre("[NOMBRE_SUSCRIPTOR]");
            parametros.setValor(formaPago.getNombreTarjetabiente());
            listaParametros.add(parametros);
            
            EmailserviciosenlineaClientEp emailserviciosenlinea_client_ep = new EmailserviciosenlineaClientEp();
            EmailServiciosEnLinea emailServiciosEnLinea = emailserviciosenlinea_client_ep.getEmailServiciosEnLineaPt();
            emailServiciosEnLinea.process("AVISOCANCELACAMBIOINFORMACION",sesion.getUsuario().getMail(),
                                          sesion.getSuscriptor().getPaisISO(), listaParametros,listaAdjuntos);

        }
    /**
     * Metodo que Valida que se de Click en el Boton Aceptar De popup
     **/

    public String aceptaGuardartarjeta() {
        String respuesta =null;
        //if (aceptaBeneficios1 && aceptaBeneficios2) {
          //  ADFUtils.showInfoMessage("Solo puede seleccionar un beneficio");         
        //
       // }else{
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        ServicioCambioFormaPago servicioFormaPago = new ServicioCambioFormaPago();
                String tarjetaInteligente;
                SerivcioTarjetaInteligente sTI = new SerivcioTarjetaInteligente();
                tarjetaInteligente = sTI.obtenerTarjetaInteligenteMaster(sesion.getCuentaSKY());
                formaPago.setCuenta(sesion.getCuentaSKY());
                formaPago.setContactoRowId(sesion.getSuscriptor().getRowId());
                formaPago.setSistema(sesion.getSistema());
                formaPago.setTarjetaInteligente(tarjetaInteligente);
                formaPago.setIdSesion(sesion.getIdSesion());
                formaPago.setPais(sesion.getSuscriptor().getPais());
                formaPago.setTipoCuenta(sesion.getTipoCuentaBanner());
                formaPago.setCorreoElectronico(sesion.getUsuario().getMail());
                formaPago.setArea("Cambio de Informacion");
                formaPago.setSubArea("Cambio forma pago");
                formaPago.setDescripcion("Cambio de forma de pago");
                if (respuestaBeneficio.getErrorMessage().equalsIgnoreCase("No tiene beneficios")) {
                    formaPago.setProductName("No tiene beneficios");
                    formaPago.setAceptaBeneficio("N");
                }else{
                    if (!beneficioSelect.isEmpty() || beneficioSelect != null) {
                        if (beneficioSelect.equalsIgnoreCase("Beneficio1")) {
                            formaPago.setAceptaBeneficio("Y");
                            formaPago.setProductName(getProducto1());
                        }else if (beneficioSelect.equalsIgnoreCase("Beneficio2")) {
                            formaPago.setAceptaBeneficio("Y");
                            formaPago.setProductName(getProducto2());
                        }else{
                            formaPago.setAceptaBeneficio("N");
                            formaPago.setProductName(respuestaBeneficio.getErrorMessage());
                        }    
                    }else{
                        formaPago.setAceptaBeneficio("N");
                        formaPago.setProductName(respuestaBeneficio.getErrorMessage());
                    }
                    
                    /*
                    if (aceptaBeneficios1) {
                    formaPago.setAceptaBeneficio("Y");
                    formaPago.setProductName(getProducto1());
                    }else if (aceptaBeneficios2) {
                    formaPago.setAceptaBeneficio("Y");
                    formaPago.setProductName(getProducto2());
                    }else{
                            formaPago.setAceptaBeneficio("N");
                            if (isUniverseBeneficio2) {
                                formaPago.setProductName(getProducto1());
                            }else{
                                formaPago.setProductName(getProducto1().concat(",").concat(getProducto2()));
                            }
                        }
                    */
                }
                formaPago.setPaqueteActualAccount(sesion.getPaquete());
                formaPago.setNombreTarjetabiente(formaPago.getNombreTarjetabiente().toUpperCase());
                try {
                    //ADFUtils.showPopup(popup);
                    respuestaBeneficio = servicioFormaPago.procesaCambioFormaPago(formaPago);
                    if (respuestaBeneficio.getErrorCode().equalsIgnoreCase("1")) {
                        ADFUtils.showInfoMessage("Sistema no disponible, por favor intentar m\u00E1s tarde.");
                        respuesta ="Error";
                        //registrar operaciones BAM
                        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CAMBIO_FORMA_PAGO, "CambioFormaPago Web-PC Error 1");
                    }else if(respuestaBeneficio.getErrorCode().equalsIgnoreCase("30")){
                        ADFUtils.showInfoMessage("Para realizar esta operaci\u00F3n por favor comun\u00EDquese a Servicio a Clientes.");
                        respuesta ="Error";
                        //registrar operaciones BAM
                        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CAMBIO_FORMA_PAGO, "CambioFormaPago Web-PC Error 1");
                    }
                    else{
                        //ADFUtils.showInfoMessage("Su solicitud se ha procesado correctamente, su forma de pago actual es Tarjeta de Cr\u00E9dito.");
                        respuesta = "ok";
                        sesion.setCambioFormaPago("true");
                        //registrar operaciones BAM
                        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CAMBIO_FORMA_PAGO, "CambioFormaPago Web-PC Exitoso");
                    }
                } catch (Exception e) {
                    LogPC.printlnError(e);
                    ADFUtils.showErrorMessage(getMensajeProperties("mensaje_PantallaError_generico"));
                    //registrar operaciones BAM
                    OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CAMBIO_FORMA_PAGO, "CambioFormaPago Web-PC ExceptionError");
                }
        //}
        return respuesta;
    }
    
    private CambioFormaPago consultarBinesTDC(CambioFormaPago tarjeta, String organizationId) throws ServicioException {
        ServicioBines sb = new ServicioBines();
        Bines bines = null;
        LogPC.println(this, "consultarBinesTDC [" + organizationId + "] ");
        bines = sb.validarBines(tarjeta.getNumeroTarjeta(), organizationId);
        if (bines.isTarjetaValida()) {
            tarjeta.setCreditoDebito(bines.getCd());
            tarjeta.setTipoTarjeta(bines.getTipoTarjeta());
            tarjeta.setCreditoDebitoTexto(
            //si null entonces vacio
            bines.getCd() == null ? "" :
                //si 01 entonces credito
                bines.getCd().equals("01") ?
                "Crédito" :
                //si otro entonces debito
                "Débito");
        } else {
            throw new ServicioException("Para poder registrar su tarjeta deber\u00E1 llamar a servicio a clientes");
        }
        return tarjeta;
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

    public void setPopup(RichPopup popup) {
        this.popup = popup;
    }

    public RichPopup getPopup() {
        return popup;
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

    public void setFormaPago(CambioFormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public CambioFormaPago getFormaPago() {
        return formaPago;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setIsBasicoAHBO_UNIVERSE(boolean isBasicoAHBO) {
        this.isBasicoAHBO_UNIVERSE = isBasicoAHBO;
    }

    public boolean isIsBasicoAHBO_UNIVERSE() {
        return isBasicoAHBO_UNIVERSE;
    }

    public void setIsTimeOut(boolean isTimeOut) {
        this.isTimeOut = isTimeOut;
    }

    public boolean isIsTimeOut() {
        return isTimeOut;
    }

    public void setAceptaBeneficios1(boolean aceptaBeneficios) {
        this.aceptaBeneficios1 = aceptaBeneficios;
    }

    public boolean isAceptaBeneficios1() {
        return aceptaBeneficios1;
    }

    public void setRespuestaCambioFormaPago(String respuestaCambioFormaPago) {
        this.respuestaCambioFormaPago = respuestaCambioFormaPago;
    }

    public String getRespuestaCambioFormaPago() {
        return respuestaCambioFormaPago;
    }

    public void setAceptaBeneficios2(boolean aceptaBeneficios2) {
        this.aceptaBeneficios2 = aceptaBeneficios2;
    }

    public boolean isAceptaBeneficios2() {
        return aceptaBeneficios2;
    }

    public void setIsUniverseBeneficio2(boolean isUniverseBeneficio2) {
        this.isUniverseBeneficio2 = isUniverseBeneficio2;
    }

    public boolean isIsUniverseBeneficio2() {
        return isUniverseBeneficio2;
    }

    public void setProducto1(String producto1) {
        this.producto1 = producto1;
    }

    public String getProducto1() {
        return producto1;
    }

    public void setProducto2(String producto2) {
        this.producto2 = producto2;
    }

    public String getProducto2() {
        return producto2;
    }

    public void setIndexPC(String indexPC) {
        this.indexPC = indexPC;
    }

    public String getIndexPC() {
        return indexPC;
    }

    public void setMensajeConsultaBeneficio(String mensajeConsultaBeneficio) {
        this.mensajeConsultaBeneficio = mensajeConsultaBeneficio;
    }

    public String getMensajeConsultaBeneficio() {
        return mensajeConsultaBeneficio;
    }

    public void setValidaMenuAceptar(boolean validaMenuAceptar) {
        this.validaMenuAceptar = validaMenuAceptar;
    }

    public boolean isValidaMenuAceptar() {
        return validaMenuAceptar;
    }

    public void setErrorMessageSel(String errorMessageSel) {
        this.errorMessageSel = errorMessageSel;
    }

    public String getErrorMessageSel() {
        return errorMessageSel;
    }

    public void setProductoSel1(String productoSel1) {
        this.productoSel1 = productoSel1;
    }

    public String getProductoSel1() {
        return productoSel1;
    }

    public void setProductoSel2(String productoSel2) {
        this.productoSel2 = productoSel2;
    }

    public String getProductoSel2() {
        return productoSel2;
    }

    public void setBeneficioSelect(String beneficioSelect) {
        this.beneficioSelect = beneficioSelect;
    }

    public String getBeneficioSelect() {
        return beneficioSelect;
    }

    public void setPaisMex(boolean paisMex) {
        this.paisMex = paisMex;
    }

    public boolean isPaisMex() {
        return paisMex;
    }

    public void setTerminos(Map<String, String> terminos) {
        this.terminos = terminos;
    }

    public Map<String, String> getTerminos() {
        return terminos;
    }

    public void setSterminos(String sterminos) {
        this.sterminos = sterminos;
    }

    public String getSterminos() {
        return sterminos;
    }
}
