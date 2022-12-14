
package mx.com.sky.sel.proxyclients.pagweb.cargaarchivoeventos;

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
@WebServiceClient(name = "bpelcargaarchivoeventos_client_ep",
                  targetNamespace = "http://xmlns.oracle.com/SKYPortal/CargaArchivoEventos/BPELCargaArchivoEventos",
                  wsdlLocation =
                  "https://qaselsoa.sky.com.mx:443/soa-infra/services/pagweb/CargaArchivoEventos/bpelcargaarchivoeventos_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FSKYPortal%2FCargaArchivoEventos%2FBPELCargaArchivoEventos%7Dbpelcargaarchivoeventos_client_ep")
public class BpelcargaarchivoeventosClientEp extends Service {

    private final static URL BPELCARGAARCHIVOEVENTOSCLIENTEP_WSDL_LOCATION;
    private final static WebServiceException BPELCARGAARCHIVOEVENTOSCLIENTEP_EXCEPTION;
    private final static QName BPELCARGAARCHIVOEVENTOSCLIENTEP_QNAME =
        new QName("http://xmlns.oracle.com/SKYPortal/CargaArchivoEventos/BPELCargaArchivoEventos",
                  "bpelcargaarchivoeventos_client_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://qaselsoa.sky.com.mx:443/soa-infra/services/pagweb/CargaArchivoEventos/bpelcargaarchivoeventos_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FSKYPortal%2FCargaArchivoEventos%2FBPELCargaArchivoEventos%7Dbpelcargaarchivoeventos_client_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BPELCARGAARCHIVOEVENTOSCLIENTEP_WSDL_LOCATION = url;
        BPELCARGAARCHIVOEVENTOSCLIENTEP_EXCEPTION = e;
    }

    public BpelcargaarchivoeventosClientEp() {
        super(__getWsdlLocation(), BPELCARGAARCHIVOEVENTOSCLIENTEP_QNAME);
    }

    public BpelcargaarchivoeventosClientEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), BPELCARGAARCHIVOEVENTOSCLIENTEP_QNAME, features);
    }

    public BpelcargaarchivoeventosClientEp(URL wsdlLocation) {
        super(wsdlLocation, BPELCARGAARCHIVOEVENTOSCLIENTEP_QNAME);
    }

    public BpelcargaarchivoeventosClientEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BPELCARGAARCHIVOEVENTOSCLIENTEP_QNAME, features);
    }

    public BpelcargaarchivoeventosClientEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BpelcargaarchivoeventosClientEp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns BPELCargaArchivoEventos
     */
    @WebEndpoint(name = "BPELCargaArchivoEventos_pt")
    public BPELCargaArchivoEventos getBPELCargaArchivoEventosPt() {
        return super.getPort(new QName("http://xmlns.oracle.com/SKYPortal/CargaArchivoEventos/BPELCargaArchivoEventos",
                                       "BPELCargaArchivoEventos_pt"), BPELCargaArchivoEventos.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BPELCargaArchivoEventos
     */
    @WebEndpoint(name = "BPELCargaArchivoEventos_pt")
    public BPELCargaArchivoEventos getBPELCargaArchivoEventosPt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/SKYPortal/CargaArchivoEventos/BPELCargaArchivoEventos",
                                       "BPELCargaArchivoEventos_pt"), BPELCargaArchivoEventos.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BPELCARGAARCHIVOEVENTOSCLIENTEP_EXCEPTION != null) {
            throw BPELCARGAARCHIVOEVENTOSCLIENTEP_EXCEPTION;
        }
        return BPELCARGAARCHIVOEVENTOSCLIENTEP_WSDL_LOCATION;
    }

}
