
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultapagos;

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
@WebServiceClient(name = "ConsultaPagos", targetNamespace = "http://xmlns.oracle.com/ConsultaPagos",
                  wsdlLocation =
                  "https://qaselsoa.sky.com.mx:443/soa-infra/services/pagwebconsultas/ConsultaPagos/client?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FConsultaPagos%7DConsultaPagos")
public class ConsultaPagos_Service extends Service {

    private final static URL CONSULTAPAGOS_WSDL_LOCATION;
    private final static WebServiceException CONSULTAPAGOS_EXCEPTION;
    private final static QName CONSULTAPAGOS_QNAME =
        new QName("http://xmlns.oracle.com/ConsultaPagos", "ConsultaPagos");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://qaselsoa.sky.com.mx:443/soa-infra/services/pagwebconsultas/ConsultaPagos/client?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FConsultaPagos%7DConsultaPagos");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONSULTAPAGOS_WSDL_LOCATION = url;
        CONSULTAPAGOS_EXCEPTION = e;
    }

    public ConsultaPagos_Service() {
        super(__getWsdlLocation(), CONSULTAPAGOS_QNAME);
    }

    public ConsultaPagos_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONSULTAPAGOS_QNAME, features);
    }

    public ConsultaPagos_Service(URL wsdlLocation) {
        super(wsdlLocation, CONSULTAPAGOS_QNAME);
    }

    public ConsultaPagos_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONSULTAPAGOS_QNAME, features);
    }

    public ConsultaPagos_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultaPagos_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ConsultaPagos
     */
    @WebEndpoint(name = "ConsultaPagos")
    public ConsultaPagos getConsultaPagos() {
        return super.getPort(new QName("http://xmlns.oracle.com/ConsultaPagos", "ConsultaPagos"), ConsultaPagos.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaPagos
     */
    @WebEndpoint(name = "ConsultaPagos")
    public ConsultaPagos getConsultaPagos(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/ConsultaPagos", "ConsultaPagos"), ConsultaPagos.class,
                             features);
    }

    private static URL __getWsdlLocation() {
        if (CONSULTAPAGOS_EXCEPTION != null) {
            throw CONSULTAPAGOS_EXCEPTION;
        }
        return CONSULTAPAGOS_WSDL_LOCATION;
    }

}
