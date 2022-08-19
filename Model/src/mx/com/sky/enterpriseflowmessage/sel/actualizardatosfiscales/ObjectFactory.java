
package mx.com.sky.enterpriseflowmessage.sel.actualizardatosfiscales;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseflowmessage.sel.actualizardatosfiscales package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ActualizarDatosFiscalesRequest_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseFlowMessage/Sel/ActualizarDatosFiscales",
                  "ActualizarDatosFiscalesRequest");
    private final static QName _ActualizarDatosFiscalesResponse_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseFlowMessage/Sel/ActualizarDatosFiscales",
                  "ActualizarDatosFiscalesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseflowmessage.sel.actualizardatosfiscales
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizarDatosFiscalesRequestType }
     *
     */
    public ActualizarDatosFiscalesRequestType createActualizarDatosFiscalesRequestType() {
        return new ActualizarDatosFiscalesRequestType();
    }

    /**
     * Create an instance of {@link ActualizarDatosFiscalesResponseType }
     *
     */
    public ActualizarDatosFiscalesResponseType createActualizarDatosFiscalesResponseType() {
        return new ActualizarDatosFiscalesResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarDatosFiscalesRequestType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseFlowMessage/Sel/ActualizarDatosFiscales",
                    name = "ActualizarDatosFiscalesRequest")
    public JAXBElement<ActualizarDatosFiscalesRequestType> createActualizarDatosFiscalesRequest(ActualizarDatosFiscalesRequestType value) {
        return new JAXBElement<ActualizarDatosFiscalesRequestType>(_ActualizarDatosFiscalesRequest_QNAME,
                                                                   ActualizarDatosFiscalesRequestType.class, null,
                                                                   value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarDatosFiscalesResponseType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseFlowMessage/Sel/ActualizarDatosFiscales",
                    name = "ActualizarDatosFiscalesResponse")
    public JAXBElement<ActualizarDatosFiscalesResponseType> createActualizarDatosFiscalesResponse(ActualizarDatosFiscalesResponseType value) {
        return new JAXBElement<ActualizarDatosFiscalesResponseType>(_ActualizarDatosFiscalesResponse_QNAME,
                                                                    ActualizarDatosFiscalesResponseType.class, null,
                                                                    value);
    }

}
