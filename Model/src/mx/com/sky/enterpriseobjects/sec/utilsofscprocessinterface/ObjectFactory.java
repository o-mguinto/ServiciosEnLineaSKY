
package mx.com.sky.enterpriseobjects.sec.utilsofscprocessinterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseobjects.sec.utilsofscprocessinterface package.
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

    private final static QName _UtilsOfscProcessRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sec/UtilsOfscProcessInterface",
                  "UtilsOfscProcessRequestEBM");
    private final static QName _UtilsOfscProcessResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sec/UtilsOfscProcessInterface",
                  "UtilsOfscProcessResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseobjects.sec.utilsofscprocessinterface
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UtilsOfscProcessRequestEBMType }
     *
     */
    public UtilsOfscProcessRequestEBMType createUtilsOfscProcessRequestEBMType() {
        return new UtilsOfscProcessRequestEBMType();
    }

    /**
     * Create an instance of {@link UtilsOfscProcessResponseEBMType }
     *
     */
    public UtilsOfscProcessResponseEBMType createUtilsOfscProcessResponseEBMType() {
        return new UtilsOfscProcessResponseEBMType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UtilsOfscProcessRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sec/UtilsOfscProcessInterface",
                    name = "UtilsOfscProcessRequestEBM")
    public JAXBElement<UtilsOfscProcessRequestEBMType> createUtilsOfscProcessRequestEBM(UtilsOfscProcessRequestEBMType value) {
        return new JAXBElement<UtilsOfscProcessRequestEBMType>(_UtilsOfscProcessRequestEBM_QNAME,
                                                               UtilsOfscProcessRequestEBMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UtilsOfscProcessResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sec/UtilsOfscProcessInterface",
                    name = "UtilsOfscProcessResponseEBM")
    public JAXBElement<UtilsOfscProcessResponseEBMType> createUtilsOfscProcessResponseEBM(UtilsOfscProcessResponseEBMType value) {
        return new JAXBElement<UtilsOfscProcessResponseEBMType>(_UtilsOfscProcessResponseEBM_QNAME,
                                                                UtilsOfscProcessResponseEBMType.class, null, value);
    }

}
