
package mx.com.sky.sel.proxyclients.pagwebss.consultatablabatch.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.sel.proxyclients.pagwebss.consultatablabatch.types package.
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

    private final static QName _PwBatchSsCollection_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", "PwBatchSsCollection");
    private final static QName _PwBatchSs_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", "PwBatchSs");
    private final static QName _ConsultaBatchSSSelectCorporativoInputParameters_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS",
                  "ConsultaBatchSSSelect_CorporativoInputParameters");
    private final static QName _ConsultaTablaBatchSSProcessResponse_QNAME =
        new QName("http://xmlns.oracle.com/ConsultaTablaBatchSS", "ConsultaTablaBatchSSProcessResponse");
    private final static QName _RowFechaCreacion_QNAME =
        new QName("http://xmlns.oracle.com/ConsultaTablaBatchSS", "fechaCreacion");
    private final static QName _PwBatchSsStatus_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", "status");
    private final static QName _PwBatchSsFechaCreacion_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", "fechaCreacion");
    private final static QName _PwBatchSsNoSolicitud_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", "noSolicitud");
    private final static QName _PwBatchSsDescripcion_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", "descripcion");
    private final static QName _PwBatchSsTipoEvento_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", "tipoEvento");
    private final static QName _PwBatchSsCostoEvento_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", "costoEvento");
    private final static QName _PwBatchSsCanalDisplay_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", "canalDisplay");
    private final static QName _PwBatchSsCanal_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", "canal");
    private final static QName _PwBatchSsIdEvento_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", "idEvento");
    private final static QName _PwBatchSsFechaExpiracion_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", "fechaExpiracion");
    private final static QName _PwBatchSsFechaInicio_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", "fechaInicio");
    private final static QName _PwBatchSsDuracion_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", "duracion");
    private final static QName _PwBatchSsNombreEvento_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", "nombreEvento");
    private final static QName _PwBatchSsNombreCorporativo_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", "nombreCorporativo");
    private final static QName _PwBatchSsArea_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", "area");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.sel.proxyclients.pagwebss.consultatablabatch.types
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PwBatchSsCollection }
     *
     */
    public PwBatchSsCollection createPwBatchSsCollection() {
        return new PwBatchSsCollection();
    }

    /**
     * Create an instance of {@link PwBatchSs }
     *
     */
    public PwBatchSs createPwBatchSs() {
        return new PwBatchSs();
    }

    /**
     * Create an instance of {@link ConsultaBatchSSSelectCorporativo }
     *
     */
    public ConsultaBatchSSSelectCorporativo createConsultaBatchSSSelectCorporativo() {
        return new ConsultaBatchSSSelectCorporativo();
    }

    /**
     * Create an instance of {@link ConsultaTablaBatchSSProcessRequest }
     *
     */
    public ConsultaTablaBatchSSProcessRequest createConsultaTablaBatchSSProcessRequest() {
        return new ConsultaTablaBatchSSProcessRequest();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PwBatchSsCollection }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS",
                    name = "PwBatchSsCollection")
    public JAXBElement<PwBatchSsCollection> createPwBatchSsCollection(PwBatchSsCollection value) {
        return new JAXBElement<PwBatchSsCollection>(_PwBatchSsCollection_QNAME, PwBatchSsCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PwBatchSs }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", name = "PwBatchSs")
    public JAXBElement<PwBatchSs> createPwBatchSs(PwBatchSs value) {
        return new JAXBElement<PwBatchSs>(_PwBatchSs_QNAME, PwBatchSs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaBatchSSSelectCorporativo }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS",
                    name = "ConsultaBatchSSSelect_CorporativoInputParameters")
    public JAXBElement<ConsultaBatchSSSelectCorporativo> createConsultaBatchSSSelectCorporativoInputParameters(ConsultaBatchSSSelectCorporativo value) {
        return new JAXBElement<ConsultaBatchSSSelectCorporativo>(_ConsultaBatchSSSelectCorporativoInputParameters_QNAME,
                                                                 ConsultaBatchSSSelectCorporativo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rows }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/ConsultaTablaBatchSS",
                    name = "ConsultaTablaBatchSSProcessResponse")
    public JAXBElement<Rows> createConsultaTablaBatchSSProcessResponse(Rows value) {
        return new JAXBElement<Rows>(_ConsultaTablaBatchSSProcessResponse_QNAME, Rows.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/ConsultaTablaBatchSS", name = "fechaCreacion",
                    scope = Row.class)
    public JAXBElement<XMLGregorianCalendar> createRowFechaCreacion(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RowFechaCreacion_QNAME, XMLGregorianCalendar.class, Row.class,
                                                     value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", name = "status",
                    scope = PwBatchSs.class)
    public JAXBElement<String> createPwBatchSsStatus(String value) {
        return new JAXBElement<String>(_PwBatchSsStatus_QNAME, String.class, PwBatchSs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", name = "fechaCreacion",
                    scope = PwBatchSs.class)
    public JAXBElement<XMLGregorianCalendar> createPwBatchSsFechaCreacion(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PwBatchSsFechaCreacion_QNAME, XMLGregorianCalendar.class,
                                                     PwBatchSs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", name = "noSolicitud",
                    scope = PwBatchSs.class)
    public JAXBElement<String> createPwBatchSsNoSolicitud(String value) {
        return new JAXBElement<String>(_PwBatchSsNoSolicitud_QNAME, String.class, PwBatchSs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", name = "descripcion",
                    scope = PwBatchSs.class)
    public JAXBElement<String> createPwBatchSsDescripcion(String value) {
        return new JAXBElement<String>(_PwBatchSsDescripcion_QNAME, String.class, PwBatchSs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", name = "tipoEvento",
                    scope = PwBatchSs.class)
    public JAXBElement<String> createPwBatchSsTipoEvento(String value) {
        return new JAXBElement<String>(_PwBatchSsTipoEvento_QNAME, String.class, PwBatchSs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", name = "costoEvento",
                    scope = PwBatchSs.class)
    public JAXBElement<String> createPwBatchSsCostoEvento(String value) {
        return new JAXBElement<String>(_PwBatchSsCostoEvento_QNAME, String.class, PwBatchSs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", name = "canalDisplay",
                    scope = PwBatchSs.class)
    public JAXBElement<String> createPwBatchSsCanalDisplay(String value) {
        return new JAXBElement<String>(_PwBatchSsCanalDisplay_QNAME, String.class, PwBatchSs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", name = "canal",
                    scope = PwBatchSs.class)
    public JAXBElement<String> createPwBatchSsCanal(String value) {
        return new JAXBElement<String>(_PwBatchSsCanal_QNAME, String.class, PwBatchSs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", name = "idEvento",
                    scope = PwBatchSs.class)
    public JAXBElement<String> createPwBatchSsIdEvento(String value) {
        return new JAXBElement<String>(_PwBatchSsIdEvento_QNAME, String.class, PwBatchSs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS",
                    name = "fechaExpiracion", scope = PwBatchSs.class)
    public JAXBElement<String> createPwBatchSsFechaExpiracion(String value) {
        return new JAXBElement<String>(_PwBatchSsFechaExpiracion_QNAME, String.class, PwBatchSs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", name = "fechaInicio",
                    scope = PwBatchSs.class)
    public JAXBElement<String> createPwBatchSsFechaInicio(String value) {
        return new JAXBElement<String>(_PwBatchSsFechaInicio_QNAME, String.class, PwBatchSs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", name = "duracion",
                    scope = PwBatchSs.class)
    public JAXBElement<String> createPwBatchSsDuracion(String value) {
        return new JAXBElement<String>(_PwBatchSsDuracion_QNAME, String.class, PwBatchSs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", name = "nombreEvento",
                    scope = PwBatchSs.class)
    public JAXBElement<String> createPwBatchSsNombreEvento(String value) {
        return new JAXBElement<String>(_PwBatchSsNombreEvento_QNAME, String.class, PwBatchSs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS",
                    name = "nombreCorporativo", scope = PwBatchSs.class)
    public JAXBElement<String> createPwBatchSsNombreCorporativo(String value) {
        return new JAXBElement<String>(_PwBatchSsNombreCorporativo_QNAME, String.class, PwBatchSs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS", name = "area",
                    scope = PwBatchSs.class)
    public JAXBElement<String> createPwBatchSsArea(String value) {
        return new JAXBElement<String>(_PwBatchSsArea_QNAME, String.class, PwBatchSs.class, value);
    }

}
