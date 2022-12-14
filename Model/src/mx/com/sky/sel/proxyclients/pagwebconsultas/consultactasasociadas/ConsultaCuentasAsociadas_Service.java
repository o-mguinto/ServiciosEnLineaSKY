
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultactasasociadas;

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
@WebServiceClient(name = "ConsultaCuentasAsociadas",
                  targetNamespace = "http://xmlns.oracle.com/ConsultaCuentasAsociadas",
                  wsdlLocation =
                  "https://qaselsoa.sky.com.mx:443/soa-infra/services/pagwebconsultas/ConsultaCuentasAsociadas/client?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FConsultaCuentasAsociadas%7DConsultaCuentasAsociadas")
public class ConsultaCuentasAsociadas_Service extends Service {

    private final static URL CONSULTACUENTASASOCIADAS_WSDL_LOCATION;
    private final static WebServiceException CONSULTACUENTASASOCIADAS_EXCEPTION;
    private final static QName CONSULTACUENTASASOCIADAS_QNAME =
        new QName("http://xmlns.oracle.com/ConsultaCuentasAsociadas", "ConsultaCuentasAsociadas");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://qaselsoa.sky.com.mx:443/soa-infra/services/pagwebconsultas/ConsultaCuentasAsociadas/client?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FConsultaCuentasAsociadas%7DConsultaCuentasAsociadas");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONSULTACUENTASASOCIADAS_WSDL_LOCATION = url;
        CONSULTACUENTASASOCIADAS_EXCEPTION = e;
    }

    public ConsultaCuentasAsociadas_Service() {
        super(__getWsdlLocation(), CONSULTACUENTASASOCIADAS_QNAME);
    }

    public ConsultaCuentasAsociadas_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONSULTACUENTASASOCIADAS_QNAME, features);
    }

    public ConsultaCuentasAsociadas_Service(URL wsdlLocation) {
        super(wsdlLocation, CONSULTACUENTASASOCIADAS_QNAME);
    }

    public ConsultaCuentasAsociadas_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONSULTACUENTASASOCIADAS_QNAME, features);
    }

    public ConsultaCuentasAsociadas_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultaCuentasAsociadas_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ConsultaCuentasAsociadas
     */
    @WebEndpoint(name = "ConsultaCuentasAsociadas")
    public ConsultaCuentasAsociadas getConsultaCuentasAsociadas() {
        return super.getPort(new QName("http://xmlns.oracle.com/ConsultaCuentasAsociadas", "ConsultaCuentasAsociadas"),
                             ConsultaCuentasAsociadas.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaCuentasAsociadas
     */
    @WebEndpoint(name = "ConsultaCuentasAsociadas")
    public ConsultaCuentasAsociadas getConsultaCuentasAsociadas(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/ConsultaCuentasAsociadas", "ConsultaCuentasAsociadas"),
                             ConsultaCuentasAsociadas.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONSULTACUENTASASOCIADAS_EXCEPTION != null) {
            throw CONSULTACUENTASASOCIADAS_EXCEPTION;
        }
        return CONSULTACUENTASASOCIADAS_WSDL_LOCATION;
    }

}
