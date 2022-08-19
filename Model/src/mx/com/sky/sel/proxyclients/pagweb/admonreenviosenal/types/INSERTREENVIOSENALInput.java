
package mx.com.sky.sel.proxyclients.pagweb.admonreenviosenal.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INSERT_REENVIO_SENALInput complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="INSERT_REENVIO_SENALInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="USER_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CUENTA_SKY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PAQUETE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PAIS_ISO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INSERT_REENVIO_SENALInput", propOrder = { "userid", "cuentasky", "ti", "paquete", "paisiso" })
public class INSERTREENVIOSENALInput {

    @XmlElement(name = "USER_ID", required = true, nillable = true)
    protected String userid;
    @XmlElement(name = "CUENTA_SKY", required = true, nillable = true)
    protected String cuentasky;
    @XmlElement(name = "TI", required = true, nillable = true)
    protected String ti;
    @XmlElement(name = "PAQUETE", required = true, nillable = true)
    protected String paquete;
    @XmlElement(name = "PAIS_ISO", required = true, nillable = true)
    protected String paisiso;

    /**
     * Gets the value of the userid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUSERID() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUSERID(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the cuentasky property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCUENTASKY() {
        return cuentasky;
    }

    /**
     * Sets the value of the cuentasky property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCUENTASKY(String value) {
        this.cuentasky = value;
    }

    /**
     * Gets the value of the ti property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTI() {
        return ti;
    }

    /**
     * Sets the value of the ti property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTI(String value) {
        this.ti = value;
    }

    /**
     * Gets the value of the paquete property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPAQUETE() {
        return paquete;
    }

    /**
     * Sets the value of the paquete property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPAQUETE(String value) {
        this.paquete = value;
    }

    /**
     * Gets the value of the paisiso property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPAISISO() {
        return paisiso;
    }

    /**
     * Sets the value of the paisiso property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPAISISO(String value) {
        this.paisiso = value;
    }

}
