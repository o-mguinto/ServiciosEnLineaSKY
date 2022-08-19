package mx.com.sky.sel.services.datosgenerales;

import javax.ejb.Local;

import mx.com.sky.sel.services.beans.utils.Direccion;

@Local
public interface ServicioDatosGeneralesPSManagementLocal {
    public Direccion obtenerDireccionEnvio(String rowID);
}
