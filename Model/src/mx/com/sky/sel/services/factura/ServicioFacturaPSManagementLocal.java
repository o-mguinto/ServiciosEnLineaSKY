package mx.com.sky.sel.services.factura;

import java.util.List;

import javax.ejb.Local;

import mx.com.sky.sel.proxyclients.pagwebconsultas.consultactaespecial.types.ConsultaCuentaEspecialProcessResponse;
import mx.com.sky.sel.services.beans.facturas.Factura;

@Local
public interface ServicioFacturaPSManagementLocal {
    public List<Factura> consultarFacturas(String cuentaSKY);
    public byte[] obtenerFacturaPDF(String UUID,String fechaTimbrado,String PAC);
    public ConsultaCuentaEspecialProcessResponse consultaCuentaEspecial(String cuentaSKY);
}
