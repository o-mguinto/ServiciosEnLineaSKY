
package mx.com.sky.sel.proxyclients.pagwebss.consultatablabatchaltafact.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.sel.proxyclients.pagwebss.consultatablabatchaltafact.types package.
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

    private final static QName _RowFechaCreacion_QNAME =
        new QName("http://xmlns.oracle.com/ConsultaTablaBatchSSAltaFacturacion", "fechaCreacion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.sel.proxyclients.pagwebss.consultatablabatchaltafact.types
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaTablaBatchSSAltaFacturacionProcessRequest }
     *
     */
    public ConsultaTablaBatchSSAltaFacturacionProcessRequest createConsultaTablaBatchSSAltaFacturacionProcessRequest() {
        return new ConsultaTablaBatchSSAltaFacturacionProcessRequest();
    }

    /**
     * Create an instance of {@link ConsultaTablaBatchSSAltaFacturacionProcessResponse }
     *
     */
    public ConsultaTablaBatchSSAltaFacturacionProcessResponse createConsultaTablaBatchSSAltaFacturacionProcessResponse() {
        return new ConsultaTablaBatchSSAltaFacturacionProcessResponse();
    }

    /**
     * Create an instance of {@link Rows }
     *
     */
    public Rows createRows() {
        return new Rows();
    }

    /**
     * Create an instance of {@link Row }
     *
     */
    public Row createRow() {
        return new Row();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/ConsultaTablaBatchSSAltaFacturacion", name = "fechaCreacion",
                    scope = Row.class)
    public JAXBElement<XMLGregorianCalendar> createRowFechaCreacion(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RowFechaCreacion_QNAME, XMLGregorianCalendar.class, Row.class,
                                                     value);
    }

}
