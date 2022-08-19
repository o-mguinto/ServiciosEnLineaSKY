package mx.com.sky.sel.services.promesapago;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import mx.com.sky.sel.proxyclients.pagweb.execpromesapago.types.ExecPromesaDePagoProcessRequest;
import mx.com.sky.sel.proxyclients.pagweb.execpromesapago.ExecPromesaPago;
import mx.com.sky.sel.proxyclients.pagweb.execpromesapago.ExecpromesapagoClientEp;
import mx.com.sky.sel.proxyclients.pagweb.execpromesapago.types.PromesaDePago;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapermiteprompago.ConsultaPermitePromesaDePago;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapermiteprompago.ConsultaPermitePromesaDePago_Service;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapermiteprompago.types.ConsultaPermitePromesaDePagoProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapermiteprompago.types.ConsultaPermitePromesaDePagoProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaprompago.ConsultaPromesaDePago;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaprompago.ConsultaPromesaDePago_Service;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaprompago.types.ConsultaPromesaDePagoProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaprompago.types.ConsultaPromesaDePagoProcessResponse;
import mx.com.sky.sel.services.beans.promesa.pago.PromesaPago;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.utils.JavaUtils;


public class ServicioPromesaPago implements Serializable {
    @SuppressWarnings("compatibility:2446778608022208442")
    private static final long serialVersionUID = 5004402566053067730L;


    public ServicioPromesaPago() {
        super();
    }

    public boolean consultarPermiso(String cuentaSKY) {
        boolean respuesta = false;
        ConsultaPermitePromesaDePago_Service consultaPermitePromesaDePago_Service;
        ConsultaPermitePromesaDePago consultaPermitePromesaDePago = null;
        ConsultaPermitePromesaDePagoProcessRequest payload;
        ConsultaPermitePromesaDePagoProcessResponse response = null;

        try {
            consultaPermitePromesaDePago_Service = new ConsultaPermitePromesaDePago_Service();
            consultaPermitePromesaDePago = consultaPermitePromesaDePago_Service.getConsultaPermitePromesaDePago();
            payload = new ConsultaPermitePromesaDePagoProcessRequest();
            payload.setCuentaSKY(cuentaSKY);
            response = consultaPermitePromesaDePago.process(payload);
            if (response != null) {
                respuesta = response.getPermitePromesaDePago().equalsIgnoreCase("Y");
            }
        } catch (Exception e) {
            LogServicios.printlnError(e);
        }

        return respuesta;
    }

    public String procesaPromesaPago(PromesaPago promesaPago) throws ServicioException {
        String respuesta = "";
        PromesaDePago promesaDePago = null;
        ExecpromesapagoClientEp execPromesaDePago_Service;
        ExecPromesaPago execPromesaDePago = null;
        ExecPromesaDePagoProcessRequest payload;
        String cuentaSKY;
        String userID;
        String cuentaRowID;
        String rowID;
        String tarjetaInteligente;
        String sistema;
        String tipoCuenta;
        try {
            cuentaSKY = promesaPago.getCuentaSKY();
            userID = promesaPago.getUserID();
            cuentaRowID = promesaPago.getCuentaRowID();
            rowID = "";
            tarjetaInteligente = promesaPago.getTarjetaInteligente();
            sistema = promesaPago.getSistema();
            tipoCuenta = promesaPago.getTipoCuenta();

            if (cuentaSKY == null || cuentaSKY.isEmpty()) {
                throw new ServicioException("Ocurri\u00F3 algo inesperado, por favor cierre su sesi\u00F3n e intente m\u00E1s tarde. PP0001");
            }
            if (userID == null || userID.isEmpty()) {
                throw new ServicioException("Ocurri\u00F3 algo inesperado, por favor cierre su sesi\u00F3n e intente m\u00E1s tarde. PP0002");
            }
            if (cuentaRowID == null || cuentaRowID.isEmpty()) {
                throw new ServicioException("Ocurri\u00F3 algo inesperado, por favor cierre su sesi\u00F3n e intente m\u00E1s tarde. PP0003");
            }
            if (tarjetaInteligente == null || tarjetaInteligente.isEmpty()) {
                throw new ServicioException("Ocurri\u00F3 algo inesperado, por favor cierre su sesi\u00F3n e intente m\u00E1s tarde. PP0004");
            }
            if (sistema == null || sistema.isEmpty()) {
                throw new ServicioException("Ocurri\u00F3 algo inesperado, por favor cierre su sesi\u00F3n e intente m\u00E1s tarde. PP0005");
            }
            if (tipoCuenta == null || tipoCuenta.isEmpty()) {
                throw new ServicioException("Ocurri\u00F3 algo inesperado, por favor cierre su sesi\u00F3n e intente m\u00E1s tarde. PP0006");
            }
            execPromesaDePago_Service = new ExecpromesapagoClientEp();
            execPromesaDePago = execPromesaDePago_Service.getExecPromesaPagoPt();
            payload = new ExecPromesaDePagoProcessRequest();
            payload.setCuentaSKY(cuentaSKY);
            payload.setCuentaRowID(cuentaRowID);
            payload.setRowID(rowID);
            payload.setSistema(sistema);
            payload.setTI(tarjetaInteligente);
            payload.setUserID(userID);
            payload.setIntentos(1);
            payload.setPasoBpel(1);
            //Se envia el id Sesion para el registro de Promesa De Pago en DWH y BAM
            payload.setIdSesion(promesaPago.getIdSesion());
            promesaDePago = convert(promesaPago);
            payload.setPromesaDePago(promesaDePago);
            payload.setTipoCuenta(tipoCuenta);
            execPromesaDePago.process(payload);


            respuesta = "OK";
        } catch (ServicioException e) {
            LogServicios.printlnError(e);
            throw e;
        } catch (Exception e) {
            LogServicios.printlnError(e);
            throw new ServicioException("Ocurri\u00F3 algo inesperado, por favor intente m\u00E1s tarde");
        }
        return respuesta;
    }


    public List<PromesaPago> consultarPromesasPago(String cuentaSKY) {
        ConsultaPromesaDePago_Service consultaPromesaDePago_Service;
        ConsultaPromesaDePago consultaPromesaDePago = null;
        ConsultaPromesaDePagoProcessRequest payload;
        ConsultaPromesaDePagoProcessResponse response = null;
        List<PromesaPago> promesas = new ArrayList<PromesaPago>();
        PromesaPago promesaPago = null;

        try {

            consultaPromesaDePago_Service = new ConsultaPromesaDePago_Service();
            consultaPromesaDePago = consultaPromesaDePago_Service.getConsultaPromesaDePago();

            payload = new ConsultaPromesaDePagoProcessRequest();
            payload.setCuentaSKY(cuentaSKY);
            response = consultaPromesaDePago.process(payload);

            if (response != null) {
                for (mx.com.sky.sel.proxyclients.pagwebconsultas.consultaprompago.types.PromesaDePago promesaPagoWS :
                     response.getListaPromesaDePago().getPromesaDePago()) {
                    promesaPago = convert(promesaPagoWS);
                    promesas.add(promesaPago);
                }
            }
        } catch (Exception e) {
            LogServicios.printlnError(e);
        }

        return promesas;
    }

    private PromesaDePago convert(PromesaPago promesa) {
        PromesaDePago promesaDePago = new PromesaDePago();
        //promesaDePago.setEstatus(promesa.getEstatus());
        promesaDePago.setFechaPago(JavaUtils.asXMLGregorianCalendar(promesa.getFechaPago()));
        promesaDePago.setInstitucionPago(promesa.getInstitucionPago());
        promesaDePago.setMonto(promesa.getMonto());
        promesaDePago.setReferencia(promesa.getReferencia());
        return promesaDePago;
    }

    private PromesaPago convert(mx.com.sky.sel.proxyclients.pagwebconsultas.consultaprompago.types.PromesaDePago promesaPagoWS) {
        PromesaPago promesaPago = new PromesaPago();

        promesaPago.setCuentaSKY(promesaPagoWS.getCuentaSKY());
        promesaPago.setEstatus(promesaPagoWS.getEstatus());
        promesaPago.setFechaPago(JavaUtils.asTimestamp(promesaPagoWS.getFechaPago()));
        promesaPago.setFechaRegistro(JavaUtils.asTimestamp(promesaPagoWS.getFechaRegistro()));
        promesaPago.setId(promesaPagoWS.getID().intValue());
        promesaPago.setInstitucionPago(promesaPagoWS.getInstitucionDePago());
        promesaPago.setMonto(promesaPagoWS.getMonto() + "");
        promesaPago.setNoSolicitud(promesaPagoWS.getNoSolicitud());
        promesaPago.setReferencia(promesaPagoWS.getReferencia());
        promesaPago.setUserID(promesaPagoWS.getUserID());
        promesaPago.setDescripcion(promesaPagoWS.getDescripcion());
        return promesaPago;
    }
}
