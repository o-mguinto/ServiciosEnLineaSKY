package mx.com.sky.sel.dc.factura;

import java.io.Serializable;
import java.util.List;

import mx.com.sky.sel.services.beans.facturas.Factura;
import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.services.factura.ServicioFacturaPSManagementBean;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;

import mx.com.sky.sel.proxyclients.pagwebconsultas.consultactaespecial.types.ConsultaCuentaEspecialProcessResponse;


public class DCFactura implements Serializable {
    @SuppressWarnings("compatibility:4887497831413674152")
    private static final long serialVersionUID = 5745330184998880430L;

    public DCFactura() {
        super();
    }
    ServicioFacturaPSManagementBean sf;
    public List<Factura> consultarFacturas(String cuentaSKY) {
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        List<Factura> facturas = null;
        sf = new ServicioFacturaPSManagementBean();
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_FACTURAS_CFDI);
        if (sesion.getUsuario().isCuentaJerarquia()) {
            ConsultaCuentaEspecialProcessResponse response = null;
            response = sf.consultaCuentaEspecial(cuentaSKY);
            if (response.getResultado().equalsIgnoreCase("0")) {
                facturas = sf.consultarFacturas(response.getCuentaSKYPadre());   
            }else{
                facturas = sf.consultarFacturas(cuentaSKY);    
            }
        }else{
            facturas = sf.consultarFacturas(cuentaSKY);
        }
        
        return facturas;
    }
    public List<Factura> consultarFacturas() {
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        List<Factura> facturas = null;
        sf = new ServicioFacturaPSManagementBean();
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_FACTURAS_CFDI);
        if (sesion.getUsuario().isCuentaJerarquia()) {
            ConsultaCuentaEspecialProcessResponse response = null;
            response = sf.consultaCuentaEspecial(sesion.getSuscriptor().getCuentaSKY());
            if (response.getResultado().equalsIgnoreCase("0")) {
                facturas = sf.consultarFacturas(response.getCuentaSKYPadre());   
            }else{
                facturas = sf.consultarFacturas(sesion.getSuscriptor().getCuentaSKY());    
            }
        }else{
            facturas = sf.consultarFacturas(sesion.getSuscriptor().getCuentaSKY());
        }
        return facturas;
    }
    public byte[] obtenerFacturaPDF(String UUID,String fechaTimbrado,String PAC) {
        return sf.obtenerFacturaPDF(UUID,fechaTimbrado,PAC);
    }
}
