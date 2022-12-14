
package mx.com.sky.sel.proxyclients.pagweb.opinionsugerencias;

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
@WebServiceClient(name = "Opinion_Sugerencias", targetNamespace = "http://xmlns.oracle.com/Opinion_Sugerencias",
                  wsdlLocation =
                  "https://qaselsoa.sky.com.mx:443/soa-infra/services/pagweb/Opinion_Sugerencias/client?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FOpinion_Sugerencias%7DOpinion_Sugerencias")
public class OpinionSugerencias_Service extends Service {

    private final static URL OPINIONSUGERENCIAS_WSDL_LOCATION;
    private final static WebServiceException OPINIONSUGERENCIAS_EXCEPTION;
    private final static QName OPINIONSUGERENCIAS_QNAME =
        new QName("http://xmlns.oracle.com/Opinion_Sugerencias", "Opinion_Sugerencias");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://qaselsoa.sky.com.mx:443/soa-infra/services/pagweb/Opinion_Sugerencias/client?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FOpinion_Sugerencias%7DOpinion_Sugerencias");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        OPINIONSUGERENCIAS_WSDL_LOCATION = url;
        OPINIONSUGERENCIAS_EXCEPTION = e;
    }

    public OpinionSugerencias_Service() {
        super(__getWsdlLocation(), OPINIONSUGERENCIAS_QNAME);
    }

    public OpinionSugerencias_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), OPINIONSUGERENCIAS_QNAME, features);
    }

    public OpinionSugerencias_Service(URL wsdlLocation) {
        super(wsdlLocation, OPINIONSUGERENCIAS_QNAME);
    }

    public OpinionSugerencias_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, OPINIONSUGERENCIAS_QNAME, features);
    }

    public OpinionSugerencias_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OpinionSugerencias_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns OpinionSugerencias
     */
    @WebEndpoint(name = "Opinion_Sugerencias")
    public OpinionSugerencias getOpinionSugerencias() {
        return super.getPort(new QName("http://xmlns.oracle.com/Opinion_Sugerencias", "Opinion_Sugerencias"),
                             OpinionSugerencias.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OpinionSugerencias
     */
    @WebEndpoint(name = "Opinion_Sugerencias")
    public OpinionSugerencias getOpinionSugerencias(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/Opinion_Sugerencias", "Opinion_Sugerencias"),
                             OpinionSugerencias.class, features);
    }

    private static URL __getWsdlLocation() {
        if (OPINIONSUGERENCIAS_EXCEPTION != null) {
            throw OPINIONSUGERENCIAS_EXCEPTION;
        }
        return OPINIONSUGERENCIAS_WSDL_LOCATION;
    }

}
