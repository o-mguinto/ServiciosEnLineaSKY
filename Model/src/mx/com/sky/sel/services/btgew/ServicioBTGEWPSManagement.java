package mx.com.sky.sel.services.btgew;

import java.util.List;

import javax.ejb.Remote;

import mx.com.sky.sel.services.beans.btgew.ActivacionBean;
import mx.com.sky.sel.services.beans.btgew.BTGEWElement;

@Remote
public interface ServicioBTGEWPSManagement {
    public List<BTGEWElement> consultarAll();
    public List<BTGEWElement> consultarLoginCarrusel();
    public List<BTGEWElement> consultarActivasParametros(String paisISO, String tipoCuenta, String paquete, String vetv);
    public String activarServiciosHOTGO(ActivacionBean activacionBean);
}
