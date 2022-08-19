
package mx.com.sky.enterpriseflowmessage.sel.modificarpasswordregistro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;


/**
 * <p>Java class for ModificarPasswordRegistroRequestEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ModificarPasswordRegistroRequestEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/&gt;
 *         &lt;element name="ModificarPasswordRegistroInputMessage" type="{http://www.sky.com.mx/EnterpriseFlowMessage/Sel/ModificarPasswordRegistro}ModificarPasswordRegistroInputMessageType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModificarPasswordRegistroRequestEBMType",
         propOrder = { "ebmHeaderRequest", "modificarPasswordRegistroInputMessage" })
public class ModificarPasswordRegistroRequestEBMType {

    @XmlElement(name = "EBMHeaderRequest", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "ModificarPasswordRegistroInputMessage", required = true)
    protected ModificarPasswordRegistroInputMessageType modificarPasswordRegistroInputMessage;

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
     * Gets the value of the modificarPasswordRegistroInputMessage property.
     *
     * @return
     *     possible object is
     *     {@link ModificarPasswordRegistroInputMessageType }
     *
     */
    public ModificarPasswordRegistroInputMessageType getModificarPasswordRegistroInputMessage() {
        return modificarPasswordRegistroInputMessage;
    }

    /**
     * Sets the value of the modificarPasswordRegistroInputMessage property.
     *
     * @param value
     *     allowed object is
     *     {@link ModificarPasswordRegistroInputMessageType }
     *
     */
    public void setModificarPasswordRegistroInputMessage(ModificarPasswordRegistroInputMessageType value) {
        this.modificarPasswordRegistroInputMessage = value;
    }

}
