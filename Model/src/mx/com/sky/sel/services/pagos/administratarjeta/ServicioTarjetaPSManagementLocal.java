package mx.com.sky.sel.services.pagos.administratarjeta;

import java.util.List;

import javax.ejb.Local;

import mx.com.sky.sel.services.beans.pagos.tarjetas.Tarjeta;

@Local
public interface ServicioTarjetaPSManagementLocal {
    public List<Tarjeta> obtenerTarjetas(String uuid);
    public List<Tarjeta> consultarTarjetasPs(String numeroCuentaCliente, String phaseId, String keyId);
    public String agregarTarjeta(Tarjeta tarjeta, String uuid, String organizationID);
    public String guardarTarjetaPs(String numeroCuentaCliente, Tarjeta tarjeta, String organizationID);
    public String eliminarTarjeta(Tarjeta tarjeta, String uuid);
    public String eliminarTarjetaPs(String numeroCuentaCliente, String idTarjeta, String keyId, String phase);
}
