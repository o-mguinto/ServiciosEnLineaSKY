
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaquete.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaquete.types package.
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

    private final static QName _Paquete_QNAME = new QName("http://xmlns.oracle.com/ConsultaPaquete", "Paquete");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaquete.types
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaPaqueteProcessRequest }
     *
     */
    public ConsultaPaqueteProcessRequest createConsultaPaqueteProcessRequest() {
        return new ConsultaPaqueteProcessRequest();
    }

    /**
     * Create an instance of {@link ConsultaPaqueteProcessResponse }
     *
     */
    public ConsultaPaqueteProcessResponse createConsultaPaqueteProcessResponse() {
        return new ConsultaPaqueteProcessResponse();
    }

    /**
     * Create an instance of {@link PaqueteCollection }
     *
     */
    public PaqueteCollection createPaqueteCollection() {
        return new PaqueteCollection();
    }

    /**
     * Create an instance of {@link Paquete }
     *
     */
    public Paquete createPaquete() {
        return new Paquete();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Paquete }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/ConsultaPaquete", name = "Paquete")
    public JAXBElement<Paquete> createPaquete(Paquete value) {
        return new JAXBElement<Paquete>(_Paquete_QNAME, Paquete.class, null, value);
    }

}
