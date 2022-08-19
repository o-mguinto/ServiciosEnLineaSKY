package mx.com.sky.sel.services.promesapago;

import java.util.List;

import javax.ejb.Remote;

import mx.com.sky.sel.services.beans.promesa.pago.PromesaPago;

@Remote
public interface ServicioPromesaPagoPSManagement {
    public List<PromesaPago> consultarPromesasPago(String cuentaSKY);
}
