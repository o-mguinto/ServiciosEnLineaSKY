
package mx.com.sky.sel.proxyclients.pagweb.pwbamoperaciones;

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
@WebServiceClient(name = "bpel_pw_bam_operaciones_client_ep",
                  targetNamespace = "http://xmlns.oracle.com/PAGWEB_BAM/PAGWEB_BAM/BPEL_PW_BAM_OPERACIONES",
                  wsdlLocation =
                  "https://preselsoa.sky.com.mx:443/soa-infra/services/pagweb/PAGWEB_BAM/bpel_pw_bam_operaciones_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FPAGWEB_BAM%2FPAGWEB_BAM%2FBPEL_PW_BAM_OPERACIONES%7Dbpel_pw_bam_operaciones_client_ep")
public class BpelPwBamOperacionesClientEp extends Service {

    private final static URL BPELPWBAMOPERACIONESCLIENTEP_WSDL_LOCATION;
    private final static WebServiceException BPELPWBAMOPERACIONESCLIENTEP_EXCEPTION;
    private final static QName BPELPWBAMOPERACIONESCLIENTEP_QNAME =
        new QName("http://xmlns.oracle.com/PAGWEB_BAM/PAGWEB_BAM/BPEL_PW_BAM_OPERACIONES",
                  "bpel_pw_bam_operaciones_client_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://preselsoa.sky.com.mx:443/soa-infra/services/pagweb/PAGWEB_BAM/bpel_pw_bam_operaciones_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FPAGWEB_BAM%2FPAGWEB_BAM%2FBPEL_PW_BAM_OPERACIONES%7Dbpel_pw_bam_operaciones_client_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BPELPWBAMOPERACIONESCLIENTEP_WSDL_LOCATION = url;
        BPELPWBAMOPERACIONESCLIENTEP_EXCEPTION = e;
    }

    public BpelPwBamOperacionesClientEp() {
        super(__getWsdlLocation(), BPELPWBAMOPERACIONESCLIENTEP_QNAME);
    }

    public BpelPwBamOperacionesClientEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), BPELPWBAMOPERACIONESCLIENTEP_QNAME, features);
    }

    public BpelPwBamOperacionesClientEp(URL wsdlLocation) {
        super(wsdlLocation, BPELPWBAMOPERACIONESCLIENTEP_QNAME);
    }

    public BpelPwBamOperacionesClientEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BPELPWBAMOPERACIONESCLIENTEP_QNAME, features);
    }

    public BpelPwBamOperacionesClientEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BpelPwBamOperacionesClientEp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns BPELPWBAMOPERACIONES
     */
    @WebEndpoint(name = "BPEL_PW_BAM_OPERACIONES_pt")
    public BPELPWBAMOPERACIONES getBPELPWBAMOPERACIONESPt() {
        return super.getPort(new QName("http://xmlns.oracle.com/PAGWEB_BAM/PAGWEB_BAM/BPEL_PW_BAM_OPERACIONES",
                                       "BPEL_PW_BAM_OPERACIONES_pt"), BPELPWBAMOPERACIONES.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BPELPWBAMOPERACIONES
     */
    @WebEndpoint(name = "BPEL_PW_BAM_OPERACIONES_pt")
    public BPELPWBAMOPERACIONES getBPELPWBAMOPERACIONESPt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/PAGWEB_BAM/PAGWEB_BAM/BPEL_PW_BAM_OPERACIONES",
                                       "BPEL_PW_BAM_OPERACIONES_pt"), BPELPWBAMOPERACIONES.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BPELPWBAMOPERACIONESCLIENTEP_EXCEPTION != null) {
            throw BPELPWBAMOPERACIONESCLIENTEP_EXCEPTION;
        }
        return BPELPWBAMOPERACIONESCLIENTEP_WSDL_LOCATION;
    }

}
