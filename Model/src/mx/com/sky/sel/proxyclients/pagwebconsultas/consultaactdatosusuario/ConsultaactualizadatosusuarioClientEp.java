
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultaactdatosusuario;

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
@WebServiceClient(name = "consultaactualizadatosusuario_client_ep",
                  targetNamespace =
                  "http://xmlns.oracle.com/SKYConsultas/ConsultaActualizaDatosUsuario/ConsultaActualizaDatosUsuario",
                  wsdlLocation =
                  "https://preselsoa.sky.com.mx:443/soa-infra/services/pagwebconsultas/ConsultaActualizaDatosUsuario/consultaactualizadatosusuario_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FSKYConsultas%2FConsultaActualizaDatosUsuario%2FConsultaActualizaDatosUsuario%7Dconsultaactualizadatosusuario_client_ep")
public class ConsultaactualizadatosusuarioClientEp extends Service {

    private final static URL CONSULTAACTUALIZADATOSUSUARIOCLIENTEP_WSDL_LOCATION;
    private final static WebServiceException CONSULTAACTUALIZADATOSUSUARIOCLIENTEP_EXCEPTION;
    private final static QName CONSULTAACTUALIZADATOSUSUARIOCLIENTEP_QNAME =
        new QName("http://xmlns.oracle.com/SKYConsultas/ConsultaActualizaDatosUsuario/ConsultaActualizaDatosUsuario",
                  "consultaactualizadatosusuario_client_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("https://preselsoa.sky.com.mx:443/soa-infra/services/pagwebconsultas/ConsultaActualizaDatosUsuario/consultaactualizadatosusuario_client_ep?WSDL#%7Bhttp%3A%2F%2Fxmlns.oracle.com%2FSKYConsultas%2FConsultaActualizaDatosUsuario%2FConsultaActualizaDatosUsuario%7Dconsultaactualizadatosusuario_client_ep");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONSULTAACTUALIZADATOSUSUARIOCLIENTEP_WSDL_LOCATION = url;
        CONSULTAACTUALIZADATOSUSUARIOCLIENTEP_EXCEPTION = e;
    }

    public ConsultaactualizadatosusuarioClientEp() {
        super(__getWsdlLocation(), CONSULTAACTUALIZADATOSUSUARIOCLIENTEP_QNAME);
    }

    public ConsultaactualizadatosusuarioClientEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONSULTAACTUALIZADATOSUSUARIOCLIENTEP_QNAME, features);
    }

    public ConsultaactualizadatosusuarioClientEp(URL wsdlLocation) {
        super(wsdlLocation, CONSULTAACTUALIZADATOSUSUARIOCLIENTEP_QNAME);
    }

    public ConsultaactualizadatosusuarioClientEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONSULTAACTUALIZADATOSUSUARIOCLIENTEP_QNAME, features);
    }

    public ConsultaactualizadatosusuarioClientEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultaactualizadatosusuarioClientEp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ConsultaActualizaDatosUsuario
     */
    @WebEndpoint(name = "ConsultaActualizaDatosUsuario_pt")
    public ConsultaActualizaDatosUsuario getConsultaActualizaDatosUsuarioPt() {
        return super.getPort(new QName("http://xmlns.oracle.com/SKYConsultas/ConsultaActualizaDatosUsuario/ConsultaActualizaDatosUsuario",
                                       "ConsultaActualizaDatosUsuario_pt"), ConsultaActualizaDatosUsuario.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaActualizaDatosUsuario
     */
    @WebEndpoint(name = "ConsultaActualizaDatosUsuario_pt")
    public ConsultaActualizaDatosUsuario getConsultaActualizaDatosUsuarioPt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/SKYConsultas/ConsultaActualizaDatosUsuario/ConsultaActualizaDatosUsuario",
                                       "ConsultaActualizaDatosUsuario_pt"), ConsultaActualizaDatosUsuario.class,
                             features);
    }

    private static URL __getWsdlLocation() {
        if (CONSULTAACTUALIZADATOSUSUARIOCLIENTEP_EXCEPTION != null) {
            throw CONSULTAACTUALIZADATOSUSUARIOCLIENTEP_EXCEPTION;
        }
        return CONSULTAACTUALIZADATOSUSUARIOCLIENTEP_WSDL_LOCATION;
    }

}
