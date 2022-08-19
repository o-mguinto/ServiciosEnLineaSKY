package mx.com.sky.sel.services.rdig;

import java.io.Serializable;

import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultareceptordigital.ConsultaReceptorDigital;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultareceptordigital.ConsultareceptordigitalClientEp;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultareceptordigital.types.CTReceptorInType;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultareceptordigital.types.CTReceptorOutType;
import mx.com.sky.sel.services.beans.utils.ReceptorDigital;

public class SerivcioReceptorDigital implements Serializable {
    @SuppressWarnings("compatibility:2788005295658840715")
    private static final long serialVersionUID = 931721665598271342L;

    public SerivcioReceptorDigital() {
        super();
    }
    
    //***************************
    public ReceptorDigital getReceptorDigital(String IRD) {
        ReceptorDigital rd = null;
        ConsultareceptordigitalClientEp consultareceptordigital_client_ep;
        ConsultaReceptorDigital consultaReceptorDigital = null;
        CTReceptorInType payload = null;
        CTReceptorOutType response = null;
       
        if (IRD == null || IRD.isEmpty()) {
            return rd;
        }
        try {
            consultareceptordigital_client_ep = new ConsultareceptordigitalClientEp();
            consultaReceptorDigital = consultareceptordigital_client_ep.getConsultaReceptorDigitalPt();
            payload = new CTReceptorInType();
            payload.setIRD(IRD);
            response = consultaReceptorDigital.process(payload);

            if (response != null) {
                rd = convertReceptorDigital(response);
            }
        } catch (Exception e) {
            LogServicios.printlnError(e);
        }
        return rd;
    }
    
    //*************************************************

    
    private ReceptorDigital convertReceptorDigital(CTReceptorOutType rd) {
        ReceptorDigital receptorD = new ReceptorDigital();
        receptorD.setMarca(rd.getMARCA());
        receptorD.setModelo(rd.getMODELO());
        receptorD.setResultado(rd.getResultado());
        receptorD.setResultadoDesc(rd.getResultadodesc());
        receptorD.setSerie(rd.getSERIE());
        receptorD.setVersionSoft(rd.getVERSIONSOFT());
        
        return receptorD;
    }
}
