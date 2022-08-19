package mx.com.sky.sel.services.bam.sesiones.insert;
import java.io.Serializable;

import java.util.Calendar;

import javax.xml.datatype.XMLGregorianCalendar;

import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.utils.JavaUtils;
import mx.com.sky.sel.proxyclients.pagweb.bamsessions.BPELBAMSESSIONS;
import mx.com.sky.sel.proxyclients.pagweb.bamsessions.BpelBamSessionsClientEp;
import mx.com.sky.sel.proxyclients.pagweb.bamsessions.types.PWBAMSESSION;
import mx.com.sky.sel.proxyclients.pagweb.bamsessions.types.PWBAMSESSIONCollection;


public class ServicioBAM implements Serializable {
    @SuppressWarnings("compatibility:-1974857552126585195")
    private static final long serialVersionUID = -3421706804646691697L;

    public ServicioBAM() {
        super();
    }

    public void registraSesion(String cuentaSKY, String pais, String paquete, String username, String marketType, String ingreso,String idSesion) {
        BpelBamSessionsClientEp BpelBamSessionsClientEp;
        BPELBAMSESSIONS BPELBAMSESSIONS = null;
        PWBAMSESSIONCollection payload;
        PWBAMSESSION datosSesion = null;

        try {

            BpelBamSessionsClientEp = new BpelBamSessionsClientEp();
            BPELBAMSESSIONS = BpelBamSessionsClientEp.getBPELBAMSESSIONSPt();

            XMLGregorianCalendar loginDate = JavaUtils.asXMLGregorianCalendar(Calendar.getInstance().getTime());
            datosSesion = new PWBAMSESSION();
            datosSesion.setAccount(cuentaSKY);
            datosSesion.setCountry(pais);
            datosSesion.setExt4(loginDate);
            datosSesion.setLoginDate(loginDate);
            datosSesion.setMarketType(marketType);
            datosSesion.setPackage(paquete);
            datosSesion.setUsername(username);
            datosSesion.setIngreso(ingreso);
            //se agrega el idSesion
            datosSesion.setIdSesion(idSesion);
            payload = new PWBAMSESSIONCollection();
            payload.getPWBAMSESSION().add(datosSesion);
            BPELBAMSESSIONS.process(payload);
        } catch (Exception e) {
            LogServicios.printlnError(e);
        }
    }
}
