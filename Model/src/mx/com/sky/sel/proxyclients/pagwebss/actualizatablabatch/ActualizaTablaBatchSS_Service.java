
package mx.com.sky.sel.proxyclients.pagwebss.actualizatablabatch;

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
@WebServiceClient(name = "ActualizaTablaBatchSS", targetNamespace = "http://xmlns.oracle.com/ActualizaTablaBatchSS",
                  wsdlLocation =
                  "https://qaselsoa.sky.com.mx:443/soa-infra/services/pagwebss/ActualizaTablaBatchSS/client?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FActualizaTablaBatchSS%7DActualizaTablaBatchSS")
public class ActualizaTablaBatchSS_Service extends Service {

    private final static URL ACTUALIZATABLABATCHSS_WSDL_LOCATION;
    private final static WebServiceException ACTUALIZATABLABATCHSS_EXCEPTION;
    private final static QName ACTUALIZATABLABATCHSS_QNAME =
        new QName("http://xmlns.oracle.com/ActualizaTablaBatchSS", "ActualizaTablaBatchSS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://qaselsoa.sky.com.mx:443/soa-infra/services/pagwebss/ActualizaTablaBatchSS/client?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FActualizaTablaBatchSS%7DActualizaTablaBatchSS");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ACTUALIZATABLABATCHSS_WSDL_LOCATION = url;
        ACTUALIZATABLABATCHSS_EXCEPTION = e;
    }

    public ActualizaTablaBatchSS_Service() {
        super(__getWsdlLocation(), ACTUALIZATABLABATCHSS_QNAME);
    }

    public ActualizaTablaBatchSS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ACTUALIZATABLABATCHSS_QNAME, features);
    }

    public ActualizaTablaBatchSS_Service(URL wsdlLocation) {
        super(wsdlLocation, ACTUALIZATABLABATCHSS_QNAME);
    }

    public ActualizaTablaBatchSS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ACTUALIZATABLABATCHSS_QNAME, features);
    }

    public ActualizaTablaBatchSS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ActualizaTablaBatchSS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ActualizaTablaBatchSS
     */
    @WebEndpoint(name = "ActualizaTablaBatchSS")
    public ActualizaTablaBatchSS getActualizaTablaBatchSS() {
        return super.getPort(new QName("http://xmlns.oracle.com/ActualizaTablaBatchSS", "ActualizaTablaBatchSS"),
                             ActualizaTablaBatchSS.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ActualizaTablaBatchSS
     */
    @WebEndpoint(name = "ActualizaTablaBatchSS")
    public ActualizaTablaBatchSS getActualizaTablaBatchSS(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/ActualizaTablaBatchSS", "ActualizaTablaBatchSS"),
                             ActualizaTablaBatchSS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ACTUALIZATABLABATCHSS_EXCEPTION != null) {
            throw ACTUALIZATABLABATCHSS_EXCEPTION;
        }
        return ACTUALIZATABLABATCHSS_WSDL_LOCATION;
    }

}
