package mx.com.sky.sel.managedbeans.tarjetasbilletera;

import java.io.IOException;
import java.io.Serializable;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.managedbeans.sesion.SesionMB;
import mx.com.sky.sel.services.beans.billetera.TarjetaBilletera;
import mx.com.sky.sel.services.beans.cybersource.CambiarFormaDePagoRequestDTO;
import mx.com.sky.sel.services.beans.cybersource.CambiarFormaDePagoResponseDTO;
import mx.com.sky.sel.services.beans.cybersource.ConsultarProductoRequestDTO;
import mx.com.sky.sel.services.beans.cybersource.ConsultarProductoResponseDTO;
import mx.com.sky.sel.services.beans.cybersource.ConsultarTipoCambioRequestDTO;
import mx.com.sky.sel.services.beans.cybersource.ConsultarTipoCambioResponseDTO;
import mx.com.sky.sel.services.beans.cybersource.DeterminarComercioRequestDTO;
import mx.com.sky.sel.services.beans.cybersource.DeterminarComercioResponseDTO;
import mx.com.sky.sel.services.beans.cybersource.EliminarMetodoDePagoRequestDTO;
import mx.com.sky.sel.services.beans.cybersource.EliminarMetodoDePagoResponseDTO;
import mx.com.sky.sel.services.beans.cybersource.GenerarURLBilleteraRequestDTO;
import mx.com.sky.sel.services.beans.utils.Direccion;
import mx.com.sky.sel.services.cybersource.billetera.BilleteraManagementBean;
import mx.com.sky.sel.services.datosgenerales.ServicioDatosGenerales;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.UtileriasMB;

import oracle.adf.view.rich.component.rich.RichPopup;

public class BBTarjetasBilletera extends UtileriasMB implements Serializable {
    @SuppressWarnings("compatibility:-4893834899654594102")
    private static final long serialVersionUID = -2815253043996548120L;

    private List<TarjetaBilletera> tarjetasBilletera;
    private TarjetaBilletera tarjetaBilleteraEliminar;
    private transient RichPopup popupEliminarMetodoPago;
    
    public BBTarjetasBilletera() {
        super();
        tarjetasBilletera = consultarTarjetasBilletera();
    }
    
    private List<TarjetaBilletera> consultarTarjetasBilletera() {
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

    public List<TarjetaBilletera> getTarjetasBilletera() {
        return tarjetasBilletera;
    }

    public String agregarMetodoPago() {
        LogPC.println(this, "In agregar metodo pago...");
        String portalTokenizacionURL = null;
        HttpServletResponse response = (HttpServletResponse)JSFUtils.getFacesContext().getExternalContext().getResponse();
        BilleteraManagementBean billeteraMB = null;
        billeteraMB = new BilleteraManagementBean();
        GenerarURLBilleteraRequestDTO requestDTOWS = this.crearRequestDTOGenerarURLBilletera();
        
        portalTokenizacionURL = billeteraMB.generarURLBilletera(requestDTOWS);
        
        if( portalTokenizacionURL != null && !portalTokenizacionURL.isEmpty() ) {
            LogPC.println(this, "Haciendo redirect al portal de tokenizacion: " + portalTokenizacionURL + " ...");
            try {
                response.sendRedirect(portalTokenizacionURL);
                JSFUtils.getFacesContext().responseComplete();
            } catch (IOException e) {
                LogPC.println(this, "Exception: " + e.getMessage());
            }
        } else {
            ADFUtils.showErrorMessage("Se presento un error, por favor intentar más tarde");
        }
        
        
        
        return null;
    }
    
    
    public String popupEliminar() {
        LogPC.println(this, "IN popupEliminar...");
        ADFUtils.showPopup(popupEliminarMetodoPago);
        return "stay";
    }
    
    public String cancelarEliminacionMetodoPago(){
        LogPC.println(this, "IN cancelarEliminacionMetodoPago");
        ADFUtils.hidePopup(popupEliminarMetodoPago);
        return null;
    }
    
    public String eliminarMetodoPago() {
        LogPC.println(this, "IN eliminarMetodoPago");
        LogPC.println(this, "Tarjeta a eliminar:");
        LogPC.println(this, "NumeroTarjeta: " + this.tarjetaBilleteraEliminar.getNumeroTarjeta());
        LogPC.println(this, "PaymentInstrument: " + this.tarjetaBilleteraEliminar.getPaymentInstrument());
        LogPC.println(this, "InstrumentId: " + this.tarjetaBilleteraEliminar.getInstrumentId());
        
        BilleteraManagementBean billeteraMB = null;
        billeteraMB = new BilleteraManagementBean();
        EliminarMetodoDePagoRequestDTO eliminarMetodoPagoRequestWSDTO = null;
        EliminarMetodoDePagoResponseDTO eliminarMetodoPagoResponseWSDTO = null;
        DeterminarComercioRequestDTO determinarComercioRequestWSDTO = null;
        DeterminarComercioResponseDTO determinarComercioResponseWSDTO = null;
        eliminarMetodoPagoRequestWSDTO = new EliminarMetodoDePagoRequestDTO();
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        
        eliminarMetodoPagoRequestWSDTO.setNumeroCuenta(sesion.getSuscriptor().getCuentaSKY());
        eliminarMetodoPagoRequestWSDTO.setIdentificadorDeInstrumento(this.tarjetaBilleteraEliminar.getInstrumentId());
        eliminarMetodoPagoRequestWSDTO.setPaymentInstrument(this.tarjetaBilleteraEliminar.getPaymentInstrument());
        
        //Obteniendo el comercioId
        determinarComercioRequestWSDTO = new DeterminarComercioRequestDTO();
        determinarComercioRequestWSDTO.setPais(sesion.getPaisISO());
        determinarComercioRequestWSDTO.setTipoTarjeta(this.tarjetaBilleteraEliminar.getCodigoRedFinanciera());
        determinarComercioResponseWSDTO = billeteraMB.determinarComercio(determinarComercioRequestWSDTO);
        //Obteniendo el comercioId
        
        if( determinarComercioResponseWSDTO != null && determinarComercioResponseWSDTO.getMerchanId() != null &&
            !determinarComercioResponseWSDTO.getMerchanId().isEmpty() ) {
            LogPC.println(this, "ComercioId from ws: " + determinarComercioResponseWSDTO.getMerchanId());
            eliminarMetodoPagoRequestWSDTO.setComercioId(determinarComercioResponseWSDTO.getMerchanId());
            eliminarMetodoPagoResponseWSDTO = billeteraMB.eliminarMetodoDePago(eliminarMetodoPagoRequestWSDTO);
        } else {
            ADFUtils.showErrorMessage("Ha ocurrido un error al realizar la operaci\u00F3n. Por favor intente m\u00E1s tarde.");
        }
        
        if( eliminarMetodoPagoResponseWSDTO != null && eliminarMetodoPagoResponseWSDTO.isMetodoPagoEliminado() ) {
            tarjetasBilletera = consultarTarjetasBilletera();
            ADFUtils.showSuccesfulMessage();
        } else {
            ADFUtils.showErrorMessage("Ha ocurrido un error al realizar la operaci\u00F3n. Por favor intente m\u00E1s tarde.");
        }
        
        ADFUtils.hidePopup(popupEliminarMetodoPago);
        
        //simularEliminacionTarjeta();
        return null;
    }
    
    private void simularEliminacionTarjeta() {
        LogPC.println(this, "tarjetasBilletera.size antes de eliminar: " + this.tarjetasBilletera.size());
        tarjetasBilletera.remove(this.tarjetaBilleteraEliminar);
        LogPC.println(this, "tarjetasBilletera.size despues de eliminar: " + this.tarjetasBilletera.size());
    }
    
    
   private EliminarMetodoDePagoRequestDTO crearEliminarMetodoDePagoRequestDTO() {
           EliminarMetodoDePagoRequestDTO request = null;
           ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
           DeterminarComercioResponseDTO response = new DeterminarComercioResponseDTO();
           TarjetaBilletera consulta = new TarjetaBilletera();
           
           request = new EliminarMetodoDePagoRequestDTO();
           //request.setComercioId(response.getMerchanId());
           request.setNumeroCuenta(sesion.getSuscriptor().getCuentaSKY());
           request.setIdentificadorDeInstrumento(consulta.getInstrumentId());
           request.setPaymentInstrument(consulta.getPaymentInstrument());
           
           
           return request;
       }
    
    private GenerarURLBilleteraRequestDTO crearRequestDTOGenerarURLBilletera() {
        LogPC.println(this, "IN crearRequestDTOGenerarURLBilletera...");
        GenerarURLBilleteraRequestDTO request = null;
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String vigenciaURL = null;
        request = new GenerarURLBilleteraRequestDTO();
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.HOUR_OF_DAY, 24);
        vigenciaURL = String.valueOf(calendar.getTime().getTime()/1000);
        
        //DIreccion desde el servicio ServicioDatosGenerales
        ServicioDatosGenerales datosGeneralesService = null;
        Direccion direccionConsultada = null;
        datosGeneralesService = new ServicioDatosGenerales();
        direccionConsultada = datosGeneralesService.obtenerDireccionEnvio(sesion.getSuscriptor().getRowId());
        LogPC.println(this, "Datos de direccion obtenidos desde el WS ServicioDatosGenerales:");
        LogPC.println(this, "SDG CalleNumero: " + direccionConsultada.getCalleNumero());
        LogPC.println(this, "SDG NumeroExt: " + direccionConsultada.getNumeroExt());
        LogPC.println(this, "SDG NumeroInt: " + direccionConsultada.getNumeroInt());
        LogPC.println(this, "SDG Colonia: " + direccionConsultada.getColonia());
        LogPC.println(this, "SDG Ciudad: " + direccionConsultada.getCiudad());
        LogPC.println(this, "SDG Estado: " + direccionConsultada.getEstado());
        LogPC.println(this, "SDG DelMun: " + direccionConsultada.getDelMun());
        LogPC.println(this, "SDG Cp: " + direccionConsultada.getCp());
        LogPC.println(this, "SDG Telefono: " + direccionConsultada.getTelefono());
        //DIreccion desde el servicio ServicioDatosGenerales
        
        LogPC.println(this, "Mail: " + sesion.getUsuario().getMail());
        LogPC.println(this, "Nombre: " + sesion.getUsuario().getNombre());
        LogPC.println(this, "ApellidoPaterno: " + sesion.getUsuario().getApellidoPaterno());
        LogPC.println(this, "ApellidoMaterno: " + sesion.getUsuario().getApellidoMaterno());
        LogPC.println(this, "PaisISO: " + sesion.getSuscriptor().getPaisISO());
        LogPC.println(this, "vigenciaURL: " + vigenciaURL);
        LogPC.println(this, "Moneda cyber: " + sesion.getMonedaCyber());
        LogPC.println(this, "Currency Code: " + sesion.getSuscriptor().getCurrencyCode());
        LogPC.println(this, "Billing Code: " + sesion.getSuscriptor().getBillingCode());
        
        LogPC.println(this, "CuentaSKY: " + sesion.getSuscriptor().getCuentaSKY());
        
        
        request.setEmail(sesion.getUsuario().getMail());
        request.setNombre(sesion.getUsuario().getNombre());
        request.setAPaterno(sesion.getUsuario().getApellidoPaterno());
        request.setAMaterno(sesion.getUsuario().getApellidoMaterno());
        request.setCalle(direccionConsultada.getCalleNumero());
        request.setNumExt(direccionConsultada.getNumeroExt());
        request.setNumInt(direccionConsultada.getNumeroInt());
        request.setColonia(direccionConsultada.getColonia());
        request.setPaisIso(sesion.getSuscriptor().getPaisISO());
        request.setTelefono(direccionConsultada.getTelefono());
        request.setCiudad(direccionConsultada.getCiudad());
        request.setEstado(direccionConsultada.getEstado());
        request.setMunicipio(direccionConsultada.getDelMun());
        request.setCodigoPostal(direccionConsultada.getCp());
        request.setVigencia(vigenciaURL);
        request.setMoneda(sesion.getMonedaCyber());
        request.setCuenta(sesion.getSuscriptor().getCuentaSKY());
        
        return request;
    }

    public void setPopupEliminarMetodoPago(RichPopup popupEliminarMetodoPago) {
        this.popupEliminarMetodoPago = popupEliminarMetodoPago;
    }

    public RichPopup getPopupEliminarMetodoPago() {
        return popupEliminarMetodoPago;
    }

    public void setTarjetaBilleteraEliminar(TarjetaBilletera tarjetaBilleteraEliminar) {
        this.tarjetaBilleteraEliminar = tarjetaBilleteraEliminar;
    }

    public TarjetaBilletera getTarjetaBilleteraEliminar() {
        return tarjetaBilleteraEliminar;
    }
    
    private ConsultarProductoRequestDTO consultarProductoRequestDTO() {
        ConsultarProductoRequestDTO reqConsultarProducto = null;
        ConfigMenu sesion = (ConfigMenu) JSFUtils.getBean("sesion");
        TarjetaBilletera consulta = new TarjetaBilletera();
        reqConsultarProducto.setProceso("Obtiene Beneficio Penalzacion");
        reqConsultarProducto.setCategoria("Metodo Pago");
        reqConsultarProducto.setOrigen("Web");
        reqConsultarProducto.setCuenta(sesion.getSuscriptor().getCuentaSKY());
        reqConsultarProducto.setNumeroTarjeta(consulta.getMaskedPan().substring(0, 6));


        ConsultarProductoResponseDTO responseConsultarProducto = null;
        if (!responseConsultarProducto.getHeader()
                                      .getCodigoError()
                                      .equalsIgnoreCase("0")) {
            LogPC.println(this, "Ocurrió un error al ConsultarProducto.");

        }
        return reqConsultarProducto;
    }
    
    
    private ConsultarTipoCambioRequestDTO consultarTipoCambioRequestDTO() {
        ConsultarTipoCambioRequestDTO reqConsultarTipoCambio = null;
        SesionMB sesion = new SesionMB();

        reqConsultarTipoCambio.setPEstatus("1");
        reqConsultarTipoCambio.setPPais(sesion.getPaisISO());

        ConsultarTipoCambioResponseDTO consultarTipoCambioResponse = null;
        if (!consultarTipoCambioResponse.getHeader()
                                      .getCodigoError()
                                      .equalsIgnoreCase("0")) {
            LogPC.println(this, "Ocurrió un error al ConsultarProducto.");

        }
        return reqConsultarTipoCambio;
    }
    

    private  DeterminarComercioRequestDTO determinarComercioRequestDTO() {
        DeterminarComercioRequestDTO reqDetCom = new DeterminarComercioRequestDTO();
        SesionMB sesion = new SesionMB();
        TarjetaBilletera consulta = new TarjetaBilletera();
        
        reqDetCom.setAfiliacionRecurrente("N");
        reqDetCom.setOrigen("SEL");
        reqDetCom.setPais(sesion.getPaisISO());
        reqDetCom.setTipoTarjeta(consulta.getTipoTarjeta());

        DeterminarComercioResponseDTO determinarComercioResponse = null;
        if (!determinarComercioResponse.getHeader()
                                      .getCodigoError()
                                      .equalsIgnoreCase("0")) {
            LogPC.println(this, "Ocurrió un error al DterminarComercio.");

        }
        return reqDetCom;
        
    }
    private  CambiarFormaDePagoRequestDTO cambiarFormaDePagoRequestDTO() {
        CambiarFormaDePagoRequestDTO reqCambiarFormaPago = new CambiarFormaDePagoRequestDTO();
        SesionMB sesion = new SesionMB();
        TarjetaBilletera consulta = new TarjetaBilletera();
        
        reqCambiarFormaPago.setNumeroCuenta(sesion.getSuscriptor().getCuentaSKY());
        reqCambiarFormaPago.setPaymentInstrument(consulta.getPaymentInstrument());
        reqCambiarFormaPago.setPagoRecurrente("Y");
        
        CambiarFormaDePagoResponseDTO cambiarFormaDePagoResponse = null;
        if (!cambiarFormaDePagoResponse.getHeader()
                                      .getCodigoError()
                                      .equalsIgnoreCase("0")) {
            LogPC.println(this, "Ocurrió un error al CambiarFormaDePago.");

        }
        return reqCambiarFormaPago;
        
    }
}
