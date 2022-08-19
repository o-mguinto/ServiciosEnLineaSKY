
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultacanalescarta.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.sel.proxyclients.pagwebconsultas.consultacanalescarta.types package.
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

    private final static QName _CanalALaCarta_QNAME =
        new QName("http://xmlns.oracle.com/ConsultaCanalesALaCarta", "CanalALaCarta");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.sel.proxyclients.pagwebconsultas.consultacanalescarta.types
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaCanalesALaCartaProcessRequest }
     *
     */
    public ConsultaCanalesALaCartaProcessRequest createConsultaCanalesALaCartaProcessRequest() {
        return new ConsultaCanalesALaCartaProcessRequest();
    }

    /**
     * Create an instance of {@link ConsultaCanalesALaCartaProcessResponse }
     *
     */
    public ConsultaCanalesALaCartaProcessResponse createConsultaCanalesALaCartaProcessResponse() {
        return new ConsultaCanalesALaCartaProcessResponse();
    }

    /**
     * Create an instance of {@link CanalALaCartaCollection }
     *
     */
    public CanalALaCartaCollection createCanalALaCartaCollection() {
        return new CanalALaCartaCollection();
    }

    /**
     * Create an instance of {@link CanalALaCarta }
     *
     */
    public CanalALaCarta createCanalALaCarta() {
        return new CanalALaCarta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanalALaCarta }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/ConsultaCanalesALaCarta", name = "CanalALaCarta")
    public JAXBElement<CanalALaCarta> createCanalALaCarta(CanalALaCarta value) {
        return new JAXBElement<CanalALaCarta>(_CanalALaCarta_QNAME, CanalALaCarta.class, null, value);
    }

}
