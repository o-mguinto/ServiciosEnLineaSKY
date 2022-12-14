
package mx.com.sky.sel.proxyclients.pagweb.reenviosenal;

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
@WebServiceClient(name = "bpel_reenviosenal_client_ep",
                  targetNamespace = "http://xmlns.oracle.com/SKYPortal/ReenvioSenal/BPEL_ReenvioSenal",
                  wsdlLocation =
                  "https://qaselsoa.sky.com.mx:443/soa-infra/services/pagweb/ReenvioSenal/bpel_reenviosenal_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FSKYPortal%2FReenvioSenal%2FBPEL_ReenvioSenal%7Dbpel_reenviosenal_client_ep")
public class BpelReenviosenalClientEp extends Service {

    private final static URL BPELREENVIOSENALCLIENTEP_WSDL_LOCATION;
    private final static WebServiceException BPELREENVIOSENALCLIENTEP_EXCEPTION;
    private final static QName BPELREENVIOSENALCLIENTEP_QNAME =
        new QName("http://xmlns.oracle.com/SKYPortal/ReenvioSenal/BPEL_ReenvioSenal", "bpel_reenviosenal_client_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://qaselsoa.sky.com.mx:443/soa-infra/services/pagweb/ReenvioSenal/bpel_reenviosenal_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FSKYPortal%2FReenvioSenal%2FBPEL_ReenvioSenal%7Dbpel_reenviosenal_client_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BPELREENVIOSENALCLIENTEP_WSDL_LOCATION = url;
        BPELREENVIOSENALCLIENTEP_EXCEPTION = e;
    }

    public BpelReenviosenalClientEp() {
        super(__getWsdlLocation(), BPELREENVIOSENALCLIENTEP_QNAME);
    }

    public BpelReenviosenalClientEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), BPELREENVIOSENALCLIENTEP_QNAME, features);
    }

    public BpelReenviosenalClientEp(URL wsdlLocation) {
        super(wsdlLocation, BPELREENVIOSENALCLIENTEP_QNAME);
    }

    public BpelReenviosenalClientEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BPELREENVIOSENALCLIENTEP_QNAME, features);
    }

    public BpelReenviosenalClientEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BpelReenviosenalClientEp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns BPELReenvioSenal
     */
    @WebEndpoint(name = "BPEL_ReenvioSenal_pt")
    public BPELReenvioSenal getBPELReenvioSenalPt() {
        return super.getPort(new QName("http://xmlns.oracle.com/SKYPortal/ReenvioSenal/BPEL_ReenvioSenal",
                                       "BPEL_ReenvioSenal_pt"), BPELReenvioSenal.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BPELReenvioSenal
     */
    @WebEndpoint(name = "BPEL_ReenvioSenal_pt")
    public BPELReenvioSenal getBPELReenvioSenalPt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/SKYPortal/ReenvioSenal/BPEL_ReenvioSenal",
                                       "BPEL_ReenvioSenal_pt"), BPELReenvioSenal.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BPELREENVIOSENALCLIENTEP_EXCEPTION != null) {
            throw BPELREENVIOSENALCLIENTEP_EXCEPTION;
        }
        return BPELREENVIOSENALCLIENTEP_WSDL_LOCATION;
    }

}
