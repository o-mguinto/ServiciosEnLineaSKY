
package mx.com.sky.sel.proxyclients.secinterface.utilsscprocess;

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
@WebServiceClient(name = "UtilsOfscProcessSecInterface_ep",
                  targetNamespace = "http://xmlns.sky.com.mx/InterfaceServices/Sec/UtilsOfscProcess",
                  wsdlLocation =
                  "https://preselsoa.sky.com.mx:443/soa-infra/services/SEC_Interface/UtilsOfscProcessSecInterface/UtilsOfscProcessSecInterface_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.sky.com.mx%2FInterfaceServices%2FSec%2FUtilsOfscProcess%7DUtilsOfscProcessSecInterface_ep")
public class UtilsOfscProcessSecInterfaceEp extends Service {

    private final static URL UTILSOFSCPROCESSSECINTERFACEEP_WSDL_LOCATION;
    private final static WebServiceException UTILSOFSCPROCESSSECINTERFACEEP_EXCEPTION;
    private final static QName UTILSOFSCPROCESSSECINTERFACEEP_QNAME =
        new QName("http://xmlns.sky.com.mx/InterfaceServices/Sec/UtilsOfscProcess", "UtilsOfscProcessSecInterface_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://preselsoa.sky.com.mx:443/soa-infra/services/SEC_Interface/UtilsOfscProcessSecInterface/UtilsOfscProcessSecInterface_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.sky.com.mx%2FInterfaceServices%2FSec%2FUtilsOfscProcess%7DUtilsOfscProcessSecInterface_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        UTILSOFSCPROCESSSECINTERFACEEP_WSDL_LOCATION = url;
        UTILSOFSCPROCESSSECINTERFACEEP_EXCEPTION = e;
    }

    public UtilsOfscProcessSecInterfaceEp() {
        super(__getWsdlLocation(), UTILSOFSCPROCESSSECINTERFACEEP_QNAME);
    }

    public UtilsOfscProcessSecInterfaceEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), UTILSOFSCPROCESSSECINTERFACEEP_QNAME, features);
    }

    public UtilsOfscProcessSecInterfaceEp(URL wsdlLocation) {
        super(wsdlLocation, UTILSOFSCPROCESSSECINTERFACEEP_QNAME);
    }

    public UtilsOfscProcessSecInterfaceEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, UTILSOFSCPROCESSSECINTERFACEEP_QNAME, features);
    }

    public UtilsOfscProcessSecInterfaceEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UtilsOfscProcessSecInterfaceEp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns UtilsOfscProcessSecInterface
     */
    @WebEndpoint(name = "UtilsOfscProcessSecInterface_pt")
    public UtilsOfscProcessSecInterface getUtilsOfscProcessSecInterfacePt() {
        return super.getPort(new QName("http://xmlns.sky.com.mx/InterfaceServices/Sec/UtilsOfscProcess",
                                       "UtilsOfscProcessSecInterface_pt"), UtilsOfscProcessSecInterface.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UtilsOfscProcessSecInterface
     */
    @WebEndpoint(name = "UtilsOfscProcessSecInterface_pt")
    public UtilsOfscProcessSecInterface getUtilsOfscProcessSecInterfacePt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.sky.com.mx/InterfaceServices/Sec/UtilsOfscProcess",
                                       "UtilsOfscProcessSecInterface_pt"), UtilsOfscProcessSecInterface.class,
                             features);
    }

    private static URL __getWsdlLocation() {
        if (UTILSOFSCPROCESSSECINTERFACEEP_EXCEPTION != null) {
            throw UTILSOFSCPROCESSSECINTERFACEEP_EXCEPTION;
        }
        return UTILSOFSCPROCESSSECINTERFACEEP_WSDL_LOCATION;
    }

}
