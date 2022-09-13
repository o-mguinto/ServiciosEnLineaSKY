
package mx.com.sky.sel.proxyclients.selinterface.consultarregimenfiscalselinterface;

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
@WebServiceClient(name = "ConsultarRegimenFiscal_ep",
                  targetNamespace = "http://xmlns.sky.com.mx/InterfaceServices/Sel/ConsultarRegimenFiscal",
                  wsdlLocation =
                  "https://qaselsoa.sky.com.mx/soa-infra/services/SEL_Interface/ConsultarRegimenFiscalSelInterface/ConsultarRegimenFiscal_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.sky.com.mx%2FInterfaceServices%2FSel%2FConsultarRegimenFiscal%7DConsultarRegimenFiscal_ep")
public class ConsultarRegimenFiscalEp extends Service {

    private final static URL CONSULTARREGIMENFISCALEP_WSDL_LOCATION;
    private final static WebServiceException CONSULTARREGIMENFISCALEP_EXCEPTION;
    private final static QName CONSULTARREGIMENFISCALEP_QNAME =
        new QName("http://xmlns.sky.com.mx/InterfaceServices/Sel/ConsultarRegimenFiscal", "ConsultarRegimenFiscal_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://qaselsoa.sky.com.mx/soa-infra/services/SEL_Interface/ConsultarRegimenFiscalSelInterface/ConsultarRegimenFiscal_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.sky.com.mx%2FInterfaceServices%2FSel%2FConsultarRegimenFiscal%7DConsultarRegimenFiscal_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONSULTARREGIMENFISCALEP_WSDL_LOCATION = url;
        CONSULTARREGIMENFISCALEP_EXCEPTION = e;
    }

    public ConsultarRegimenFiscalEp() {
        super(__getWsdlLocation(), CONSULTARREGIMENFISCALEP_QNAME);
    }

    public ConsultarRegimenFiscalEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONSULTARREGIMENFISCALEP_QNAME, features);
    }

    public ConsultarRegimenFiscalEp(URL wsdlLocation) {
        super(wsdlLocation, CONSULTARREGIMENFISCALEP_QNAME);
    }

    public ConsultarRegimenFiscalEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONSULTARREGIMENFISCALEP_QNAME, features);
    }

    public ConsultarRegimenFiscalEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultarRegimenFiscalEp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ConsultarRegimenFiscal
     */
    @WebEndpoint(name = "ConsultarRegimenFiscal_pt")
    public ConsultarRegimenFiscal getConsultarRegimenFiscalPt() {
        return super.getPort(new QName("http://xmlns.sky.com.mx/InterfaceServices/Sel/ConsultarRegimenFiscal",
                                       "ConsultarRegimenFiscal_pt"), ConsultarRegimenFiscal.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultarRegimenFiscal
     */
    @WebEndpoint(name = "ConsultarRegimenFiscal_pt")
    public ConsultarRegimenFiscal getConsultarRegimenFiscalPt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.sky.com.mx/InterfaceServices/Sel/ConsultarRegimenFiscal",
                                       "ConsultarRegimenFiscal_pt"), ConsultarRegimenFiscal.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONSULTARREGIMENFISCALEP_EXCEPTION != null) {
            throw CONSULTARREGIMENFISCALEP_EXCEPTION;
        }
        return CONSULTARREGIMENFISCALEP_WSDL_LOCATION;
    }

}
