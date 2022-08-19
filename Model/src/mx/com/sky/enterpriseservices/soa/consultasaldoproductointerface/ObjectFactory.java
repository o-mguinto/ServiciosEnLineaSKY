
package mx.com.sky.enterpriseservices.soa.consultasaldoproductointerface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseservices.soa.consultasaldoproductointerface package.
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

    private final static QName _ConsultaSaldoProductoRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseServices/Soa/ConsultaSaldoProductoInterface",
                  "ConsultaSaldoProductoRequestEBM");
    private final static QName _ConsultaSaldoProductoResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseServices/Soa/ConsultaSaldoProductoInterface",
                  "ConsultaSaldoProductoResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseservices.soa.consultasaldoproductointerface
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaSaldoProductoRequestEBMType }
     *
     */
    public ConsultaSaldoProductoRequestEBMType createConsultaSaldoProductoRequestEBMType() {
        return new ConsultaSaldoProductoRequestEBMType();
    }

    /**
     * Create an instance of {@link ConsultaSaldoProductoResponseEBMType }
     *
     */
    public ConsultaSaldoProductoResponseEBMType createConsultaSaldoProductoResponseEBMType() {
        return new ConsultaSaldoProductoResponseEBMType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaSaldoProductoRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseServices/Soa/ConsultaSaldoProductoInterface",
                    name = "ConsultaSaldoProductoRequestEBM")
    public JAXBElement<ConsultaSaldoProductoRequestEBMType> createConsultaSaldoProductoRequestEBM(ConsultaSaldoProductoRequestEBMType value) {
        return new JAXBElement<ConsultaSaldoProductoRequestEBMType>(_ConsultaSaldoProductoRequestEBM_QNAME,
                                                                    ConsultaSaldoProductoRequestEBMType.class, null,
                                                                    value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaSaldoProductoResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseServices/Soa/ConsultaSaldoProductoInterface",
                    name = "ConsultaSaldoProductoResponseEBM")
    public JAXBElement<ConsultaSaldoProductoResponseEBMType> createConsultaSaldoProductoResponseEBM(ConsultaSaldoProductoResponseEBMType value) {
        return new JAXBElement<ConsultaSaldoProductoResponseEBMType>(_ConsultaSaldoProductoResponseEBM_QNAME,
                                                                     ConsultaSaldoProductoResponseEBMType.class, null,
                                                                     value);
    }

}
