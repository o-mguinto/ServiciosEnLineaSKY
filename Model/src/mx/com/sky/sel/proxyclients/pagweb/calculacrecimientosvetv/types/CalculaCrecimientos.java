
package mx.com.sky.sel.proxyclients.pagweb.calculacrecimientosvetv.types;

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
 *         &lt;element name="cuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="phd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hmc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechaPago" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="paquete" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "cuenta", "sd", "hd", "phd", "hmc", "fechaPago", "paquete" })
@XmlRootElement(name = "calculaCrecimientos")
public class CalculaCrecimientos {

    @XmlElement(required = true)
    protected String cuenta;
    @XmlElement(required = true)
    protected String sd;
    @XmlElement(required = true)
    protected String hd;
    @XmlElement(required = true)
    protected String phd;
    @XmlElement(required = true)
    protected String hmc;
    @XmlElement(required = true)
    protected String fechaPago;
    @XmlElement(required = true)
    protected String paquete;

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
     * Gets the value of the sd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSd() {
        return sd;
    }

    /**
     * Sets the value of the sd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSd(String value) {
        this.sd = value;
    }

    /**
     * Gets the value of the hd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHd() {
        return hd;
    }

    /**
     * Sets the value of the hd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHd(String value) {
        this.hd = value;
    }

    /**
     * Gets the value of the phd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPhd() {
        return phd;
    }

    /**
     * Sets the value of the phd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPhd(String value) {
        this.phd = value;
    }

    /**
     * Gets the value of the hmc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHmc() {
        return hmc;
    }

    /**
     * Sets the value of the hmc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHmc(String value) {
        this.hmc = value;
    }

    /**
     * Gets the value of the fechaPago property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaPago() {
        return fechaPago;
    }

    /**
     * Sets the value of the fechaPago property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaPago(String value) {
        this.fechaPago = value;
    }

    /**
     * Gets the value of the paquete property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaquete() {
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
    public void setPaquete(String value) {
        this.paquete = value;
    }

}
