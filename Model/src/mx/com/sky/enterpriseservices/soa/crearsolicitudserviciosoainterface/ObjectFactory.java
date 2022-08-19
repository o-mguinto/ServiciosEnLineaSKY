
package mx.com.sky.enterpriseservices.soa.crearsolicitudserviciosoainterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseservices.soa.crearsolicitudserviciosoainterface package.
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

    private final static QName _CrearSolicitudServicioSoaInterfaceRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseServices/Soa/CrearSolicitudServicioSoaInterface",
                  "CrearSolicitudServicioSoaInterfaceRequestEBM");
    private final static QName _CrearSolicitudServicioSoaInterfaceResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseServices/Soa/CrearSolicitudServicioSoaInterface",
                  "CrearSolicitudServicioSoaInterfaceResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseservices.soa.crearsolicitudserviciosoainterface
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearSolicitudServicioSoaInterfaceRequestType }
     *
     */
    public CrearSolicitudServicioSoaInterfaceRequestType createCrearSolicitudServicioSoaInterfaceRequestType() {
        return new CrearSolicitudServicioSoaInterfaceRequestType();
    }

    /**
     * Create an instance of {@link CrearSolicitudServicioSoaInterfaceResponseType }
     *
     */
    public CrearSolicitudServicioSoaInterfaceResponseType createCrearSolicitudServicioSoaInterfaceResponseType() {
        return new CrearSolicitudServicioSoaInterfaceResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearSolicitudServicioSoaInterfaceRequestType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseServices/Soa/CrearSolicitudServicioSoaInterface",
                    name = "CrearSolicitudServicioSoaInterfaceRequestEBM")
    public JAXBElement<CrearSolicitudServicioSoaInterfaceRequestType> createCrearSolicitudServicioSoaInterfaceRequestEBM(CrearSolicitudServicioSoaInterfaceRequestType value) {
        return new JAXBElement<CrearSolicitudServicioSoaInterfaceRequestType>(_CrearSolicitudServicioSoaInterfaceRequestEBM_QNAME,
                                                                              CrearSolicitudServicioSoaInterfaceRequestType.class,
                                                                              null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearSolicitudServicioSoaInterfaceResponseType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseServices/Soa/CrearSolicitudServicioSoaInterface",
                    name = "CrearSolicitudServicioSoaInterfaceResponseEBM")
    public JAXBElement<CrearSolicitudServicioSoaInterfaceResponseType> createCrearSolicitudServicioSoaInterfaceResponseEBM(CrearSolicitudServicioSoaInterfaceResponseType value) {
        return new JAXBElement<CrearSolicitudServicioSoaInterfaceResponseType>(_CrearSolicitudServicioSoaInterfaceResponseEBM_QNAME,
                                                                               CrearSolicitudServicioSoaInterfaceResponseType.class,
                                                                               null, value);
    }

}
