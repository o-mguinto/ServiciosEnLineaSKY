
package mx.com.sky.enterpriseobjects.sel.consultarusocfdi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseobjects.sel.consultarusocfdi package.
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

    private final static QName _ConsultarUsoCFDIRequest_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sel/ConsultarUsoCFDI", "ConsultarUsoCFDIRequest");
    private final static QName _ConsultarUsoCFDIResponse_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sel/ConsultarUsoCFDI", "ConsultarUsoCFDIResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseobjects.sel.consultarusocfdi
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarUsoCFDIRequestType }
     *
     */
    public ConsultarUsoCFDIRequestType createConsultarUsoCFDIRequestType() {
        return new ConsultarUsoCFDIRequestType();
    }

    /**
     * Create an instance of {@link ConsultarUsoCFDIResponseType }
     *
     */
    public ConsultarUsoCFDIResponseType createConsultarUsoCFDIResponseType() {
        return new ConsultarUsoCFDIResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarUsoCFDIRequestType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/ConsultarUsoCFDI",
                    name = "ConsultarUsoCFDIRequest")
    public JAXBElement<ConsultarUsoCFDIRequestType> createConsultarUsoCFDIRequest(ConsultarUsoCFDIRequestType value) {
        return new JAXBElement<ConsultarUsoCFDIRequestType>(_ConsultarUsoCFDIRequest_QNAME,
                                                            ConsultarUsoCFDIRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarUsoCFDIResponseType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/ConsultarUsoCFDI",
                    name = "ConsultarUsoCFDIResponse")
    public JAXBElement<ConsultarUsoCFDIResponseType> createConsultarUsoCFDIResponse(ConsultarUsoCFDIResponseType value) {
        return new JAXBElement<ConsultarUsoCFDIResponseType>(_ConsultarUsoCFDIResponse_QNAME,
                                                             ConsultarUsoCFDIResponseType.class, null, value);
    }

}
