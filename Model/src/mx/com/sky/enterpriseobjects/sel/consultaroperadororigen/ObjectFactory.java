
package mx.com.sky.enterpriseobjects.sel.consultaroperadororigen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseobjects.sel.consultaroperadororigen package.
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

    private final static QName _ConsultarOperadorOrigenRequest_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sel/ConsultarOperadorOrigen",
                  "ConsultarOperadorOrigenRequest");
    private final static QName _ConsultarOperadorOrigenResponse_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sel/ConsultarOperadorOrigen",
                  "ConsultarOperadorOrigenResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseobjects.sel.consultaroperadororigen
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarOperadorOrigenRequestEBMType }
     *
     */
    public ConsultarOperadorOrigenRequestEBMType createConsultarOperadorOrigenRequestEBMType() {
        return new ConsultarOperadorOrigenRequestEBMType();
    }

    /**
     * Create an instance of {@link ConsultarOperadorOrigenResponseEBMType }
     *
     */
    public ConsultarOperadorOrigenResponseEBMType createConsultarOperadorOrigenResponseEBMType() {
        return new ConsultarOperadorOrigenResponseEBMType();
    }

    /**
     * Create an instance of {@link OperadorType }
     *
     */
    public OperadorType createOperadorType() {
        return new OperadorType();
    }

    /**
     * Create an instance of {@link OperadorListType }
     *
     */
    public OperadorListType createOperadorListType() {
        return new OperadorListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarOperadorOrigenRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/ConsultarOperadorOrigen",
                    name = "ConsultarOperadorOrigenRequest")
    public JAXBElement<ConsultarOperadorOrigenRequestEBMType> createConsultarOperadorOrigenRequest(ConsultarOperadorOrigenRequestEBMType value) {
        return new JAXBElement<ConsultarOperadorOrigenRequestEBMType>(_ConsultarOperadorOrigenRequest_QNAME,
                                                                      ConsultarOperadorOrigenRequestEBMType.class, null,
                                                                      value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarOperadorOrigenResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/ConsultarOperadorOrigen",
                    name = "ConsultarOperadorOrigenResponse")
    public JAXBElement<ConsultarOperadorOrigenResponseEBMType> createConsultarOperadorOrigenResponse(ConsultarOperadorOrigenResponseEBMType value) {
        return new JAXBElement<ConsultarOperadorOrigenResponseEBMType>(_ConsultarOperadorOrigenResponse_QNAME,
                                                                       ConsultarOperadorOrigenResponseEBMType.class,
                                                                       null, value);
    }

}
