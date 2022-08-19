
package mx.com.sky.enterpriseflowmessage.sel.modificarpasswordregistro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseflowmessage.sel.modificarpasswordregistro package.
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

    private final static QName _ModificarPasswordRegistroRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseFlowMessage/Sel/ModificarPasswordRegistro",
                  "ModificarPasswordRegistroRequestEBM");
    private final static QName _ModificarPasswordRegistroResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseFlowMessage/Sel/ModificarPasswordRegistro",
                  "ModificarPasswordRegistroResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseflowmessage.sel.modificarpasswordregistro
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ModificarPasswordRegistroRequestEBMType }
     *
     */
    public ModificarPasswordRegistroRequestEBMType createModificarPasswordRegistroRequestEBMType() {
        return new ModificarPasswordRegistroRequestEBMType();
    }

    /**
     * Create an instance of {@link ModificarPasswordRegistroResponseEBMType }
     *
     */
    public ModificarPasswordRegistroResponseEBMType createModificarPasswordRegistroResponseEBMType() {
        return new ModificarPasswordRegistroResponseEBMType();
    }

    /**
     * Create an instance of {@link ModificarPasswordRegistroInputMessageType }
     *
     */
    public ModificarPasswordRegistroInputMessageType createModificarPasswordRegistroInputMessageType() {
        return new ModificarPasswordRegistroInputMessageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarPasswordRegistroRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseFlowMessage/Sel/ModificarPasswordRegistro",
                    name = "ModificarPasswordRegistroRequestEBM")
    public JAXBElement<ModificarPasswordRegistroRequestEBMType> createModificarPasswordRegistroRequestEBM(ModificarPasswordRegistroRequestEBMType value) {
        return new JAXBElement<ModificarPasswordRegistroRequestEBMType>(_ModificarPasswordRegistroRequestEBM_QNAME,
                                                                        ModificarPasswordRegistroRequestEBMType.class,
                                                                        null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarPasswordRegistroResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseFlowMessage/Sel/ModificarPasswordRegistro",
                    name = "ModificarPasswordRegistroResponseEBM")
    public JAXBElement<ModificarPasswordRegistroResponseEBMType> createModificarPasswordRegistroResponseEBM(ModificarPasswordRegistroResponseEBMType value) {
        return new JAXBElement<ModificarPasswordRegistroResponseEBMType>(_ModificarPasswordRegistroResponseEBM_QNAME,
                                                                         ModificarPasswordRegistroResponseEBMType.class,
                                                                         null, value);
    }

}
