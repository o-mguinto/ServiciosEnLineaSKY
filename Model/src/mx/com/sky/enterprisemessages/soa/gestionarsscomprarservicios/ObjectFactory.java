
package mx.com.sky.enterprisemessages.soa.gestionarsscomprarservicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterprisemessages.soa.gestionarsscomprarservicios package.
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

    private final static QName _GestionarSSComprarServiciosRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Soa/GestionarSSComprarServicios",
                  "GestionarSSComprarServiciosRequestEBM");
    private final static QName _GestionarSSComprarServiciosResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Soa/GestionarSSComprarServicios",
                  "GestionarSSComprarServiciosResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterprisemessages.soa.gestionarsscomprarservicios
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOfProductsType }
     *
     */
    public ListOfProductsType createListOfProductsType() {
        return new ListOfProductsType();
    }

    /**
     * Create an instance of {@link ListOfInstancesType }
     *
     */
    public ListOfInstancesType createListOfInstancesType() {
        return new ListOfInstancesType();
    }

    /**
     * Create an instance of {@link GestionarSSComprarServiciosRequestEBMType }
     *
     */
    public GestionarSSComprarServiciosRequestEBMType createGestionarSSComprarServiciosRequestEBMType() {
        return new GestionarSSComprarServiciosRequestEBMType();
    }

    /**
     * Create an instance of {@link GestionarSSComprarServiciosResponseEBMType }
     *
     */
    public GestionarSSComprarServiciosResponseEBMType createGestionarSSComprarServiciosResponseEBMType() {
        return new GestionarSSComprarServiciosResponseEBMType();
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
     * Create an instance of {@link ListOfProductsType.Product }
     *
     */
    public ListOfProductsType.Product createListOfProductsTypeProduct() {
        return new ListOfProductsType.Product();
    }

    /**
     * Create an instance of {@link ListOfInstancesType.Instance }
     *
     */
    public ListOfInstancesType.Instance createListOfInstancesTypeInstance() {
        return new ListOfInstancesType.Instance();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GestionarSSComprarServiciosRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseMessages/Soa/GestionarSSComprarServicios",
                    name = "GestionarSSComprarServiciosRequestEBM")
    public JAXBElement<GestionarSSComprarServiciosRequestEBMType> createGestionarSSComprarServiciosRequestEBM(GestionarSSComprarServiciosRequestEBMType value) {
        return new JAXBElement<GestionarSSComprarServiciosRequestEBMType>(_GestionarSSComprarServiciosRequestEBM_QNAME,
                                                                          GestionarSSComprarServiciosRequestEBMType.class,
                                                                          null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GestionarSSComprarServiciosResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseMessages/Soa/GestionarSSComprarServicios",
                    name = "GestionarSSComprarServiciosResponseEBM")
    public JAXBElement<GestionarSSComprarServiciosResponseEBMType> createGestionarSSComprarServiciosResponseEBM(GestionarSSComprarServiciosResponseEBMType value) {
        return new JAXBElement<GestionarSSComprarServiciosResponseEBMType>(_GestionarSSComprarServiciosResponseEBM_QNAME,
                                                                           GestionarSSComprarServiciosResponseEBMType.class,
                                                                           null, value);
    }

}
