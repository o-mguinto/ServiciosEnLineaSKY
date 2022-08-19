package mx.com.sky.sel.services.pagos.serviciopagos;

import java.io.Serializable;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.sky.enterpriseflowmessages.sel.gestionarpagocontdc.GestionarPagoConTDCRequestEBMType;
import mx.com.sky.enterpriseflowmessages.sel.gestionarpagocontdc.GestionarPagoConTDCResponseEBMType;
import mx.com.sky.enterpriseflowmessages.sel.gestionarpagocontdcguardada.DatosTransaccionPagoInputMessageType;
import mx.com.sky.enterpriseflowmessages.sel.gestionarpagocontdcguardada.GestionarPagoConTDCGuardadaRequestEBMType;
import mx.com.sky.enterpriseflowmessages.sel.gestionarpagocontdcguardada.GestionarPagoConTDCGuardadaResponseEBMType;
import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;
import mx.com.sky.enterpriseobjects.sel.tarjetapagoebo.DatosTarjetaPagoType;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapagos.ConsultaPagos;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapagos.ConsultaPagos_Service;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapagos.types.ConsultaPagosProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapagos.types.ConsultaPagosProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapagos.types.Pago;
import mx.com.sky.sel.proxyclients.selebf.gestionarpagocontdcguardadaselebf.GestionarPagoConTDCGuardadaSelEBF;
import mx.com.sky.sel.proxyclients.selebf.gestionarpagocontdcguardadaselebf.GestionarPagoConTDCGuardadaSelEBFEp;
import mx.com.sky.sel.proxyclients.selebf.gestionapagonuevatdc.GestionarPagoConTDCSelEBF;
import mx.com.sky.sel.proxyclients.selebf.gestionapagonuevatdc.GestionarPagoConTDCSelEBFEp;
import mx.com.sky.sel.services.beans.pagos.FormatoPago;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.utils.Encriptacion;
import mx.com.sky.sel.utils.JavaUtils;

@Stateless(name = "ServicioPagosPSManagement", mappedName = "SEL-ServicioPagosPSManagement")
public class ServicioPagosPSManagementBean implements Serializable, ServicioPagosPSManagement,
                                                      ServicioPagosPSManagementLocal {
    @SuppressWarnings("compatibility:-5116474906856401255")
    private static final long serialVersionUID = 1021828585137540582L;
    @Resource
    SessionContext sessionContext;

    public ServicioPagosPSManagementBean() {
        LogServicios.println(this, "DCPagos Creado");
    }
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public String procesaPago(FormatoPago fpago) throws ServicioException {
            LogServicios.println(this, "In procesaPago ejb method");
            String ticketNumber;
                try {
          GestionarPagoConTDCGuardadaSelEBFEp gestionarPagoConTDCGuardadaSelEBF_ep = new GestionarPagoConTDCGuardadaSelEBFEp();
          GestionarPagoConTDCGuardadaSelEBF gestionarPagoConTDCGuardadaSelEBF = gestionarPagoConTDCGuardadaSelEBF_ep.getGestionarPagoConTDCGuardadaSelEBFPt();
          GestionarPagoConTDCGuardadaRequestEBMType request = new GestionarPagoConTDCGuardadaRequestEBMType();
          GestionarPagoConTDCGuardadaResponseEBMType response = null;
          EBMHeaderRequestType header = new EBMHeaderRequestType();
          header.setOperacion("GestionarPagoConTDCGuardada");
          header.setSistemaOrigen("SEL");
          request.setEBMHeaderRequest(header);
          DatosTransaccionPagoInputMessageType input = new DatosTransaccionPagoInputMessageType();
          input.setIdTarjetaPago(Integer.toString(fpago.getTarjeta().getId()));
          input.setCvv(fpago.getTarjeta().getCodigo());
          input.setServicio("SKY");
                String patternFecha = "MM/dd/yyyy";
                String patternHora = "HH:mm:ss";
          SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patternFecha);
          SimpleDateFormat simpleHoraFormat = new SimpleDateFormat(patternHora);
          String date = simpleDateFormat.format(new Date());
          String hora = simpleHoraFormat.format(new Date());
          input.setFechaPago(date);
          input.setHoraPago(hora);
          input.setMontoPago(fpago.getMontoString());
          input.setPropositoPago(fpago.getProposito() == null ? "0":fpago.getProposito());
          input.setPais(fpago.getPais());
          input.setToken("Y");
          input.setCodigoMoneda(fpago.getMoneda());
          input.setDescripcion("Pago desde SEL ");
          input.setCuentaSky(fpago.getCuentaSKY());
          input.setOrganizacionId(fpago.getOrganizationID());
          input.setMetodoPago("Tarjeta de Credito");
                    input.setEmailNotificacion(fpago.getEmail());
        input.setKeyId("1");
        input.setPhaseId("1");
          request.setDatosTransaccionPagoIn(input);
          response = gestionarPagoConTDCGuardadaSelEBF.gestionarPagoConTDCGuardada(request);
                if (response != null && response.getEBMHeaderResponse().getErrorNegocio().getEstado().equalsIgnoreCase("ok") &&
                    response.getDatosTransaccionPagoOut().getNumeroSolicitudServicio() != null &&
                    !response.getDatosTransaccionPagoOut().getNumeroSolicitudServicio().equalsIgnoreCase("null") ) {
                    ticketNumber = response.getDatosTransaccionPagoOut().getNumeroSolicitudServicio();
                } else {
                        throw new ServicioException(response.getEBMHeaderResponse().getErrorNegocio().getDescripcionError());
                }

            } catch (ServicioException e) {
                LogServicios.printlnError(e);
                throw e;
            } catch (Exception e) {
                LogServicios.printlnError(e);
                throw new ServicioException("Ocurrió algo inserperado, por favor intenta más tarde");
            }
            return ticketNumber;
        }
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public GestionarPagoConTDCResponseEBMType realizaPagoNuevaTarjetaPs(GestionarPagoConTDCRequestEBMType pago) {
        GestionarPagoConTDCResponseEBMType response = new GestionarPagoConTDCResponseEBMType();
        String encode = "";
        
        try {
            GestionarPagoConTDCSelEBFEp gestionarPagoConTDCSelEBF_Ep = new GestionarPagoConTDCSelEBFEp();
            GestionarPagoConTDCSelEBF gestionarPagoConTDCSel_EBF = gestionarPagoConTDCSelEBF_Ep.getGestionarPagoConTDCSelEBFPt();
            GestionarPagoConTDCRequestEBMType request = new GestionarPagoConTDCRequestEBMType();
            EBMHeaderRequestType header = new EBMHeaderRequestType();
            DatosTarjetaPagoType datosTarjeta =new DatosTarjetaPagoType();
            mx.com.sky.enterpriseflowmessages.sel.gestionarpagocontdc.DatosTransaccionPagoInputMessageType datosTransaccion = new mx.com.sky.enterpriseflowmessages.sel.gestionarpagocontdc.DatosTransaccionPagoInputMessageType();
            datosTarjeta = pago.getDatosTarjetaPago();
            datosTransaccion = pago.getDatosTransaccionPagoIn();
            
            header.setOperacion("GestionarPagoConTDCNueva");
            header.setSistemaOrigen("SEL");
            
            datosTransaccion.setPropositoPago(pago.getDatosTransaccionPagoIn().getPropositoPago() == null ? "0" : pago.getDatosTransaccionPagoIn().getPropositoPago());
            datosTransaccion.setMontoPago(getMontoString(pago.getDatosTransaccionPagoIn().getMontoPago()));
            //MM/DD/AAAA y HH:MM:SS 
            String patternFecha = "MM/dd/yyyy";
            String patternHora = "HH:mm:ss";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patternFecha);
            SimpleDateFormat simpleHoraFormat = new SimpleDateFormat(patternHora);
            String date = simpleDateFormat.format(new Date());
            String hora = simpleHoraFormat.format(new Date());
            datosTransaccion.setFechaPago(date);
            datosTransaccion.setHoraPago(hora);
            
            datosTransaccion.setToken("Y");
            datosTransaccion.setMetodoPago("Tarjeta de Credito");
            
            request.setEBMHeaderRequest(header);
            
            request.setDatosTarjetaPago(datosTarjeta);
            request.setDatosTransaccionPagoIn(datosTransaccion);
            
            response = gestionarPagoConTDCSel_EBF.gestionarPagoConTDC(request);
            
            System.out.println("Response "+response.getEBMHeaderResponse().getErrorNegocio().getCodigoError());

            if (response != null && !response.getEBMHeaderResponse().getErrorNegocio().getEstado().equalsIgnoreCase("ok")) {
                LogServicios.printlnWarn(this, response.getEBMHeaderResponse().getErrorNegocio().getDescripcionError());
            }
        } catch (Exception e) {
            LogServicios.println(this, "Error en el Pago");
            LogServicios.printlnError(e);
        }
        
        return response;
    }

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Pago> obtenerConsultaPagos(String rowID) {
        List<Pago> pagos = new ArrayList<Pago>();
        ConsultaPagos_Service consultaPagos_Service;
        ConsultaPagos consultaPagos = null;
        ConsultaPagosProcessRequest payload;
        ConsultaPagosProcessResponse resultado;
        Pago pago = null;

        try {
            consultaPagos_Service = new ConsultaPagos_Service();
            consultaPagos = consultaPagos_Service.getConsultaPagos();

            payload = new ConsultaPagosProcessRequest();
            payload.setRowId(rowID);
            resultado = consultaPagos.process(payload);

            if (resultado != null) {
                for (mx.com.sky.sel.proxyclients.pagwebconsultas.consultapagos.types.Pago pagoWS :
                     resultado.getListaPagos().getPago()) {
                    pago = convertPago(pagoWS);
                    pagos.add(pago);
                }
            } else {
                LogServicios.println(this, "List<Pagos> null");
            }

        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }
        return pagos;
    }


    private Pago convertPago(mx.com.sky.sel.proxyclients.pagwebconsultas.consultapagos.types.Pago pagoWS) {
        Pago pago = new Pago();

        pago.setFechaPago(pagoWS.getFechaPago());
        pago.setImporte("$ " + JavaUtils.formatMoneda(pagoWS.getImporte()));
        pago.setNoReferencia(pagoWS.getNoReferencia());
        pago.setNoTarjeta(pagoWS.getNoTarjeta());
        pago.setTipoPago(pagoWS.getTipoPago());
        pago.setEstatus(pagoWS.getEstatus());


        return pago;
    }

    private String getMontoString(String monto) {
        String transactionamount = "0.0";
        transactionamount = JavaUtils.asMoneda(monto);
        return transactionamount;
    }
}
