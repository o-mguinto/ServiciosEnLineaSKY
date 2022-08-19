
package mx.com.sky.enterpriseobjects.sec.common.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseobjects.sec.common.v1 package.
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

    private final static QName _EBM_QNAME = new QName("http://www.sky.com.mx/EnterpriseObjects/Sec/Common/V1", "EBM");
    private final static QName _EBMHeader_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sec/Common/V1", "EBMHeader");
    private final static QName _EBMHeaderResponse_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sec/Common/V1", "EBMHeaderResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseobjects.sec.common.v1
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EBMType }
     *
     */
    public EBMType createEBMType() {
        return new EBMType();
    }

    /**
     * Create an instance of {@link EBMHeaderType }
     *
     */
    public EBMHeaderType createEBMHeaderType() {
        return new EBMHeaderType();
    }

    /**
     * Create an instance of {@link EBMHeaderResponseType }
     *
     */
    public EBMHeaderResponseType createEBMHeaderResponseType() {
        return new EBMHeaderResponseType();
    }

    /**
     * Create an instance of {@link ErrorTecnicoType }
     *
     */
    public ErrorTecnicoType createErrorTecnicoType() {
        return new ErrorTecnicoType();
    }

    /**
     * Create an instance of {@link ErrorNegocioType }
     *
     */
    public ErrorNegocioType createErrorNegocioType() {
        return new ErrorNegocioType();
    }

    /**
     * Create an instance of {@link SeguridadType }
     *
     */
    public SeguridadType createSeguridadType() {
        return new SeguridadType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sec/Common/V1", name = "EBM")
    public JAXBElement<EBMType> createEBM(EBMType value) {
        return new JAXBElement<EBMType>(_EBM_QNAME, EBMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EBMHeaderType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sec/Common/V1", name = "EBMHeader")
    public JAXBElement<EBMHeaderType> createEBMHeader(EBMHeaderType value) {
        return new JAXBElement<EBMHeaderType>(_EBMHeader_QNAME, EBMHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EBMHeaderResponseType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sec/Common/V1", name = "EBMHeaderResponse")
    public JAXBElement<EBMHeaderResponseType> createEBMHeaderResponse(EBMHeaderResponseType value) {
        return new JAXBElement<EBMHeaderResponseType>(_EBMHeaderResponse_QNAME, EBMHeaderResponseType.class, null,
                                                      value);
    }

}
