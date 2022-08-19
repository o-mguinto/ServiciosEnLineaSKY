package mx.com.sky.sel.services.cybersource.propiedadesambiente;

import javax.ejb.Local;

import java.util.List;

import mx.com.sky.sel.services.beans.cybersource.ConsultarPropiedadAmbienteResponseDTO;

@Local
public interface PropiedadesAmbienteManagementLocal {
    public ConsultarPropiedadAmbienteResponseDTO consultarPropiedadesAmbiente(List<Integer> idsPropiedades);
}
