
package mx.com.sky.sel.proxyclients.pagweb.ventacrecimientostya;

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
@WebServiceClient(name = "ventacrecimientos_tya_client_ep",
                  targetNamespace =
                  "http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/VentaCrecimientos_TYA",
                  wsdlLocation =
                  "https://qaselsoa.sky.com.mx:443/soa-infra/services/pagweb/CrecimientosEquipos/ventacrecimientos_tya_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FSKY_CrecimientosEquipos%2FSKY_Crecimientos%2FVentaCrecimientos_TYA%7Dventacrecimientos_tya_client_ep")
public class VentacrecimientosTyaClientEp extends Service {

    private final static URL VENTACRECIMIENTOSTYACLIENTEP_WSDL_LOCATION;
    private final static WebServiceException VENTACRECIMIENTOSTYACLIENTEP_EXCEPTION;
    private final static QName VENTACRECIMIENTOSTYACLIENTEP_QNAME =
        new QName("http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/VentaCrecimientos_TYA",
                  "ventacrecimientos_tya_client_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://qaselsoa.sky.com.mx:443/soa-infra/services/pagweb/CrecimientosEquipos/ventacrecimientos_tya_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FSKY_CrecimientosEquipos%2FSKY_Crecimientos%2FVentaCrecimientos_TYA%7Dventacrecimientos_tya_client_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VENTACRECIMIENTOSTYACLIENTEP_WSDL_LOCATION = url;
        VENTACRECIMIENTOSTYACLIENTEP_EXCEPTION = e;
    }

    public VentacrecimientosTyaClientEp() {
        super(__getWsdlLocation(), VENTACRECIMIENTOSTYACLIENTEP_QNAME);
    }

    public VentacrecimientosTyaClientEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), VENTACRECIMIENTOSTYACLIENTEP_QNAME, features);
    }

    public VentacrecimientosTyaClientEp(URL wsdlLocation) {
        super(wsdlLocation, VENTACRECIMIENTOSTYACLIENTEP_QNAME);
    }

    public VentacrecimientosTyaClientEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VENTACRECIMIENTOSTYACLIENTEP_QNAME, features);
    }

    public VentacrecimientosTyaClientEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VentacrecimientosTyaClientEp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns VentaCrecimientosTYA
     */
    @WebEndpoint(name = "VentaCrecimientos_TYA_pt")
    public VentaCrecimientosTYA getVentaCrecimientosTYAPt() {
        return super.getPort(new QName("http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/VentaCrecimientos_TYA",
                                       "VentaCrecimientos_TYA_pt"), VentaCrecimientosTYA.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VentaCrecimientosTYA
     */
    @WebEndpoint(name = "VentaCrecimientos_TYA_pt")
    public VentaCrecimientosTYA getVentaCrecimientosTYAPt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/VentaCrecimientos_TYA",
                                       "VentaCrecimientos_TYA_pt"), VentaCrecimientosTYA.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VENTACRECIMIENTOSTYACLIENTEP_EXCEPTION != null) {
            throw VENTACRECIMIENTOSTYACLIENTEP_EXCEPTION;
        }
        return VENTACRECIMIENTOSTYACLIENTEP_WSDL_LOCATION;
    }

}
