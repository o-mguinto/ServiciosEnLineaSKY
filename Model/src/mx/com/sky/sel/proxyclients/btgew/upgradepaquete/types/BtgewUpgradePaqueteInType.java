
package mx.com.sky.sel.proxyclients.btgew.upgradepaquete.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for btgewUpgradePaqueteInType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="btgewUpgradePaqueteInType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CuentaSKY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nuevoPaquete" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SISTEMA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "btgewUpgradePaqueteInType", propOrder = { "cuentaSKY", "nuevoPaquete", "sistema" })
public class BtgewUpgradePaqueteInType {

    @XmlElement(name = "CuentaSKY", required = true)
    protected String cuentaSKY;
    @XmlElement(required = true)
    protected String nuevoPaquete;
    @XmlElement(name = "SISTEMA", required = true)
    protected String sistema;

    /**
     * Gets the value of the cuentaSKY property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCuentaSKY() {
        return cuentaSKY;
    }

    /**
     * Sets the value of the cuentaSKY property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCuentaSKY(String value) {
        this.cuentaSKY = value;
    }

    /**
     * Gets the value of the nuevoPaquete property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNuevoPaquete() {
        return nuevoPaquete;
    }

    /**
     * Sets the value of the nuevoPaquete property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNuevoPaquete(String value) {
        this.nuevoPaquete = value;
    }

    /**
     * Gets the value of the sistema property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSISTEMA() {
        return sistema;
    }

    /**
     * Sets the value of the sistema property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSISTEMA(String value) {
        this.sistema = value;
    }

}
