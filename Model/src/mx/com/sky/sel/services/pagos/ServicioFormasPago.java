package mx.com.sky.sel.services.pagos;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Holder;

import mx.com.sky.sel.services.beans.pagos.formaspago.FormaPagoActual;
import mx.com.sky.sel.services.beans.pagos.formaspago.FormasDePago;
import mx.com.sky.sel.enums.EnumFormaPago;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaformapagoactual.ConsultaFormaPagoActual;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaformapagoactual.ConsultaformapagoactualClientEp;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaformapagoactual.types.FormaPagoActualSBLOutput;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaformaspago.ConsultaFormasPago;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaformaspago.ConsultaformaspagoClientEp;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaformaspago.types.FormasPagoSIEBELOutputCollection;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaformaspago.types.FormasPagoTYPE;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultarecargasvetv.ConsultaRecargasVeTV;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultarecargasvetv.ConsultarecargasvetvClientEp;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultarecargasvetv.types.RecargasVeTVOutput;


public class ServicioFormasPago implements Serializable {
    @SuppressWarnings("compatibility:4550073814345522275")
    private static final long serialVersionUID = 55686879999565541L;

    public ServicioFormasPago() {
        super();
    }

    public FormaPagoActual consultaFormaPagoActual(String cuentaSKY) {
        FormaPagoActual formaPA = null;
        List<FormaPagoActual> lista = consultarFormaPagoActual(cuentaSKY);
        if (lista.size() > 0) {
            formaPA = lista.get(0);
        }
        return formaPA;
    }

    public boolean isPagoCambioFormaPago(String cuentaSKY) {
        boolean pagoCFP = false;
        List<FormasDePago> listaFP = consultarFormasPago(cuentaSKY);
        String ccfp = "";
        for (FormasDePago formasDePago : listaFP) {
            ccfp = formasDePago.getCargoCambioDeFormaDePago();
            if (ccfp != null && !ccfp.equalsIgnoreCase("N")) {
                pagoCFP = true;
            }
        }
        return pagoCFP;
    }

    public List<FormaPagoActual> consultarFormaPagoActual(String cuentaSKY) {
        ConsultaformapagoactualClientEp consultaformapagoactual_client_ep;
        ConsultaFormaPagoActual consultaFormaPagoActual = null;
        FormaPagoActual fpa = null;
        List<FormaPagoActual> listaFPA = new ArrayList<FormaPagoActual>();
        Holder<String> resultado = new Holder<String>();
        Holder<String> resultadodesc = new Holder<String>();
        Holder<List<FormaPagoActualSBLOutput>> listaFormasPago = new Holder<List<FormaPagoActualSBLOutput>>();

        try {
            consultaformapagoactual_client_ep = new ConsultaformapagoactualClientEp();
            consultaFormaPagoActual = consultaformapagoactual_client_ep.getConsultaFormaPagoActualPt();
            consultaFormaPagoActual.process(cuentaSKY, resultado, resultadodesc, listaFormasPago);
            if (resultado != null && resultado.value.equalsIgnoreCase("0")) {
                for (FormaPagoActualSBLOutput objectFPA : listaFormasPago.value) {
                    fpa = convert(objectFPA);
                    listaFPA.add(fpa);
                }
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e);
        }
        return listaFPA;

    }

    public List<FormasDePago> consultarFormasPago(String cuentaSKY) {
        ConsultaformaspagoClientEp consultaformaspago_client_ep;
        ConsultaFormasPago consultaFormasPago = null;
        FormasDePago fpa = null;
        List<FormasDePago> listaFPA = new ArrayList<FormasDePago>();
        Holder<String> resultado = new Holder<String>();
        Holder<String> resultadodesc = new Holder<String>();
        Holder<FormasPagoSIEBELOutputCollection> listaFormasPago = new Holder<FormasPagoSIEBELOutputCollection>();

        try {
            consultaformaspago_client_ep = new ConsultaformaspagoClientEp();
            consultaFormasPago = consultaformaspago_client_ep.getConsultaFormasPagoPt();

            consultaFormasPago.process(cuentaSKY, resultado, resultadodesc, listaFormasPago);

            if (resultado != null && resultado.value.equalsIgnoreCase("0")) {
                for (FormasPagoTYPE objectFPA : listaFormasPago.value.getFormasPagoSIEBELOutput()) {
                    fpa = convert(objectFPA);
                    listaFPA.add(fpa);
                }
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e);
        }
        return listaFPA;
    }

    public int recargasVeTV(String cuentaSKY) {
        int recargas = 0;
        ConsultarecargasvetvClientEp consultarecargasvetv_client_ep;
        ConsultaRecargasVeTV consultaRecargasVeTV = null;
        Holder<String> resultado = new Holder<String>();
        Holder<String> resultadodesc = new Holder<String>();
        Holder<List<RecargasVeTVOutput>> recargasVeTV = new Holder<List<RecargasVeTVOutput>>();

        try {

            consultarecargasvetv_client_ep = new ConsultarecargasvetvClientEp();
            consultaRecargasVeTV = consultarecargasvetv_client_ep.getConsultaRecargasVeTVPt();

            consultaRecargasVeTV.process(cuentaSKY, resultado, resultadodesc, recargasVeTV);
            if (resultado != null && resultado.value.equalsIgnoreCase("0")) {
                if (recargasVeTV.value.size() > 0) {
                    recargas = recargasVeTV.value.get(0).getPLAZOFORZOSOVETV().intValue();
                }
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e);
        }

        return recargas;
    }


    private FormaPagoActual convert(FormaPagoActualSBLOutput objectFPA) {
        /*
         *
         */
        FormaPagoActual fpa = new FormaPagoActual();
        fpa.setCuenta(objectFPA.getCUENTA());
        fpa.setPaymtmethcd(objectFPA.getPAYMTMETHCD());
        if (fpa.getPaymtmethcd() != null) {
            if (fpa.getPaymtmethcd().equalsIgnoreCase("AMEX")) {
                fpa.setFormaPagoActual(EnumFormaPago.TDC);
            } else if (fpa.getPaymtmethcd().equalsIgnoreCase("Automatic Debit")) {
                fpa.setFormaPagoActual(EnumFormaPago.TDD);
            } else if (fpa.getPaymtmethcd().equalsIgnoreCase("Credit Card")) {
                fpa.setFormaPagoActual(EnumFormaPago.TDC);
            } else if (fpa.getPaymtmethcd().equalsIgnoreCase("DOMICILIACION CON CLABE")) {
                fpa.setFormaPagoActual(EnumFormaPago.EFECTIVO);
            } else if (fpa.getPaymtmethcd().equalsIgnoreCase("Dom. VIP - Centro de Costos")) {
                fpa.setFormaPagoActual(EnumFormaPago.TDD);
            } else if (fpa.getPaymtmethcd().equalsIgnoreCase("Dom. VIP - Externo")) {
                fpa.setFormaPagoActual(EnumFormaPago.TDD);
            } else if (fpa.getPaymtmethcd().equalsIgnoreCase("Dom. VIP - Filiales")) {
                fpa.setFormaPagoActual(EnumFormaPago.TDD);
            } else if (fpa.getPaymtmethcd().equalsIgnoreCase("Dom. VIP - Renta Estacion")) {
                fpa.setFormaPagoActual(EnumFormaPago.TDD);
            } else if (fpa.getPaymtmethcd().equalsIgnoreCase("Domiciliacion")) {
                fpa.setFormaPagoActual(EnumFormaPago.TDD);
            } else if (fpa.getPaymtmethcd().equalsIgnoreCase("Domiciliacion Cuenta Bancaria")) {
                fpa.setFormaPagoActual(EnumFormaPago.TDD);
            } else if (fpa.getPaymtmethcd().equalsIgnoreCase("Domiciliacion con CLABE")) {
                fpa.setFormaPagoActual(EnumFormaPago.TDD);
            } else if (fpa.getPaymtmethcd().equalsIgnoreCase("EFECTIVO")) {
                fpa.setFormaPagoActual(EnumFormaPago.EFECTIVO);
            } else if (fpa.getPaymtmethcd().equalsIgnoreCase("NOMINA")) {
                fpa.setFormaPagoActual(EnumFormaPago.TDD);
            } else if (fpa.getPaymtmethcd().equalsIgnoreCase("Nomina")) {
                fpa.setFormaPagoActual(EnumFormaPago.TDD);
            } else if (fpa.getPaymtmethcd().equalsIgnoreCase("PAGO EN EL BANCO")) {
                fpa.setFormaPagoActual(EnumFormaPago.EFECTIVO);
            } else if (fpa.getPaymtmethcd().equalsIgnoreCase("PLAN DE AYALA")) {
                fpa.setFormaPagoActual(EnumFormaPago.NA);
            } else if (fpa.getPaymtmethcd().equalsIgnoreCase("Pago en Banco")) {
                fpa.setFormaPagoActual(EnumFormaPago.EFECTIVO);
            } else if (fpa.getPaymtmethcd().equalsIgnoreCase("Pago en el Banco")) {
                fpa.setFormaPagoActual(EnumFormaPago.EFECTIVO);
            } else if (fpa.getPaymtmethcd().equalsIgnoreCase("TARJETA DE CREDITO")) {
                fpa.setFormaPagoActual(EnumFormaPago.TDC);
            } else if (fpa.getPaymtmethcd().equalsIgnoreCase("TARJETA DE DEBITO")) {
                fpa.setFormaPagoActual(EnumFormaPago.TDD);
            } else if (fpa.getPaymtmethcd().equalsIgnoreCase("Tarjeta de Credito")) {
                fpa.setFormaPagoActual(EnumFormaPago.TDC);
            } else if (fpa.getPaymtmethcd().equalsIgnoreCase("Tarjeta de Debito")) {
                fpa.setFormaPagoActual(EnumFormaPago.TDD);
            } else if (fpa.getPaymtmethcd().equalsIgnoreCase("Tarjeta de Prepago Bancaria")) {
                fpa.setFormaPagoActual(EnumFormaPago.TDP);
            } else if (fpa.getPaymtmethcd().equalsIgnoreCase("VISA_MC")) {
                fpa.setFormaPagoActual(EnumFormaPago.TDC);
            } else {
                fpa.setFormaPagoActual(EnumFormaPago.NA);
                LogServicios.printlnWarn(this, "Tipo de Forma de Pago Desconocida " + fpa.getPaymtmethcd());
            }
        }
        return fpa;
    }

    private FormasDePago convert(FormasPagoTYPE objectFPA) {
        FormasDePago fdp = new FormasDePago();
        fdp.setCargoCambioDeFormaDePago(objectFPA.getCargoCambioDeFormaDePago());
        fdp.setName(objectFPA.getNAME());
        fdp.setNoCoincideConContrato(objectFPA.getNoCoincideConContrato());
        fdp.setPaymtmethcd(objectFPA.getPAYMTMETHCD());
        return fdp;
    }
}
