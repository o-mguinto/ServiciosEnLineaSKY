package mx.com.sky.sel.services.reenviosenal;

import java.io.Serializable;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import javax.xml.ws.WebServiceRef;

import mx.com.sky.sel.services.beans.reenviosenal.ReenvioSenial;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.utils.JavaUtils;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultareenviosenal.ConsultaReenvioSenal;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultareenviosenal.ConsultareenviosenalClientEp;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultareenviosenal.types.ConsultaReenvioSenalBDOutput;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultareenviosenal.types.ResponseType;
import mx.com.sky.sel.proxyclients.pagweb.admonreenviosenal.AdmonReenvioSenal;
import mx.com.sky.sel.proxyclients.pagweb.admonreenviosenal.AdmonreenviosenalClientEp;
import mx.com.sky.sel.proxyclients.pagweb.admonreenviosenal.types.INSERTREENVIOSENALInput;
import mx.com.sky.sel.proxyclients.pagweb.admonreenviosenal.types.ReenvioSenalInType;
import mx.com.sky.sel.proxyclients.pagweb.admonreenviosenal.types.ReenvioSenalOutType;
import mx.com.sky.sel.proxyclients.pagweb.reenviosenal.BPELReenvioSenal;
import mx.com.sky.sel.proxyclients.pagweb.reenviosenal.BpelReenviosenalClientEp;
import mx.com.sky.sel.proxyclients.pagweb.reenviosenal.types.ReenvioDeSenalProcessRequest;

@Stateless(name = "ServicioReenvioSenalPSManagement", mappedName = "SEL-ServicioReenvioSenalPSManagement")
public class ServicioReenvioSenalPSManagementBean implements Serializable, ServicioReenvioSenalPSManagement,
                                                             ServicioReenvioSenalPSManagementLocal {
    @SuppressWarnings("compatibility:-3416026575249539552")
    private static final long serialVersionUID = -5371697088151323127L;
    @Resource
    SessionContext sessionContext;
    
    @WebServiceRef
    private BpelReenviosenalClientEp bpel_reenviosenal_client_ep;
    @WebServiceRef
    private AdmonreenviosenalClientEp admonreenviosenal_client_ep;
    @WebServiceRef
    private ConsultareenviosenalClientEp consultareenviosenal_client_ep;
    
    public ServicioReenvioSenalPSManagementBean() {
       
    }
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public void insertarReenvioSenalSIEBEL(ReenvioSenial reenvioSenialSEL, String sistema) throws ServicioException {
        BPELReenvioSenal bPEL_ReenvioSenal = null;
        ReenvioDeSenalProcessRequest payload = null;

        try {
            bpel_reenviosenal_client_ep = new BpelReenviosenalClientEp();
            bPEL_ReenvioSenal = bpel_reenviosenal_client_ep.getBPELReenvioSenalPt();
            payload = new ReenvioDeSenalProcessRequest();
            payload.setCuentaSKY(reenvioSenialSEL.getCuentaSKY());
            payload.setOrigen("A_PETICION");
            payload.setSistema(sistema);
            payload.setRowIdCuentaSKY(reenvioSenialSEL.getRowidCuenta());
            //se agrega el IdSesion para DWH y BAM
            payload.setIdSesion(reenvioSenialSEL.getIdSesion());

            bPEL_ReenvioSenal.process(payload);
        } catch (Exception e) {
            LogServicios.printlnError(e);
            throw new ServicioException(e);
        }

    }
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public void insertarReenvioSenalSEL(ReenvioSenial reenvioSenialSEL) throws ServicioException {

        
        AdmonReenvioSenal admonReenvioSenal = null;
        ReenvioSenalInType payload;
        INSERTREENVIOSENALInput valueREENVIOSENALInput;
        ReenvioSenalOutType response = null;

        try {
            admonreenviosenal_client_ep = new AdmonreenviosenalClientEp();
            admonReenvioSenal = admonreenviosenal_client_ep.getAdmonReenvioSenalPt();

            payload = new ReenvioSenalInType();
            valueREENVIOSENALInput = new INSERTREENVIOSENALInput();
            valueREENVIOSENALInput.setCUENTASKY(reenvioSenialSEL.getCuentaSKY());
            valueREENVIOSENALInput.setPAISISO(reenvioSenialSEL.getPais());
            valueREENVIOSENALInput.setPAQUETE(reenvioSenialSEL.getPaquete());
            valueREENVIOSENALInput.setTI(reenvioSenialSEL.getTi());
            valueREENVIOSENALInput.setUSERID(reenvioSenialSEL.getUserId());
            //se agrega el idSesion
            payload.setREENVIOSENALInput(valueREENVIOSENALInput);
            response = admonReenvioSenal.process(payload);
            if (response == null) {
                throw new ServicioException("Por favor intente más tarde");
            } else if (!response.getErrorCode().equalsIgnoreCase("0")) {
                throw new ServicioException(response.getErrorMsg());
            }
        } catch (ServicioException e) {
            LogServicios.printlnError(e);
            throw e;
        } catch (Exception e) {
            LogServicios.printlnError(e);
            throw new ServicioException(e);
        }
    }
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<ReenvioSenial> consultarReenvioSenalSEL(String cuentaSKY) {
        List<ReenvioSenial> listaReenvioSenial = new ArrayList<ReenvioSenial>();

        
        ConsultaReenvioSenal consultaReenvioSenal = null;
        ResponseType response = null;
        ReenvioSenial reenvioSenialTmp = null;

        try {
            consultareenviosenal_client_ep = new ConsultareenviosenalClientEp();
            consultaReenvioSenal = consultareenviosenal_client_ep.getConsultaReenvioSenalPt();
            response = consultaReenvioSenal.process(cuentaSKY);

            if (response != null) {
                if (response.getErrorCode() != null && response.getErrorCode().equalsIgnoreCase("0"))
                    for (ConsultaReenvioSenalBDOutput consultaReenvioSenalBDOutput : response.getListaConsultaReenvioSenal()) {
                        reenvioSenialTmp = convert(consultaReenvioSenalBDOutput);
                        listaReenvioSenial.add(reenvioSenialTmp);
                    }
            } else {
                LogServicios.println(this, "No hay Reenvio de Señal solicitada " + response);
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e);
        }
        return listaReenvioSenial;
    }
    private ReenvioSenial convert(ConsultaReenvioSenalBDOutput consultaReenvioSenalBDOutput) {
        ReenvioSenial reenvioSenial = new ReenvioSenial();
        reenvioSenial.setCuentaSKY(consultaReenvioSenalBDOutput.getCUENTASKY());
        reenvioSenial.setFechaRegistro(JavaUtils.asTimestamp(consultaReenvioSenalBDOutput.getFECHAREGISTRO()));
        reenvioSenial.setId(consultaReenvioSenalBDOutput.getID().intValue() + "");
        reenvioSenial.setPais(consultaReenvioSenalBDOutput.getPAISISO());
        reenvioSenial.setPaquete(consultaReenvioSenalBDOutput.getPAQUETE());
        reenvioSenial.setTi(consultaReenvioSenalBDOutput.getTI());
        reenvioSenial.setUserId(consultaReenvioSenalBDOutput.getUSERID());
        reenvioSenial.setActivo(consultaReenvioSenalBDOutput.getREENVIOACTIVO());
        return reenvioSenial;
    }
}
