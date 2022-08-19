
package mx.com.sky.enterpriseobjects.sicof.consultarfactura;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseobjects.sicof.consultarfactura package.
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

    private final static QName _ConsultarFacturaEBO_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura", "ConsultarFacturaEBO");
    private final static QName _ConsultarFacturaEBOTypeUuid_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura", "uuid");
    private final static QName _ConsultarFacturaEBOTypeCuentaSKY_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura", "CuentaSKY");
    private final static QName _ConsultarFacturaEBOTypeTipoArchivo_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura", "TipoArchivo");
    private final static QName _ConsultarFacturaEBOTypeFactura_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura", "factura");
    private final static QName _ConsultarFacturaEBOTypeFechacorte_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura", "fechacorte");
    private final static QName _ConsultarFacturaEBOTypeFechaTimbrado_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura", "FechaTimbrado");
    private final static QName _ConsultarFacturaEBOTypeDescripcion_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura", "Descripcion");
    private final static QName _ConsultarFacturaEBOTypeIdDocEdicom_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura", "id_doc_edicom");
    private final static QName _ConsultarFacturaEBOTypeSerie_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura", "serie");
    private final static QName _ConsultarFacturaEBOTypePac_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura", "Pac");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseobjects.sicof.consultarfactura
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarFacturaEBOType }
     *
     */
    public ConsultarFacturaEBOType createConsultarFacturaEBOType() {
        return new ConsultarFacturaEBOType();
    }

    /**
     * Create an instance of {@link ConsultarFacturaListType }
     *
     */
    public ConsultarFacturaListType createConsultarFacturaListType() {
        return new ConsultarFacturaListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarFacturaEBOType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura",
                    name = "ConsultarFacturaEBO")
    public JAXBElement<ConsultarFacturaEBOType> createConsultarFacturaEBO(ConsultarFacturaEBOType value) {
        return new JAXBElement<ConsultarFacturaEBOType>(_ConsultarFacturaEBO_QNAME, ConsultarFacturaEBOType.class, null,
                                                        value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura", name = "uuid",
                    scope = ConsultarFacturaEBOType.class)
    public JAXBElement<String> createConsultarFacturaEBOTypeUuid(String value) {
        return new JAXBElement<String>(_ConsultarFacturaEBOTypeUuid_QNAME, String.class, ConsultarFacturaEBOType.class,
                                       value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura", name = "CuentaSKY",
                    scope = ConsultarFacturaEBOType.class)
    public JAXBElement<String> createConsultarFacturaEBOTypeCuentaSKY(String value) {
        return new JAXBElement<String>(_ConsultarFacturaEBOTypeCuentaSKY_QNAME, String.class,
                                       ConsultarFacturaEBOType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura", name = "TipoArchivo",
                    scope = ConsultarFacturaEBOType.class)
    public JAXBElement<String> createConsultarFacturaEBOTypeTipoArchivo(String value) {
        return new JAXBElement<String>(_ConsultarFacturaEBOTypeTipoArchivo_QNAME, String.class,
                                       ConsultarFacturaEBOType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura", name = "factura",
                    scope = ConsultarFacturaEBOType.class)
    public JAXBElement<String> createConsultarFacturaEBOTypeFactura(String value) {
        return new JAXBElement<String>(_ConsultarFacturaEBOTypeFactura_QNAME, String.class,
                                       ConsultarFacturaEBOType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura", name = "fechacorte",
                    scope = ConsultarFacturaEBOType.class)
    public JAXBElement<XMLGregorianCalendar> createConsultarFacturaEBOTypeFechacorte(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ConsultarFacturaEBOTypeFechacorte_QNAME,
                                                     XMLGregorianCalendar.class, ConsultarFacturaEBOType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura",
                    name = "FechaTimbrado", scope = ConsultarFacturaEBOType.class)
    public JAXBElement<XMLGregorianCalendar> createConsultarFacturaEBOTypeFechaTimbrado(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ConsultarFacturaEBOTypeFechaTimbrado_QNAME,
                                                     XMLGregorianCalendar.class, ConsultarFacturaEBOType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura", name = "Descripcion",
                    scope = ConsultarFacturaEBOType.class)
    public JAXBElement<String> createConsultarFacturaEBOTypeDescripcion(String value) {
        return new JAXBElement<String>(_ConsultarFacturaEBOTypeDescripcion_QNAME, String.class,
                                       ConsultarFacturaEBOType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura",
                    name = "id_doc_edicom", scope = ConsultarFacturaEBOType.class)
    public JAXBElement<Integer> createConsultarFacturaEBOTypeIdDocEdicom(Integer value) {
        return new JAXBElement<Integer>(_ConsultarFacturaEBOTypeIdDocEdicom_QNAME, Integer.class,
                                        ConsultarFacturaEBOType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura", name = "serie",
                    scope = ConsultarFacturaEBOType.class)
    public JAXBElement<String> createConsultarFacturaEBOTypeSerie(String value) {
        return new JAXBElement<String>(_ConsultarFacturaEBOTypeSerie_QNAME, String.class, ConsultarFacturaEBOType.class,
                                       value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura", name = "Pac",
                    scope = ConsultarFacturaEBOType.class)
    public JAXBElement<String> createConsultarFacturaEBOTypePac(String value) {
        return new JAXBElement<String>(_ConsultarFacturaEBOTypePac_QNAME, String.class, ConsultarFacturaEBOType.class,
                                       value);
    }

}
