
package mx.com.sky.enterpriseflowmessage.sel.crearregistro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;


/**
 * <p>Java class for CrearRegistroSelRequestType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CrearRegistroSelRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/&gt;
 *         &lt;element name="CrearRegistroSelInputMessage" type="{http://www.sky.com.mx/EnterpriseFlowMessage/Sel/CrearRegistro}CrearRegistroSelInputMessageType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrearRegistroSelRequestType", propOrder = { "ebmHeaderRequest", "crearRegistroSelInputMessage" })
public class CrearRegistroSelRequestType {

    @XmlElement(name = "EBMHeaderRequest", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "CrearRegistroSelInputMessage", required = true)
    protected CrearRegistroSelInputMessageType crearRegistroSelInputMessage;

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
     * Gets the value of the crearRegistroSelInputMessage property.
     *
     * @return
     *     possible object is
     *     {@link CrearRegistroSelInputMessageType }
     *
     */
    public CrearRegistroSelInputMessageType getCrearRegistroSelInputMessage() {
        return crearRegistroSelInputMessage;
    }

    /**
     * Sets the value of the crearRegistroSelInputMessage property.
     *
     * @param value
     *     allowed object is
     *     {@link CrearRegistroSelInputMessageType }
     *
     */
    public void setCrearRegistroSelInputMessage(CrearRegistroSelInputMessageType value) {
        this.crearRegistroSelInputMessage = value;
    }

}
