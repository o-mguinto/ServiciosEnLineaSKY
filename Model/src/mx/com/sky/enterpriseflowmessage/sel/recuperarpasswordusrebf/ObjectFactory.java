
package mx.com.sky.enterpriseflowmessage.sel.recuperarpasswordusrebf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseflowmessage.sel.recuperarpasswordusrebf package.
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

    private final static QName _RecuperarPasswordUsrRequestEBFEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseFlowMessage/Sel/RecuperarPasswordUsrEBF",
                  "RecuperarPasswordUsrRequestEBFEBM");
    private final static QName _RecuperarPasswordUsrResponseEBFEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseFlowMessage/Sel/RecuperarPasswordUsrEBF",
                  "RecuperarPasswordUsrResponseEBFEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseflowmessage.sel.recuperarpasswordusrebf
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RecuperarPasswordUsrRequestEBFEBMType }
     *
     */
    public RecuperarPasswordUsrRequestEBFEBMType createRecuperarPasswordUsrRequestEBFEBMType() {
        return new RecuperarPasswordUsrRequestEBFEBMType();
    }

    /**
     * Create an instance of {@link RecuperarPasswordUsrResponseEBFEBMType }
     *
     */
    public RecuperarPasswordUsrResponseEBFEBMType createRecuperarPasswordUsrResponseEBFEBMType() {
        return new RecuperarPasswordUsrResponseEBFEBMType();
    }

    /**
     * Create an instance of {@link RecuperarPasswordUsrResponseType }
     *
     */
    public RecuperarPasswordUsrResponseType createRecuperarPasswordUsrResponseType() {
        return new RecuperarPasswordUsrResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperarPasswordUsrRequestEBFEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseFlowMessage/Sel/RecuperarPasswordUsrEBF",
                    name = "RecuperarPasswordUsrRequestEBFEBM")
    public JAXBElement<RecuperarPasswordUsrRequestEBFEBMType> createRecuperarPasswordUsrRequestEBFEBM(RecuperarPasswordUsrRequestEBFEBMType value) {
        return new JAXBElement<RecuperarPasswordUsrRequestEBFEBMType>(_RecuperarPasswordUsrRequestEBFEBM_QNAME,
                                                                      RecuperarPasswordUsrRequestEBFEBMType.class, null,
                                                                      value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperarPasswordUsrResponseEBFEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseFlowMessage/Sel/RecuperarPasswordUsrEBF",
                    name = "RecuperarPasswordUsrResponseEBFEBM")
    public JAXBElement<RecuperarPasswordUsrResponseEBFEBMType> createRecuperarPasswordUsrResponseEBFEBM(RecuperarPasswordUsrResponseEBFEBMType value) {
        return new JAXBElement<RecuperarPasswordUsrResponseEBFEBMType>(_RecuperarPasswordUsrResponseEBFEBM_QNAME,
                                                                       RecuperarPasswordUsrResponseEBFEBMType.class,
                                                                       null, value);
    }

}
