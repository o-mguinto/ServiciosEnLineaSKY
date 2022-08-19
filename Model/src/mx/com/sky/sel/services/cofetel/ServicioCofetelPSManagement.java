package mx.com.sky.sel.services.cofetel;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface ServicioCofetelPSManagement {
    public List<String> obtenerLadas();
    public String validaTelefono(String lada, String telefono);
}
