
package mx.com.sky.sel.proxyclients.soainterface.consultaestadocuenta.types;

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
 * &lt;complexType name="EBMType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/>
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EBMType", propOrder = {
    "ebmHeaderRequest",
    "ebmHeaderResponse"
})
public class EBMType {

    @XmlElement(name = "EBMHeaderRequest", required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "EBMHeaderResponse", required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;

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
