
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultavetvprices;

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
@WebServiceClient(name = "ConsultaVeTVPrices", targetNamespace = "http://xmlns.oracle.com/ConsultaVeTVPrices",
                  wsdlLocation =
                  "https://qaselsoa.sky.com.mx:443/soa-infra/services/pagwebconsultas/ConsultaVeTVPrices/client?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FConsultaVeTVPrices%7DConsultaVeTVPrices")
public class ConsultaVeTVPrices_Service extends Service {

    private final static URL CONSULTAVETVPRICES_WSDL_LOCATION;
    private final static WebServiceException CONSULTAVETVPRICES_EXCEPTION;
    private final static QName CONSULTAVETVPRICES_QNAME =
        new QName("http://xmlns.oracle.com/ConsultaVeTVPrices", "ConsultaVeTVPrices");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://qaselsoa.sky.com.mx:443/soa-infra/services/pagwebconsultas/ConsultaVeTVPrices/client?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FConsultaVeTVPrices%7DConsultaVeTVPrices");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONSULTAVETVPRICES_WSDL_LOCATION = url;
        CONSULTAVETVPRICES_EXCEPTION = e;
    }

    public ConsultaVeTVPrices_Service() {
        super(__getWsdlLocation(), CONSULTAVETVPRICES_QNAME);
    }

    public ConsultaVeTVPrices_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONSULTAVETVPRICES_QNAME, features);
    }

    public ConsultaVeTVPrices_Service(URL wsdlLocation) {
        super(wsdlLocation, CONSULTAVETVPRICES_QNAME);
    }

    public ConsultaVeTVPrices_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONSULTAVETVPRICES_QNAME, features);
    }

    public ConsultaVeTVPrices_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultaVeTVPrices_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ConsultaVeTVPrices
     */
    @WebEndpoint(name = "ConsultaVeTVPrices")
    public ConsultaVeTVPrices getConsultaVeTVPrices() {
        return super.getPort(new QName("http://xmlns.oracle.com/ConsultaVeTVPrices", "ConsultaVeTVPrices"),
                             ConsultaVeTVPrices.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaVeTVPrices
     */
    @WebEndpoint(name = "ConsultaVeTVPrices")
    public ConsultaVeTVPrices getConsultaVeTVPrices(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/ConsultaVeTVPrices", "ConsultaVeTVPrices"),
                             ConsultaVeTVPrices.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONSULTAVETVPRICES_EXCEPTION != null) {
            throw CONSULTAVETVPRICES_EXCEPTION;
        }
        return CONSULTAVETVPRICES_WSDL_LOCATION;
    }

}
