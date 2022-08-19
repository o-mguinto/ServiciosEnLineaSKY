
package mx.com.sky.enterpriseobjects.sap.common.v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseobjects.sap.common.v3 package.
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

    private final static QName _EBM_QNAME = new QName("http://www.sky.com.mx/EnterpriseObjects/Sap/Common/V3", "EBM");
    private final static QName _EBMHeaderRequest_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sap/Common/V3", "EBMHeaderRequest");
    private final static QName _EBMHeaderResponse_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sap/Common/V3", "EBMHeaderResponse");
    private final static QName _RuntimeFaultMessage_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseObjects/Sap/Common/V3", "RuntimeFaultMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseobjects.sap.common.v3
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
     * Create an instance of {@link EBMHeaderRequestType }
     *
     */
    public EBMHeaderRequestType createEBMHeaderRequestType() {
        return new EBMHeaderRequestType();
    }

    /**
     * Create an instance of {@link EBMHeaderResponseType }
     *
     */
    public EBMHeaderResponseType createEBMHeaderResponseType() {
        return new EBMHeaderResponseType();
    }

    /**
     * Create an instance of {@link RuntimeFaultMessageType }
     *
     */
    public RuntimeFaultMessageType createRuntimeFaultMessageType() {
        return new RuntimeFaultMessageType();
    }

    /**
     * Create an instance of {@link SeguridadListType }
     *
     */
    public SeguridadListType createSeguridadListType() {
        return new SeguridadListType();
    }

    /**
     * Create an instance of {@link SeguridadItemType }
     *
     */
    public SeguridadItemType createSeguridadItemType() {
        return new SeguridadItemType();
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
     * Create an instance of {@link ParametroItemType }
     *
     */
    public ParametroItemType createParametroItemType() {
        return new ParametroItemType();
    }

    /**
     * Create an instance of {@link ParametroListType }
     *
     */
    public ParametroListType createParametroListType() {
        return new ParametroListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EBMType }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EBMType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sap/Common/V3", name = "EBM")
    public JAXBElement<EBMType> createEBM(EBMType value) {
        return new JAXBElement<EBMType>(_EBM_QNAME, EBMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EBMHeaderRequestType }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EBMHeaderRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sap/Common/V3", name = "EBMHeaderRequest")
    public JAXBElement<EBMHeaderRequestType> createEBMHeaderRequest(EBMHeaderRequestType value) {
        return new JAXBElement<EBMHeaderRequestType>(_EBMHeaderRequest_QNAME, EBMHeaderRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EBMHeaderResponseType }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EBMHeaderResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sap/Common/V3", name = "EBMHeaderResponse")
    public JAXBElement<EBMHeaderResponseType> createEBMHeaderResponse(EBMHeaderResponseType value) {
        return new JAXBElement<EBMHeaderResponseType>(_EBMHeaderResponse_QNAME, EBMHeaderResponseType.class, null,
                                                      value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RuntimeFaultMessageType }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RuntimeFaultMessageType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseObjects/Sap/Common/V3", name = "RuntimeFaultMessage")
    public JAXBElement<RuntimeFaultMessageType> createRuntimeFaultMessage(RuntimeFaultMessageType value) {
        return new JAXBElement<RuntimeFaultMessageType>(_RuntimeFaultMessage_QNAME, RuntimeFaultMessageType.class, null,
                                                        value);
    }

}
