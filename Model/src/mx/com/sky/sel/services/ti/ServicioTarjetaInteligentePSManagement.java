package mx.com.sky.sel.services.ti;

import java.util.List;

import javax.ejb.Remote;

import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import mx.com.sky.sel.services.beans.utils.TarjetaInteligente;

@Remote
public interface ServicioTarjetaInteligentePSManagement {
    public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID);
    public List<TarjetaInteligente> getTarjetaInteligente(String rowID);
    public List<TarjetaInteligente> obtenerTarjetaInteligente(String rowID);
}
