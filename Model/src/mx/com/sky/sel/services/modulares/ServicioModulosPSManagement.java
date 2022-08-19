package mx.com.sky.sel.services.modulares;

import java.util.List;

import javax.ejb.Remote;

import mx.com.sky.sel.services.beans.modulares.Modulo;
import mx.com.sky.sel.services.exception.ServicioException;

@Remote
public interface ServicioModulosPSManagement {
    public boolean consultarPermiso(String tarjetaInteligente);
    public List<Modulo> consultarModulos();
    public List<Modulo> consultarModulosNoAsociados(String cuentaSKY);
    public boolean agregarModulo(Modulo modulo, String cuentaSKY, String tarjetaInteligente) throws ServicioException;
    public boolean cambiarModulo(Modulo moduloNuevo, Modulo moduloActual, String cuentaSKY, String tarjetaInteligente) throws Exception;
    public boolean desconectarModulo(Modulo modulo, String cuentaSKY, String tarjetaInteligente) throws Exception;
}
