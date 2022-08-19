package mx.com.sky.sel.services.promesapago;

import java.io.Serializable;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import java.util.List;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.sky.sel.services.beans.promesa.pago.PromesaPago;

@Stateless(name = "ServicioPromesaPagoPSManagement", mappedName = "SEL-ServicioPromesaPagoPSManagement")
public class ServicioPromesaPagoPSManagementBean implements Serializable, ServicioPromesaPagoPSManagement,
                                                            ServicioPromesaPagoPSManagementLocal {
    @SuppressWarnings("compatibility:-810785271420188680")
    private static final long serialVersionUID = 8575534018647572283L;
    @Resource
    SessionContext sessionContext;

    public ServicioPromesaPagoPSManagementBean() {
    }
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<PromesaPago> consultarPromesasPago(String cuentaSKY) {
        List<PromesaPago> promesas = null;
        ServicioPromesaPago spp = new ServicioPromesaPago();
        promesas = spp.consultarPromesasPago(cuentaSKY);
        return promesas;
    }
}
