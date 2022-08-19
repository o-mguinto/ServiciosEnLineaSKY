
package mx.com.sky.sel.proxyclients.pagweb.cargaarchivoeventos.types;

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
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descripcionResultado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "resultado", "descripcionResultado" })
@XmlRootElement(name = "processResponse")
public class ProcessResponse {

    @XmlElement(required = true)
    protected String resultado;
    @XmlElement(required = true)
    protected String descripcionResultado;

    /**
     * Gets the value of the resultado property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * Sets the value of the resultado property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResultado(String value) {
        this.resultado = value;
    }

    /**
     * Gets the value of the descripcionResultado property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescripcionResultado() {
        return descripcionResultado;
    }

    /**
     * Sets the value of the descripcionResultado property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescripcionResultado(String value) {
        this.descripcionResultado = value;
    }

}
