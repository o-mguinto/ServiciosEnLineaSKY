
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultaapg.types;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.sel.proxyclients.pagwebconsultas.consultaapg.types package.
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

    private final static QName _OUTPUT_QNAME = new QName("http://xmlns.oracle.com/consultaProgramacion", "OUTPUT");
    private final static QName _EventoTipo_QNAME = new QName("http://xmlns.oracle.com/consultaProgramacion", "Tipo");
    private final static QName _EventoTitulo_QNAME =
        new QName("http://xmlns.oracle.com/consultaProgramacion", "Titulo");
    private final static QName _EventoDuracion_QNAME =
        new QName("http://xmlns.oracle.com/consultaProgramacion", "Duracion");
    private final static QName _EventoFechainicio_QNAME =
        new QName("http://xmlns.oracle.com/consultaProgramacion", "Fechainicio");
    private final static QName _EventoFechaFinal_QNAME =
        new QName("http://xmlns.oracle.com/consultaProgramacion", "FechaFinal");
    private final static QName _EventoSinopsis_QNAME =
        new QName("http://xmlns.oracle.com/consultaProgramacion", "Sinopsis");
    private final static QName _EventoContentId_QNAME =
        new QName("http://xmlns.oracle.com/consultaProgramacion", "ContentId");
    private final static QName _CanalIdentificador_QNAME =
        new QName("http://xmlns.oracle.com/consultaProgramacion", "Identificador");
    private final static QName _CanalIdMostrado_QNAME =
        new QName("http://xmlns.oracle.com/consultaProgramacion", "IdMostrado");
    private final static QName _CanalCanalNombre_QNAME =
        new QName("http://xmlns.oracle.com/consultaProgramacion", "CanalNombre");
    private final static QName _CanalNombre_QNAME = new QName("http://xmlns.oracle.com/consultaProgramacion", "Nombre");
    private final static QName _CanalDescripcion_QNAME =
        new QName("http://xmlns.oracle.com/consultaProgramacion", "Descripcion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.sel.proxyclients.pagwebconsultas.consultaapg.types
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link INPUT }
     *
     */
    public INPUT createINPUT() {
        return new INPUT();
    }

    /**
     * Create an instance of {@link OUTPUT }
     *
     */
    public OUTPUT createOUTPUT() {
        return new OUTPUT();
    }

    /**
     * Create an instance of {@link Programaciones }
     *
     */
    public Programaciones createProgramaciones() {
        return new Programaciones();
    }

    /**
     * Create an instance of {@link Programacion }
     *
     */
    public Programacion createProgramacion() {
        return new Programacion();
    }

    /**
     * Create an instance of {@link Eventos }
     *
     */
    public Eventos createEventos() {
        return new Eventos();
    }

    /**
     * Create an instance of {@link Canal }
     *
     */
    public Canal createCanal() {
        return new Canal();
    }

    /**
     * Create an instance of {@link Evento }
     *
     */
    public Evento createEvento() {
        return new Evento();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OUTPUT }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/consultaProgramacion", name = "OUTPUT")
    public JAXBElement<OUTPUT> createOUTPUT(OUTPUT value) {
        return new JAXBElement<OUTPUT>(_OUTPUT_QNAME, OUTPUT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/consultaProgramacion", name = "Tipo", scope = Evento.class)
    public JAXBElement<String> createEventoTipo(String value) {
        return new JAXBElement<String>(_EventoTipo_QNAME, String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/consultaProgramacion", name = "Titulo", scope = Evento.class)
    public JAXBElement<String> createEventoTitulo(String value) {
        return new JAXBElement<String>(_EventoTitulo_QNAME, String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/consultaProgramacion", name = "Duracion", scope = Evento.class)
    public JAXBElement<BigDecimal> createEventoDuracion(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EventoDuracion_QNAME, BigDecimal.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/consultaProgramacion", name = "Fechainicio",
                    scope = Evento.class)
    public JAXBElement<XMLGregorianCalendar> createEventoFechainicio(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EventoFechainicio_QNAME, XMLGregorianCalendar.class, Evento.class,
                                                     value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/consultaProgramacion", name = "FechaFinal",
                    scope = Evento.class)
    public JAXBElement<XMLGregorianCalendar> createEventoFechaFinal(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EventoFechaFinal_QNAME, XMLGregorianCalendar.class, Evento.class,
                                                     value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/consultaProgramacion", name = "Sinopsis", scope = Evento.class)
    public JAXBElement<String> createEventoSinopsis(String value) {
        return new JAXBElement<String>(_EventoSinopsis_QNAME, String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/consultaProgramacion", name = "ContentId",
                    scope = Evento.class)
    public JAXBElement<String> createEventoContentId(String value) {
        return new JAXBElement<String>(_EventoContentId_QNAME, String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/consultaProgramacion", name = "Identificador",
                    scope = Canal.class)
    public JAXBElement<String> createCanalIdentificador(String value) {
        return new JAXBElement<String>(_CanalIdentificador_QNAME, String.class, Canal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/consultaProgramacion", name = "IdMostrado",
                    scope = Canal.class)
    public JAXBElement<String> createCanalIdMostrado(String value) {
        return new JAXBElement<String>(_CanalIdMostrado_QNAME, String.class, Canal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/consultaProgramacion", name = "CanalNombre",
                    scope = Canal.class)
    public JAXBElement<String> createCanalCanalNombre(String value) {
        return new JAXBElement<String>(_CanalCanalNombre_QNAME, String.class, Canal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/consultaProgramacion", name = "Nombre", scope = Canal.class)
    public JAXBElement<String> createCanalNombre(String value) {
        return new JAXBElement<String>(_CanalNombre_QNAME, String.class, Canal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/consultaProgramacion", name = "Descripcion",
                    scope = Canal.class)
    public JAXBElement<String> createCanalDescripcion(String value) {
        return new JAXBElement<String>(_CanalDescripcion_QNAME, String.class, Canal.class, value);
    }

}
