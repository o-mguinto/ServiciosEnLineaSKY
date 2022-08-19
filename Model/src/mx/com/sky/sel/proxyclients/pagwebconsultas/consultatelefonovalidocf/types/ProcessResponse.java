
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
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resultadodesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Valido" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Modalidad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "resultado", "resultadodesc", "valido", "modalidad" })
@XmlRootElement(name = "processResponse")
public class ProcessResponse {

    @XmlElement(required = true)
    protected String resultado;
    @XmlElement(required = true)
    protected String resultadodesc;
    @XmlElement(name = "Valido", required = true)
    protected String valido;
    @XmlElement(name = "Modalidad", required = true)
    protected String modalidad;

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
     * Gets the value of the resultadodesc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResultadodesc() {
        return resultadodesc;
    }

    /**
     * Sets the value of the resultadodesc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResultadodesc(String value) {
        this.resultadodesc = value;
    }

    /**
     * Gets the value of the valido property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValido() {
        return valido;
    }

    /**
     * Sets the value of the valido property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValido(String value) {
        this.valido = value;
    }

    /**
     * Gets the value of the modalidad property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getModalidad() {
        return modalidad;
    }

    /**
     * Sets the value of the modalidad property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setModalidad(String value) {
        this.modalidad = value;
    }

}
