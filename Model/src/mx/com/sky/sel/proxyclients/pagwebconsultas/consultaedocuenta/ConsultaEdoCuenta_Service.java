
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultaedocuenta;

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
@WebServiceClient(name = "ConsultaEdoCuenta", targetNamespace = "http://xmlns.oracle.com/ConsultaEdoCuenta",
                  wsdlLocation =
                  "https://preselsoa.sky.com.mx:443/soa-infra/services/pagwebconsultas/ConsultaEdoCuenta/client?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FConsultaEdoCuenta%7DConsultaEdoCuenta")
public class ConsultaEdoCuenta_Service extends Service {

    private final static URL CONSULTAEDOCUENTA_WSDL_LOCATION;
    private final static WebServiceException CONSULTAEDOCUENTA_EXCEPTION;
    private final static QName CONSULTAEDOCUENTA_QNAME =
        new QName("http://xmlns.oracle.com/ConsultaEdoCuenta", "ConsultaEdoCuenta");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://preselsoa.sky.com.mx:443/soa-infra/services/pagwebconsultas/ConsultaEdoCuenta/client?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FConsultaEdoCuenta%7DConsultaEdoCuenta");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONSULTAEDOCUENTA_WSDL_LOCATION = url;
        CONSULTAEDOCUENTA_EXCEPTION = e;
    }

    public ConsultaEdoCuenta_Service() {
        super(__getWsdlLocation(), CONSULTAEDOCUENTA_QNAME);
    }

    public ConsultaEdoCuenta_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONSULTAEDOCUENTA_QNAME, features);
    }

    public ConsultaEdoCuenta_Service(URL wsdlLocation) {
        super(wsdlLocation, CONSULTAEDOCUENTA_QNAME);
    }

    public ConsultaEdoCuenta_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONSULTAEDOCUENTA_QNAME, features);
    }

    public ConsultaEdoCuenta_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultaEdoCuenta_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ConsultaEdoCuenta
     */
    @WebEndpoint(name = "ConsultaEdoCuenta")
    public ConsultaEdoCuenta getConsultaEdoCuenta() {
        return super.getPort(new QName("http://xmlns.oracle.com/ConsultaEdoCuenta", "ConsultaEdoCuenta"),
                             ConsultaEdoCuenta.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaEdoCuenta
     */
    @WebEndpoint(name = "ConsultaEdoCuenta")
    public ConsultaEdoCuenta getConsultaEdoCuenta(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/ConsultaEdoCuenta", "ConsultaEdoCuenta"),
                             ConsultaEdoCuenta.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONSULTAEDOCUENTA_EXCEPTION != null) {
            throw CONSULTAEDOCUENTA_EXCEPTION;
        }
        return CONSULTAEDOCUENTA_WSDL_LOCATION;
    }

}