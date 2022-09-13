
package mx.com.sky.sel.proxyclients.soainterface.gestionarsscomprardatos;

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
 * JAX-WS RI 2.3.0-b170214.1743
 * Generated source version: 2.2
 *
 */
@WebServiceClient(name = "GestionarSSComprarDatosSoaInterface_ep",
                  targetNamespace =
                  "http://xmlns.sky.com.mx/InterfaceServices/Soa/GestionarSSComprarDatos",
                  wsdlLocation =
                  "https://qaselsoa.sky.com.mx:443/soa-infra/services/SOA_Interface/GestionarSSComprarDatosSoaInterface/GestionarSSComprarDatosSoaInterface_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.sky.com.mx%2FInterfaceServices%2FSoa%2FGestionarSSComprarDatos%7DGestionarSSComprarDatosSoaInterface_ep")
public class GestionarSSComprarDatosSoaInterfaceEp extends Service {

    private final static URL GESTIONARSSCOMPRARDATOSSOAINTERFACEEP_WSDL_LOCATION;
    private final static WebServiceException GESTIONARSSCOMPRARDATOSSOAINTERFACEEP_EXCEPTION;
    private final static QName GESTIONARSSCOMPRARDATOSSOAINTERFACEEP_QNAME =
        new QName("http://xmlns.sky.com.mx/InterfaceServices/Soa/GestionarSSComprarDatos",
                  "GestionarSSComprarDatosSoaInterface_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://qaselsoa.sky.com.mx:443/soa-infra/services/SOA_Interface/GestionarSSComprarDatosSoaInterface/GestionarSSComprarDatosSoaInterface_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.sky.com.mx%2FInterfaceServices%2FSoa%2FGestionarSSComprarDatos%7DGestionarSSComprarDatosSoaInterface_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GESTIONARSSCOMPRARDATOSSOAINTERFACEEP_WSDL_LOCATION = url;
        GESTIONARSSCOMPRARDATOSSOAINTERFACEEP_EXCEPTION = e;
    }

    public GestionarSSComprarDatosSoaInterfaceEp() {
        super(__getWsdlLocation(), GESTIONARSSCOMPRARDATOSSOAINTERFACEEP_QNAME);
    }

    public GestionarSSComprarDatosSoaInterfaceEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), GESTIONARSSCOMPRARDATOSSOAINTERFACEEP_QNAME,
              features);
    }

    public GestionarSSComprarDatosSoaInterfaceEp(URL wsdlLocation) {
        super(wsdlLocation, GESTIONARSSCOMPRARDATOSSOAINTERFACEEP_QNAME);
    }

    public GestionarSSComprarDatosSoaInterfaceEp(URL wsdlLocation,
                                                 WebServiceFeature... features) {
        super(wsdlLocation, GESTIONARSSCOMPRARDATOSSOAINTERFACEEP_QNAME,
              features);
    }

    public GestionarSSComprarDatosSoaInterfaceEp(URL wsdlLocation,
                                                 QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GestionarSSComprarDatosSoaInterfaceEp(URL wsdlLocation,
                                                 QName serviceName,
                                                 WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns GestionarSSComprarDatosSoaInterface
     */
    @WebEndpoint(name = "GestionarSSComprarDatosSoaInterface_pt")
    public GestionarSSComprarDatosSoaInterface getGestionarSSComprarDatosSoaInterfacePt() {
        return super.getPort(new QName("http://xmlns.sky.com.mx/InterfaceServices/Soa/GestionarSSComprarDatos",
                                       "GestionarSSComprarDatosSoaInterface_pt"),
                             GestionarSSComprarDatosSoaInterface.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GestionarSSComprarDatosSoaInterface
     */
    @WebEndpoint(name = "GestionarSSComprarDatosSoaInterface_pt")
    public GestionarSSComprarDatosSoaInterface getGestionarSSComprarDatosSoaInterfacePt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.sky.com.mx/InterfaceServices/Soa/GestionarSSComprarDatos",
                                       "GestionarSSComprarDatosSoaInterface_pt"),
                             GestionarSSComprarDatosSoaInterface.class,
                             features);
    }

    private static URL __getWsdlLocation() {
        if (GESTIONARSSCOMPRARDATOSSOAINTERFACEEP_EXCEPTION != null) {
            throw GESTIONARSSCOMPRARDATOSSOAINTERFACEEP_EXCEPTION;
        }
        return GESTIONARSSCOMPRARDATOSSOAINTERFACEEP_WSDL_LOCATION;
    }

}
