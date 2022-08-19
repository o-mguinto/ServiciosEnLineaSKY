
package mx.com.sky.enterpriseobjects.sel.tarjetapagoebo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseobjects.sel.tarjetapagoebo package.
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

    private final static QName _DatosTarjetaPago_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sel/TarjetaPagoEBO",
                  "DatosTarjetaPago");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseobjects.sel.tarjetapagoebo
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DatosTarjetaPagoType }
     *
     */
    public DatosTarjetaPagoType createDatosTarjetaPagoType() {
        return new DatosTarjetaPagoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosTarjetaPagoType }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseObjects/Sel/TarjetaPagoEBO",
                    name = "DatosTarjetaPago")
    public JAXBElement<DatosTarjetaPagoType> createDatosTarjetaPago(DatosTarjetaPagoType value) {
        return new JAXBElement<DatosTarjetaPagoType>(_DatosTarjetaPago_QNAME,
                                                     DatosTarjetaPagoType.class,
                                                     null, value);
    }

}
