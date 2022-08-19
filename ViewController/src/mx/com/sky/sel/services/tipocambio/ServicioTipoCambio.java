package mx.com.sky.sel.services.tipocambio;

import java.io.Serializable;

import javax.xml.ws.Holder;

import mx.com.sky.sel.proxyclients.pagwebconsultas.consultatipocambiomoneda.ConsultaTipoCambioMoneda;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultatipocambiomoneda.ConsultatipocambiomonedaClientEp;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultatipocambiomoneda.types.TipoCambioOutput;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.services.beans.tipocambio.TipoDeCambio;
import mx.com.sky.sel.utils.JavaUtils;


public class ServicioTipoCambio implements Serializable{
    @SuppressWarnings("compatibility:-1400040065810260876")
    private static final long serialVersionUID = -9073880496004768519L;

    public ServicioTipoCambio() {
        super();
    }

    public TipoDeCambio obtenerTipoCambio(String organization) {
        TipoDeCambio tipoDeCambio = null;
        ConsultatipocambiomonedaClientEp ConsultatipocambiomonedaClientEp;
        ConsultatipocambiomonedaClientEp = new ConsultatipocambiomonedaClientEp();
        ConsultaTipoCambioMoneda consultaTipoCambioMoneda = ConsultatipocambiomonedaClientEp.getConsultaTipoCambioMonedaPt();

        Holder<String> respuesta = new Holder<String>();
        Holder<String> respuestadesc = new Holder<String>();
        Holder<mx.com.sky.sel.proxyclients.pagwebconsultas.consultatipocambiomoneda.types.TipoCambioOutput> tipoCambio =
            new Holder<mx.com.sky.sel.proxyclients.pagwebconsultas.consultatipocambiomoneda.types.TipoCambioOutput>();

        try {
            consultaTipoCambioMoneda.process(organization, respuesta, respuestadesc, tipoCambio);
            if (tipoCambio != null && tipoCambio.value != null) {
                tipoDeCambio = convert(tipoCambio.value);
            }
        } catch (Exception e) {
            LogServicios.printlnError(e);
        }
        return tipoDeCambio;

    }


    private TipoDeCambio convert(TipoCambioOutput tipoCambioOutput) {
        TipoDeCambio tipoDeCambio = new TipoDeCambio();
        tipoDeCambio.setFechaInicio(JavaUtils.asTimestamp(tipoCambioOutput.getFechaInicio()));
        tipoDeCambio.setMoneda(tipoCambioOutput.getMoneda());
        tipoDeCambio.setPais(tipoCambioOutput.getPais());
        tipoDeCambio.setTipoCambio(tipoCambioOutput.getTipoCambio().doubleValue());

        return tipoDeCambio;
    }
}
