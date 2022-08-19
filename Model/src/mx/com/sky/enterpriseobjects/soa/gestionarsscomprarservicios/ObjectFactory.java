
package mx.com.sky.enterpriseobjects.soa.gestionarsscomprarservicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseobjects.soa.gestionarsscomprarservicios package.
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

    private final static QName _GestionarSSComprarServiciosRequest_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Soa/GestionarSSComprarServicios",
                  "GestionarSSComprarServiciosRequest");
    private final static QName _GestionarSSComprarServiciosResponse_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Soa/GestionarSSComprarServicios",
                  "GestionarSSComprarServiciosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseobjects.soa.gestionarsscomprarservicios
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GestionarSSComprarServiciosRequestType }
     *
     */
    public GestionarSSComprarServiciosRequestType createGestionarSSComprarServiciosRequestType() {
        return new GestionarSSComprarServiciosRequestType();
    }

    /**
     * Create an instance of {@link GestionarSSComprarServiciosResponseType }
     *
     */
    public GestionarSSComprarServiciosResponseType createGestionarSSComprarServiciosResponseType() {
        return new GestionarSSComprarServiciosResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GestionarSSComprarServiciosRequestType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Soa/GestionarSSComprarServicios",
                    name = "GestionarSSComprarServiciosRequest")
    public JAXBElement<GestionarSSComprarServiciosRequestType> createGestionarSSComprarServiciosRequest(GestionarSSComprarServiciosRequestType value) {
        return new JAXBElement<GestionarSSComprarServiciosRequestType>(_GestionarSSComprarServiciosRequest_QNAME,
                                                                       GestionarSSComprarServiciosRequestType.class,
                                                                       null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GestionarSSComprarServiciosResponseType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Soa/GestionarSSComprarServicios",
                    name = "GestionarSSComprarServiciosResponse")
    public JAXBElement<GestionarSSComprarServiciosResponseType> createGestionarSSComprarServiciosResponse(GestionarSSComprarServiciosResponseType value) {
        return new JAXBElement<GestionarSSComprarServiciosResponseType>(_GestionarSSComprarServiciosResponse_QNAME,
                                                                        GestionarSSComprarServiciosResponseType.class,
                                                                        null, value);
    }

}
