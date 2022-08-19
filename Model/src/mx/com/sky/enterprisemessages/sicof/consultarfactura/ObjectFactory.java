
package mx.com.sky.enterprisemessages.sicof.consultarfactura;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterprisemessages.sicof.consultarfactura package.
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

    private final static QName _ConsultarFacturaRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sicof/ConsultarFactura", "ConsultarFacturaRequestEBM");
    private final static QName _ConsultarFacturaResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sicof/ConsultarFactura", "ConsultarFacturaResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterprisemessages.sicof.consultarfactura
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarFacturaRequestEBMType }
     *
     */
    public ConsultarFacturaRequestEBMType createConsultarFacturaRequestEBMType() {
        return new ConsultarFacturaRequestEBMType();
    }

    /**
     * Create an instance of {@link ConsultarFacturaResponseEBMType }
     *
     */
    public ConsultarFacturaResponseEBMType createConsultarFacturaResponseEBMType() {
        return new ConsultarFacturaResponseEBMType();
    }

    /**
     * Create an instance of {@link ConsultarFacturaRequestType }
     *
     */
    public ConsultarFacturaRequestType createConsultarFacturaRequestType() {
        return new ConsultarFacturaRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarFacturaRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseMessages/Sicof/ConsultarFactura",
                    name = "ConsultarFacturaRequestEBM")
    public JAXBElement<ConsultarFacturaRequestEBMType> createConsultarFacturaRequestEBM(ConsultarFacturaRequestEBMType value) {
        return new JAXBElement<ConsultarFacturaRequestEBMType>(_ConsultarFacturaRequestEBM_QNAME,
                                                               ConsultarFacturaRequestEBMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarFacturaResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseMessages/Sicof/ConsultarFactura",
                    name = "ConsultarFacturaResponseEBM")
    public JAXBElement<ConsultarFacturaResponseEBMType> createConsultarFacturaResponseEBM(ConsultarFacturaResponseEBMType value) {
        return new JAXBElement<ConsultarFacturaResponseEBMType>(_ConsultarFacturaResponseEBM_QNAME,
                                                                ConsultarFacturaResponseEBMType.class, null, value);
    }

}
