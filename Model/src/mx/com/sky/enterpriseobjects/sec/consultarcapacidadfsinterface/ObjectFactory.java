
package mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsinterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsinterface package.
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
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sec/ConsultarCapacidadFSInterface",
                  "ConsultarCapacidadFSRequestEBM");
    private final static QName _ConsultarCapacidadFSResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sec/ConsultarCapacidadFSInterface",
                  "ConsultarCapacidadFSResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsinterface
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCapacidadFSRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sec/ConsultarCapacidadFSInterface",
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
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sec/ConsultarCapacidadFSInterface",
                    name = "ConsultarCapacidadFSResponseEBM")
    public JAXBElement<ConsultarCapacidadFSResponseEBMType> createConsultarCapacidadFSResponseEBM(ConsultarCapacidadFSResponseEBMType value) {
        return new JAXBElement<ConsultarCapacidadFSResponseEBMType>(_ConsultarCapacidadFSResponseEBM_QNAME,
                                                                    ConsultarCapacidadFSResponseEBMType.class, null,
                                                                    value);
    }

}
