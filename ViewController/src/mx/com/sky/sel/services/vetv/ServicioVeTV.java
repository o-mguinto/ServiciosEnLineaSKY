package mx.com.sky.sel.services.vetv;

import java.io.Serializable;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;
import mx.com.sky.enterpriseobjects.soa.consultapreciorecargainterface.ConsultaPrecioRecargaEBMType;
import mx.com.sky.enterpriseobjects.soa.consultapreciorecargainterface.ConsultaPrecioRecargaResponseEBMType;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultavetvfechasrenta.types.ConsultaVeTVFechasInType;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultavetvfechasrenta.types.ConsultaVeTVFechasOutType;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultavetvfechasrenta.ConsultaVeTVFechasRenta;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultavetvfechasrenta.ConsultavetvfechasrentaClientEp;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultavetvprices.ConsultaVeTVPrices;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultavetvprices.types.ConsultaVeTVPricesProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultavetvprices.types.ConsultaVeTVPricesProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultavetvprices.ConsultaVeTVPrices_Service;
import mx.com.sky.sel.beans.vetv.DataVeTV;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.proxyclients.soainterface.consultapreciorecargasoainterface.ConsultaPrecioRecargaSoaInterface;
import mx.com.sky.sel.proxyclients.soainterface.consultapreciorecargasoainterface.ConsultaPrecioRecargaSoaInterfaceEp;
import mx.com.sky.soasky.CabeceraEntradaTYPE;
import mx.com.sky.soasky.RecargaConsultaPrecioRecargaEntradaTYPE;

import mx.com.sky.sel.proxyclients.soainterface.consultacuentasoainterface.ConsultaCuentaSoaInterface;
import mx.com.sky.sel.proxyclients.soainterface.consultacuentasoainterface.ConsultaCuentaSoaInterfaceEp;
import mx.com.sky.siebelosb.consultacuenta.ConsultaCuentaEntradaTYPE;
import mx.com.sky.siebelosb.consultacuenta.ConsultaCuentaSalidaTYPE;

import java.util.List;
import java.util.ArrayList;
import java.math.BigInteger;

import mx.com.sky.enterpriseobjects.soa.consultacuentainterface.ConsultaCuentaRequestEBMType;
import mx.com.sky.enterpriseobjects.soa.consultacuentainterface.ConsultaCuentaResponseEBMType;


public class ServicioVeTV implements Serializable {
    @SuppressWarnings("compatibility:7996588581324609401")
    private static final long serialVersionUID = -8716399505686464299L;

    public ServicioVeTV() {
        super();
    }


    public double consultarPrecio(String codigo) {
        double precio = 0.0;
        ConsultaVeTVPrices_Service consultaVeTVPrices_Service;
        ConsultaVeTVPrices consultaVeTVPrices = null;
        ConsultaVeTVPricesProcessRequest payload;
        ConsultaVeTVPricesProcessResponse respuesta;
        consultaVeTVPrices_Service = new ConsultaVeTVPrices_Service();
        consultaVeTVPrices = consultaVeTVPrices_Service.getConsultaVeTVPrices();

        try {


            payload = new ConsultaVeTVPricesProcessRequest();
            payload.setCode(codigo);
            respuesta = consultaVeTVPrices.process(payload);
            if (respuesta != null && respuesta.getRespuesta().equalsIgnoreCase("0")) {
                precio = respuesta.getPRICE().doubleValue();
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }

        return precio;

    }
    
    public double consultarPrecio(String cuenta, String tipoRecarga) {
           System.out.println("consultando precio recarga: cuenta "+cuenta+ "recarga de: "+tipoRecarga);
           double precio = 0.0;
           ConsultaPrecioRecargaSoaInterfaceEp consultaPrecioRecargaSoaInterfaceEp =
               new ConsultaPrecioRecargaSoaInterfaceEp();
           ConsultaPrecioRecargaSoaInterface consultaPrecioRecargaSoaInterface =
               consultaPrecioRecargaSoaInterfaceEp.getConsultaPrecioRecargaSoaInterfacePt();
           
           ConsultaPrecioRecargaEBMType payload = new ConsultaPrecioRecargaEBMType();
           ConsultaPrecioRecargaResponseEBMType response = new ConsultaPrecioRecargaResponseEBMType();
           RecargaConsultaPrecioRecargaEntradaTYPE input = new RecargaConsultaPrecioRecargaEntradaTYPE();
           CabeceraEntradaTYPE cabecera= new CabeceraEntradaTYPE();
           EBMHeaderRequestType ebmHeader = new EBMHeaderRequestType();
           
           cabecera.setAPLICATIVO("SEL");
           cabecera.setOPERACION("ConsultaPrecio");
           
           ebmHeader.setOperacion("ConsultaPrecio");
           ebmHeader.setSistemaOrigen("SEL");
               
           input.setCABECERA(cabecera);
           input.setNUMCUENTA(cuenta);
           
           payload.setEBMHeaderRequest(ebmHeader);
           payload.setRecargaConsultaPrecioRecargaEntrada(input);
           response = consultaPrecioRecargaSoaInterface.consultaPrecioRecarga(payload);
           System.out.println("response: "+response);
           try{
               if(response != null && response.getEBMHeaderResponse().getErrorNegocio().getEstado().equalsIgnoreCase("ok")){
                   if(response.getRecargaConsultaPrecioRecargaSalida().getPRECIORECARGA() !=null){
                       if(tipoRecarga.equalsIgnoreCase("1"))
                            precio = Double.parseDouble(response.getRecargaConsultaPrecioRecargaSalida().getPRECIORECARGA().toString());   
                       else
                            precio = Double.parseDouble(response.getRecargaConsultaPrecioRecargaSalida().getPRECIORECARGA15().toString());   
                   }
               }else{
                   if(response.getRecargaConsultaPrecioRecargaSalida()!=null){
                       LogServicios.printlnError(this, response.getRecargaConsultaPrecioRecargaSalida().getRESPERROR());
                   }
                   LogServicios.printlnError(this, "No se obtuvó el precio para la cuenta "+cuenta+" de "+tipoRecarga +" dias");
               }
           } 
           catch (Exception e) {
               LogServicios.printlnError(this, e.getMessage(), e);
           }
           System.out.println("+++++ precio: "+precio);
           return precio;
       }
    
    public DataVeTV consultarDiasFinRecarga(String cuentaSKY) {
        DataVeTV dataVeTVRestult = new DataVeTV();
        ConsultavetvfechasrentaClientEp ConsultavetvfechasrentaClientEp;
        ConsultaVeTVFechasRenta consultaVeTVFechasRenta = null;
        ConsultaVeTVFechasInType input = null;
        ConsultaVeTVFechasOutType response = null;
        ConsultavetvfechasrentaClientEp = new ConsultavetvfechasrentaClientEp();
        consultaVeTVFechasRenta = ConsultavetvfechasrentaClientEp.getConsultaVeTVFechasRentaPt();
        input = new ConsultaVeTVFechasInType();
        input.setCUENTASKY(cuentaSKY);
        response = consultaVeTVFechasRenta.process(input);
        if (response != null) {
            ConsultaCuentaSoaInterfaceEp ConsultaCuentaSoaInterfaceEp = new ConsultaCuentaSoaInterfaceEp();
            ConsultaCuentaSoaInterface consultaCuentaSoaInterface = ConsultaCuentaSoaInterfaceEp.getConsultaCuentaSoaInterfacePt();
            ConsultaCuentaRequestEBMType request = new ConsultaCuentaRequestEBMType();
            ConsultaCuentaEntradaTYPE entrada = new ConsultaCuentaEntradaTYPE();
            mx.com.sky.siebelosb.consultacuenta.CabeceraEntradaTYPE cabecera = new mx.com.sky.siebelosb.consultacuenta.CabeceraEntradaTYPE();
            ConsultaCuentaResponseEBMType response2 = new ConsultaCuentaResponseEBMType();
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
            response2= consultaCuentaSoaInterface.consultaCuenta(request);
            List<ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance.ServiceInstance> listServiceInstance = response2.getConsultaCuentaSalida().getListOfAccount().getAccount().get(0).getListOfServiceInstance().getServiceInstance();
            if (Integer.parseInt(response2.getConsultaCuentaSalida().getListOfAccount().getAccount().get(0).getServicesNumber()) >= 1) {
                for (ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance.ServiceInstance listOfServiceInstance : listServiceInstance) {
                    if (listOfServiceInstance.getServiceProductType().equalsIgnoreCase("VIDEO") && listOfServiceInstance.getSlaveHierarchy().equalsIgnoreCase("Master")) {
                        List<ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance.ServiceInstance.ListOfInstanceComponent.InstanceComponent> listInstanceComponent = listOfServiceInstance.getListOfInstanceComponent().getInstanceComponent();
                        for (ConsultaCuentaSalidaTYPE.ListOfAccount.Account.ListOfServiceInstance.ServiceInstance.ListOfInstanceComponent.InstanceComponent instanceComponent :listInstanceComponent) {
                            if (instanceComponent.getProductCategory().equalsIgnoreCase("Paquete Principal")) {
                                dataVeTVRestult.setFechaFinRecarga(instanceComponent.getEffectiveEndDate().split(" ")[0]); }
                        }
                    }
                }
            }
        }
        return dataVeTVRestult;
    }
}
