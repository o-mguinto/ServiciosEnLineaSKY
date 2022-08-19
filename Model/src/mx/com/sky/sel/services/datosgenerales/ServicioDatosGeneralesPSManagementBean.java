package mx.com.sky.sel.services.datosgenerales;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import java.io.Serializable;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.services.beans.utils.Direccion;

@Stateless(name = "ServicioDatosGeneralesPSManagement", mappedName = "SEL-ServicioDatosGeneralesPSManagement")
public class ServicioDatosGeneralesPSManagementBean implements Serializable, ServicioDatosGeneralesPSManagement,
                                                               ServicioDatosGeneralesPSManagementLocal {
    @SuppressWarnings("compatibility:3705430771243707474")
    private static final long serialVersionUID = 3619602805862816840L;
    @Resource
    SessionContext sessionContext;

    public ServicioDatosGeneralesPSManagementBean() {
        LogServicios.println(this, "DCDatosGenerales()");
    }
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Direccion obtenerDireccionEnvio(String rowID) {
            Direccion direccion = null;
            ServicioDatosGenerales sdg = null;
            sdg = new ServicioDatosGenerales();
            direccion = sdg.obtenerDireccionEnvio(rowID);
            if (direccion == null) {
                LogServicios.printlnWarn(this, "direccion null");
                direccion = new Direccion();
            }
            return direccion;
        }
}
