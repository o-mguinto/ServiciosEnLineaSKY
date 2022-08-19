
package mx.com.sky.enterpriseflowmessage.sel.certificaconcesionbeneficio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderResponseType;


/**
 * <p>Java class for CertificaConcesionBeneficioResponseEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CertificaConcesionBeneficioResponseEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/&gt;
 *         &lt;element name="CertificaConcesionBeneficioOutputMessage" type="{http://www.sky.com.mx/EnterpriseFlowMessage/Sel/CertificaConcesionBeneficio}CertificaConcesionBeneficioOutputMessageType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificaConcesionBeneficioResponseEBMType",
         propOrder = { "ebmHeaderResponse", "certificaConcesionBeneficioOutputMessage" })
public class CertificaConcesionBeneficioResponseEBMType {

    @XmlElement(name = "EBMHeaderResponse", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "CertificaConcesionBeneficioOutputMessage", required = true)
    protected CertificaConcesionBeneficioOutputMessageType certificaConcesionBeneficioOutputMessage;

    /**
     * Gets the value of the ebmHeaderResponse property.
     *
     * @return
     *     possible object is
     *     {@link EBMHeaderResponseType }
     *
     */
    public EBMHeaderResponseType getEBMHeaderResponse() {
        return ebmHeaderResponse;
    }

    /**
     * Sets the value of the ebmHeaderResponse property.
     *
     * @param value
     *     allowed object is
     *     {@link EBMHeaderResponseType }
     *
     */
    public void setEBMHeaderResponse(EBMHeaderResponseType value) {
        this.ebmHeaderResponse = value;
    }

    /**
     * Gets the value of the certificaConcesionBeneficioOutputMessage property.
     *
     * @return
     *     possible object is
     *     {@link CertificaConcesionBeneficioOutputMessageType }
     *
     */
    public CertificaConcesionBeneficioOutputMessageType getCertificaConcesionBeneficioOutputMessage() {
        return certificaConcesionBeneficioOutputMessage;
    }

    /**
     * Sets the value of the certificaConcesionBeneficioOutputMessage property.
     *
     * @param value
     *     allowed object is
     *     {@link CertificaConcesionBeneficioOutputMessageType }
     *
     */
    public void setCertificaConcesionBeneficioOutputMessage(CertificaConcesionBeneficioOutputMessageType value) {
        this.certificaConcesionBeneficioOutputMessage = value;
    }

}
