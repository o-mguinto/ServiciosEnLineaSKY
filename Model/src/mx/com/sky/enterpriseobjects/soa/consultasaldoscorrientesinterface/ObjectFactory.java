
package mx.com.sky.enterpriseobjects.soa.consultasaldoscorrientesinterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseobjects.soa.consultasaldoscorrientesinterface package.
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

    private final static QName _ConsultaSaldosCorrientesRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultaSaldosCorrientesInterface",
                  "ConsultaSaldosCorrientesRequestEBM");
    private final static QName _ConsultaSaldosCorrientesResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultaSaldosCorrientesInterface",
                  "ConsultaSaldosCorrientesResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseobjects.soa.consultasaldoscorrientesinterface
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaSaldosCorrientesRequestEBMType }
     *
     */
    public ConsultaSaldosCorrientesRequestEBMType createConsultaSaldosCorrientesRequestEBMType() {
        return new ConsultaSaldosCorrientesRequestEBMType();
    }

    /**
     * Create an instance of {@link ConsultaSaldosCorrientesResponseEBMType }
     *
     */
    public ConsultaSaldosCorrientesResponseEBMType createConsultaSaldosCorrientesResponseEBMType() {
        return new ConsultaSaldosCorrientesResponseEBMType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaSaldosCorrientesRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultaSaldosCorrientesInterface",
                    name = "ConsultaSaldosCorrientesRequestEBM")
    public JAXBElement<ConsultaSaldosCorrientesRequestEBMType> createConsultaSaldosCorrientesRequestEBM(ConsultaSaldosCorrientesRequestEBMType value) {
        return new JAXBElement<ConsultaSaldosCorrientesRequestEBMType>(_ConsultaSaldosCorrientesRequestEBM_QNAME,
                                                                       ConsultaSaldosCorrientesRequestEBMType.class,
                                                                       null,
                                                                       value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaSaldosCorrientesResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultaSaldosCorrientesInterface",
                    name = "ConsultaSaldosCorrientesResponseEBM")
    public JAXBElement<ConsultaSaldosCorrientesResponseEBMType> createConsultaSaldosCorrientesResponseEBM(ConsultaSaldosCorrientesResponseEBMType value) {
        return new JAXBElement<ConsultaSaldosCorrientesResponseEBMType>(_ConsultaSaldosCorrientesResponseEBM_QNAME,
                                                                        ConsultaSaldosCorrientesResponseEBMType.class,
                                                                        null,
                                                                        value);
    }

}
