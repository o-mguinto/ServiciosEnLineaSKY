
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultaladas;

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
@WebServiceClient(name = "consultaladas_client_ep",
                  targetNamespace = "http://xmlns.oracle.com/SKYConsultas/ConsultaLadas/ConsultaLadas",
                  wsdlLocation =
                  "https://preselsoa.sky.com.mx:443/soa-infra/services/pagwebconsultas/ConsultaLadas/consultaladas_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FSKYConsultas%2FConsultaLadas%2FConsultaLadas%7Dconsultaladas_client_ep")
public class ConsultaladasClientEp extends Service {

    private final static URL CONSULTALADASCLIENTEP_WSDL_LOCATION;
    private final static WebServiceException CONSULTALADASCLIENTEP_EXCEPTION;
    private final static QName CONSULTALADASCLIENTEP_QNAME =
        new QName("http://xmlns.oracle.com/SKYConsultas/ConsultaLadas/ConsultaLadas", "consultaladas_client_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://preselsoa.sky.com.mx:443/soa-infra/services/pagwebconsultas/ConsultaLadas/consultaladas_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FSKYConsultas%2FConsultaLadas%2FConsultaLadas%7Dconsultaladas_client_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONSULTALADASCLIENTEP_WSDL_LOCATION = url;
        CONSULTALADASCLIENTEP_EXCEPTION = e;
    }

    public ConsultaladasClientEp() {
        super(__getWsdlLocation(), CONSULTALADASCLIENTEP_QNAME);
    }

    public ConsultaladasClientEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONSULTALADASCLIENTEP_QNAME, features);
    }

    public ConsultaladasClientEp(URL wsdlLocation) {
        super(wsdlLocation, CONSULTALADASCLIENTEP_QNAME);
    }

    public ConsultaladasClientEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONSULTALADASCLIENTEP_QNAME, features);
    }

    public ConsultaladasClientEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultaladasClientEp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ConsultaLadas
     */
    @WebEndpoint(name = "ConsultaLadas_pt")
    public ConsultaLadas getConsultaLadasPt() {
        return super.getPort(new QName("http://xmlns.oracle.com/SKYConsultas/ConsultaLadas/ConsultaLadas",
                                       "ConsultaLadas_pt"), ConsultaLadas.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaLadas
     */
    @WebEndpoint(name = "ConsultaLadas_pt")
    public ConsultaLadas getConsultaLadasPt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/SKYConsultas/ConsultaLadas/ConsultaLadas",
                                       "ConsultaLadas_pt"), ConsultaLadas.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONSULTALADASCLIENTEP_EXCEPTION != null) {
            throw CONSULTALADASCLIENTEP_EXCEPTION;
        }
        return CONSULTALADASCLIENTEP_WSDL_LOCATION;
    }

}