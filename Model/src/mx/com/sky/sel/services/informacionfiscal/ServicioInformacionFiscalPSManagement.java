package mx.com.sky.sel.services.informacionfiscal;

import java.util.List;

import javax.ejb.Remote;

import mx.com.sky.sel.services.beans.informacionfiscal.DatosFiscales;
import mx.com.sky.sel.services.beans.informacionfiscal.RegimenFiscalBean;
import mx.com.sky.sel.services.beans.informacionfiscal.UsoCFDIBean;
import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.exception.ServicioException;

@Remote
public interface ServicioInformacionFiscalPSManagement {
    public DatosFiscales getDatosFiscalesDeprecated(String rowID);    
    
    public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID);
    public List<DatosFiscales> obtenerHistoricoDatosFiscales(String rowID);
    public String crearSolicitud(SolicitudServicioBean solicitudServicio) throws ServicioException;
    public List<RegimenFiscalBean> consultarRegimenesFiscales(String tipoPersona);
    public List<UsoCFDIBean> consultarUsosCFDI();
    public String registrarDatosFiscales(SolicitudServicioBean datosFiscales) throws ServicioException;
    public String actualizarDatosFiscales(SolicitudServicioBean datosFiscales) throws ServicioException;
    public SolicitudServicioBean consultarDatosFiscales(String cuentaSKY);
    public DatosFiscales getDatosFiscales(String cuentaSKY);
}
