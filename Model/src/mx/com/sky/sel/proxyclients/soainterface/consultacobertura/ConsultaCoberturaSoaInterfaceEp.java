
package mx.com.sky.sel.proxyclients.soainterface.consultacobertura;

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
@WebServiceClient(name = "ConsultaCoberturaSoaInterface_ep",
                  targetNamespace = "http://xmlns.sky.com.mx/InterfaceServices/Soa/ConsultaCobertura",
                  wsdlLocation =
                  "https://qaselsoa.sky.com.mx:443/soa-infra/services/SOA_Interface/ConsultaCoberturaSoaInterface/ConsultaCoberturaSoaInterface_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.sky.com.mx%2FInterfaceServices%2FSoa%2FConsultaCobertura%7DConsultaCoberturaSoaInterface_ep")
public class ConsultaCoberturaSoaInterfaceEp extends Service {

    private final static URL CONSULTACOBERTURASOAINTERFACEEP_WSDL_LOCATION;
    private final static WebServiceException CONSULTACOBERTURASOAINTERFACEEP_EXCEPTION;
    private final static QName CONSULTACOBERTURASOAINTERFACEEP_QNAME =
        new QName("http://xmlns.sky.com.mx/InterfaceServices/Soa/ConsultaCobertura",
                  "ConsultaCoberturaSoaInterface_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://qaselsoa.sky.com.mx:443/soa-infra/services/SOA_Interface/ConsultaCoberturaSoaInterface/ConsultaCoberturaSoaInterface_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.sky.com.mx%2FInterfaceServices%2FSoa%2FConsultaCobertura%7DConsultaCoberturaSoaInterface_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONSULTACOBERTURASOAINTERFACEEP_WSDL_LOCATION = url;
        CONSULTACOBERTURASOAINTERFACEEP_EXCEPTION = e;
    }

    public ConsultaCoberturaSoaInterfaceEp() {
        super(__getWsdlLocation(), CONSULTACOBERTURASOAINTERFACEEP_QNAME);
    }

    public ConsultaCoberturaSoaInterfaceEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONSULTACOBERTURASOAINTERFACEEP_QNAME, features);
    }

    public ConsultaCoberturaSoaInterfaceEp(URL wsdlLocation) {
        super(wsdlLocation, CONSULTACOBERTURASOAINTERFACEEP_QNAME);
    }

    public ConsultaCoberturaSoaInterfaceEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONSULTACOBERTURASOAINTERFACEEP_QNAME, features);
    }

    public ConsultaCoberturaSoaInterfaceEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultaCoberturaSoaInterfaceEp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ConsultaCoberturaSoaInterface
     */
    @WebEndpoint(name = "ConsultaCoberturaSoaInterface_pt")
    public ConsultaCoberturaSoaInterface getConsultaCoberturaSoaInterfacePt() {
        return super.getPort(new QName("http://xmlns.sky.com.mx/InterfaceServices/Soa/ConsultaCobertura",
                                       "ConsultaCoberturaSoaInterface_pt"), ConsultaCoberturaSoaInterface.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaCoberturaSoaInterface
     */
    @WebEndpoint(name = "ConsultaCoberturaSoaInterface_pt")
    public ConsultaCoberturaSoaInterface getConsultaCoberturaSoaInterfacePt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.sky.com.mx/InterfaceServices/Soa/ConsultaCobertura",
                                       "ConsultaCoberturaSoaInterface_pt"), ConsultaCoberturaSoaInterface.class,
                             features);
    }

    private static URL __getWsdlLocation() {
        if (CONSULTACOBERTURASOAINTERFACEEP_EXCEPTION != null) {
            throw CONSULTACOBERTURASOAINTERFACEEP_EXCEPTION;
        }
        return CONSULTACOBERTURASOAINTERFACEEP_WSDL_LOCATION;
    }

}
