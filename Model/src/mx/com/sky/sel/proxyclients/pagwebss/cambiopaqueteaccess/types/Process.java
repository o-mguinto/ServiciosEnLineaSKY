
package mx.com.sky.sel.proxyclients.pagwebss.cambiopaqueteaccess.types;

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
 *         &lt;element name="Account" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Desc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SRArea" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SRClasificacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SRSubClasificacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SRDetalle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Sistema" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",
         propOrder = { "account", "desc", "srArea", "srClasificacion", "srSubClasificacion", "srDetalle", "sistema" })
@XmlRootElement(name = "process")
public class Process {

    @XmlElement(name = "Account", required = true)
    protected String account;
    @XmlElement(name = "Desc", required = true)
    protected String desc;
    @XmlElement(name = "SRArea", required = true)
    protected String srArea;
    @XmlElement(name = "SRClasificacion", required = true)
    protected String srClasificacion;
    @XmlElement(name = "SRSubClasificacion", required = true)
    protected String srSubClasificacion;
    @XmlElement(name = "SRDetalle", required = true)
    protected String srDetalle;
    @XmlElement(name = "Sistema", required = true)
    protected String sistema;

    /**
     * Gets the value of the account property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the desc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the srArea property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSRArea() {
        return srArea;
    }

    /**
     * Sets the value of the srArea property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSRArea(String value) {
        this.srArea = value;
    }

    /**
     * Gets the value of the srClasificacion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSRClasificacion() {
        return srClasificacion;
    }

    /**
     * Sets the value of the srClasificacion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSRClasificacion(String value) {
        this.srClasificacion = value;
    }

    /**
     * Gets the value of the srSubClasificacion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSRSubClasificacion() {
        return srSubClasificacion;
    }

    /**
     * Sets the value of the srSubClasificacion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSRSubClasificacion(String value) {
        this.srSubClasificacion = value;
    }

    /**
     * Gets the value of the srDetalle property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSRDetalle() {
        return srDetalle;
    }

    /**
     * Sets the value of the srDetalle property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSRDetalle(String value) {
        this.srDetalle = value;
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

}
