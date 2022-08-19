package mx.com.sky.sel.services.dualplay.consulta;
import java.io.Serializable;

import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;

import mx.com.sky.sel.services.beans.utils.ServiciosCuenta;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.enterpriseobjects.soa.consultacoberturainterface.ConsultaCoberturaRequestEBMType;
import mx.com.sky.enterpriseobjects.soa.consultacoberturainterface.ConsultaCoberturaResponseEBMType;
import mx.com.sky.sel.proxyclients.soainterface.consultacobertura.ConsultaCoberturaSoaInterface;
import mx.com.sky.sel.proxyclients.soainterface.consultacobertura.ConsultaCoberturaSoaInterfaceEp;
import mx.com.sky.soasky.SCINTASConsultaCoberturaEntradaTYPE;
import mx.com.sky.siebelosb.consultacuenta.ConsultaCuentaEntradaTYPE; 
import mx.com.sky.enterpriseobjects.soa.consultacuentainterface.ConsultaCuentaRequestEBMType;
import mx.com.sky.enterpriseobjects.soa.consultacuentainterface.ConsultaCuentaResponseEBMType;
import mx.com.sky.siebelosb.consultacuenta.ConsultaCuentaSalidaTYPE;
import mx.com.sky.sel.proxyclients.soainterface.consultacuentasoainterface.ConsultaCuentaSoaInterface;
import mx.com.sky.sel.proxyclients.soainterface.consultacuentasoainterface.ConsultaCuentaSoaInterfaceEp;
import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;
import mx.com.sky.sel.proxyclients.soainterface.consultaconsumodatossoainterface.ConsultaConsumoDatosSoaInterface;
import mx.com.sky.sel.proxyclients.soainterface.consultaconsumodatossoainterface.ConsultaConsumoDatosSoaInterfaceEp;
import mx.com.sky.enterpriseservices.soa.consultaconsumodatosebm.ConsultaConsumoDatosRequestEBMType;
import mx.com.sky.enterpriseservices.soa.consultaconsumodatosebm.ConsultaConsumoDatosResponseEBMType;
import mx.com.sky.sel.services.beans.utils.LineaCelularDTO;
import mx.com.sky.soasky.SCINTASConsultaConsumoDatosEntradaTYPE;

public class ServicioDualPlay implements Serializable{
    @SuppressWarnings("compatibility:3720899990531004942")
    private static final long serialVersionUID = 3355049704813922294L;

    public ServicioDualPlay() {
        super();
    }
    public ServiciosCuenta consultaCuentaDualPlay(String cuentaSKY) throws ServicioException {
        //DUMMY
        //cuentaSKY = "501222370931";
        //DUMMY
        System.out.println("consultaCuentaDualPlay cuentaSKY: " + cuentaSKY);
        ServiciosCuenta respuesta = new ServiciosCuenta();
        ConsultaCuentaSoaInterfaceEp ConsultaCuentaSoaInterfaceEp = new ConsultaCuentaSoaInterfaceEp();
        ConsultaCuentaSoaInterface consultaCuentaSoaInterface = ConsultaCuentaSoaInterfaceEp.getConsultaCuentaSoaInterfacePt();
        ConsultaCuentaRequestEBMType request = new ConsultaCuentaRequestEBMType();
        ConsultaCuentaEntradaTYPE entrada = new ConsultaCuentaEntradaTYPE();
        mx.com.sky.siebelosb.consultacuenta.CabeceraEntradaTYPE cabecera = new mx.com.sky.siebelosb.consultacuenta.CabeceraEntradaTYPE();
        ConsultaCuentaResponseEBMType response = new ConsultaCuentaResponseEBMType();
        EBMHeaderRequestType emb = new EBMHeaderRequestType();
        ConsultaCuentaEntradaTYPE.ListOfAccount list = new ConsultaCuentaEntradaTYPE.ListOfAccount();
        List<ConsultaCuentaEntradaTYPE.ListOfAccount.Message> messages = new ArrayList<ConsultaCuentaEntradaTYPE.ListOfAccount.Message>();
        ConsultaCuentaEntradaTYPE.ListOfAccount.Message message = new ConsultaCuentaEntradaTYPE.ListOfAccount.Message();
        cabecera.setAPLICATIVO("SEL");
        cabecera.setOPERACION("ConsultaCuenta");
        entrada.setCABECERA(cabecera);
        message.setAccountNumber(new BigInteger(cuentaSKY));
        messages.add(message);
        list.setMessage(messages);
        entrada.setListOfAccount(list);
        request.setConsultaCuentaEntrada(entrada);
        emb.setOperacion("ConsultaCuenta");
        emb.setSistemaOrigen("SEL");
        request.setEBMHeaderRequest(emb);
        response= consultaCuentaSoaInterface.consultaCuenta(request); 
        List<ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance.ServiceInstance> listServiceInstance = response.getConsultaCuentaSalida().getListOfAccount().getAccount().get(0).getListOfServiceInstance().getServiceInstance();
        if (Integer.parseInt(response.getConsultaCuentaSalida().getListOfAccount().getAccount().get(0).getServicesNumber()) > 1) {
            respuesta.setCuentaDualPlay(true);
            
            for (ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance.ServiceInstance listOfServiceInstance : listServiceInstance) {
                if (listOfServiceInstance.getServiceProductType().equalsIgnoreCase("DATOS")) {
                    respuesta.setMsisdn(listOfServiceInstance.getMSISDN());
                    respuesta.setAssetNumber(listOfServiceInstance.getAssetNumber());
                    respuesta.setSecondAssetNumber(listOfServiceInstance.getSecondAssetNumber());
                    respuesta.setStatusServicioInternet(listOfServiceInstance.getEventTypeExtern());
                    respuesta.setProveedorServicios(listOfServiceInstance.getServiceSupplier());
                    List<ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance.ServiceInstance.ListOfInstanceComponent.InstanceComponent> listInstanceComponent = listOfServiceInstance.getListOfInstanceComponent().getInstanceComponent();
                    for (ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance.ServiceInstance.ListOfInstanceComponent.InstanceComponent instanceComponent :listInstanceComponent) {
                            //Se busca el paquete principal, para algunas cuentas viene como paquete y otras como paquete principal
                            if ( instanceComponent.getProductCategory().equalsIgnoreCase("Paquete") ||
                                instanceComponent.getProductCategory().equalsIgnoreCase("Paquete Principal") ) {
                                respuesta.setPaqueteInternet(instanceComponent.getProduct().toString());
                                respuesta.setVelocidadInternet(instanceComponent.getDownloadSpeed().toString());
                            }
                            if (instanceComponent.getExternalOffer().length() > 0) {
                                respuesta.setExternalOffer(instanceComponent.getExternalOffer());
                            }
                    }
                }
                
                //Se obtienen las lineas celulares del suscriptor
                if( listOfServiceInstance.getServiceProductType().equalsIgnoreCase("CELULAR") ) {
                    System.out.println("--------Se encontro informacion de linea celular en la respuesta del WS ConsultaCuentaSoaInterface---------");
                    LineaCelularDTO lineaCelular = new LineaCelularDTO();
                    lineaCelular.setNumCelular(listOfServiceInstance.getMSISDN());
                    lineaCelular.setAssetNumber(listOfServiceInstance.getAssetNumber());
                    lineaCelular.setMasterPaquetePrincipal(false);
                    
                    //Se inserta el paquete y el external offer de la linea celular
                    List<ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance.ServiceInstance.ListOfInstanceComponent.InstanceComponent> celListInstanceComponent = listOfServiceInstance.getListOfInstanceComponent().getInstanceComponent();
                    for (ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance.ServiceInstance.ListOfInstanceComponent.InstanceComponent instanceComponent : celListInstanceComponent) {
                            if ( listOfServiceInstance.getSlaveHierarchy().equalsIgnoreCase("Master") &&
                                 instanceComponent.getProductCategory().equalsIgnoreCase("Paquete Principal") ) {
                                respuesta.setPaqueteCelular(instanceComponent.getProduct().toString());
                                lineaCelular.setMasterPaquetePrincipal(true);
                            }
                            if (instanceComponent.getExternalOffer().length() > 0) {
                                lineaCelular.setExternalOffer(instanceComponent.getExternalOffer());
                            }
                    }
                    
                    if( respuesta.getLineasCelulares() == null ) {
                        respuesta.setLineasCelulares(new ArrayList<LineaCelularDTO>());
                    }
                    respuesta.getLineasCelulares().add(lineaCelular);
                }
                
                if (listOfServiceInstance.getServiceProductType().equalsIgnoreCase("VIDEO") && listOfServiceInstance.getSlaveHierarchy().equalsIgnoreCase("Master")) {
                        respuesta.setStatusCodeMasterVideo(listOfServiceInstance.getStatusCode());
                        respuesta.setAssetNumberVideo(listOfServiceInstance.getAssetNumber());
                        respuesta.setSecondAssetNumberVideo(listOfServiceInstance.getSecondAssetNumber());
                        List<ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance.ServiceInstance.ListOfInstanceComponent.InstanceComponent> listInstanceComponent = listOfServiceInstance.getListOfInstanceComponent().getInstanceComponent();
                        for (ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance.ServiceInstance.ListOfInstanceComponent.InstanceComponent instanceComponent :listInstanceComponent) {
                            if (instanceComponent.getProductCategory().equalsIgnoreCase("Paquete Principal")) {
                                respuesta.setPaqueteVideo(instanceComponent.getProduct().toString());
                            }
                        }
                    }
            } 
        }else{
            respuesta.setCuentaDualPlay(false);
            for (ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance.ServiceInstance listOfServiceInstance : listServiceInstance) {
                if (listOfServiceInstance.getServiceProductType().equalsIgnoreCase("VIDEO") && listOfServiceInstance.getSlaveHierarchy().equalsIgnoreCase("Master")) {
                        respuesta.setStatusCodeMasterVideo(listOfServiceInstance.getStatusCode());
                        respuesta.setAssetNumberVideo(listOfServiceInstance.getAssetNumber());
                        respuesta.setSecondAssetNumberVideo(listOfServiceInstance.getSecondAssetNumber());
                        List<ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance.ServiceInstance.ListOfInstanceComponent.InstanceComponent> listInstanceComponent = listOfServiceInstance.getListOfInstanceComponent().getInstanceComponent();
                        for (ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance.ServiceInstance.ListOfInstanceComponent.InstanceComponent instanceComponent :listInstanceComponent) {
                            if (instanceComponent.getProductCategory().equalsIgnoreCase("Paquete Principal")) {
                                respuesta.setPaqueteVideo(instanceComponent.getProduct().toString());
                            }
                        }
                    }
            }
        }
        
        if( respuesta.getLineasCelulares() != null && !respuesta.getLineasCelulares().isEmpty() ) {
            System.out.println("Se encontraron la(s) siguiente(s) linea(s) celular(es) en la respuesta del WS ConsultaCuentaSoaInterface");
            for(LineaCelularDTO lnCel : respuesta.getLineasCelulares()) {
                System.out.println("numCelular: " + lnCel.getNumCelular());
                System.out.println("assetNumber: " + lnCel.getAssetNumber());
                System.out.println("El número celular es master paq principal: " + lnCel.isMasterPaquetePrincipal());
            }
        }
        
        return respuesta;
    }
    public ConsultaCoberturaResponseEBMType consultaCoberturaDualPlay(String cuentaSKY) throws ServicioException {
        String longitude = "";
        String latitude="";
        ConsultaCuentaSoaInterfaceEp ConsultaCuentaSoaInterfaceEp = new ConsultaCuentaSoaInterfaceEp();
        ConsultaCuentaSoaInterface consultaCuentaSoaInterface = ConsultaCuentaSoaInterfaceEp.getConsultaCuentaSoaInterfacePt();
        ConsultaCuentaRequestEBMType request = new ConsultaCuentaRequestEBMType();
        ConsultaCuentaEntradaTYPE entrada = new ConsultaCuentaEntradaTYPE();
        mx.com.sky.siebelosb.consultacuenta.CabeceraEntradaTYPE cabecera = new mx.com.sky.siebelosb.consultacuenta.CabeceraEntradaTYPE();
        ConsultaCuentaResponseEBMType response = new ConsultaCuentaResponseEBMType();
        EBMHeaderRequestType emb = new EBMHeaderRequestType();
        ConsultaCuentaEntradaTYPE.ListOfAccount list = new ConsultaCuentaEntradaTYPE.ListOfAccount();
        List<ConsultaCuentaEntradaTYPE.ListOfAccount.Message> messages = new ArrayList<ConsultaCuentaEntradaTYPE.ListOfAccount.Message>();
        ConsultaCuentaEntradaTYPE.ListOfAccount.Message message = new ConsultaCuentaEntradaTYPE.ListOfAccount.Message();
        cabecera.setAPLICATIVO("SEL");
        cabecera.setOPERACION("ConsultaCuenta");
        entrada.setCABECERA(cabecera);
        message.setAccountNumber(new BigInteger(cuentaSKY));
        messages.add(message);
        list.setMessage(messages);
        entrada.setListOfAccount(list);
        request.setConsultaCuentaEntrada(entrada);
        emb.setOperacion("ConsultaCuenta");
        emb.setSistemaOrigen("SEL");
        request.setEBMHeaderRequest(emb);
        response= consultaCuentaSoaInterface.consultaCuenta(request); 
        List<ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfAddress.AccountAddress> accountAddress = response.getConsultaCuentaSalida().getListOfAccount().getAccount().get(0).getListOfAddress().getAccountAddress();
        for (ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfAddress.AccountAddress listaccountAddress : accountAddress) {
        if (listaccountAddress.getPrimary().equalsIgnoreCase("Y") && listaccountAddress.getAddrType().equalsIgnoreCase("Servicio")) {
                longitude = listaccountAddress.getLongitude();
                latitude = listaccountAddress.getLatitude();
            }
        }   
        /////
        ConsultaCoberturaSoaInterfaceEp     ConsultaCoberturaSoaInterfaceEp = new ConsultaCoberturaSoaInterfaceEp();
    ConsultaCoberturaSoaInterface consultaCoberturaSoaInterface = ConsultaCoberturaSoaInterfaceEp.getConsultaCoberturaSoaInterfacePt();
    ConsultaCoberturaRequestEBMType requestCob = new ConsultaCoberturaRequestEBMType();
    ConsultaCoberturaResponseEBMType responseCob = new ConsultaCoberturaResponseEBMType();
    mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType header = new mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType();
    header.setOperacion("ConsultaCobertura");
    header.setSistemaOrigen("SEL");
    requestCob.setEBMHeaderRequest(header);
    SCINTASConsultaCoberturaEntradaTYPE entradaCob = new SCINTASConsultaCoberturaEntradaTYPE();
    mx.com.sky.soasky.CabeceraEntradaTYPE cabeceraCob = new mx.com.sky.soasky.CabeceraEntradaTYPE();
    cabeceraCob.setAPLICATIVO("SEL");
    cabeceraCob.setOPERACION("ConsultaCobertura");
    entradaCob.setCABECERA(cabeceraCob);
    entradaCob.setLatitude(latitude);
    entradaCob.setLongitude(longitude);
    requestCob.setSCINTASConsultaCoberturaEntrada(entradaCob);
    responseCob = consultaCoberturaSoaInterface.consultaCobertura(requestCob);
     return responseCob;       
    }
    
    public ConsultaConsumoDatosResponseEBMType consultaConsumoDatos(String cuentaSKY, String msisdn) throws ServicioException {
        System.out.println("ConsumoDatos -----> CuentaSKY: " + cuentaSKY + " msisdn: " + msisdn);
        ConsultaConsumoDatosSoaInterfaceEp ConsultaConsumoDatosSoaInterfaceEp = new ConsultaConsumoDatosSoaInterfaceEp();
        ConsultaConsumoDatosSoaInterface consultaConsumoDatosSoaInterface = ConsultaConsumoDatosSoaInterfaceEp.getConsultaConsumoDatosSoaInterfacePt();
        ConsultaConsumoDatosRequestEBMType requestEBMType = new ConsultaConsumoDatosRequestEBMType();
        ConsultaConsumoDatosResponseEBMType responseEBMType = new ConsultaConsumoDatosResponseEBMType();
        mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType header = new mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType();
        header.setOperacion("consultaConsumoDatos");
        header.setSistemaOrigen("SEL");
        requestEBMType.setEBMHeaderRequest(header);
        SCINTASConsultaConsumoDatosEntradaTYPE datosEntrada = new SCINTASConsultaConsumoDatosEntradaTYPE();
        datosEntrada.setMsisdn(msisdn);
        //datosEntrada.setMsisdn("7111040978");
        datosEntrada.setNumCuenta(cuentaSKY);
        requestEBMType.setSCINTASConsultaConsumoDatosEntrada(datosEntrada);
        responseEBMType = consultaConsumoDatosSoaInterface.consultaConsumoDatos(requestEBMType);
        return responseEBMType;   
    }
    public ConsultaConsumoDatosResponseEBMType consultaConsumoDatos(String cuentaSKY, String msisdn, String externalOffer) throws ServicioException {
        System.out.println("ConsumoDatos -----> CuentaSKY: " + cuentaSKY + " msisdn: " + msisdn + " externalOffer: " + externalOffer);
        ConsultaConsumoDatosSoaInterfaceEp consultaConsumoDatosSoaInterface_ep = new ConsultaConsumoDatosSoaInterfaceEp();
        ConsultaConsumoDatosSoaInterface consultaConsumoDatosSoaInterface = consultaConsumoDatosSoaInterface_ep.getConsultaConsumoDatosSoaInterfacePt();
        ConsultaConsumoDatosRequestEBMType requestEBMType = new ConsultaConsumoDatosRequestEBMType();
        ConsultaConsumoDatosResponseEBMType responseEBMType = new ConsultaConsumoDatosResponseEBMType();
        mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType header = new mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType();
        header.setOperacion("consultaConsumoDatos");
        header.setSistemaOrigen("SEL");
        requestEBMType.setEBMHeaderRequest(header);
        SCINTASConsultaConsumoDatosEntradaTYPE datosEntrada = new SCINTASConsultaConsumoDatosEntradaTYPE();
        datosEntrada.setMsisdn(msisdn);
        //datosEntrada.setMsisdn("7111040978");
        datosEntrada.setNumCuenta(cuentaSKY);
        datosEntrada.setExternalOffer(externalOffer);
        requestEBMType.setSCINTASConsultaConsumoDatosEntrada(datosEntrada);
        responseEBMType = consultaConsumoDatosSoaInterface.consultaConsumoDatos(requestEBMType);
        return responseEBMType;   
    }
}
