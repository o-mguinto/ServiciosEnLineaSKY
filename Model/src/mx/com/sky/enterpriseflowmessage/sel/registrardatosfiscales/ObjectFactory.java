
package mx.com.sky.enterpriseflowmessage.sel.registrardatosfiscales;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseflowmessage.sel.registrardatosfiscales package.
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

    private final static QName _RegistrarDatosFiscalesRequest_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseFlowMessage/Sel/RegistrarDatosFiscales",
                  "RegistrarDatosFiscalesRequest");
    private final static QName _RegistrarDatosFiscalesResponse_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseFlowMessage/Sel/RegistrarDatosFiscales",
                  "RegistrarDatosFiscalesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseflowmessage.sel.registrardatosfiscales
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegistrarDatosFiscalesRequestType }
     *
     */
    public RegistrarDatosFiscalesRequestType createRegistrarDatosFiscalesRequestType() {
        return new RegistrarDatosFiscalesRequestType();
    }

    /**
     * Create an instance of {@link RegistrarDatosFiscalesResponseType }
     *
     */
    public RegistrarDatosFiscalesResponseType createRegistrarDatosFiscalesResponseType() {
        return new RegistrarDatosFiscalesResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarDatosFiscalesRequestType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseFlowMessage/Sel/RegistrarDatosFiscales",
                    name = "RegistrarDatosFiscalesRequest")
    public JAXBElement<RegistrarDatosFiscalesRequestType> createRegistrarDatosFiscalesRequest(RegistrarDatosFiscalesRequestType value) {
        return new JAXBElement<RegistrarDatosFiscalesRequestType>(_RegistrarDatosFiscalesRequest_QNAME,
                                                                  RegistrarDatosFiscalesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarDatosFiscalesResponseType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseFlowMessage/Sel/RegistrarDatosFiscales",
                    name = "RegistrarDatosFiscalesResponse")
    public JAXBElement<RegistrarDatosFiscalesResponseType> createRegistrarDatosFiscalesResponse(RegistrarDatosFiscalesResponseType value) {
        return new JAXBElement<RegistrarDatosFiscalesResponseType>(_RegistrarDatosFiscalesResponse_QNAME,
                                                                   RegistrarDatosFiscalesResponseType.class, null,
                                                                   value);
    }

}
