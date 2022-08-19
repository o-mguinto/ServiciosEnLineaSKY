package mx.com.sky.sel.services.corporativos;

import java.util.List;

import javax.ejb.Remote;

import mx.com.sky.sel.services.beans.corporativos.Batch;
import mx.com.sky.sel.services.beans.corporativos.BatchDF;
import mx.com.sky.sel.services.beans.corporativos.CuentaCV;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.exception.ServicioException;

@Remote
public interface ServiciosCorporativosPSManagement {
    public List<BatchDF> consultarEstadoSolicitudDF(String nombreCorporativo);
    public List<Batch> consultarEstadoSolicitud(String nombreCorporativo);
    public String reintentarConError(String nombreCorporativo);
    public String reintentarConErrorDF(String nombreCorporativo);
    public String crearSolicitudPPV(SolicitudServicioBean solicitudServicio, List<String> tis, String nombreCorporativo,
                                    String sistema) throws ServicioException;
    public String crearSolicitudInfoFiscal(SolicitudServicioBean solicitudServicio, List<CuentaCV> cuentasCV, String nombreCorporativo,
                                           String sistema) throws ServicioException;
    public List<CuentaCV> consultarCuentasAsociadas(String cuentaSKY);
    public List<String> consultarTIsAsociadas(String nombreCorporativo);
}