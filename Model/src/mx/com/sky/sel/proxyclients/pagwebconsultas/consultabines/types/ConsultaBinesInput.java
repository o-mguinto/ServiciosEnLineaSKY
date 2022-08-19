
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultabines.types;

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
 *         &lt;element name="Tarjetas" type="{http://xmlns.oracle.com/ConsultaBines}ConsultaBinesInCollection"/&gt;
 *         &lt;element name="OrgID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "tarjetas", "orgID" })
@XmlRootElement(name = "ConsultaBinesInput")
public class ConsultaBinesInput {

    @XmlElement(name = "Tarjetas", required = true)
    protected ConsultaBinesInCollection tarjetas;
    @XmlElement(name = "OrgID", required = true)
    protected String orgID;

    /**
     * Gets the value of the tarjetas property.
     *
     * @return
     *     possible object is
     *     {@link ConsultaBinesInCollection }
     *
     */
    public ConsultaBinesInCollection getTarjetas() {
        return tarjetas;
    }

    /**
     * Sets the value of the tarjetas property.
     *
     * @param value
     *     allowed object is
     *     {@link ConsultaBinesInCollection }
     *
     */
    public void setTarjetas(ConsultaBinesInCollection value) {
        this.tarjetas = value;
    }

    /**
     * Gets the value of the orgID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrgID() {
        return orgID;
    }

    /**
     * Sets the value of the orgID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrgID(String value) {
        this.orgID = value;
    }

}
