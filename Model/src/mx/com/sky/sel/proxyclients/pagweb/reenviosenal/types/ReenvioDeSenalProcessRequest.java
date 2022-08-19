
package mx.com.sky.sel.proxyclients.pagweb.reenviosenal.types;

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
 *         &lt;element name="CuentaSKY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RowIdCuentaSKY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sistema" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="origen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idSesion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "cuentaSKY", "rowIdCuentaSKY", "sistema", "origen", "idSesion" })
@XmlRootElement(name = "ReenvioDeSenalProcessRequest")
public class ReenvioDeSenalProcessRequest {

    @XmlElement(name = "CuentaSKY", required = true)
    protected String cuentaSKY;
    @XmlElement(name = "RowIdCuentaSKY", required = true)
    protected String rowIdCuentaSKY;
    @XmlElement(required = true)
    protected String sistema;
    @XmlElement(required = true)
    protected String origen;
    @XmlElement(required = true)
    protected String idSesion;

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
     * Gets the value of the rowIdCuentaSKY property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRowIdCuentaSKY() {
        return rowIdCuentaSKY;
    }

    /**
     * Sets the value of the rowIdCuentaSKY property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRowIdCuentaSKY(String value) {
        this.rowIdCuentaSKY = value;
    }

    /**
     * Gets the value of the sistema property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSistema() {
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
    public void setSistema(String value) {
        this.sistema = value;
    }

    /**
     * Gets the value of the origen property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Sets the value of the origen property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrigen(String value) {
        this.origen = value;
    }

    /**
     * Gets the value of the idSesion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdSesion() {
        return idSesion;
    }

    /**
     * Sets the value of the idSesion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdSesion(String value) {
        this.idSesion = value;
    }

}
