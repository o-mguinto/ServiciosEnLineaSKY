
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultappepermisos.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.sel.proxyclients.pagwebconsultas.consultappepermisos.types package.
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

    private final static QName _ConsultaPermisosIn_QNAME =
        new QName("http://www.sky.com.mx/consulta/permisos/ppe", "consultaPermisosIn");
    private final static QName _ConsultaPermisosOut_QNAME =
        new QName("http://www.sky.com.mx/consulta/permisos/ppe", "consultaPermisosOut");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.sel.proxyclients.pagwebconsultas.consultappepermisos.types
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaPermisosInType }
     *
     */
    public ConsultaPermisosInType createConsultaPermisosInType() {
        return new ConsultaPermisosInType();
    }

    /**
     * Create an instance of {@link ConsultaPermisosOutType }
     *
     */
    public ConsultaPermisosOutType createConsultaPermisosOutType() {
        return new ConsultaPermisosOutType();
    }

    /**
     * Create an instance of {@link ConsultaPPEPermisosType }
     *
     */
    public ConsultaPPEPermisosType createConsultaPPEPermisosType() {
        return new ConsultaPPEPermisosType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPermisosInType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/consulta/permisos/ppe", name = "consultaPermisosIn")
    public JAXBElement<ConsultaPermisosInType> createConsultaPermisosIn(ConsultaPermisosInType value) {
        return new JAXBElement<ConsultaPermisosInType>(_ConsultaPermisosIn_QNAME, ConsultaPermisosInType.class, null,
                                                       value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPermisosOutType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/consulta/permisos/ppe", name = "consultaPermisosOut")
    public JAXBElement<ConsultaPermisosOutType> createConsultaPermisosOut(ConsultaPermisosOutType value) {
        return new JAXBElement<ConsultaPermisosOutType>(_ConsultaPermisosOut_QNAME, ConsultaPermisosOutType.class, null,
                                                        value);
    }

}
