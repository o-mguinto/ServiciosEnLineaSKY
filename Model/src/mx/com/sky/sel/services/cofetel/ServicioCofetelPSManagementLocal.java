package mx.com.sky.sel.services.cofetel;

import java.util.List;

import javax.ejb.Local;

@Local
public interface ServicioCofetelPSManagementLocal {
    /**
     * @return Lista con ladas 
     */
    public List<String> obtenerLadas();
    public String validaTelefono(String lada, String telefono);
}
