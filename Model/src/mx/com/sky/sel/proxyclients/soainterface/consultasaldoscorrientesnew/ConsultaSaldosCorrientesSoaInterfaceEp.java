
package mx.com.sky.sel.proxyclients.soainterface.consultasaldoscorrientesnew;

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
@WebServiceClient(name = "ConsultaSaldosCorrientesSoaInterface_ep",
                  targetNamespace =
                  "http://xmlns.sky.com.mx/InterfaceServices/Soa/ConsultaSaldosCorrientes",
                  wsdlLocation =
                  "https://qaselsoa.sky.com.mx:443/soa-infra/services/SOA_Interface/ConsultaSaldosCorrientesSoaInterface/ConsultaSaldosCorrientesSoaInterface_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.sky.com.mx%2FInterfaceServices%2FSoa%2FConsultaSaldosCorrientes%7DConsultaSaldosCorrientesSoaInterface_ep")
public class ConsultaSaldosCorrientesSoaInterfaceEp extends Service {

    private final static URL CONSULTASALDOSCORRIENTESSOAINTERFACEEP_WSDL_LOCATION;
    private final static WebServiceException CONSULTASALDOSCORRIENTESSOAINTERFACEEP_EXCEPTION;
    private final static QName CONSULTASALDOSCORRIENTESSOAINTERFACEEP_QNAME =
        new QName("http://xmlns.sky.com.mx/InterfaceServices/Soa/ConsultaSaldosCorrientes",
                  "ConsultaSaldosCorrientesSoaInterface_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://qaselsoa.sky.com.mx:443/soa-infra/services/SOA_Interface/ConsultaSaldosCorrientesSoaInterface/ConsultaSaldosCorrientesSoaInterface_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.sky.com.mx%2FInterfaceServices%2FSoa%2FConsultaSaldosCorrientes%7DConsultaSaldosCorrientesSoaInterface_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONSULTASALDOSCORRIENTESSOAINTERFACEEP_WSDL_LOCATION = url;
        CONSULTASALDOSCORRIENTESSOAINTERFACEEP_EXCEPTION = e;
    }

    public ConsultaSaldosCorrientesSoaInterfaceEp() {
        super(__getWsdlLocation(),
              CONSULTASALDOSCORRIENTESSOAINTERFACEEP_QNAME);
    }

    public ConsultaSaldosCorrientesSoaInterfaceEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONSULTASALDOSCORRIENTESSOAINTERFACEEP_QNAME,
              features);
    }

    public ConsultaSaldosCorrientesSoaInterfaceEp(URL wsdlLocation) {
        super(wsdlLocation, CONSULTASALDOSCORRIENTESSOAINTERFACEEP_QNAME);
    }

    public ConsultaSaldosCorrientesSoaInterfaceEp(URL wsdlLocation,
                                                  WebServiceFeature... features) {
        super(wsdlLocation, CONSULTASALDOSCORRIENTESSOAINTERFACEEP_QNAME,
              features);
    }

    public ConsultaSaldosCorrientesSoaInterfaceEp(URL wsdlLocation,
                                                  QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultaSaldosCorrientesSoaInterfaceEp(URL wsdlLocation,
                                                  QName serviceName,
                                                  WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ConsultaSaldosCorrientesSoaInterface
     */
    @WebEndpoint(name = "ConsultaSaldosCorrientesSoaInterface_pt")
    public ConsultaSaldosCorrientesSoaInterface getConsultaSaldosCorrientesSoaInterfacePt() {
        return super.getPort(new QName("http://xmlns.sky.com.mx/InterfaceServices/Soa/ConsultaSaldosCorrientes",
                                       "ConsultaSaldosCorrientesSoaInterface_pt"),
                             ConsultaSaldosCorrientesSoaInterface.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaSaldosCorrientesSoaInterface
     */
    @WebEndpoint(name = "ConsultaSaldosCorrientesSoaInterface_pt")
    public ConsultaSaldosCorrientesSoaInterface getConsultaSaldosCorrientesSoaInterfacePt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.sky.com.mx/InterfaceServices/Soa/ConsultaSaldosCorrientes",
                                       "ConsultaSaldosCorrientesSoaInterface_pt"),
                             ConsultaSaldosCorrientesSoaInterface.class,
                             features);
    }

    private static URL __getWsdlLocation() {
        if (CONSULTASALDOSCORRIENTESSOAINTERFACEEP_EXCEPTION != null) {
            throw CONSULTASALDOSCORRIENTESSOAINTERFACEEP_EXCEPTION;
        }
        return CONSULTASALDOSCORRIENTESSOAINTERFACEEP_WSDL_LOCATION;
    }

}
