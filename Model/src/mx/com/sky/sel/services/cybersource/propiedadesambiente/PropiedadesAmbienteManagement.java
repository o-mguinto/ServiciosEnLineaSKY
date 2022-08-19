package mx.com.sky.sel.services.cybersource.propiedadesambiente;

import java.util.List;

import javax.ejb.Remote;

import mx.com.sky.sel.services.beans.cybersource.ConsultarPropiedadAmbienteResponseDTO;

@Remote
public interface PropiedadesAmbienteManagement {
    public ConsultarPropiedadAmbienteResponseDTO consultarPropiedadesAmbiente(List<Integer> idsPropiedades);
}
