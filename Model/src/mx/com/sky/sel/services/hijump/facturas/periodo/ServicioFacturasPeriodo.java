package mx.com.sky.sel.services.hijump.facturas.periodo;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import mx.com.sky.sel.proxyclients.soainterface.consultafacturasperiodo.ConsultaFacturasPeriodoPSSoaInterface;
import mx.com.sky.sel.proxyclients.soainterface.consultafacturasperiodo.ConsultaFacturasPeriodoPSSoaInterface_ep;
import mx.com.sky.sel.proxyclients.soainterface.consultafacturasperiodo.types.CabeceraEntradaTYPE;
import mx.com.sky.sel.proxyclients.soainterface.consultafacturasperiodo.types.ConsultaFacturasPeriodoPSEBMType;
import mx.com.sky.sel.proxyclients.soainterface.consultafacturasperiodo.types.ConsultaFacturasPeriodoPSResponseEBMType;
import mx.com.sky.sel.proxyclients.soainterface.consultafacturasperiodo.types.EBMHeaderRequestType;
import mx.com.sky.sel.proxyclients.soainterface.consultafacturasperiodo.types.FacturasConsultaFacturasPeriodoEntradaTYPE;
import mx.com.sky.sel.proxyclients.soainterface.consultafacturasperiodo.types.ResultadosSalidaTYPE;
import mx.com.sky.sel.services.beans.estadocuenta.EstadosCuenta;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.utils.JavaUtils;


public class ServicioFacturasPeriodo implements Serializable{
    @SuppressWarnings("compatibility:7163869436647853561")
    private static final long serialVersionUID = -2336085476570794735L;

    public ServicioFacturasPeriodo() {
        super();
    }

    public List<EstadosCuenta> consultaFacturasPeriodo(String ctaSKY) {
        List<EstadosCuenta> listaFacturas = null;
        EstadosCuenta datosFactura = null;
        int contador = 0; //se omite la primera factura
        LogServicios.println(this, "consultaEstadoCuenta [" + ctaSKY + "]");
        System.out.println("consultaEstadoCuenta [" + ctaSKY + "]");
        ConsultaFacturasPeriodoPSSoaInterface_ep bPEL_Facturacion_consultaFacturasPeriodo_ep=null;
        ConsultaFacturasPeriodoPSSoaInterface bPEL_Facturacion_consultaFacturasPeriodo = null;
        ConsultaFacturasPeriodoPSEBMType payload = new ConsultaFacturasPeriodoPSEBMType();
        ConsultaFacturasPeriodoPSResponseEBMType response = null;
        CabeceraEntradaTYPE valueCabecera = null;
        EBMHeaderRequestType HeaderReq = null;
        FacturasConsultaFacturasPeriodoEntradaTYPE facturasPeriodoEntrada= new FacturasConsultaFacturasPeriodoEntradaTYPE();
        
        try {
            bPEL_Facturacion_consultaFacturasPeriodo_ep = new ConsultaFacturasPeriodoPSSoaInterface_ep();
            bPEL_Facturacion_consultaFacturasPeriodo = bPEL_Facturacion_consultaFacturasPeriodo_ep.getConsultaFacturasPeriodoPSSoaInterface_pt();

            valueCabecera = new CabeceraEntradaTYPE();
            valueCabecera.setAPLICATIVO("SEL");
            valueCabecera.setOPERACION("ConsultaFacturasPeriodo");
            
            HeaderReq= new EBMHeaderRequestType();
            HeaderReq.setOperacion("ConsultaFacturasPeriodo");
            HeaderReq.setSistemaOrigen("SEL");
            
            payload.setEBMHeaderRequest(HeaderReq);
            
            facturasPeriodoEntrada.setCABECERA(valueCabecera);
            
            facturasPeriodoEntrada.setNUMEROCUENTA(ctaSKY);
                        
            payload.setFacturasConsultaFacturasPeriodoEntrada(facturasPeriodoEntrada);

            //response
            response = bPEL_Facturacion_consultaFacturasPeriodo.consultaFacturasPeriodoPS(payload);
            LogServicios.println(this, "getFacturasPorPeriodo[" + ctaSKY + "]");
            System.out.println("getFacturasPorPeriodo[" + ctaSKY + "]");
            LogServicios.println(this, "resultado {" + response + "}");
            System.out.println("resultado {" + response + "}");
            if (response != null) {
                LogServicios.println(this, response.getFacturasConsultaFacturasPeriodoSalida().getRESULTADOS());
                System.out.println("response {" + response.getFacturasConsultaFacturasPeriodoSalida().getRESULTADOS());
                if (response.getFacturasConsultaFacturasPeriodoSalida().getCABECERA().getCODERROR().equalsIgnoreCase("0")) {
                    listaFacturas = new ArrayList<EstadosCuenta>();
                    contador = 0;
                    for (ResultadosSalidaTYPE resultado : response.getFacturasConsultaFacturasPeriodoSalida().getRESULTADOS()) {
                        if (contador != 0) {
                            datosFactura = datosFacturaToFactura(resultado,ctaSKY);
                            listaFacturas.add(datosFactura);
                        } else {
                            contador++;
                            LogServicios.println(this, "Se omite la primera factura para Hi Jump");
                            System.out.println("Se omite la primera factura para Hi Jump");
                        }
                    }
                }
            }

        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            System.out.println("error: "+ e.getMessage());
        }
        return listaFacturas;
    }

    private EstadosCuenta datosFacturaToFactura(ResultadosSalidaTYPE resultado, String numCuenta) {
        EstadosCuenta dFact = new EstadosCuenta();

        if (resultado.getNUMEROFACTURA() != null)
            dFact.setReferenciaEdoCta(resultado.getNUMEROFACTURA().getValue());
        if (resultado.getFECHAEMISION() != null)
            dFact.setFechaEdoCuenta(JavaUtils.asTimestamp(resultado.getFECHAEMISION().getValue()));
        if (resultado.getAJUSTES() != null)
            dFact.setAjustes(resultado.getAJUSTES().getValue());
        if (resultado.getCONSUMOSDELMES() != null)
            dFact.setCargos(resultado.getCONSUMOSDELMES().getValue());
        if (resultado.getIDFACTURA() != null)
            dFact.setNumCuenta(numCuenta);
        if (resultado.getPAGOSAFACTURA() != null)
            dFact.setPagos(resultado.getPAGOSAFACTURA().getValue());
        if (resultado.getMONTOFACTURADO() != null)
            dFact.setPorPagar(resultado.getMONTOFACTURADO().getValue());
        if (resultado.getFECHAAPAGAR() != null)
            dFact.setFechaVencimiento(JavaUtils.asTimestamp(resultado.getFECHAAPAGAR().getValue()));
        return dFact;
    }
}

