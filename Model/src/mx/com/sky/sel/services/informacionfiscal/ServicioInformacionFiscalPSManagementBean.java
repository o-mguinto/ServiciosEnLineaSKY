package mx.com.sky.sel.services.informacionfiscal;

import com.oracle.xmlns.consultas.pwconsultainformacionfiscal.consultainformacionfiscal.CabeceraEntradaInformacionFiscal;
import com.oracle.xmlns.consultas.pwconsultainformacionfiscal.consultainformacionfiscal.Proceso;
import com.oracle.xmlns.consultas.pwconsultainformacionfiscal.consultainformacionfiscal.RespuestaProceso;
import com.oracle.xmlns.pcbpel.adapter.db.dbconsultarinformacionfiscal.DBConsultarInformacionFiscalInputType;
import com.oracle.xmlns.pcbpel.adapter.db.dbconsultarinformacionfiscal.DBConsultarInformacionFiscalOutputType;
import com.oracle.xmlns.pcbpel.adapter.db.dbconsultarusocfdi.DBConsultarUsoCFDIOutputType;
import com.oracle.xmlns.pcbpel.adapter.db.dbunificadoregimenfiscal.DBUnificadoregimenfiscalOutputType;

import java.util.Collections;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import mx.com.sky.enterpriseflowmessage.sel.actualizardatosfiscales.ActualizarDatosFiscalesRequestType;
import mx.com.sky.enterpriseflowmessage.sel.actualizardatosfiscales.ActualizarDatosFiscalesResponseType;
import mx.com.sky.enterpriseflowmessage.sel.registrardatosfiscales.RegistrarDatosFiscalesRequestType;
import mx.com.sky.enterpriseflowmessage.sel.registrardatosfiscales.RegistrarDatosFiscalesResponseType;
import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;
import mx.com.sky.enterpriseobjects.sel.consultarinformacionfiscal.ConsultarInformacionFiscalRequestType;
import mx.com.sky.enterpriseobjects.sel.consultarinformacionfiscal.ConsultarInformacionFiscalResponseType;
import mx.com.sky.enterpriseobjects.sel.consultarregimenfiscal.ConsultarRegimenFiscalRequestType;
import mx.com.sky.enterpriseobjects.sel.consultarregimenfiscal.ConsultarRegimenFiscalResponseType;
import mx.com.sky.enterpriseobjects.sel.consultarusocfdi.ConsultarUsoCFDIRequestType;
import mx.com.sky.enterpriseobjects.sel.consultarusocfdi.ConsultarUsoCFDIResponseType;
import mx.com.sky.sel.services.beans.informacionfiscal.DatosFiscales;
import mx.com.sky.sel.services.beans.informacionfiscal.RegimenFiscalBean;
import mx.com.sky.sel.services.beans.informacionfiscal.UsoCFDIBean;
import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.solicitudservicio.ServicioSolicituServicio;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultainformacionfiscal.ConsultaInformacionFiscal;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultainformacionfiscal.types.ConsultaInformacionFiscalProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultainformacionfiscal.types.ConsultaInformacionFiscalProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultainformacionfiscal.ConsultaInformacionFiscal_Service;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultainfofiscalvigente.ConsultaInformacionFiscalVigente;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultainfofiscalvigente.types.ConsultaInformacionFiscalVigenteProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultainfofiscalvigente.types.ConsultaInformacionFiscalVigenteProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultainfofiscalvigente.ConsultaInformacionFiscalVigente_Service;
import mx.com.sky.sel.proxyclients.pwconsultas.pwconsultainformacionfiscal.ConsultainformacionfiscalClientEp;
import mx.com.sky.sel.proxyclients.selebf.actualizardatosfiscalesselebf.ActualizarDatosFiscalesSelEBF;
import mx.com.sky.sel.proxyclients.selebf.actualizardatosfiscalesselebf.ActualizarDatosFiscalesSelEBFEp;
import mx.com.sky.sel.proxyclients.selebf.registrardatosfiscalesselebf.RegistrarDatosFiscalesSelEBF;
import mx.com.sky.sel.proxyclients.selebf.registrardatosfiscalesselebf.RegistrarDatosFiscalesSelEBFEp;
import mx.com.sky.sel.proxyclients.selinterface.consultarinformacionfiscalselinterface.ConsultarInformacionFiscal;
import mx.com.sky.sel.proxyclients.selinterface.consultarinformacionfiscalselinterface.ConsultarInformacionFiscalEp;
import mx.com.sky.sel.proxyclients.selinterface.consultarregimenfiscalselinterface.ConsultarRegimenFiscal;
import mx.com.sky.sel.proxyclients.selinterface.consultarregimenfiscalselinterface.ConsultarRegimenFiscalEp;
import mx.com.sky.sel.proxyclients.selinterface.consultarusocfdiselinterface.ConsultarUsoCFDI;
import mx.com.sky.sel.proxyclients.selinterface.consultarusocfdiselinterface.ConsultarUsoCFDIEp;
import mx.com.sky.sel.services.beans.utils.Direccion;

@Stateless(name = "ServicioInformacionFiscalPSManagement", mappedName = "SEL-ServicioInformacionFiscalPSManagement")
public class ServicioInformacionFiscalPSManagementBean implements Serializable, ServicioInformacionFiscalPSManagement,
                                                                  ServicioInformacionFiscalPSManagementLocal {
    @SuppressWarnings("compatibility:7813143360193817614")
    private static final long serialVersionUID = 3283986698151277584L;
    
    private static final String SISTEMA_ORIGEN = "SEL_SKY";
    private static final String ORIGEN = "Web";
    private static final String PROCESO = "DatosFiscales";
    private static final String OPERACION_CONSULTAR_REGIMENES_FISCALES = "ConsultarRegimenFiscal";
    private static final String OPERACION_CONSULTAR_USOS_CFDI = "ConsultarUsoCFDI";
    private static final String OPERACION_CONSULTAR_INFORMACION_FISCAL = "ConsultarInformacionFiscal";
    private static final String OPERACION_REGISTRAR_DATOS_FISCALES = "AltaDatosFiscales";
    private static final String OPERACION_ACTUALIZAR_DATOS_FISCALES = "ActualizaDatosFiscales";
    
    @Resource
    SessionContext sessionContext;

    public ServicioInformacionFiscalPSManagementBean() {
        LogServicios.println(this, "DCInformacionFiscal Creado");
    }
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public DatosFiscales getDatosFiscalesDeprecated(String rowID) {
        /*se tiene que registrar la operacion CONSULTA_INFO_FISCAL en BAM cuando se invoque este método*/
        DatosFiscales datos = null;
        ConsultaInformacionFiscalVigenteProcessResponse resultado = null;
        ConsultaInformacionFiscalVigenteProcessRequest payload;
        ConsultaInformacionFiscalVigenteProcessResponse.InformacionFiscalVigente informacionFiscal = null;
        ConsultaInformacionFiscalVigente_Service consultaInformacionFiscalVigente_Service;
        ConsultaInformacionFiscalVigente consultaInformacionFiscalVigente = null;

        try {


            consultaInformacionFiscalVigente_Service = new ConsultaInformacionFiscalVigente_Service();
            consultaInformacionFiscalVigente = consultaInformacionFiscalVigente_Service.getConsultaInformacionFiscalVigente();

            payload = new ConsultaInformacionFiscalVigenteProcessRequest();
            payload.setRowId(rowID);
            resultado = consultaInformacionFiscalVigente.process(payload);

            if (resultado != null) {
                informacionFiscal = resultado.getInformacionFiscalVigente();
                datos = convertInformacionFiscal(informacionFiscal);
            }

        } catch (Exception e) {
            LogServicios.printlnError(e);
        }
        return datos;
    }
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public DatosFiscales getDatosFiscales(String cuentaSKY) {
        DatosFiscales datosFiscalesConsultados = null;
        ConsultainformacionfiscalClientEp consultainformacionfiscalClientEp = new ConsultainformacionfiscalClientEp();
        mx.com.sky.sel.proxyclients.pwconsultas.pwconsultainformacionfiscal.ConsultaInformacionFiscal consultaInformacionFiscal =
            consultainformacionfiscalClientEp.getConsultaInformacionFiscalPt();
        RespuestaProceso responseWS = null;
        Proceso payload = null;
        CabeceraEntradaInformacionFiscal header = null;
        
        if( cuentaSKY != null && !cuentaSKY.isEmpty() ) {
            payload = new Proceso();
            header = new CabeceraEntradaInformacionFiscal();
            header.setAplicativo(SISTEMA_ORIGEN);
            header.setOperacion(OPERACION_CONSULTAR_INFORMACION_FISCAL);
            
            payload.setNumeroCuenta(cuentaSKY);
            payload.setCabeceraEntrada(header);
            
            responseWS = consultaInformacionFiscal.process(payload);
            
            if( responseWS != null && responseWS.getCabeceraSalida() != null &&
                responseWS.getCabeceraSalida().getCodigoError() != null &&
                responseWS.getCabeceraSalida().getCodigoError().equalsIgnoreCase("0") &&
                responseWS.getDatosInformacionFiscal() != null ) {
                
                datosFiscalesConsultados = new DatosFiscales();
                
                datosFiscalesConsultados.setRazonSocial(responseWS.getDatosInformacionFiscal().getRazonSocial() != null ? responseWS.getDatosInformacionFiscal().getRazonSocial() : "");
                datosFiscalesConsultados.setRfc(responseWS.getDatosInformacionFiscal().getRfc() != null ? responseWS.getDatosInformacionFiscal().getRfc() : "");
                datosFiscalesConsultados.setTipoFactura(responseWS.getDatosInformacionFiscal().getTipoFactura() != null ? responseWS.getDatosInformacionFiscal().getTipoFactura() : "");
                //Descomentar las siguientes 3 lineas cuando el servicio ya regrese los parametros tipoPersona, regimenFiscal y usoCFDI
                datosFiscalesConsultados.setTipoPersona(responseWS.getDatosInformacionFiscal().getTipopersona() != null ? responseWS.getDatosInformacionFiscal().getTipopersona().trim() : "");
                datosFiscalesConsultados.setRegimenFiscal(responseWS.getDatosInformacionFiscal().getRegimenfiscal() != null ? responseWS.getDatosInformacionFiscal().getRegimenfiscal().trim() : "");
                datosFiscalesConsultados.setUsoCFDI(responseWS.getDatosInformacionFiscal().getUsocfdi() != null ? responseWS.getDatosInformacionFiscal().getUsocfdi().trim() : "");
                datosFiscalesConsultados.getDireccion().setCalleNumero(responseWS.getDatosInformacionFiscal().getCalleFiscal() != null ? responseWS.getDatosInformacionFiscal().getCalleFiscal() : "");
                datosFiscalesConsultados.getDireccion().setColonia(responseWS.getDatosInformacionFiscal().getColoniaFiscal() != null ? responseWS.getDatosInformacionFiscal().getColoniaFiscal() : "");
                datosFiscalesConsultados.getDireccion().setCp(responseWS.getDatosInformacionFiscal().getCpFiscal() != null ? responseWS.getDatosInformacionFiscal().getCpFiscal() : "");
                datosFiscalesConsultados.getDireccion().setDelMun(responseWS.getDatosInformacionFiscal().getDelMunFiscal() != null ? responseWS.getDatosInformacionFiscal().getDelMunFiscal() : "");
                datosFiscalesConsultados.getDireccion().setEstado(responseWS.getDatosInformacionFiscal().getEstadoFiscal() != null ? responseWS.getDatosInformacionFiscal().getEstadoFiscal() : "");
                datosFiscalesConsultados.getDireccion().setCiudad(responseWS.getDatosInformacionFiscal().getCuidadFiscal() != null ? responseWS.getDatosInformacionFiscal().getCuidadFiscal() : "");
                datosFiscalesConsultados.getDireccion().setPoblacion(responseWS.getDatosInformacionFiscal().getCuidadFiscal() != null ? responseWS.getDatosInformacionFiscal().getCuidadFiscal() : "");
                datosFiscalesConsultados.getDireccion().setNumeroInt(responseWS.getDatosInformacionFiscal().getNumeroIntFiscal() != null ? responseWS.getDatosInformacionFiscal().getNumeroIntFiscal() : "");
                datosFiscalesConsultados.getDireccion().setNumeroExt(responseWS.getDatosInformacionFiscal().getNumeroExtFiscal() != null ? responseWS.getDatosInformacionFiscal().getNumeroExtFiscal() : "");
            } else if( responseWS != null && responseWS.getCabeceraSalida() != null &&
                       responseWS.getCabeceraSalida().getDescripcionError() != null ) {
                
                LogServicios.printlnError(this, "Error al consultar al WS pwconsultainformacionfiscal...");
                LogServicios.printlnError(this, "DescripcionError from WS: " + responseWS.getCabeceraSalida().getDescripcionError());
                
            }
        }
        
        
        return datosFiscalesConsultados;
    }
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID) {
        List<DetalleSolicitudServicio> solicitudes = null;
        DetalleSolicitudServicio detalleSolicitud = null;
        ConsultaInformacionFiscal_Service consultaInformacionFiscal_Service = null;
        ConsultaInformacionFiscal consultaInformacionFiscal = null;
        ConsultaInformacionFiscalProcessRequest payload = null;
        ConsultaInformacionFiscalProcessResponse resultado = null;

        try {
            solicitudes = new ArrayList<DetalleSolicitudServicio>();

            consultaInformacionFiscal_Service = new ConsultaInformacionFiscal_Service();
            consultaInformacionFiscal = consultaInformacionFiscal_Service.getConsultaInformacionFiscal();


            payload = new ConsultaInformacionFiscalProcessRequest();
            payload.setRowId(rowID);
            resultado = consultaInformacionFiscal.process(payload);
            if (resultado != null) {
                for (ConsultaInformacionFiscalProcessResponse.InformacionFiscal dsds : resultado.getInformacionFiscal()) {
                    detalleSolicitud = convertDetalleSolicitud(dsds);
                    solicitudes.add(detalleSolicitud);
                }
            }

        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }
        return solicitudes;
    }
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<DatosFiscales> obtenerHistoricoDatosFiscales(String rowID) {
        List<DatosFiscales> solicitudes = null;
        DatosFiscales detalleSolicitud = null;
        ConsultaInformacionFiscal_Service consultaInformacionFiscal_Service = null;
        ConsultaInformacionFiscal consultaInformacionFiscal = null;
        ConsultaInformacionFiscalProcessRequest payload = null;
        ConsultaInformacionFiscalProcessResponse resultado = null;

        try {
            solicitudes = new ArrayList<DatosFiscales>();

            consultaInformacionFiscal_Service = new ConsultaInformacionFiscal_Service();
            consultaInformacionFiscal = consultaInformacionFiscal_Service.getConsultaInformacionFiscal();


            payload = new ConsultaInformacionFiscalProcessRequest();
            payload.setRowId(rowID);
            resultado = consultaInformacionFiscal.process(payload);

            if (resultado != null) {
                for (ConsultaInformacionFiscalProcessResponse.InformacionFiscal dsds : resultado.getInformacionFiscal()) {
                    detalleSolicitud = convertDetalleSolicitudInfoFiscal(dsds);
                    solicitudes.add(detalleSolicitud);
                }
            }

        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }
        return solicitudes;
    }


    private DetalleSolicitudServicio convertDetalleSolicitud(ConsultaInformacionFiscalProcessResponse.InformacionFiscal infoFiscal) {
        DetalleSolicitudServicio detalleSolicitud = new DetalleSolicitudServicio();
        DatosFiscales detalleSolicitudDF = new DatosFiscales();

        detalleSolicitudDF.getDireccion().setCalleNumero(infoFiscal.getCalleFiscal());
        detalleSolicitudDF.getDireccion().setColonia(infoFiscal.getColoniaFiscal());
        detalleSolicitudDF.getDireccion().setCp(infoFiscal.getCPFiscal());
        detalleSolicitudDF.getDireccion().setDelMun(infoFiscal.getDelMunFiscal());
        detalleSolicitudDF.getDireccion().setEstado(infoFiscal.getEstadoFiscal());
        detalleSolicitudDF.getDireccion().setNumeroInt(infoFiscal.getNumeroIntFiscal());
        detalleSolicitudDF.getDireccion().setNumeroExt(infoFiscal.getNumeroExtFiscal());

        detalleSolicitud.setApellidoDeContrato(infoFiscal.getRFC() + " " + detalleSolicitudDF.getDireccion().getDireccion());
        detalleSolicitud.setArea(infoFiscal.getDetalleSolicitudDeServicio().getArea());
        detalleSolicitud.setComentario(infoFiscal.getDetalleSolicitudDeServicio().getComentario());
        detalleSolicitud.setFechaCreacion(infoFiscal.getDetalleSolicitudDeServicio().getFechaCreacion());
        detalleSolicitud.setNumeroSolicitud(infoFiscal.getDetalleSolicitudDeServicio().getNumeroDeSolicitud());
        detalleSolicitud.setSubAarea(infoFiscal.getDetalleSolicitudDeServicio().getSubAarea());

        return detalleSolicitud;
    }

    private DatosFiscales convertDetalleSolicitudInfoFiscal(ConsultaInformacionFiscalProcessResponse.InformacionFiscal infoFiscal) {
        DatosFiscales detalleSolicitud = new DatosFiscales();


        detalleSolicitud.setMetodoEnvio(infoFiscal.getMetodoEnvio());
        detalleSolicitud.setRazonSocial(infoFiscal.getRazonSocial());
        detalleSolicitud.setRfc(infoFiscal.getRFC());
        detalleSolicitud.setTipoFactura(infoFiscal.getTipoFactura());
        detalleSolicitud.getDireccion().setCalleNumero(infoFiscal.getCalleFiscal());
        detalleSolicitud.getDireccion().setColonia(infoFiscal.getColoniaFiscal());
        detalleSolicitud.getDireccion().setCp(infoFiscal.getCPFiscal());
        detalleSolicitud.getDireccion().setDelMun(infoFiscal.getDelMunFiscal());
        detalleSolicitud.getDireccion().setEstado(infoFiscal.getEstadoFiscal());
        detalleSolicitud.getDireccion().setNumeroInt(infoFiscal.getNumeroIntFiscal());
        detalleSolicitud.getDireccion().setNumeroExt(infoFiscal.getNumeroExtFiscal());

        detalleSolicitud.setContacto(detalleSolicitud.getDireccion().getDireccion());
        return detalleSolicitud;
    }
     
    private DatosFiscales convertInformacionFiscal(ConsultaInformacionFiscalVigenteProcessResponse.InformacionFiscalVigente informacionFiscal) {
        DatosFiscales datos = new DatosFiscales();


        if (informacionFiscal.getApellidoContacto() != null) {
            datos.setContacto(informacionFiscal.getApellidoContacto());
        }
        if (informacionFiscal.getEMailContacto() != null) {
            datos.setEmail(informacionFiscal.getEMailContacto());
        }
        if (informacionFiscal.getMetodoEnvio() != null) {
            datos.setMetodoEnvio(informacionFiscal.getMetodoEnvio());

        }
        if (informacionFiscal.getRazonSocial() != null) {
            datos.setRazonSocial(informacionFiscal.getRazonSocial());
        }
        if (informacionFiscal.getRFC() != null) {
            datos.setRfc(informacionFiscal.getRFC());
        }
        if (informacionFiscal.getTipoFactura() != null) {
            datos.setTipoFactura(informacionFiscal.getTipoFactura());
        }
        //REAL
//        if (informacionFiscal.getTipoPersona() != null) {
//            datos.setTipoPersona(informacionFiscal.getTipoPersona());
//        }
        //REAL
        //REAL
//        if (informacionFiscal.getRegimenFiscal() != null) {
//            datos.setRegimenFiscal(informacionFiscal.getRegimenFiscal());
//        }
        //REAL
        //REAL
//        if (informacionFiscal.getUsoCFDI() != null) {
//            datos.setUsoCFDI(informacionFiscal.getUsoCFDI());
//        }
        //REAL
        //DUMMY
        //datos.setTipoPersona("Fisica");
        //datos.setRegimenFiscal("608");
        //datos.setUsoCFDI("D07");
        //DUMMY
        if (informacionFiscal.getCalleFiscal() != null) {
            datos.getDireccion().setCalleNumero(informacionFiscal.getCalleFiscal());
        }
        if (informacionFiscal.getColoniaFiscal() != null) {
            datos.getDireccion().setColonia(informacionFiscal.getColoniaFiscal());
        }
        if (informacionFiscal.getCPFiscal() != null) {
            datos.getDireccion().setCp(informacionFiscal.getCPFiscal());
        }
        if (informacionFiscal.getDelMunFiscal() != null) {
            datos.getDireccion().setDelMun(informacionFiscal.getDelMunFiscal());
        }
        if (informacionFiscal.getEstadoFiscal() != null) {
            datos.getDireccion().setEstado(informacionFiscal.getEstadoFiscal());
        }
        if (informacionFiscal.getCiudadFiscal() != null) {
            datos.getDireccion().setCiudad(informacionFiscal.getCiudadFiscal());
        }
        if (informacionFiscal.getCiudadFiscal() != null) {
            datos.getDireccion().setPoblacion(informacionFiscal.getCiudadFiscal());
        }
        if (informacionFiscal.getNumeroIntFiscal() != null) {
            datos.getDireccion().setNumeroInt(informacionFiscal.getNumeroIntFiscal());
        }
        if (informacionFiscal.getNumeroExtFiscal() != null) {
            datos.getDireccion().setNumeroExt(informacionFiscal.getNumeroExtFiscal());
        }
        if (informacionFiscal.getApellidoContacto() != null) {
            datos.setContacto(informacionFiscal.getApellidoContacto());
        }

        return datos;
    }
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public String crearSolicitud(SolicitudServicioBean solicitudServicio) throws ServicioException {
        ServicioSolicituServicio sss = new ServicioSolicituServicio();
        //Codigo para contratar canal
        String respuesta = "";

        solicitudServicio.setArea("Facturacion");
        solicitudServicio.setSubArea("Alta de Facturacion");

        respuesta = sss.crearSolicitud(solicitudServicio);
        return respuesta;
    }
    
    /*El metodo crearSolicitud para Corporativos ya no se agregó en la v 12c
     * Se tendrá que agregar la operacion crearSolicitudInfoFiscal del datacontrol DCCorporativos
     * al binding de la página que se requiera ejecutar la operación e implementase asi en la clase
     * BackingBean java*/
    @Override
    public List<RegimenFiscalBean> consultarRegimenesFiscales(String tipoPersona) {
        List<RegimenFiscalBean> regimenesFiscales = new ArrayList<RegimenFiscalBean>();
        RegimenFiscalBean regimenFiscalBean = null;
        
        ConsultarRegimenFiscalEp consultarRegimenFiscalEp = new ConsultarRegimenFiscalEp();
        ConsultarRegimenFiscal consultarRegimenFiscal = consultarRegimenFiscalEp.getConsultarRegimenFiscalPt();
        ConsultarRegimenFiscalResponseType responseWS = null;
        ConsultarRegimenFiscalRequestType payload = null;
        EBMHeaderRequestType header = null;
        
        if( tipoPersona != null && !tipoPersona.isEmpty() ) {
            header = new EBMHeaderRequestType();
            header.setSistemaOrigen(SISTEMA_ORIGEN);
            header.setOperacion(OPERACION_CONSULTAR_REGIMENES_FISCALES);
            
            payload = new ConsultarRegimenFiscalRequestType();
            payload.setEBMHeaderRequest(header);
            payload.setTipoPersona(tipoPersona);
            
            //llamar al WS con el parametro tipo persona
            responseWS = consultarRegimenFiscal.process(payload);
            
            if( responseWS != null && responseWS.getDBUnificadoregimenfiscalOutputCollection() != null &&
                responseWS.getDBUnificadoregimenfiscalOutputCollection().getDBUnificadoregimenfiscalOutput() != null &&
                !responseWS.getDBUnificadoregimenfiscalOutputCollection().getDBUnificadoregimenfiscalOutput().isEmpty() ) {
                
                for(DBUnificadoregimenfiscalOutputType regimenFiscalWS : responseWS.getDBUnificadoregimenfiscalOutputCollection().getDBUnificadoregimenfiscalOutput()) {
                    regimenFiscalBean = new RegimenFiscalBean();
                    regimenFiscalBean.setIdRegFiscal(regimenFiscalWS.getRegimenFiscal().toString());
                    regimenFiscalBean.setDescripcion(regimenFiscalWS.getDescripcion());
                    regimenesFiscales.add(regimenFiscalBean);
                }
                
            }
            //DUMMY
            //regimenesFiscales = crearRegimenesFiscalesDummy(tipoPersona);
            //DUMMY
        }
        
        return regimenesFiscales;
    }
    
    private List<RegimenFiscalBean> crearRegimenesFiscalesDummy(String tipoPersona) {
        List<RegimenFiscalBean> regFiscalesList = new ArrayList<RegimenFiscalBean>();
        RegimenFiscalBean regFiscalTmp = null;
        
        if( tipoPersona != null && !tipoPersona.isEmpty() ) {
            if( tipoPersona.equalsIgnoreCase("Fisica") ) {
                regFiscalTmp = new RegimenFiscalBean();
                regFiscalTmp.setIdRegFiscal("605");
                regFiscalTmp.setDescripcion("Sueldos y Salarios e Ingresos Asimilados a Salarios");
                regFiscalesList.add(regFiscalTmp);
                
                regFiscalTmp = new RegimenFiscalBean();
                regFiscalTmp.setIdRegFiscal("606");
                regFiscalTmp.setDescripcion("Arrendamiento");
                regFiscalesList.add(regFiscalTmp);
                
                regFiscalTmp = new RegimenFiscalBean();
                regFiscalTmp.setIdRegFiscal("607");
                regFiscalTmp.setDescripcion("Régimen de Enajenación o Adquisición de Bienes");
                regFiscalesList.add(regFiscalTmp);
                
                regFiscalTmp = new RegimenFiscalBean();
                regFiscalTmp.setIdRegFiscal("608");
                regFiscalTmp.setDescripcion("Demás ingresos");
                regFiscalesList.add(regFiscalTmp);
                
                regFiscalTmp = new RegimenFiscalBean();
                regFiscalTmp.setIdRegFiscal("611");
                regFiscalTmp.setDescripcion("Ingresos por Dividendos (socios y accionistas)");
                regFiscalesList.add(regFiscalTmp);
            } else if( tipoPersona.equalsIgnoreCase("Moral") ) {
                regFiscalTmp = new RegimenFiscalBean();
                regFiscalTmp.setIdRegFiscal("601");
                regFiscalTmp.setDescripcion("General de Ley Personas Morales");
                regFiscalesList.add(regFiscalTmp);
                
                regFiscalTmp = new RegimenFiscalBean();
                regFiscalTmp.setIdRegFiscal("603");
                regFiscalTmp.setDescripcion("Personas Morales con Fines no Lucrativos");
                regFiscalesList.add(regFiscalTmp);
                
                regFiscalTmp = new RegimenFiscalBean();
                regFiscalTmp.setIdRegFiscal("622");
                regFiscalTmp.setDescripcion("Actividades Agrícolas, Ganaderas, Silvícolas y Pesqueras");
                regFiscalesList.add(regFiscalTmp);
                
                regFiscalTmp = new RegimenFiscalBean();
                regFiscalTmp.setIdRegFiscal("623");
                regFiscalTmp.setDescripcion("Opcional para Grupos de Sociedades");
                regFiscalesList.add(regFiscalTmp);
                
                regFiscalTmp = new RegimenFiscalBean();
                regFiscalTmp.setIdRegFiscal("624");
                regFiscalTmp.setDescripcion("Coordinados");
                regFiscalesList.add(regFiscalTmp);
            }
        }
        
        return regFiscalesList;
    }


    @Override
    public List<UsoCFDIBean> consultarUsosCFDI() {
        List<UsoCFDIBean> usosCFDIBeans = new ArrayList<UsoCFDIBean>();
        UsoCFDIBean usoCFDIBean = null;
        
        ConsultarUsoCFDIEp consultarUsoCFDIEp = new ConsultarUsoCFDIEp();
        ConsultarUsoCFDI consultarUsoCFDI = consultarUsoCFDIEp.getConsultarUsoCFDIPt();
        ConsultarUsoCFDIResponseType responseWS = null;
        ConsultarUsoCFDIRequestType payload = null;
        EBMHeaderRequestType header = null;
        
        header = new EBMHeaderRequestType();
        header.setOperacion(OPERACION_CONSULTAR_USOS_CFDI);
        header.setSistemaOrigen(SISTEMA_ORIGEN);
        
        payload = new ConsultarUsoCFDIRequestType();
        payload.setEBMHeaderRequest(header);
        //payload.setTipoPersona(tipoPersona);
        //payload.setRegimenFiscal(regimenFiscal);
        
        //Llamar al WS con los parametros tipoPersona y regimenFiscal
        responseWS = consultarUsoCFDI.consultarUsoCFDI(payload);
        
        if( responseWS != null && responseWS.getEBMHeaderResponse() != null &&
            responseWS.getEBMHeaderResponse().getErrorNegocio() != null &&
            responseWS.getEBMHeaderResponse().getErrorNegocio().getCodigoError() != null &&
            responseWS.getEBMHeaderResponse().getErrorNegocio().getCodigoError().equalsIgnoreCase("0") &&
            responseWS.getDBConsultarUsoCFDIOutputCollection() != null &&
            responseWS.getDBConsultarUsoCFDIOutputCollection().getDBConsultarUsoCFDIOutput() != null &&
            !responseWS.getDBConsultarUsoCFDIOutputCollection().getDBConsultarUsoCFDIOutput().isEmpty() ) {
            
            for(DBConsultarUsoCFDIOutputType usoCFDIWS : responseWS.getDBConsultarUsoCFDIOutputCollection().getDBConsultarUsoCFDIOutput() ) {
                usoCFDIBean = new UsoCFDIBean();
                usoCFDIBean.setIdUsoCFDI(usoCFDIWS.getCFDI());
                usoCFDIBean.setDescripcion(usoCFDIWS.getDESCRIPCION());
                usosCFDIBeans.add(usoCFDIBean);
            }
            
        }
        
        //DUMMY
        //usosCFDIBeans = crearUsosCFDIDummy(tipoPersona, regimenFiscal);
        //DUMMY
        
        return usosCFDIBeans;
    }

    private List<UsoCFDIBean> crearUsosCFDIDummy(String tipoPersona, String regimenFiscal) {
        List<UsoCFDIBean> usosCFDIBeansDummy = new ArrayList<UsoCFDIBean>();
        UsoCFDIBean usoCFDITemp = null;
        
        if( tipoPersona != null && !tipoPersona.isEmpty() && regimenFiscal != null && !regimenFiscal.isEmpty() ) {
            if( tipoPersona.equalsIgnoreCase("Fisica") ) {
                if( regimenFiscal.equalsIgnoreCase("605") ) {
                    usoCFDITemp = new UsoCFDIBean();
                    usoCFDITemp.setIdUsoCFDI("D01");
                    usoCFDITemp.setDescripcion("Honorarios médicos, dentales y gastos hospitalarios.");
                    usosCFDIBeansDummy.add(usoCFDITemp);
                    
                    usoCFDITemp = new UsoCFDIBean();
                    usoCFDITemp.setIdUsoCFDI("D02");
                    usoCFDITemp.setDescripcion("Gastos médicos por incapacidad o discapacidad.");
                    usosCFDIBeansDummy.add(usoCFDITemp);
                }
                if( regimenFiscal.equalsIgnoreCase("606") ) {
                    usoCFDITemp = new UsoCFDIBean();
                    usoCFDITemp.setIdUsoCFDI("D03");
                    usoCFDITemp.setDescripcion("Gastos funerales.");
                    usosCFDIBeansDummy.add(usoCFDITemp);
                }
                if( regimenFiscal.equalsIgnoreCase("607") ) {
                    usoCFDITemp = new UsoCFDIBean();
                    usoCFDITemp.setIdUsoCFDI("D04");
                    usoCFDITemp.setDescripcion("Donativos.");
                    usosCFDIBeansDummy.add(usoCFDITemp);
                    
                    usoCFDITemp = new UsoCFDIBean();
                    usoCFDITemp.setIdUsoCFDI("D05");
                    usoCFDITemp.setDescripcion("Intereses reales efectivamente pagados por créditos hipotecarios (casa habitación).");
                    usosCFDIBeansDummy.add(usoCFDITemp);
                    
                    usoCFDITemp = new UsoCFDIBean();
                    usoCFDITemp.setIdUsoCFDI("D06");
                    usoCFDITemp.setDescripcion("Aportaciones voluntarias al SAR.");
                    usosCFDIBeansDummy.add(usoCFDITemp);
                }
                if( regimenFiscal.equalsIgnoreCase("608") ) {
                    usoCFDITemp = new UsoCFDIBean();
                    usoCFDITemp.setIdUsoCFDI("D07");
                    usoCFDITemp.setDescripcion("Primas por seguros de gastos médicos.");
                    usosCFDIBeansDummy.add(usoCFDITemp);
                }
                if( regimenFiscal.equalsIgnoreCase("611") ) {
                    usoCFDITemp = new UsoCFDIBean();
                    usoCFDITemp.setIdUsoCFDI("D08");
                    usoCFDITemp.setDescripcion("Gastos de transportación escolar obligatoria.");
                    usosCFDIBeansDummy.add(usoCFDITemp);
                    
                    usoCFDITemp = new UsoCFDIBean();
                    usoCFDITemp.setIdUsoCFDI("D09");
                    usoCFDITemp.setDescripcion("Depositos en cuentas para el ahorro, primas que tengan como base planes de pensiones.");
                    usosCFDIBeansDummy.add(usoCFDITemp);
                }
            }
            
            
            
            if( tipoPersona.equalsIgnoreCase("Moral") ) {
                if( regimenFiscal.equalsIgnoreCase("601") ) {
                    usoCFDITemp = new UsoCFDIBean();
                    usoCFDITemp.setIdUsoCFDI("G01");
                    usoCFDITemp.setDescripcion("Adquisición de mercancias.");
                    usosCFDIBeansDummy.add(usoCFDITemp);
                }
                if( regimenFiscal.equalsIgnoreCase("603") ) {
                    usoCFDITemp = new UsoCFDIBean();
                    usoCFDITemp.setIdUsoCFDI("G02");
                    usoCFDITemp.setDescripcion("Devolución, descuentos o bonificaciones.");
                    usosCFDIBeansDummy.add(usoCFDITemp);
                }
                if( regimenFiscal.equalsIgnoreCase("622") ) {
                    usoCFDITemp = new UsoCFDIBean();
                    usoCFDITemp.setIdUsoCFDI("G03");
                    usoCFDITemp.setDescripcion("Gastos en general");
                    usosCFDIBeansDummy.add(usoCFDITemp);
                }
                if( regimenFiscal.equalsIgnoreCase("623") ) {
                    usoCFDITemp = new UsoCFDIBean();
                    usoCFDITemp.setIdUsoCFDI("I01");
                    usoCFDITemp.setDescripcion("Construcciones");
                    usosCFDIBeansDummy.add(usoCFDITemp);
                    
                    usoCFDITemp = new UsoCFDIBean();
                    usoCFDITemp.setIdUsoCFDI("I02");
                    usoCFDITemp.setDescripcion("Mobiliario y equipo de oficina por inversores.");
                    usosCFDIBeansDummy.add(usoCFDITemp);
                }
                if( regimenFiscal.equalsIgnoreCase("624") ) {
                    usoCFDITemp = new UsoCFDIBean();
                    usoCFDITemp.setIdUsoCFDI("I03");
                    usoCFDITemp.setDescripcion("Equipo de transporte");
                    usosCFDIBeansDummy.add(usoCFDITemp);
                    
                    usoCFDITemp = new UsoCFDIBean();
                    usoCFDITemp.setIdUsoCFDI("I04");
                    usoCFDITemp.setDescripcion("Equipo de computo y accesorios");
                    usosCFDIBeansDummy.add(usoCFDITemp);
                    
                    usoCFDITemp = new UsoCFDIBean();
                    usoCFDITemp.setIdUsoCFDI("I05");
                    usoCFDITemp.setDescripcion("Dados, troqueles, moldes, matrices y herramental");
                    usosCFDIBeansDummy.add(usoCFDITemp);
                }
            }
        }
        
        return usosCFDIBeansDummy;
    }

    @Override
    public String registrarDatosFiscales(SolicitudServicioBean datosFiscales) throws ServicioException {
        String ssNumber = null;
        
        RegistrarDatosFiscalesSelEBFEp registrarDatosFiscalesSelEBFEp = new RegistrarDatosFiscalesSelEBFEp();
        RegistrarDatosFiscalesSelEBF registrarDatosFiscalesSelEBF =
            registrarDatosFiscalesSelEBFEp.getRegistrarDatosFiscalesSelEBFPt();
        RegistrarDatosFiscalesResponseType responseWS = null;
        RegistrarDatosFiscalesRequestType payload = null;
        EBMHeaderRequestType header = null;
        mx.com.sky.enterpriseobjects.sel.registrardatosfiscales.RegistrarDatosFiscalesRequestType request = null;
        
        if( datosFiscales != null ) {
            payload = new RegistrarDatosFiscalesRequestType();
            
            header = new EBMHeaderRequestType();
            header.setSistemaOrigen(ORIGEN);
            header.setOperacion(OPERACION_REGISTRAR_DATOS_FISCALES);
            
            request = new mx.com.sky.enterpriseobjects.sel.registrardatosfiscales.RegistrarDatosFiscalesRequestType();
            request.setCuenta(datosFiscales.getCuenta());
            request.setDescripcion(datosFiscales.getDescripcion());
            request.setMetodoEnvio(datosFiscales.getDatosFiscales().getMetodoEnvio());
            request.setTipoFactura(datosFiscales.getDatosFiscales().getTipoFactura());
            request.setRazonSocial(datosFiscales.getDatosFiscales().getRazonSocial());
            request.setCalle(datosFiscales.getDireccion().getCalleNumero().toUpperCase());
            request.setColonia(datosFiscales.getDireccion().getColonia().toUpperCase());
            request.setMunicipio(datosFiscales.getDireccion().getDelMun().toUpperCase());
            request.setCiudad(datosFiscales.getDireccion().getPoblacion().toUpperCase());
            request.setCodigoPostal(datosFiscales.getDireccion().getCp());
            request.setEstado(datosFiscales.getDireccion().getEstado().toUpperCase());
            request.setNombre(datosFiscales.getNombreSuscriptor().toUpperCase());
            request.setNumeroExterior(datosFiscales.getDireccion().getNumeroExt());
            request.setNumeroInterior(datosFiscales.getDireccion().getNumeroInt());
            request.setRFC(datosFiscales.getDatosFiscales().getRfc().toUpperCase());
            request.setProceso(PROCESO);
            request.setOrigen(ORIGEN);
            request.setTipoPersona(datosFiscales.getDatosFiscales().getTipoPersona().toUpperCase());
            request.setRegimenFiscal(datosFiscales.getDatosFiscales().getRegimenFiscal().toUpperCase());
            request.setUsoCFDI(datosFiscales.getDatosFiscales().getUsoCFDI().toUpperCase());
            request.setSistemaOrigen(SISTEMA_ORIGEN);
            //TODO solicitudDeServicio Se va a definir si este valor se debe o no enviar
            
            payload.setEBMHeaderRequest(header);
            payload.setRegistrarDatosFiscalesRequest(request);
            
            responseWS = registrarDatosFiscalesSelEBF.registrarDatosFiscalesSelEBF(payload);
            
            if( responseWS != null && responseWS.getEBMHeaderResponse() != null &&
                responseWS.getEBMHeaderResponse().getErrorNegocio() != null ) {
                
                if( responseWS.getEBMHeaderResponse().getErrorNegocio().getCodigoError() != null &&
                    responseWS.getEBMHeaderResponse().getErrorNegocio().getCodigoError().equalsIgnoreCase("0") &&
                    responseWS.getRegistrarDatosFiscalesResponse() != null &&
                    responseWS.getRegistrarDatosFiscalesResponse().getSRNumber() != null &&
                    !responseWS.getRegistrarDatosFiscalesResponse().getSRNumber().isEmpty() ) {
                    
                    ssNumber = responseWS.getRegistrarDatosFiscalesResponse().getSRNumber();
                    
                } else if( responseWS.getEBMHeaderResponse().getErrorNegocio().getDescripcionError() != null ) {
                    throw new ServicioException("Error en el WS registrarDatosFiscalesSelEBFEp, descripcion de error: " +
                                                responseWS.getEBMHeaderResponse().getErrorNegocio().getDescripcionError());
                } else {
                    throw new ServicioException("Error en el WS registrarDatosFiscalesSelEBFEp, sin descripcion de error");
                }
                
                
            } else {
                throw new ServicioException("Error general en el WS registrarDatosFiscalesSelEBFEp");
            }
            
        }
        
        return ssNumber;
    }

    @Override
    public String actualizarDatosFiscales(SolicitudServicioBean datosFiscales) throws ServicioException {
        String ssNumber = null;
        
        ActualizarDatosFiscalesSelEBFEp actualizarDatosFiscalesSelEBFEp = new ActualizarDatosFiscalesSelEBFEp();
        ActualizarDatosFiscalesSelEBF actualizarDatosFiscalesSelEBF =
            actualizarDatosFiscalesSelEBFEp.getActualizarDatosFiscalesSelEBFPt();
        
        ActualizarDatosFiscalesResponseType responseWS = null;
        ActualizarDatosFiscalesRequestType payload = null;
        EBMHeaderRequestType header = null;
        mx.com.sky.enterpriseobjects.sel.actualizardatosfiscales.ActualizarDatosFiscalesRequestType request = null;
        
        if( datosFiscales != null ) {
            payload = new ActualizarDatosFiscalesRequestType();
            
            header = new EBMHeaderRequestType();
            header.setSistemaOrigen(ORIGEN);
            header.setOperacion(OPERACION_ACTUALIZAR_DATOS_FISCALES);
            
            request = new mx.com.sky.enterpriseobjects.sel.actualizardatosfiscales.ActualizarDatosFiscalesRequestType();
            request.setCuenta(datosFiscales.getCuenta());
            request.setDescripcion(datosFiscales.getDescripcion());
            request.setMetodoEnvio(datosFiscales.getDatosFiscales().getMetodoEnvio());
            request.setTipoFactura(datosFiscales.getDatosFiscales().getTipoFactura());
            request.setRazonSocial(datosFiscales.getDatosFiscales().getRazonSocial());
            request.setCalle(datosFiscales.getDireccion().getCalleNumero().toUpperCase());
            request.setColonia(datosFiscales.getDireccion().getColonia().toUpperCase());
            request.setMunicipio(datosFiscales.getDireccion().getDelMun().toUpperCase());
            request.setCiudad(datosFiscales.getDireccion().getPoblacion().toUpperCase());
            request.setCodigoPostal(datosFiscales.getDireccion().getCp());
            request.setEstado(datosFiscales.getDireccion().getEstado().toUpperCase());
            request.setNombre(datosFiscales.getNombreSuscriptor().toUpperCase());
            request.setNumeroExterior(datosFiscales.getDireccion().getNumeroExt());
            request.setNumeroInterior(datosFiscales.getDireccion().getNumeroInt());
            request.setRFC(datosFiscales.getDatosFiscales().getRfc().toUpperCase());
            request.setProceso(PROCESO);
            request.setOrigen(ORIGEN);
            request.setTipoPersona(datosFiscales.getDatosFiscales().getTipoPersona().toUpperCase());
            request.setRegimenFiscal(datosFiscales.getDatosFiscales().getRegimenFiscal().toUpperCase());
            request.setUsoCFDI(datosFiscales.getDatosFiscales().getUsoCFDI().toUpperCase());
            request.setSistemaOrigen(SISTEMA_ORIGEN);
            //TODO solicitudDeServicio Se va a definir si este valor se debe o no enviar
            
            payload.setEBMHeaderRequest(header);
            payload.setActualizarDatosFiscalesRequest(request);
            
            responseWS = actualizarDatosFiscalesSelEBF.actualizarDatosFiscalesSelEBF(payload);
            
            
            if( responseWS != null && responseWS.getEBMHeaderResponse() != null &&
                responseWS.getEBMHeaderResponse().getErrorNegocio() != null ) {
                
                if( responseWS.getEBMHeaderResponse().getErrorNegocio().getCodigoError() != null &&
                    responseWS.getEBMHeaderResponse().getErrorNegocio().getCodigoError().equalsIgnoreCase("0") &&
                    responseWS.getActualizarDatosFiscalesResponse() != null &&
                    responseWS.getActualizarDatosFiscalesResponse().getSRNumber() != null &&
                    !responseWS.getActualizarDatosFiscalesResponse().getSRNumber().isEmpty() ) {
                    
                    ssNumber = responseWS.getActualizarDatosFiscalesResponse().getSRNumber();
                    
                } else if( responseWS.getEBMHeaderResponse().getErrorNegocio().getDescripcionError() != null ) {
                    throw new ServicioException("Error en el WS actualizarDatosFiscalesSelEBFEp, descripcion de error: " +
                                                responseWS.getEBMHeaderResponse().getErrorNegocio().getDescripcionError());
                } else {
                    throw new ServicioException("Error en el WS actualizarDatosFiscalesSelEBFEp, sin descripcion de error");
                }
                
                
            } else {
                throw new ServicioException("Error general en el WS actualizarDatosFiscalesSelEBFEp");
            }
        }
        
        
        return ssNumber;
    }

    @Override
    public SolicitudServicioBean consultarDatosFiscales(String cuentaSKY) {
        SolicitudServicioBean informacionFiscal = null;
        DatosFiscales informacionFiscalDatosFis = null;
        Direccion informacionFiscalDireccion = null;
        
        ConsultarInformacionFiscalEp consultarInformacionFiscalEp = new ConsultarInformacionFiscalEp();
        ConsultarInformacionFiscal consultarInformacionFiscal =
            consultarInformacionFiscalEp.getConsultarInformacionFiscalPt();
        ConsultarInformacionFiscalResponseType responseWS = null;
        ConsultarInformacionFiscalRequestType payload = null;
        EBMHeaderRequestType header = null;
        DBConsultarInformacionFiscalInputType request = null;
        
        DBConsultarInformacionFiscalOutputType informacionFiscalWS = null;
        
        if( cuentaSKY != null & !cuentaSKY.isEmpty() ) {
            payload = new ConsultarInformacionFiscalRequestType();
            
            header = new EBMHeaderRequestType();
            header.setOperacion(OPERACION_CONSULTAR_INFORMACION_FISCAL);
            header.setSistemaOrigen(SISTEMA_ORIGEN);
            
            request = new DBConsultarInformacionFiscalInputType();
            request.setCuenta(cuentaSKY);
            
            payload.setEBMHeaderRequest(header);
            payload.setDBConsultarInformacionFiscalInput(request);
            
            responseWS = consultarInformacionFiscal.consultarInformacionFiscal(payload);
            
            if( responseWS != null && responseWS.getEBMHeaderResponse() != null &&
                responseWS.getEBMHeaderResponse().getErrorNegocio() != null &&
                responseWS.getEBMHeaderResponse().getErrorNegocio().getCodigoError() != null &&
                responseWS.getEBMHeaderResponse().getErrorNegocio().getCodigoError().equalsIgnoreCase("0") &&
                responseWS.getDBConsultarInformacionFiscalOutputCollection() != null &&
                responseWS.getDBConsultarInformacionFiscalOutputCollection().getDBConsultarInformacionFiscalOutput() != null &&
                !responseWS.getDBConsultarInformacionFiscalOutputCollection().getDBConsultarInformacionFiscalOutput().isEmpty() ) {
                    
                    informacionFiscalWS = responseWS.getDBConsultarInformacionFiscalOutputCollection().getDBConsultarInformacionFiscalOutput().get(0);
                    if( informacionFiscalWS != null ) {
                        informacionFiscal = new SolicitudServicioBean();
                        informacionFiscal.setCuenta(informacionFiscalWS.getCUENTA());
                        informacionFiscal.setDescripcion(informacionFiscalWS.getDESCRIPCION());
                        informacionFiscal.setNombreSuscriptor(informacionFiscalWS.getNOMBRE());
                        
                        informacionFiscalDatosFis = new DatosFiscales();
                        informacionFiscalDatosFis.setMetodoEnvio(informacionFiscalWS.getMETODOENVIO());
                        informacionFiscalDatosFis.setTipoFactura(informacionFiscalWS.getTIPOFACTURA());
                        informacionFiscalDatosFis.setRazonSocial(informacionFiscalWS.getRAZONSOCIAL());
                        informacionFiscalDatosFis.setRfc(informacionFiscalWS.getRFC());
                        informacionFiscalDatosFis.setTipoPersona(informacionFiscalWS.getTIPOPERSONA());
                        informacionFiscalDatosFis.setRegimenFiscal(informacionFiscalWS.getREGIMENFISCAL());
                        informacionFiscalDatosFis.setUsoCFDI(informacionFiscalWS.getUSOCFDI());
                        informacionFiscal.setDatosFiscales(informacionFiscalDatosFis);
                        
                        informacionFiscalDireccion = new Direccion();
                        informacionFiscalDireccion.setCalleNumero(informacionFiscalWS.getCALLE());
                        informacionFiscalDireccion.setColonia(informacionFiscalWS.getCOLONIA());
                        informacionFiscalDireccion.setDelMun(informacionFiscalWS.getMUNICIPIO());
                        informacionFiscalDireccion.setPoblacion(informacionFiscalWS.getCIUDAD());
                        informacionFiscalDireccion.setCp(informacionFiscalWS.getCODIGOPOSTAL());
                        informacionFiscalDireccion.setEstado(informacionFiscalWS.getESTADO());
                        informacionFiscalDireccion.setNumeroExt(informacionFiscalWS.getNUMEROEXTERIOR());
                        informacionFiscalDireccion.setNumeroInt(informacionFiscalWS.getNUMEROINTERIOR());
                        informacionFiscal.setDireccion(informacionFiscalDireccion);
                    }
                    
                }
        }
        
        return informacionFiscal;
    }
}
