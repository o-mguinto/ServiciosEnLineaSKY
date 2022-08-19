
package mx.com.sky.enterpriseobjects.sec.common.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="EBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sec/Common/V1}EBMHeader"/&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sec/Common/V1}EBMHeaderResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EBMType", propOrder = { "ebmHeader", "ebmHeaderResponse" })
public class EBMType {

    @XmlElement(name = "EBMHeader", required = true)
    protected EBMHeaderType ebmHeader;
    @XmlElement(name = "EBMHeaderResponse", required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;

    /**
     * Gets the value of the ebmHeader property.
     *
     * @return
     *     possible object is
     *     {@link EBMHeaderType }
     *
     */
    public EBMHeaderType getEBMHeader() {
        return ebmHeader;
    }

    /**
     * Sets the value of the ebmHeader property.
     *
     * @param value
     *     allowed object is
     *     {@link EBMHeaderType }
     *
     */
    public void setEBMHeader(EBMHeaderType value) {
        this.ebmHeader = value;
    }

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

}
