
package mx.com.sky.sel.proxyclients.pagweb.consultaldap.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for auxType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="auxType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mensajeBD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mensajeCompleto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="asunto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auxType", namespace = "http://www.sky.com.mx/email/notificacion",
         propOrder = { "mensajeBD", "mensajeCompleto", "asunto"
    })
public class AuxType {

    @XmlElement(required = true)
    protected String mensajeBD;
    @XmlElement(required = true)
    protected String mensajeCompleto;
    @XmlElement(required = true)
    protected String asunto;

    /**
     * Gets the value of the mensajeBD property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMensajeBD() {
        return mensajeBD;
    }

    /**
     * Sets the value of the mensajeBD property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMensajeBD(String value) {
        this.mensajeBD = value;
    }

    /**
     * Gets the value of the mensajeCompleto property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMensajeCompleto() {
        return mensajeCompleto;
    }

    /**
     * Sets the value of the mensajeCompleto property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMensajeCompleto(String value) {
        this.mensajeCompleto = value;
    }

    /**
     * Gets the value of the asunto property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAsunto() {
        return asunto;
    }

    /**
     * Sets the value of the asunto property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAsunto(String value) {
        this.asunto = value;
    }

}
