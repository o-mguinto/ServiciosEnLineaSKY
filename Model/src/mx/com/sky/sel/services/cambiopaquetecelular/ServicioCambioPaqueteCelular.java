package mx.com.sky.sel.services.cambiopaquetecelular;

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

public class ServicioCambioPaqueteCelular implements Serializable {
    @SuppressWarnings("compatibility:-3807785437695537376")
    private static final long serialVersionUID = 4745077954955337613L;
    
    private static final String SISTEMA_ORIGEN = "Web";
    
    private static final String CONSULTA_PAQUETES_PROCESO = "Cambio Paquete";
    private static final String CONSULTA_PAQUETES_CATEGORIA = "Paquete Principal";
    private static final String CONSULTA_PAQUETES_OPERACION = "CONSULTAR PAQUETE CELULAR";
    
    private static final String CAMBIO_PAQUETECEL_OPERACION = "GestionarSSComprarServiciosRest";
    private static final String CAMBIO_PAQUETECEL_PROCESO = "Cambio Paquete";
    private static final String CAMBIO_PAQUETECEL_CATEGORIA = "Paquete Principal";
    private static final String CAMBIO_PAQUETECEL_GRUPO = "Venta a suscriptor";
    private static final String CAMBIO_PAQUETECEL_TIPO = "Solicitud de Aprovisionamiento";
    private static final String CAMBIO_PAQUETECEL_ACTION = "Add";
    
    public ServicioCambioPaqueteCelular() {
        super();
    }
    
    //Metodo dummy
    public List<PaqueteCelularModelDTO> consultarPaquetesCelularesDummy(String cuentaSky, String assetNumberMasterPrincipal, String pais) {
        List<PaqueteCelularModelDTO> paquetesCelulares = new ArrayList<PaqueteCelularModelDTO>();
        PaqueteCelularModelDTO paqCelModel = null;
        
        paqCelModel = new PaqueteCelularModelDTO();
        paqCelModel.setNombreProductoCRM("BTCel DP Cel VETV HD LITE SIM DUMMY");
        paqCelModel.setNombreProductoSEL("Blue Telecomm Cel Comparte");
        paqCelModel.setPartNum("29-1W9DUMMY");
        paqCelModel.setDescripcion("Comparte Datos");
        paqCelModel.setMinutos("1500");
        paqCelModel.setSms("1000");
        paqCelModel.setDatos("40000");
        paqCelModel.setVigencia("31");
        paqCelModel.setPrecio("300");        
        paquetesCelulares.add(paqCelModel);        
        
        paqCelModel = new PaqueteCelularModelDTO();
        paqCelModel.setNombreProductoCRM("BTCel DP Cel VETV HD BAS SIM DUMMY");
        paqCelModel.setNombreProductoSEL("Blue Telecomm Cel");
        paqCelModel.setPartNum("30-1W9DUMMY");
        paqCelModel.setDescripcion("Descripcion 1 DUMMY");
        paqCelModel.setMinutos("1500");
        paqCelModel.setSms("1000");
        paqCelModel.setDatos("40000");
        paqCelModel.setVigencia("15");
        paqCelModel.setPrecio("200");        
        paquetesCelulares.add(paqCelModel);
        
        paqCelModel = new PaqueteCelularModelDTO();
        paqCelModel.setNombreProductoCRM("BTCel DP Cel VETV HD ILI SIM DUMMY");
        paqCelModel.setNombreProductoSEL("Blue Telecomm Cel Básico Comparte");
        paqCelModel.setPartNum("31-1W9DUMMY");
        paqCelModel.setDescripcion("Comparte Datos");
        paqCelModel.setMinutos("1500");
        paqCelModel.setSms("500");
        paqCelModel.setDatos("5000");
        paqCelModel.setVigencia("31");
        paqCelModel.setPrecio("150");        
        paquetesCelulares.add(paqCelModel);
        
        paqCelModel = new PaqueteCelularModelDTO();
        paqCelModel.setNombreProductoCRM("BTCel DP Cel VETV HD ILI SIM DUMMY");
        paqCelModel.setNombreProductoSEL("Blue Telecomm Cel Lite Comparte");
        paqCelModel.setPartNum("31-1W9DUMMY");
        paqCelModel.setDescripcion("Comparte Datos");
        paqCelModel.setMinutos("200");
        paqCelModel.setSms("100");
        paqCelModel.setDatos("1000");
        paqCelModel.setVigencia("31");
        paqCelModel.setPrecio("65");        
        paquetesCelulares.add(paqCelModel);
        
        paqCelModel = new PaqueteCelularModelDTO();
        paqCelModel.setNombreProductoCRM("BTCel DP Cel VETV HD ILI SIM DUMMY");
        paqCelModel.setNombreProductoSEL("Comparte 3 días");
        paqCelModel.setPartNum("31-1W9DUMMY");
        paqCelModel.setDescripcion("Comparte Datos");
        paqCelModel.setMinutos("250");
        paqCelModel.setSms("125");
        paqCelModel.setDatos("1000");
        paqCelModel.setVigencia("3");
        paqCelModel.setPrecio("30");        
        paquetesCelulares.add(paqCelModel);
        
        paqCelModel = new PaqueteCelularModelDTO();
        paqCelModel.setNombreProductoCRM("BTCel DP Cel VETV HD ILI SIM DUMMY");
        paqCelModel.setNombreProductoSEL("Comparte 7 días");
        paqCelModel.setPartNum("31-1W9DUMMY");
        paqCelModel.setDescripcion("Comparte Datos");
        paqCelModel.setMinutos("500");
        paqCelModel.setSms("250");
        paqCelModel.setDatos("2500");
        paqCelModel.setVigencia("7");
        paqCelModel.setPrecio("50");        
        paquetesCelulares.add(paqCelModel);
        
        paqCelModel = new PaqueteCelularModelDTO();
        paqCelModel.setNombreProductoCRM("BTCel DP Cel VETV HD ILI SIM DUMMY");
        paqCelModel.setNombreProductoSEL("Comparte 15 días");
        paqCelModel.setPartNum("31-1W9DUMMY");
        paqCelModel.setDescripcion("Comparte Datos");
        paqCelModel.setMinutos("1000");
        paqCelModel.setSms("500");
        paqCelModel.setDatos("5000");
        paqCelModel.setVigencia("15");
        paqCelModel.setPrecio("100");        
        paquetesCelulares.add(paqCelModel);
        
        paqCelModel = new PaqueteCelularModelDTO();
        paqCelModel.setNombreProductoCRM("BTCel DP Cel VETV HD ILI SIM DUMMY");
        paqCelModel.setNombreProductoSEL("RI Norteamérica / Latinoamérica 500 MB");
        paqCelModel.setPartNum("31-1W9DUMMY");
        paqCelModel.setDescripcion("Descripcion 2 DUMMY");
        paqCelModel.setMinutos("1000");
        paqCelModel.setSms("500");
        paqCelModel.setDatos("500");
        paqCelModel.setVigencia("30");
        paqCelModel.setPrecio("349");        
        paquetesCelulares.add(paqCelModel);
        
        paqCelModel = new PaqueteCelularModelDTO();
        paqCelModel.setNombreProductoCRM("BTCel DP Cel VETV HD ILI SIM DUMMY");
        paqCelModel.setNombreProductoSEL("RI Norteamérica / Latinoamérica 1000 MB");
        paqCelModel.setPartNum("31-1W9DUMMY");
        paqCelModel.setDescripcion("Descripcion 3 DUMMY");
        paqCelModel.setMinutos("1000");
        paqCelModel.setSms("500");
        paqCelModel.setDatos("100");
        paqCelModel.setVigencia("30");
        paqCelModel.setPrecio("699");        
        paquetesCelulares.add(paqCelModel);
        
        paqCelModel = new PaqueteCelularModelDTO();
        paqCelModel.setNombreProductoCRM("BTCel DP Cel VETV HD ILI SIM DUMMY");
        paqCelModel.setNombreProductoSEL("RI Europa/Asia/Africa/Oceanía 500 MB");
        paqCelModel.setPartNum("31-1W9DUMMY");
        paqCelModel.setDescripcion("Descripcion 4 DUMMY");
        paqCelModel.setMinutos("1000");
        paqCelModel.setSms("500");
        paqCelModel.setDatos("500");
        paqCelModel.setVigencia("30");
        paqCelModel.setPrecio("699");        
        paquetesCelulares.add(paqCelModel);
        
        paqCelModel = new PaqueteCelularModelDTO();
        paqCelModel.setNombreProductoCRM("BTCel DP Cel VETV HD ILI SIM DUMMY");
        paqCelModel.setNombreProductoSEL("RI Europa/Asia/Africa/Oceanía 1000 MB");
        paqCelModel.setPartNum("31-1W9DUMMY");
        paqCelModel.setDescripcion("Descripcion 4 DUMMY");
        paqCelModel.setMinutos("1000");
        paqCelModel.setSms("500");
        paqCelModel.setDatos("1000");
        paqCelModel.setVigencia("30");
        paqCelModel.setPrecio("999");        
        paquetesCelulares.add(paqCelModel);
        
        paqCelModel = new PaqueteCelularModelDTO();
        paqCelModel.setNombreProductoCRM("BTCel DP Cel VETV HD ILI SIM DUMMY");
        paqCelModel.setNombreProductoSEL("RI Norteamérica/Latinoamérica/Europa/Asia");
        paqCelModel.setPartNum("31-1W9DUMMY");
        paqCelModel.setDescripcion("Descripcion 4 DUMMY");
        paqCelModel.setMinutos("100");
        paqCelModel.setSms("100");
        paqCelModel.setDatos("1000");
        paqCelModel.setVigencia("30");
        paqCelModel.setPrecio("399");        
        paquetesCelulares.add(paqCelModel);
        
        paqCelModel = new PaqueteCelularModelDTO();
        paqCelModel.setNombreProductoCRM("BTCel DP Cel VETV HD ILI SIM DUMMY");
        paqCelModel.setNombreProductoSEL("LD Latinoamérica");
        paqCelModel.setPartNum("31-1W9DUMMY");
        paqCelModel.setDescripcion("Descripcion 5 DUMMY");
        paqCelModel.setMinutos("60");
        paqCelModel.setSms("10");
        paqCelModel.setDatos("1000");
        paqCelModel.setVigencia("30");
        paqCelModel.setPrecio("100");        
        paquetesCelulares.add(paqCelModel);
        
        paqCelModel = new PaqueteCelularModelDTO();
        paqCelModel.setNombreProductoCRM("BTCel DP Cel VETV HD ILI SIM DUMMY");
        paqCelModel.setNombreProductoSEL("LD Europa");
        paqCelModel.setPartNum("31-1W9DUMMY");
        paqCelModel.setDescripcion("Descripcion 6 DUMMY");
        paqCelModel.setMinutos("30");
        paqCelModel.setSms("10");
        paqCelModel.setDatos("1000");
        paqCelModel.setVigencia("30");
        paqCelModel.setPrecio("100");        
        paquetesCelulares.add(paqCelModel);
        
        paqCelModel = new PaqueteCelularModelDTO();
        paqCelModel.setNombreProductoCRM("BTCel DP Cel VETV HD ILI SIM DUMMY");
        paqCelModel.setNombreProductoSEL("LD Resto del Mundo 1");
        paqCelModel.setPartNum("31-1W9DUMMY");
        paqCelModel.setDescripcion("Descripcion 7 DUMMY");
        paqCelModel.setMinutos("15");
        paqCelModel.setSms("10");
        paqCelModel.setDatos("1000");
        paqCelModel.setVigencia("30");
        paqCelModel.setPrecio("100");        
        paquetesCelulares.add(paqCelModel);
        
        paqCelModel = new PaqueteCelularModelDTO();
        paqCelModel.setNombreProductoCRM("BTCel DP Cel VETV HD ILI SIM DUMMY");
        paqCelModel.setNombreProductoSEL("LD Resto del Mundo 2");
        paqCelModel.setPartNum("31-1W9DUMMY");
        paqCelModel.setDescripcion("Descripcion 7 DUMMY");
        paqCelModel.setMinutos("30");
        paqCelModel.setSms("10");
        paqCelModel.setDatos("1000");
        paqCelModel.setVigencia("30");
        paqCelModel.setPrecio("200");        
        paquetesCelulares.add(paqCelModel);
        
        return paquetesCelulares;
    }
    
    public List<PaqueteCelularModelDTO> consultarPaquetesCelulares(String cuentaSky, String assetNumberMasterPrincipal, String pais) {
        List<PaqueteCelularModelDTO> paquetesCelulares = new ArrayList<PaqueteCelularModelDTO>();
        PaqueteCelularModelDTO paqCelModel = null;
        ConsultarcambiopaqueteprincipalEp consultarcambiopaqueteprincipalEp = new ConsultarcambiopaqueteprincipalEp();
        ConsultarCambioPaquetePrincipal consultarCambioPaquetePrincipalWS =
            consultarcambiopaqueteprincipalEp.getConsultarCambioPaquetePrincipalPt();
        
        ConsultarCambioPaquetePrincipalRequestEBMType payload = new ConsultarCambioPaquetePrincipalRequestEBMType();
        ConsultarCambioPaquetePrincipalResponseEBMType responseWS = null;
        
        //Header
        EBMHeaderRequestType header = new EBMHeaderRequestType();
        header.setOperacion(CONSULTA_PAQUETES_OPERACION);
        header.setSistemaOrigen(SISTEMA_ORIGEN);
        
        //Request
        ConsultarCambioPaquetePrincipalRequestType request = new ConsultarCambioPaquetePrincipalRequestType();
        request.setProceso(CONSULTA_PAQUETES_PROCESO);
        request.setCategoria(CONSULTA_PAQUETES_CATEGORIA);
        request.setCuenta(cuentaSky);
        request.setAssetNumber(assetNumberMasterPrincipal);
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
            for(ConsultarCambioPaquetePrincipalEBOType paqCelWS : responseWS.getConsultarCambioPaquetePrincipal().getConsultarCambioPaquetePrincipal() ) {
                System.out.print("Se encontraron paquetes celulares a mostrar...");
                paqCelModel = new PaqueteCelularModelDTO();
                paqCelModel.setNombreProductoCRM(paqCelWS.getNombreProductoCRM());
                paqCelModel.setNombreProductoSEL(paqCelWS.getNombreProductoSEL());
                paqCelModel.setPartNum(paqCelWS.getPartNum());
                paqCelModel.setDescripcion(paqCelWS.getDescripcion());
                paqCelModel.setMinutos(paqCelWS.getMinutos());
                paqCelModel.setSms(paqCelWS.getSMS());
                paqCelModel.setDatos(paqCelWS.getDatos());
                paqCelModel.setVigencia(paqCelWS.getVigencia());
                paqCelModel.setPrecio(paqCelWS.getPrecio());
                
                paquetesCelulares.add(paqCelModel);
            }
        } else if( responseWS != null && responseWS.getEBMHeaderResponse() != null && 
                   responseWS.getEBMHeaderResponse().getErrorNegocio() != null ) {
            System.out.print("No se encontraron paquetes celulares a mostrar, descripcion error del servicio: " + responseWS.getEBMHeaderResponse().getErrorNegocio().getDescripcionError());
            LogServicios.printlnError(this, "Se produjo un error al llamar al servicio consultarCambioPaquetePrincipal");
            LogServicios.printlnError(this, "Descripcion error del servicio: " + responseWS.getEBMHeaderResponse().getErrorNegocio().getDescripcionError());
        } else {
            System.out.print("Ocurrio un error al consultar los paquetes celulares y no viene la descripción del error en el servicio");
        }
        
        
        return paquetesCelulares;
    }
    
    public String cambiarPaqueteCelular(String cuentaSky, String assetNumberMasterPrincipal, String nombreProducto) {
        System.out.println("IN cambiarPaqueteCelular method");
        
        String resultWS = null;
        GestionarSSComprarServiciosEp gestionarSSComprarServiciosEp = new GestionarSSComprarServiciosEp();
        GestionarSSComprarServicios gestionarSSComprarServiciosWS =
            gestionarSSComprarServiciosEp.getGestionarSSComprarServiciosPt();
        
        GestionarSSComprarServiciosRequestType payload = new GestionarSSComprarServiciosRequestType();
        GestionarSSComprarServiciosResponseType responseWS = null;
        
        //Header Payload
        EBMHeaderRequestType headerPayload = new EBMHeaderRequestType();
        headerPayload.setOperacion(CAMBIO_PAQUETECEL_OPERACION);
        headerPayload.setSistemaOrigen(SISTEMA_ORIGEN);
        
        //Header request
        mx.com.sky.enterpriseobjects.soa.common.v1.EBMHeaderRequestType headerRequest = new mx.com.sky.enterpriseobjects.soa.common.v1.EBMHeaderRequestType();
        headerRequest.setOperacion(CAMBIO_PAQUETECEL_OPERACION);
        headerRequest.setSistemaOrigen(SISTEMA_ORIGEN);
        
        //Service info request
        ServiceInfoRequestType serviceInfoRequest = new ServiceInfoRequestType();
        serviceInfoRequest.setProceso(CAMBIO_PAQUETECEL_PROCESO);
        serviceInfoRequest.setCuenta(cuentaSky);
        serviceInfoRequest.setCategoria(CAMBIO_PAQUETECEL_CATEGORIA);
        serviceInfoRequest.setGrupo(CAMBIO_PAQUETECEL_GRUPO);
        serviceInfoRequest.setTipo(CAMBIO_PAQUETECEL_TIPO);
        serviceInfoRequest.setOrigen(SISTEMA_ORIGEN);
        
        //
        ListOfInstancesType listInstancesServiceInfo = new ListOfInstancesType();
        ListOfInstancesType.Instance instance = new ListOfInstancesType.Instance();
        instance.setAssetNumber(assetNumberMasterPrincipal);
        
        
        ListOfProductsType listOfProducts = new ListOfProductsType();
        ListOfProductsType.Product product = new ListOfProductsType.Product();
        product.setAction(CAMBIO_PAQUETECEL_ACTION);
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
                LogServicios.println(this, "El cambio de paquete celular fue exitoso, NumeroSS: " +
                                     responseWS.getGestionarSSComprarServiciosResponseEBM().getServiceInfoResponse().getNumeroSS());
            System.out.println("El cambio de paquete celular fue exitoso, NumeroSS: " +
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
