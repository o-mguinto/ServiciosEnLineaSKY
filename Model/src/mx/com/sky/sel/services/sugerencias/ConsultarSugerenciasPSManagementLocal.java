package mx.com.sky.sel.services.sugerencias;

import java.util.List;

import javax.ejb.Local;

import mx.com.sky.sel.services.beans.solicitudservicio.Sugerencia;

@Local
public interface ConsultarSugerenciasPSManagementLocal {
    List<Sugerencia> consultarSugerencias(String uid);
    public String agregarSugerencias(String uid, String sugerencia);
}
