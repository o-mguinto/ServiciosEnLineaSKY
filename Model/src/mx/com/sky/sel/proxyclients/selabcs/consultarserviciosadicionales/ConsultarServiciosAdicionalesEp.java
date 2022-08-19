
package mx.com.sky.sel.proxyclients.selabcs.consultarserviciosadicionales;

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
@WebServiceClient(name = "ConsultarServiciosAdicionales_ep",
                  targetNamespace = "http://xmlns.sky.com.mx/ABCSImpl/Sel/ConsultarServiciosAdicionales",
                  wsdlLocation =
                  "https://preselsoa.sky.com.mx:443/soa-infra/services/SEL_ABCS/ConsultarServiciosAdicionalesSelABCS/ConsultarServiciosAdicionales_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.sky.com.mx%2FABCSImpl%2FSel%2FConsultarServiciosAdicionales%7DConsultarServiciosAdicionales_ep")
public class ConsultarServiciosAdicionalesEp extends Service {

    private final static URL CONSULTARSERVICIOSADICIONALESEP_WSDL_LOCATION;
    private final static WebServiceException CONSULTARSERVICIOSADICIONALESEP_EXCEPTION;
    private final static QName CONSULTARSERVICIOSADICIONALESEP_QNAME =
        new QName("http://xmlns.sky.com.mx/ABCSImpl/Sel/ConsultarServiciosAdicionales",
                  "ConsultarServiciosAdicionales_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://preselsoa.sky.com.mx:443/soa-infra/services/SEL_ABCS/ConsultarServiciosAdicionalesSelABCS/ConsultarServiciosAdicionales_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.sky.com.mx%2FABCSImpl%2FSel%2FConsultarServiciosAdicionales%7DConsultarServiciosAdicionales_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONSULTARSERVICIOSADICIONALESEP_WSDL_LOCATION = url;
        CONSULTARSERVICIOSADICIONALESEP_EXCEPTION = e;
    }

    public ConsultarServiciosAdicionalesEp() {
        super(__getWsdlLocation(), CONSULTARSERVICIOSADICIONALESEP_QNAME);
    }

    public ConsultarServiciosAdicionalesEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONSULTARSERVICIOSADICIONALESEP_QNAME, features);
    }

    public ConsultarServiciosAdicionalesEp(URL wsdlLocation) {
        super(wsdlLocation, CONSULTARSERVICIOSADICIONALESEP_QNAME);
    }

    public ConsultarServiciosAdicionalesEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONSULTARSERVICIOSADICIONALESEP_QNAME, features);
    }

    public ConsultarServiciosAdicionalesEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultarServiciosAdicionalesEp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ConsultarServiciosAdicionales
     */
    @WebEndpoint(name = "ConsultarServiciosAdicionales_pt")
    public ConsultarServiciosAdicionales getConsultarServiciosAdicionalesPt() {
        return super.getPort(new QName("http://xmlns.sky.com.mx/ABCSImpl/Sel/ConsultarServiciosAdicionales",
                                       "ConsultarServiciosAdicionales_pt"), ConsultarServiciosAdicionales.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultarServiciosAdicionales
     */
    @WebEndpoint(name = "ConsultarServiciosAdicionales_pt")
    public ConsultarServiciosAdicionales getConsultarServiciosAdicionalesPt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.sky.com.mx/ABCSImpl/Sel/ConsultarServiciosAdicionales",
                                       "ConsultarServiciosAdicionales_pt"), ConsultarServiciosAdicionales.class,
                             features);
    }

    private static URL __getWsdlLocation() {
        if (CONSULTARSERVICIOSADICIONALESEP_EXCEPTION != null) {
            throw CONSULTARSERVICIOSADICIONALESEP_EXCEPTION;
        }
        return CONSULTARSERVICIOSADICIONALESEP_WSDL_LOCATION;
    }

}