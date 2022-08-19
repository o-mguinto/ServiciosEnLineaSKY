
package mx.com.sky.enterpriseflowmessage.sel.autenticarusuario;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseflowmessage.sel.autenticarusuario package.
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

    private final static QName _AutenticarUsuarioRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseFlowMessage/Sel/AutenticarUsuario",
                  "AutenticarUsuarioRequestEBM");
    private final static QName _AutenticarUsuarioResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseFlowMessage/Sel/AutenticarUsuario",
                  "AutenticarUsuarioResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseflowmessage.sel.autenticarusuario
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AutenticarUsuarioRequestEBMType }
     *
     */
    public AutenticarUsuarioRequestEBMType createAutenticarUsuarioRequestEBMType() {
        return new AutenticarUsuarioRequestEBMType();
    }

    /**
     * Create an instance of {@link AutenticarUsuarioResponseEBMType }
     *
     */
    public AutenticarUsuarioResponseEBMType createAutenticarUsuarioResponseEBMType() {
        return new AutenticarUsuarioResponseEBMType();
    }

    /**
     * Create an instance of {@link ListUsuariosSelType }
     *
     */
    public ListUsuariosSelType createListUsuariosSelType() {
        return new ListUsuariosSelType();
    }

    /**
     * Create an instance of {@link AutenticarUsuarioInputMessageType }
     *
     */
    public AutenticarUsuarioInputMessageType createAutenticarUsuarioInputMessageType() {
        return new AutenticarUsuarioInputMessageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutenticarUsuarioRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseFlowMessage/Sel/AutenticarUsuario",
                    name = "AutenticarUsuarioRequestEBM")
    public JAXBElement<AutenticarUsuarioRequestEBMType> createAutenticarUsuarioRequestEBM(AutenticarUsuarioRequestEBMType value) {
        return new JAXBElement<AutenticarUsuarioRequestEBMType>(_AutenticarUsuarioRequestEBM_QNAME,
                                                                AutenticarUsuarioRequestEBMType.class,
                                                                null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutenticarUsuarioResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseFlowMessage/Sel/AutenticarUsuario",
                    name = "AutenticarUsuarioResponseEBM")
    public JAXBElement<AutenticarUsuarioResponseEBMType> createAutenticarUsuarioResponseEBM(AutenticarUsuarioResponseEBMType value) {
        return new JAXBElement<AutenticarUsuarioResponseEBMType>(_AutenticarUsuarioResponseEBM_QNAME,
                                                                 AutenticarUsuarioResponseEBMType.class,
                                                                 null, value);
    }

}
