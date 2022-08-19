
package mx.com.sky.enterpriseflowmessage.sel.crearregistro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrearRegistroSelInputMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CrearRegistroSelInputMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdPreReg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Telf" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Servicio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrearRegistroSelInputMessageType",
         propOrder = { "idPreReg", "cuenta", "password", "email", "telf", "servicio", "tipo"
    })
public class CrearRegistroSelInputMessageType {

    @XmlElement(name = "IdPreReg", required = true)
    protected String idPreReg;
    @XmlElement(name = "Cuenta", required = true)
    protected String cuenta;
    @XmlElement(name = "Password", required = true)
    protected String password;
    @XmlElement(name = "Email", required = true)
    protected String email;
    @XmlElement(name = "Telf", required = true)
    protected String telf;
    @XmlElement(name = "Servicio", required = true)
    protected String servicio;
    @XmlElement(name = "Tipo", required = true)
    protected String tipo;

    /**
     * Gets the value of the idPreReg property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdPreReg() {
        return idPreReg;
    }

    /**
     * Sets the value of the idPreReg property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdPreReg(String value) {
        this.idPreReg = value;
    }

    /**
     * Gets the value of the cuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Sets the value of the cuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCuenta(String value) {
        this.cuenta = value;
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
     * Gets the value of the telf property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTelf() {
        return telf;
    }

    /**
     * Sets the value of the telf property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTelf(String value) {
        this.telf = value;
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

    /**
     * Gets the value of the tipo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

}
