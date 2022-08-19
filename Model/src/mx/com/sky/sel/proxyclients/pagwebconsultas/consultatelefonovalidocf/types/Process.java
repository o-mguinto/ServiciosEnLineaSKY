
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultatelefonovalidocf.types;

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
 *         &lt;element name="lada" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "lada", "telefono" })
@XmlRootElement(name = "process")
public class Process {

    @XmlElement(required = true)
    protected String lada;
    @XmlElement(required = true)
    protected String telefono;

    /**
     * Gets the value of the lada property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLada() {
        return lada;
    }

    /**
     * Sets the value of the lada property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLada(String value) {
        this.lada = value;
    }

    /**
     * Gets the value of the telefono property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Sets the value of the telefono property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

}
