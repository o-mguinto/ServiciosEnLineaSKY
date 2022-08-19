
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultadatosgenerales;

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
@WebServiceClient(name = "consultadatosgenerales_client_ep",
                  targetNamespace =
                  "http://xmlns.oracle.com/SKYConsultas/ConsultaDatosGenerales/ConsultaDatosGenerales",
                  wsdlLocation =
                  "https://preselsoa.sky.com.mx:443/soa-infra/services/pagwebconsultas/ConsultaDatosGenerales/consultadatosgenerales_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FSKYConsultas%2FConsultaDatosGenerales%2FConsultaDatosGenerales%7Dconsultadatosgenerales_client_ep")
public class ConsultadatosgeneralesClientEp extends Service {

    private final static URL CONSULTADATOSGENERALESCLIENTEP_WSDL_LOCATION;
    private final static WebServiceException CONSULTADATOSGENERALESCLIENTEP_EXCEPTION;
    private final static QName CONSULTADATOSGENERALESCLIENTEP_QNAME =
        new QName("http://xmlns.oracle.com/SKYConsultas/ConsultaDatosGenerales/ConsultaDatosGenerales",
                  "consultadatosgenerales_client_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://preselsoa.sky.com.mx:443/soa-infra/services/pagwebconsultas/ConsultaDatosGenerales/consultadatosgenerales_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FSKYConsultas%2FConsultaDatosGenerales%2FConsultaDatosGenerales%7Dconsultadatosgenerales_client_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONSULTADATOSGENERALESCLIENTEP_WSDL_LOCATION = url;
        CONSULTADATOSGENERALESCLIENTEP_EXCEPTION = e;
    }

    public ConsultadatosgeneralesClientEp() {
        super(__getWsdlLocation(), CONSULTADATOSGENERALESCLIENTEP_QNAME);
    }

    public ConsultadatosgeneralesClientEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONSULTADATOSGENERALESCLIENTEP_QNAME, features);
    }

    public ConsultadatosgeneralesClientEp(URL wsdlLocation) {
        super(wsdlLocation, CONSULTADATOSGENERALESCLIENTEP_QNAME);
    }

    public ConsultadatosgeneralesClientEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONSULTADATOSGENERALESCLIENTEP_QNAME, features);
    }

    public ConsultadatosgeneralesClientEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultadatosgeneralesClientEp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ConsultaDatosGenerales
     */
    @WebEndpoint(name = "ConsultaDatosGenerales_pt")
    public ConsultaDatosGenerales getConsultaDatosGeneralesPt() {
        return super.getPort(new QName("http://xmlns.oracle.com/SKYConsultas/ConsultaDatosGenerales/ConsultaDatosGenerales",
                                       "ConsultaDatosGenerales_pt"), ConsultaDatosGenerales.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaDatosGenerales
     */
    @WebEndpoint(name = "ConsultaDatosGenerales_pt")
    public ConsultaDatosGenerales getConsultaDatosGeneralesPt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/SKYConsultas/ConsultaDatosGenerales/ConsultaDatosGenerales",
                                       "ConsultaDatosGenerales_pt"), ConsultaDatosGenerales.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONSULTADATOSGENERALESCLIENTEP_EXCEPTION != null) {
            throw CONSULTADATOSGENERALESCLIENTEP_EXCEPTION;
        }
        return CONSULTADATOSGENERALESCLIENTEP_WSDL_LOCATION;
    }

}