
package mx.com.sky.enterpriseflowmessage.sel.preregistrosel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseflowmessage.sel.preregistrosel package.
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

    private final static QName _PreRegistroSelRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseFlowMessage/Sel/PreRegistroSel", "PreRegistroSelRequestEBM");
    private final static QName _PreRegistroSelResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseFlowMessage/Sel/PreRegistroSel", "PreRegistroSelResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseflowmessage.sel.preregistrosel
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PreRegistroSelRequestEBMType }
     *
     */
    public PreRegistroSelRequestEBMType createPreRegistroSelRequestEBMType() {
        return new PreRegistroSelRequestEBMType();
    }

    /**
     * Create an instance of {@link PreRegistroSelResponseEBMType }
     *
     */
    public PreRegistroSelResponseEBMType createPreRegistroSelResponseEBMType() {
        return new PreRegistroSelResponseEBMType();
    }

    /**
     * Create an instance of {@link PreRegistroSelInputMessageType }
     *
     */
    public PreRegistroSelInputMessageType createPreRegistroSelInputMessageType() {
        return new PreRegistroSelInputMessageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreRegistroSelRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseFlowMessage/Sel/PreRegistroSel",
                    name = "PreRegistroSelRequestEBM")
    public JAXBElement<PreRegistroSelRequestEBMType> createPreRegistroSelRequestEBM(PreRegistroSelRequestEBMType value) {
        return new JAXBElement<PreRegistroSelRequestEBMType>(_PreRegistroSelRequestEBM_QNAME,
                                                             PreRegistroSelRequestEBMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreRegistroSelResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseFlowMessage/Sel/PreRegistroSel",
                    name = "PreRegistroSelResponseEBM")
    public JAXBElement<PreRegistroSelResponseEBMType> createPreRegistroSelResponseEBM(PreRegistroSelResponseEBMType value) {
        return new JAXBElement<PreRegistroSelResponseEBMType>(_PreRegistroSelResponseEBM_QNAME,
                                                              PreRegistroSelResponseEBMType.class, null, value);
    }

}
