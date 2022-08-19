
package mx.com.sky.enterprisemessages.sel.consultarserviciosadicionales;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterprisemessages.sel.consultarserviciosadicionales package.
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

    private final static QName _ConsultarServiciosAdicionalesRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultarServiciosAdicionales",
                  "ConsultarServiciosAdicionalesRequestEBM");
    private final static QName _ConsultarServiciosAdicionalesResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultarServiciosAdicionales",
                  "ConsultarServiciosAdicionalesResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterprisemessages.sel.consultarserviciosadicionales
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarServiciosAdicionalesRequestEBMType }
     *
     */
    public ConsultarServiciosAdicionalesRequestEBMType createConsultarServiciosAdicionalesRequestEBMType() {
        return new ConsultarServiciosAdicionalesRequestEBMType();
    }

    /**
     * Create an instance of {@link ConsultarServiciosAdicionalesResponseEBMType }
     *
     */
    public ConsultarServiciosAdicionalesResponseEBMType createConsultarServiciosAdicionalesResponseEBMType() {
        return new ConsultarServiciosAdicionalesResponseEBMType();
    }

    /**
     * Create an instance of {@link ConsultarServiciosAdicionalesRequestType }
     *
     */
    public ConsultarServiciosAdicionalesRequestType createConsultarServiciosAdicionalesRequestType() {
        return new ConsultarServiciosAdicionalesRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarServiciosAdicionalesRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultarServiciosAdicionales",
                    name = "ConsultarServiciosAdicionalesRequestEBM")
    public JAXBElement<ConsultarServiciosAdicionalesRequestEBMType> createConsultarServiciosAdicionalesRequestEBM(ConsultarServiciosAdicionalesRequestEBMType value) {
        return new JAXBElement<ConsultarServiciosAdicionalesRequestEBMType>(_ConsultarServiciosAdicionalesRequestEBM_QNAME,
                                                                            ConsultarServiciosAdicionalesRequestEBMType.class,
                                                                            null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarServiciosAdicionalesResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultarServiciosAdicionales",
                    name = "ConsultarServiciosAdicionalesResponseEBM")
    public JAXBElement<ConsultarServiciosAdicionalesResponseEBMType> createConsultarServiciosAdicionalesResponseEBM(ConsultarServiciosAdicionalesResponseEBMType value) {
        return new JAXBElement<ConsultarServiciosAdicionalesResponseEBMType>(_ConsultarServiciosAdicionalesResponseEBM_QNAME,
                                                                             ConsultarServiciosAdicionalesResponseEBMType.class,
                                                                             null, value);
    }

}
