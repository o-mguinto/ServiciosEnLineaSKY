package mx.com.sky.sel.services.estadocuenta;

import java.util.List;

import javax.ejb.Local;

import mx.com.sky.sel.services.beans.estadocuenta.EstadosCuenta;

@Local
public interface EstadoCuentaPSManagementLocal {
    public List<EstadosCuenta> consultaEstadoCuenta(String cuentaSKY);
}
