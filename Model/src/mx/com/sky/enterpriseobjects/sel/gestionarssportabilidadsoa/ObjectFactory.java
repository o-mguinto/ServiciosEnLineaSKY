
package mx.com.sky.enterpriseobjects.sel.gestionarssportabilidadsoa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseobjects.sel.gestionarssportabilidadsoa package.
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

    private final static QName _GestionarSSPortabilidadRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sel/GestionarSSPortabilidadSoa",
                  "GestionarSSPortabilidadRequestEBM");
    private final static QName _GestionarSSPortabilidadResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sel/GestionarSSPortabilidadSoa",
                  "GestionarSSPortabilidadResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseobjects.sel.gestionarssportabilidadsoa
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GestionarSSPortabilidadRequestEBMType }
     *
     */
    public GestionarSSPortabilidadRequestEBMType createGestionarSSPortabilidadRequestEBMType() {
        return new GestionarSSPortabilidadRequestEBMType();
    }

    /**
     * Create an instance of {@link GestionarSSPortabilidadResponseEBMType }
     *
     */
    public GestionarSSPortabilidadResponseEBMType createGestionarSSPortabilidadResponseEBMType() {
        return new GestionarSSPortabilidadResponseEBMType();
    }

    /**
     * Create an instance of {@link ServiceInfoRequestType }
     *
     */
    public ServiceInfoRequestType createServiceInfoRequestType() {
        return new ServiceInfoRequestType();
    }

    /**
     * Create an instance of {@link ServiceInfoResponseType }
     *
     */
    public ServiceInfoResponseType createServiceInfoResponseType() {
        return new ServiceInfoResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GestionarSSPortabilidadRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/GestionarSSPortabilidadSoa",
                    name = "GestionarSSPortabilidadRequestEBM")
    public JAXBElement<GestionarSSPortabilidadRequestEBMType> createGestionarSSPortabilidadRequestEBM(GestionarSSPortabilidadRequestEBMType value) {
        return new JAXBElement<GestionarSSPortabilidadRequestEBMType>(_GestionarSSPortabilidadRequestEBM_QNAME,
                                                                      GestionarSSPortabilidadRequestEBMType.class, null,
                                                                      value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GestionarSSPortabilidadResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/GestionarSSPortabilidadSoa",
                    name = "GestionarSSPortabilidadResponseEBM")
    public JAXBElement<GestionarSSPortabilidadResponseEBMType> createGestionarSSPortabilidadResponseEBM(GestionarSSPortabilidadResponseEBMType value) {
        return new JAXBElement<GestionarSSPortabilidadResponseEBMType>(_GestionarSSPortabilidadResponseEBM_QNAME,
                                                                       GestionarSSPortabilidadResponseEBMType.class,
                                                                       null, value);
    }

}
