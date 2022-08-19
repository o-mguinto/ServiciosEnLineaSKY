
package mx.com.sky.enterpriseobjects.soa.consultapreciorecargainterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseobjects.soa.consultapreciorecargainterface package.
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

    private final static QName _ConsultaPrecioRecargaEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultaPrecioRecargaInterface",
                  "ConsultaPrecioRecargaEBM");
    private final static QName _ConsultaPrecioRecargaResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultaPrecioRecargaInterface",
                  "ConsultaPrecioRecargaResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseobjects.soa.consultapreciorecargainterface
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaPrecioRecargaEBMType }
     *
     */
    public ConsultaPrecioRecargaEBMType createConsultaPrecioRecargaEBMType() {
        return new ConsultaPrecioRecargaEBMType();
    }

    /**
     * Create an instance of {@link ConsultaPrecioRecargaResponseEBMType }
     *
     */
    public ConsultaPrecioRecargaResponseEBMType createConsultaPrecioRecargaResponseEBMType() {
        return new ConsultaPrecioRecargaResponseEBMType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPrecioRecargaEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultaPrecioRecargaInterface",
                    name = "ConsultaPrecioRecargaEBM")
    public JAXBElement<ConsultaPrecioRecargaEBMType> createConsultaPrecioRecargaEBM(ConsultaPrecioRecargaEBMType value) {
        return new JAXBElement<ConsultaPrecioRecargaEBMType>(_ConsultaPrecioRecargaEBM_QNAME,
                                                             ConsultaPrecioRecargaEBMType.class,
                                                             null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPrecioRecargaResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultaPrecioRecargaInterface",
                    name = "ConsultaPrecioRecargaResponseEBM")
    public JAXBElement<ConsultaPrecioRecargaResponseEBMType> createConsultaPrecioRecargaResponseEBM(ConsultaPrecioRecargaResponseEBMType value) {
        return new JAXBElement<ConsultaPrecioRecargaResponseEBMType>(_ConsultaPrecioRecargaResponseEBM_QNAME,
                                                                     ConsultaPrecioRecargaResponseEBMType.class,
                                                                     null,
                                                                     value);
    }

}
