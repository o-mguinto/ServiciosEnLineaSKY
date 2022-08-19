package mx.com.sky.sel.services.controlremoto;

import java.io.Serializable;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.sky.sel.services.beans.controlremoto.ControlRemotoBean;
import mx.com.sky.sel.services.beans.controlremoto.DireccionCR;
import mx.com.sky.sel.services.beans.controlremoto.Region;
import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.solicitudservicio.ServicioSolicituServicio;
import mx.com.sky.sel.services.ti.SerivcioTarjetaInteligente;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacr.ConsultaControlRemoto;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacr.types.ConsultaControlRemotoProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacr.types.ConsultaControlRemotoProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacr.ConsultaControlRemoto_Service;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacrdirecciones.ConsultaControlRemotoDirecciones;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacrdirecciones.types.ConsultaControlRemotoDireccionesProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacrdirecciones.types.ConsultaControlRemotoDireccionesProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacrdirecciones.ConsultaControlRemotoDirecciones_Service;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacrregiones.ConsultaControlRemotoRegiones;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacrregiones.types.ConsultaControlRemotoRegionesProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacrregiones.types.ConsultaControlRemotoRegionesProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacrregiones.ConsultaControlRemotoRegiones_Service;

@Stateless(name = "ServicioControlRemotoPSManagement", mappedName = "SEL-ServicioControlRemotoPSManagement")
public class ServicioControlRemotoPSManagementBean implements Serializable, ServicioControlRemotoPSManagement,
                                                              ServicioControlRemotoPSManagementLocal {
    @SuppressWarnings("compatibility:2556505867802797740")
    private static final long serialVersionUID = 9159394888271546454L;
    @Resource
    SessionContext sessionContext;

    public ServicioControlRemotoPSManagementBean() {
    }
        @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Region> consultarRegiones(String organizationId) {
        List<Region> regiones = new ArrayList<Region>();
        Region region = null;
        ConsultaControlRemotoRegiones_Service consultaControlRemotoRegiones_Service;
        ConsultaControlRemotoRegiones consultaControlRemotoRegiones = null;
        ConsultaControlRemotoRegionesProcessRequest payload;
        ConsultaControlRemotoRegionesProcessResponse response;
        try {
            consultaControlRemotoRegiones_Service = new ConsultaControlRemotoRegiones_Service();
            consultaControlRemotoRegiones = consultaControlRemotoRegiones_Service.getConsultaControlRemotoRegiones();

            payload = new ConsultaControlRemotoRegionesProcessRequest();
            payload.setOrganizationId(organizationId);
            response = consultaControlRemotoRegiones.process(payload);

            if (response != null) {
                for (mx.com.sky.sel.proxyclients.pagwebconsultas.consultacrregiones.types.Region regionWS : response.getListaRegiones().getRegion()) {
                    region = convert(regionWS);
                    regiones.add(region);
                }
            }
        } catch (Exception e) {
            LogServicios.printlnError(e);
        }

        return regiones;
    }
        @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<DireccionCR> consultarDirecciones(String regionID) {
        List<DireccionCR> direcciones = new ArrayList<DireccionCR>();
        DireccionCR direccion = null;
        ConsultaControlRemotoDirecciones_Service consultaControlRemotoDirecciones_Service;
        ConsultaControlRemotoDirecciones consultaControlRemotoDirecciones = null;
        ConsultaControlRemotoDireccionesProcessRequest payload;
        ConsultaControlRemotoDireccionesProcessResponse response = null;
        try {
            consultaControlRemotoDirecciones_Service = new ConsultaControlRemotoDirecciones_Service();
            consultaControlRemotoDirecciones = consultaControlRemotoDirecciones_Service.getConsultaControlRemotoDirecciones();

            payload = new ConsultaControlRemotoDireccionesProcessRequest();
            payload.setIdRegion(regionID);
            response = consultaControlRemotoDirecciones.process(payload);

            if (response != null) {
                for (mx.com.sky.sel.proxyclients.pagwebconsultas.consultacrdirecciones.types.Direccion direccionWS : response.getListaDirecciones().getDireccion()) {
                    direccion = convert(direccionWS);
                    direcciones.add(direccion);
                }
            }
        } catch (Exception e) {
            LogServicios.printlnError(e);
        }
        return direcciones;
    }
        @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<ControlRemotoBean> obtenerControlRemoto(String organizationID, String tipoCuenta, boolean equipoHD, String rowID) {
        LogServicios.println(this, "Obteneiendo Controles remoto...");
        List<ControlRemotoBean> controles = null;
        ControlRemotoBean control = null;
        List<String> modeloIRD = null;
        controles = new ArrayList<ControlRemotoBean>();

        ConsultaControlRemoto_Service consultaControlRemoto_Service;
        ConsultaControlRemoto consultaControlRemoto = null;
        ConsultaControlRemotoProcessRequest payload;
        ConsultaControlRemotoProcessResponse resultado;
        SerivcioTarjetaInteligente sti = new SerivcioTarjetaInteligente();
        try {
            modeloIRD = sti.getIRDConcatenado(rowID);
            consultaControlRemoto_Service = new ConsultaControlRemoto_Service();
            consultaControlRemoto = consultaControlRemoto_Service.getConsultaControlRemoto();

            payload = new ConsultaControlRemotoProcessRequest();
            payload.setPais(organizationID);
            payload.setTipoCuenta(tipoCuenta);
            payload.setHDFlag(equipoHD ? "Y" : "N");
            resultado = consultaControlRemoto.process(payload);

            if (resultado != null) {
                for (mx.com.sky.sel.proxyclients.pagwebconsultas.consultacr.types.ControlRemoto controlRemoto :
                     resultado.getListaControlRemoto().getControlRemoto()) {
                    for (String mIRD : modeloIRD) {
                        control = convertControlRemoto(controlRemoto);
                        if (controlRemoto.getTIPOEQUIPO().contains(mIRD)) {
                            if (!controles.contains(control)) {
                                controles.add(control);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }


        return controles;
    }
    
        @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID) {
        List<DetalleSolicitudServicio> solicitudes;
        ServicioSolicituServicio sss = new ServicioSolicituServicio();
        solicitudes = sss.consultarSolicitudServicios(rowID, "Tramites", "Control Remoto");
        return solicitudes;
    }
    
        @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public String crearSolicitud(SolicitudServicioBean solicitudServicio) throws ServicioException {
        ServicioSolicituServicio sss = new ServicioSolicituServicio();
        //Codigo para contratar canal
        String respuesta = "";

        solicitudServicio.setArea("Tramites");
        solicitudServicio.setSubArea("Control Remoto");

        respuesta = sss.crearSolicitud(solicitudServicio);
        return respuesta;
    }

    private ControlRemotoBean convertControlRemoto(mx.com.sky.sel.proxyclients.pagwebconsultas.consultacr.types.ControlRemoto controlRemoto) {
        ControlRemotoBean control = new ControlRemotoBean();

        control.setDescripcion(controlRemoto.getDescripcion());
        control.setPathIcon(controlRemoto.getImagen());
        control.setProducto(controlRemoto.getProducto());
        control.setManual(controlRemoto.getManual());
        control.setPrecioDisplay(controlRemoto.getPrecio());
        control.setEtiquetaProducto(controlRemoto.getProducto());

        return control;
    }


    private Region convert(mx.com.sky.sel.proxyclients.pagwebconsultas.consultacrregiones.types.Region regionWS) {
        Region region = new Region();
        region.setIdRegion(regionWS.getIdRegion());
        region.setNombre(regionWS.getNombre());
        return region;
    }

    private DireccionCR convert(mx.com.sky.sel.proxyclients.pagwebconsultas.consultacrdirecciones.types.Direccion direccionWS) {
        DireccionCR direccion = new DireccionCR();

        direccion.setCodigoPostal(direccionWS.getCodigoPostal());
        direccion.setDireccion(direccionWS.getDireccion());
        direccion.setFax(direccionWS.getFax());
        direccion.setHorario(direccionWS.getHorario());
        direccion.setIdDireccion(direccionWS.getIdDireccion());
        direccion.setIdRegion(direccionWS.getIdRegion());
        direccion.setNombre(direccionWS.getNombre());
        direccion.setNotas(direccionWS.getNotas());
        direccion.setPoblacion(direccionWS.getPoblacion());
        direccion.setTelefono(direccionWS.getTelefono());
        direccion.setTipo(direccionWS.getTipo());
        direccion.setZona(direccionWS.getZona());

        return direccion;
    }
    }
