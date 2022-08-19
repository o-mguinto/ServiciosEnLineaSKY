
package mx.com.sky.enterpriseobjects.sel.consultarcambiopaqueteprincipal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseobjects.sel.consultarcambiopaqueteprincipal package.
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

    private final static QName _ConsultarCambioPaquetePrincipalEBO_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sel/ConsultarCambioPaquetePrincipal",
                  "ConsultarCambioPaquetePrincipalEBO");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseobjects.sel.consultarcambiopaqueteprincipal
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListProductFacturacionType }
     *
     */
    public ListProductFacturacionType createListProductFacturacionType() {
        return new ListProductFacturacionType();
    }

    /**
     * Create an instance of {@link ConsultarCambioPaquetePrincipalEBOType }
     *
     */
    public ConsultarCambioPaquetePrincipalEBOType createConsultarCambioPaquetePrincipalEBOType() {
        return new ConsultarCambioPaquetePrincipalEBOType();
    }

    /**
     * Create an instance of {@link ConsultarCambioPaquetePrincipalListType }
     *
     */
    public ConsultarCambioPaquetePrincipalListType createConsultarCambioPaquetePrincipalListType() {
        return new ConsultarCambioPaquetePrincipalListType();
    }

    /**
     * Create an instance of {@link ListProductFacturacionType.ProductFacturacion }
     *
     */
    public ListProductFacturacionType.ProductFacturacion createListProductFacturacionTypeProductFacturacion() {
        return new ListProductFacturacionType.ProductFacturacion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCambioPaquetePrincipalEBOType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/ConsultarCambioPaquetePrincipal",
                    name = "ConsultarCambioPaquetePrincipalEBO")
    public JAXBElement<ConsultarCambioPaquetePrincipalEBOType> createConsultarCambioPaquetePrincipalEBO(ConsultarCambioPaquetePrincipalEBOType value) {
        return new JAXBElement<ConsultarCambioPaquetePrincipalEBOType>(_ConsultarCambioPaquetePrincipalEBO_QNAME,
                                                                       ConsultarCambioPaquetePrincipalEBOType.class,
                                                                       null, value);
    }

}
