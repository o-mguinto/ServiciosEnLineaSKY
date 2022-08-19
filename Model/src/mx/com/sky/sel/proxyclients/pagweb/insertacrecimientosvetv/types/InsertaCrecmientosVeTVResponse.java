
package mx.com.sky.sel.proxyclients.pagweb.insertacrecimientosvetv.types;

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
 *         &lt;element name="sr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codigoError" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descError" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "sr", "codigoError", "descError" })
@XmlRootElement(name = "insertaCrecmientosVeTVResponse")
public class InsertaCrecmientosVeTVResponse {

    @XmlElement(required = true)
    protected String sr;
    @XmlElement(required = true)
    protected String codigoError;
    @XmlElement(required = true, nillable = true)
    protected String descError;

    /**
     * Gets the value of the sr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSr() {
        return sr;
    }

    /**
     * Sets the value of the sr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSr(String value) {
        this.sr = value;
    }

    /**
     * Gets the value of the codigoError property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoError() {
        return codigoError;
    }

    /**
     * Sets the value of the codigoError property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoError(String value) {
        this.codigoError = value;
    }

    /**
     * Gets the value of the descError property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescError() {
        return descError;
    }

    /**
     * Sets the value of the descError property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescError(String value) {
        this.descError = value;
    }

}
