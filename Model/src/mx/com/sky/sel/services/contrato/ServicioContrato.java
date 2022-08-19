package mx.com.sky.sel.services.contrato;

import java.io.Serializable;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;

import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultafechascontrato.ConsultaFechasContratoSKY;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultafechascontrato.ConsultafechascontratoskyClientEp;

public class ServicioContrato implements Serializable {
    @SuppressWarnings("compatibility:-3949824744063000754")
    private static final long serialVersionUID = 2642330307398514901L;

    public ServicioContrato() {
        super();
    }

    public int consultarDiasContrato(String cuentaSKY) {
        LogServicios.println(this, "consultarDiasContrato(" + cuentaSKY + ")");
        int diasContrato = 0;

        ConsultafechascontratoskyClientEp consultafechascontratosky_client_ep;
        ConsultaFechasContratoSKY consultaFechasContratoSKY = null;

        consultafechascontratosky_client_ep = new ConsultafechascontratoskyClientEp();
        consultaFechasContratoSKY = consultafechascontratosky_client_ep.getConsultaFechasContratoSKYPt();

        Holder<String> respuesta = new Holder<String>();
        Holder<String> respuestadesc = new Holder<String>();
        Holder<String> cuenta = new Holder<String>();
        Holder<String> paqueteactual = new Holder<String>();
        Holder<XMLGregorianCalendar> fechainiciocontrato = new Holder<XMLGregorianCalendar>();
        Holder<XMLGregorianCalendar> fechafincontrato = new Holder<XMLGregorianCalendar>();
        Holder<String> estatuscontrato = new Holder<String>();
        Holder<BigDecimal> plazoforzoso = new Holder<BigDecimal>();
        Holder<BigDecimal> diasplazoforzoso = new Holder<BigDecimal>();

        consultaFechasContratoSKY.process(cuentaSKY, respuesta, respuestadesc, cuenta, paqueteactual, fechainiciocontrato, fechafincontrato,
                                          estatuscontrato, plazoforzoso, diasplazoforzoso);
        if (respuesta != null && respuesta.value != null && respuesta.value.equalsIgnoreCase("0")) {
            if (diasplazoforzoso != null && diasplazoforzoso.value != null) {
                diasContrato = diasplazoforzoso.value.intValue();
            }
        }

        return diasContrato;
    }
}
