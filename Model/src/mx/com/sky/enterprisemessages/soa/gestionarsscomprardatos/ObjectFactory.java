
package mx.com.sky.enterprisemessages.soa.gestionarsscomprardatos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterprisemessages.soa.gestionarsscomprardatos package.
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

    private final static QName _GestionarSSComprarDatosRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Soa/GestionarSSComprarDatos",
                  "GestionarSSComprarDatosRequestEBM");
    private final static QName _GestionarSSComprarDatosResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Soa/GestionarSSComprarDatos",
                  "GestionarSSComprarDatosResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterprisemessages.soa.gestionarsscomprardatos
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
     * Create an instance of {@link GestionarSSComprarDatosRequestEBMType }
     *
     */
    public GestionarSSComprarDatosRequestEBMType createGestionarSSComprarDatosRequestEBMType() {
        return new GestionarSSComprarDatosRequestEBMType();
    }

    /**
     * Create an instance of {@link GestionarSSComprarDatosResponseEBMType }
     *
     */
    public GestionarSSComprarDatosResponseEBMType createGestionarSSComprarDatosResponseEBMType() {
        return new GestionarSSComprarDatosResponseEBMType();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GestionarSSComprarDatosRequestEBMType }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GestionarSSComprarDatosRequestEBMType }{@code >}
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseMessages/Soa/GestionarSSComprarDatos",
                    name = "GestionarSSComprarDatosRequestEBM")
    public JAXBElement<GestionarSSComprarDatosRequestEBMType> createGestionarSSComprarDatosRequestEBM(GestionarSSComprarDatosRequestEBMType value) {
        return new JAXBElement<GestionarSSComprarDatosRequestEBMType>(_GestionarSSComprarDatosRequestEBM_QNAME,
                                                                      GestionarSSComprarDatosRequestEBMType.class,
                                                                      null,
                                                                      value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GestionarSSComprarDatosResponseEBMType }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GestionarSSComprarDatosResponseEBMType }{@code >}
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseMessages/Soa/GestionarSSComprarDatos",
                    name = "GestionarSSComprarDatosResponseEBM")
    public JAXBElement<GestionarSSComprarDatosResponseEBMType> createGestionarSSComprarDatosResponseEBM(GestionarSSComprarDatosResponseEBMType value) {
        return new JAXBElement<GestionarSSComprarDatosResponseEBMType>(_GestionarSSComprarDatosResponseEBM_QNAME,
                                                                       GestionarSSComprarDatosResponseEBMType.class,
                                                                       null,
                                                                       value);
    }

}
