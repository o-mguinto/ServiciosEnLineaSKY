
package mx.com.sky.enterpriseflowmessage.sel.autenticarusuario;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;


/**
 * <p>Java class for AutenticarUsuarioRequestEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AutenticarUsuarioRequestEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/&gt;
 *         &lt;element name="AutenticarUsuarioInputMessage" type="{http://www.sky.com.mx/EnterpriseFlowMessage/Sel/AutenticarUsuario}AutenticarUsuarioInputMessageType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutenticarUsuarioRequestEBMType", propOrder = { "ebmHeaderRequest", "autenticarUsuarioInputMessage" })
public class AutenticarUsuarioRequestEBMType {

    @XmlElement(name = "EBMHeaderRequest", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "AutenticarUsuarioInputMessage", required = true)
    protected AutenticarUsuarioInputMessageType autenticarUsuarioInputMessage;

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
     * Gets the value of the autenticarUsuarioInputMessage property.
     *
     * @return
     *     possible object is
     *     {@link AutenticarUsuarioInputMessageType }
     *
     */
    public AutenticarUsuarioInputMessageType getAutenticarUsuarioInputMessage() {
        return autenticarUsuarioInputMessage;
    }

    /**
     * Sets the value of the autenticarUsuarioInputMessage property.
     *
     * @param value
     *     allowed object is
     *     {@link AutenticarUsuarioInputMessageType }
     *
     */
    public void setAutenticarUsuarioInputMessage(AutenticarUsuarioInputMessageType value) {
        this.autenticarUsuarioInputMessage = value;
    }

}
