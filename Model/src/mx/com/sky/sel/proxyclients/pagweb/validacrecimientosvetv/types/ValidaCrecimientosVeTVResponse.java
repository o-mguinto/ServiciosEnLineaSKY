
package mx.com.sky.sel.proxyclients.pagweb.validacrecimientosvetv.types;

import java.math.BigDecimal;

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
 *         &lt;element name="valido" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "", propOrder = { "valido", "precio", "codigoError", "descError" })
@XmlRootElement(name = "validaCrecimientosVeTVResponse")
public class ValidaCrecimientosVeTVResponse {

    @XmlElement(required = true)
    protected BigDecimal valido;
    @XmlElement(required = true)
    protected String precio;
    @XmlElement(required = true)
    protected String codigoError;
    @XmlElement(required = true, nillable = true)
    protected String descError;

    /**
     * Gets the value of the valido property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getValido() {
        return valido;
    }

    /**
     * Sets the value of the valido property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setValido(BigDecimal value) {
        this.valido = value;
    }

    /**
     * Gets the value of the precio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * Sets the value of the precio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPrecio(String value) {
        this.precio = value;
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
