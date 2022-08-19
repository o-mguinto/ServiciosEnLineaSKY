
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultapreciopaquete.types;

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
 *         &lt;element name="paquete" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="paisISO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sistema" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CuentaSKY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "paquete", "paisISO", "sistema", "cuentaSKY" })
@XmlRootElement(name = "process",
                namespace = "http://xmlns.oracle.com/SKYConsultas/ConsultaPaquete/ConsultaPrecioPaquete")
public class Process {

    @XmlElement(namespace = "http://xmlns.oracle.com/SKYConsultas/ConsultaPaquete/ConsultaPrecioPaquete",
                required = true)
    protected String paquete;
    @XmlElement(namespace = "http://xmlns.oracle.com/SKYConsultas/ConsultaPaquete/ConsultaPrecioPaquete",
                required = true)
    protected String paisISO;
    @XmlElement(namespace = "http://xmlns.oracle.com/SKYConsultas/ConsultaPaquete/ConsultaPrecioPaquete",
                required = true)
    protected String sistema;
    @XmlElement(name = "CuentaSKY",
                namespace = "http://xmlns.oracle.com/SKYConsultas/ConsultaPaquete/ConsultaPrecioPaquete",
                required = true)
    protected String cuentaSKY;

    /**
     * Gets the value of the paquete property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaquete() {
        return paquete;
    }

    /**
     * Sets the value of the paquete property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaquete(String value) {
        this.paquete = value;
    }

    /**
     * Gets the value of the paisISO property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaisISO() {
        return paisISO;
    }

    /**
     * Sets the value of the paisISO property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaisISO(String value) {
        this.paisISO = value;
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

}
