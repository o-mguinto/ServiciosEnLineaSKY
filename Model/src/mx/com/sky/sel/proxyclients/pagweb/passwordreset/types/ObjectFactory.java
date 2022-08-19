
package mx.com.sky.sel.proxyclients.pagweb.passwordreset.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.sel.proxyclients.pagweb.passwordreset.types package.
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

    private final static QName _PassAuxDatos_QNAME = new QName("http://www.sky.com.mx/password/aux", "passAuxDatos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.sel.proxyclients.pagweb.passwordreset.types
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PasswordResetProcessRequest }
     *
     */
    public PasswordResetProcessRequest createPasswordResetProcessRequest() {
        return new PasswordResetProcessRequest();
    }

    /**
     * Create an instance of {@link PasswordResetProcessResponse }
     *
     */
    public PasswordResetProcessResponse createPasswordResetProcessResponse() {
        return new PasswordResetProcessResponse();
    }

    /**
     * Create an instance of {@link PassAuxType }
     *
     */
    public PassAuxType createPassAuxType() {
        return new PassAuxType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassAuxType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/password/aux", name = "passAuxDatos")
    public JAXBElement<PassAuxType> createPassAuxDatos(PassAuxType value) {
        return new JAXBElement<PassAuxType>(_PassAuxDatos_QNAME, PassAuxType.class, null, value);
    }

}
