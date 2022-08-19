
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultaaplicapenvetvca;

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
@WebServiceClient(name = "ConsultaAplicaPenalizacionVeTVCA",
                  targetNamespace = "http://xmlns.oracle.com/ConsultaAplicaPenalizacionVeTVCA",
                  wsdlLocation =
                  "https://preselsoa.sky.com.mx:443/soa-infra/services/pagwebconsultas/ConsultaAplicaPenalizacionVeTVCA/client?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FConsultaAplicaPenalizacionVeTVCA%7DConsultaAplicaPenalizacionVeTVCA")
public class ConsultaAplicaPenalizacionVeTVCA_Service extends Service {

    private final static URL CONSULTAAPLICAPENALIZACIONVETVCA_WSDL_LOCATION;
    private final static WebServiceException CONSULTAAPLICAPENALIZACIONVETVCA_EXCEPTION;
    private final static QName CONSULTAAPLICAPENALIZACIONVETVCA_QNAME =
        new QName("http://xmlns.oracle.com/ConsultaAplicaPenalizacionVeTVCA", "ConsultaAplicaPenalizacionVeTVCA");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://preselsoa.sky.com.mx:443/soa-infra/services/pagwebconsultas/ConsultaAplicaPenalizacionVeTVCA/client?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FConsultaAplicaPenalizacionVeTVCA%7DConsultaAplicaPenalizacionVeTVCA");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONSULTAAPLICAPENALIZACIONVETVCA_WSDL_LOCATION = url;
        CONSULTAAPLICAPENALIZACIONVETVCA_EXCEPTION = e;
    }

    public ConsultaAplicaPenalizacionVeTVCA_Service() {
        super(__getWsdlLocation(), CONSULTAAPLICAPENALIZACIONVETVCA_QNAME);
    }

    public ConsultaAplicaPenalizacionVeTVCA_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONSULTAAPLICAPENALIZACIONVETVCA_QNAME, features);
    }

    public ConsultaAplicaPenalizacionVeTVCA_Service(URL wsdlLocation) {
        super(wsdlLocation, CONSULTAAPLICAPENALIZACIONVETVCA_QNAME);
    }

    public ConsultaAplicaPenalizacionVeTVCA_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONSULTAAPLICAPENALIZACIONVETVCA_QNAME, features);
    }

    public ConsultaAplicaPenalizacionVeTVCA_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultaAplicaPenalizacionVeTVCA_Service(URL wsdlLocation, QName serviceName,
                                                    WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ConsultaAplicaPenalizacionVeTVCA
     */
    @WebEndpoint(name = "ConsultaAplicaPenalizacionVeTVCA")
    public ConsultaAplicaPenalizacionVeTVCA getConsultaAplicaPenalizacionVeTVCA() {
        return super.getPort(new QName("http://xmlns.oracle.com/ConsultaAplicaPenalizacionVeTVCA",
                                       "ConsultaAplicaPenalizacionVeTVCA"), ConsultaAplicaPenalizacionVeTVCA.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaAplicaPenalizacionVeTVCA
     */
    @WebEndpoint(name = "ConsultaAplicaPenalizacionVeTVCA")
    public ConsultaAplicaPenalizacionVeTVCA getConsultaAplicaPenalizacionVeTVCA(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/ConsultaAplicaPenalizacionVeTVCA",
                                       "ConsultaAplicaPenalizacionVeTVCA"), ConsultaAplicaPenalizacionVeTVCA.class,
                             features);
    }

    private static URL __getWsdlLocation() {
        if (CONSULTAAPLICAPENALIZACIONVETVCA_EXCEPTION != null) {
            throw CONSULTAAPLICAPENALIZACIONVETVCA_EXCEPTION;
        }
        return CONSULTAAPLICAPENALIZACIONVETVCA_WSDL_LOCATION;
    }

}