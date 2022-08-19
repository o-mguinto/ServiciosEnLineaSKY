package mx.com.sky.sel.services.eventos;

import java.util.List;

import javax.ejb.Remote;

import mx.com.sky.sel.services.beans.eventos.Evento;
import mx.com.sky.sel.services.beans.eventos.Horario;

@Remote
public interface ServicioPagosEventosPSManagement {
    public List<Evento> obtenerPPEventos(String tipoPPE, String pais, String banderaHD, String paquete,
                                           String tipoCuenta);
    public List<Horario> obtenerHorariosPPE(String canal, String tituloEvento, String diferenciaGMT, String pais,
                                             String tipoEvento);
}
