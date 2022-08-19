package mx.com.sky.sel.services.portabilidad;

import java.io.Serializable;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;
import mx.com.sky.enterpriseobjects.sel.common.v1.SeguridadItemType;
import mx.com.sky.enterpriseobjects.sel.common.v1.SeguridadListType;
import mx.com.sky.enterpriseobjects.sel.consultaroperadororigen.ConsultarOperadorOrigenRequestEBMType;
import mx.com.sky.enterpriseobjects.sel.consultaroperadororigen.ConsultarOperadorOrigenResponseEBMType;
import mx.com.sky.enterpriseobjects.sel.consultaroperadororigen.OperadorListType;
import mx.com.sky.enterpriseobjects.sel.consultaroperadororigen.OperadorType;
import mx.com.sky.enterpriseobjects.sel.gestionarssportabilidadsoa.GestionarSSPortabilidadRequestEBMType;
import mx.com.sky.enterpriseobjects.sel.gestionarssportabilidadsoa.GestionarSSPortabilidadResponseEBMType;
import mx.com.sky.enterpriseobjects.sel.gestionarssportabilidadsoa.ServiceInfoRequestType;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.proxyclients.selinterface.consultaroperadororigenselsecinterface.ConsultarOperadorOrigen;
import mx.com.sky.sel.proxyclients.selinterface.consultaroperadororigenselsecinterface.ConsultaroperadororigenClientEp;
import mx.com.sky.sel.proxyclients.selinterface.gestionarssportabilidadsoainterface.GestionarSSPortabilidad;
import mx.com.sky.sel.proxyclients.selinterface.gestionarssportabilidadsoainterface.GestionarssportabilidadEp;
import mx.com.sky.sel.services.beans.portabilidad.Companias;
import mx.com.sky.sel.services.beans.portabilidad.PortabilidadBean;
import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import mx.com.sky.sel.services.solicitudservicio.ServicioSolicituServicio;

@Stateless(name = "ServicioPortabilidadPSManagement", mappedName = "SEL-ServicioPortabilidadPSManagement")
public class ServicioPortabilidadPSManagementBean implements Serializable, ServicioPortabilidadPSManagement,
                                                             ServicioPortabilidadPSManagementLocal {
    @SuppressWarnings("compatibility:-2601325992333125402")
    private static final long serialVersionUID = 6356948916233738529L;
    @Resource
    SessionContext sessionContext;
    private static final String OPERACION = "GestionarSSPortabilidad";
    private static final String SISTEMA = "Web";
    private static final String AREASS = "Seguimiento Externo";
    private static final String SUBAREASS = "Solicitud de Portabilidad";
    private static final String ESTATUS = "Abierto";
    private static final String SUBESTATUS = "En Proceso";
    private static final String DESCRIP = "Creación de solicitud de servicio";
        
    public ServicioPortabilidadPSManagementBean() {
    }
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<DetalleSolicitudServicio> obtenerSolicitudesPortabilidad(String rowID) {
        List<DetalleSolicitudServicio> solicitudes;
        ServicioSolicituServicio sss = new ServicioSolicituServicio();
        solicitudes = sss.consultarSolicitudServicios(rowID, AREASS, SUBAREASS);
        return solicitudes;
    }
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public String solicitarPortabilidad(PortabilidadBean datosPortabilidad){
        LogServicios.println(this,"Solicitando portabilidad...");
        String respuesta = "";
        GestionarssportabilidadEp gestionarssportabilidadEp = new GestionarssportabilidadEp();
        GestionarSSPortabilidad gestionarSSPortabilidad = gestionarssportabilidadEp.getGestionarSSPortabilidadPt();
        
        GestionarSSPortabilidadResponseEBMType response = new GestionarSSPortabilidadResponseEBMType();
        
        //MM/DD/AAAA y HH:MM:SS 
        String patternFecha = "dd/MM/yyyy";
        SimpleDateFormat sf = new SimpleDateFormat(patternFecha);
        String fechaActual = sf.format(new Date());
        String fVigNip= datosPortabilidad.getVigenciaNip();
        
        Date auxDate = new Date();
        Date actualDate = new Date();
        try {
            auxDate = sf.parse(fVigNip);
        } catch (ParseException pe) {
            LogServicios.println(this,"error deconversion fecha");
            LogServicios.printlnError(pe);
        }
        SimpleDateFormat sf2 = new SimpleDateFormat("MM/dd/yyyy");
        String auxFechaVig = sf2.format(auxDate);
        fechaActual =sf2.format(actualDate);
        
        auxFechaVig = auxFechaVig + " 23:59:59";
        
        GestionarSSPortabilidadRequestEBMType payload= new GestionarSSPortabilidadRequestEBMType();
        EBMHeaderRequestType ebmHeaderReq = new EBMHeaderRequestType();
        ServiceInfoRequestType serviceInfoReq = new ServiceInfoRequestType();
        try{
        //datos para el payload
        serviceInfoReq.setAssetNumber(datosPortabilidad.getAssetNumber());
        serviceInfoReq.setCURP(datosPortabilidad.getCurp());
        serviceInfoReq.setCuenta(datosPortabilidad.getCuenta());
        serviceInfoReq.setFechaPortabilidad(fechaActual);
        serviceInfoReq.setIMEI(datosPortabilidad.getImei());
        serviceInfoReq.setNipConfirmation(datosPortabilidad.getNipConfirmation());
        serviceInfoReq.setNumeroPortar(datosPortabilidad.getNumeroPortar());
        serviceInfoReq.setOperadorDonante(datosPortabilidad.getOperadorDonante());
        serviceInfoReq.setOrigen(SISTEMA);
        serviceInfoReq.setRegion(datosPortabilidad.getRegion());
        serviceInfoReq.setVigenciaNip(auxFechaVig);
        serviceInfoReq.setDescripcion(DESCRIP);
        serviceInfoReq.setEstatus(ESTATUS);
        serviceInfoReq.setSubestatus(SUBESTATUS);
        
            LogServicios.println(this,"Datos para la portabilidad");
            LogServicios.println(this,"AsetN: "+serviceInfoReq.getAssetNumber());
            LogServicios.println(this,"cuenta: "+serviceInfoReq.getCuenta());
            LogServicios.println(this,"numero a portar: "+serviceInfoReq.getNumeroPortar());
            //header
            ebmHeaderReq.setOperacion(OPERACION);
            ebmHeaderReq.setSistemaOrigen("SEL");
            
            payload.setEBMHeaderRequest(ebmHeaderReq);
            
            payload.setServiceInfoRequest(serviceInfoReq);
        
            response = gestionarSSPortabilidad.gestionarSSPortabilidad(payload);
            
            if (response != null && !response.getEBMHeaderResponse().getErrorNegocio().getCodigoError().equalsIgnoreCase("0")) {
                LogServicios.printlnWarn(this, response.getEBMHeaderResponse().getErrorNegocio().getDescripcionError());
                LogServicios.println(this,"Error de la solicitud portabilidad:"+response.getEBMHeaderResponse().getErrorNegocio().getDescripcionError());
            }else if (response != null && response.getEBMHeaderResponse().getErrorNegocio().getCodigoError()!=null){
                respuesta = response.getEBMHeaderResponse().getErrorNegocio().getCodigoError();
                if(response.getServiceInfoResponse()!=null)
                    LogServicios.println(this,"NumeroSS: "+response.getServiceInfoResponse().getNumeroSS());
                
                LogServicios.println(this,"descripccion de la solicitud portabilidad:"+response.getEBMHeaderResponse().getErrorNegocio().getDescripcionError());
            }
        } catch (Exception e) {
            LogServicios.println(this, "Error en la solicitud de portabilidad");
            LogServicios.printlnError(e);
        }
        
        return respuesta;
    }
    public List<Companias> obtenerOperadoresDonantes(){
        LogServicios.println(this,"obteniendo compañias...");
        List<Companias> companiasList = new ArrayList<Companias>();
        
        try{
            ConsultaroperadororigenClientEp consultaroperadororigenClientEp = new ConsultaroperadororigenClientEp();
            ConsultarOperadorOrigen consultarOperadorOrigen =
                consultaroperadororigenClientEp.getConsultarOperadorOrigenPt();
        // Configure credentials
                String user = "000000000000000";
                String password = "manager1";
                
                
        ConsultarOperadorOrigenRequestEBMType payload= new ConsultarOperadorOrigenRequestEBMType();        
        ConsultarOperadorOrigenResponseEBMType response = new ConsultarOperadorOrigenResponseEBMType();
        //seguridad ssl
        SeguridadItemType itemsSecurity = new SeguridadItemType();
        SeguridadListType segList = new SeguridadListType();
        
        itemsSecurity.setPassword(password);
        itemsSecurity.setUsername(user);
        itemsSecurity.setSistemaAAutenticar("SEL");
        
        segList.getSeguridadItem().add(itemsSecurity);
        //header
        EBMHeaderRequestType ebmHeaderRequest = new EBMHeaderRequestType();
        ebmHeaderRequest.setOperacion("ConsultarOperador");
        ebmHeaderRequest.setSistemaOrigen("SEL");
        
        ebmHeaderRequest.setSeguridadList(segList);

        payload.setEBMHeaderRequest(ebmHeaderRequest);           
            LogServicios.println(this,"Invocando wsdl consultaroperadororigen_client_ep...");
        response = consultarOperadorOrigen.consultarOperadorOrigen(payload);
        
        if (response != null && response.getEBMHeaderResponse().getErrorNegocio().getCodigoError().equalsIgnoreCase("0")) {
            
            OperadorListType operadores  = response.getOperadores();
            List<OperadorType>  operadoresList= operadores.getOperador();
            
            LogServicios.println(this,"Total de operadores obtenidos: "+operadoresList.size());
            for(OperadorType oper : operadoresList){
                Companias comp= new Companias();
                comp.setNombre(oper.getNombre());
                companiasList.add(comp);
            }
    }
        }catch (Exception e) {
        LogServicios.printlnError(e);
    }
        return companiasList;
}
                                                             }
