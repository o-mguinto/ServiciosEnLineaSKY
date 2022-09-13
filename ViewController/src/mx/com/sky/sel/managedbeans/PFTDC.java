package mx.com.sky.sel.managedbeans;

import java.io.Serializable;

import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputHidden;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import mx.com.sky.sel.log.LogPC;
import static mx.com.sky.sel.log.LogPC.println;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.services.beans.billetera.TarjetaBilletera;
import mx.com.sky.sel.services.beans.pagos.tarjetas.Bines;
import mx.com.sky.sel.services.beans.pagos.tarjetas.Tarjeta;
import mx.com.sky.sel.services.cybersource.billetera.BilleteraManagementBean;
import mx.com.sky.sel.services.pagos.tarjetas.ServicioBines;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.UtileriasMB;

public class PFTDC extends UtileriasMB implements Serializable {
    @SuppressWarnings("compatibility:2643048990170148212")
    private static final long serialVersionUID = -4942460061416258272L;

    protected Tarjeta tarjeta;
    private Map<String, String> tipos;
    private Map<String, String> meses;
    private Map<String, String> anios;
    private Map<String, String> creditoDebitoMap;
    protected transient HtmlInputHidden tarjetaProtegida;
    protected transient HtmlInputHidden key_Id;
    protected transient HtmlInputHidden phase_Id;
    protected String tipoTarjetaBines;
    protected String tipoTarjeta;
    protected Boolean tarjetaValida;
    
    //Cyber
    protected List<TarjetaBilletera> tarjetasBilletera;
    protected Map<String, String> tiposPago;
    protected String tipoPago;
    protected TarjetaBilletera tarjetaBillParaPago = null;
    protected static final String CODIGO_CYBER_AMEX = "003";
    protected String cVVTemp;
    protected String mensajeRespuesta;
    protected static final String MENSAJE_PAGO_REALIZADO = "bbpago.pagorealizado";
    protected static final String MENSAJE_ERROR_DEFAULT = "bbpago.error.default";
    //Cyber
    
    public PFTDC() {
        super();
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
        tarjeta = new Tarjeta();
        tipoTarjetaBines="";
        tipoTarjeta=null;
        tarjetaValida=false;
        
        //Cyber
        tarjetasBilletera = consultarTarjetasBilletera();
        actualizarComboBoxFormasPagoBilletera();
        //Cyber
    }
    
    //Metodos cyber
    protected List<TarjetaBilletera> consultarTarjetasBilletera() {
        List<TarjetaBilletera> tarjetasConsultadas = null;
        BilleteraManagementBean billeteraMB = null;
        
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String organizationId = sesion.getSuscriptor().getOrganizacion();
        String cuentaSKY = sesion.getSuscriptor().getCuentaSKY();
        LogPC.println(this, "organizationId: " + organizationId);
        LogPC.println(this, "cuentaSKY: " + cuentaSKY);
        
        billeteraMB = new BilleteraManagementBean();
        
        tarjetasConsultadas = billeteraMB.consultarBilletera(cuentaSKY);
        
        //DUMMY
        //tarjetasConsultadas = billeteraMB.consultarBilletera("501248988964");
        //DUMMY
        
        println(this, tarjetasConsultadas.size() + " Tarjetas obtenidas desde la billetera");
    //        if( tarjetasConsultadas.size() > 0 ) {
    //            hayTarjetas=true;
    //        } else {
    //            hayTarjetas=false;
    //        }
        
        if( tarjetasConsultadas != null && !tarjetasConsultadas.isEmpty() ) {
            for(TarjetaBilletera tarBill : tarjetasConsultadas ) {
                if( tarBill.getTipoTarjeta() != null ) {
                    if( tarBill.getTipoTarjeta().equalsIgnoreCase("CREDITO") ) {
                        tarBill.setTipoTarjetaParaMostrar("crédito");
                    } else if( tarBill.getTipoTarjeta().equalsIgnoreCase("DEBITO") ) {
                        tarBill.setTipoTarjetaParaMostrar("débito");
                    }
                }
                
                
                if( tarBill.getNumeroTarjeta() != null ) {
                    if( tarBill.getNumeroTarjeta().length() >= 4 ) {
                        tarBill.setNumeroTarjetaOculta("************" + tarBill.getNumeroTarjeta().substring(tarBill.getNumeroTarjeta().length()-4, tarBill.getNumeroTarjeta().length()));
                    }
                }
            }
        }
        
        return tarjetasConsultadas;
    }
    
    protected void actualizarComboBoxFormasPagoBilletera(){
        if( this.tarjetasBilletera != null && !this.tarjetasBilletera.isEmpty() ) {
            tiposPago = new LinkedHashMap<String, String>();
            for (TarjetaBilletera tarjetaBilletera : tarjetasBilletera) {
                tiposPago.put(tarjetaBilletera.getNumeroTarjetaOculta() + " - " + tarjetaBilletera.getTipoTarjetaParaMostrar(), tarjetaBilletera.getNumeroTarjeta());
    
            }
        }
    }
    
    public boolean isEmptyTarjetasBilletera() {
        return (this.tarjetasBilletera == null || this.tarjetasBilletera.isEmpty());
    }
    //Metodos cyber

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
    
    private boolean validarTarjeta(){
        LogPC.println(this, "Valores voltage:");
        LogPC.println(this, "tarjetaProtegida: " + tarjetaProtegida.getValue());
        LogPC.println(this, "key_Id: " + key_Id.getValue());
        LogPC.println(this, "phase_Id:" + phase_Id.getValue());
        
            if(!tarjetaProtegida.getValue().toString().isEmpty() 
                && !key_Id.getValue().toString().isEmpty()
                && !phase_Id.getValue().toString().isEmpty()){
                return true;
        }
    return false;
    }

    public void validarNumeroTDC(FacesContext facesContext, UIComponent uIComponent, Object object) {
        String numeroTarjeta = (String)object;
        ServicioBines sb = new ServicioBines();
        String organizationId;
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        organizationId = sesion.getSuscriptor().getOrganizacion();
        Bines bines = sb.validarBines(numeroTarjeta, organizationId);

        tarjeta.setCreditoDebito(bines.getCd());
        tarjeta.setTipo(bines.getTipoTarjeta());

        LogPC.println(this, "tarjeta:" + tarjeta);

        FacesMessage message = null;
        if (!bines.isTarjetaValida()) {
            message = new FacesMessage("Por el momento su tarjeta no puede ser registrada, por favor comun\u00EDquese a servicio a clientes.");
            throw new ValidatorException(message);
        } else if (tarjeta.getTipo().equalsIgnoreCase("AMEX")) {
            if (numeroTarjeta.length() != 15) {
                message = new FacesMessage("Debe introducir los 15 d\u00EDgitos de su tarjeta");
                throw new ValidatorException(message);
            }
        } else {
            if (numeroTarjeta.length() != 16) {
                message = new FacesMessage("Debe introducir los 16 d\u00EDgitos de su tarjeta");
                throw new ValidatorException(message);
            }
        }
        tarjeta.setNumeroTarjeta(numeroTarjeta);
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

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public HtmlInputHidden getTarjetaProtegida() {
        return tarjetaProtegida;
    }
    public void setTarjetaProtegida(HtmlInputHidden tarjetaProtegida) {
        this.tarjetaProtegida = tarjetaProtegida;
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
    
    //Accessors Cyber
    public Map<String, String> getTiposPago() {
        return tiposPago;
    }

    public void setTiposPago(Map<String, String> tiposPago) {
        this.tiposPago = tiposPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setCVVTemp(String cVVTemp) {
        this.cVVTemp = cVVTemp;
    }

    public String getCVVTemp() {
        return cVVTemp;
    }
    
    public TarjetaBilletera getTarjetaBillParaPago() {
        return tarjetaBillParaPago;
    }
    
    //Accessors Cyber
}
