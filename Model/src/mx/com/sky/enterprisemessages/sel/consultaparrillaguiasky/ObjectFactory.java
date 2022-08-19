
package mx.com.sky.enterprisemessages.sel.consultaparrillaguiasky;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterprisemessages.sel.consultaparrillaguiasky package.
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

    private final static QName _ConsultaParrillaGuiaSkyRequest_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                  "ConsultaParrillaGuiaSkyRequest");
    private final static QName _ConsultaParrillaGuiaSkyResponse_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                  "ConsultaParrillaGuiaSkyResponse");
    private final static QName _EventoTipo_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                  "Tipo");
    private final static QName _EventoTitulo_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                  "Titulo");
    private final static QName _EventoDuracion_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                  "Duracion");
    private final static QName _EventoFechainicio_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                  "Fechainicio");
    private final static QName _EventoFechaFinal_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                  "FechaFinal");
    private final static QName _EventoSinopsis_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                  "Sinopsis");
    private final static QName _EventoContentId_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                  "ContentId");
    private final static QName _EventoTransportStreamId_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                  "TransportStreamId");
    private final static QName _EventoEventId_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                  "EventId");
    private final static QName _EventoSeriesId_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                  "SeriesId");
    private final static QName _EventoProgramId_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                  "ProgramId");
    private final static QName _EventoContentProviderId_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                  "ContentProviderId");
    private final static QName _EventoNetworkId_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                  "NetworkId");
    private final static QName _CanalIdentificador_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                  "Identificador");
    private final static QName _CanalIdMostrado_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                  "IdMostrado");
    private final static QName _CanalCanalNombre_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                  "CanalNombre");
    private final static QName _CanalNombre_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                  "Nombre");
    private final static QName _CanalDescripcion_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                  "Descripcion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterprisemessages.sel.consultaparrillaguiasky
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaParrillaGuiaSkyRequestEBMType }
     *
     */
    public ConsultaParrillaGuiaSkyRequestEBMType createConsultaParrillaGuiaSkyRequestEBMType() {
        return new ConsultaParrillaGuiaSkyRequestEBMType();
    }

    /**
     * Create an instance of {@link ConsultaParillaGuiaSkyResponseEBMType }
     *
     */
    public ConsultaParillaGuiaSkyResponseEBMType createConsultaParillaGuiaSkyResponseEBMType() {
        return new ConsultaParillaGuiaSkyResponseEBMType();
    }

    /**
     * Create an instance of {@link ConsultaParrillaRequestType }
     *
     */
    public ConsultaParrillaRequestType createConsultaParrillaRequestType() {
        return new ConsultaParrillaRequestType();
    }

    /**
     * Create an instance of {@link ProgramacionesType }
     *
     */
    public ProgramacionesType createProgramacionesType() {
        return new ProgramacionesType();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaParrillaGuiaSkyRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                    name = "ConsultaParrillaGuiaSkyRequest")
    public JAXBElement<ConsultaParrillaGuiaSkyRequestEBMType> createConsultaParrillaGuiaSkyRequest(ConsultaParrillaGuiaSkyRequestEBMType value) {
        return new JAXBElement<ConsultaParrillaGuiaSkyRequestEBMType>(_ConsultaParrillaGuiaSkyRequest_QNAME,
                                                                      ConsultaParrillaGuiaSkyRequestEBMType.class,
                                                                      null,
                                                                      value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaParillaGuiaSkyResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                    name = "ConsultaParrillaGuiaSkyResponse")
    public JAXBElement<ConsultaParillaGuiaSkyResponseEBMType> createConsultaParrillaGuiaSkyResponse(ConsultaParillaGuiaSkyResponseEBMType value) {
        return new JAXBElement<ConsultaParillaGuiaSkyResponseEBMType>(_ConsultaParrillaGuiaSkyResponse_QNAME,
                                                                      ConsultaParillaGuiaSkyResponseEBMType.class,
                                                                      null,
                                                                      value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                    name = "Tipo", scope = Evento.class)
    public JAXBElement<String> createEventoTipo(String value) {
        return new JAXBElement<String>(_EventoTipo_QNAME, String.class,
                                       Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                    name = "Titulo", scope = Evento.class)
    public JAXBElement<String> createEventoTitulo(String value) {
        return new JAXBElement<String>(_EventoTitulo_QNAME, String.class,
                                       Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                    name = "Duracion", scope = Evento.class)
    public JAXBElement<BigDecimal> createEventoDuracion(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EventoDuracion_QNAME,
                                           BigDecimal.class, Evento.class,
                                           value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                    name = "Fechainicio", scope = Evento.class)
    public JAXBElement<XMLGregorianCalendar> createEventoFechainicio(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EventoFechainicio_QNAME,
                                                     XMLGregorianCalendar.class,
                                                     Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                    name = "FechaFinal", scope = Evento.class)
    public JAXBElement<XMLGregorianCalendar> createEventoFechaFinal(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EventoFechaFinal_QNAME,
                                                     XMLGregorianCalendar.class,
                                                     Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                    name = "Sinopsis", scope = Evento.class)
    public JAXBElement<String> createEventoSinopsis(String value) {
        return new JAXBElement<String>(_EventoSinopsis_QNAME, String.class,
                                       Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                    name = "ContentId", scope = Evento.class)
    public JAXBElement<String> createEventoContentId(String value) {
        return new JAXBElement<String>(_EventoContentId_QNAME, String.class,
                                       Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                    name = "TransportStreamId", scope = Evento.class)
    public JAXBElement<String> createEventoTransportStreamId(String value) {
        return new JAXBElement<String>(_EventoTransportStreamId_QNAME,
                                       String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                    name = "EventId", scope = Evento.class)
    public JAXBElement<String> createEventoEventId(String value) {
        return new JAXBElement<String>(_EventoEventId_QNAME, String.class,
                                       Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                    name = "SeriesId", scope = Evento.class)
    public JAXBElement<String> createEventoSeriesId(String value) {
        return new JAXBElement<String>(_EventoSeriesId_QNAME, String.class,
                                       Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                    name = "ProgramId", scope = Evento.class)
    public JAXBElement<String> createEventoProgramId(String value) {
        return new JAXBElement<String>(_EventoProgramId_QNAME, String.class,
                                       Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                    name = "ContentProviderId", scope = Evento.class)
    public JAXBElement<String> createEventoContentProviderId(String value) {
        return new JAXBElement<String>(_EventoContentProviderId_QNAME,
                                       String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                    name = "NetworkId", scope = Evento.class)
    public JAXBElement<String> createEventoNetworkId(String value) {
        return new JAXBElement<String>(_EventoNetworkId_QNAME, String.class,
                                       Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                    name = "Identificador", scope = Canal.class)
    public JAXBElement<String> createCanalIdentificador(String value) {
        return new JAXBElement<String>(_CanalIdentificador_QNAME, String.class,
                                       Canal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                    name = "IdMostrado", scope = Canal.class)
    public JAXBElement<String> createCanalIdMostrado(String value) {
        return new JAXBElement<String>(_CanalIdMostrado_QNAME, String.class,
                                       Canal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                    name = "CanalNombre", scope = Canal.class)
    public JAXBElement<String> createCanalCanalNombre(String value) {
        return new JAXBElement<String>(_CanalCanalNombre_QNAME, String.class,
                                       Canal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                    name = "Nombre", scope = Canal.class)
    public JAXBElement<String> createCanalNombre(String value) {
        return new JAXBElement<String>(_CanalNombre_QNAME, String.class,
                                       Canal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                    name = "Descripcion", scope = Canal.class)
    public JAXBElement<String> createCanalDescripcion(String value) {
        return new JAXBElement<String>(_CanalDescripcion_QNAME, String.class,
                                       Canal.class, value);
    }

}
