
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultadatoscs.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.sel.proxyclients.pagwebconsultas.consultadatoscs.types package.
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

    private final static QName _MensajeIN_QNAME = new QName("http://www.sky.com.mx.consultadatos", "mensajeIN");
    private final static QName _MensajeOUT_QNAME = new QName("http://www.sky.com.mx.consultadatos", "mensajeOUT");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.sel.proxyclients.pagwebconsultas.consultadatoscs.types
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MensajeInType }
     *
     */
    public MensajeInType createMensajeInType() {
        return new MensajeInType();
    }

    /**
     * Create an instance of {@link MensajeOutType }
     *
     */
    public MensajeOutType createMensajeOutType() {
        return new MensajeOutType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeInType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx.consultadatos", name = "mensajeIN")
    public JAXBElement<MensajeInType> createMensajeIN(MensajeInType value) {
        return new JAXBElement<MensajeInType>(_MensajeIN_QNAME, MensajeInType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeOutType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx.consultadatos", name = "mensajeOUT")
    public JAXBElement<MensajeOutType> createMensajeOUT(MensajeOutType value) {
        return new JAXBElement<MensajeOutType>(_MensajeOUT_QNAME, MensajeOutType.class, null, value);
    }

}
