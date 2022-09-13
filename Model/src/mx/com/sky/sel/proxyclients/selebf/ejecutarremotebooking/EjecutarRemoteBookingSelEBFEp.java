
package mx.com.sky.sel.proxyclients.selebf.ejecutarremotebooking;

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
@WebServiceClient(name = "EjecutarRemoteBookingSelEBF_ep",
                  targetNamespace =
                  "http://xmlns.sky.com.mx/EnterpriseFlows/Sel/EjecutarRemoteBookingSelEBF",
                  wsdlLocation =
                  "https://qaselsoa.sky.com.mx:443/soa-infra/services/SEL_EBF/EjecutarRemoteBookingSelEBF/EjecutarRemoteBookingSelEBF_ep?wsdl#%7Bhttp%3A%2F%2Fxmlns.sky.com.mx%2FEnterpriseFlows%2FSel%2FEjecutarRemoteBookingSelEBF%7DEjecutarRemoteBookingSelEBF_ep")
public class EjecutarRemoteBookingSelEBFEp extends Service {

    private final static URL EJECUTARREMOTEBOOKINGSELEBFEP_WSDL_LOCATION;
    private final static WebServiceException EJECUTARREMOTEBOOKINGSELEBFEP_EXCEPTION;
    private final static QName EJECUTARREMOTEBOOKINGSELEBFEP_QNAME =
        new QName("http://xmlns.sky.com.mx/EnterpriseFlows/Sel/EjecutarRemoteBookingSelEBF",
                  "EjecutarRemoteBookingSelEBF_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://qaselsoa.sky.com.mx:443/soa-infra/services/SEL_EBF/EjecutarRemoteBookingSelEBF/EjecutarRemoteBookingSelEBF_ep?wsdl#%7Bhttp%3A%2F%2Fxmlns.sky.com.mx%2FEnterpriseFlows%2FSel%2FEjecutarRemoteBookingSelEBF%7DEjecutarRemoteBookingSelEBF_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EJECUTARREMOTEBOOKINGSELEBFEP_WSDL_LOCATION = url;
        EJECUTARREMOTEBOOKINGSELEBFEP_EXCEPTION = e;
    }

    public EjecutarRemoteBookingSelEBFEp() {
        super(__getWsdlLocation(), EJECUTARREMOTEBOOKINGSELEBFEP_QNAME);
    }

    public EjecutarRemoteBookingSelEBFEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), EJECUTARREMOTEBOOKINGSELEBFEP_QNAME,
              features);
    }

    public EjecutarRemoteBookingSelEBFEp(URL wsdlLocation) {
        super(wsdlLocation, EJECUTARREMOTEBOOKINGSELEBFEP_QNAME);
    }

    public EjecutarRemoteBookingSelEBFEp(URL wsdlLocation,
                                         WebServiceFeature... features) {
        super(wsdlLocation, EJECUTARREMOTEBOOKINGSELEBFEP_QNAME, features);
    }

    public EjecutarRemoteBookingSelEBFEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EjecutarRemoteBookingSelEBFEp(URL wsdlLocation, QName serviceName,
                                         WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns EjecutarRemoteBookingSelEBF
     */
    @WebEndpoint(name = "EjecutarRemoteBookingSelEBF_pt")
    public EjecutarRemoteBookingSelEBF getEjecutarRemoteBookingSelEBFPt() {
        return super.getPort(new QName("http://xmlns.sky.com.mx/EnterpriseFlows/Sel/EjecutarRemoteBookingSelEBF",
                                       "EjecutarRemoteBookingSelEBF_pt"),
                             EjecutarRemoteBookingSelEBF.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EjecutarRemoteBookingSelEBF
     */
    @WebEndpoint(name = "EjecutarRemoteBookingSelEBF_pt")
    public EjecutarRemoteBookingSelEBF getEjecutarRemoteBookingSelEBFPt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.sky.com.mx/EnterpriseFlows/Sel/EjecutarRemoteBookingSelEBF",
                                       "EjecutarRemoteBookingSelEBF_pt"),
                             EjecutarRemoteBookingSelEBF.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EJECUTARREMOTEBOOKINGSELEBFEP_EXCEPTION != null) {
            throw EJECUTARREMOTEBOOKINGSELEBFEP_EXCEPTION;
        }
        return EJECUTARREMOTEBOOKINGSELEBFEP_WSDL_LOCATION;
    }

}
