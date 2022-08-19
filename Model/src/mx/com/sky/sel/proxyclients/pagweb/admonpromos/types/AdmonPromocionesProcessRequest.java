
package mx.com.sky.sel.proxyclients.pagweb.admonpromos.types;

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
 *         &lt;element name="CodOperacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrganizationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VeTV" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Promocion" type="{http://xmlns.oracle.com/AdmonPromociones}Promocion"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "codOperacion", "organizationId", "veTV", "promocion" })
@XmlRootElement(name = "AdmonPromocionesProcessRequest")
public class AdmonPromocionesProcessRequest {

    @XmlElement(name = "CodOperacion", required = true)
    protected String codOperacion;
    @XmlElement(name = "OrganizationId", required = true)
    protected String organizationId;
    @XmlElement(name = "VeTV", required = true)
    protected String veTV;
    @XmlElement(name = "Promocion", required = true)
    protected Promocion promocion;

    /**
     * Gets the value of the codOperacion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodOperacion() {
        return codOperacion;
    }

    /**
     * Sets the value of the codOperacion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodOperacion(String value) {
        this.codOperacion = value;
    }

    /**
     * Gets the value of the organizationId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * Sets the value of the organizationId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrganizationId(String value) {
        this.organizationId = value;
    }

    /**
     * Gets the value of the veTV property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVeTV() {
        return veTV;
    }

    /**
     * Sets the value of the veTV property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVeTV(String value) {
        this.veTV = value;
    }

    /**
     * Gets the value of the promocion property.
     *
     * @return
     *     possible object is
     *     {@link Promocion }
     *
     */
    public Promocion getPromocion() {
        return promocion;
    }

    /**
     * Sets the value of the promocion property.
     *
     * @param value
     *     allowed object is
     *     {@link Promocion }
     *
     */
    public void setPromocion(Promocion value) {
        this.promocion = value;
    }

}
