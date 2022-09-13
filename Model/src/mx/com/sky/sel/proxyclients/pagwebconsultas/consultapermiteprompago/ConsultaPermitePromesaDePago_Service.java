
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultapermiteprompago;

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
@WebServiceClient(name = "ConsultaPermitePromesaDePago",
                  targetNamespace = "http://xmlns.oracle.com/ConsultaPermitePromesaDePago",
                  wsdlLocation =
                  "https://qaselsoa.sky.com.mx:443/soa-infra/services/pagwebconsultas/ConsultaPermitePromesaDePago/client?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FConsultaPermitePromesaDePago%7DConsultaPermitePromesaDePago")
public class ConsultaPermitePromesaDePago_Service extends Service {

    private final static URL CONSULTAPERMITEPROMESADEPAGO_WSDL_LOCATION;
    private final static WebServiceException CONSULTAPERMITEPROMESADEPAGO_EXCEPTION;
    private final static QName CONSULTAPERMITEPROMESADEPAGO_QNAME =
        new QName("http://xmlns.oracle.com/ConsultaPermitePromesaDePago", "ConsultaPermitePromesaDePago");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://qaselsoa.sky.com.mx:443/soa-infra/services/pagwebconsultas/ConsultaPermitePromesaDePago/client?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FConsultaPermitePromesaDePago%7DConsultaPermitePromesaDePago");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONSULTAPERMITEPROMESADEPAGO_WSDL_LOCATION = url;
        CONSULTAPERMITEPROMESADEPAGO_EXCEPTION = e;
    }

    public ConsultaPermitePromesaDePago_Service() {
        super(__getWsdlLocation(), CONSULTAPERMITEPROMESADEPAGO_QNAME);
    }

    public ConsultaPermitePromesaDePago_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONSULTAPERMITEPROMESADEPAGO_QNAME, features);
    }

    public ConsultaPermitePromesaDePago_Service(URL wsdlLocation) {
        super(wsdlLocation, CONSULTAPERMITEPROMESADEPAGO_QNAME);
    }

    public ConsultaPermitePromesaDePago_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONSULTAPERMITEPROMESADEPAGO_QNAME, features);
    }

    public ConsultaPermitePromesaDePago_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultaPermitePromesaDePago_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ConsultaPermitePromesaDePago
     */
    @WebEndpoint(name = "ConsultaPermitePromesaDePago")
    public ConsultaPermitePromesaDePago getConsultaPermitePromesaDePago() {
        return super.getPort(new QName("http://xmlns.oracle.com/ConsultaPermitePromesaDePago",
                                       "ConsultaPermitePromesaDePago"), ConsultaPermitePromesaDePago.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaPermitePromesaDePago
     */
    @WebEndpoint(name = "ConsultaPermitePromesaDePago")
    public ConsultaPermitePromesaDePago getConsultaPermitePromesaDePago(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/ConsultaPermitePromesaDePago",
                                       "ConsultaPermitePromesaDePago"), ConsultaPermitePromesaDePago.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONSULTAPERMITEPROMESADEPAGO_EXCEPTION != null) {
            throw CONSULTAPERMITEPROMESADEPAGO_EXCEPTION;
        }
        return CONSULTAPERMITEPROMESADEPAGO_WSDL_LOCATION;
    }

}
