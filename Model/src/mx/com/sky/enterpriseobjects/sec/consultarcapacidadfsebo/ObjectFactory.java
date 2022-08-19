
package mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsebo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsebo package.
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

    private final static QName _ConsultarCapacidadFSRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sec/ConsultarCapacidadFSEBO",
                  "ConsultarCapacidadFSRequestEBM");
    private final static QName _ConsultarCapacidadFSResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sec/ConsultarCapacidadFSEBO",
                  "ConsultarCapacidadFSResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsebo
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarCapacidadFSRequestEBMType }
     *
     */
    public ConsultarCapacidadFSRequestEBMType createConsultarCapacidadFSRequestEBMType() {
        return new ConsultarCapacidadFSRequestEBMType();
    }

    /**
     * Create an instance of {@link ConsultarCapacidadFSResponseEBMType }
     *
     */
    public ConsultarCapacidadFSResponseEBMType createConsultarCapacidadFSResponseEBMType() {
        return new ConsultarCapacidadFSResponseEBMType();
    }

    /**
     * Create an instance of {@link ConsultarCapacidadFSRequestType }
     *
     */
    public ConsultarCapacidadFSRequestType createConsultarCapacidadFSRequestType() {
        return new ConsultarCapacidadFSRequestType();
    }

    /**
     * Create an instance of {@link ParametrosType }
     *
     */
    public ParametrosType createParametrosType() {
        return new ParametrosType();
    }

    /**
     * Create an instance of {@link ParametroType }
     *
     */
    public ParametroType createParametroType() {
        return new ParametroType();
    }

    /**
     * Create an instance of {@link DistribuidorType }
     *
     */
    public DistribuidorType createDistribuidorType() {
        return new DistribuidorType();
    }

    /**
     * Create an instance of {@link ConsultarCapacidadFSResponseType }
     *
     */
    public ConsultarCapacidadFSResponseType createConsultarCapacidadFSResponseType() {
        return new ConsultarCapacidadFSResponseType();
    }

    /**
     * Create an instance of {@link CapacidadType }
     *
     */
    public CapacidadType createCapacidadType() {
        return new CapacidadType();
    }

    /**
     * Create an instance of {@link CapacidadPorDiaType }
     *
     */
    public CapacidadPorDiaType createCapacidadPorDiaType() {
        return new CapacidadPorDiaType();
    }

    /**
     * Create an instance of {@link TimeSlotsType }
     *
     */
    public TimeSlotsType createTimeSlotsType() {
        return new TimeSlotsType();
    }

    /**
     * Create an instance of {@link TimeSlotType }
     *
     */
    public TimeSlotType createTimeSlotType() {
        return new TimeSlotType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCapacidadFSRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sec/ConsultarCapacidadFSEBO",
                    name = "ConsultarCapacidadFSRequestEBM")
    public JAXBElement<ConsultarCapacidadFSRequestEBMType> createConsultarCapacidadFSRequestEBM(ConsultarCapacidadFSRequestEBMType value) {
        return new JAXBElement<ConsultarCapacidadFSRequestEBMType>(_ConsultarCapacidadFSRequestEBM_QNAME,
                                                                   ConsultarCapacidadFSRequestEBMType.class, null,
                                                                   value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCapacidadFSResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sec/ConsultarCapacidadFSEBO",
                    name = "ConsultarCapacidadFSResponseEBM")
    public JAXBElement<ConsultarCapacidadFSResponseEBMType> createConsultarCapacidadFSResponseEBM(ConsultarCapacidadFSResponseEBMType value) {
        return new JAXBElement<ConsultarCapacidadFSResponseEBMType>(_ConsultarCapacidadFSResponseEBM_QNAME,
                                                                    ConsultarCapacidadFSResponseEBMType.class, null,
                                                                    value);
    }

}
