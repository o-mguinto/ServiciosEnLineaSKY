package mx.com.sky.sel.services.hijump.estadocuenta;

import java.io.Serializable;

import mx.com.sky.sel.proxyclients.soainterface.consultaestadocuenta.ConsultaEstadoDeCuentaSoaInterface;
import mx.com.sky.sel.proxyclients.soainterface.consultaestadocuenta.ConsultaEstadoDeCuentaSoaInterface_ep;
import mx.com.sky.sel.proxyclients.soainterface.consultaestadocuenta.types.CabeceraEntradaTYPE;
import mx.com.sky.sel.proxyclients.soainterface.consultaestadocuenta.types.ConsultaEstadoDeCuentaEBMType;
import mx.com.sky.sel.proxyclients.soainterface.consultaestadocuenta.types.ConsultaEstadoDeCuentaEntradaTYPE;
import mx.com.sky.sel.proxyclients.soainterface.consultaestadocuenta.types.ConsultaEstadoDeCuentaResponseEBMType;
import mx.com.sky.sel.proxyclients.soainterface.consultaestadocuenta.types.EBMHeaderRequestType;
import mx.com.sky.sel.log.LogServicios;


public class ServicioEstadoCuenta implements Serializable {
    @SuppressWarnings("compatibility:2053586561289717841")
    private static final long serialVersionUID = -5726970228460590379L;

    public ServicioEstadoCuenta() {
        super();
    }

    public String consultaEstadoCuenta(String noFactura) {
        String edoCuenta = null;
        try {
            ConsultaEstadoDeCuentaSoaInterface_ep ConsultaEstadoDeCuentaSoaInterface_ep = new ConsultaEstadoDeCuentaSoaInterface_ep();
            ConsultaEstadoDeCuentaSoaInterface bPEL_consultaEstadoDeCuenta = null;
            ConsultaEstadoDeCuentaEBMType payload = new ConsultaEstadoDeCuentaEBMType();
            ConsultaEstadoDeCuentaResponseEBMType response = new ConsultaEstadoDeCuentaResponseEBMType();

            EBMHeaderRequestType headerReq = new EBMHeaderRequestType();

            ConsultaEstadoDeCuentaEntradaTYPE consultaEstadoDeCuentaEntrada = new ConsultaEstadoDeCuentaEntradaTYPE();
            CabeceraEntradaTYPE valueCabecera = new CabeceraEntradaTYPE();
            CabeceraEntradaTYPE.PARAMETRO parametro = new CabeceraEntradaTYPE.PARAMETRO();

            headerReq.setOperacion("consultaEstadoDeCuenta");
            headerReq.setSistemaOrigen("SEL");

            payload.setEBMHeaderRequest(headerReq);

            valueCabecera.setAPLICATIVO("SEL");
            valueCabecera.setOPERACION("consultaEstadoDeCuenta");

            consultaEstadoDeCuentaEntrada.setCABECERA(valueCabecera);


            parametro.setNOMBRE("Formato");
            parametro.setVALOR("HTML");

            consultaEstadoDeCuentaEntrada.getCABECERA()
                                         .getPARAMETRO()
                                         .add(parametro);
            consultaEstadoDeCuentaEntrada.setNUMEROFACTURA(noFactura);

            payload.setConsultaEstadoDeCuentaEntrada(consultaEstadoDeCuentaEntrada);
            
            bPEL_consultaEstadoDeCuenta = ConsultaEstadoDeCuentaSoaInterface_ep.getConsultaEstadoDeCuentaSoaInterface_pt();
            response = bPEL_consultaEstadoDeCuenta.consultaEstadoDeCuenta(payload);

            if (response != null) {
                LogServicios.println(this, response.getConsultaEstadoDeCuentaSalida().getCABECERA().getMSGERROR());
                edoCuenta = response.getConsultaEstadoDeCuentaSalida().getFACTURAFORMATEADA();
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }
        return edoCuenta;


    }

}
