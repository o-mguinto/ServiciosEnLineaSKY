package mx.com.sky.sel.services.crecimientos;

import com.oracle.xmlns.pcbpel.adapter.db.sp.dbdatoscuentacrececombosec.ObjectFactory;
import com.oracle.xmlns.pcbpel.adapter.db.sp.dbutilsofscprocesssec.InputParameters;

import java.io.Serializable;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.ws.Holder;

import mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsinterface.ConsultarCapacidadFSResponseEBMType;
import mx.com.sky.enterpriseobjects.sec.datoscuentacrececombointerface.DatosCuentaCreceComboRequestEBMType;
import mx.com.sky.enterpriseobjects.sec.datoscuentacrececombointerface.DatosCuentaCreceComboResponseEBMType;
import mx.com.sky.enterpriseobjects.sec.utilsofscprocessinterface.UtilsOfscProcessRequestEBMType;
import mx.com.sky.enterpriseobjects.sec.utilsofscprocessinterface.UtilsOfscProcessResponseEBMType;
import mx.com.sky.enterpriseobjects.sec.validacrecimientosppbtiinterface.ValidaCrecimientosPpBtiRequestEBMType;
import mx.com.sky.enterpriseobjects.sec.validacrecimientosppbtiinterface.ValidaCrecimientosPpBtiResponseEBMType;
import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;
import mx.com.sky.enterpriseservices.soa.crearsolicitudserviciosoainterface.CrearSolicitudServicioSoaInterfaceRequestType;
import mx.com.sky.enterpriseservices.soa.crearsolicitudserviciosoainterface.CrearSolicitudServicioSoaInterfaceResponseType;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.proxyclients.pagweb.calculacrecimientosvetv.CalculaCrecimientosVeTV;
import mx.com.sky.sel.proxyclients.pagweb.calculacrecimientosvetv.CalculacrecimientosVetvClientEp;
import mx.com.sky.sel.proxyclients.pagweb.calculacrecimientosvetv.types.CalculaCrecimientosResponse;
import mx.com.sky.sel.proxyclients.pagweb.insertacrecimientostya.InsertaCrecimientosTYA;
import mx.com.sky.sel.proxyclients.pagweb.insertacrecimientostya.InsertacrecimientosTyaClientEp;
import mx.com.sky.sel.proxyclients.pagweb.insertacrecimientostya.types.InsertaCrecimientosTYAResponse;
import mx.com.sky.sel.proxyclients.pagweb.insertacrecimientosvetv.InsertaCrecimientosVeTV;
import mx.com.sky.sel.proxyclients.pagweb.insertacrecimientosvetv.InsertacrecimientosVetvClientEp;
import mx.com.sky.sel.proxyclients.pagweb.insertacrecimientosvetv.types.InsertaCrecmientosVeTVResponse;
import mx.com.sky.sel.proxyclients.pagweb.validacrecimientostya.ValidaCrecimientosTYA;
import mx.com.sky.sel.proxyclients.pagweb.validacrecimientostya.ValidacrecimientosTyaClientEp;
import mx.com.sky.sel.proxyclients.pagweb.validacrecimientostya.types.ValidaCrecimientosTYAResponse;
import mx.com.sky.sel.proxyclients.pagweb.validacrecimientosvetv.ValidaCrecimientosVeTV;
import mx.com.sky.sel.proxyclients.pagweb.validacrecimientosvetv.ValidacrecmientosVetvClientEp;
import mx.com.sky.sel.proxyclients.pagweb.validacrecimientosvetv.types.ValidaCrecimientosVeTVResponse;
import mx.com.sky.sel.proxyclients.pagweb.ventacrecimientostya.VentaCrecimientosTYA;
import mx.com.sky.sel.proxyclients.pagweb.ventacrecimientostya.VentacrecimientosTyaClientEp;
import mx.com.sky.sel.proxyclients.pagweb.ventacrecimientostya.types.VentaCrecimientosTYAResponse;
import mx.com.sky.sel.proxyclients.secinterface.consultarcapacidadfs.ConsultarCapacidadFSSecInterface;
import mx.com.sky.sel.proxyclients.secinterface.consultarcapacidadfs.ConsultarCapacidadFSSecInterfaceEp;
import mx.com.sky.sel.proxyclients.secinterface.datoscuentacrececombo.DatosCuentaCreceComboSecInterface;
import mx.com.sky.sel.proxyclients.secinterface.datoscuentacrececombo.DatosCuentaCreceComboSecInterfaceEp;
import mx.com.sky.sel.proxyclients.secinterface.utilsscprocess.UtilsOfscProcessSecInterface;
import mx.com.sky.sel.proxyclients.secinterface.utilsscprocess.UtilsOfscProcessSecInterfaceEp;
import mx.com.sky.sel.proxyclients.secinterface.validacrecimientosppbti.ValidaCrecimientosPpBtiSecInterface;
import mx.com.sky.sel.proxyclients.secinterface.validacrecimientosppbti.ValidaCrecimientosPpBtiSecInterfaceEp;
import mx.com.sky.sel.proxyclients.soainterface.crearsolicitudservicio.CrearSolicitudServicioSoaInterface;
import mx.com.sky.sel.proxyclients.soainterface.crearsolicitudservicio.CrearSolicitudServicioSoaInterfaceEp;
import mx.com.sky.siebelosb.creasolicitudservicio.CreaSolicitudServicioEntradaTYPE;

public class ServicioCrecimientoEquipos implements Serializable {
    @SuppressWarnings("compatibility:-1736888341438353078")
    private static final long serialVersionUID = 2953799030159515980L;

    public ServicioCrecimientoEquipos() {
        super();
    }
    
    public ValidaCrecimientosTYAResponse validacrecimientos_tya(String cuentaSKY) {
        ValidaCrecimientosTYAResponse validaCrecimientos_TYAResponse = null;
        
        try{
            ValidacrecimientosTyaClientEp validacrecimientos_tya_client_ep = new ValidacrecimientosTyaClientEp();
            ValidaCrecimientosTYA validaCrecimientos_TYA = validacrecimientos_tya_client_ep.getValidaCrecimientosTYAPt();
            
            Holder<String> valida = new Holder<>();
            Holder<String> estatus= new Holder<>();
            Holder<String> numEquipos = new Holder<>();
            Holder<String> paquete = new Holder<>();
            Holder<String> meses = new Holder<>();
            Holder<String> hmc = new Holder<>();
            Holder<String> codigoError = new Holder<>();
            Holder<String> descError = new Holder<>();
            validaCrecimientos_TYA.validaCrecimientosTYA(cuentaSKY,valida,estatus,numEquipos,paquete,meses,hmc,codigoError,descError);
            validaCrecimientos_TYAResponse = new ValidaCrecimientosTYAResponse();
            validaCrecimientos_TYAResponse.setCodigoError(codigoError.value); 
            validaCrecimientos_TYAResponse.setDescError(descError.value);
            
            validaCrecimientos_TYAResponse.setEstatus(estatus.value);
            validaCrecimientos_TYAResponse.setHmc(hmc.value);
            validaCrecimientos_TYAResponse.setMeses(meses.value);
            validaCrecimientos_TYAResponse.setNumEquipos(numEquipos.value);
            validaCrecimientos_TYAResponse.setPaquete(paquete.value);
            validaCrecimientos_TYAResponse.setValida(valida.value);
            
        }catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }
        
        return validaCrecimientos_TYAResponse;       
    }
    public ValidaCrecimientosPpBtiResponseEBMType consultaValidaCuentaVeTVInternet (String ctaSKY){
    ValidaCrecimientosPpBtiSecInterfaceEp validaCrecimientosPpBtiSecInterface_ep = new ValidaCrecimientosPpBtiSecInterfaceEp();
    ValidaCrecimientosPpBtiSecInterface validaCrecimientosPpBtiSecInterface = validaCrecimientosPpBtiSecInterface_ep.getValidaCrecimientosPpBtiSecInterfacePt();
    ValidaCrecimientosPpBtiRequestEBMType request = new ValidaCrecimientosPpBtiRequestEBMType();
    ValidaCrecimientosPpBtiResponseEBMType response = null;
    mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType header = new mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType();
    com.oracle.xmlns.pcbpel.adapter.db.sp.dbvalidacrecimientosppbtisec.InputParameters input = new com.oracle.xmlns.pcbpel.adapter.db.sp.dbvalidacrecimientosppbtisec.InputParameters();
    header.setOperacion("ValidaCrecimientosPpBti");
    header.setSistemaOrigen("ValidaCrecimientosPpBti");
    request.setEBMHeaderRequest(header);
    com.oracle.xmlns.pcbpel.adapter.db.sp.dbvalidacrecimientosppbtisec.ObjectFactory fact = new com.oracle.xmlns.pcbpel.adapter.db.sp.dbvalidacrecimientosppbtisec.ObjectFactory();   
    JAXBElement<String> cuenta = fact.createInputParametersCUENTA(ctaSKY);  
    input.setCUENTA(cuenta);
    request.setInputParameters(input);
    response = validaCrecimientosPpBtiSecInterface.validaCrecimientosPpBtiSecInterface(request);
      return response;
    }
    public DatosCuentaCreceComboResponseEBMType consultaDatosCuentaCreceCombo (String ctaSKY){
    DatosCuentaCreceComboSecInterfaceEp datosCuentaCreceComboSecInterface_ep = new DatosCuentaCreceComboSecInterfaceEp();
    DatosCuentaCreceComboSecInterface datosCuentaCreceComboSecInterface = datosCuentaCreceComboSecInterface_ep.getDatosCuentaCreceComboSecInterfacePt();
    DatosCuentaCreceComboRequestEBMType request = new DatosCuentaCreceComboRequestEBMType();
    mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType header = new mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType();
    DatosCuentaCreceComboResponseEBMType response= null;
    try {
            header.setOperacion("ConsultaCuentaCreceCombo");
            header.setSistemaOrigen("SEL");
            com.oracle.xmlns.pcbpel.adapter.db.sp.dbdatoscuentacrececombosec.InputParameters parametros = new com.oracle.xmlns.pcbpel.adapter.db.sp.dbdatoscuentacrececombosec.InputParameters();
            request.setEBMHeaderRequest(header);
              ObjectFactory fact = new ObjectFactory();   
              JAXBElement<String> cuenta = fact.createInputParametersVCUENTA(ctaSKY);  
            parametros.setVCUENTA(cuenta);
            request.setInputParameters(parametros);
            response = datosCuentaCreceComboSecInterface.datosCuentaCreceComboSecInterface(request);   
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }
    return response;
    }
    public VentaCrecimientosTYAResponse ventacrecimientos_tya(String cuentaSKY, String sd, String hd, String phd, String fechaAtencion, String horaAtencion, String numEquipos, String hmc) {
        VentaCrecimientosTYAResponse ventaCrecimientosTYAResponse = null;
        
        try{
            VentacrecimientosTyaClientEp ventacrecimientos_tya_client_ep = new VentacrecimientosTyaClientEp();
            VentaCrecimientosTYA ventaCrecimientos_TYA = ventacrecimientos_tya_client_ep.getVentaCrecimientosTYAPt();
            
            Holder<String> ssTransaction = new Holder<>();
            Holder<String> codigoError = new Holder<>();
            Holder<String> descError = new Holder<>();
        

            ventaCrecimientos_TYA.ventaCrecimientosTYA(cuentaSKY,sd,hd,phd,hmc,numEquipos,"SEL","SKYSEL",fechaAtencion,horaAtencion,ssTransaction,codigoError,descError); 
            ventaCrecimientosTYAResponse = new VentaCrecimientosTYAResponse();
            
            ventaCrecimientosTYAResponse.setCodigoError(codigoError.value);
            ventaCrecimientosTYAResponse.setDescError(descError.value);
            ventaCrecimientosTYAResponse.setSsTransaction(ssTransaction.value);
            System.out.println("Respuesta" + ventaCrecimientosTYAResponse.getCodigoError());
        }catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }
          
        return ventaCrecimientosTYAResponse;      
    }
    
    public InsertaCrecimientosTYAResponse insertacrecimientos_tya(String cuentaSKY, String sd, String hd, String phd, String fechaAtencion, String horaAtencion, String creceA, String TotalCrec, String equiposActivos, String paquete, String sr, String mig, String hmc) {
        InsertaCrecimientosTYAResponse insertaCrecimientosTYAResponse = null;
        
        try{
            InsertacrecimientosTyaClientEp insertacrecimientos_tya_client_ep = new InsertacrecimientosTyaClientEp();
            InsertaCrecimientosTYA insertaCrecimientos_TYA = insertacrecimientos_tya_client_ep.getInsertaCrecimientosTYAPt();
            Holder<String> codigoError = new Holder<>();
            Holder<String> descError = new Holder<>();
                        
            insertaCrecimientos_TYA.insertaCrecimientosTYA(cuentaSKY,"SKYSEL","SKYSEL",fechaAtencion,horaAtencion,"SEL",sr,sd,hd,phd,hmc,paquete,creceA,TotalCrec,equiposActivos,mig,codigoError,descError);
             insertaCrecimientosTYAResponse= new InsertaCrecimientosTYAResponse();
            insertaCrecimientosTYAResponse.setCodigoError(codigoError.value);
            insertaCrecimientosTYAResponse.setDescError(descError.value);
            
        }catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }
        
        return insertaCrecimientosTYAResponse;
    }
    
    public ValidaCrecimientosVeTVResponse validacrecimientos_vetv(String cuentaSKY) {        
        ValidaCrecimientosVeTVResponse validaCrecimientosVeTVResponse = null; 
        
        try{
            ValidacrecmientosVetvClientEp validacrecmientos_vetv_client_ep = new  ValidacrecmientosVetvClientEp();
            ValidaCrecimientosVeTV validaCrecimientos_VeTV = validacrecmientos_vetv_client_ep.getValidaCrecimientosVeTVPt();
            
            Holder<BigDecimal> valido = new Holder<>();
            Holder<String> precio = new Holder<>();
            Holder<String> codigoError = new Holder<>();
            Holder<String> descError = new Holder<>();
            
            validaCrecimientos_VeTV.validaCrecimientosVeTV(cuentaSKY,valido,precio,codigoError,descError);
            validaCrecimientosVeTVResponse = new ValidaCrecimientosVeTVResponse();
            validaCrecimientosVeTVResponse.setCodigoError(codigoError.value);
            validaCrecimientosVeTVResponse.setDescError(descError.value);

            validaCrecimientosVeTVResponse.setPrecio(precio.value); 
            validaCrecimientosVeTVResponse.setValido(valido.value);
            
        } catch (Exception e) {
                LogServicios.printlnError(this, e.getMessage(), e);
        }
        
        return validaCrecimientosVeTVResponse;       
    }
    
    public CalculaCrecimientosResponse calculacrecimientos_vetv(String cuenta, String sd, String hd, String phd, String fechaPago, String paquete) {        
       CalculaCrecimientosResponse calculaCrecimientosResponse = null;
        
        try{
            CalculacrecimientosVetvClientEp calculacrecimientos_vetv_client_ep = new CalculacrecimientosVetvClientEp();
            CalculaCrecimientosVeTV calculaCrecimientos_VeTV = calculacrecimientos_vetv_client_ep.getCalculaCrecimientosVeTVPt();
            
            Holder<BigDecimal> precio = new Holder<>();
            Holder<String> codigoError = new Holder<>();
            Holder<String> descError = new Holder<>();

            calculaCrecimientos_VeTV.calculaCrecimientos(cuenta,sd,hd,phd,"",fechaPago,paquete,precio,codigoError,descError);  
            calculaCrecimientosResponse = new CalculaCrecimientosResponse();
            calculaCrecimientosResponse.setCodigoError(codigoError.value);
            calculaCrecimientosResponse.setDescError(descError.value);
            
            calculaCrecimientosResponse.setPrecio(precio.value); //decimal
            
        }catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }
          
        return calculaCrecimientosResponse;       
    }
    
    public InsertaCrecmientosVeTVResponse insertacrecimientos_vetv(String cuentaSKY, String fechaAtencion, String horaAtencion, String precio) {
         InsertaCrecmientosVeTVResponse insertaCrecmientosVeTVResponse = null;
        
        try{
            InsertacrecimientosVetvClientEp insertacrecimientos_vetv_client_ep = new InsertacrecimientosVetvClientEp();
            InsertaCrecimientosVeTV insertaCrecimientos_VeTV = insertacrecimientos_vetv_client_ep.getInsertaCrecimientosVeTVPt();
            Holder<String> sr = new Holder<>();
            Holder<String> codigoError = new Holder<>();
            Holder<String> descError = new Holder<>();

            insertaCrecimientos_VeTV.insertaCrecimientosVeTV(cuentaSKY,"SKYSEL","SKYSEL",fechaAtencion,horaAtencion,"SEL",precio,sr,codigoError,descError);
            insertaCrecmientosVeTVResponse = new InsertaCrecmientosVeTVResponse();
            insertaCrecmientosVeTVResponse.setCodigoError(codigoError.value);
            insertaCrecmientosVeTVResponse.setDescError(descError.value);
            
            insertaCrecmientosVeTVResponse.setSr(sr.value);
                       
        }catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }
        
        return insertaCrecmientosVeTVResponse; 
    } 
    public ConsultarCapacidadFSResponseEBMType consultaCapacidad(String fecha, String codigoPostal, String pais, String tipoActividad){
        ConsultarCapacidadFSSecInterfaceEp consultarCapacidadFSSecInterfaceEp = new ConsultarCapacidadFSSecInterfaceEp();
        ConsultarCapacidadFSSecInterface consultarCapacidadFSSecInterface = consultarCapacidadFSSecInterfaceEp.getConsultarCapacidadFSSecInterfacePt();
        
        ConsultarCapacidadFSResponseEBMType response = null;
        mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType header = new mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType();
        header.setOperacion("Consultar Capacidad");
        header.setSistemaOrigen("SEL");
        
        mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsebo.ConsultarCapacidadFSRequestType typeRequest = new mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsebo.ConsultarCapacidadFSRequestType();
        mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsebo.ConsultarCapacidadFSRequestEBMType requestType = new mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsebo.ConsultarCapacidadFSRequestEBMType();
        mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsinterface.ConsultarCapacidadFSRequestEBMType request = new mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsinterface.ConsultarCapacidadFSRequestEBMType();
        
        typeRequest.setFechas(fecha);
        mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsebo.DistribuidorType distribuidorType = new mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsebo.DistribuidorType();
        //distribuidorType.setDistribuidorId("value");
        typeRequest.setDistribuidor(distribuidorType);
        typeRequest.setCodigoPostal(codigoPostal);
        typeRequest.setClavePais(pais);
        typeRequest.setTipoActividad(tipoActividad);
        typeRequest.setDeterminarAreaPorZonaTrabajo(true);
        typeRequest.setDeterminarCategorias(true);
        typeRequest.setEstimarTiempoViaje(true);
        requestType.setConsultarCapacidadFSRequest(typeRequest);
        
        request.setConsultarCapacidadFSRequestEBM(requestType);
        request.setEBMHeaderRequest(header);
        response = consultarCapacidadFSSecInterface.consultarCapacidadFSSecInterface(request);
       return response; 
    }
    public UtilsOfscProcessResponseEBMType consultaConvivencia(String proceso, String cuenta, String sd, String hd, String phd, String hmc, String numEquipoCuenta, String pais, String tipoCuenta){
        UtilsOfscProcessSecInterfaceEp utilsOfscProcessSecInterface_ep = new UtilsOfscProcessSecInterfaceEp();
        UtilsOfscProcessSecInterface utilsOfscProcessSecInterface = utilsOfscProcessSecInterface_ep.getUtilsOfscProcessSecInterfacePt();
        UtilsOfscProcessRequestEBMType requestType = new UtilsOfscProcessRequestEBMType();
        UtilsOfscProcessResponseEBMType response = null;
        EBMHeaderRequestType header = new EBMHeaderRequestType();
        header.setOperacion("Consulta Convivencia");
        header.setSistemaOrigen("SEL");
        requestType.setEBMHeaderRequest(header);
        InputParameters input = new InputParameters();
        com.oracle.xmlns.pcbpel.adapter.db.sp.dbutilsofscprocesssec.ObjectFactory object = new com.oracle.xmlns.pcbpel.adapter.db.sp.dbutilsofscprocesssec.ObjectFactory();
        JAXBElement<String> procesoTemp = object.createInputParametersPROCESO(proceso);
        input.setPROCESO(procesoTemp);
        JAXBElement<String> cuentaTemp = object.createInputParametersCUENTA(cuenta);
        input.setCUENTA(cuentaTemp);
        JAXBElement<String> sdTemp = object.createInputParametersSD(sd);
        input.setSD(sdTemp);
        JAXBElement<String> hdTemp = object.createInputParametersHD(hd);
        input.setHD(hdTemp);
        JAXBElement<String> phdTemp = object.createInputParametersPHD(phd);
        input.setPHD(phdTemp);
        JAXBElement<String> hmcTemp = object.createInputParametersHMC(hmc);
        input.setHMC(hmcTemp);
        JAXBElement<String> numEquipoTemp = object.createInputParametersNUMEQUIPCTA(numEquipoCuenta);
        input.setNUMEQUIPCTA(numEquipoTemp);
        JAXBElement<String> paisTemp = object.createInputParametersPAIS(pais);
        input.setPAIS(paisTemp);
        JAXBElement<String> tipoCuentaTemp = object.createInputParametersTIPOCTA(tipoCuenta);
        input.setTIPOCTA(tipoCuentaTemp);
        requestType.setInputParameters(input);
        response = utilsOfscProcessSecInterface.utilsOfscProcessSecInterface(requestType);
       return response; 
    }
    public CrearSolicitudServicioSoaInterfaceResponseType crearSolicitudCrecimiento(String cuenta, String grupo, String tipo, String subtipo, String bucket, String dateOFSC, String timeSlotOFSC, String timeFromOFSC, String timeToOFSC, String timeSlotNameOFSC, 
                                            String workSkillOFSC, String codOpeOFSC, String tipoActividadOFSC){
        CrearSolicitudServicioSoaInterfaceEp crearSolicitudServicioSoaInterface_ep = new CrearSolicitudServicioSoaInterfaceEp();
        CrearSolicitudServicioSoaInterface crearSolicitudServicioSoaInterface = crearSolicitudServicioSoaInterface_ep.getCrearSolicitudServicioSoaInterfacePt();
        CrearSolicitudServicioSoaInterfaceRequestType request = new CrearSolicitudServicioSoaInterfaceRequestType();
        CrearSolicitudServicioSoaInterfaceResponseType response = null;
        mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType header = new mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType();
        header.setOperacion("Crear solicitud crecimiento");
        header.setSistemaOrigen("SEL");
        request.setEBMHeaderRequest(header);
        CreaSolicitudServicioEntradaTYPE entrada = new CreaSolicitudServicioEntradaTYPE();
        entrada.setOrigen("Web");
        entrada.setCuenta(cuenta);
        entrada.setGrupo(grupo);
        entrada.setTipo(tipo);
        entrada.setSubtipo(subtipo);
        entrada.setBucket(bucket);
        entrada.setDateOFSC(dateOFSC);
        entrada.setTimeSlotOFSC(timeSlotOFSC);
        entrada.setTimeFromOFSC(timeFromOFSC);
        entrada.setTimeToOFSC(timeToOFSC);
        entrada.setTimeSlotNameOFSC(timeSlotNameOFSC);
        entrada.setWorkSkillOFSC(workSkillOFSC);
        entrada.setCodOpeOFSC(codOpeOFSC);
        entrada.setTipoActividadOFSC(tipoActividadOFSC);
        request.setCreaSolicitudServicioEntrada(entrada);
        response = crearSolicitudServicioSoaInterface.crearSolicitudServicio(request);
        return response;
    }
}
