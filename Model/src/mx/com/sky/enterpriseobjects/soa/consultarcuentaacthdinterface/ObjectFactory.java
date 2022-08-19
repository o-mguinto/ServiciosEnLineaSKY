
package mx.com.sky.enterpriseobjects.soa.consultarcuentaacthdinterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseobjects.soa.consultarcuentaacthdinterface package.
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

    private final static QName _ConsultarCuentaActHdRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultarCuentaActHdInterface",
                  "ConsultarCuentaActHdRequestEBM");
    private final static QName _ConsultarCuentaActHdResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultarCuentaActHdInterface",
                  "ConsultarCuentaActHdResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseobjects.soa.consultarcuentaacthdinterface
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarCuentaActHdRequestEBMType }
     *
     */
    public ConsultarCuentaActHdRequestEBMType createConsultarCuentaActHdRequestEBMType() {
        return new ConsultarCuentaActHdRequestEBMType();
    }

    /**
     * Create an instance of {@link ConsultarCuentaActHdResponseEBMType }
     *
     */
    public ConsultarCuentaActHdResponseEBMType createConsultarCuentaActHdResponseEBMType() {
        return new ConsultarCuentaActHdResponseEBMType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCuentaActHdRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultarCuentaActHdInterface",
                    name = "ConsultarCuentaActHdRequestEBM")
    public JAXBElement<ConsultarCuentaActHdRequestEBMType> createConsultarCuentaActHdRequestEBM(ConsultarCuentaActHdRequestEBMType value) {
        return new JAXBElement<ConsultarCuentaActHdRequestEBMType>(_ConsultarCuentaActHdRequestEBM_QNAME,
                                                                   ConsultarCuentaActHdRequestEBMType.class, null,
                                                                   value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCuentaActHdResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultarCuentaActHdInterface",
                    name = "ConsultarCuentaActHdResponseEBM")
    public JAXBElement<ConsultarCuentaActHdResponseEBMType> createConsultarCuentaActHdResponseEBM(ConsultarCuentaActHdResponseEBMType value) {
        return new JAXBElement<ConsultarCuentaActHdResponseEBMType>(_ConsultarCuentaActHdResponseEBM_QNAME,
                                                                    ConsultarCuentaActHdResponseEBMType.class, null,
                                                                    value);
    }

}
