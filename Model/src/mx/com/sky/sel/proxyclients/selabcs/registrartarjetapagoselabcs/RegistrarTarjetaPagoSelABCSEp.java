
package mx.com.sky.sel.proxyclients.selabcs.registrartarjetapagoselabcs;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebServiceClient(name = "RegistrarTarjetaPagoSelABCS_ep",
                  targetNamespace =
                  "http://xmlns.sky.com.mx/ABCSImpl/Sel/RegistrarTarjetaPago",
                  wsdlLocation =
                  "https://qaselsoa.sky.com.mx:443/soa-infra/services/SEL_ABCS/RegistrarTarjetaPagoSelABCS/RegistrarTarjetaPagoSelABCS_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.sky.com.mx%2FABCSImpl%2FSel%2FRegistrarTarjetaPago%7DRegistrarTarjetaPagoSelABCS_ep")
public class RegistrarTarjetaPagoSelABCSEp extends Service {

    private final static URL REGISTRARTARJETAPAGOSELABCSEP_WSDL_LOCATION;
    private final static WebServiceException REGISTRARTARJETAPAGOSELABCSEP_EXCEPTION;
    private final static QName REGISTRARTARJETAPAGOSELABCSEP_QNAME =
        new QName("http://xmlns.sky.com.mx/ABCSImpl/Sel/RegistrarTarjetaPago",
                  "RegistrarTarjetaPagoSelABCS_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://qaselsoa.sky.com.mx:443/soa-infra/services/SEL_ABCS/RegistrarTarjetaPagoSelABCS/RegistrarTarjetaPagoSelABCS_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.sky.com.mx%2FABCSImpl%2FSel%2FRegistrarTarjetaPago%7DRegistrarTarjetaPagoSelABCS_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        REGISTRARTARJETAPAGOSELABCSEP_WSDL_LOCATION = url;
        REGISTRARTARJETAPAGOSELABCSEP_EXCEPTION = e;
    }

    public RegistrarTarjetaPagoSelABCSEp() {
        super(__getWsdlLocation(), REGISTRARTARJETAPAGOSELABCSEP_QNAME);
    }

    public RegistrarTarjetaPagoSelABCSEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), REGISTRARTARJETAPAGOSELABCSEP_QNAME,
              features);
    }

    public RegistrarTarjetaPagoSelABCSEp(URL wsdlLocation) {
        super(wsdlLocation, REGISTRARTARJETAPAGOSELABCSEP_QNAME);
    }

    public RegistrarTarjetaPagoSelABCSEp(URL wsdlLocation,
                                         WebServiceFeature... features) {
        super(wsdlLocation, REGISTRARTARJETAPAGOSELABCSEP_QNAME, features);
    }

    public RegistrarTarjetaPagoSelABCSEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RegistrarTarjetaPagoSelABCSEp(URL wsdlLocation, QName serviceName,
                                         WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns RegistrarTarjetaPagoSelABCS
     */
    @WebEndpoint(name = "RegistrarTarjetaPagoSelABCS_pt")
    public RegistrarTarjetaPagoSelABCS getRegistrarTarjetaPagoSelABCSPt() {
        return super.getPort(new QName("http://xmlns.sky.com.mx/ABCSImpl/Sel/RegistrarTarjetaPago",
                                       "RegistrarTarjetaPagoSelABCS_pt"),
                             RegistrarTarjetaPagoSelABCS.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RegistrarTarjetaPagoSelABCS
     */
    @WebEndpoint(name = "RegistrarTarjetaPagoSelABCS_pt")
    public RegistrarTarjetaPagoSelABCS getRegistrarTarjetaPagoSelABCSPt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.sky.com.mx/ABCSImpl/Sel/RegistrarTarjetaPago",
                                       "RegistrarTarjetaPagoSelABCS_pt"),
                             RegistrarTarjetaPagoSelABCS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REGISTRARTARJETAPAGOSELABCSEP_EXCEPTION != null) {
            throw REGISTRARTARJETAPAGOSELABCSEP_EXCEPTION;
        }
        return REGISTRARTARJETAPAGOSELABCSEP_WSDL_LOCATION;
    }

}
