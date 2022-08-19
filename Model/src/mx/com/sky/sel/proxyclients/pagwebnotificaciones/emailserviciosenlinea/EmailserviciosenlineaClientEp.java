
package mx.com.sky.sel.proxyclients.pagwebnotificaciones.emailserviciosenlinea;

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
@WebServiceClient(name = "emailserviciosenlinea_client_ep",
                  targetNamespace =
                  "http://xmlns.oracle.com/SKYNotificaciones/EmailServiciosLinea/EmailServiciosEnLinea",
                  wsdlLocation =
                  "https://preselsoa.sky.com.mx:443/soa-infra/services/pagwebnotificaciones/EmailServiciosLinea/emailserviciosenlinea_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FSKYNotificaciones%2FEmailServiciosLinea%2FEmailServiciosEnLinea%7Demailserviciosenlinea_client_ep")
public class EmailserviciosenlineaClientEp extends Service {

    private final static URL EMAILSERVICIOSENLINEACLIENTEP_WSDL_LOCATION;
    private final static WebServiceException EMAILSERVICIOSENLINEACLIENTEP_EXCEPTION;
    private final static QName EMAILSERVICIOSENLINEACLIENTEP_QNAME =
        new QName("http://xmlns.oracle.com/SKYNotificaciones/EmailServiciosLinea/EmailServiciosEnLinea",
                  "emailserviciosenlinea_client_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://preselsoa.sky.com.mx:443/soa-infra/services/pagwebnotificaciones/EmailServiciosLinea/emailserviciosenlinea_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FSKYNotificaciones%2FEmailServiciosLinea%2FEmailServiciosEnLinea%7Demailserviciosenlinea_client_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EMAILSERVICIOSENLINEACLIENTEP_WSDL_LOCATION = url;
        EMAILSERVICIOSENLINEACLIENTEP_EXCEPTION = e;
    }

    public EmailserviciosenlineaClientEp() {
        super(__getWsdlLocation(), EMAILSERVICIOSENLINEACLIENTEP_QNAME);
    }

    public EmailserviciosenlineaClientEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), EMAILSERVICIOSENLINEACLIENTEP_QNAME, features);
    }

    public EmailserviciosenlineaClientEp(URL wsdlLocation) {
        super(wsdlLocation, EMAILSERVICIOSENLINEACLIENTEP_QNAME);
    }

    public EmailserviciosenlineaClientEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EMAILSERVICIOSENLINEACLIENTEP_QNAME, features);
    }

    public EmailserviciosenlineaClientEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmailserviciosenlineaClientEp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns EmailServiciosEnLinea
     */
    @WebEndpoint(name = "EmailServiciosEnLinea_pt")
    public EmailServiciosEnLinea getEmailServiciosEnLineaPt() {
        return super.getPort(new QName("http://xmlns.oracle.com/SKYNotificaciones/EmailServiciosLinea/EmailServiciosEnLinea",
                                       "EmailServiciosEnLinea_pt"), EmailServiciosEnLinea.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmailServiciosEnLinea
     */
    @WebEndpoint(name = "EmailServiciosEnLinea_pt")
    public EmailServiciosEnLinea getEmailServiciosEnLineaPt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/SKYNotificaciones/EmailServiciosLinea/EmailServiciosEnLinea",
                                       "EmailServiciosEnLinea_pt"), EmailServiciosEnLinea.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EMAILSERVICIOSENLINEACLIENTEP_EXCEPTION != null) {
            throw EMAILSERVICIOSENLINEACLIENTEP_EXCEPTION;
        }
        return EMAILSERVICIOSENLINEACLIENTEP_WSDL_LOCATION;
    }

}
