
package mx.com.sky.enterpriseflowmessage.sel.autenticarusuario;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutenticarUsuarioInputMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AutenticarUsuarioInputMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Correo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutenticarUsuarioInputMessageType", propOrder = { "correo", "password" })
public class AutenticarUsuarioInputMessageType {

    @XmlElement(name = "Correo", required = true)
    protected String correo;
    @XmlElement(name = "Password", required = true)
    protected String password;

    /**
     * Gets the value of the correo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Sets the value of the correo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCorreo(String value) {
        this.correo = value;
    }

    /**
     * Gets the value of the password property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPassword(String value) {
        this.password = value;
    }

}
