package mx.com.sky.sel.services.modulares;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.sky.sel.services.beans.modulares.Modulo;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.proxyclients.pagweb.admonmodulares.AdmonModulares;
import mx.com.sky.sel.proxyclients.pagweb.admonmodulares.types.AdmonModularesProcessRequest;
import mx.com.sky.sel.proxyclients.pagweb.admonmodulares.types.AdmonModularesProcessResponse;
import mx.com.sky.sel.proxyclients.pagweb.admonmodulares.AdmonModulares_Service;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultamodulos.ConsultaModulos;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultamodulos.types.ConsultaModulosProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultamodulos.types.ConsultaModulosProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultamodulos.ConsultaModulos_Service;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultamodulos.types.ListaModulos;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacambiospenmodulos.ConsultaCambiosPendientesModulos;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacambiospenmodulos.types.ConsultaCambiosPendientesModulosProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacambiospenmodulos.types.ConsultaCambiosPendientesModulosProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacambiospenmodulos.ConsultaCambiosPendientesModulos_Service;

@Stateless(name = "ServicioModulosPSManagement", mappedName = "SEL-ServicioModulosPSManagement")
public class ServicioModulosPSManagementBean implements Serializable, ServicioModulosPSManagement, ServicioModulosPSManagementLocal {
    @SuppressWarnings("compatibility:-2803331201934711924")
    private static final long serialVersionUID = 1469751665379629652L;
    @Resource
    SessionContext sessionContext;

    public ServicioModulosPSManagementBean() {
    }
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public boolean consultarPermiso(String tarjetaInteligente) {
        boolean respuesta = false;
        ConsultaCambiosPendientesModulos_Service consultaCambiosPendientesModulos_Service;
        ConsultaCambiosPendientesModulos consultaCambiosPendientesModulos = null;
        ConsultaCambiosPendientesModulosProcessRequest payload;
        ConsultaCambiosPendientesModulosProcessResponse response = null;
        String resultado = "";
        try {
            consultaCambiosPendientesModulos_Service = new ConsultaCambiosPendientesModulos_Service();
            consultaCambiosPendientesModulos = consultaCambiosPendientesModulos_Service.getConsultaCambiosPendientesModulos();

            payload = new ConsultaCambiosPendientesModulosProcessRequest();
            payload.setTarjetaInteligente(tarjetaInteligente);
            response = consultaCambiosPendientesModulos.process(payload);

            if (response != null) {
                resultado = response.getCambiosPendientes();
                respuesta = resultado.equalsIgnoreCase("N");
            }
        } catch (Exception e) {
            LogServicios.printlnError(e);
        }

        return respuesta;
    }

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Modulo> consultarModulos() {
        List<Modulo> modulos = null;
        modulos = consultarModulos("1", "");
        return modulos;
    }
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Modulo> consultarModulosAsociados(String cuentaSKY) {
        List<Modulo> modulos = null;
        modulos = consultarModulos("2", cuentaSKY);
        return modulos;
    }

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Modulo> consultarModulosNoAsociados(String cuentaSKY) {
        List<Modulo> modulos = null;
        modulos = consultarModulos("3", cuentaSKY);
        return modulos;
    }
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public boolean agregarModulo(Modulo modulo, String cuentaSKY, String tarjetaInteligente) throws ServicioException {
        boolean respuesta = false;
        respuesta = procearOperacion("Agregar", cuentaSKY, tarjetaInteligente, modulo, null);
        return respuesta;
    }
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public boolean cambiarModulo(Modulo moduloNuevo, Modulo moduloActual, String cuentaSKY, String tarjetaInteligente) throws Exception {
        boolean respuesta = false;
        respuesta = procearOperacion("Cambiar", cuentaSKY, tarjetaInteligente, moduloNuevo, moduloActual);
        return respuesta;
    }
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public boolean desconectarModulo(Modulo modulo, String cuentaSKY, String tarjetaInteligente) throws Exception {
        boolean respuesta = false;
        respuesta = procearOperacion("Desconectar", cuentaSKY, tarjetaInteligente, modulo, modulo);
        return respuesta;
    }

    private boolean procearOperacion(String action, String cuentaSKY, String tarjetaInteligente, Modulo moduloNuevo,
                                     Modulo moduloActual) throws ServicioException {
        AdmonModulares_Service admonModulares_Service;
        AdmonModulares admonModulares = null;
        AdmonModularesProcessRequest payload;
        AdmonModularesProcessResponse response;
        Boolean resultado = false;

        try {
            admonModulares_Service = new AdmonModulares_Service();
            admonModulares = admonModulares_Service.getAdmonModulares();

            payload = new AdmonModularesProcessRequest();
            payload.setAction(action);
            payload.setNumCuenta(cuentaSKY);
            payload.setTarjetaInt(tarjetaInteligente);
            if (moduloNuevo != null) {
                payload.setAddModule(moduloNuevo.getNombre());
            }
            if (moduloActual != null) {
                payload.setRemoveModule(moduloActual.getNombre());
            }
            response = admonModulares.process(payload);
            if (response.getRespuesta().equalsIgnoreCase("0")) {
                resultado = true;
            } else {
                resultado = false;
                throw new ServicioException(response.getRespuestadesc());
            }

        } catch (ServicioException e) {
            resultado = false;
            LogServicios.printlnError(e);
            throw e;
        } catch (Exception e) {
            resultado = false;
            LogServicios.printlnError(e);
            throw new ServicioException("Ocurri\u00F3 algo inesperado, por favor intene m\u00E1s tarde");
        }
        return resultado;
    }


    private List<Modulo> consultarModulos(String operacion, String cuentaSKY) {
        List<Modulo> modulos = new ArrayList<Modulo>();
        ConsultaModulos_Service consultaModulos_Service;
        ConsultaModulos consultaModulos = null;
        ConsultaModulosProcessRequest payload;
        ConsultaModulosProcessResponse response = null;
        Modulo modulo = null;

        try {

            consultaModulos_Service = new ConsultaModulos_Service();
            consultaModulos = consultaModulos_Service.getConsultaModulos();

            payload = new ConsultaModulosProcessRequest();
            payload.setCuentaSKY(cuentaSKY);
            payload.setTipoConsulta(operacion);

            response = consultaModulos.process(payload);
            if (response != null && response.getListaModulos() != null) {
                for (ListaModulos.Modulo moduloWS : response.getListaModulos().getModulo()) {
                    modulo = convert(moduloWS);
                    modulos.add(modulo);
                }
            }
        } catch (Exception e) {
            LogServicios.printlnError(e);
        }
        return modulos;
    }

    private Modulo convert(ListaModulos.Modulo moduloWS) {
        Modulo modulo = new Modulo();
        modulo.setNombre(moduloWS.getNombre());

        return modulo;
    }
}
