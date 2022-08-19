package mx.com.sky.sel.services.comparte;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import mx.com.sky.enterprisemessages.sel.consultarcambiopaqueteprincipal.ConsultarCambioPaquetePrincipalRequestEBMType;
import mx.com.sky.enterprisemessages.sel.consultarcambiopaqueteprincipal.ConsultarCambioPaquetePrincipalRequestType;
import mx.com.sky.enterprisemessages.sel.consultarcambiopaqueteprincipal.ConsultarCambioPaquetePrincipalResponseEBMType;
import mx.com.sky.enterprisemessages.soa.gestionarsscomprarservicios.GestionarSSComprarServiciosRequestEBMType;
import mx.com.sky.enterprisemessages.soa.gestionarsscomprarservicios.ListOfInstancesType;
import mx.com.sky.enterprisemessages.soa.gestionarsscomprarservicios.ListOfProductsType;
import mx.com.sky.enterprisemessages.soa.gestionarsscomprarservicios.ServiceInfoRequestType;
import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;
import mx.com.sky.enterpriseobjects.sel.consultarcambiopaqueteprincipal.ConsultarCambioPaquetePrincipalEBOType;
import mx.com.sky.enterpriseobjects.soa.gestionarsscomprarservicios.GestionarSSComprarServiciosRequestType;
import mx.com.sky.enterpriseobjects.soa.gestionarsscomprarservicios.GestionarSSComprarServiciosResponseType;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.proxyclients.selabcs.consultarcambiopaqueteprincipal.ConsultarCambioPaquetePrincipal;
import mx.com.sky.sel.proxyclients.selabcs.consultarcambiopaqueteprincipal.ConsultarcambiopaqueteprincipalEp;
import mx.com.sky.sel.proxyclients.selabcs.gestionarsscomprarservicios.GestionarSSComprarServicios;
import mx.com.sky.sel.proxyclients.selabcs.gestionarsscomprarservicios.GestionarSSComprarServiciosEp;
import mx.com.sky.sel.services.cambiopaquetecelular.PaqueteCelularModelDTO;

public class ServicioComparte implements Serializable {
    @SuppressWarnings("compatibility:-1783973372106702425")
    private static final long serialVersionUID = -7549453703374283213L;
    
    private static final String SISTEMA_ORIGEN = "Web";
    
    //Constantes para realizar la consulta de servicios comparte
    private static final String CONSULTA_SERVICIOSCOMPARTE_PROCESO = "Paquete Adicional";
    private static final String CONSULTA_SERVICIOSCOMPARTE_CATEGORIA = "Canal Adicional";
    private static final String CONSULTA_SERVICIOSCOMPARTE_OPERACION = "SKY Obtiene Producto";
    
    private static final String SERVICIOCOMPARTE_NOMBRE = "Servicio BTC compartir datos";
    
    //Constantes para realizar la activacion del servicio comparte
    private static final String ACTIVAR_SERVICIOCOMPARTE_OPERACION = "Solicitud Servicio Integrada";
    private static final String ACTIVAR_SERVICIOCOMPARTE_PROCESO = "Paquete Adicional";
    private static final String ACTIVAR_SERVICIOCOMPARTE_CATEGORIA = "Canal Adicional";
    private static final String ACTIVAR_SERVICIOCOMPARTE_GRUPO = "Venta a suscriptor";
    private static final String ACTIVAR_SERVICIOCOMPARTE_TIPO = "Solicitud de Aprovisionamiento";
    private static final String ACTIVAR_SERVICIOCOMPARTE_ACTION = "Add";
    
    //Constantes para realizar la cancelacion del servicio comparte
    private static final String CANCELAR_SERVICIOCOMPARTE_OPERACION = "Solicitud Servicio Integrada";
    private static final String CANCELAR_SERVICIOCOMPARTE_PROCESO = "Paquete Adicional";
    private static final String CANCELAR_SERVICIOCOMPARTE_CATEGORIA = "Canal Adicional";
    private static final String CANCELAR_SERVICIOCOMPARTE_GRUPO = "Venta a suscriptor";
    private static final String CANCELAR_SERVICIOCOMPARTE_TIPO = "Solicitud de Aprovisionamiento";
    private static final String CANCELAR_SERVICIOCOMPARTE_ACTION = "Disconnect";
    
    public ServicioComparte() {
        super();
    }
    
    public ConsultaServiciosComparteDTO consultarServiciosComparte(String cuentaSky, String assetNumber, String pais) {
        ConsultaServiciosComparteDTO resultadoConsulta = new ConsultaServiciosComparteDTO();
        List<ServicioComparteModelDTO> serviciosComparte = new ArrayList<ServicioComparteModelDTO>();
        ServicioComparteModelDTO servCompModel = null;
        ConsultarcambiopaqueteprincipalEp consultarcambiopaqueteprincipalEp = new ConsultarcambiopaqueteprincipalEp();
        ConsultarCambioPaquetePrincipal consultarCambioPaquetePrincipalWS =
            consultarcambiopaqueteprincipalEp.getConsultarCambioPaquetePrincipalPt();
        
        ConsultarCambioPaquetePrincipalRequestEBMType payload = new ConsultarCambioPaquetePrincipalRequestEBMType();
        ConsultarCambioPaquetePrincipalResponseEBMType responseWS = null;
        
        //Header
        EBMHeaderRequestType header = new EBMHeaderRequestType();
        header.setOperacion(CONSULTA_SERVICIOSCOMPARTE_OPERACION);
        header.setSistemaOrigen(SISTEMA_ORIGEN);
        
        //Request
        ConsultarCambioPaquetePrincipalRequestType request = new ConsultarCambioPaquetePrincipalRequestType();
        request.setProceso(CONSULTA_SERVICIOSCOMPARTE_PROCESO);
        request.setCategoria(CONSULTA_SERVICIOSCOMPARTE_CATEGORIA);
        request.setCuenta(cuentaSky);
        request.setAssetNumber(assetNumber);
        request.setPais(pais);
        
        payload.setEBMHeaderRequest(header);
        payload.setConsultarCambioPaquetePrincipalRequest(request);
        
        //Llamada al WS
        responseWS = consultarCambioPaquetePrincipalWS.consultarCambioPaquetePrincipal(payload);
        
        if( responseWS != null && responseWS.getEBMHeaderResponse() != null &&
            responseWS.getEBMHeaderResponse().getErrorNegocio() != null &&
            responseWS.getEBMHeaderResponse().getErrorNegocio().getCodigoError() != null &&
            responseWS.getEBMHeaderResponse().getErrorNegocio().getCodigoError().equalsIgnoreCase("0") &&
            responseWS.getConsultarCambioPaquetePrincipal() != null &&
            responseWS.getConsultarCambioPaquetePrincipal().getConsultarCambioPaquetePrincipal() != null &&
            !responseWS.getConsultarCambioPaquetePrincipal().getConsultarCambioPaquetePrincipal().isEmpty() ) {
            System.out.print("Se encontraron servicios, se buscara los que son comparte...");
            resultadoConsulta.setConsultaExitosa(true);
            for(ConsultarCambioPaquetePrincipalEBOType servCompWS : responseWS.getConsultarCambioPaquetePrincipal().getConsultarCambioPaquetePrincipal() ) {
                if( servCompWS.getNombreProductoCRM() != null && servCompWS.getNombreProductoCRM().equalsIgnoreCase(SERVICIOCOMPARTE_NOMBRE) ) {
                    System.out.print("Se encontro un servicio comparte, se agregara a la lista de servicos comparte...");
                    servCompModel = new ServicioComparteModelDTO();
                    servCompModel.setNombreProductoCRM(servCompWS.getNombreProductoCRM());
                    servCompModel.setNombreProductoSEL(servCompWS.getNombreProductoSEL());
                    servCompModel.setPartNum(servCompWS.getPartNum());
                    servCompModel.setDescripcion(servCompWS.getDescripcion());
                    servCompModel.setVigencia(servCompWS.getVigencia());
                    servCompModel.setPrecio(servCompWS.getPrecio());
                    
                    serviciosComparte.add(servCompModel);
                }
            }
            resultadoConsulta.setServiciosComparteConsultados(serviciosComparte);
        } else if( responseWS != null && responseWS.getEBMHeaderResponse() != null && 
                   responseWS.getEBMHeaderResponse().getErrorNegocio() != null ) {
            resultadoConsulta.setConsultaExitosa(false);
            resultadoConsulta.setDescripcionError(responseWS.getEBMHeaderResponse().getErrorNegocio().getDescripcionError());
            System.out.print("No se encontraron servicios comparte, descripcion error del servicio: " + responseWS.getEBMHeaderResponse().getErrorNegocio().getDescripcionError());
            LogServicios.printlnError(this, "Se produjo un error al llamar al servicio consultarCambioPaquetePrincipal");
            LogServicios.printlnError(this, "Descripcion error del servicio: " + responseWS.getEBMHeaderResponse().getErrorNegocio().getDescripcionError());
        } else {
            resultadoConsulta.setConsultaExitosa(false);
            System.out.print("Ocurrio un error al consultar los servicios comparte y no viene la descripción del error en el servicio");
        }
        
        
        return resultadoConsulta;
    }
    
    
    
    public String activarServicioComparte(String cuentaSky, String assetNumber, String nombreProducto) {
        System.out.println("IN activarServicioComparte method");
        
        String resultWS = null;
        GestionarSSComprarServiciosEp gestionarSSComprarServiciosEp = new GestionarSSComprarServiciosEp();
        GestionarSSComprarServicios gestionarSSComprarServiciosWS =
            gestionarSSComprarServiciosEp.getGestionarSSComprarServiciosPt();
        
        GestionarSSComprarServiciosRequestType payload = new GestionarSSComprarServiciosRequestType();
        GestionarSSComprarServiciosResponseType responseWS = null;
        
        //Header Payload
        EBMHeaderRequestType headerPayload = new EBMHeaderRequestType();
        headerPayload.setOperacion(ACTIVAR_SERVICIOCOMPARTE_OPERACION);
        headerPayload.setSistemaOrigen(SISTEMA_ORIGEN);
        
        //Header request
        mx.com.sky.enterpriseobjects.soa.common.v1.EBMHeaderRequestType headerRequest = new mx.com.sky.enterpriseobjects.soa.common.v1.EBMHeaderRequestType();
        headerRequest.setOperacion(ACTIVAR_SERVICIOCOMPARTE_OPERACION);
        headerRequest.setSistemaOrigen(SISTEMA_ORIGEN);
        
        //Service info request
        ServiceInfoRequestType serviceInfoRequest = new ServiceInfoRequestType();
        serviceInfoRequest.setProceso(ACTIVAR_SERVICIOCOMPARTE_PROCESO);
        serviceInfoRequest.setCuenta(cuentaSky);
        serviceInfoRequest.setCategoria(ACTIVAR_SERVICIOCOMPARTE_CATEGORIA);
        serviceInfoRequest.setGrupo(ACTIVAR_SERVICIOCOMPARTE_GRUPO);
        serviceInfoRequest.setTipo(ACTIVAR_SERVICIOCOMPARTE_TIPO);
        serviceInfoRequest.setOrigen(SISTEMA_ORIGEN);
        
        //
        ListOfInstancesType listInstancesServiceInfo = new ListOfInstancesType();
        ListOfInstancesType.Instance instance = new ListOfInstancesType.Instance();
        instance.setAssetNumber(assetNumber);
        
        
        ListOfProductsType listOfProducts = new ListOfProductsType();
        ListOfProductsType.Product product = new ListOfProductsType.Product();
        product.setAction(ACTIVAR_SERVICIOCOMPARTE_ACTION);
        product.setName(nombreProducto);
        listOfProducts.getProduct().add(product);
        
        instance.setListOfProducts(listOfProducts);
        listInstancesServiceInfo.getInstance().add(instance);
        serviceInfoRequest.setListOfInstances(listInstancesServiceInfo);
        
        //Request
        GestionarSSComprarServiciosRequestEBMType requestPayload = new GestionarSSComprarServiciosRequestEBMType();
        requestPayload.setEBMHeaderRequest(headerRequest);
        requestPayload.setServiceInfoRequest(serviceInfoRequest);
        
        payload.setEBMHeaderRequest(headerPayload);
        payload.setGestionarSSComprarServiciosRequestEBM(requestPayload);
        
        
        responseWS = gestionarSSComprarServiciosWS.gestionarSSComprarServicios(payload);
        
        if( responseWS != null && responseWS.getGestionarSSComprarServiciosResponseEBM() != null &&
            responseWS.getGestionarSSComprarServiciosResponseEBM().getEBMHeaderResponse() != null &&
            responseWS.getGestionarSSComprarServiciosResponseEBM().getEBMHeaderResponse().getErrorNegocio() != null &&
            responseWS.getGestionarSSComprarServiciosResponseEBM().getEBMHeaderResponse().getErrorNegocio().getCodigoError() != null &&
            responseWS.getGestionarSSComprarServiciosResponseEBM().getEBMHeaderResponse().getErrorNegocio().getCodigoError().equalsIgnoreCase("0") &&
            responseWS.getGestionarSSComprarServiciosResponseEBM().getServiceInfoResponse() != null &&
            responseWS.getGestionarSSComprarServiciosResponseEBM().getServiceInfoResponse().getNumeroSS() != null &&
            !responseWS.getGestionarSSComprarServiciosResponseEBM().getServiceInfoResponse().getNumeroSS().isEmpty() ) {
                LogServicios.println(this, "La activacion del servicio comparte fue exitosa, NumeroSS: " +
                                     responseWS.getGestionarSSComprarServiciosResponseEBM().getServiceInfoResponse().getNumeroSS());
            System.out.println("La activacion del servicio comparte fue exitosa, NumeroSS: " +
                                 responseWS.getGestionarSSComprarServiciosResponseEBM().getServiceInfoResponse().getNumeroSS());
                resultWS = responseWS.getGestionarSSComprarServiciosResponseEBM().getServiceInfoResponse().getNumeroSS();
        } else if( responseWS != null && responseWS.getGestionarSSComprarServiciosResponseEBM() != null && 
                   responseWS.getGestionarSSComprarServiciosResponseEBM().getEBMHeaderResponse() != null &&
                   responseWS.getGestionarSSComprarServiciosResponseEBM().getEBMHeaderResponse().getErrorNegocio() != null ) {
            LogServicios.println(this, "Se produjo un error al llamar al servicio gestionarSSComprarServicios");
            LogServicios.println(this, "Descripcion error del servicio: " + responseWS.getGestionarSSComprarServiciosResponseEBM().getEBMHeaderResponse().getErrorNegocio().getDescripcionError());
            
            System.out.println("Se produjo un error al llamar al servicio gestionarSSComprarServicios");
            System.out.println("Descripcion error del servicio: " + responseWS.getGestionarSSComprarServiciosResponseEBM().getEBMHeaderResponse().getErrorNegocio().getDescripcionError());
        }
        
        System.out.println("resultWS: " + resultWS);
        
        return resultWS;
    }
    
    
    
    public String cancelarServicioComparte(String cuentaSky, String assetNumber, String nombreProducto) {
        System.out.println("IN cancelarServicioComparte method");
        
        String resultWS = null;
        GestionarSSComprarServiciosEp gestionarSSComprarServiciosEp = new GestionarSSComprarServiciosEp();
        GestionarSSComprarServicios gestionarSSComprarServiciosWS =
            gestionarSSComprarServiciosEp.getGestionarSSComprarServiciosPt();
        
        GestionarSSComprarServiciosRequestType payload = new GestionarSSComprarServiciosRequestType();
        GestionarSSComprarServiciosResponseType responseWS = null;
        
        //Header Payload
        EBMHeaderRequestType headerPayload = new EBMHeaderRequestType();
        headerPayload.setOperacion(CANCELAR_SERVICIOCOMPARTE_OPERACION);
        headerPayload.setSistemaOrigen(SISTEMA_ORIGEN);
        
        //Header request
        mx.com.sky.enterpriseobjects.soa.common.v1.EBMHeaderRequestType headerRequest = new mx.com.sky.enterpriseobjects.soa.common.v1.EBMHeaderRequestType();
        headerRequest.setOperacion(CANCELAR_SERVICIOCOMPARTE_OPERACION);
        headerRequest.setSistemaOrigen(SISTEMA_ORIGEN);
        
        //Service info request
        ServiceInfoRequestType serviceInfoRequest = new ServiceInfoRequestType();
        serviceInfoRequest.setProceso(CANCELAR_SERVICIOCOMPARTE_PROCESO);
        serviceInfoRequest.setCuenta(cuentaSky);
        serviceInfoRequest.setCategoria(CANCELAR_SERVICIOCOMPARTE_CATEGORIA);
        serviceInfoRequest.setGrupo(CANCELAR_SERVICIOCOMPARTE_GRUPO);
        serviceInfoRequest.setTipo(CANCELAR_SERVICIOCOMPARTE_TIPO);
        serviceInfoRequest.setOrigen(SISTEMA_ORIGEN);
        
        //
        ListOfInstancesType listInstancesServiceInfo = new ListOfInstancesType();
        ListOfInstancesType.Instance instance = new ListOfInstancesType.Instance();
        instance.setAssetNumber(assetNumber);
        
        
        ListOfProductsType listOfProducts = new ListOfProductsType();
        ListOfProductsType.Product product = new ListOfProductsType.Product();
        product.setAction(CANCELAR_SERVICIOCOMPARTE_ACTION);
        product.setName(nombreProducto);
        listOfProducts.getProduct().add(product);
        
        instance.setListOfProducts(listOfProducts);
        listInstancesServiceInfo.getInstance().add(instance);
        serviceInfoRequest.setListOfInstances(listInstancesServiceInfo);
        
        //Request
        GestionarSSComprarServiciosRequestEBMType requestPayload = new GestionarSSComprarServiciosRequestEBMType();
        requestPayload.setEBMHeaderRequest(headerRequest);
        requestPayload.setServiceInfoRequest(serviceInfoRequest);
        
        payload.setEBMHeaderRequest(headerPayload);
        payload.setGestionarSSComprarServiciosRequestEBM(requestPayload);
        
        
        responseWS = gestionarSSComprarServiciosWS.gestionarSSComprarServicios(payload);
        
        if( responseWS != null && responseWS.getGestionarSSComprarServiciosResponseEBM() != null &&
            responseWS.getGestionarSSComprarServiciosResponseEBM().getEBMHeaderResponse() != null &&
            responseWS.getGestionarSSComprarServiciosResponseEBM().getEBMHeaderResponse().getErrorNegocio() != null &&
            responseWS.getGestionarSSComprarServiciosResponseEBM().getEBMHeaderResponse().getErrorNegocio().getCodigoError() != null &&
            responseWS.getGestionarSSComprarServiciosResponseEBM().getEBMHeaderResponse().getErrorNegocio().getCodigoError().equalsIgnoreCase("0") &&
            responseWS.getGestionarSSComprarServiciosResponseEBM().getServiceInfoResponse() != null &&
            responseWS.getGestionarSSComprarServiciosResponseEBM().getServiceInfoResponse().getNumeroSS() != null &&
            !responseWS.getGestionarSSComprarServiciosResponseEBM().getServiceInfoResponse().getNumeroSS().isEmpty() ) {
                LogServicios.println(this, "La cancelacion del servicio comparte fue exitosa, NumeroSS: " +
                                     responseWS.getGestionarSSComprarServiciosResponseEBM().getServiceInfoResponse().getNumeroSS());
            System.out.println("La cancelacion del servicio comparte fue exitosa, NumeroSS: " +
                                 responseWS.getGestionarSSComprarServiciosResponseEBM().getServiceInfoResponse().getNumeroSS());
                resultWS = responseWS.getGestionarSSComprarServiciosResponseEBM().getServiceInfoResponse().getNumeroSS();
        } else if( responseWS != null && responseWS.getGestionarSSComprarServiciosResponseEBM() != null && 
                   responseWS.getGestionarSSComprarServiciosResponseEBM().getEBMHeaderResponse() != null &&
                   responseWS.getGestionarSSComprarServiciosResponseEBM().getEBMHeaderResponse().getErrorNegocio() != null ) {
            LogServicios.println(this, "Se produjo un error al llamar al servicio gestionarSSComprarServicios");
            LogServicios.println(this, "Descripcion error del servicio: " + responseWS.getGestionarSSComprarServiciosResponseEBM().getEBMHeaderResponse().getErrorNegocio().getDescripcionError());
            
            System.out.println("Se produjo un error al llamar al servicio gestionarSSComprarServicios");
            System.out.println("Descripcion error del servicio: " + responseWS.getGestionarSSComprarServiciosResponseEBM().getEBMHeaderResponse().getErrorNegocio().getDescripcionError());
        }
        
        System.out.println("resultWS: " + resultWS);
        
        return resultWS;
    }
}
