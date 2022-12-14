
package mx.com.sky.sel.proxyclients.pagweb.admonpromos;

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
@WebServiceClient(name = "AdmonPromociones", targetNamespace = "http://xmlns.oracle.com/AdmonPromociones",
                  wsdlLocation =
                  "https://qaselsoa.sky.com.mx:443/soa-infra/services/pagweb/AdmonPromociones/client?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FAdmonPromociones%7DAdmonPromociones")
public class AdmonPromociones_Service extends Service {

    private final static URL ADMONPROMOCIONES_WSDL_LOCATION;
    private final static WebServiceException ADMONPROMOCIONES_EXCEPTION;
    private final static QName ADMONPROMOCIONES_QNAME =
        new QName("http://xmlns.oracle.com/AdmonPromociones", "AdmonPromociones");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://qaselsoa.sky.com.mx:443/soa-infra/services/pagweb/AdmonPromociones/client?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FAdmonPromociones%7DAdmonPromociones");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADMONPROMOCIONES_WSDL_LOCATION = url;
        ADMONPROMOCIONES_EXCEPTION = e;
    }

    public AdmonPromociones_Service() {
        super(__getWsdlLocation(), ADMONPROMOCIONES_QNAME);
    }

    public AdmonPromociones_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ADMONPROMOCIONES_QNAME, features);
    }

    public AdmonPromociones_Service(URL wsdlLocation) {
        super(wsdlLocation, ADMONPROMOCIONES_QNAME);
    }

    public AdmonPromociones_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ADMONPROMOCIONES_QNAME, features);
    }

    public AdmonPromociones_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AdmonPromociones_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns AdmonPromociones
     */
    @WebEndpoint(name = "AdmonPromociones")
    public AdmonPromociones getAdmonPromociones() {
        return super.getPort(new QName("http://xmlns.oracle.com/AdmonPromociones", "AdmonPromociones"),
                             AdmonPromociones.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdmonPromociones
     */
    @WebEndpoint(name = "AdmonPromociones")
    public AdmonPromociones getAdmonPromociones(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/AdmonPromociones", "AdmonPromociones"),
                             AdmonPromociones.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADMONPROMOCIONES_EXCEPTION != null) {
            throw ADMONPROMOCIONES_EXCEPTION;
        }
        return ADMONPROMOCIONES_WSDL_LOCATION;
    }

}
