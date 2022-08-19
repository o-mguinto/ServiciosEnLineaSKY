
package mx.com.sky.enterpriseflowmessage.sel.reenviaremailpreregsel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;


/**
 * <p>Java class for ReEnviarEmailPreRegSelRequestEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ReEnviarEmailPreRegSelRequestEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/&gt;
 *         &lt;element name="ReEnviarEmailPreRegSelInputMessage" type="{http://www.sky.com.mx/EnterpriseFlowMessage/Sel/ReEnviarEmailPreRegSel}ReEnviarEmailPreRegSelInputMessageType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReEnviarEmailPreRegSelRequestEBMType",
         propOrder = { "ebmHeaderRequest", "reEnviarEmailPreRegSelInputMessage" })
public class ReEnviarEmailPreRegSelRequestEBMType {

    @XmlElement(name = "EBMHeaderRequest", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "ReEnviarEmailPreRegSelInputMessage", required = true)
    protected ReEnviarEmailPreRegSelInputMessageType reEnviarEmailPreRegSelInputMessage;

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
     * Gets the value of the reEnviarEmailPreRegSelInputMessage property.
     *
     * @return
     *     possible object is
     *     {@link ReEnviarEmailPreRegSelInputMessageType }
     *
     */
    public ReEnviarEmailPreRegSelInputMessageType getReEnviarEmailPreRegSelInputMessage() {
        return reEnviarEmailPreRegSelInputMessage;
    }

    /**
     * Sets the value of the reEnviarEmailPreRegSelInputMessage property.
     *
     * @param value
     *     allowed object is
     *     {@link ReEnviarEmailPreRegSelInputMessageType }
     *
     */
    public void setReEnviarEmailPreRegSelInputMessage(ReEnviarEmailPreRegSelInputMessageType value) {
        this.reEnviarEmailPreRegSelInputMessage = value;
    }

}
