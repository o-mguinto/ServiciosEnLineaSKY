
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultacr.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.sel.proxyclients.pagwebconsultas.consultacr.types package.
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

    private final static QName _ControlRemoto_QNAME =
        new QName("http://xmlns.oracle.com/ConsultaControlRemoto", "ControlRemoto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.sel.proxyclients.pagwebconsultas.consultacr.types
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaControlRemotoProcessRequest }
     *
     */
    public ConsultaControlRemotoProcessRequest createConsultaControlRemotoProcessRequest() {
        return new ConsultaControlRemotoProcessRequest();
    }

    /**
     * Create an instance of {@link ConsultaControlRemotoProcessResponse }
     *
     */
    public ConsultaControlRemotoProcessResponse createConsultaControlRemotoProcessResponse() {
        return new ConsultaControlRemotoProcessResponse();
    }

    /**
     * Create an instance of {@link ControlRemotoCollection }
     *
     */
    public ControlRemotoCollection createControlRemotoCollection() {
        return new ControlRemotoCollection();
    }

    /**
     * Create an instance of {@link ControlRemoto }
     *
     */
    public ControlRemoto createControlRemoto() {
        return new ControlRemoto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ControlRemoto }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/ConsultaControlRemoto", name = "ControlRemoto")
    public JAXBElement<ControlRemoto> createControlRemoto(ControlRemoto value) {
        return new JAXBElement<ControlRemoto>(_ControlRemoto_QNAME, ControlRemoto.class, null, value);
    }

}
