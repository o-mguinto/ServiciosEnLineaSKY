
package mx.com.sky.sel.proxyclients.selebf.gestionapagonuevatdc;

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
@WebServiceClient(name = "GestionarPagoConTDCSelEBF_ep",
                  targetNamespace =
                  "http://xmlns.sky.com.mx/EnterpriseFlows/Sel/GestionarPagoConTDC",
                  wsdlLocation =
                  "https://preselsoa.sky.com.mx:443/soa-infra/services/SEL_EBF/GestionarPagoConTDCSelEBF/GestionarPagoConTDCSelEBF_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.sky.com.mx%2FEnterpriseFlows%2FSel%2FGestionarPagoConTDC%7DGestionarPagoConTDCSelEBF_ep")
public class GestionarPagoConTDCSelEBFEp extends Service {

    private final static URL GESTIONARPAGOCONTDCSELEBFEP_WSDL_LOCATION;
    private final static WebServiceException GESTIONARPAGOCONTDCSELEBFEP_EXCEPTION;
    private final static QName GESTIONARPAGOCONTDCSELEBFEP_QNAME =
        new QName("http://xmlns.sky.com.mx/EnterpriseFlows/Sel/GestionarPagoConTDC",
                  "GestionarPagoConTDCSelEBF_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://preselsoa.sky.com.mx:443/soa-infra/services/SEL_EBF/GestionarPagoConTDCSelEBF/GestionarPagoConTDCSelEBF_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.sky.com.mx%2FEnterpriseFlows%2FSel%2FGestionarPagoConTDC%7DGestionarPagoConTDCSelEBF_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GESTIONARPAGOCONTDCSELEBFEP_WSDL_LOCATION = url;
        GESTIONARPAGOCONTDCSELEBFEP_EXCEPTION = e;
    }

    public GestionarPagoConTDCSelEBFEp() {
        super(__getWsdlLocation(), GESTIONARPAGOCONTDCSELEBFEP_QNAME);
    }

    public GestionarPagoConTDCSelEBFEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), GESTIONARPAGOCONTDCSELEBFEP_QNAME, features);
    }

    public GestionarPagoConTDCSelEBFEp(URL wsdlLocation) {
        super(wsdlLocation, GESTIONARPAGOCONTDCSELEBFEP_QNAME);
    }

    public GestionarPagoConTDCSelEBFEp(URL wsdlLocation,
                                       WebServiceFeature... features) {
        super(wsdlLocation, GESTIONARPAGOCONTDCSELEBFEP_QNAME, features);
    }

    public GestionarPagoConTDCSelEBFEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GestionarPagoConTDCSelEBFEp(URL wsdlLocation, QName serviceName,
                                       WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns GestionarPagoConTDCSelEBF
     */
    @WebEndpoint(name = "GestionarPagoConTDCSelEBF_pt")
    public GestionarPagoConTDCSelEBF getGestionarPagoConTDCSelEBFPt() {
        return super.getPort(new QName("http://xmlns.sky.com.mx/EnterpriseFlows/Sel/GestionarPagoConTDC",
                                       "GestionarPagoConTDCSelEBF_pt"),
                             GestionarPagoConTDCSelEBF.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GestionarPagoConTDCSelEBF
     */
    @WebEndpoint(name = "GestionarPagoConTDCSelEBF_pt")
    public GestionarPagoConTDCSelEBF getGestionarPagoConTDCSelEBFPt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.sky.com.mx/EnterpriseFlows/Sel/GestionarPagoConTDC",
                                       "GestionarPagoConTDCSelEBF_pt"),
                             GestionarPagoConTDCSelEBF.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GESTIONARPAGOCONTDCSELEBFEP_EXCEPTION != null) {
            throw GESTIONARPAGOCONTDCSELEBFEP_EXCEPTION;
        }
        return GESTIONARPAGOCONTDCSELEBFEP_WSDL_LOCATION;
    }

}
