
package mx.com.sky.sel.proxyclients.pagwebss.cambiopaqueteaccess;

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
@WebServiceClient(name = "cambiopaqueteaccess_client_ep",
                  targetNamespace =
                  "http://xmlns.oracle.com/SKYPortalSS/AltaSolicitudDeServicioWeb/CambioPaqueteAccess",
                  wsdlLocation =
                  "https://preselsoa.sky.com.mx:443/soa-infra/services/pagwebss/AltaSolicitudDeServicioWeb/cambiopaqueteaccess_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FSKYPortalSS%2FAltaSolicitudDeServicioWeb%2FCambioPaqueteAccess%7Dcambiopaqueteaccess_client_ep")
public class CambiopaqueteaccessClientEp extends Service {

    private final static URL CAMBIOPAQUETEACCESSCLIENTEP_WSDL_LOCATION;
    private final static WebServiceException CAMBIOPAQUETEACCESSCLIENTEP_EXCEPTION;
    private final static QName CAMBIOPAQUETEACCESSCLIENTEP_QNAME =
        new QName("http://xmlns.oracle.com/SKYPortalSS/AltaSolicitudDeServicioWeb/CambioPaqueteAccess",
                  "cambiopaqueteaccess_client_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://preselsoa.sky.com.mx:443/soa-infra/services/pagwebss/AltaSolicitudDeServicioWeb/cambiopaqueteaccess_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FSKYPortalSS%2FAltaSolicitudDeServicioWeb%2FCambioPaqueteAccess%7Dcambiopaqueteaccess_client_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CAMBIOPAQUETEACCESSCLIENTEP_WSDL_LOCATION = url;
        CAMBIOPAQUETEACCESSCLIENTEP_EXCEPTION = e;
    }

    public CambiopaqueteaccessClientEp() {
        super(__getWsdlLocation(), CAMBIOPAQUETEACCESSCLIENTEP_QNAME);
    }

    public CambiopaqueteaccessClientEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), CAMBIOPAQUETEACCESSCLIENTEP_QNAME, features);
    }

    public CambiopaqueteaccessClientEp(URL wsdlLocation) {
        super(wsdlLocation, CAMBIOPAQUETEACCESSCLIENTEP_QNAME);
    }

    public CambiopaqueteaccessClientEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CAMBIOPAQUETEACCESSCLIENTEP_QNAME, features);
    }

    public CambiopaqueteaccessClientEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CambiopaqueteaccessClientEp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns CambioPaqueteAccess
     */
    @WebEndpoint(name = "CambioPaqueteAccess_pt")
    public CambioPaqueteAccess getCambioPaqueteAccessPt() {
        return super.getPort(new QName("http://xmlns.oracle.com/SKYPortalSS/AltaSolicitudDeServicioWeb/CambioPaqueteAccess",
                                       "CambioPaqueteAccess_pt"), CambioPaqueteAccess.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CambioPaqueteAccess
     */
    @WebEndpoint(name = "CambioPaqueteAccess_pt")
    public CambioPaqueteAccess getCambioPaqueteAccessPt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/SKYPortalSS/AltaSolicitudDeServicioWeb/CambioPaqueteAccess",
                                       "CambioPaqueteAccess_pt"), CambioPaqueteAccess.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CAMBIOPAQUETEACCESSCLIENTEP_EXCEPTION != null) {
            throw CAMBIOPAQUETEACCESSCLIENTEP_EXCEPTION;
        }
        return CAMBIOPAQUETEACCESSCLIENTEP_WSDL_LOCATION;
    }

}
