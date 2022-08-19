
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultacambiospenmodulos.types;

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
 *         &lt;element name="resultato" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resultadodesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CambiosPendientes" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "resultato", "resultadodesc", "cambiosPendientes" })
@XmlRootElement(name = "ConsultaCambiosPendientesModulosProcessResponse")
public class ConsultaCambiosPendientesModulosProcessResponse {

    @XmlElement(required = true)
    protected String resultato;
    @XmlElement(required = true)
    protected String resultadodesc;
    @XmlElement(name = "CambiosPendientes", required = true)
    protected String cambiosPendientes;

    /**
     * Gets the value of the resultato property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResultato() {
        return resultato;
    }

    /**
     * Sets the value of the resultato property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResultato(String value) {
        this.resultato = value;
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
     * Gets the value of the cambiosPendientes property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCambiosPendientes() {
        return cambiosPendientes;
    }

    /**
     * Sets the value of the cambiosPendientes property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCambiosPendientes(String value) {
        this.cambiosPendientes = value;
    }

}
