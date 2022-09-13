
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultatiirdprincipal;

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
@WebServiceClient(name = "consultati_ird_principal_client_ep",
                  targetNamespace =
                  "http://xmlns.oracle.com/SKYConsultas/ConsultaCambioTitular/ConsultaTI_IRD_Principal",
                  wsdlLocation =
                  "https://qaselsoa.sky.com.mx:443/soa-infra/services/pagwebconsultas/ConsultaCambioTitular/consultati_ird_principal_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FSKYConsultas%2FConsultaCambioTitular%2FConsultaTI_IRD_Principal%7Dconsultati_ird_principal_client_ep")
public class ConsultatiIrdPrincipalClientEp extends Service {

    private final static URL CONSULTATIIRDPRINCIPALCLIENTEP_WSDL_LOCATION;
    private final static WebServiceException CONSULTATIIRDPRINCIPALCLIENTEP_EXCEPTION;
    private final static QName CONSULTATIIRDPRINCIPALCLIENTEP_QNAME =
        new QName("http://xmlns.oracle.com/SKYConsultas/ConsultaCambioTitular/ConsultaTI_IRD_Principal",
                  "consultati_ird_principal_client_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://qaselsoa.sky.com.mx:443/soa-infra/services/pagwebconsultas/ConsultaCambioTitular/consultati_ird_principal_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FSKYConsultas%2FConsultaCambioTitular%2FConsultaTI_IRD_Principal%7Dconsultati_ird_principal_client_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONSULTATIIRDPRINCIPALCLIENTEP_WSDL_LOCATION = url;
        CONSULTATIIRDPRINCIPALCLIENTEP_EXCEPTION = e;
    }

    public ConsultatiIrdPrincipalClientEp() {
        super(__getWsdlLocation(), CONSULTATIIRDPRINCIPALCLIENTEP_QNAME);
    }

    public ConsultatiIrdPrincipalClientEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONSULTATIIRDPRINCIPALCLIENTEP_QNAME, features);
    }

    public ConsultatiIrdPrincipalClientEp(URL wsdlLocation) {
        super(wsdlLocation, CONSULTATIIRDPRINCIPALCLIENTEP_QNAME);
    }

    public ConsultatiIrdPrincipalClientEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONSULTATIIRDPRINCIPALCLIENTEP_QNAME, features);
    }

    public ConsultatiIrdPrincipalClientEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultatiIrdPrincipalClientEp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ConsultaTIIRDPrincipal
     */
    @WebEndpoint(name = "ConsultaTI_IRD_Principal_pt")
    public ConsultaTIIRDPrincipal getConsultaTIIRDPrincipalPt() {
        return super.getPort(new QName("http://xmlns.oracle.com/SKYConsultas/ConsultaCambioTitular/ConsultaTI_IRD_Principal",
                                       "ConsultaTI_IRD_Principal_pt"), ConsultaTIIRDPrincipal.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaTIIRDPrincipal
     */
    @WebEndpoint(name = "ConsultaTI_IRD_Principal_pt")
    public ConsultaTIIRDPrincipal getConsultaTIIRDPrincipalPt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/SKYConsultas/ConsultaCambioTitular/ConsultaTI_IRD_Principal",
                                       "ConsultaTI_IRD_Principal_pt"), ConsultaTIIRDPrincipal.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONSULTATIIRDPRINCIPALCLIENTEP_EXCEPTION != null) {
            throw CONSULTATIIRDPRINCIPALCLIENTEP_EXCEPTION;
        }
        return CONSULTATIIRDPRINCIPALCLIENTEP_WSDL_LOCATION;
    }

}
