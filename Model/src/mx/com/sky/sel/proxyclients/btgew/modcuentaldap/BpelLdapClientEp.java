
package mx.com.sky.sel.proxyclients.btgew.modcuentaldap;

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
@WebServiceClient(name = "bpel_ldap_client_ep",
                  targetNamespace = "http://xmlns.oracle.com/SKY_BTGEW/ModificarCuentaLDAP/BPEL_ModificarCuentaLDAP",
                  wsdlLocation =
                  "https://preselsoa.sky.com.mx:443/soa-infra/services/btgew/ModificarCuentaLDAP/bpel_ldap_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FSKY_BTGEW%2FModificarCuentaLDAP%2FBPEL_ModificarCuentaLDAP%7Dbpel_ldap_client_ep")
public class BpelLdapClientEp extends Service {

    private final static URL BPELLDAPCLIENTEP_WSDL_LOCATION;
    private final static WebServiceException BPELLDAPCLIENTEP_EXCEPTION;
    private final static QName BPELLDAPCLIENTEP_QNAME =
        new QName("http://xmlns.oracle.com/SKY_BTGEW/ModificarCuentaLDAP/BPEL_ModificarCuentaLDAP",
                  "bpel_ldap_client_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://preselsoa.sky.com.mx:443/soa-infra/services/btgew/ModificarCuentaLDAP/bpel_ldap_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FSKY_BTGEW%2FModificarCuentaLDAP%2FBPEL_ModificarCuentaLDAP%7Dbpel_ldap_client_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BPELLDAPCLIENTEP_WSDL_LOCATION = url;
        BPELLDAPCLIENTEP_EXCEPTION = e;
    }

    public BpelLdapClientEp() {
        super(__getWsdlLocation(), BPELLDAPCLIENTEP_QNAME);
    }

    public BpelLdapClientEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), BPELLDAPCLIENTEP_QNAME, features);
    }

    public BpelLdapClientEp(URL wsdlLocation) {
        super(wsdlLocation, BPELLDAPCLIENTEP_QNAME);
    }

    public BpelLdapClientEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BPELLDAPCLIENTEP_QNAME, features);
    }

    public BpelLdapClientEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BpelLdapClientEp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns BPELModificarCuentaLDAP
     */
    @WebEndpoint(name = "BPEL_ModificarCuentaLDAP_pt")
    public BPELModificarCuentaLDAP getBPELModificarCuentaLDAPPt() {
        return super.getPort(new QName("http://xmlns.oracle.com/SKY_BTGEW/ModificarCuentaLDAP/BPEL_ModificarCuentaLDAP",
                                       "BPEL_ModificarCuentaLDAP_pt"), BPELModificarCuentaLDAP.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BPELModificarCuentaLDAP
     */
    @WebEndpoint(name = "BPEL_ModificarCuentaLDAP_pt")
    public BPELModificarCuentaLDAP getBPELModificarCuentaLDAPPt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/SKY_BTGEW/ModificarCuentaLDAP/BPEL_ModificarCuentaLDAP",
                                       "BPEL_ModificarCuentaLDAP_pt"), BPELModificarCuentaLDAP.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BPELLDAPCLIENTEP_EXCEPTION != null) {
            throw BPELLDAPCLIENTEP_EXCEPTION;
        }
        return BPELLDAPCLIENTEP_WSDL_LOCATION;
    }

}
