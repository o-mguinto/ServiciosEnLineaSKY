
package mx.com.sky.sel.proxyclients.ejb.replicareventosom.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.sel.proxyclients.ejb.replicareventosom.types package.
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

    private final static QName _Procesar_QNAME = new QName("http://ws.eventos.servicios.sky.com.mx/", "procesar");
    private final static QName _ProcesarResponse_QNAME =
        new QName("http://ws.eventos.servicios.sky.com.mx/", "procesarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.sel.proxyclients.ejb.replicareventosom.types
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Procesar }
     *
     */
    public Procesar createProcesar() {
        return new Procesar();
    }

    /**
     * Create an instance of {@link ProcesarResponse }
     *
     */
    public ProcesarResponse createProcesarResponse() {
        return new ProcesarResponse();
    }

    /**
     * Create an instance of {@link ReplicatorBean }
     *
     */
    public ReplicatorBean createReplicatorBean() {
        return new ReplicatorBean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Procesar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.eventos.servicios.sky.com.mx/", name = "procesar")
    public JAXBElement<Procesar> createProcesar(Procesar value) {
        return new JAXBElement<Procesar>(_Procesar_QNAME, Procesar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcesarResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ws.eventos.servicios.sky.com.mx/", name = "procesarResponse")
    public JAXBElement<ProcesarResponse> createProcesarResponse(ProcesarResponse value) {
        return new JAXBElement<ProcesarResponse>(_ProcesarResponse_QNAME, ProcesarResponse.class, null, value);
    }

}
