
package mx.com.sky.enterpriseobjects.sec.validacrecimientosppbtiinterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseobjects.sec.validacrecimientosppbtiinterface package.
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

    private final static QName _ValidaCrecimientosPpBtiRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sec/ValidaCrecimientosPpBtiInterface",
                  "ValidaCrecimientosPpBtiRequestEBM");
    private final static QName _ValidaCrecimientosPpBtiResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sec/ValidaCrecimientosPpBtiInterface",
                  "ValidaCrecimientosPpBtiResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseobjects.sec.validacrecimientosppbtiinterface
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidaCrecimientosPpBtiRequestEBMType }
     *
     */
    public ValidaCrecimientosPpBtiRequestEBMType createValidaCrecimientosPpBtiRequestEBMType() {
        return new ValidaCrecimientosPpBtiRequestEBMType();
    }

    /**
     * Create an instance of {@link ValidaCrecimientosPpBtiResponseEBMType }
     *
     */
    public ValidaCrecimientosPpBtiResponseEBMType createValidaCrecimientosPpBtiResponseEBMType() {
        return new ValidaCrecimientosPpBtiResponseEBMType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidaCrecimientosPpBtiRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sec/ValidaCrecimientosPpBtiInterface",
                    name = "ValidaCrecimientosPpBtiRequestEBM")
    public JAXBElement<ValidaCrecimientosPpBtiRequestEBMType> createValidaCrecimientosPpBtiRequestEBM(ValidaCrecimientosPpBtiRequestEBMType value) {
        return new JAXBElement<ValidaCrecimientosPpBtiRequestEBMType>(_ValidaCrecimientosPpBtiRequestEBM_QNAME,
                                                                      ValidaCrecimientosPpBtiRequestEBMType.class, null,
                                                                      value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidaCrecimientosPpBtiResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sec/ValidaCrecimientosPpBtiInterface",
                    name = "ValidaCrecimientosPpBtiResponseEBM")
    public JAXBElement<ValidaCrecimientosPpBtiResponseEBMType> createValidaCrecimientosPpBtiResponseEBM(ValidaCrecimientosPpBtiResponseEBMType value) {
        return new JAXBElement<ValidaCrecimientosPpBtiResponseEBMType>(_ValidaCrecimientosPpBtiResponseEBM_QNAME,
                                                                       ValidaCrecimientosPpBtiResponseEBMType.class,
                                                                       null, value);
    }

}
