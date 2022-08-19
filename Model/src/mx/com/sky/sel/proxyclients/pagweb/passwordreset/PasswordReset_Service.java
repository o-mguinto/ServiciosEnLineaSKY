
package mx.com.sky.sel.proxyclients.pagweb.passwordreset;

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
@WebServiceClient(name = "PasswordReset", targetNamespace = "http://xmlns.oracle.com/PasswordReset",
                  wsdlLocation =
                  "https://preselsoa.sky.com.mx:443/soa-infra/services/pagweb/PasswordReset/client?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FPasswordReset%7DPasswordReset")
public class PasswordReset_Service extends Service {

    private final static URL PASSWORDRESET_WSDL_LOCATION;
    private final static WebServiceException PASSWORDRESET_EXCEPTION;
    private final static QName PASSWORDRESET_QNAME =
        new QName("http://xmlns.oracle.com/PasswordReset", "PasswordReset");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://preselsoa.sky.com.mx:443/soa-infra/services/pagweb/PasswordReset/client?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FPasswordReset%7DPasswordReset");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PASSWORDRESET_WSDL_LOCATION = url;
        PASSWORDRESET_EXCEPTION = e;
    }

    public PasswordReset_Service() {
        super(__getWsdlLocation(), PASSWORDRESET_QNAME);
    }

    public PasswordReset_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), PASSWORDRESET_QNAME, features);
    }

    public PasswordReset_Service(URL wsdlLocation) {
        super(wsdlLocation, PASSWORDRESET_QNAME);
    }

    public PasswordReset_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PASSWORDRESET_QNAME, features);
    }

    public PasswordReset_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PasswordReset_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns PasswordReset
     */
    @WebEndpoint(name = "PasswordReset")
    public PasswordReset getPasswordReset() {
        return super.getPort(new QName("http://xmlns.oracle.com/PasswordReset", "PasswordReset"), PasswordReset.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PasswordReset
     */
    @WebEndpoint(name = "PasswordReset")
    public PasswordReset getPasswordReset(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/PasswordReset", "PasswordReset"), PasswordReset.class,
                             features);
    }

    private static URL __getWsdlLocation() {
        if (PASSWORDRESET_EXCEPTION != null) {
            throw PASSWORDRESET_EXCEPTION;
        }
        return PASSWORDRESET_WSDL_LOCATION;
    }

}