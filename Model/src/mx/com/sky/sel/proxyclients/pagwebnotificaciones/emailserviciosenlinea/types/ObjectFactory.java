
package mx.com.sky.sel.proxyclients.pagwebnotificaciones.emailserviciosenlinea.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.sel.proxyclients.pagwebnotificaciones.emailserviciosenlinea.types package.
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

    private final static QName _DatosAux_QNAME = new QName("http://www.sky.com.mx/email/notificacion", "datosAux");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.sel.proxyclients.pagwebnotificaciones.emailserviciosenlinea.types
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Process }
     *
     */
    public Process createProcess() {
        return new Process();
    }

    /**
     * Create an instance of {@link ParametroType }
     *
     */
    public ParametroType createParametroType() {
        return new ParametroType();
    }

    /**
     * Create an instance of {@link AttachmentType }
     *
     */
    public AttachmentType createAttachmentType() {
        return new AttachmentType();
    }

    /**
     * Create an instance of {@link AuxType }
     *
     */
    public AuxType createAuxType() {
        return new AuxType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuxType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/email/notificacion", name = "datosAux")
    public JAXBElement<AuxType> createDatosAux(AuxType value) {
        return new JAXBElement<AuxType>(_DatosAux_QNAME, AuxType.class, null, value);
    }

}
