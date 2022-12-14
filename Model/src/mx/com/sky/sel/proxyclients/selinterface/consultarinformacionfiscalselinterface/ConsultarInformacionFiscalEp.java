
package mx.com.sky.sel.proxyclients.selinterface.consultarinformacionfiscalselinterface;

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
@WebServiceClient(name = "ConsultarInformacionFiscal_ep",
                  targetNamespace = "http://xmlns.sky.com.mx/InterfaceServices/Sel/ConsultarInformacionFiscal",
                  wsdlLocation =
                  "https://qaselsoa.sky.com.mx/soa-infra/services/SEL_Interface/ConsultarInformacionFiscalSelInterface/ConsultarInformacionFiscal_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.sky.com.mx%2FInterfaceServices%2FSel%2FConsultarInformacionFiscal%7DConsultarInformacionFiscal_ep")
public class ConsultarInformacionFiscalEp extends Service {

    private final static URL CONSULTARINFORMACIONFISCALEP_WSDL_LOCATION;
    private final static WebServiceException CONSULTARINFORMACIONFISCALEP_EXCEPTION;
    private final static QName CONSULTARINFORMACIONFISCALEP_QNAME =
        new QName("http://xmlns.sky.com.mx/InterfaceServices/Sel/ConsultarInformacionFiscal",
                  "ConsultarInformacionFiscal_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://qaselsoa.sky.com.mx/soa-infra/services/SEL_Interface/ConsultarInformacionFiscalSelInterface/ConsultarInformacionFiscal_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.sky.com.mx%2FInterfaceServices%2FSel%2FConsultarInformacionFiscal%7DConsultarInformacionFiscal_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONSULTARINFORMACIONFISCALEP_WSDL_LOCATION = url;
        CONSULTARINFORMACIONFISCALEP_EXCEPTION = e;
    }

    public ConsultarInformacionFiscalEp() {
        super(__getWsdlLocation(), CONSULTARINFORMACIONFISCALEP_QNAME);
    }

    public ConsultarInformacionFiscalEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONSULTARINFORMACIONFISCALEP_QNAME, features);
    }

    public ConsultarInformacionFiscalEp(URL wsdlLocation) {
        super(wsdlLocation, CONSULTARINFORMACIONFISCALEP_QNAME);
    }

    public ConsultarInformacionFiscalEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONSULTARINFORMACIONFISCALEP_QNAME, features);
    }

    public ConsultarInformacionFiscalEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultarInformacionFiscalEp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ConsultarInformacionFiscal
     */
    @WebEndpoint(name = "ConsultarInformacionFiscal_pt")
    public ConsultarInformacionFiscal getConsultarInformacionFiscalPt() {
        return super.getPort(new QName("http://xmlns.sky.com.mx/InterfaceServices/Sel/ConsultarInformacionFiscal",
                                       "ConsultarInformacionFiscal_pt"), ConsultarInformacionFiscal.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultarInformacionFiscal
     */
    @WebEndpoint(name = "ConsultarInformacionFiscal_pt")
    public ConsultarInformacionFiscal getConsultarInformacionFiscalPt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.sky.com.mx/InterfaceServices/Sel/ConsultarInformacionFiscal",
                                       "ConsultarInformacionFiscal_pt"), ConsultarInformacionFiscal.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONSULTARINFORMACIONFISCALEP_EXCEPTION != null) {
            throw CONSULTARINFORMACIONFISCALEP_EXCEPTION;
        }
        return CONSULTARINFORMACIONFISCALEP_WSDL_LOCATION;
    }

}
