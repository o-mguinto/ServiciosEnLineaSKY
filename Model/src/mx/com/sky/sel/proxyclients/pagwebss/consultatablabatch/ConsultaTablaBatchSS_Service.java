
package mx.com.sky.sel.proxyclients.pagwebss.consultatablabatch;

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
@WebServiceClient(name = "ConsultaTablaBatchSS", targetNamespace = "http://xmlns.oracle.com/ConsultaTablaBatchSS",
                  wsdlLocation =
                  "https://preselsoa.sky.com.mx:443/soa-infra/services/pagwebss/ConsultaTablaBatchSS/client?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FConsultaTablaBatchSS%7DConsultaTablaBatchSS")
public class ConsultaTablaBatchSS_Service extends Service {

    private final static URL CONSULTATABLABATCHSS_WSDL_LOCATION;
    private final static WebServiceException CONSULTATABLABATCHSS_EXCEPTION;
    private final static QName CONSULTATABLABATCHSS_QNAME =
        new QName("http://xmlns.oracle.com/ConsultaTablaBatchSS", "ConsultaTablaBatchSS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://preselsoa.sky.com.mx:443/soa-infra/services/pagwebss/ConsultaTablaBatchSS/client?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FConsultaTablaBatchSS%7DConsultaTablaBatchSS");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONSULTATABLABATCHSS_WSDL_LOCATION = url;
        CONSULTATABLABATCHSS_EXCEPTION = e;
    }

    public ConsultaTablaBatchSS_Service() {
        super(__getWsdlLocation(), CONSULTATABLABATCHSS_QNAME);
    }

    public ConsultaTablaBatchSS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONSULTATABLABATCHSS_QNAME, features);
    }

    public ConsultaTablaBatchSS_Service(URL wsdlLocation) {
        super(wsdlLocation, CONSULTATABLABATCHSS_QNAME);
    }

    public ConsultaTablaBatchSS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONSULTATABLABATCHSS_QNAME, features);
    }

    public ConsultaTablaBatchSS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultaTablaBatchSS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ConsultaTablaBatchSS
     */
    @WebEndpoint(name = "ConsultaTablaBatchSS")
    public ConsultaTablaBatchSS getConsultaTablaBatchSS() {
        return super.getPort(new QName("http://xmlns.oracle.com/ConsultaTablaBatchSS", "ConsultaTablaBatchSS"),
                             ConsultaTablaBatchSS.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaTablaBatchSS
     */
    @WebEndpoint(name = "ConsultaTablaBatchSS")
    public ConsultaTablaBatchSS getConsultaTablaBatchSS(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/ConsultaTablaBatchSS", "ConsultaTablaBatchSS"),
                             ConsultaTablaBatchSS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONSULTATABLABATCHSS_EXCEPTION != null) {
            throw CONSULTATABLABATCHSS_EXCEPTION;
        }
        return CONSULTATABLABATCHSS_WSDL_LOCATION;
    }

}
