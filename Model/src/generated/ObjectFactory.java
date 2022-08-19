
package generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the generated package.
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

    private final static QName _DatosAux_QNAME = new QName("", "datosAux");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DatosAuxType }
     *
     */
    public DatosAuxType createDatosAuxType() {
        return new DatosAuxType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosAuxType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "datosAux")
    public JAXBElement<DatosAuxType> createDatosAux(DatosAuxType value) {
        return new JAXBElement<DatosAuxType>(_DatosAux_QNAME, DatosAuxType.class, null, value);
    }

}
