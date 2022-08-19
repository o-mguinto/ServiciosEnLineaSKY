package mx.com.sky.sel.services.datosgenerales;

import javax.ejb.Remote;

import mx.com.sky.sel.services.beans.utils.Direccion;

@Remote
public interface ServicioDatosGeneralesPSManagement {
    public Direccion obtenerDireccionEnvio(String rowID);
}
