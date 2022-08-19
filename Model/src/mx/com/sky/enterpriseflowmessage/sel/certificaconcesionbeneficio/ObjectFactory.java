
package mx.com.sky.enterpriseflowmessage.sel.certificaconcesionbeneficio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseflowmessage.sel.certificaconcesionbeneficio package.
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

    private final static QName _CertificaConcesionBeneficioRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseFlowMessage/Sel/CertificaConcesionBeneficio",
                  "CertificaConcesionBeneficioRequestEBM");
    private final static QName _CertificaConcesionBeneficioResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseFlowMessage/Sel/CertificaConcesionBeneficio",
                  "CertificaConcesionBeneficioResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseflowmessage.sel.certificaconcesionbeneficio
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CertificaConcesionBeneficioRequestEBMType }
     *
     */
    public CertificaConcesionBeneficioRequestEBMType createCertificaConcesionBeneficioRequestEBMType() {
        return new CertificaConcesionBeneficioRequestEBMType();
    }

    /**
     * Create an instance of {@link CertificaConcesionBeneficioResponseEBMType }
     *
     */
    public CertificaConcesionBeneficioResponseEBMType createCertificaConcesionBeneficioResponseEBMType() {
        return new CertificaConcesionBeneficioResponseEBMType();
    }

    /**
     * Create an instance of {@link CertificaConcesionBeneficioInputMessageType }
     *
     */
    public CertificaConcesionBeneficioInputMessageType createCertificaConcesionBeneficioInputMessageType() {
        return new CertificaConcesionBeneficioInputMessageType();
    }

    /**
     * Create an instance of {@link CertificaConcesionBeneficioOutputMessageType }
     *
     */
    public CertificaConcesionBeneficioOutputMessageType createCertificaConcesionBeneficioOutputMessageType() {
        return new CertificaConcesionBeneficioOutputMessageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificaConcesionBeneficioRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseFlowMessage/Sel/CertificaConcesionBeneficio",
                    name = "CertificaConcesionBeneficioRequestEBM")
    public JAXBElement<CertificaConcesionBeneficioRequestEBMType> createCertificaConcesionBeneficioRequestEBM(CertificaConcesionBeneficioRequestEBMType value) {
        return new JAXBElement<CertificaConcesionBeneficioRequestEBMType>(_CertificaConcesionBeneficioRequestEBM_QNAME,
                                                                          CertificaConcesionBeneficioRequestEBMType.class,
                                                                          null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificaConcesionBeneficioResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/EnterpriseFlowMessage/Sel/CertificaConcesionBeneficio",
                    name = "CertificaConcesionBeneficioResponseEBM")
    public JAXBElement<CertificaConcesionBeneficioResponseEBMType> createCertificaConcesionBeneficioResponseEBM(CertificaConcesionBeneficioResponseEBMType value) {
        return new JAXBElement<CertificaConcesionBeneficioResponseEBMType>(_CertificaConcesionBeneficioResponseEBM_QNAME,
                                                                           CertificaConcesionBeneficioResponseEBMType.class,
                                                                           null, value);
    }

}
