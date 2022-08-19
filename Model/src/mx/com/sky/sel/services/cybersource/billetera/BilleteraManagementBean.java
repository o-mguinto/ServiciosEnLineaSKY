package mx.com.sky.sel.services.cybersource.billetera;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.proxyclients.apigateway.ebf.cambiarformadepago.CambiarFormaDePagoEBF_Client;
import mx.com.sky.sel.proxyclients.apigateway.ebf.cambiarformadepago.type.CambiarFormaDePagoInput;
import mx.com.sky.sel.proxyclients.apigateway.ebf.cambiarformadepago.type.RequestCambiarFormaDePago;
import mx.com.sky.sel.proxyclients.apigateway.ebf.cambiarformadepago.type.ResponseCambiarFormaDePago;
import mx.com.sky.sel.proxyclients.apigateway.ebf.consultarbilletera.ConsultarBilleteraEBF_Client;
import mx.com.sky.sel.proxyclients.apigateway.ebf.consultarbilletera.types.ConsultarBilleteraListInput;
import mx.com.sky.sel.proxyclients.apigateway.ebf.consultarbilletera.types.RequestConsultarBilletera;
import mx.com.sky.sel.proxyclients.apigateway.ebf.consultarbilletera.types.ResponseConsultarBilletera;
import mx.com.sky.sel.proxyclients.apigateway.ebf.eliminarmetododepago.EliminarMetodoDePagoEBF_Client;
import mx.com.sky.sel.proxyclients.apigateway.ebf.eliminarmetododepago.types.BilleteraDePagoListInput;
import mx.com.sky.sel.proxyclients.apigateway.ebf.eliminarmetododepago.types.RequestEliminarMetodoDePago;
import mx.com.sky.sel.proxyclients.apigateway.ebf.eliminarmetododepago.types.ResponseEliminarMetodoDePago;
import mx.com.sky.sel.proxyclients.apigateway.ebf.generarurlbilletera.GenerarURLBilleteraEBF_Client;
import mx.com.sky.sel.proxyclients.apigateway.ebf.generarurlbilletera.types.RequestGenerarURLBilletera;
import mx.com.sky.sel.proxyclients.apigateway.ebf.generarurlbilletera.types.ResponseGenerarURLBilletera;
import mx.com.sky.sel.proxyclients.apigateway.ebf.orquestarprocesopago.OrquestarProcesoPagoPMPEBF_Client;
import mx.com.sky.sel.proxyclients.apigateway.ebf.orquestarprocesopago.types.DatosTarjeta_Entrada;
import mx.com.sky.sel.proxyclients.apigateway.ebf.orquestarprocesopago.types.DatosTransaccion_Entrada;
import mx.com.sky.sel.proxyclients.apigateway.ebf.orquestarprocesopago.types.RequestOrquestarProcesoPagoPMP;
import mx.com.sky.sel.proxyclients.apigateway.ebf.orquestarprocesopago.types.ResponseOrquestarProcesoPagoPMP;
import mx.com.sky.sel.proxyclients.apigateway.ebf.orquestarprocesopago.types.RespuestaPagoTarjeta;
import mx.com.sky.sel.proxyclients.apigateway.ebs.actualizartdcbilletera.ActualizarTDCBilleteraEBS_Client;
import mx.com.sky.sel.proxyclients.apigateway.ebs.actualizartdcbilletera.types.RequestActualizarTDCBilletera;
import mx.com.sky.sel.proxyclients.apigateway.ebs.actualizartdcbilletera.types.ResponseActualizarTDCBilletera;
import mx.com.sky.sel.proxyclients.apigateway.ebs.consultarproducto.ConsultarProductoEBS_Client;
import mx.com.sky.sel.proxyclients.apigateway.ebs.consultarproducto.types.Cabecera;
import mx.com.sky.sel.proxyclients.apigateway.ebs.consultarproducto.types.ContratoSiebel;
import mx.com.sky.sel.proxyclients.apigateway.ebs.consultarproducto.types.RequestConsultarProducto;
import mx.com.sky.sel.proxyclients.apigateway.ebs.consultarproducto.types.ResponseConsultarProducto;
import mx.com.sky.sel.proxyclients.apigateway.ebs.consultartipocambio.ConsultarTipoCambioEBS_Client;
import mx.com.sky.sel.proxyclients.apigateway.ebs.consultartipocambio.types.BilleteraTipoCambio;
import mx.com.sky.sel.proxyclients.apigateway.ebs.consultartipocambio.types.ConsultarTipoCambioInput;
import mx.com.sky.sel.proxyclients.apigateway.ebs.consultartipocambio.types.RequestConsultarTipoCambio;
import mx.com.sky.sel.proxyclients.apigateway.ebs.consultartipocambio.types.ResponseConsultarTipoCambio;
import mx.com.sky.sel.proxyclients.apigateway.ebs.determinarcomercio.DeterminarComercioEBS_Client;
import mx.com.sky.sel.proxyclients.apigateway.ebs.determinarcomercio.types.ConsultarComercioInput;
import mx.com.sky.sel.proxyclients.apigateway.ebs.determinarcomercio.types.RequestDeterminarComercio;
import mx.com.sky.sel.proxyclients.apigateway.ebs.determinarcomercio.types.ResponseDeterminarComercio;
import mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarriesgo.EvaluarRiesgoEBS_Client;
import mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarriesgo.types.ComercioInfo;
import mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarriesgo.types.DatosComerciante;
import mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarriesgo.types.DetalleMonto;
import mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarriesgo.types.InstrumentoDePago;
import mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarriesgo.types.PagoInfo;
import mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarriesgo.types.RequestEvaluarRiesgo;
import mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarriesgo.types.ResponseEvaluarRiesgo;
import mx.com.sky.sel.proxyclients.apigateway.ebs.generaridunicodepago.GenerarIdUnicoDePagoEBS_Client;
import mx.com.sky.sel.proxyclients.apigateway.ebs.generaridunicodepago.types.EntradaProcess;
import mx.com.sky.sel.proxyclients.apigateway.ebs.generaridunicodepago.types.RequestGenerarIdUnicoDePago;
import mx.com.sky.sel.proxyclients.apigateway.ebs.generaridunicodepago.types.ResponseGenerarIdUnicoDePago;
import mx.com.sky.sel.proxyclients.apigateway.headers.request.EBMHeaderRequest;
import mx.com.sky.sel.services.beans.billetera.ActualizarTDCBilleteraResponseDTO;
import mx.com.sky.sel.services.beans.billetera.RequestGenerarIdUnicoDePagoDTO;
import mx.com.sky.sel.services.beans.billetera.RequestOrquestarProcesoPagoDTO;
import mx.com.sky.sel.services.beans.billetera.ResponseGenerarIdUnicoDePagoDTO;
import mx.com.sky.sel.services.beans.billetera.ResponseOrquestarProcesoPagoDTO;
import mx.com.sky.sel.services.beans.billetera.TarjetaBilletera;
import mx.com.sky.sel.services.beans.billetera.TokenDTO;
import mx.com.sky.sel.services.beans.cybersource.CambiarFormaDePagoRequestDTO;
import mx.com.sky.sel.services.beans.cybersource.CambiarFormaDePagoResponseDTO;
import mx.com.sky.sel.services.beans.cybersource.ConsultarProductoRequestDTO;
import mx.com.sky.sel.services.beans.cybersource.ConsultarProductoResponseDTO;
import mx.com.sky.sel.services.beans.cybersource.ConsultarPropiedadAmbienteResponseDTO;
import mx.com.sky.sel.services.beans.cybersource.ConsultarTipoCambioRequestDTO;
import mx.com.sky.sel.services.beans.cybersource.ConsultarTipoCambioResponseDTO;
import mx.com.sky.sel.services.beans.cybersource.DeterminarComercioRequestDTO;
import mx.com.sky.sel.services.beans.cybersource.DeterminarComercioResponseDTO;
import mx.com.sky.sel.services.beans.cybersource.EliminarMetodoDePagoRequestDTO;
import mx.com.sky.sel.services.beans.cybersource.EliminarMetodoDePagoResponseDTO;
import mx.com.sky.sel.services.beans.cybersource.GenerarURLBilleteraRequestDTO;
import mx.com.sky.sel.services.beans.riesgo.EvaluarRiesgoRequestDTO;
import mx.com.sky.sel.services.beans.riesgo.EvaluarRiesgoResponseDTO;
import mx.com.sky.sel.services.cybersource.propiedadesambiente.PropiedadesAmbienteManagementBean;

@Stateless(name = "BilleteraManagement", mappedName = "SEL-BilleteraManagement")
public class BilleteraManagementBean implements BilleteraManagement, BilleteraManagementLocal {
    @Resource
    SessionContext sessionContext;
    private EliminarMetodoDePagoEBF_Client clienteEliminarMetodoDePagoEBF;
    private ConsultarProductoEBS_Client clienteConsultarProductoEBS;
    private ConsultarTipoCambioEBS_Client clienteConsultarTipoCambioEBS;
    private DeterminarComercioEBS_Client clienteDeterminarComercio;
    private GenerarIdUnicoDePagoEBS_Client clienteGenerarIdUnicoDePagoEBS;
    private EvaluarRiesgoEBS_Client clienteEvaluarRiesgoEBS;
    private ActualizarTDCBilleteraEBS_Client clienteActualizarTDCBilleteraEBS;
    private OrquestarProcesoPagoPMPEBF_Client clienteOrquestarProcesoPago;
    
    private CambiarFormaDePagoEBF_Client clienteCambiarFormaDePagoEBF;
    private static final String SISTEMA_ORIGEN = "SEL";
    private static final String CONSULTAR_BILLETERA_OPERACION = "ConsultarBilletera";
    private static final String ELIMINAR_METODO_DE_PAGO_OPERACION = "EliminarMetodoDePago";
    private static final String CONSULTAR_TIPO_CAMBIO = "ConsultarTipoCambio";
    private static final String DETERMINAR_COMERCIO_OPERACION = "DeterminarComercioEBS";
    private static final String DETERMINAR_COMERCIO_AFILIACIONRECURRENTE = "N";
    private static final String CAMBIAR_FORMA_DE_PAGO = "CambiarFormaDePago";
    private static final String CONSULTAR_PRODUCTO_OPERACION = "SKY Obtiene Producto";
    private static final String GENERAR_URL_HEADEROPERACION = "GenerarURL";
    private static final String GENERAR_URL_ESTATUS = "PENDIENTE";
    private static final String GENERAR_URL_SERVICIO = "SKY";
    private static final String GENERAR_URL_OPERACION = "TOKEN";
    private static final String GENERAR_URL_ORIGEN = "SEL";
    private static final String GENERARIDUNICOPAGO_OPERACION = "GenerarIdentificador";
    private static final String GENERARIDUNICOPAGO_PROCESO = "PAGO";
    

    public BilleteraManagementBean() {
    }

    @Override
    public List<TarjetaBilletera> consultarBilletera(String CuentaSKY) {
        List<TarjetaBilletera> tarjetasBilletera = new ArrayList<TarjetaBilletera>();
        TarjetaBilletera tarjetaBilletera = null;
        ConsultarBilleteraEBF_Client wsClient = null;
        RequestConsultarBilletera wsRequest = null;
        ResponseConsultarBilletera wsResponse = null;
        EBMHeaderRequest wsHeaderRequest = null;
        PropiedadesAmbienteManagementBean cyberSourcePropertiesMB = new PropiedadesAmbienteManagementBean();
        
        ConsultarPropiedadAmbienteResponseDTO propiedadesAmbiente = cyberSourcePropertiesMB.consultarPropiedadesAmbiente(Arrays.asList(0,6,7));
        wsClient = new ConsultarBilleteraEBF_Client(propiedadesAmbiente.getPropiedades().get(0), propiedadesAmbiente.getPropiedades().get(6), propiedadesAmbiente.getPropiedades().get(7));
        wsHeaderRequest = new EBMHeaderRequest();
        wsHeaderRequest.setOperacion(CONSULTAR_BILLETERA_OPERACION);
        wsHeaderRequest.setSistemaOrigen(SISTEMA_ORIGEN);
        
        wsRequest = new RequestConsultarBilletera();
        wsRequest.setNumeroCuenta(CuentaSKY);
        wsRequest.setHeader(wsHeaderRequest);



        wsResponse = wsClient.consultarBilletera(wsRequest);
        
        if( wsResponse != null && wsResponse.getHeader() != null && wsResponse.getHeader().getErrorNegocio() != null &&
            wsResponse.getHeader().getErrorNegocio().getCodigoError() != null &&
            wsResponse.getHeader().getErrorNegocio().getCodigoError().equalsIgnoreCase("0") &&
            wsResponse.getItems() != null && !wsResponse.getItems().isEmpty() ) {
            for( ConsultarBilleteraListInput billeteraItem : wsResponse.getItems() ) {
                LogPC.println(this, billeteraItem);
                LogPC.println(this, "--------------------------------------------------------------------------------");
                tarjetaBilletera = new TarjetaBilletera();
                
                tarjetaBilletera.setNumeroTarjeta(billeteraItem.getMaskedPan());
                tarjetaBilletera.setRedFinanciera(billeteraItem.getDescripcionTipoTarjeta().toUpperCase());                
                tarjetaBilletera.setRecurrente(billeteraItem.getRecurrente() != null &&
                                               billeteraItem.getRecurrente().equalsIgnoreCase("Y"));
                tarjetaBilletera.setTipoTarjeta(billeteraItem.getTipoBin());
                tarjetaBilletera.setPaymentInstrument(billeteraItem.getPaymentInstrument());
                tarjetaBilletera.setInstrumentId(billeteraItem.getInstrumentId());
                tarjetaBilletera.setCodigoRedFinanciera(billeteraItem.getTipoTarjeta());
                tarjetaBilletera.setId(billeteraItem.getId());
                tarjetaBilletera.setFechaExp(billeteraItem.getFechaExp());
                tarjetaBilletera.setNombreTarjeta(billeteraItem.getNombreTarjeta());
                
                tarjetasBilletera.add(tarjetaBilletera);
            }
        }
        
        //DUMMY
        //tarjetasBilletera = this.consultarBilleteraDummy();
        //DUMMY
        
        return tarjetasBilletera;
    }
    
    private List<TarjetaBilletera> consultarBilleteraDummy() {
        List<TarjetaBilletera> tarjetasBilletera = new ArrayList<TarjetaBilletera>();
        TarjetaBilletera tarjetaBilletera = null;
        
        tarjetaBilletera = new TarjetaBilletera();
        tarjetaBilletera.setNumeroTarjeta("4152316702167398");
        tarjetaBilletera.setRedFinanciera("VISA");
        tarjetaBilletera.setRecurrente(false);
        tarjetaBilletera.setPaymentInstrument("E001B8D762AA3DAEE053AF598E0A0200");
        tarjetaBilletera.setInstrumentId("7030000000112091111");
        tarjetasBilletera.add(tarjetaBilletera);
        
        tarjetaBilletera = new TarjetaBilletera();
        tarjetaBilletera.setNumeroTarjeta("5256786740982564");
        tarjetaBilletera.setRedFinanciera("VISA");
        tarjetaBilletera.setRecurrente(false);
        tarjetaBilletera.setPaymentInstrument("E001B8D762AA3DAEE053AF598E0A0201");
        tarjetaBilletera.setInstrumentId("7030000000112091112");
        tarjetasBilletera.add(tarjetaBilletera);
        
        tarjetaBilletera = new TarjetaBilletera();
        tarjetaBilletera.setNumeroTarjeta("4812814781092344");
        tarjetaBilletera.setRedFinanciera("MASTERCARD");
        tarjetaBilletera.setRecurrente(true);
        tarjetaBilletera.setPaymentInstrument("E001B8D762AA3DAEE053AF598E0A0202");
        tarjetaBilletera.setInstrumentId("7030000000112091113");
        tarjetasBilletera.add(tarjetaBilletera);
        
        tarjetaBilletera = new TarjetaBilletera();
        tarjetaBilletera.setNumeroTarjeta("5064346789120934");
        tarjetaBilletera.setRedFinanciera("VISA");
        tarjetaBilletera.setRecurrente(false);
        tarjetaBilletera.setPaymentInstrument("E001B8D762AA3DAEE053AF598E0A0203");
        tarjetaBilletera.setInstrumentId("7030000000112091114");
        tarjetasBilletera.add(tarjetaBilletera);
        
        tarjetaBilletera = new TarjetaBilletera();
        tarjetaBilletera.setNumeroTarjeta("4915663890123674");
        tarjetaBilletera.setRedFinanciera("MASTERCARD");
        tarjetaBilletera.setRecurrente(false);
        tarjetaBilletera.setPaymentInstrument("E001B8D762AA3DAEE053AF598E0A0204");
        tarjetaBilletera.setInstrumentId("7030000000112091115");
        tarjetasBilletera.add(tarjetaBilletera);
        
        
        return tarjetasBilletera;
    }

 
    @Override
    public EliminarMetodoDePagoResponseDTO eliminarMetodoDePago(EliminarMetodoDePagoRequestDTO requestDTO) {
        System.out.println("Llamando a EliminarMetodoDePago()");
        PropiedadesAmbienteManagementBean cyberSourcePropertiesMB = new PropiedadesAmbienteManagementBean();
            
        ConsultarPropiedadAmbienteResponseDTO propiedadesAmbiente = cyberSourcePropertiesMB.consultarPropiedadesAmbiente(Arrays.asList(0,6,7));
        this.clienteEliminarMetodoDePagoEBF = new EliminarMetodoDePagoEBF_Client(propiedadesAmbiente.getPropiedades().get(0), propiedadesAmbiente.getPropiedades().get(6), propiedadesAmbiente.getPropiedades().get(7));
        
        RequestEliminarMetodoDePago requestWS = new RequestEliminarMetodoDePago();
        EBMHeaderRequest header = new EBMHeaderRequest();
        List<BilleteraDePagoListInput> listBilleteraDePago = new ArrayList<BilleteraDePagoListInput>();
        BilleteraDePagoListInput itemBilleteraDePago = new BilleteraDePagoListInput();
        itemBilleteraDePago.setComercioId(requestDTO.getComercioId());
        itemBilleteraDePago.setIdentificadorDeInstrumento(requestDTO.getIdentificadorDeInstrumento());
        itemBilleteraDePago.setNumeroCuenta(requestDTO.getNumeroCuenta());
        itemBilleteraDePago.setPaymentInstrument(requestDTO.getPaymentInstrument());
        
        listBilleteraDePago.add(itemBilleteraDePago);
        
        header.setOperacion(ELIMINAR_METODO_DE_PAGO_OPERACION);
        header.setSistemaOrigen(SISTEMA_ORIGEN);
        
        requestWS.setHeader(header);
        requestWS.setBilleteradepagolistinput(listBilleteraDePago);
        
        ResponseEliminarMetodoDePago responseWS = clienteEliminarMetodoDePagoEBF.eliminarMetodoDePago(requestWS);
        EliminarMetodoDePagoResponseDTO responseDTO = new EliminarMetodoDePagoResponseDTO();
        
        if( responseWS != null && responseWS.getHeader() != null && responseWS.getHeader().getErrorNegocio() != null &&
            responseWS.getHeader().getErrorNegocio().getCodigoError() != null &&
            responseWS.getHeader().getErrorNegocio().getCodigoError().equalsIgnoreCase("0") ) {
            //El metodo de pago se elimino de forma correcta
            responseDTO.setMetodoPagoEliminado(true);
        } else if( responseWS != null && responseWS.getHeader() != null &&
                   responseWS.getHeader().getErrorNegocio() != null ) {
            //El metodo de pago no se elimino, se obtiene la descripcion del error regresada por el servicio.
            responseDTO.setMetodoPagoEliminado(false);
            responseDTO.setDescripcionError(responseWS.getHeader().getErrorNegocio().getDescripcionError());
        } else {
            //El metodo de pago no se elimino, el servicio no regresa la descripcion del error.
            responseDTO.setMetodoPagoEliminado(false);
            responseDTO.setDescripcionError("Error generico, el WS eliminarMetodoPago no regresa el error.");
        }
        
        return responseDTO;
    }

    @Override
    public String generarURLBilletera(GenerarURLBilleteraRequestDTO request) {
        String billeteraURL = null;
        GenerarURLBilleteraEBF_Client wsClient = null;
        RequestGenerarURLBilletera wsProxyRequest = null;
        ResponseGenerarURLBilletera wsResponse = null;
        
        PropiedadesAmbienteManagementBean cyberSourcePropertiesMB = new PropiedadesAmbienteManagementBean();
        
        ConsultarPropiedadAmbienteResponseDTO propiedadesAmbiente = cyberSourcePropertiesMB.consultarPropiedadesAmbiente(Arrays.asList(0,6,7,9));
        wsClient = new GenerarURLBilleteraEBF_Client(propiedadesAmbiente.getPropiedades().get(0), propiedadesAmbiente.getPropiedades().get(6), propiedadesAmbiente.getPropiedades().get(7));
        
        wsProxyRequest = this.crearProxyRequestGenerarURLBilletera(request);
        System.out.println("URL para redirect a SEL por parte del portal de tokenizacion: " + propiedadesAmbiente.getPropiedades().get(9));
        wsProxyRequest.setUrlBTGS(propiedadesAmbiente.getPropiedades().get(9));
        //DUMMY
        //wsProxyRequest = this.crearProxyRequestGenerarURLBilleteraDUMMY();
        //DUMMY
        


        wsResponse = wsClient.generarURLBilletera(wsProxyRequest);
        
        if( wsResponse != null && wsResponse.getHeader() != null && wsResponse.getHeader().getErrorNegocio() != null &&
            wsResponse.getHeader().getErrorNegocio().getCodigoError() != null &&
            wsResponse.getHeader().getErrorNegocio().getCodigoError().equalsIgnoreCase("0") ) {
            
            System.out.println("URLBilletera:" + wsResponse.getUrlBilletera());
            billeteraURL = wsResponse.getUrlBilletera();
            
        }

        return billeteraURL;
    }
    
    private RequestGenerarURLBilletera crearProxyRequestGenerarURLBilletera(GenerarURLBilleteraRequestDTO requestDTO) {
        RequestGenerarURLBilletera requestProxy = null;
        EBMHeaderRequest wsHeaderRequest = null;
        
        if( requestDTO != null ) {
            requestProxy = new RequestGenerarURLBilletera();
            
            wsHeaderRequest = new EBMHeaderRequest();
            wsHeaderRequest.setOperacion(GENERAR_URL_HEADEROPERACION);
            wsHeaderRequest.setSistemaOrigen(SISTEMA_ORIGEN);
            requestProxy.setHeader(wsHeaderRequest);
            
            requestProxy.setEmail(requestDTO.getEmail());
            requestProxy.setEstatus(GENERAR_URL_ESTATUS);
            requestProxy.setServicio(GENERAR_URL_SERVICIO);
            requestProxy.setOperacion(GENERAR_URL_OPERACION);
            requestProxy.setOrigen(GENERAR_URL_ORIGEN);
            requestProxy.setNombre(requestDTO.getNombre());
            requestProxy.setAPaterno(requestDTO.getAPaterno());
            requestProxy.setAMaterno(requestDTO.getAMaterno());
            requestProxy.setCalle(requestDTO.getCalle());
            requestProxy.setNumExt(requestDTO.getNumExt());
            requestProxy.setNumInt(requestDTO.getNumInt());
            requestProxy.setColonia(requestDTO.getColonia());
            requestProxy.setPaisISO(requestDTO.getPaisIso());
            requestProxy.setTelefono(requestDTO.getTelefono());
            requestProxy.setCiudad(requestDTO.getCiudad());
            requestProxy.setEstado(requestDTO.getEstado());
            requestProxy.setMunicipio(requestDTO.getMunicipio());
            requestProxy.setCodigoPostal(requestDTO.getCodigoPostal());
            requestProxy.setVigencia(requestDTO.getVigencia());
            requestProxy.setMoneda(requestDTO.getMoneda());
            requestProxy.setCuenta(requestDTO.getCuenta());
        }
        
        return requestProxy;
    }
    
    
    
    
    private RequestGenerarURLBilletera crearProxyRequestGenerarURLBilleteraDUMMY() {
        RequestGenerarURLBilletera requestProxy = null;
        EBMHeaderRequest wsHeaderRequest = null;
        requestProxy = new RequestGenerarURLBilletera();
        
        wsHeaderRequest = new EBMHeaderRequest();
        wsHeaderRequest.setOperacion(GENERAR_URL_HEADEROPERACION);
        wsHeaderRequest.setSistemaOrigen(SISTEMA_ORIGEN);
        requestProxy.setHeader(wsHeaderRequest);
        
        requestProxy.setEmail("adrianji@yopmail.com");
        requestProxy.setEstatus(GENERAR_URL_ESTATUS);
        requestProxy.setServicio(GENERAR_URL_SERVICIO);
        requestProxy.setOperacion(GENERAR_URL_OPERACION);
        requestProxy.setOrigen(GENERAR_URL_ORIGEN);
        requestProxy.setNombre("Adrian");
        requestProxy.setAPaterno("Juarez");
        requestProxy.setAMaterno("Ibarra");
        requestProxy.setCalle("Portales");
        requestProxy.setNumExt("100");
        requestProxy.setNumInt("02");
        requestProxy.setColonia("Portales");
        requestProxy.setPaisISO("MX");
        requestProxy.setTelefono("5578451299");
        requestProxy.setCiudad("cdmx");
        requestProxy.setEstado("Mexico");
        requestProxy.setMunicipio("Tlalpan");
        requestProxy.setCodigoPostal("03500");
        requestProxy.setVigencia("1973617680");
        requestProxy.setMoneda("MXN");
        requestProxy.setCuenta("5012121212");
        
        return requestProxy;
    }
    
    public ConsultarProductoResponseDTO consultarProducto(ConsultarProductoRequestDTO reqConsultarProducto){
        System.out.println("Llamando a ConsultarProducto()");
        PropiedadesAmbienteManagementBean cyberSourcePropertiesMB = new PropiedadesAmbienteManagementBean();
        
        if( clienteConsultarProductoEBS == null ){
            ConsultarPropiedadAmbienteResponseDTO propiedadesAmbiente = cyberSourcePropertiesMB.consultarPropiedadesAmbiente(Arrays.asList(0,6,7));
            clienteConsultarProductoEBS = new ConsultarProductoEBS_Client(propiedadesAmbiente.getPropiedades().get(0), propiedadesAmbiente.getPropiedades().get(6), propiedadesAmbiente.getPropiedades().get(7));
        }else{
          ConsultarPropiedadAmbienteResponseDTO propiedadesAmbiente = cyberSourcePropertiesMB.consultarPropiedadesAmbiente(Arrays.asList(4));
        }
        
        ConsultarProductoResponseDTO responseDTO = new ConsultarProductoResponseDTO();
        RequestConsultarProducto requestWS = new RequestConsultarProducto();
        Cabecera cabeceraReq = new Cabecera();
        ContratoSiebel contratoSiebelReq = new ContratoSiebel();
        
        cabeceraReq.setAplicativo(SISTEMA_ORIGEN);
        cabeceraReq.setOperacion(CONSULTAR_PRODUCTO_OPERACION);
        
        contratoSiebelReq.setCabecera(cabeceraReq);
        contratoSiebelReq.setProceso(reqConsultarProducto.getProceso());
        contratoSiebelReq.setCuenta(reqConsultarProducto.getCuenta());
        contratoSiebelReq.setCategoria(reqConsultarProducto.getCategoria());
        contratoSiebelReq.setNumeroTarjeta(reqConsultarProducto.getNumeroTarjeta());
        contratoSiebelReq.setOrigen(reqConsultarProducto.getOrigen());
        
        requestWS.getContratoSiebel().add(contratoSiebelReq);
        ResponseConsultarProducto responseWS = clienteConsultarProductoEBS.ConsultarProducto(requestWS);
        
        if(responseWS != null && responseWS.getHeader() != null){
            System.out.println("Error Tecnico " + responseWS.getHeader().getErrorTecnico().getCode());
            System.out.println("Error Negocio " + responseWS.getHeader().getErrorNegocio().getCodigoError() + " " + responseWS.getHeader().getErrorNegocio().getDescripcionError());
            if(responseWS.getHeader().getErrorNegocio() != null && responseWS.getHeader().getErrorNegocio().getCodigoError() != null){
                if(!responseWS.getHeader().getErrorNegocio().getCodigoError().equals("0")){
                    responseDTO.getHeader().setCodigoError(responseWS.getHeader().getErrorNegocio().getCodigoError());
                    return responseDTO;
                }
                if(!responseWS.getHeader().getErrorTecnico().getCode().equalsIgnoreCase("ok")){
                    responseDTO.getHeader().setCodigoError("1");
                    return responseDTO;
                }
                
                responseDTO.getHeader().setCodigoError("0");
                System.out.println("Status " + responseWS.getHeader().getErrorTecnico().getCode() + " " + responseWS.getHeader().getErrorNegocio().getCodigoError());
            }
        }
        
        return responseDTO;
    }

    @Override
    public ConsultarTipoCambioResponseDTO consultarTipoCambio(ConsultarTipoCambioRequestDTO reqTipoCambio) {
        System.out.println("Llamando a ConsultarTipoCambio()");
        PropiedadesAmbienteManagementBean cyberSourcePropertiesMB = new PropiedadesAmbienteManagementBean();
        
        if( clienteConsultarTipoCambioEBS == null ){
            ConsultarPropiedadAmbienteResponseDTO propiedadesAmbiente = cyberSourcePropertiesMB.consultarPropiedadesAmbiente(Arrays.asList(0,6,7));
            clienteConsultarTipoCambioEBS = new ConsultarTipoCambioEBS_Client(propiedadesAmbiente.getPropiedades().get(0), propiedadesAmbiente.getPropiedades().get(6), propiedadesAmbiente.getPropiedades().get(7));
        }
        
        EBMHeaderRequest header = new EBMHeaderRequest();
        header.setOperacion(CONSULTAR_TIPO_CAMBIO);
        header.setSistemaOrigen(SISTEMA_ORIGEN);
        
        ConsultarTipoCambioInput input = new ConsultarTipoCambioInput();
        input.setPEstatus(reqTipoCambio.getPEstatus());
        input.setPPais(reqTipoCambio.getPPais());
        
        RequestConsultarTipoCambio requestWS = new RequestConsultarTipoCambio();
        requestWS.setHeader(header);
        requestWS.setInput(input);
        
        ResponseConsultarTipoCambio responseWS = clienteConsultarTipoCambioEBS.consultarTipoCambio(requestWS);
        ConsultarTipoCambioResponseDTO responseDTO = new ConsultarTipoCambioResponseDTO();
        if(responseWS != null && responseWS.getHeader() != null) {
            System.out.println("Error Tecnico " + responseWS.getHeader().getErrorTecnico().getCode());
            System.out.println("Error Negocio " + responseWS.getHeader().getErrorNegocio().getCodigoError() + " " + responseWS.getHeader().getErrorNegocio().getDescripcionError());
            if(responseWS.getHeader().getErrorNegocio() != null && responseWS.getHeader().getErrorNegocio().getCodigoError() != null) {
                if(responseWS.getHeader().getErrorNegocio().getCodigoError().equals("100")) {
                    responseDTO.getHeader().setCodigoError("0");
                    return responseDTO;
                }
            } else {
                System.out.println("Error inesperado...");
                responseDTO.getHeader().setCodigoError("-1");
                return responseDTO;
            }
                    
            responseDTO.getHeader().setCodigoError("0");
            System.out.println("Status " + responseWS.getHeader().getErrorTecnico().getCode() + " " + responseWS.getHeader().getErrorNegocio().getCodigoError());
            System.out.println("Tipo de Cambios Recuperados " + responseWS.getBilleteraTipoCambioCollection().getBilleteraTipoCambio().size());
            if(responseWS.getBilleteraTipoCambioCollection().getBilleteraTipoCambio() != null) {//si se recupera tarjetas
                responseDTO.setBilleteraTipoCambioCollection(responseWS.getBilleteraTipoCambioCollection());
                for(BilleteraTipoCambio tipoCambio : responseWS.getBilleteraTipoCambioCollection().getBilleteraTipoCambio()) {
                    System.out.println("Id : "+tipoCambio.getId());
                    System.out.println("Estatus : "+tipoCambio.getEstatus());
                    System.out.println("Pais : "+tipoCambio.getPais());
                    System.out.println("Origen : "+tipoCambio.getOrigen());
                    System.out.println("Destino : "+tipoCambio.getDestino());
                    System.out.println("Tasa : "+tipoCambio.getTasa());
                    System.out.println("FechaVigenciaInicio : "+tipoCambio.getFechaVigenciaInicio());
                    System.out.println("FechaVigenciaFin : "+tipoCambio.getFechaVigenciaFin());
                    System.out.println("FechaCreacion : "+tipoCambio.getFechaCreacion());
                    System.out.println("FechaActualizacion : "+tipoCambio.getFechaActualizacion());
                }
            }
        }
        
        return responseDTO;
    }
    
    @Override
    public DeterminarComercioResponseDTO determinarComercio(DeterminarComercioRequestDTO reqDeterminarCom){
        System.out.println("Llamando a determinarComercio()");
        PropiedadesAmbienteManagementBean cyberSourcePropertiesMB = new PropiedadesAmbienteManagementBean();
        
        if( clienteDeterminarComercio == null ){
            ConsultarPropiedadAmbienteResponseDTO propiedadesAmbiente = cyberSourcePropertiesMB.consultarPropiedadesAmbiente(Arrays.asList(0,6,7));
            clienteDeterminarComercio = new DeterminarComercioEBS_Client(propiedadesAmbiente.getPropiedades().get(0), propiedadesAmbiente.getPropiedades().get(6), propiedadesAmbiente.getPropiedades().get(7));
        }
               
        DeterminarComercioResponseDTO responseDTO = new DeterminarComercioResponseDTO();
        RequestDeterminarComercio requestWS = new RequestDeterminarComercio();
        ResponseDeterminarComercio responseWS = new ResponseDeterminarComercio();
        
        EBMHeaderRequest header = new EBMHeaderRequest();
        header.setOperacion(DETERMINAR_COMERCIO_OPERACION);
        header.setSistemaOrigen(SISTEMA_ORIGEN);

        ConsultarComercioInput inputParameters = new ConsultarComercioInput();
        inputParameters.setSistema(SISTEMA_ORIGEN);
        inputParameters.setPais(reqDeterminarCom.getPais());
        inputParameters.setTipoTarjeta(reqDeterminarCom.getTipoTarjeta());
        inputParameters.setAfiliacionRecurrente(DETERMINAR_COMERCIO_AFILIACIONRECURRENTE);
        
        requestWS.setHeader(header);
        requestWS.setInputParameters(inputParameters);
        
        responseWS = clienteDeterminarComercio.determinarComercioEBS(requestWS);

        if(responseWS != null && responseWS.getHeader() != null){
            System.out.println("Error Tecnico " + responseWS.getHeader().getErrorTecnico().getCode() + " " + responseWS.getHeader().getErrorNegocio().getCodigoError());
            System.out.println("Error Negocio " + responseWS.getHeader().getErrorNegocio().getCodigoError() + " " + responseWS.getHeader().getErrorNegocio().getDescripcionError());
            if(responseWS.getHeader().getErrorNegocio() != null && responseWS.getHeader().getErrorNegocio().getCodigoError() != null){
                if(!responseWS.getHeader().getErrorNegocio().getCodigoError().equals("0")){
                    responseDTO.getHeader().setCodigoError(responseWS.getHeader().getErrorNegocio().getCodigoError());
                    return responseDTO;
                }
                if(!responseWS.getHeader().getErrorTecnico().getCode().equalsIgnoreCase("ok")){
                    responseDTO.getHeader().setCodigoError("1");
                    return responseDTO;
                }
                responseDTO.setMerchanId(responseWS.getBilleteraComercioCollection().getBilleteraComercio().get(0).getMid());
                responseDTO.setAfiliacion(responseWS.getBilleteraComercioCollection().getBilleteraComercio().get(0).getAfiliacion());
                responseDTO.setAfiliacionRecurrente(responseWS.getBilleteraComercioCollection().getBilleteraComercio().get(0).getAfiliacionRecurrente());
                responseDTO.setClearingHouse(responseWS.getBilleteraComercioCollection().getBilleteraComercio().get(0).getClearingHouse());
                responseDTO.setCodigoMoneda(responseWS.getBilleteraComercioCollection().getBilleteraComercio().get(0).getCodigoMoneda());
                responseDTO.getHeader().setCodigoError("0");
            }else{
                responseDTO.getHeader().setCodigoError("-1");
            }
        }
        return responseDTO;
    }
    
    @Override
    public ResponseGenerarIdUnicoDePagoDTO generarIdUnicoDePago(RequestGenerarIdUnicoDePagoDTO reqGenIdUnicoP){
        System.out.println("BilleteraManagementBean.generarIdUnicoDePago()");
        PropiedadesAmbienteManagementBean cyberSourcePropertiesMB = new PropiedadesAmbienteManagementBean();

        if (this.clienteGenerarIdUnicoDePagoEBS == null){
            ConsultarPropiedadAmbienteResponseDTO propiedadesAmbiente =
                cyberSourcePropertiesMB.consultarPropiedadesAmbiente(Arrays.asList(0, 6, 7));
            clienteGenerarIdUnicoDePagoEBS =
                new GenerarIdUnicoDePagoEBS_Client(propiedadesAmbiente.getPropiedades().get(0),
                                            propiedadesAmbiente.getPropiedades().get(6),
                                            propiedadesAmbiente.getPropiedades().get(7));
        }
        ResponseGenerarIdUnicoDePagoDTO responseDTO = new ResponseGenerarIdUnicoDePagoDTO();
        RequestGenerarIdUnicoDePago requestWS = new RequestGenerarIdUnicoDePago();
        ResponseGenerarIdUnicoDePago responseWS = new ResponseGenerarIdUnicoDePago();
        EntradaProcess entadaP = new EntradaProcess();
        EBMHeaderRequest header = new EBMHeaderRequest();
        header.setOperacion(GENERARIDUNICOPAGO_OPERACION);
        header.setSistemaOrigen(SISTEMA_ORIGEN);
        
        entadaP.setCuenta(reqGenIdUnicoP.getCuenta());
        entadaP.setProceso(GENERARIDUNICOPAGO_PROCESO);
        entadaP.setSistemaOrigen(SISTEMA_ORIGEN);
        entadaP.setClearingHouse(reqGenIdUnicoP.getClearingHouse());
        
        requestWS.setHeader(header);
        requestWS.setEntradaProcess(entadaP);
        
        responseWS = clienteGenerarIdUnicoDePagoEBS.generarIdUnicoDePago(requestWS);
        //aqui se agrega toda la logica de manejo de respuesta del WS
        if(responseWS != null && responseWS.getHeader() != null){
            System.out.println("Error Tecnico " + responseWS.getHeader().getErrorTecnico().getCode() + " " + responseWS.getHeader().getErrorNegocio().getCodigoError());
            System.out.println("Error Negocio " + responseWS.getHeader().getErrorNegocio().getCodigoError() + " " + responseWS.getHeader().getErrorNegocio().getDescripcionError());
            if(responseWS.getHeader().getErrorNegocio() != null && responseWS.getHeader().getErrorNegocio().getCodigoError() != null){
                if(!responseWS.getHeader().getErrorNegocio().getCodigoError().equals("0")){
                    responseDTO.getHeader().setCodigoError(responseWS.getHeader().getErrorNegocio().getCodigoError());
                    return responseDTO;
                }
                if( !responseWS.getHeader().getErrorTecnico().getCode().equalsIgnoreCase("ok")
                    && !responseWS.getHeader().getErrorTecnico().getCode().equalsIgnoreCase("0")
                ){
                    responseDTO.getHeader().setCodigoError("1");
                    return responseDTO;
                }
                responseDTO.setIdPagoSKY(responseWS.getSalidaProcess().getIdPagoSKY());
                responseDTO.getHeader().setCodigoError("0");
            }else{
                responseDTO.getHeader().setCodigoError("-1");
            }
        }
        return responseDTO;
    }
    
    
    
    
    public EvaluarRiesgoResponseDTO EvaluarRiesgoTdcTdd(EvaluarRiesgoRequestDTO reqEvalRiesgo){
        System.out.println("EvaluadorRiesgoManagementBean.EvaluarRiesgoTdcTdd()");
        
        if (this.clienteEvaluarRiesgoEBS == null) {
            PropiedadesAmbienteManagementBean cyberSourcePropertiesMB = new PropiedadesAmbienteManagementBean();
            ConsultarPropiedadAmbienteResponseDTO propiedadesAmbiente =
                cyberSourcePropertiesMB.consultarPropiedadesAmbiente(Arrays.asList(0, 6, 7));
            clienteEvaluarRiesgoEBS =
                new EvaluarRiesgoEBS_Client(propiedadesAmbiente.getPropiedades().get(0),
                                            propiedadesAmbiente.getPropiedades().get(6),
                                            propiedadesAmbiente.getPropiedades().get(7));
        }
        
        EvaluarRiesgoResponseDTO responseDTO = new EvaluarRiesgoResponseDTO();
        RequestEvaluarRiesgo requestWS = new RequestEvaluarRiesgo();
        ResponseEvaluarRiesgo responseWS = new ResponseEvaluarRiesgo();
        
        EBMHeaderRequest header = new EBMHeaderRequest();
        header.setOperacion("EvaluarRiesgoOsbPciABCS");
        header.setSistemaOrigen(SISTEMA_ORIGEN);
        
        requestWS.setHeader(header);
        ComercioInfo comInfo = new ComercioInfo();
        mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarriesgo.types.OrdenInfo order = new mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarriesgo.types.OrdenInfo();
        PagoInfo pago= new PagoInfo();
        
        InstrumentoDePago instPago = new InstrumentoDePago();
        DetalleMonto detMonto = new DetalleMonto();
        
        comInfo.setCodigoSKY(reqEvalRiesgo.getCodigoSKY());
        comInfo.setComercioId(reqEvalRiesgo.getMId());
        comInfo.setIndicadorComercio("");//"internet");
        comInfo.setTransaccionId("");
        instPago.setInstumentoDePagoId(reqEvalRiesgo.getInstrumentoDePagoId());
        pago.setInstrumentoDePago(instPago);
        
        detMonto.setMonedaISO(reqEvalRiesgo.getMonedaISO());
        detMonto.setMontoTotal(reqEvalRiesgo.getMontoTotal());
        order.setDetalleMonto(detMonto);
        
        requestWS.setComercioInfo(comInfo);
        //requestWS.setInstrumentoDePago(instPago);
        //requestWS.setDetalleMonto(detMonto);
        requestWS.setPagoInfo(pago);
        requestWS.setOrderInfo(order);
        requestWS.setSesionId(reqEvalRiesgo.getSesionId());
        //si vienen datos de comerciante se agregan
        if(reqEvalRiesgo.getDatosComerciante() != null && reqEvalRiesgo.getDatosComerciante().size()>0){
            //agregando datos del comerciante
            System.out.println("agregando datos del comerciante al request de EvaluarRiesgo...");
            DatosComerciante datosComerciante = new DatosComerciante();
            datosComerciante.setParametro(reqEvalRiesgo.getDatosComerciante());
            requestWS.setDatosComerciante(datosComerciante);
        }
        
        responseWS = clienteEvaluarRiesgoEBS.evaluarRiesgo(requestWS);
        //aqui se agrega toda la logica de manejo de respuesta del WS
        if(responseWS != null && responseWS.getHeader() != null){
            System.out.println("Error Tecnico " + responseWS.getHeader().getErrorTecnico().getCode() + " " + responseWS.getHeader().getErrorNegocio().getCodigoError());
            System.out.println("Error Negocio " + responseWS.getHeader().getErrorNegocio().getCodigoError() + " " + responseWS.getHeader().getErrorNegocio().getDescripcionError());
            if(responseWS.getHeader().getErrorNegocio() != null && responseWS.getHeader().getErrorNegocio().getCodigoError() != null){
                if(!responseWS.getHeader().getErrorNegocio().getCodigoError().equals("0")){
                    responseDTO.setCodigoError(responseWS.getHeader().getErrorNegocio().getCodigoError());
                    return responseDTO;
                }
                if(!responseWS.getHeader().getErrorTecnico().getCode().equalsIgnoreCase("0")){
                    responseDTO.setCodigoError("1");
                    return responseDTO;
                }
                responseDTO.setEstatusRiesgo(responseWS.getEstatusRiesgo());
                responseDTO.setCodigoSKY(requestWS.getComercioInfo().getCodigoSKY());
                responseDTO.setIdTransaccion(responseWS.getTransaccionId());
                responseDTO.setCodigoError("0");
            }else{
                responseDTO.setCodigoError("-1");
            }
        }
        return responseDTO;
    }


    @Override
    public ActualizarTDCBilleteraResponseDTO actualizarTDCBilletera(TokenDTO requestDTO) {
        System.out.println("BilleteraManagementBean.actualizarTDCBilletera()");
        
        if (this.clienteActualizarTDCBilleteraEBS == null) {
            PropiedadesAmbienteManagementBean cyberSourcePropertiesMB = new PropiedadesAmbienteManagementBean();
            ConsultarPropiedadAmbienteResponseDTO propiedadesAmbiente =
                cyberSourcePropertiesMB.consultarPropiedadesAmbiente(Arrays.asList(0, 6, 7));
            this.clienteActualizarTDCBilleteraEBS =
                new ActualizarTDCBilleteraEBS_Client(propiedadesAmbiente.getPropiedades().get(0),
                                                     propiedadesAmbiente.getPropiedades().get(6),
                                                     propiedadesAmbiente.getPropiedades().get(7));
        }
        
        EBMHeaderRequest header = new EBMHeaderRequest();
        header.setOperacion("ActualizarBilletera");
        header.setSistemaOrigen(SISTEMA_ORIGEN);
        
        
        mx.com.sky.sel.proxyclients.apigateway.ebs.actualizartdcbilletera.types.BilleteraDePago tdcBilletera =
            new mx.com.sky.sel.proxyclients.apigateway.ebs.actualizartdcbilletera.types.BilleteraDePago();
        tdcBilletera.setId(requestDTO.getId());
        tdcBilletera.setPaymentInstrument(requestDTO.getPaymentInstrument());
        tdcBilletera.setIdProspecto(requestDTO.getIdProspecto());
        tdcBilletera.setNumeroCuenta(requestDTO.getNumeroCuenta());
        tdcBilletera.setNumeroContrato(requestDTO.getNumeroContrato());
        tdcBilletera.setEmail(requestDTO.getEmail());
        tdcBilletera.setNombreTarjeta(requestDTO.getNombreTarjeta());
        tdcBilletera.setFechaExp(requestDTO.getFechaExp());
        tdcBilletera.setCvv(requestDTO.getCvv());
        tdcBilletera.setTipoTarjeta(requestDTO.getTipoTarjeta());
        tdcBilletera.setInstrumentId(requestDTO.getInstrumentId());
        tdcBilletera.setMaskedPan(requestDTO.getMaskedPan());
        tdcBilletera.setRecurrente(requestDTO.getRecurrente());
        tdcBilletera.setEstatusDm(requestDTO.getEstatusDm());
        tdcBilletera.setFechaDm(requestDTO.getFechaDm());
        tdcBilletera.setEstatus3Ds(requestDTO.getEstatus3Ds());
        tdcBilletera.setFecha3Ds(requestDTO.getFecha3Ds());
        tdcBilletera.setReferencia3Ds(requestDTO.getReferencia3Ds());
        tdcBilletera.setNombre(requestDTO.getNombre());
        tdcBilletera.setAPaterno(requestDTO.getAPaterno());
        tdcBilletera.setAMaterno(requestDTO.getAMaterno());
        tdcBilletera.setNumTelefono(requestDTO.getNumTelefono());
        tdcBilletera.setCalle(requestDTO.getCalle());
        tdcBilletera.setNumExt(requestDTO.getNumExt());
        tdcBilletera.setNumInt(requestDTO.getNumInt());
        tdcBilletera.setEstado(requestDTO.getEstado());
        tdcBilletera.setMunicipio(requestDTO.getMunicipio());
        tdcBilletera.setCiudad(requestDTO.getCiudad());
        tdcBilletera.setColonia(requestDTO.getColonia());
        tdcBilletera.setCodigopostal(requestDTO.getCodigopostal());
        tdcBilletera.setCodPais(requestDTO.getCodPais());
        
        
        mx.com.sky.sel.proxyclients.apigateway.ebs.actualizartdcbilletera.types.BilleteraDePagoCollection collection
            = new mx.com.sky.sel.proxyclients.apigateway.ebs.actualizartdcbilletera.types.BilleteraDePagoCollection();
        collection.getBilleteraDePago().add(tdcBilletera);
        
        
        RequestActualizarTDCBilletera requestWS = new RequestActualizarTDCBilletera();
        requestWS.setHeader(header);
        requestWS.setBilleteraDePagoCollection(collection);
        
        
        
        ResponseActualizarTDCBilletera responseWS = clienteActualizarTDCBilleteraEBS.actualizarTDCBilletera(requestWS);
        
        ActualizarTDCBilleteraResponseDTO responseDTO = new ActualizarTDCBilleteraResponseDTO();
        
        if(responseWS != null && responseWS.getHeader() != null){
            System.out.println("Error Tecnico " + responseWS.getHeader().getErrorTecnico().getCode() + " " + responseWS.getHeader().getErrorNegocio().getCodigoError());
            System.out.println("Error Negocio " + responseWS.getHeader().getErrorNegocio().getCodigoError() + " " + responseWS.getHeader().getErrorNegocio().getDescripcionError());
            if(responseWS.getHeader().getErrorNegocio() != null && responseWS.getHeader().getErrorNegocio().getCodigoError() != null){
                if(!responseWS.getHeader().getErrorNegocio().getCodigoError().equals("0")){
                    responseDTO.setCodigoError(responseWS.getHeader().getErrorNegocio().getCodigoError());
                    return responseDTO;
                }
                if(!responseWS.getHeader().getErrorTecnico().getCode().equalsIgnoreCase("ok")){
                    responseDTO.setCodigoError("1");
                    return responseDTO;
                }
                responseDTO.setCodigoError("0");
            }else{
                responseDTO.setCodigoError("-1");
            }
        }
        return responseDTO;
        
    }

    @Override
    public ResponseOrquestarProcesoPagoDTO orquestarProcesoPago(RequestOrquestarProcesoPagoDTO requestDTO) {
        System.out.println("PagoManagementBean.orquestarProcesoPago()");
        
        if(this.clienteOrquestarProcesoPago == null){
            PropiedadesAmbienteManagementBean cyberSourcePropertiesMB = new PropiedadesAmbienteManagementBean();
            ConsultarPropiedadAmbienteResponseDTO propiedadesAmbiente =
                cyberSourcePropertiesMB.consultarPropiedadesAmbiente(Arrays.asList(0, 6, 7));
            this.clienteOrquestarProcesoPago =
                new OrquestarProcesoPagoPMPEBF_Client(propiedadesAmbiente.getPropiedades().get(0),
                                                     propiedadesAmbiente.getPropiedades().get(6),
                                                     propiedadesAmbiente.getPropiedades().get(7));
        }
        
        ResponseOrquestarProcesoPagoDTO responseDTO = new ResponseOrquestarProcesoPagoDTO();
        
        RequestOrquestarProcesoPagoPMP requestWS = new RequestOrquestarProcesoPagoPMP();
        EBMHeaderRequest header = new EBMHeaderRequest();
        header.setOperacion("OrquestarProcesoPago");
        header.setSistemaOrigen(SISTEMA_ORIGEN);
        requestWS.setHeader(header);
        
        DatosTarjeta_Entrada datosTarjeta = new DatosTarjeta_Entrada();
        DatosTransaccion_Entrada datosTransaccion = new DatosTransaccion_Entrada();
        
        datosTarjeta.setCvvTarjeta(requestDTO.getCvvTarjeta() != null ? requestDTO.getCvvTarjeta() : "");
        datosTarjeta.setTipoTarjeta(requestDTO.getTipoTarjeta()!= null ? requestDTO.getTipoTarjeta() : "");
        datosTarjeta.setNumeroTarjeta(requestDTO.getNumeroTarjeta()!= null ? requestDTO.getNumeroTarjeta() : "");
        datosTarjeta.setFechaExpTarjeta(requestDTO.getFechaExpTarjeta()!= null ? requestDTO.getFechaExpTarjeta() : "");
        datosTarjeta.setNombreTitularTarjeta(requestDTO.getNombreTitularTarjeta()!= null ? requestDTO.getNombreTitularTarjeta() : "");
        datosTarjeta.setNombreEmpresaTransaccion(requestDTO.getNombreEmpresaTransaccion() != null ? requestDTO.getNombreEmpresaTransaccion() : "");
        
        datosTransaccion.setTipoOperacion(requestDTO.getTipoOperacion() != null ? requestDTO.getTipoOperacion() : "");
        datosTransaccion.setIdTransaccion(requestDTO.getIdTransaccion() != null ? requestDTO.getIdTransaccion() : "");
        datosTransaccion.setNumeroCuentaClienteSky(requestDTO.getNumeroCuentaClienteSky() != null ? requestDTO.getNumeroCuentaClienteSky() : "");
        datosTransaccion.setLoginUsr(requestDTO.getLoginUsr() != null ? requestDTO.getLoginUsr() : "");
        datosTransaccion.setHoraActual(requestDTO.getHoraActual() != null ? requestDTO.getHoraActual() : "");
        datosTransaccion.setFechaActual(requestDTO.getFechaActual() != null ? requestDTO.getFechaActual() : "");
        datosTransaccion.setPropositoPago(requestDTO.getPropositoPago() != null ? requestDTO.getPropositoPago() : "");
        datosTransaccion.setImportePago(requestDTO.getImportePago() != null ? requestDTO.getImportePago() : "");
        datosTransaccion.setImportePagoMonedaLocal(requestDTO.getImportePagoMonedaLocal() != null ? requestDTO.getImportePagoMonedaLocal() : "");
        datosTransaccion.setTipoCambio(requestDTO.getTipoCambio() != null ? requestDTO.getTipoCambio() : "");
        
        datosTransaccion.setPais(requestDTO.getPais() != null ? requestDTO.getPais() : "");
        datosTransaccion.setCodeStore(requestDTO.getCodeStore() != null ? requestDTO.getCodeStore() : "");
        datosTransaccion.setAuthidresponse(requestDTO.getAuthidresponse() != null ? requestDTO.getAuthidresponse() : "");
        datosTransaccion.setClerkId(requestDTO.getClerkId() != null ? requestDTO.getClerkId() : "");
        datosTransaccion.setOrigFecha(requestDTO.getOrigFecha() != null ? requestDTO.getOrigFecha() : "");
        datosTransaccion.setOrigHora(requestDTO.getOrigHora() != null ? requestDTO.getOrigHora() : "");
        datosTransaccion.setOrigStan(requestDTO.getOrigStan() != null ? requestDTO.getOrigStan() : "");
        datosTransaccion.setOrigMsg(requestDTO.getOrigMsg() != null ? requestDTO.getOrigMsg() : "");
        datosTransaccion.setSistemaOrigenPago(SISTEMA_ORIGEN);
        datosTransaccion.setCodigoMoneda(requestDTO.getCodigoMoneda() != null ? requestDTO.getCodigoMoneda() : "");
        
        datosTransaccion.setEntidadBancaria(requestDTO.getEntidadBancaria() != null ? requestDTO.getEntidadBancaria() : "");
        datosTransaccion.setTipoPago(requestDTO.getTipoPago() != null ? requestDTO.getTipoPago() : "");
        datosTransaccion.setTokenVoltage(requestDTO.getTokenVoltage()!= null ? requestDTO.getTokenVoltage() : "");
        datosTransaccion.setComentarios(requestDTO.getComentarios() != null ? requestDTO.getComentarios() : "");
        datosTransaccion.setMerchantId(requestDTO.getMerchantId() != null ? requestDTO.getMerchantId() : "");
        datosTransaccion.setCodigoSKY(requestDTO.getCodigoSKY() != null ? requestDTO.getCodigoSKY() : "");
        datosTransaccion.setCaptura(requestDTO.getCaptura() != null ? requestDTO.getCaptura() : "");
        datosTransaccion.setToken(requestDTO.getToken() != null ? requestDTO.getToken() : "");
        datosTransaccion.setIdSesion(requestDTO.getIdSesion() != null ? requestDTO.getIdSesion() : "");
        datosTransaccion.setEcommerceIndicator(requestDTO.getEcommerceIndicator() != null ? requestDTO.getEcommerceIndicator() : "");
        
        datosTransaccion.setAuthenticationTransactioId(requestDTO.getAuthenticationTransactioId() != null ? requestDTO.getAuthenticationTransactioId() : "");
        datosTransaccion.setCavv(requestDTO.getCavv() != null ? requestDTO.getCavv() : "");
        datosTransaccion.setEci(requestDTO.getEci() != null ? requestDTO.getEci() : "");
        datosTransaccion.setEciRaw(requestDTO.getEciRaw() != null ? requestDTO.getEciRaw() : "");
        datosTransaccion.setXid(requestDTO.getXid() != null ? requestDTO.getXid() : "");
        datosTransaccion.setTransactionID(requestDTO.getTransactionID() != null ? requestDTO.getTransactionID() : "");
        
        datosTransaccion.setCredencialAlmacenadaEnArchivo(requestDTO.getCredencialAlmacenadaEnArchivo() != null ? requestDTO.getCredencialAlmacenadaEnArchivo() : "");
        datosTransaccion.setCredencialAlmacenadaEnUso(requestDTO.getCredencialAlmacenadaEnUso() != null ? requestDTO.getCredencialAlmacenadaEnUso() : "");
        datosTransaccion.setIdentificadorTransaccionRed(requestDTO.getIdentificadorTransaccionRed() != null ? requestDTO.getIdentificadorTransaccionRed() : "");
        datosTransaccion.setDatosEmisor(requestDTO.getDatosEmisor() != null ? requestDTO.getDatosEmisor() : "");
        
        datosTransaccion.setIdentificadorDeCobroUCAF(requestDTO.getIdentificadorDeCobroUCAF() != null ? requestDTO.getIdentificadorDeCobroUCAF() : "");
        datosTransaccion.setDatosDeAutenticacionUCAF(requestDTO.getDatosDeAutenticacionUCAF() != null ? requestDTO.getDatosDeAutenticacionUCAF() : "");
        datosTransaccion.setIdentificadorTransaccionServidor(requestDTO.getIdentificadorTransaccionServidor() != null ? requestDTO.getIdentificadorTransaccionServidor() : "");
        datosTransaccion.setVersion3DS(requestDTO.getVersion3DS() != null ? requestDTO.getVersion3DS() : "");
        
        requestWS.setDatosTarjeta_Entrada(datosTarjeta);
        requestWS.setDatosTransaccion_Entrada(datosTransaccion);
        
        ResponseOrquestarProcesoPagoPMP responseWS = clienteOrquestarProcesoPago.orquestarProcesoPagoPMP(requestWS);
        
        if(responseWS != null && responseWS.getHeader() != null){
            System.out.println("Status " + responseWS.getHeader().getErrorTecnico().getCode() + " " + responseWS.getHeader().getErrorNegocio().getCodigoError());
            if(responseWS.getHeader().getErrorNegocio() != null && responseWS.getHeader().getErrorNegocio().getCodigoError() != null){
                if(!responseWS.getHeader().getErrorNegocio().getCodigoError().equals("0")){
                    responseDTO.setCodigoError(responseWS.getHeader().getErrorNegocio().getCodigoError());
                    return responseDTO;
                }
                if(!responseWS.getHeader().getErrorTecnico().getCode().equalsIgnoreCase("ok")){
                    responseDTO.setCodigoError("1");
                    return responseDTO;
                }
                
                RespuestaPagoTarjeta pagoTarjeta = new RespuestaPagoTarjeta();
                pagoTarjeta.setRespuestaMotorPago(responseWS.getRespuestaPagoTarjeta().getRespuestaMotorPago());
                pagoTarjeta.setMensajeRespuestaMotorPago(responseWS.getRespuestaPagoTarjeta().getMensajeRespuestaMotorPago());
                pagoTarjeta.setCodigoRespuestaMotorPago(responseWS.getRespuestaPagoTarjeta().getCodigoRespuestaMotorPago());
                pagoTarjeta.setNumeroAutorizacionPago(responseWS.getRespuestaPagoTarjeta().getNumeroAutorizacionPago());
                pagoTarjeta.setNumeroReferenciaPago(responseWS.getRespuestaPagoTarjeta().getNumeroReferenciaPago());
                pagoTarjeta.setRespuestaBRM(responseWS.getRespuestaPagoTarjeta().getRespuestaBRM());
                pagoTarjeta.setNombreMotorPagos(responseWS.getRespuestaPagoTarjeta().getNombreMotorPagos());
                pagoTarjeta.setOrigStan(responseWS.getRespuestaPagoTarjeta().getOrigStan());
                pagoTarjeta.setOrigMsg(responseWS.getRespuestaPagoTarjeta().getOrigMsg());
                
                responseDTO.setCodigoError("0");
                responseDTO.setRespuestaPagoTarjeta(pagoTarjeta);
                //responseDTO.setBin( responseWS.getClasificacionesLlamada().getCardBIN() );
                //responseDTO.setTipoBIN( responseWS.getClasificacionesLlamada().getBinType());
                //responseDTO.setTipoTarjeta( responseWS.getClasificacionesLlamada().getCardType() );
                //responseDTO.setClearingHouse(responseWS.getClasificacionesLlamada().getClearingHouse());
            }else{
                System.out.println("Error inesperado...");
                responseDTO.setCodigoError("-1");
            }
        }
        
        return responseDTO;
    }
    

        public CambiarFormaDePagoResponseDTO cambiarFormaPago(CambiarFormaDePagoRequestDTO reqCambiarFormaPago){
            System.out.println("Llamando a cambiarFormaPago()");
        PropiedadesAmbienteManagementBean cyberSourcePropertiesMB = new PropiedadesAmbienteManagementBean();
            
            if( clienteCambiarFormaDePagoEBF == null ){
                ConsultarPropiedadAmbienteResponseDTO propiedadesAmbiente = cyberSourcePropertiesMB.consultarPropiedadesAmbiente(Arrays.asList(0,6,7));
                clienteCambiarFormaDePagoEBF = new CambiarFormaDePagoEBF_Client(propiedadesAmbiente.getPropiedades().get(0), propiedadesAmbiente.getPropiedades().get(6), propiedadesAmbiente.getPropiedades().get(7));
            }

            CambiarFormaDePagoResponseDTO responseDTO = new CambiarFormaDePagoResponseDTO();
            RequestCambiarFormaDePago requestWS = new RequestCambiarFormaDePago();
            EBMHeaderRequest header = new EBMHeaderRequest();
            CambiarFormaDePagoInput cambiarFormaDePagoInput = new CambiarFormaDePagoInput();

            header.setOperacion(CAMBIAR_FORMA_DE_PAGO);
            header.setSistemaOrigen(SISTEMA_ORIGEN);

            cambiarFormaDePagoInput.setNumeroCuenta(reqCambiarFormaPago.getNumeroCuenta());
            cambiarFormaDePagoInput.setPaymentInstrument(reqCambiarFormaPago.getPaymentInstrument());
            cambiarFormaDePagoInput.setPagoRecurrente(reqCambiarFormaPago.getPagoRecurrente());
            
            requestWS.setCambiarFormaDePagoInput(cambiarFormaDePagoInput);
            requestWS.setHeader(header);
                    
            ResponseCambiarFormaDePago responseWS = clienteCambiarFormaDePagoEBF.cambiarFormaDePago(requestWS);
            
            if(responseWS != null && responseWS.getHeader() != null){
                System.out.println("Error Tecnico " + responseWS.getHeader().getErrorTecnico().getCode());
                System.out.println("Error Negocio " + responseWS.getHeader().getErrorNegocio().getCodigoError() + " " + responseWS.getHeader().getErrorNegocio().getDescripcionError());
                if(responseWS.getHeader().getErrorNegocio() != null && responseWS.getHeader().getErrorNegocio().getCodigoError() != null){
                    if(!responseWS.getHeader().getErrorTecnico().getCode().equalsIgnoreCase("ok")
                    ){
                        responseDTO.getHeader().setCodigoError(responseWS.getHeader().getErrorNegocio().getCodigoError());
                        return responseDTO;
                    }
                    if(!responseWS.getHeader().getErrorNegocio().getCodigoError().equals("0")){
                            responseDTO.getHeader().setCodigoError("1");
                            return responseDTO;
                    }
                    
                    responseDTO.getHeader().setCodigoError("0");
                    System.out.println("Status " + responseWS.getHeader().getErrorTecnico().getCode() + " " + responseWS.getHeader().getErrorNegocio().getCodigoError());
                    responseDTO.getHeader().setDescripcionError(responseWS.getHeader().getErrorNegocio().getDescripcionError());
                
                }
            } 
        return responseDTO;
        }
    }
