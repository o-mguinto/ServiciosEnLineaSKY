
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultaprodcontratado.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.sel.proxyclients.pagwebconsultas.consultaprodcontratado.types package.
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

    private final static QName _CodigoErrorCodigo_QNAME =
        new QName("http://xmlns.oracle.com/SKYConsultas/ConsultaProductoContratado/ConsultaProductoContratado",
                  "Codigo");
    private final static QName _CodigoErrorResumen_QNAME =
        new QName("http://xmlns.oracle.com/SKYConsultas/ConsultaProductoContratado/ConsultaProductoContratado",
                  "Resumen");
    private final static QName _CodigoErrorDetalle_QNAME =
        new QName("http://xmlns.oracle.com/SKYConsultas/ConsultaProductoContratado/ConsultaProductoContratado",
                  "Detalle");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.sel.proxyclients.pagwebconsultas.consultaprodcontratado.types
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaProductoContratado }
     *
     */
    public ConsultaProductoContratado createConsultaProductoContratado() {
        return new ConsultaProductoContratado();
    }

    /**
     * Create an instance of {@link ConsultaProductoContratadoResponse }
     *
     */
    public ConsultaProductoContratadoResponse createConsultaProductoContratadoResponse() {
        return new ConsultaProductoContratadoResponse();
    }

    /**
     * Create an instance of {@link CodigoError }
     *
     */
    public CodigoError createCodigoError() {
        return new CodigoError();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://xmlns.oracle.com/SKYConsultas/ConsultaProductoContratado/ConsultaProductoContratado",
                    name = "Codigo", scope = CodigoError.class)
    public JAXBElement<String> createCodigoErrorCodigo(String value) {
        return new JAXBElement<String>(_CodigoErrorCodigo_QNAME, String.class, CodigoError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://xmlns.oracle.com/SKYConsultas/ConsultaProductoContratado/ConsultaProductoContratado",
                    name = "Resumen", scope = CodigoError.class)
    public JAXBElement<String> createCodigoErrorResumen(String value) {
        return new JAXBElement<String>(_CodigoErrorResumen_QNAME, String.class, CodigoError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://xmlns.oracle.com/SKYConsultas/ConsultaProductoContratado/ConsultaProductoContratado",
                    name = "Detalle", scope = CodigoError.class)
    public JAXBElement<String> createCodigoErrorDetalle(String value) {
        return new JAXBElement<String>(_CodigoErrorDetalle_QNAME, String.class, CodigoError.class, value);
    }

}
