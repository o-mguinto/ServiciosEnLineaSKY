
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultafechascontrato;

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
@WebServiceClient(name = "consultafechascontratosky_client_ep",
                  targetNamespace =
                  "http://xmlns.oracle.com/SKYConsultas/ConsultaFechasContrato/ConsultaFechasContratoSKY",
                  wsdlLocation =
                  "https://preselsoa.sky.com.mx:443/soa-infra/services/pagwebconsultas/ConsultaFechasContrato/consultafechascontratosky_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FSKYConsultas%2FConsultaFechasContrato%2FConsultaFechasContratoSKY%7Dconsultafechascontratosky_client_ep")
public class ConsultafechascontratoskyClientEp extends Service {

    private final static URL CONSULTAFECHASCONTRATOSKYCLIENTEP_WSDL_LOCATION;
    private final static WebServiceException CONSULTAFECHASCONTRATOSKYCLIENTEP_EXCEPTION;
    private final static QName CONSULTAFECHASCONTRATOSKYCLIENTEP_QNAME =
        new QName("http://xmlns.oracle.com/SKYConsultas/ConsultaFechasContrato/ConsultaFechasContratoSKY",
                  "consultafechascontratosky_client_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://preselsoa.sky.com.mx:443/soa-infra/services/pagwebconsultas/ConsultaFechasContrato/consultafechascontratosky_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FSKYConsultas%2FConsultaFechasContrato%2FConsultaFechasContratoSKY%7Dconsultafechascontratosky_client_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONSULTAFECHASCONTRATOSKYCLIENTEP_WSDL_LOCATION = url;
        CONSULTAFECHASCONTRATOSKYCLIENTEP_EXCEPTION = e;
    }

    public ConsultafechascontratoskyClientEp() {
        super(__getWsdlLocation(), CONSULTAFECHASCONTRATOSKYCLIENTEP_QNAME);
    }

    public ConsultafechascontratoskyClientEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONSULTAFECHASCONTRATOSKYCLIENTEP_QNAME, features);
    }

    public ConsultafechascontratoskyClientEp(URL wsdlLocation) {
        super(wsdlLocation, CONSULTAFECHASCONTRATOSKYCLIENTEP_QNAME);
    }

    public ConsultafechascontratoskyClientEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONSULTAFECHASCONTRATOSKYCLIENTEP_QNAME, features);
    }

    public ConsultafechascontratoskyClientEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultafechascontratoskyClientEp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ConsultaFechasContratoSKY
     */
    @WebEndpoint(name = "ConsultaFechasContratoSKY_pt")
    public ConsultaFechasContratoSKY getConsultaFechasContratoSKYPt() {
        return super.getPort(new QName("http://xmlns.oracle.com/SKYConsultas/ConsultaFechasContrato/ConsultaFechasContratoSKY",
                                       "ConsultaFechasContratoSKY_pt"), ConsultaFechasContratoSKY.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaFechasContratoSKY
     */
    @WebEndpoint(name = "ConsultaFechasContratoSKY_pt")
    public ConsultaFechasContratoSKY getConsultaFechasContratoSKYPt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/SKYConsultas/ConsultaFechasContrato/ConsultaFechasContratoSKY",
                                       "ConsultaFechasContratoSKY_pt"), ConsultaFechasContratoSKY.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONSULTAFECHASCONTRATOSKYCLIENTEP_EXCEPTION != null) {
            throw CONSULTAFECHASCONTRATOSKYCLIENTEP_EXCEPTION;
        }
        return CONSULTAFECHASCONTRATOSKYCLIENTEP_WSDL_LOCATION;
    }

}