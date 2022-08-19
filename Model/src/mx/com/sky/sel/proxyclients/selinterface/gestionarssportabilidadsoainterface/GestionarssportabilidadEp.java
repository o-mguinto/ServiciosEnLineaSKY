
package mx.com.sky.sel.proxyclients.selinterface.gestionarssportabilidadsoainterface;

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
@WebServiceClient(name = "gestionarssportabilidad_ep",
                  targetNamespace = "http://xmlns.sky.com.mx/InterfaceServices/Sel/GestionarSSPortabilidadSoa",
                  wsdlLocation =
                  "https://preselsoa.sky.com.mx:443/soa-infra/services/SEL_Interface/GestionarSSPortabilidadSoaInterface/gestionarssportabilidad_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.sky.com.mx%2FInterfaceServices%2FSel%2FGestionarSSPortabilidadSoa%7Dgestionarssportabilidad_ep")
public class GestionarssportabilidadEp extends Service {

    private final static URL GESTIONARSSPORTABILIDADEP_WSDL_LOCATION;
    private final static WebServiceException GESTIONARSSPORTABILIDADEP_EXCEPTION;
    private final static QName GESTIONARSSPORTABILIDADEP_QNAME =
        new QName("http://xmlns.sky.com.mx/InterfaceServices/Sel/GestionarSSPortabilidadSoa",
                  "gestionarssportabilidad_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://preselsoa.sky.com.mx:443/soa-infra/services/SEL_Interface/GestionarSSPortabilidadSoaInterface/gestionarssportabilidad_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.sky.com.mx%2FInterfaceServices%2FSel%2FGestionarSSPortabilidadSoa%7Dgestionarssportabilidad_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GESTIONARSSPORTABILIDADEP_WSDL_LOCATION = url;
        GESTIONARSSPORTABILIDADEP_EXCEPTION = e;
    }

    public GestionarssportabilidadEp() {
        super(__getWsdlLocation(), GESTIONARSSPORTABILIDADEP_QNAME);
    }

    public GestionarssportabilidadEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), GESTIONARSSPORTABILIDADEP_QNAME, features);
    }

    public GestionarssportabilidadEp(URL wsdlLocation) {
        super(wsdlLocation, GESTIONARSSPORTABILIDADEP_QNAME);
    }

    public GestionarssportabilidadEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GESTIONARSSPORTABILIDADEP_QNAME, features);
    }

    public GestionarssportabilidadEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GestionarssportabilidadEp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns GestionarSSPortabilidad
     */
    @WebEndpoint(name = "GestionarSSPortabilidad_pt")
    public GestionarSSPortabilidad getGestionarSSPortabilidadPt() {
        return super.getPort(new QName("http://xmlns.sky.com.mx/InterfaceServices/Sel/GestionarSSPortabilidadSoa",
                                       "GestionarSSPortabilidad_pt"), GestionarSSPortabilidad.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GestionarSSPortabilidad
     */
    @WebEndpoint(name = "GestionarSSPortabilidad_pt")
    public GestionarSSPortabilidad getGestionarSSPortabilidadPt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.sky.com.mx/InterfaceServices/Sel/GestionarSSPortabilidadSoa",
                                       "GestionarSSPortabilidad_pt"), GestionarSSPortabilidad.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GESTIONARSSPORTABILIDADEP_EXCEPTION != null) {
            throw GESTIONARSSPORTABILIDADEP_EXCEPTION;
        }
        return GESTIONARSSPORTABILIDADEP_WSDL_LOCATION;
    }

}