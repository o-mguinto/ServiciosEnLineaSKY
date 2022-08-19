
package mx.com.sky.enterpriseobjects.soa.gestionacomponenteinterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseobjects.soa.gestionacomponenteinterface package.
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

    private final static QName _GestionaComponenteRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Soa/GestionaComponenteInterface",
                  "GestionaComponenteRequestEBM");
    private final static QName _GestionaComponenteResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Soa/GestionaComponenteInterface",
                  "GestionaComponenteResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseobjects.soa.gestionacomponenteinterface
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GestionaComponenteRequestEBMType }
     *
     */
    public GestionaComponenteRequestEBMType createGestionaComponenteRequestEBMType() {
        return new GestionaComponenteRequestEBMType();
    }

    /**
     * Create an instance of {@link GestionaComponenteResponseEBMType }
     *
     */
    public GestionaComponenteResponseEBMType createGestionaComponenteResponseEBMType() {
        return new GestionaComponenteResponseEBMType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GestionaComponenteRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Soa/GestionaComponenteInterface",
                    name = "GestionaComponenteRequestEBM")
    public JAXBElement<GestionaComponenteRequestEBMType> createGestionaComponenteRequestEBM(GestionaComponenteRequestEBMType value) {
        return new JAXBElement<GestionaComponenteRequestEBMType>(_GestionaComponenteRequestEBM_QNAME,
                                                                 GestionaComponenteRequestEBMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GestionaComponenteResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Soa/GestionaComponenteInterface",
                    name = "GestionaComponenteResponseEBM")
    public JAXBElement<GestionaComponenteResponseEBMType> createGestionaComponenteResponseEBM(GestionaComponenteResponseEBMType value) {
        return new JAXBElement<GestionaComponenteResponseEBMType>(_GestionaComponenteResponseEBM_QNAME,
                                                                  GestionaComponenteResponseEBMType.class, null, value);
    }

}
