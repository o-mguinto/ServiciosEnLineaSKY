
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultaequiposhd;

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
@WebServiceClient(name = "consultaequiposhd_client_ep",
                  targetNamespace = "http://xmlns.oracle.com/SKYConsultas/ConsultaEquiposHD/ConsultaEquiposHD",
                  wsdlLocation =
                  "https://preselsoa.sky.com.mx:443/soa-infra/services/pagwebconsultas/ConsultaEquiposHD/consultaequiposhd_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FSKYConsultas%2FConsultaEquiposHD%2FConsultaEquiposHD%7Dconsultaequiposhd_client_ep")
public class ConsultaequiposhdClientEp extends Service {

    private final static URL CONSULTAEQUIPOSHDCLIENTEP_WSDL_LOCATION;
    private final static WebServiceException CONSULTAEQUIPOSHDCLIENTEP_EXCEPTION;
    private final static QName CONSULTAEQUIPOSHDCLIENTEP_QNAME =
        new QName("http://xmlns.oracle.com/SKYConsultas/ConsultaEquiposHD/ConsultaEquiposHD",
                  "consultaequiposhd_client_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://preselsoa.sky.com.mx:443/soa-infra/services/pagwebconsultas/ConsultaEquiposHD/consultaequiposhd_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FSKYConsultas%2FConsultaEquiposHD%2FConsultaEquiposHD%7Dconsultaequiposhd_client_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONSULTAEQUIPOSHDCLIENTEP_WSDL_LOCATION = url;
        CONSULTAEQUIPOSHDCLIENTEP_EXCEPTION = e;
    }

    public ConsultaequiposhdClientEp() {
        super(__getWsdlLocation(), CONSULTAEQUIPOSHDCLIENTEP_QNAME);
    }

    public ConsultaequiposhdClientEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONSULTAEQUIPOSHDCLIENTEP_QNAME, features);
    }

    public ConsultaequiposhdClientEp(URL wsdlLocation) {
        super(wsdlLocation, CONSULTAEQUIPOSHDCLIENTEP_QNAME);
    }

    public ConsultaequiposhdClientEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONSULTAEQUIPOSHDCLIENTEP_QNAME, features);
    }

    public ConsultaequiposhdClientEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultaequiposhdClientEp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ConsultaEquiposHD
     */
    @WebEndpoint(name = "ConsultaEquiposHD_pt")
    public ConsultaEquiposHD getConsultaEquiposHDPt() {
        return super.getPort(new QName("http://xmlns.oracle.com/SKYConsultas/ConsultaEquiposHD/ConsultaEquiposHD",
                                       "ConsultaEquiposHD_pt"), ConsultaEquiposHD.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaEquiposHD
     */
    @WebEndpoint(name = "ConsultaEquiposHD_pt")
    public ConsultaEquiposHD getConsultaEquiposHDPt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/SKYConsultas/ConsultaEquiposHD/ConsultaEquiposHD",
                                       "ConsultaEquiposHD_pt"), ConsultaEquiposHD.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONSULTAEQUIPOSHDCLIENTEP_EXCEPTION != null) {
            throw CONSULTAEQUIPOSHDCLIENTEP_EXCEPTION;
        }
        return CONSULTAEQUIPOSHDCLIENTEP_WSDL_LOCATION;
    }

}
