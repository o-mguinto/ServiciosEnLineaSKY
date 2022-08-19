
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultapreciocanal.types;

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
 *         &lt;element name="numCanal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="paisISO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SISTEMA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ctaSky" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "numCanal", "paisISO", "sistema", "ctaSky", "tipoCuenta" })
@XmlRootElement(name = "process")
public class Process {

    @XmlElement(required = true)
    protected String numCanal;
    @XmlElement(required = true)
    protected String paisISO;
    @XmlElement(name = "SISTEMA", required = true, nillable = true)
    protected String sistema;
    @XmlElement(required = true, nillable = true)
    protected String ctaSky;
    @XmlElement(required = true)
    protected String tipoCuenta;

    /**
     * Gets the value of the numCanal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumCanal() {
        return numCanal;
    }

    /**
     * Sets the value of the numCanal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumCanal(String value) {
        this.numCanal = value;
    }

    /**
     * Gets the value of the paisISO property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaisISO() {
        return paisISO;
    }

    /**
     * Sets the value of the paisISO property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaisISO(String value) {
        this.paisISO = value;
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

    /**
     * Gets the value of the ctaSky property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCtaSky() {
        return ctaSky;
    }

    /**
     * Sets the value of the ctaSky property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCtaSky(String value) {
        this.ctaSky = value;
    }

    /**
     * Gets the value of the tipoCuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    /**
     * Sets the value of the tipoCuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoCuenta(String value) {
        this.tipoCuenta = value;
    }

}
