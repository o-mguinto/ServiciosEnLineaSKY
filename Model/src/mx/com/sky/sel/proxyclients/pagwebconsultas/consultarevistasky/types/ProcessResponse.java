
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultarevistasky.types;

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
 *         &lt;element name="Revista_SKY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Clase_De_Cuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Status_Cuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "resultado", "resultadodesc", "revistaSKY", "claseDeCuenta", "statusCuenta" })
@XmlRootElement(name = "processResponse")
public class ProcessResponse {

    @XmlElement(required = true)
    protected String resultado;
    @XmlElement(required = true)
    protected String resultadodesc;
    @XmlElement(name = "Revista_SKY", required = true)
    protected String revistaSKY;
    @XmlElement(name = "Clase_De_Cuenta", required = true)
    protected String claseDeCuenta;
    @XmlElement(name = "Status_Cuenta", required = true)
    protected String statusCuenta;

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
     * Gets the value of the revistaSKY property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRevistaSKY() {
        return revistaSKY;
    }

    /**
     * Sets the value of the revistaSKY property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRevistaSKY(String value) {
        this.revistaSKY = value;
    }

    /**
     * Gets the value of the claseDeCuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getClaseDeCuenta() {
        return claseDeCuenta;
    }

    /**
     * Sets the value of the claseDeCuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setClaseDeCuenta(String value) {
        this.claseDeCuenta = value;
    }

    /**
     * Gets the value of the statusCuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatusCuenta() {
        return statusCuenta;
    }

    /**
     * Sets the value of the statusCuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatusCuenta(String value) {
        this.statusCuenta = value;
    }

}
