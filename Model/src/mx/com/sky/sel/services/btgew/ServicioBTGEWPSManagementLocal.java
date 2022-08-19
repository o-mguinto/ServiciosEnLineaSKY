package mx.com.sky.sel.services.btgew;

import java.util.List;

import javax.ejb.Local;

import mx.com.sky.sel.services.beans.btgew.ActivacionBean;
import mx.com.sky.sel.services.beans.btgew.BTGEWElement;

@Local
public interface ServicioBTGEWPSManagementLocal {
    public List<BTGEWElement> consultarAll();
    public List<BTGEWElement> consultarLoginCarrusel();
    public List<BTGEWElement> consultarActivasParametros(String paisISO, String tipoCuenta, String paquete, String vetv);
    public String activarServiciosHOTGO(ActivacionBean activacionBean);
}
