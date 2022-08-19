
package mx.com.sky.enterpriseobjects.soa.consultacuentainterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseobjects.soa.consultacuentainterface package.
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

    private final static QName _ConsultaCuentaRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultaCuentaInterface",
                  "ConsultaCuentaRequestEBM");
    private final static QName _ConsultaCuentaResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultaCuentaInterface",
                  "ConsultaCuentaResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseobjects.soa.consultacuentainterface
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaCuentaRequestEBMType }
     *
     */
    public ConsultaCuentaRequestEBMType createConsultaCuentaRequestEBMType() {
        return new ConsultaCuentaRequestEBMType();
    }

    /**
     * Create an instance of {@link ConsultaCuentaResponseEBMType }
     *
     */
    public ConsultaCuentaResponseEBMType createConsultaCuentaResponseEBMType() {
        return new ConsultaCuentaResponseEBMType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaCuentaRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultaCuentaInterface",
                    name = "ConsultaCuentaRequestEBM")
    public JAXBElement<ConsultaCuentaRequestEBMType> createConsultaCuentaRequestEBM(ConsultaCuentaRequestEBMType value) {
        return new JAXBElement<ConsultaCuentaRequestEBMType>(_ConsultaCuentaRequestEBM_QNAME,
                                                             ConsultaCuentaRequestEBMType.class,
                                                             null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaCuentaResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultaCuentaInterface",
                    name = "ConsultaCuentaResponseEBM")
    public JAXBElement<ConsultaCuentaResponseEBMType> createConsultaCuentaResponseEBM(ConsultaCuentaResponseEBMType value) {
        return new JAXBElement<ConsultaCuentaResponseEBMType>(_ConsultaCuentaResponseEBM_QNAME,
                                                              ConsultaCuentaResponseEBMType.class,
                                                              null, value);
    }

}
