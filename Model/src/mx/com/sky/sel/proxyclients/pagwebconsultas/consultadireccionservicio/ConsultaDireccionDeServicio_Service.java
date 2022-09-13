
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultadireccionservicio;

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
@WebServiceClient(name = "ConsultaDireccionDeServicio",
                  targetNamespace = "http://xmlns.oracle.com/ConsultaDireccionDeServicio",
                  wsdlLocation =
                  "https://qaselsoa.sky.com.mx:443/soa-infra/services/pagwebconsultas/ConsultaDireccionDeServicio/client?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FConsultaDireccionDeServicio%7DConsultaDireccionDeServicio")
public class ConsultaDireccionDeServicio_Service extends Service {

    private final static URL CONSULTADIRECCIONDESERVICIO_WSDL_LOCATION;
    private final static WebServiceException CONSULTADIRECCIONDESERVICIO_EXCEPTION;
    private final static QName CONSULTADIRECCIONDESERVICIO_QNAME =
        new QName("http://xmlns.oracle.com/ConsultaDireccionDeServicio", "ConsultaDireccionDeServicio");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://qaselsoa.sky.com.mx:443/soa-infra/services/pagwebconsultas/ConsultaDireccionDeServicio/client?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FConsultaDireccionDeServicio%7DConsultaDireccionDeServicio");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONSULTADIRECCIONDESERVICIO_WSDL_LOCATION = url;
        CONSULTADIRECCIONDESERVICIO_EXCEPTION = e;
    }

    public ConsultaDireccionDeServicio_Service() {
        super(__getWsdlLocation(), CONSULTADIRECCIONDESERVICIO_QNAME);
    }

    public ConsultaDireccionDeServicio_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONSULTADIRECCIONDESERVICIO_QNAME, features);
    }

    public ConsultaDireccionDeServicio_Service(URL wsdlLocation) {
        super(wsdlLocation, CONSULTADIRECCIONDESERVICIO_QNAME);
    }

    public ConsultaDireccionDeServicio_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONSULTADIRECCIONDESERVICIO_QNAME, features);
    }

    public ConsultaDireccionDeServicio_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultaDireccionDeServicio_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ConsultaDireccionDeServicio
     */
    @WebEndpoint(name = "ConsultaDireccionDeServicio")
    public ConsultaDireccionDeServicio getConsultaDireccionDeServicio() {
        return super.getPort(new QName("http://xmlns.oracle.com/ConsultaDireccionDeServicio",
                                       "ConsultaDireccionDeServicio"), ConsultaDireccionDeServicio.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaDireccionDeServicio
     */
    @WebEndpoint(name = "ConsultaDireccionDeServicio")
    public ConsultaDireccionDeServicio getConsultaDireccionDeServicio(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/ConsultaDireccionDeServicio",
                                       "ConsultaDireccionDeServicio"), ConsultaDireccionDeServicio.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONSULTADIRECCIONDESERVICIO_EXCEPTION != null) {
            throw CONSULTADIRECCIONDESERVICIO_EXCEPTION;
        }
        return CONSULTADIRECCIONDESERVICIO_WSDL_LOCATION;
    }

}
