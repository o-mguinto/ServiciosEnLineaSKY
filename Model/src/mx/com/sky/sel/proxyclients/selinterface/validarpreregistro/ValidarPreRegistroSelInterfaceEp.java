
package mx.com.sky.sel.proxyclients.selinterface.validarpreregistro;

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
@WebServiceClient(name = "ValidarPreRegistroSelInterface_ep",
                  targetNamespace = "http://xmlns.sky.com.mx/InterfaceServices/Sel/ValidarPreRegistroSel",
                  wsdlLocation =
                  "https://qaselsoa.sky.com.mx:443/soa-infra/services/SEL_Interface/ValidarPreRegistroSelInterface/ValidarPreRegistroSelInterface_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.sky.com.mx%2FInterfaceServices%2FSel%2FValidarPreRegistroSel%7DValidarPreRegistroSelInterface_ep")
public class ValidarPreRegistroSelInterfaceEp extends Service {

    private final static URL VALIDARPREREGISTROSELINTERFACEEP_WSDL_LOCATION;
    private final static WebServiceException VALIDARPREREGISTROSELINTERFACEEP_EXCEPTION;
    private final static QName VALIDARPREREGISTROSELINTERFACEEP_QNAME =
        new QName("http://xmlns.sky.com.mx/InterfaceServices/Sel/ValidarPreRegistroSel",
                  "ValidarPreRegistroSelInterface_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://qaselsoa.sky.com.mx:443/soa-infra/services/SEL_Interface/ValidarPreRegistroSelInterface/ValidarPreRegistroSelInterface_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.sky.com.mx%2FInterfaceServices%2FSel%2FValidarPreRegistroSel%7DValidarPreRegistroSelInterface_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VALIDARPREREGISTROSELINTERFACEEP_WSDL_LOCATION = url;
        VALIDARPREREGISTROSELINTERFACEEP_EXCEPTION = e;
    }

    public ValidarPreRegistroSelInterfaceEp() {
        super(__getWsdlLocation(), VALIDARPREREGISTROSELINTERFACEEP_QNAME);
    }

    public ValidarPreRegistroSelInterfaceEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), VALIDARPREREGISTROSELINTERFACEEP_QNAME, features);
    }

    public ValidarPreRegistroSelInterfaceEp(URL wsdlLocation) {
        super(wsdlLocation, VALIDARPREREGISTROSELINTERFACEEP_QNAME);
    }

    public ValidarPreRegistroSelInterfaceEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VALIDARPREREGISTROSELINTERFACEEP_QNAME, features);
    }

    public ValidarPreRegistroSelInterfaceEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ValidarPreRegistroSelInterfaceEp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ValidarPreRegistroSelInterface
     */
    @WebEndpoint(name = "ValidarPreRegistroSelInterface_pt")
    public ValidarPreRegistroSelInterface getValidarPreRegistroSelInterfacePt() {
        return super.getPort(new QName("http://xmlns.sky.com.mx/InterfaceServices/Sel/ValidarPreRegistroSel",
                                       "ValidarPreRegistroSelInterface_pt"), ValidarPreRegistroSelInterface.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ValidarPreRegistroSelInterface
     */
    @WebEndpoint(name = "ValidarPreRegistroSelInterface_pt")
    public ValidarPreRegistroSelInterface getValidarPreRegistroSelInterfacePt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.sky.com.mx/InterfaceServices/Sel/ValidarPreRegistroSel",
                                       "ValidarPreRegistroSelInterface_pt"), ValidarPreRegistroSelInterface.class,
                             features);
    }

    private static URL __getWsdlLocation() {
        if (VALIDARPREREGISTROSELINTERFACEEP_EXCEPTION != null) {
            throw VALIDARPREREGISTROSELINTERFACEEP_EXCEPTION;
        }
        return VALIDARPREREGISTROSELINTERFACEEP_WSDL_LOCATION;
    }

}
