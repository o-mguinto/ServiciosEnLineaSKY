
package mx.com.sky.sel.proxyclients.secinterface.datoscuentacrececombo;

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
@WebServiceClient(name = "DatosCuentaCreceComboSecInterface_ep",
                  targetNamespace = "http://xmlns.sky.com.mx/InterfaceServices/Sec/DatosCuentaCreceCombo",
                  wsdlLocation =
                  "https://preselsoa.sky.com.mx:443/soa-infra/services/SEC_Interface/DatosCuentaCreceComboSecInterface/DatosCuentaCreceComboSecInterface_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.sky.com.mx%2FInterfaceServices%2FSec%2FDatosCuentaCreceCombo%7DDatosCuentaCreceComboSecInterface_ep")
public class DatosCuentaCreceComboSecInterfaceEp extends Service {

    private final static URL DATOSCUENTACRECECOMBOSECINTERFACEEP_WSDL_LOCATION;
    private final static WebServiceException DATOSCUENTACRECECOMBOSECINTERFACEEP_EXCEPTION;
    private final static QName DATOSCUENTACRECECOMBOSECINTERFACEEP_QNAME =
        new QName("http://xmlns.sky.com.mx/InterfaceServices/Sec/DatosCuentaCreceCombo",
                  "DatosCuentaCreceComboSecInterface_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://preselsoa.sky.com.mx:443/soa-infra/services/SEC_Interface/DatosCuentaCreceComboSecInterface/DatosCuentaCreceComboSecInterface_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.sky.com.mx%2FInterfaceServices%2FSec%2FDatosCuentaCreceCombo%7DDatosCuentaCreceComboSecInterface_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DATOSCUENTACRECECOMBOSECINTERFACEEP_WSDL_LOCATION = url;
        DATOSCUENTACRECECOMBOSECINTERFACEEP_EXCEPTION = e;
    }

    public DatosCuentaCreceComboSecInterfaceEp() {
        super(__getWsdlLocation(), DATOSCUENTACRECECOMBOSECINTERFACEEP_QNAME);
    }

    public DatosCuentaCreceComboSecInterfaceEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), DATOSCUENTACRECECOMBOSECINTERFACEEP_QNAME, features);
    }

    public DatosCuentaCreceComboSecInterfaceEp(URL wsdlLocation) {
        super(wsdlLocation, DATOSCUENTACRECECOMBOSECINTERFACEEP_QNAME);
    }

    public DatosCuentaCreceComboSecInterfaceEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DATOSCUENTACRECECOMBOSECINTERFACEEP_QNAME, features);
    }

    public DatosCuentaCreceComboSecInterfaceEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DatosCuentaCreceComboSecInterfaceEp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns DatosCuentaCreceComboSecInterface
     */
    @WebEndpoint(name = "DatosCuentaCreceComboSecInterface_pt")
    public DatosCuentaCreceComboSecInterface getDatosCuentaCreceComboSecInterfacePt() {
        return super.getPort(new QName("http://xmlns.sky.com.mx/InterfaceServices/Sec/DatosCuentaCreceCombo",
                                       "DatosCuentaCreceComboSecInterface_pt"),
                             DatosCuentaCreceComboSecInterface.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DatosCuentaCreceComboSecInterface
     */
    @WebEndpoint(name = "DatosCuentaCreceComboSecInterface_pt")
    public DatosCuentaCreceComboSecInterface getDatosCuentaCreceComboSecInterfacePt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.sky.com.mx/InterfaceServices/Sec/DatosCuentaCreceCombo",
                                       "DatosCuentaCreceComboSecInterface_pt"), DatosCuentaCreceComboSecInterface.class,
                             features);
    }

    private static URL __getWsdlLocation() {
        if (DATOSCUENTACRECECOMBOSECINTERFACEEP_EXCEPTION != null) {
            throw DATOSCUENTACRECECOMBOSECINTERFACEEP_EXCEPTION;
        }
        return DATOSCUENTACRECECOMBOSECINTERFACEEP_WSDL_LOCATION;
    }

}
