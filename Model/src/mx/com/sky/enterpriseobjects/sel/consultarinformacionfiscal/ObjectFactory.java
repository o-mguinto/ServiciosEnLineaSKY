
package mx.com.sky.enterpriseobjects.sel.consultarinformacionfiscal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseobjects.sel.consultarinformacionfiscal package.
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

    private final static QName _ConsultarInformacionFiscalRequest_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sel/ConsultarInformacionFiscal",
                  "ConsultarInformacionFiscalRequest");
    private final static QName _ConsultarInformacionFiscalResponse_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sel/ConsultarInformacionFiscal",
                  "ConsultarInformacionFiscalResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseobjects.sel.consultarinformacionfiscal
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarInformacionFiscalRequestType }
     *
     */
    public ConsultarInformacionFiscalRequestType createConsultarInformacionFiscalRequestType() {
        return new ConsultarInformacionFiscalRequestType();
    }

    /**
     * Create an instance of {@link ConsultarInformacionFiscalResponseType }
     *
     */
    public ConsultarInformacionFiscalResponseType createConsultarInformacionFiscalResponseType() {
        return new ConsultarInformacionFiscalResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarInformacionFiscalRequestType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/ConsultarInformacionFiscal",
                    name = "ConsultarInformacionFiscalRequest")
    public JAXBElement<ConsultarInformacionFiscalRequestType> createConsultarInformacionFiscalRequest(ConsultarInformacionFiscalRequestType value) {
        return new JAXBElement<ConsultarInformacionFiscalRequestType>(_ConsultarInformacionFiscalRequest_QNAME,
                                                                      ConsultarInformacionFiscalRequestType.class, null,
                                                                      value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarInformacionFiscalResponseType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/ConsultarInformacionFiscal",
                    name = "ConsultarInformacionFiscalResponse")
    public JAXBElement<ConsultarInformacionFiscalResponseType> createConsultarInformacionFiscalResponse(ConsultarInformacionFiscalResponseType value) {
        return new JAXBElement<ConsultarInformacionFiscalResponseType>(_ConsultarInformacionFiscalResponse_QNAME,
                                                                       ConsultarInformacionFiscalResponseType.class,
                                                                       null, value);
    }

}
