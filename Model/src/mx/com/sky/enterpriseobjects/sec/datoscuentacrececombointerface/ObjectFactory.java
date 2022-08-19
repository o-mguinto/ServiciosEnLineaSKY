
package mx.com.sky.enterpriseobjects.sec.datoscuentacrececombointerface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseobjects.sec.datoscuentacrececombointerface package.
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

    private final static QName _DatosCuentaCreceComboRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sec/DatosCuentaCreceComboInterface",
                  "DatosCuentaCreceComboRequestEBM");
    private final static QName _DatosCuentaCreceComboResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sec/DatosCuentaCreceComboInterface",
                  "DatosCuentaCreceComboResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseobjects.sec.datoscuentacrececombointerface
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DatosCuentaCreceComboRequestEBMType }
     *
     */
    public DatosCuentaCreceComboRequestEBMType createDatosCuentaCreceComboRequestEBMType() {
        return new DatosCuentaCreceComboRequestEBMType();
    }

    /**
     * Create an instance of {@link DatosCuentaCreceComboResponseEBMType }
     *
     */
    public DatosCuentaCreceComboResponseEBMType createDatosCuentaCreceComboResponseEBMType() {
        return new DatosCuentaCreceComboResponseEBMType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosCuentaCreceComboRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sec/DatosCuentaCreceComboInterface",
                    name = "DatosCuentaCreceComboRequestEBM")
    public JAXBElement<DatosCuentaCreceComboRequestEBMType> createDatosCuentaCreceComboRequestEBM(DatosCuentaCreceComboRequestEBMType value) {
        return new JAXBElement<DatosCuentaCreceComboRequestEBMType>(_DatosCuentaCreceComboRequestEBM_QNAME,
                                                                    DatosCuentaCreceComboRequestEBMType.class, null,
                                                                    value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosCuentaCreceComboResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sec/DatosCuentaCreceComboInterface",
                    name = "DatosCuentaCreceComboResponseEBM")
    public JAXBElement<DatosCuentaCreceComboResponseEBMType> createDatosCuentaCreceComboResponseEBM(DatosCuentaCreceComboResponseEBMType value) {
        return new JAXBElement<DatosCuentaCreceComboResponseEBMType>(_DatosCuentaCreceComboResponseEBM_QNAME,
                                                                     DatosCuentaCreceComboResponseEBMType.class, null,
                                                                     value);
    }

}
