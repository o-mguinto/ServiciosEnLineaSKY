
package mx.com.sky.enterpriseobjects.sel.consultarregimenfiscal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseobjects.sel.consultarregimenfiscal package.
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

    private final static QName _ConsultarRegimenFiscalRequest_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sel/ConsultarRegimenFiscal",
                  "ConsultarRegimenFiscalRequest");
    private final static QName _ConsultarRegimenFiscalResponse_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sel/ConsultarRegimenFiscal",
                  "ConsultarRegimenFiscalResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseobjects.sel.consultarregimenfiscal
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarRegimenFiscalRequestType }
     *
     */
    public ConsultarRegimenFiscalRequestType createConsultarRegimenFiscalRequestType() {
        return new ConsultarRegimenFiscalRequestType();
    }

    /**
     * Create an instance of {@link ConsultarRegimenFiscalResponseType }
     *
     */
    public ConsultarRegimenFiscalResponseType createConsultarRegimenFiscalResponseType() {
        return new ConsultarRegimenFiscalResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarRegimenFiscalRequestType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/ConsultarRegimenFiscal",
                    name = "ConsultarRegimenFiscalRequest")
    public JAXBElement<ConsultarRegimenFiscalRequestType> createConsultarRegimenFiscalRequest(ConsultarRegimenFiscalRequestType value) {
        return new JAXBElement<ConsultarRegimenFiscalRequestType>(_ConsultarRegimenFiscalRequest_QNAME,
                                                                  ConsultarRegimenFiscalRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarRegimenFiscalResponseType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/ConsultarRegimenFiscal",
                    name = "ConsultarRegimenFiscalResponse")
    public JAXBElement<ConsultarRegimenFiscalResponseType> createConsultarRegimenFiscalResponse(ConsultarRegimenFiscalResponseType value) {
        return new JAXBElement<ConsultarRegimenFiscalResponseType>(_ConsultarRegimenFiscalResponse_QNAME,
                                                                   ConsultarRegimenFiscalResponseType.class, null,
                                                                   value);
    }

}
