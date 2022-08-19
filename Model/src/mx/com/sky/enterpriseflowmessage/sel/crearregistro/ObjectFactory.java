
package mx.com.sky.enterpriseflowmessage.sel.crearregistro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseflowmessage.sel.crearregistro package.
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

    private final static QName _CrearRegistroSelEBFRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseFlowMessage/Sel/CrearRegistro", "CrearRegistroSelEBFRequestEBM");
    private final static QName _CrearRegistroSelEBFResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseFlowMessage/Sel/CrearRegistro", "CrearRegistroSelEBFResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseflowmessage.sel.crearregistro
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearRegistroSelRequestType }
     *
     */
    public CrearRegistroSelRequestType createCrearRegistroSelRequestType() {
        return new CrearRegistroSelRequestType();
    }

    /**
     * Create an instance of {@link CrearRegistroSelResponseType }
     *
     */
    public CrearRegistroSelResponseType createCrearRegistroSelResponseType() {
        return new CrearRegistroSelResponseType();
    }

    /**
     * Create an instance of {@link CrearRegistroSelInputMessageType }
     *
     */
    public CrearRegistroSelInputMessageType createCrearRegistroSelInputMessageType() {
        return new CrearRegistroSelInputMessageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearRegistroSelRequestType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseFlowMessage/Sel/CrearRegistro",
                    name = "CrearRegistroSelEBFRequestEBM")
    public JAXBElement<CrearRegistroSelRequestType> createCrearRegistroSelEBFRequestEBM(CrearRegistroSelRequestType value) {
        return new JAXBElement<CrearRegistroSelRequestType>(_CrearRegistroSelEBFRequestEBM_QNAME,
                                                            CrearRegistroSelRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearRegistroSelResponseType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseFlowMessage/Sel/CrearRegistro",
                    name = "CrearRegistroSelEBFResponseEBM")
    public JAXBElement<CrearRegistroSelResponseType> createCrearRegistroSelEBFResponseEBM(CrearRegistroSelResponseType value) {
        return new JAXBElement<CrearRegistroSelResponseType>(_CrearRegistroSelEBFResponseEBM_QNAME,
                                                             CrearRegistroSelResponseType.class, null, value);
    }

}
