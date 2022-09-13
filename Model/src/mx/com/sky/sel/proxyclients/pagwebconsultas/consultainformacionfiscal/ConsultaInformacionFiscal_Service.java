
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultainformacionfiscal;

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
@WebServiceClient(name = "ConsultaInformacionFiscal",
                  targetNamespace = "http://xmlns.oracle.com/ConsultaInformacionFiscal",
                  wsdlLocation =
                  "https://qaselsoa.sky.com.mx:443/soa-infra/services/pagwebconsultas/ConsultaInformacionFiscal/client?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FConsultaInformacionFiscal%7DConsultaInformacionFiscal")
public class ConsultaInformacionFiscal_Service extends Service {

    private final static URL CONSULTAINFORMACIONFISCAL_WSDL_LOCATION;
    private final static WebServiceException CONSULTAINFORMACIONFISCAL_EXCEPTION;
    private final static QName CONSULTAINFORMACIONFISCAL_QNAME =
        new QName("http://xmlns.oracle.com/ConsultaInformacionFiscal", "ConsultaInformacionFiscal");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://qaselsoa.sky.com.mx:443/soa-infra/services/pagwebconsultas/ConsultaInformacionFiscal/client?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FConsultaInformacionFiscal%7DConsultaInformacionFiscal");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONSULTAINFORMACIONFISCAL_WSDL_LOCATION = url;
        CONSULTAINFORMACIONFISCAL_EXCEPTION = e;
    }

    public ConsultaInformacionFiscal_Service() {
        super(__getWsdlLocation(), CONSULTAINFORMACIONFISCAL_QNAME);
    }

    public ConsultaInformacionFiscal_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONSULTAINFORMACIONFISCAL_QNAME, features);
    }

    public ConsultaInformacionFiscal_Service(URL wsdlLocation) {
        super(wsdlLocation, CONSULTAINFORMACIONFISCAL_QNAME);
    }

    public ConsultaInformacionFiscal_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONSULTAINFORMACIONFISCAL_QNAME, features);
    }

    public ConsultaInformacionFiscal_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultaInformacionFiscal_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ConsultaInformacionFiscal
     */
    @WebEndpoint(name = "ConsultaInformacionFiscal")
    public ConsultaInformacionFiscal getConsultaInformacionFiscal() {
        return super.getPort(new QName("http://xmlns.oracle.com/ConsultaInformacionFiscal",
                                       "ConsultaInformacionFiscal"), ConsultaInformacionFiscal.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaInformacionFiscal
     */
    @WebEndpoint(name = "ConsultaInformacionFiscal")
    public ConsultaInformacionFiscal getConsultaInformacionFiscal(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/ConsultaInformacionFiscal",
                                       "ConsultaInformacionFiscal"), ConsultaInformacionFiscal.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONSULTAINFORMACIONFISCAL_EXCEPTION != null) {
            throw CONSULTAINFORMACIONFISCAL_EXCEPTION;
        }
        return CONSULTAINFORMACIONFISCAL_WSDL_LOCATION;
    }

}
