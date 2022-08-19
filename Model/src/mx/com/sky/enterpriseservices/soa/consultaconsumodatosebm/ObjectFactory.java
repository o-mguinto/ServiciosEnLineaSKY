
package mx.com.sky.enterpriseservices.soa.consultaconsumodatosebm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseservices.soa.consultaconsumodatosebm package.
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

    private final static QName _ConsultaConsumoDatosRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseServices/Soa/ConsultaConsumoDatosEBM",
                  "ConsultaConsumoDatosRequestEBM");
    private final static QName _ConsultaConsumoDatosResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseServices/Soa/ConsultaConsumoDatosEBM",
                  "ConsultaConsumoDatosResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseservices.soa.consultaconsumodatosebm
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaConsumoDatosRequestEBMType }
     *
     */
    public ConsultaConsumoDatosRequestEBMType createConsultaConsumoDatosRequestEBMType() {
        return new ConsultaConsumoDatosRequestEBMType();
    }

    /**
     * Create an instance of {@link ConsultaConsumoDatosResponseEBMType }
     *
     */
    public ConsultaConsumoDatosResponseEBMType createConsultaConsumoDatosResponseEBMType() {
        return new ConsultaConsumoDatosResponseEBMType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaConsumoDatosRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseServices/Soa/ConsultaConsumoDatosEBM",
                    name = "ConsultaConsumoDatosRequestEBM")
    public JAXBElement<ConsultaConsumoDatosRequestEBMType> createConsultaConsumoDatosRequestEBM(ConsultaConsumoDatosRequestEBMType value) {
        return new JAXBElement<ConsultaConsumoDatosRequestEBMType>(_ConsultaConsumoDatosRequestEBM_QNAME,
                                                                   ConsultaConsumoDatosRequestEBMType.class, null,
                                                                   value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaConsumoDatosResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseServices/Soa/ConsultaConsumoDatosEBM",
                    name = "ConsultaConsumoDatosResponseEBM")
    public JAXBElement<ConsultaConsumoDatosResponseEBMType> createConsultaConsumoDatosResponseEBM(ConsultaConsumoDatosResponseEBMType value) {
        return new JAXBElement<ConsultaConsumoDatosResponseEBMType>(_ConsultaConsumoDatosResponseEBM_QNAME,
                                                                    ConsultaConsumoDatosResponseEBMType.class, null,
                                                                    value);
    }

}
