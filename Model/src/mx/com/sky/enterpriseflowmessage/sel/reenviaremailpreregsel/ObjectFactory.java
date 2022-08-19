
package mx.com.sky.enterpriseflowmessage.sel.reenviaremailpreregsel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseflowmessage.sel.reenviaremailpreregsel package.
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

    private final static QName _ReEnviarEmailPreRegSelRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseFlowMessage/Sel/ReEnviarEmailPreRegSel",
                  "ReEnviarEmailPreRegSelRequestEBM");
    private final static QName _ReEnviarEmailPreRegSelResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseFlowMessage/Sel/ReEnviarEmailPreRegSel",
                  "ReEnviarEmailPreRegSelResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseflowmessage.sel.reenviaremailpreregsel
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReEnviarEmailPreRegSelRequestEBMType }
     *
     */
    public ReEnviarEmailPreRegSelRequestEBMType createReEnviarEmailPreRegSelRequestEBMType() {
        return new ReEnviarEmailPreRegSelRequestEBMType();
    }

    /**
     * Create an instance of {@link ReEnviarEmailPreRegSelResponseEBMType }
     *
     */
    public ReEnviarEmailPreRegSelResponseEBMType createReEnviarEmailPreRegSelResponseEBMType() {
        return new ReEnviarEmailPreRegSelResponseEBMType();
    }

    /**
     * Create an instance of {@link ReEnviarEmailPreRegSelInputMessageType }
     *
     */
    public ReEnviarEmailPreRegSelInputMessageType createReEnviarEmailPreRegSelInputMessageType() {
        return new ReEnviarEmailPreRegSelInputMessageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReEnviarEmailPreRegSelRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseFlowMessage/Sel/ReEnviarEmailPreRegSel",
                    name = "ReEnviarEmailPreRegSelRequestEBM")
    public JAXBElement<ReEnviarEmailPreRegSelRequestEBMType> createReEnviarEmailPreRegSelRequestEBM(ReEnviarEmailPreRegSelRequestEBMType value) {
        return new JAXBElement<ReEnviarEmailPreRegSelRequestEBMType>(_ReEnviarEmailPreRegSelRequestEBM_QNAME,
                                                                     ReEnviarEmailPreRegSelRequestEBMType.class, null,
                                                                     value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReEnviarEmailPreRegSelResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseFlowMessage/Sel/ReEnviarEmailPreRegSel",
                    name = "ReEnviarEmailPreRegSelResponseEBM")
    public JAXBElement<ReEnviarEmailPreRegSelResponseEBMType> createReEnviarEmailPreRegSelResponseEBM(ReEnviarEmailPreRegSelResponseEBMType value) {
        return new JAXBElement<ReEnviarEmailPreRegSelResponseEBMType>(_ReEnviarEmailPreRegSelResponseEBM_QNAME,
                                                                      ReEnviarEmailPreRegSelResponseEBMType.class, null,
                                                                      value);
    }

}
