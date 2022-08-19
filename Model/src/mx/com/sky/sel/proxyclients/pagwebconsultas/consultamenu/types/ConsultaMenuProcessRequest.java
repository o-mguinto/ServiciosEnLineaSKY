
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultamenu.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="USER_UID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VISIBLE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OPERACION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TIPO_CUENTA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PAIS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "useruid", "visible", "operacion", "tipocuenta", "pais" })
@XmlRootElement(name = "ConsultaMenuProcessRequest")
public class ConsultaMenuProcessRequest {

    @XmlElement(name = "USER_UID", required = true)
    protected String useruid;
    @XmlElement(name = "VISIBLE", required = true)
    protected String visible;
    @XmlElement(name = "OPERACION", required = true)
    protected String operacion;
    @XmlElement(name = "TIPO_CUENTA", required = true)
    protected String tipocuenta;
    @XmlElement(name = "PAIS", required = true)
    protected String pais;

    /**
     * Gets the value of the useruid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUSERUID() {
        return useruid;
    }

    /**
     * Sets the value of the useruid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUSERUID(String value) {
        this.useruid = value;
    }

    /**
     * Gets the value of the visible property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVISIBLE() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVISIBLE(String value) {
        this.visible = value;
    }

    /**
     * Gets the value of the operacion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOPERACION() {
        return operacion;
    }

    /**
     * Sets the value of the operacion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOPERACION(String value) {
        this.operacion = value;
    }

    /**
     * Gets the value of the tipocuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTIPOCUENTA() {
        return tipocuenta;
    }

    /**
     * Sets the value of the tipocuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTIPOCUENTA(String value) {
        this.tipocuenta = value;
    }

    /**
     * Gets the value of the pais property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPAIS() {
        return pais;
    }

    /**
     * Sets the value of the pais property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPAIS(String value) {
        this.pais = value;
    }

}
