
package mx.com.sky.enterpriseobjects.sel.usuario;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseobjects.sel.usuario package.
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

    private final static QName _UsuarioSelEBO_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sel/Usuario",
                  "UsuarioSelEBO");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseobjects.sel.usuario
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UsuarioEBOType }
     *
     */
    public UsuarioEBOType createUsuarioEBOType() {
        return new UsuarioEBOType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioEBOType }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseObjects/Sel/Usuario",
                    name = "UsuarioSelEBO")
    public JAXBElement<UsuarioEBOType> createUsuarioSelEBO(UsuarioEBOType value) {
        return new JAXBElement<UsuarioEBOType>(_UsuarioSelEBO_QNAME,
                                               UsuarioEBOType.class, null,
                                               value);
    }

}
