package mx.com.sky.sel.services.sugerencias;

import java.util.List;

import javax.ejb.Remote;

import mx.com.sky.sel.services.beans.solicitudservicio.Sugerencia;

@Remote
public interface ConsultarSugerenciasPSManagement {
    List<Sugerencia> consultarSugerencias(String uid);
    public String agregarSugerencias(String uid, String sugerencia);
}
