
package mx.com.sky.enterpriseobjects.siebel.obtenerctaskyinterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseobjects.siebel.obtenerctaskyinterface package.
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

    private final static QName _ObtenerCtaSkyRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Siebel/ObtenerCtaSkyInterface", "ObtenerCtaSkyRequestEBM");
    private final static QName _ObtenerCtaSkyResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Siebel/ObtenerCtaSkyInterface", "ObtenerCtaSkyResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseobjects.siebel.obtenerctaskyinterface
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerCtaSkyRequestEBMType }
     *
     */
    public ObtenerCtaSkyRequestEBMType createObtenerCtaSkyRequestEBMType() {
        return new ObtenerCtaSkyRequestEBMType();
    }

    /**
     * Create an instance of {@link ObtenerCtaSkyResponseEBMType }
     *
     */
    public ObtenerCtaSkyResponseEBMType createObtenerCtaSkyResponseEBMType() {
        return new ObtenerCtaSkyResponseEBMType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerCtaSkyRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Siebel/ObtenerCtaSkyInterface",
                    name = "ObtenerCtaSkyRequestEBM")
    public JAXBElement<ObtenerCtaSkyRequestEBMType> createObtenerCtaSkyRequestEBM(ObtenerCtaSkyRequestEBMType value) {
        return new JAXBElement<ObtenerCtaSkyRequestEBMType>(_ObtenerCtaSkyRequestEBM_QNAME,
                                                            ObtenerCtaSkyRequestEBMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerCtaSkyResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Siebel/ObtenerCtaSkyInterface",
                    name = "ObtenerCtaSkyResponseEBM")
    public JAXBElement<ObtenerCtaSkyResponseEBMType> createObtenerCtaSkyResponseEBM(ObtenerCtaSkyResponseEBMType value) {
        return new JAXBElement<ObtenerCtaSkyResponseEBMType>(_ObtenerCtaSkyResponseEBM_QNAME,
                                                             ObtenerCtaSkyResponseEBMType.class, null, value);
    }

}
