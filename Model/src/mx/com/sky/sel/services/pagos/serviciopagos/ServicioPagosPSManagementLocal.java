package mx.com.sky.sel.services.pagos.serviciopagos;

import java.util.List;

import javax.ejb.Local;

import mx.com.sky.enterpriseflowmessages.sel.gestionarpagocontdc.GestionarPagoConTDCRequestEBMType;
import mx.com.sky.enterpriseflowmessages.sel.gestionarpagocontdc.GestionarPagoConTDCResponseEBMType;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapagos.types.Pago;
import mx.com.sky.sel.services.beans.pagos.FormatoPago;
import mx.com.sky.sel.services.exception.ServicioException;

@Local
public interface ServicioPagosPSManagementLocal {
    public String procesaPago(FormatoPago fpago) throws ServicioException;
    public GestionarPagoConTDCResponseEBMType realizaPagoNuevaTarjetaPs(GestionarPagoConTDCRequestEBMType pago);
    public List<Pago> obtenerConsultaPagos(String rowID);
}
