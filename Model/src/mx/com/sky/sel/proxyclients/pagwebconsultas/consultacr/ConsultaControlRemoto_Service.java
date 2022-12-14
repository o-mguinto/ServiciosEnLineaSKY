
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultacr;

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
@WebServiceClient(name = "ConsultaControlRemoto", targetNamespace = "http://xmlns.oracle.com/ConsultaControlRemoto",
                  wsdlLocation =
                  "https://qaselsoa.sky.com.mx:443/soa-infra/services/pagwebconsultas/ConsultaControlRemoto/client?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FConsultaControlRemoto%7DConsultaControlRemoto")
public class ConsultaControlRemoto_Service extends Service {

    private final static URL CONSULTACONTROLREMOTO_WSDL_LOCATION;
    private final static WebServiceException CONSULTACONTROLREMOTO_EXCEPTION;
    private final static QName CONSULTACONTROLREMOTO_QNAME =
        new QName("http://xmlns.oracle.com/ConsultaControlRemoto", "ConsultaControlRemoto");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://qaselsoa.sky.com.mx:443/soa-infra/services/pagwebconsultas/ConsultaControlRemoto/client?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FConsultaControlRemoto%7DConsultaControlRemoto");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONSULTACONTROLREMOTO_WSDL_LOCATION = url;
        CONSULTACONTROLREMOTO_EXCEPTION = e;
    }

    public ConsultaControlRemoto_Service() {
        super(__getWsdlLocation(), CONSULTACONTROLREMOTO_QNAME);
    }

    public ConsultaControlRemoto_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONSULTACONTROLREMOTO_QNAME, features);
    }

    public ConsultaControlRemoto_Service(URL wsdlLocation) {
        super(wsdlLocation, CONSULTACONTROLREMOTO_QNAME);
    }

    public ConsultaControlRemoto_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONSULTACONTROLREMOTO_QNAME, features);
    }

    public ConsultaControlRemoto_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultaControlRemoto_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ConsultaControlRemoto
     */
    @WebEndpoint(name = "ConsultaControlRemoto")
    public ConsultaControlRemoto getConsultaControlRemoto() {
        return super.getPort(new QName("http://xmlns.oracle.com/ConsultaControlRemoto", "ConsultaControlRemoto"),
                             ConsultaControlRemoto.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaControlRemoto
     */
    @WebEndpoint(name = "ConsultaControlRemoto")
    public ConsultaControlRemoto getConsultaControlRemoto(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/ConsultaControlRemoto", "ConsultaControlRemoto"),
                             ConsultaControlRemoto.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONSULTACONTROLREMOTO_EXCEPTION != null) {
            throw CONSULTACONTROLREMOTO_EXCEPTION;
        }
        return CONSULTACONTROLREMOTO_WSDL_LOCATION;
    }

}
