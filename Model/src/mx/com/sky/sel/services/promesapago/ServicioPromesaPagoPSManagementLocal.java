package mx.com.sky.sel.services.promesapago;

import java.util.List;

import javax.ejb.Local;

import mx.com.sky.sel.services.beans.promesa.pago.PromesaPago;

@Local
public interface ServicioPromesaPagoPSManagementLocal {
    public List<PromesaPago> consultarPromesasPago(String cuentaSKY);
}
