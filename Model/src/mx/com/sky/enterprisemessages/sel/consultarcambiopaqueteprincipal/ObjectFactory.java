
package mx.com.sky.enterprisemessages.sel.consultarcambiopaqueteprincipal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterprisemessages.sel.consultarcambiopaqueteprincipal package.
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

    private final static QName _ConsultarCambioPaquetePrincipalRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultarCambioPaquetePrincipal",
                  "ConsultarCambioPaquetePrincipalRequestEBM");
    private final static QName _ConsultarCambioPaquetePrincipalResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultarCambioPaquetePrincipal",
                  "ConsultarCambioPaquetePrincipalResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterprisemessages.sel.consultarcambiopaqueteprincipal
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarCambioPaquetePrincipalRequestEBMType }
     *
     */
    public ConsultarCambioPaquetePrincipalRequestEBMType createConsultarCambioPaquetePrincipalRequestEBMType() {
        return new ConsultarCambioPaquetePrincipalRequestEBMType();
    }

    /**
     * Create an instance of {@link ConsultarCambioPaquetePrincipalResponseEBMType }
     *
     */
    public ConsultarCambioPaquetePrincipalResponseEBMType createConsultarCambioPaquetePrincipalResponseEBMType() {
        return new ConsultarCambioPaquetePrincipalResponseEBMType();
    }

    /**
     * Create an instance of {@link ConsultarCambioPaquetePrincipalRequestType }
     *
     */
    public ConsultarCambioPaquetePrincipalRequestType createConsultarCambioPaquetePrincipalRequestType() {
        return new ConsultarCambioPaquetePrincipalRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCambioPaquetePrincipalRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultarCambioPaquetePrincipal",
                    name = "ConsultarCambioPaquetePrincipalRequestEBM")
    public JAXBElement<ConsultarCambioPaquetePrincipalRequestEBMType> createConsultarCambioPaquetePrincipalRequestEBM(ConsultarCambioPaquetePrincipalRequestEBMType value) {
        return new JAXBElement<ConsultarCambioPaquetePrincipalRequestEBMType>(_ConsultarCambioPaquetePrincipalRequestEBM_QNAME,
                                                                              ConsultarCambioPaquetePrincipalRequestEBMType.class,
                                                                              null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCambioPaquetePrincipalResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultarCambioPaquetePrincipal",
                    name = "ConsultarCambioPaquetePrincipalResponseEBM")
    public JAXBElement<ConsultarCambioPaquetePrincipalResponseEBMType> createConsultarCambioPaquetePrincipalResponseEBM(ConsultarCambioPaquetePrincipalResponseEBMType value) {
        return new JAXBElement<ConsultarCambioPaquetePrincipalResponseEBMType>(_ConsultarCambioPaquetePrincipalResponseEBM_QNAME,
                                                                               ConsultarCambioPaquetePrincipalResponseEBMType.class,
                                                                               null, value);
    }

}
