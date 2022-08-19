
package mx.com.sky.enterprisemessages.sel.paqadicionaldatos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterprisemessages.sel.paqadicionaldatos package.
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

    private final static QName _ConsultarPaqAdicionalDatosRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/PaqAdicionalDatos",
                  "ConsultarPaqAdicionalDatosRequestEBM");
    private final static QName _ConsultarPaqAdicionalDatosResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/PaqAdicionalDatos",
                  "ConsultarPaqAdicionalDatosResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterprisemessages.sel.paqadicionaldatos
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarPaqAdicionalDatosRequestEBMType }
     *
     */
    public ConsultarPaqAdicionalDatosRequestEBMType createConsultarPaqAdicionalDatosRequestEBMType() {
        return new ConsultarPaqAdicionalDatosRequestEBMType();
    }

    /**
     * Create an instance of {@link ConsultarPaqAdicionalDatosResponseEBMType }
     *
     */
    public ConsultarPaqAdicionalDatosResponseEBMType createConsultarPaqAdicionalDatosResponseEBMType() {
        return new ConsultarPaqAdicionalDatosResponseEBMType();
    }

    /**
     * Create an instance of {@link ConsultarPaqAdicionalDatosRequestType }
     *
     */
    public ConsultarPaqAdicionalDatosRequestType createConsultarPaqAdicionalDatosRequestType() {
        return new ConsultarPaqAdicionalDatosRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPaqAdicionalDatosRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseMessages/Sel/PaqAdicionalDatos",
                    name = "ConsultarPaqAdicionalDatosRequestEBM")
    public JAXBElement<ConsultarPaqAdicionalDatosRequestEBMType> createConsultarPaqAdicionalDatosRequestEBM(ConsultarPaqAdicionalDatosRequestEBMType value) {
        return new JAXBElement<ConsultarPaqAdicionalDatosRequestEBMType>(_ConsultarPaqAdicionalDatosRequestEBM_QNAME,
                                                                         ConsultarPaqAdicionalDatosRequestEBMType.class,
                                                                         null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPaqAdicionalDatosResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseMessages/Sel/PaqAdicionalDatos",
                    name = "ConsultarPaqAdicionalDatosResponseEBM")
    public JAXBElement<ConsultarPaqAdicionalDatosResponseEBMType> createConsultarPaqAdicionalDatosResponseEBM(ConsultarPaqAdicionalDatosResponseEBMType value) {
        return new JAXBElement<ConsultarPaqAdicionalDatosResponseEBMType>(_ConsultarPaqAdicionalDatosResponseEBM_QNAME,
                                                                          ConsultarPaqAdicionalDatosResponseEBMType.class,
                                                                          null, value);
    }

}
