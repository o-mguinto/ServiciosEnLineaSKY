
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultatiirdprincipal.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.sel.proxyclients.pagwebconsultas.consultatiirdprincipal.types package.
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

    private final static QName _CTIn_QNAME = new QName("http://cambiotitular.serviciosenlinea.sky.com.mx", "CT_In");
    private final static QName _CTOut_QNAME = new QName("http://cambiotitular.serviciosenlinea.sky.com.mx", "CT_Out");
    private final static QName _CTReceptorIn_QNAME =
        new QName("http://cambiotitular.serviciosenlinea.sky.com.mx", "CTReceptorIn");
    private final static QName _CTReceptorOut_QNAME =
        new QName("http://cambiotitular.serviciosenlinea.sky.com.mx", "CTReceptorOut");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.sel.proxyclients.pagwebconsultas.consultatiirdprincipal.types
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CTINType }
     *
     */
    public CTINType createCTINType() {
        return new CTINType();
    }

    /**
     * Create an instance of {@link CTOutType }
     *
     */
    public CTOutType createCTOutType() {
        return new CTOutType();
    }

    /**
     * Create an instance of {@link CTReceptorInType }
     *
     */
    public CTReceptorInType createCTReceptorInType() {
        return new CTReceptorInType();
    }

    /**
     * Create an instance of {@link CTReceptorOutType }
     *
     */
    public CTReceptorOutType createCTReceptorOutType() {
        return new CTReceptorOutType();
    }

    /**
     * Create an instance of {@link CTSSOut }
     *
     */
    public CTSSOut createCTSSOut() {
        return new CTSSOut();
    }

    /**
     * Create an instance of {@link CTSSOutType }
     *
     */
    public CTSSOutType createCTSSOutType() {
        return new CTSSOutType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CTINType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://cambiotitular.serviciosenlinea.sky.com.mx", name = "CT_In")
    public JAXBElement<CTINType> createCTIn(CTINType value) {
        return new JAXBElement<CTINType>(_CTIn_QNAME, CTINType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CTOutType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://cambiotitular.serviciosenlinea.sky.com.mx", name = "CT_Out")
    public JAXBElement<CTOutType> createCTOut(CTOutType value) {
        return new JAXBElement<CTOutType>(_CTOut_QNAME, CTOutType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CTReceptorInType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://cambiotitular.serviciosenlinea.sky.com.mx", name = "CTReceptorIn")
    public JAXBElement<CTReceptorInType> createCTReceptorIn(CTReceptorInType value) {
        return new JAXBElement<CTReceptorInType>(_CTReceptorIn_QNAME, CTReceptorInType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CTReceptorOutType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://cambiotitular.serviciosenlinea.sky.com.mx", name = "CTReceptorOut")
    public JAXBElement<CTReceptorOutType> createCTReceptorOut(CTReceptorOutType value) {
        return new JAXBElement<CTReceptorOutType>(_CTReceptorOut_QNAME, CTReceptorOutType.class, null, value);
    }

}
