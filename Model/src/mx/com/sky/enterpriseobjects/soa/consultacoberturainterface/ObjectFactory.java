
package mx.com.sky.enterpriseobjects.soa.consultacoberturainterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseobjects.soa.consultacoberturainterface package.
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

    private final static QName _ConsultaCoberturaRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultaCoberturaInterface",
                  "ConsultaCoberturaRequestEBM");
    private final static QName _ConsultaCoberturaResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultaCoberturaInterface",
                  "ConsultaCoberturaResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseobjects.soa.consultacoberturainterface
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaCoberturaRequestEBMType }
     *
     */
    public ConsultaCoberturaRequestEBMType createConsultaCoberturaRequestEBMType() {
        return new ConsultaCoberturaRequestEBMType();
    }

    /**
     * Create an instance of {@link ConsultaCoberturaResponseEBMType }
     *
     */
    public ConsultaCoberturaResponseEBMType createConsultaCoberturaResponseEBMType() {
        return new ConsultaCoberturaResponseEBMType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaCoberturaRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultaCoberturaInterface",
                    name = "ConsultaCoberturaRequestEBM")
    public JAXBElement<ConsultaCoberturaRequestEBMType> createConsultaCoberturaRequestEBM(ConsultaCoberturaRequestEBMType value) {
        return new JAXBElement<ConsultaCoberturaRequestEBMType>(_ConsultaCoberturaRequestEBM_QNAME,
                                                                ConsultaCoberturaRequestEBMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaCoberturaResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultaCoberturaInterface",
                    name = "ConsultaCoberturaResponseEBM")
    public JAXBElement<ConsultaCoberturaResponseEBMType> createConsultaCoberturaResponseEBM(ConsultaCoberturaResponseEBMType value) {
        return new JAXBElement<ConsultaCoberturaResponseEBMType>(_ConsultaCoberturaResponseEBM_QNAME,
                                                                 ConsultaCoberturaResponseEBMType.class, null, value);
    }

}
