
package mx.com.sky.enterpriseobjects.sel.validarpreregistroselinterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseobjects.sel.validarpreregistroselinterface package.
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

    private final static QName _ValidarPreRegistroSelEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sel/ValidarPreRegistroSelInterface",
                  "ValidarPreRegistroSelEBM");
    private final static QName _ValidarPreRegistroSelResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sel/ValidarPreRegistroSelInterface",
                  "ValidarPreRegistroSelResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseobjects.sel.validarpreregistroselinterface
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidarPreRegistroSelEBMType }
     *
     */
    public ValidarPreRegistroSelEBMType createValidarPreRegistroSelEBMType() {
        return new ValidarPreRegistroSelEBMType();
    }

    /**
     * Create an instance of {@link ValidarPreRegistroSelResponseEBMType }
     *
     */
    public ValidarPreRegistroSelResponseEBMType createValidarPreRegistroSelResponseEBMType() {
        return new ValidarPreRegistroSelResponseEBMType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarPreRegistroSelEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/ValidarPreRegistroSelInterface",
                    name = "ValidarPreRegistroSelEBM")
    public JAXBElement<ValidarPreRegistroSelEBMType> createValidarPreRegistroSelEBM(ValidarPreRegistroSelEBMType value) {
        return new JAXBElement<ValidarPreRegistroSelEBMType>(_ValidarPreRegistroSelEBM_QNAME,
                                                             ValidarPreRegistroSelEBMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarPreRegistroSelResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/ValidarPreRegistroSelInterface",
                    name = "ValidarPreRegistroSelResponseEBM")
    public JAXBElement<ValidarPreRegistroSelResponseEBMType> createValidarPreRegistroSelResponseEBM(ValidarPreRegistroSelResponseEBMType value) {
        return new JAXBElement<ValidarPreRegistroSelResponseEBMType>(_ValidarPreRegistroSelResponseEBM_QNAME,
                                                                     ValidarPreRegistroSelResponseEBMType.class, null,
                                                                     value);
    }

}
