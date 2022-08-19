
package mx.com.sky.siebelosb.creasolicitudservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cabecera_Salida_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Cabecera_Salida_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="COD_ERROR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MSG_ERROR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cabecera_Salida_TYPE", propOrder = { "coderror", "msgerror" })
public class CabeceraSalidaTYPE {

    @XmlElement(name = "COD_ERROR", required = true)
    protected String coderror;
    @XmlElement(name = "MSG_ERROR", required = true)
    protected String msgerror;

    /**
     * Gets the value of the coderror property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCODERROR() {
        return coderror;
    }

    /**
     * Sets the value of the coderror property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCODERROR(String value) {
        this.coderror = value;
    }

    /**
     * Gets the value of the msgerror property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMSGERROR() {
        return msgerror;
    }

    /**
     * Sets the value of the msgerror property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMSGERROR(String value) {
        this.msgerror = value;
    }

}
