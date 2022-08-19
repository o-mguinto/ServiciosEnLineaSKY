
package mx.com.sky.enterpriseflowmessage.sel.certificaconcesionbeneficio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;


/**
 * <p>Java class for CertificaConcesionBeneficioRequestEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CertificaConcesionBeneficioRequestEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/&gt;
 *         &lt;element name="CertificaConcesionBeneficioInputMessage" type="{http://www.sky.com.mx/EnterpriseFlowMessage/Sel/CertificaConcesionBeneficio}CertificaConcesionBeneficioInputMessageType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificaConcesionBeneficioRequestEBMType",
         propOrder = { "ebmHeaderRequest", "certificaConcesionBeneficioInputMessage" })
public class CertificaConcesionBeneficioRequestEBMType {

    @XmlElement(name = "EBMHeaderRequest", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "CertificaConcesionBeneficioInputMessage", required = true)
    protected CertificaConcesionBeneficioInputMessageType certificaConcesionBeneficioInputMessage;

    /**
     * Gets the value of the ebmHeaderRequest property.
     *
     * @return
     *     possible object is
     *     {@link EBMHeaderRequestType }
     *
     */
    public EBMHeaderRequestType getEBMHeaderRequest() {
        return ebmHeaderRequest;
    }

    /**
     * Sets the value of the ebmHeaderRequest property.
     *
     * @param value
     *     allowed object is
     *     {@link EBMHeaderRequestType }
     *
     */
    public void setEBMHeaderRequest(EBMHeaderRequestType value) {
        this.ebmHeaderRequest = value;
    }

    /**
     * Gets the value of the certificaConcesionBeneficioInputMessage property.
     *
     * @return
     *     possible object is
     *     {@link CertificaConcesionBeneficioInputMessageType }
     *
     */
    public CertificaConcesionBeneficioInputMessageType getCertificaConcesionBeneficioInputMessage() {
        return certificaConcesionBeneficioInputMessage;
    }

    /**
     * Sets the value of the certificaConcesionBeneficioInputMessage property.
     *
     * @param value
     *     allowed object is
     *     {@link CertificaConcesionBeneficioInputMessageType }
     *
     */
    public void setCertificaConcesionBeneficioInputMessage(CertificaConcesionBeneficioInputMessageType value) {
        this.certificaConcesionBeneficioInputMessage = value;
    }

}
