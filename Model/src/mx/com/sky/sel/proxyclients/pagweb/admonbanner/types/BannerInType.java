
package mx.com.sky.sel.proxyclients.pagweb.admonbanner.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BannerInType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="BannerInType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaisISO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Operacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BannerElement" type="{http://xmlns.oracle.com/SKYPortal/AdmonBanner/AdmonBanner}BannerElementType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BannerInType", propOrder = { "paisISO", "operacion", "bannerElement" })
public class BannerInType {

    @XmlElement(name = "PaisISO", required = true)
    protected String paisISO;
    @XmlElement(name = "Operacion", required = true)
    protected String operacion;
    @XmlElement(name = "BannerElement", required = true)
    protected BannerElementType bannerElement;

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
     * Gets the value of the operacion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     * Sets the value of the operacion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOperacion(String value) {
        this.operacion = value;
    }

    /**
     * Gets the value of the bannerElement property.
     *
     * @return
     *     possible object is
     *     {@link BannerElementType }
     *
     */
    public BannerElementType getBannerElement() {
        return bannerElement;
    }

    /**
     * Sets the value of the bannerElement property.
     *
     * @param value
     *     allowed object is
     *     {@link BannerElementType }
     *
     */
    public void setBannerElement(BannerElementType value) {
        this.bannerElement = value;
    }

}
