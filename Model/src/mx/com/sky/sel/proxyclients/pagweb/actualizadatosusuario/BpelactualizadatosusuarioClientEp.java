
package mx.com.sky.sel.proxyclients.pagweb.actualizadatosusuario;

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
@WebServiceClient(name = "bpelactualizadatosusuario_client_ep",
                  targetNamespace = "http://xmlns.oracle.com/SKYPortal/ActualizaDatosUsuario/BPELActualizaDatosUsuario",
                  wsdlLocation =
                  "https://qaselsoa.sky.com.mx:443/soa-infra/services/pagweb/ActualizaDatosUsuario/bpelactualizadatosusuario_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FSKYPortal%2FActualizaDatosUsuario%2FBPELActualizaDatosUsuario%7Dbpelactualizadatosusuario_client_ep")
public class BpelactualizadatosusuarioClientEp extends Service {

    private final static URL BPELACTUALIZADATOSUSUARIOCLIENTEP_WSDL_LOCATION;
    private final static WebServiceException BPELACTUALIZADATOSUSUARIOCLIENTEP_EXCEPTION;
    private final static QName BPELACTUALIZADATOSUSUARIOCLIENTEP_QNAME =
        new QName("http://xmlns.oracle.com/SKYPortal/ActualizaDatosUsuario/BPELActualizaDatosUsuario",
                  "bpelactualizadatosusuario_client_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://qaselsoa.sky.com.mx:443/soa-infra/services/pagweb/ActualizaDatosUsuario/bpelactualizadatosusuario_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FSKYPortal%2FActualizaDatosUsuario%2FBPELActualizaDatosUsuario%7Dbpelactualizadatosusuario_client_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BPELACTUALIZADATOSUSUARIOCLIENTEP_WSDL_LOCATION = url;
        BPELACTUALIZADATOSUSUARIOCLIENTEP_EXCEPTION = e;
    }

    public BpelactualizadatosusuarioClientEp() {
        super(__getWsdlLocation(), BPELACTUALIZADATOSUSUARIOCLIENTEP_QNAME);
    }

    public BpelactualizadatosusuarioClientEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), BPELACTUALIZADATOSUSUARIOCLIENTEP_QNAME, features);
    }

    public BpelactualizadatosusuarioClientEp(URL wsdlLocation) {
        super(wsdlLocation, BPELACTUALIZADATOSUSUARIOCLIENTEP_QNAME);
    }

    public BpelactualizadatosusuarioClientEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BPELACTUALIZADATOSUSUARIOCLIENTEP_QNAME, features);
    }

    public BpelactualizadatosusuarioClientEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BpelactualizadatosusuarioClientEp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns BPELActualizaDatosUsuario
     */
    @WebEndpoint(name = "BPELActualizaDatosUsuario_pt")
    public BPELActualizaDatosUsuario getBPELActualizaDatosUsuarioPt() {
        return super.getPort(new QName("http://xmlns.oracle.com/SKYPortal/ActualizaDatosUsuario/BPELActualizaDatosUsuario",
                                       "BPELActualizaDatosUsuario_pt"), BPELActualizaDatosUsuario.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BPELActualizaDatosUsuario
     */
    @WebEndpoint(name = "BPELActualizaDatosUsuario_pt")
    public BPELActualizaDatosUsuario getBPELActualizaDatosUsuarioPt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/SKYPortal/ActualizaDatosUsuario/BPELActualizaDatosUsuario",
                                       "BPELActualizaDatosUsuario_pt"), BPELActualizaDatosUsuario.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BPELACTUALIZADATOSUSUARIOCLIENTEP_EXCEPTION != null) {
            throw BPELACTUALIZADATOSUSUARIOCLIENTEP_EXCEPTION;
        }
        return BPELACTUALIZADATOSUSUARIOCLIENTEP_WSDL_LOCATION;
    }

}
