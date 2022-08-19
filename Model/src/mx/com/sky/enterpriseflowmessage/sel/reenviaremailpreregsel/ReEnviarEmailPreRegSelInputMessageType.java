
package mx.com.sky.enterpriseflowmessage.sel.reenviaremailpreregsel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReEnviarEmailPreRegSelInputMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ReEnviarEmailPreRegSelInputMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Servicio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReEnviarEmailPreRegSelInputMessageType", propOrder = { "email", "servicio" })
public class ReEnviarEmailPreRegSelInputMessageType {

    @XmlElement(name = "Email", required = true)
    protected String email;
    @XmlElement(name = "Servicio", required = true)
    protected String servicio;

    /**
     * Gets the value of the email property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the servicio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getServicio() {
        return servicio;
    }

    /**
     * Sets the value of the servicio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setServicio(String value) {
        this.servicio = value;
    }

}
