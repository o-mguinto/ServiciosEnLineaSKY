
package mx.com.sky.sel.proxyclients.rnsoa.generaurlchat;

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
@WebServiceClient(name = "GeneraURLChatRNInterfaceSOAP_ep",
                  targetNamespace = "http://xmlns.sky.com.mx/GeneraURLChatRNInterfaceEBFS/GeneraURLChatRNInterface",
                  wsdlLocation =
                  "https://qaselsoa.sky.com.mx:443/soa-infra/services/RNSOA/GeneraURLChatRNInterfaceEBFS/GeneraURLChatRNInterfaceSOAP_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.sky.com.mx%2FGeneraURLChatRNInterfaceEBFS%2FGeneraURLChatRNInterface%7DGeneraURLChatRNInterfaceSOAP_ep")
public class GeneraURLChatRNInterfaceSOAPEp extends Service {

    private final static URL GENERAURLCHATRNINTERFACESOAPEP_WSDL_LOCATION;
    private final static WebServiceException GENERAURLCHATRNINTERFACESOAPEP_EXCEPTION;
    private final static QName GENERAURLCHATRNINTERFACESOAPEP_QNAME =
        new QName("http://xmlns.sky.com.mx/GeneraURLChatRNInterfaceEBFS/GeneraURLChatRNInterface",
                  "GeneraURLChatRNInterfaceSOAP_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://qaselsoa.sky.com.mx:443/soa-infra/services/RNSOA/GeneraURLChatRNInterfaceEBFS/GeneraURLChatRNInterfaceSOAP_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.sky.com.mx%2FGeneraURLChatRNInterfaceEBFS%2FGeneraURLChatRNInterface%7DGeneraURLChatRNInterfaceSOAP_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GENERAURLCHATRNINTERFACESOAPEP_WSDL_LOCATION = url;
        GENERAURLCHATRNINTERFACESOAPEP_EXCEPTION = e;
    }

    public GeneraURLChatRNInterfaceSOAPEp() {
        super(__getWsdlLocation(), GENERAURLCHATRNINTERFACESOAPEP_QNAME);
    }

    public GeneraURLChatRNInterfaceSOAPEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), GENERAURLCHATRNINTERFACESOAPEP_QNAME, features);
    }

    public GeneraURLChatRNInterfaceSOAPEp(URL wsdlLocation) {
        super(wsdlLocation, GENERAURLCHATRNINTERFACESOAPEP_QNAME);
    }

    public GeneraURLChatRNInterfaceSOAPEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GENERAURLCHATRNINTERFACESOAPEP_QNAME, features);
    }

    public GeneraURLChatRNInterfaceSOAPEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GeneraURLChatRNInterfaceSOAPEp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns GeneraURLChatRNInterface
     */
    @WebEndpoint(name = "GeneraURLChatRNInterface_pt")
    public GeneraURLChatRNInterface getGeneraURLChatRNInterfacePt() {
        return super.getPort(new QName("http://xmlns.sky.com.mx/GeneraURLChatRNInterfaceEBFS/GeneraURLChatRNInterface",
                                       "GeneraURLChatRNInterface_pt"), GeneraURLChatRNInterface.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GeneraURLChatRNInterface
     */
    @WebEndpoint(name = "GeneraURLChatRNInterface_pt")
    public GeneraURLChatRNInterface getGeneraURLChatRNInterfacePt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.sky.com.mx/GeneraURLChatRNInterfaceEBFS/GeneraURLChatRNInterface",
                                       "GeneraURLChatRNInterface_pt"), GeneraURLChatRNInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GENERAURLCHATRNINTERFACESOAPEP_EXCEPTION != null) {
            throw GENERAURLCHATRNINTERFACESOAPEP_EXCEPTION;
        }
        return GENERAURLCHATRNINTERFACESOAPEP_WSDL_LOCATION;
    }

}
