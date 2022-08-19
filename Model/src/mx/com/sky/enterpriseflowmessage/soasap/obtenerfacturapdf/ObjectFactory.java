
package mx.com.sky.enterpriseflowmessage.soasap.obtenerfacturapdf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseflowmessage.soasap.obtenerfacturapdf package.
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

    private final static QName _ObtenerFacturaPDFRequest_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseFlowMessage/SoaSap/ObtenerFacturaPDF", "ObtenerFacturaPDFRequest");
    private final static QName _ObtenerFacturaPDFResponse_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseFlowMessage/SoaSap/ObtenerFacturaPDF", "ObtenerFacturaPDFResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseflowmessage.soasap.obtenerfacturapdf
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerFacturaPDFRequestType }
     *
     */
    public ObtenerFacturaPDFRequestType createObtenerFacturaPDFRequestType() {
        return new ObtenerFacturaPDFRequestType();
    }

    /**
     * Create an instance of {@link ObtenerFacturaPDFResponseType }
     *
     */
    public ObtenerFacturaPDFResponseType createObtenerFacturaPDFResponseType() {
        return new ObtenerFacturaPDFResponseType();
    }

    /**
     * Create an instance of {@link ObtenerFacturaPDFReqType }
     *
     */
    public ObtenerFacturaPDFReqType createObtenerFacturaPDFReqType() {
        return new ObtenerFacturaPDFReqType();
    }

    /**
     * Create an instance of {@link ObtenerFacturaPDFResType }
     *
     */
    public ObtenerFacturaPDFResType createObtenerFacturaPDFResType() {
        return new ObtenerFacturaPDFResType();
    }

    /**
     * Create an instance of {@link ModelType }
     *
     */
    public ModelType createModelType() {
        return new ModelType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerFacturaPDFRequestType }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerFacturaPDFRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseFlowMessage/SoaSap/ObtenerFacturaPDF",
                    name = "ObtenerFacturaPDFRequest")
    public JAXBElement<ObtenerFacturaPDFRequestType> createObtenerFacturaPDFRequest(ObtenerFacturaPDFRequestType value) {
        return new JAXBElement<ObtenerFacturaPDFRequestType>(_ObtenerFacturaPDFRequest_QNAME,
                                                             ObtenerFacturaPDFRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerFacturaPDFResponseType }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerFacturaPDFResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseFlowMessage/SoaSap/ObtenerFacturaPDF",
                    name = "ObtenerFacturaPDFResponse")
    public JAXBElement<ObtenerFacturaPDFResponseType> createObtenerFacturaPDFResponse(ObtenerFacturaPDFResponseType value) {
        return new JAXBElement<ObtenerFacturaPDFResponseType>(_ObtenerFacturaPDFResponse_QNAME,
                                                              ObtenerFacturaPDFResponseType.class, null, value);
    }

}
