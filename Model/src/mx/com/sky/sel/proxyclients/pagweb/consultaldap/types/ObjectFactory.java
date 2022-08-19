
package mx.com.sky.sel.proxyclients.pagweb.consultaldap.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.sel.proxyclients.pagweb.consultaldap.types package.
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

    private final static QName _DatosAux_QNAME = new QName("http://www.sky.com.mx/email/notificacion", "datosAux");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.sel.proxyclients.pagweb.consultaldap.types
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaLDAPProcessRequest }
     *
     */
    public ConsultaLDAPProcessRequest createConsultaLDAPProcessRequest() {
        return new ConsultaLDAPProcessRequest();
    }

    /**
     * Create an instance of {@link ConsultaLDAPProcessResponse }
     *
     */
    public ConsultaLDAPProcessResponse createConsultaLDAPProcessResponse() {
        return new ConsultaLDAPProcessResponse();
    }

    /**
     * Create an instance of {@link ConsultaLDAPProcessRequest.Atributos }
     *
     */
    public ConsultaLDAPProcessRequest.Atributos createConsultaLDAPProcessRequestAtributos() {
        return new ConsultaLDAPProcessRequest.Atributos();
    }

    /**
     * Create an instance of {@link ConsultaLDAPProcessResponse.Atributos }
     *
     */
    public ConsultaLDAPProcessResponse.Atributos createConsultaLDAPProcessResponseAtributos() {
        return new ConsultaLDAPProcessResponse.Atributos();
    }

    /**
     * Create an instance of {@link ConsultaLDAPProcessResponse.Hijas }
     *
     */
    public ConsultaLDAPProcessResponse.Hijas createConsultaLDAPProcessResponseHijas() {
        return new ConsultaLDAPProcessResponse.Hijas();
    }

    /**
     * Create an instance of {@link AuxType }
     *
     */
    public AuxType createAuxType() {
        return new AuxType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuxType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/email/notificacion", name = "datosAux")
    public JAXBElement<AuxType> createDatosAux(AuxType value) {
        return new JAXBElement<AuxType>(_DatosAux_QNAME, AuxType.class, null, value);
    }

}
