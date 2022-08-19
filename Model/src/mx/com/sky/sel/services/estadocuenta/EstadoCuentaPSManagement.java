package mx.com.sky.sel.services.estadocuenta;

import java.util.List;

import javax.ejb.Remote;

import mx.com.sky.sel.services.beans.estadocuenta.EstadosCuenta;

@Remote
public interface EstadoCuentaPSManagement {
    public List<EstadosCuenta> consultaEstadoCuenta(String cuentaSKY);
}
