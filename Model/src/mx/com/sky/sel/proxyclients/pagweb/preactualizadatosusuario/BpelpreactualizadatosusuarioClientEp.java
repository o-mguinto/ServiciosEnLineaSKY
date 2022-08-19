
package mx.com.sky.sel.proxyclients.pagweb.preactualizadatosusuario;

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
@WebServiceClient(name = "bpelpreactualizadatosusuario_client_ep",
                  targetNamespace =
                  "http://xmlns.oracle.com/SKYPortal/PreActualizaDatosUsuario/BPELPreActualizaDatosUsuario",
                  wsdlLocation =
                  "https://preselsoa.sky.com.mx:443/soa-infra/services/pagweb/PreActualizaDatosUsuario/bpelpreactualizadatosusuario_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FSKYPortal%2FPreActualizaDatosUsuario%2FBPELPreActualizaDatosUsuario%7Dbpelpreactualizadatosusuario_client_ep")
public class BpelpreactualizadatosusuarioClientEp extends Service {

    private final static URL BPELPREACTUALIZADATOSUSUARIOCLIENTEP_WSDL_LOCATION;
    private final static WebServiceException BPELPREACTUALIZADATOSUSUARIOCLIENTEP_EXCEPTION;
    private final static QName BPELPREACTUALIZADATOSUSUARIOCLIENTEP_QNAME =
        new QName("http://xmlns.oracle.com/SKYPortal/PreActualizaDatosUsuario/BPELPreActualizaDatosUsuario",
                  "bpelpreactualizadatosusuario_client_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://preselsoa.sky.com.mx:443/soa-infra/services/pagweb/PreActualizaDatosUsuario/bpelpreactualizadatosusuario_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FSKYPortal%2FPreActualizaDatosUsuario%2FBPELPreActualizaDatosUsuario%7Dbpelpreactualizadatosusuario_client_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BPELPREACTUALIZADATOSUSUARIOCLIENTEP_WSDL_LOCATION = url;
        BPELPREACTUALIZADATOSUSUARIOCLIENTEP_EXCEPTION = e;
    }

    public BpelpreactualizadatosusuarioClientEp() {
        super(__getWsdlLocation(), BPELPREACTUALIZADATOSUSUARIOCLIENTEP_QNAME);
    }

    public BpelpreactualizadatosusuarioClientEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), BPELPREACTUALIZADATOSUSUARIOCLIENTEP_QNAME, features);
    }

    public BpelpreactualizadatosusuarioClientEp(URL wsdlLocation) {
        super(wsdlLocation, BPELPREACTUALIZADATOSUSUARIOCLIENTEP_QNAME);
    }

    public BpelpreactualizadatosusuarioClientEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BPELPREACTUALIZADATOSUSUARIOCLIENTEP_QNAME, features);
    }

    public BpelpreactualizadatosusuarioClientEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BpelpreactualizadatosusuarioClientEp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns BPELPreActualizaDatosUsuario
     */
    @WebEndpoint(name = "BPELPreActualizaDatosUsuario_pt")
    public BPELPreActualizaDatosUsuario getBPELPreActualizaDatosUsuarioPt() {
        return super.getPort(new QName("http://xmlns.oracle.com/SKYPortal/PreActualizaDatosUsuario/BPELPreActualizaDatosUsuario",
                                       "BPELPreActualizaDatosUsuario_pt"), BPELPreActualizaDatosUsuario.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BPELPreActualizaDatosUsuario
     */
    @WebEndpoint(name = "BPELPreActualizaDatosUsuario_pt")
    public BPELPreActualizaDatosUsuario getBPELPreActualizaDatosUsuarioPt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/SKYPortal/PreActualizaDatosUsuario/BPELPreActualizaDatosUsuario",
                                       "BPELPreActualizaDatosUsuario_pt"), BPELPreActualizaDatosUsuario.class,
                             features);
    }

    private static URL __getWsdlLocation() {
        if (BPELPREACTUALIZADATOSUSUARIOCLIENTEP_EXCEPTION != null) {
            throw BPELPREACTUALIZADATOSUSUARIOCLIENTEP_EXCEPTION;
        }
        return BPELPREACTUALIZADATOSUSUARIOCLIENTEP_WSDL_LOCATION;
    }

}