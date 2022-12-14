
package mx.com.sky.sel.proxyclients.pagweb.admintarjetapago;

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
@WebServiceClient(name = "administratarjeta_client_ep",
                  targetNamespace =
                  "http://xmlns.oracle.com/SKYPortal/AdministraTarjetasPago/BPELAdministraTarjetasPago",
                  wsdlLocation =
                  "https://qaselsoa.sky.com.mx:443/soa-infra/services/pagweb/AdministraTarjetasPago/administratarjeta_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FSKYPortal%2FAdministraTarjetasPago%2FBPELAdministraTarjetasPago%7Dadministratarjeta_client_ep")
public class AdministratarjetaClientEp extends Service {

    private final static URL ADMINISTRATARJETACLIENTEP_WSDL_LOCATION;
    private final static WebServiceException ADMINISTRATARJETACLIENTEP_EXCEPTION;
    private final static QName ADMINISTRATARJETACLIENTEP_QNAME =
        new QName("http://xmlns.oracle.com/SKYPortal/AdministraTarjetasPago/BPELAdministraTarjetasPago",
                  "administratarjeta_client_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://qaselsoa.sky.com.mx:443/soa-infra/services/pagweb/AdministraTarjetasPago/administratarjeta_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FSKYPortal%2FAdministraTarjetasPago%2FBPELAdministraTarjetasPago%7Dadministratarjeta_client_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADMINISTRATARJETACLIENTEP_WSDL_LOCATION = url;
        ADMINISTRATARJETACLIENTEP_EXCEPTION = e;
    }

    public AdministratarjetaClientEp() {
        super(__getWsdlLocation(), ADMINISTRATARJETACLIENTEP_QNAME);
    }

    public AdministratarjetaClientEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), ADMINISTRATARJETACLIENTEP_QNAME, features);
    }

    public AdministratarjetaClientEp(URL wsdlLocation) {
        super(wsdlLocation, ADMINISTRATARJETACLIENTEP_QNAME);
    }

    public AdministratarjetaClientEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ADMINISTRATARJETACLIENTEP_QNAME, features);
    }

    public AdministratarjetaClientEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AdministratarjetaClientEp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns BPELAdministraTarjetasPago
     */
    @WebEndpoint(name = "BPELAdministraTarjetasPago_pt")
    public BPELAdministraTarjetasPago getBPELAdministraTarjetasPagoPt() {
        return super.getPort(new QName("http://xmlns.oracle.com/SKYPortal/AdministraTarjetasPago/BPELAdministraTarjetasPago",
                                       "BPELAdministraTarjetasPago_pt"), BPELAdministraTarjetasPago.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BPELAdministraTarjetasPago
     */
    @WebEndpoint(name = "BPELAdministraTarjetasPago_pt")
    public BPELAdministraTarjetasPago getBPELAdministraTarjetasPagoPt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/SKYPortal/AdministraTarjetasPago/BPELAdministraTarjetasPago",
                                       "BPELAdministraTarjetasPago_pt"), BPELAdministraTarjetasPago.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADMINISTRATARJETACLIENTEP_EXCEPTION != null) {
            throw ADMINISTRATARJETACLIENTEP_EXCEPTION;
        }
        return ADMINISTRATARJETACLIENTEP_WSDL_LOCATION;
    }

}
