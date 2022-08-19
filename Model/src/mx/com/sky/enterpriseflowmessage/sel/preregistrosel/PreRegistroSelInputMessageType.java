
package mx.com.sky.enterpriseflowmessage.sel.preregistrosel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreRegistroSelInputMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PreRegistroSelInputMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NumeroCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NumeroTel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreRegistroSelInputMessageType", propOrder = { "email", "numeroCuenta", "numeroTel" })
public class PreRegistroSelInputMessageType {

    @XmlElement(name = "Email", required = true)
    protected String email;
    @XmlElement(name = "NumeroCuenta", required = true)
    protected String numeroCuenta;
    @XmlElement(name = "NumeroTel", required = true)
    protected String numeroTel;

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
     * Gets the value of the numeroCuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Sets the value of the numeroCuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroCuenta(String value) {
        this.numeroCuenta = value;
    }

    /**
     * Gets the value of the numeroTel property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroTel() {
        return numeroTel;
    }

    /**
     * Sets the value of the numeroTel property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroTel(String value) {
        this.numeroTel = value;
    }

}
