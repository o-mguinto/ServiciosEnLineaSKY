
package mx.com.sky.enterpriseflowmessage.sel.ejecutarremotebooking;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseflowmessage.sel.ejecutarremotebooking package.
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

    private final static QName _EjecutarRemoteBookingRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseFlowMessage/Sel/EjecutarRemoteBooking",
                  "EjecutarRemoteBookingRequestEBM");
    private final static QName _EjecutarRemoteBookingResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseFlowMessage/Sel/EjecutarRemoteBooking",
                  "EjecutarRemoteBookingResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseflowmessage.sel.ejecutarremotebooking
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EjecutarRemoteBookingRequestEBFEBMType }
     *
     */
    public EjecutarRemoteBookingRequestEBFEBMType createEjecutarRemoteBookingRequestEBFEBMType() {
        return new EjecutarRemoteBookingRequestEBFEBMType();
    }

    /**
     * Create an instance of {@link EjecutarRemoteBookingResponseEBFEBMType }
     *
     */
    public EjecutarRemoteBookingResponseEBFEBMType createEjecutarRemoteBookingResponseEBFEBMType() {
        return new EjecutarRemoteBookingResponseEBFEBMType();
    }

    /**
     * Create an instance of {@link RemoteBookingRequestEBMType }
     *
     */
    public RemoteBookingRequestEBMType createRemoteBookingRequestEBMType() {
        return new RemoteBookingRequestEBMType();
    }

    /**
     * Create an instance of {@link RemoteBookingResponseEBMType }
     *
     */
    public RemoteBookingResponseEBMType createRemoteBookingResponseEBMType() {
        return new RemoteBookingResponseEBMType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EjecutarRemoteBookingRequestEBFEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseFlowMessage/Sel/EjecutarRemoteBooking",
                    name = "EjecutarRemoteBookingRequestEBM")
    public JAXBElement<EjecutarRemoteBookingRequestEBFEBMType> createEjecutarRemoteBookingRequestEBM(EjecutarRemoteBookingRequestEBFEBMType value) {
        return new JAXBElement<EjecutarRemoteBookingRequestEBFEBMType>(_EjecutarRemoteBookingRequestEBM_QNAME,
                                                                       EjecutarRemoteBookingRequestEBFEBMType.class,
                                                                       null,
                                                                       value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EjecutarRemoteBookingResponseEBFEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseFlowMessage/Sel/EjecutarRemoteBooking",
                    name = "EjecutarRemoteBookingResponseEBM")
    public JAXBElement<EjecutarRemoteBookingResponseEBFEBMType> createEjecutarRemoteBookingResponseEBM(EjecutarRemoteBookingResponseEBFEBMType value) {
        return new JAXBElement<EjecutarRemoteBookingResponseEBFEBMType>(_EjecutarRemoteBookingResponseEBM_QNAME,
                                                                        EjecutarRemoteBookingResponseEBFEBMType.class,
                                                                        null,
                                                                        value);
    }

}
