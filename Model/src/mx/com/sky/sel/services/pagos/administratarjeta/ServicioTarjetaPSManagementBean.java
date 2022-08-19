package mx.com.sky.sel.services.pagos.administratarjeta;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.ws.Holder;

import mx.com.sky.enterprisemessages.sel.administrartarjetapago.ConsultarTarjetaInputRequestEBMType;
import mx.com.sky.enterprisemessages.sel.administrartarjetapago.ConsultarTarjetaOutputResponseEBMType;
import mx.com.sky.enterprisemessages.sel.administrartarjetapago.ConsultarTarjetasInputType;
import mx.com.sky.enterprisemessages.sel.administrartarjetapago.ConsultarTarjetasOutputType;
import mx.com.sky.enterprisemessages.sel.administrartarjetapago.DatosVoltageType;
import mx.com.sky.enterprisemessages.sel.administrartarjetapago.EliminarTarjetaInputRequestEBMType;
import mx.com.sky.enterprisemessages.sel.administrartarjetapago.EliminarTarjetaInputType;
import mx.com.sky.enterprisemessages.sel.administrartarjetapago.EliminarTarjetaOutputResponseEBMType;
import mx.com.sky.enterprisemessages.sel.administrartarjetapago.RegistrarTarjetaInputRequestEBMType;
import mx.com.sky.enterprisemessages.sel.administrartarjetapago.RegistrarTarjetaInputType;
import mx.com.sky.enterprisemessages.sel.administrartarjetapago.RegistrarTarjetaOutputResponseEBMType;
import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;
import mx.com.sky.enterpriseobjects.sel.tarjetapagoebo.DatosTarjetaPagoType;
import mx.com.sky.sel.proxyclients.pagweb.admintarjetapago.AdministratarjetaClientEp;
import mx.com.sky.sel.proxyclients.pagweb.admintarjetapago.BPELAdministraTarjetasPago;
import mx.com.sky.sel.proxyclients.pagweb.admintarjetapago.types.ProcessResponse;
import mx.com.sky.sel.services.beans.pagos.tarjetas.Bines;
import mx.com.sky.sel.services.beans.pagos.tarjetas.Tarjeta;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.proxyclients.selabcs.consultartarjetapagoselabcs.ConsultarTarjetaPagoSelABCS;
import mx.com.sky.sel.proxyclients.selabcs.consultartarjetapagoselabcs.ConsultarTarjetaPagoSelABCSEp;
import mx.com.sky.sel.proxyclients.selabcs.eliminartarjetapagoselabcs.EliminarTarjetaPagoSelABCS;
import mx.com.sky.sel.proxyclients.selabcs.eliminartarjetapagoselabcs.EliminarTarjetaPagoSelABCSEp;
import mx.com.sky.sel.proxyclients.selabcs.registrartarjetapagoselabcs.RegistrarTarjetaPagoSelABCS;
import mx.com.sky.sel.proxyclients.selabcs.registrartarjetapagoselabcs.RegistrarTarjetaPagoSelABCSEp;
import mx.com.sky.sel.services.pagos.tarjetas.ServicioBines;
import mx.com.sky.sel.utils.Encriptacion;

@Stateless(name = "ServicioTarjetaPSManagement", mappedName = "SEL-ServicioTarjetaPSManagement")
public class ServicioTarjetaPSManagementBean implements Serializable,ServicioTarjetaPSManagement, ServicioTarjetaPSManagementLocal {
    @SuppressWarnings("compatibility:5409038598360335676")
    private static final long serialVersionUID = -2321444197937595528L;
    
    @Resource
    SessionContext sessionContext;

    public ServicioTarjetaPSManagementBean() {
        LogServicios.println(this, "DCTarjetas Creado");
    }
        
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Tarjeta> consultarTarjetasPs(String numeroCuentaCliente, String phaseId, String keyId) {
        List<Tarjeta> tarjetas = new ArrayList<Tarjeta>();
        Tarjeta tarjeta = null;
        
        ConsultarTarjetaPagoSelABCSEp consultarTarjetaPagoSelABCSEp =
            new ConsultarTarjetaPagoSelABCSEp();
        ConsultarTarjetaPagoSelABCS consultarTarjetaPagoSelABCS =
            consultarTarjetaPagoSelABCSEp.getConsultarTarjetaPagoSelABCSPt();
        ConsultarTarjetaOutputResponseEBMType response = new ConsultarTarjetaOutputResponseEBMType();
        ConsultarTarjetaInputRequestEBMType payload = new ConsultarTarjetaInputRequestEBMType();
        
        EBMHeaderRequestType headerValue= new EBMHeaderRequestType();
        headerValue.setOperacion("ConsultarTarjeta");
        headerValue.setSistemaOrigen("SEL");
        
        ConsultarTarjetasInputType datosConsultarTarjetaInput= new ConsultarTarjetasInputType();
        datosConsultarTarjetaInput.setSistemaProducto("SKY");
        datosConsultarTarjetaInput.setNumeroCuentaCliente(numeroCuentaCliente);
        
        DatosVoltageType datosVoltage= new DatosVoltageType();
        datosVoltage.setKeyId(keyId);
        datosVoltage.setPhaseId(phaseId);
        
        payload.setEBMHeaderRequest(headerValue);
        payload.setDatosConsultarTarjetaInput(datosConsultarTarjetaInput);
        payload.setDatosVoltage(datosVoltage);


        try {
            response = consultarTarjetaPagoSelABCS.consultarTarjetaPago(payload);
            List<ConsultarTarjetasOutputType> datosConsultarTarjetaOutput;
            datosConsultarTarjetaOutput = response.getDatosConsultarTarjetaOutput();
            if (response != null & response.getEBMHeaderResponse().getErrorNegocio().getEstado().equalsIgnoreCase("ok")) {
                for (ConsultarTarjetasOutputType tarjetaWS : datosConsultarTarjetaOutput ){
                    tarjeta = convertTarjeta(tarjetaWS);
                    tarjetas.add(tarjeta);
                }
            }else{
                LogServicios.println(this, "tarjetas null");
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }

        return tarjetas;
    }

        @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
        public List<Tarjeta> obtenerTarjetas(String uuid) {
            List<Tarjeta> tarjetas = new ArrayList<Tarjeta>();
            Tarjeta tarjeta = null;
            AdministratarjetaClientEp admonTarjetasCredito_Service;
            BPELAdministraTarjetasPago admonTarjetasCredito = null;
            Holder<String> respuesta= new Holder<>();
            Holder<String> respuestadesc= new Holder<>();
            Holder<List<mx.com.sky.sel.proxyclients.pagweb.admintarjetapago.types.ProcessResponse.Tarjetas>> tarjetasWs = new Holder<>();

            try {

                admonTarjetasCredito_Service = new AdministratarjetaClientEp();
                admonTarjetasCredito = admonTarjetasCredito_Service.getBPELAdministraTarjetasPagoPt();
                admonTarjetasCredito.process("SELECT", null, null, null, null, null, null, uuid, null, null, respuesta, respuestadesc, tarjetasWs);
                
                if (tarjetasWs != null) {
                    for (ProcessResponse.Tarjetas tarjetaWS : tarjetasWs.value){
                        tarjeta = convertTarjeta(tarjetaWS);
                        tarjetas.add(tarjeta);
                    }
                }else{
                    LogServicios.println(this, "tarjetas null");
                }
            } catch (Exception e) {
                LogServicios.printlnError(this, e.getMessage(), e);
            }

            return tarjetas;
        }
        
        @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
        public String guardarTarjetaPs(String numeroCuentaCliente, Tarjeta tarjeta, String organizationID) {
            String respuesta="";
            try {
            RegistrarTarjetaPagoSelABCSEp registrarTarjetaPagoSelABCSEp =
                new RegistrarTarjetaPagoSelABCSEp();
            RegistrarTarjetaPagoSelABCS registrarTarjetaPagoSelABCS =
                registrarTarjetaPagoSelABCSEp.getRegistrarTarjetaPagoSelABCSPt();
            RegistrarTarjetaOutputResponseEBMType response = new RegistrarTarjetaOutputResponseEBMType();
            RegistrarTarjetaInputRequestEBMType payload = new RegistrarTarjetaInputRequestEBMType();
            EBMHeaderRequestType ebmHeaderRequest = new EBMHeaderRequestType();
            RegistrarTarjetaInputType datosRegistrarTarjetaInput = new RegistrarTarjetaInputType();
            
            ebmHeaderRequest.setOperacion("RegistrarTarjeta");
            ebmHeaderRequest.setSistemaOrigen("SEL");
            
            datosRegistrarTarjetaInput.setSistemaProducto("SKY");
            datosRegistrarTarjetaInput.setNumeroCuentaCliente(numeroCuentaCliente);
                
            DatosTarjetaPagoType datosTarjetaPago = new DatosTarjetaPagoType();
            DatosVoltageType datosVoltage = new DatosVoltageType();
            
            //datos de la tarjeta
            datosTarjetaPago.setAnioExp(tarjeta.getAnio());
            //datosTarjetaPago.setCvv(tarjeta.getCodigo());
            datosTarjetaPago.setMarcaTarjeta(tarjeta.getTipo());
            datosTarjetaPago.setMesExp(tarjeta.getMes());
            datosTarjetaPago.setNombreTitular(tarjeta.getNombre());
            datosTarjetaPago.setNumero(tarjeta.getNumeroTarjeta());
            datosTarjetaPago.setTipoTarjeta(tarjeta.getCreditoDebito());
            
            //voltage
            datosVoltage.setKeyId(tarjeta.getKeyId());
            datosVoltage.setPhaseId(tarjeta.getPhase());
            
            datosRegistrarTarjetaInput.setDatosTarjetaPago(datosTarjetaPago);
            datosRegistrarTarjetaInput.setDatosVoltage(datosVoltage);
                
            payload.setEBMHeaderRequest(ebmHeaderRequest);
            payload.setDatosRegistrarTarjetaInput(datosRegistrarTarjetaInput);
                
            if (validarBines(tarjeta.getNumeroTarjeta().substring(0, 6), organizationID)) {
                response = registrarTarjetaPagoSelABCS.registrarTarjetaPago(payload);
                }

                if (response != null) {
                    if (response.getEBMHeaderResponse().getErrorNegocio().getEstado().equalsIgnoreCase("OK")) {
                        respuesta = response.getEBMHeaderResponse().getErrorNegocio().getDescripcionError();
                    } else {
                        LogServicios.printlnWarn(this, response.getEBMHeaderResponse().getErrorNegocio().getDescripcionError());
                        throw new ServicioException(response.getEBMHeaderResponse().getErrorNegocio().getDescripcionError());
                    }
                }
            } catch (ServicioException e) {
                LogServicios.printlnError(this, e.getMessage(), e);
            } catch (Exception e) {
                LogServicios.printlnError(this, e.getMessage(), e);
                new ServicioException("Servicio no disponible");
            }

            return respuesta;
        }
        
    public String agregarTarjeta(Tarjeta tarjeta, String uuid, String organizationID) {
        AdministratarjetaClientEp admonTarjetasCredito_Service;
        BPELAdministraTarjetasPago admonTarjetasCredito = null;
        String respuesta = "";
        String encode = "";
        Holder<String> respuestaWs= new Holder<>();
        Holder<String> respuestadesc= new Holder<>();
        Holder<List<mx.com.sky.sel.proxyclients.pagweb.admintarjetapago.types.ProcessResponse.Tarjetas>> tarjetasWs = new Holder<>();
        try {
            admonTarjetasCredito_Service = new AdministratarjetaClientEp();
            admonTarjetasCredito = admonTarjetasCredito_Service.getBPELAdministraTarjetasPagoPt();
            
            encode = Encriptacion.encriptar(tarjeta.getNumeroTarjeta());

            if (validarBines(tarjeta.getNumeroTarjeta().substring(0, 6), organizationID)) {
                admonTarjetasCredito.process("INSERT", null, tarjeta.getNombre(), encode, tarjeta.getTipo(), tarjeta.getAnio(), tarjeta.getMes(), uuid, 
                                             tarjeta.getCreditoDebito(), organizationID, respuestaWs, respuestadesc, tarjetasWs);
            }

            if (respuestaWs != null) {
                if (respuestaWs.value.equalsIgnoreCase("0")) {
                    respuesta = respuestadesc.value;
                } else {
                    LogServicios.printlnWarn(this, respuestadesc.value);
                    throw new ServicioException(respuestadesc.value);
                }
            }
        } catch (ServicioException e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            new ServicioException("Servicio no disponible");
        }

        return respuesta;
    }
        
    private boolean validarBines(String numeroTarjeta, String organizationId) throws ServicioException {
        ServicioBines sb = new ServicioBines();
        boolean respuesta = false;
        Bines bines = null;
        try {


            bines = sb.validarBines(numeroTarjeta, organizationId);
            respuesta = bines.isTarjetaValida();
            if (!respuesta) {
                throw new ServicioException("Estimado suscriptor por el momento su tarjeta no puede realizar pagos en l\u00EDnea.");
            }
        } catch (ServicioException e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            throw new ServicioException("Servicio no disponible");
        }
        return respuesta;
    }

        @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public String eliminarTarjeta(Tarjeta tarjeta, String uuid) {
        AdministratarjetaClientEp admonTarjetasCredito_Service;
        BPELAdministraTarjetasPago admonTarjetasCredito = null;
        String respuesta = "";
        Holder<String> respuestaWs= new Holder<>();
        Holder<String> respuestadesc= new Holder<>();
        Holder<List<mx.com.sky.sel.proxyclients.pagweb.admintarjetapago.types.ProcessResponse.Tarjetas>> tarjetasWs = new Holder<>();
        
        try {

            admonTarjetasCredito_Service = new AdministratarjetaClientEp();
            admonTarjetasCredito = admonTarjetasCredito_Service.getBPELAdministraTarjetasPagoPt();

            admonTarjetasCredito.process("DELETE", new BigDecimal(tarjeta.getId()), null, null, null, null, null, uuid,
                                         null, null, respuestaWs, respuestadesc, tarjetasWs);

            if (respuestaWs != null) {
                if (respuestaWs.value.equalsIgnoreCase("0")) {
                    respuesta = respuestadesc.value;
                } else {
                    throw new ServicioException(respuestadesc.value);
                }
            }
        } catch (ServicioException e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            new ServicioException("Ocurri\u00F3 algo inesperado, por favor intente m\u00E1s tarje");
        }

        return respuesta;
    }
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public String eliminarTarjetaPs(String numeroCuentaCliente, String idTarjeta, String keyId, String phase) {
            EliminarTarjetaPagoSelABCSEp eliminarTarjetaPagoSelABCSEp =
                new EliminarTarjetaPagoSelABCSEp();
            EliminarTarjetaPagoSelABCS eliminarTarjetaPagoSelABCS =
                eliminarTarjetaPagoSelABCSEp.getEliminarTarjetaPagoSelABCSPt();
        EliminarTarjetaInputRequestEBMType payload = new EliminarTarjetaInputRequestEBMType();
        EliminarTarjetaOutputResponseEBMType response = new EliminarTarjetaOutputResponseEBMType();
        EBMHeaderRequestType ebmHeaderRequest = new EBMHeaderRequestType();
        EliminarTarjetaInputType datosElimnarTarjeta = new EliminarTarjetaInputType();
        DatosVoltageType datosVoltage = new DatosVoltageType();
        
        ebmHeaderRequest.setOperacion("EliminarTarjeta");
        ebmHeaderRequest.setSistemaOrigen("SEL");
        
        datosElimnarTarjeta.setIdTarjeta(idTarjeta);
        datosElimnarTarjeta.setNumeroCuentaCliente(numeroCuentaCliente);
        datosElimnarTarjeta.setSistemaProducto("SKY");
            
        datosVoltage.setKeyId(keyId);
        datosVoltage.setPhaseId(phase);
        
        payload.setEBMHeaderRequest(ebmHeaderRequest);
        payload.setDatosElimnarTarjeta(datosElimnarTarjeta);
        payload.setDatosVoltage(datosVoltage);
        
        String respuesta = "";
        try {
            response = eliminarTarjetaPagoSelABCS.eliminarTarjetaPago(payload);
            
            if (response != null) {
                if (response.getEBMHeaderResponse().getErrorNegocio().getEstado().equalsIgnoreCase("OK")) {
                    respuesta = response.getEBMHeaderResponse().getErrorNegocio().getDescripcionError();
                } else {
                    LogServicios.printlnWarn(this, response.getEBMHeaderResponse().getErrorNegocio().getDescripcionError());
                    throw new ServicioException(response.getEBMHeaderResponse().getErrorNegocio().getDescripcionError());
                }
            }
            
        } catch (ServicioException e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            new ServicioException("Ocurri\u00F3 algo inesperado, por favor intente m\u00E1s tarje");
        }

        return respuesta;
        }

    private Tarjeta convertTarjeta(ProcessResponse.Tarjetas tarjetaWS) {
        Tarjeta tarjeta = new Tarjeta();
        //String decode = "";
        tarjeta.setCreditoDebito(tarjetaWS.getCcCd());
        tarjeta.setAnio(tarjetaWS.getExpYear());
        tarjeta.setMes(tarjetaWS.getExpMonth());
        //decode = Encriptacion.desencriptar(tarjetaWS.getCcNumber());
        tarjeta.setNumeroTarjeta(tarjetaWS.getCcNumber());
        tarjeta.setNombre(tarjetaWS.getCcName());
        tarjeta.setTipo(tarjetaWS.getCcType());
        tarjeta.setId(tarjetaWS.getId().intValue());
        tarjeta.setCreditoDebitoTexto(
        //si null entonces vacio
        tarjetaWS.getCcCd() == null ? "" :
            //si 01 entonces credito
            tarjetaWS.getCcCd().equals("01") ?
            "Crédito" :
            //si otro entonces debito
            "Débito");
        
        return tarjeta;
    }
        private Tarjeta convertTarjeta(ConsultarTarjetasOutputType tarjetaWS) {
            DatosTarjetaPagoType datosTarjetaPago = tarjetaWS.getDatosTarjetaPago();
            Tarjeta tarjeta = new Tarjeta();
            
            if(datosTarjetaPago != null){
                tarjeta.setCreditoDebito(datosTarjetaPago.getTipoTarjeta());
                tarjeta.setAnio(datosTarjetaPago.getAnioExp());
                tarjeta.setMes(datosTarjetaPago.getMesExp());
                //decode = Encriptacion.desencriptar(tarjetaWS.getCcNumber());
                tarjeta.setNumeroTarjeta(datosTarjetaPago.getNumero());
                tarjeta.setNombre(datosTarjetaPago.getNombreTitular());
                tarjeta.setTipo(datosTarjetaPago.getMarcaTarjeta());        
                tarjeta.setCreditoDebitoTexto(
                //si null entonces vacio
                datosTarjetaPago.getTipoTarjeta() == null ? "" :
                    //si 01 entonces credito
                    datosTarjetaPago.getTipoTarjeta().equals("01") ?
                    "Crédito" :
                    //si otro entonces debito
                    "Débito");
            }
            
            tarjeta.setId(Integer.parseInt(tarjetaWS.getIdTarjeta()));
            tarjeta.setKeyId("1");
            tarjeta.setPhase("1");
            return tarjeta;
        }
    }

