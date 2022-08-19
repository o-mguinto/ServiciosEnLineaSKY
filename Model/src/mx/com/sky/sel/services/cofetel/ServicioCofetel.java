package mx.com.sky.sel.services.cofetel;

import java.io.Serializable;

import javax.xml.ws.Holder;

import mx.com.sky.sel.log.LogServicios;

import mx.com.sky.sel.proxyclients.pagwebconsultas.consultatelefonovalidocf.ConsultaTelefonoValidoCOFETEL;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultatelefonovalidocf.ConsultatelefonovalidocofetelClientEp;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultatelefonovalidocf.types.Process;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultatelefonovalidocf.types.ProcessResponse;

public class ServicioCofetel implements Serializable {
    @SuppressWarnings("compatibility:-5173940388152191854")
    private static final long serialVersionUID = 6172260389036201294L;

    public ServicioCofetel() {
        super();
    }
    
    public String validaTelefono(String lada, String telefono) {
        Holder<String> resultado = new Holder<String>();
        Holder<String> resultadodesc = new Holder<String>();
        Holder<String> valido = new Holder<String>();
        Holder<String> modalidad = new Holder<String>();
        ConsultaTelefonoValidoCOFETEL consultaTelefonoValidoCOFETEL = null;
        ConsultatelefonovalidocofetelClientEp consultatelefonovalidocofetel_client_ep = null;
        Process payload = null;
        ProcessResponse response = null;
        String mod = null;
        try {
            consultatelefonovalidocofetel_client_ep = new ConsultatelefonovalidocofetelClientEp();
            consultaTelefonoValidoCOFETEL = consultatelefonovalidocofetel_client_ep.getConsultaTelefonoValidoCOFETELPt();
            consultaTelefonoValidoCOFETEL.process(lada, telefono, resultado, resultadodesc, valido, modalidad);

            if (resultado.value.equalsIgnoreCase("0")) {

                mod = modalidad.value;
                LogServicios.printlnError(this, "*****Modalidad: " + mod + "*****");
            } else {
                mod = "INVALIDO";
                LogServicios.printlnError(this, "*****Modalidad: INVALIDO*****");
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e);

        }

        return mod;
    }
}
