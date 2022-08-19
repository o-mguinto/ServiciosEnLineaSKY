
package mx.com.sky.enterpriseobjects.siebel.consultarctacelsky;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseobjects.siebel.consultarctacelsky package.
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

    private final static QName _ConsultarCtaCelSkyRequest_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Siebel/ConsultarCtaCelSky",
                  "ConsultarCtaCelSkyRequest");
    private final static QName _ConsultarCtaCelSkyResponse_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Siebel/ConsultarCtaCelSky",
                  "ConsultarCtaCelSkyResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseobjects.siebel.consultarctacelsky
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarCtaCelSkyRequestType }
     *
     */
    public ConsultarCtaCelSkyRequestType createConsultarCtaCelSkyRequestType() {
        return new ConsultarCtaCelSkyRequestType();
    }

    /**
     * Create an instance of {@link ConsultarCtaCelSkyResponseType }
     *
     */
    public ConsultarCtaCelSkyResponseType createConsultarCtaCelSkyResponseType() {
        return new ConsultarCtaCelSkyResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCtaCelSkyRequestType }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarCtaCelSkyRequestType }{@code >}
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseObjects/Siebel/ConsultarCtaCelSky",
                    name = "ConsultarCtaCelSkyRequest")
    public JAXBElement<ConsultarCtaCelSkyRequestType> createConsultarCtaCelSkyRequest(ConsultarCtaCelSkyRequestType value) {
        return new JAXBElement<ConsultarCtaCelSkyRequestType>(_ConsultarCtaCelSkyRequest_QNAME,
                                                              ConsultarCtaCelSkyRequestType.class,
                                                              null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCtaCelSkyResponseType }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarCtaCelSkyResponseType }{@code >}
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseObjects/Siebel/ConsultarCtaCelSky",
                    name = "ConsultarCtaCelSkyResponse")
    public JAXBElement<ConsultarCtaCelSkyResponseType> createConsultarCtaCelSkyResponse(ConsultarCtaCelSkyResponseType value) {
        return new JAXBElement<ConsultarCtaCelSkyResponseType>(_ConsultarCtaCelSkyResponse_QNAME,
                                                               ConsultarCtaCelSkyResponseType.class,
                                                               null, value);
    }

}
