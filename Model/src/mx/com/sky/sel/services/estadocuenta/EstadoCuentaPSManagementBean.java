package mx.com.sky.sel.services.estadocuenta;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.sky.sel.services.beans.estadocuenta.EstadosCuenta;
import mx.com.sky.sel.services.hijump.facturas.periodo.ServicioFacturasPeriodo;
import mx.com.sky.sel.log.LogPC;

@Stateless(name = "EstadoCuentaPSManagement", mappedName = "SEL-EstadoCuentaPSManagement")
public class EstadoCuentaPSManagementBean implements Serializable, EstadoCuentaPSManagement, EstadoCuentaPSManagementLocal {
    @SuppressWarnings("compatibility:-8386551614574948264")
    private static final long serialVersionUID = -2695728139521094157L;
    @Resource
    SessionContext sessionContext;

    public EstadoCuentaPSManagementBean() {
        LogPC.println(this, "DCEstadoCuenta Creado");
    }
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    //Si en 1g no se envía la cuenta, lo que se deb enviar es el valor de sesion.getSuscriptor().getCuentaSKY()
    public List<EstadosCuenta> consultaEstadoCuenta(String cuentaSKY) {
        System.out.println("consultando estadosCuenta....");
        LogPC.printlnWarn(this, "consultando estadosCuenta....");
        List<EstadosCuenta> estadosCuenta = null;
        
            estadosCuenta = null;
            ServicioFacturasPeriodo secsf = null;
            secsf = new ServicioFacturasPeriodo();
            estadosCuenta = secsf.consultaFacturasPeriodo(cuentaSKY);

        if (estadosCuenta == null) {
            LogPC.printlnWarn(this, "estadosCuenta null");
            System.out.println("estadosCuenta null");
            estadosCuenta = new ArrayList<EstadosCuenta>();
        }
        return estadosCuenta;
    }
}