package mx.com.sky.sel.services.bam.operaciones.insert;

import java.io.Serializable;

import mx.com.sky.sel.services.beans.bam.OperacionBAM;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.proxyclients.pagweb.pwbamoperaciones.BPELPWBAMOPERACIONES;
import mx.com.sky.sel.proxyclients.pagweb.pwbamoperaciones.BpelPwBamOperacionesClientEp;
import mx.com.sky.sel.proxyclients.pagweb.pwbamoperaciones.types.OperacionTypeIN;

public class ServicioOperacionesBAM implements Serializable {
    @SuppressWarnings("compatibility:-8644566744757263822")
    private static final long serialVersionUID = 5297213737243762929L;

    public ServicioOperacionesBAM() {
        super();
    }

    /**
     * @param operacionBAM
     */
    public void insertOperacion(OperacionBAM operacionBAM) {
        BpelPwBamOperacionesClientEp BpelPwBamOperacionesClientEp = null;
        BPELPWBAMOPERACIONES BPELPWBAMOPERACIONES = null;
        OperacionTypeIN payload;

        try {
            BpelPwBamOperacionesClientEp = new BpelPwBamOperacionesClientEp();
            BPELPWBAMOPERACIONES = BpelPwBamOperacionesClientEp.getBPELPWBAMOPERACIONESPt();
            payload = new OperacionTypeIN();
            payload.setCUENTASKY(operacionBAM.getCuentaSky());
            payload.setDESCRIPCION(operacionBAM.getDescripcion());
            payload.setEMAIL(operacionBAM.getEmail());
            payload.setESTATUSCUENTA(operacionBAM.getEstatusCuenta());
            payload.setIDSESION(operacionBAM.getIdSesion());
            payload.setMARKETTYPE(operacionBAM.getMarkettype());
            payload.setOPERACION(operacionBAM.getOperacion());
            payload.setORGANIZATIONTYPE(operacionBAM.getOrganizationtype());
            payload.setPAIS(operacionBAM.getPais());
            payload.setPAQUETE(operacionBAM.getPaquete());
            payload.setTIPOCUENTA(operacionBAM.getTipoCuenta());
            payload.setUSERID(operacionBAM.getUserid());
            payload.setUSERNAME(operacionBAM.getUsername());
            payload.setPCMOVIL(operacionBAM.getPcmovil());
            payload.setSISTEMA("SEL");
            BPELPWBAMOPERACIONES.process(payload);
        } catch (Exception e) {
            LogServicios.printlnWarn(this, "NO SE MANDO A BAM");
        }
    }
    }
