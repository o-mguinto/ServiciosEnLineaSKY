
package mx.com.sky.sel.proxyclients.pagweb.admintarjetapago.types;

import java.math.BigDecimal;

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
 *         &lt;element name="TipoConsulta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ccName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ccNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ccType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="expYear" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="expMonth" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ccCd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrgId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
         propOrder =
         { "tipoConsulta", "id", "ccName", "ccNumber", "ccType", "expYear", "expMonth", "userId", "ccCd", "orgId"
    })
@XmlRootElement(name = "process")
public class Process {

    @XmlElement(name = "TipoConsulta", required = true)
    protected String tipoConsulta;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal id;
    @XmlElement(required = true)
    protected String ccName;
    @XmlElement(required = true)
    protected String ccNumber;
    @XmlElement(required = true)
    protected String ccType;
    @XmlElement(required = true)
    protected String expYear;
    @XmlElement(required = true)
    protected String expMonth;
    @XmlElement(required = true)
    protected String userId;
    @XmlElement(required = true)
    protected String ccCd;
    @XmlElement(name = "OrgId", required = true)
    protected String orgId;

    /**
     * Gets the value of the tipoConsulta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoConsulta() {
        return tipoConsulta;
    }

    /**
     * Sets the value of the tipoConsulta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoConsulta(String value) {
        this.tipoConsulta = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setId(BigDecimal value) {
        this.id = value;
    }

    /**
     * Gets the value of the ccName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCcName() {
        return ccName;
    }

    /**
     * Sets the value of the ccName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCcName(String value) {
        this.ccName = value;
    }

    /**
     * Gets the value of the ccNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCcNumber() {
        return ccNumber;
    }

    /**
     * Sets the value of the ccNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCcNumber(String value) {
        this.ccNumber = value;
    }

    /**
     * Gets the value of the ccType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCcType() {
        return ccType;
    }

    /**
     * Sets the value of the ccType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCcType(String value) {
        this.ccType = value;
    }

    /**
     * Gets the value of the expYear property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExpYear() {
        return expYear;
    }

    /**
     * Sets the value of the expYear property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExpYear(String value) {
        this.expYear = value;
    }

    /**
     * Gets the value of the expMonth property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExpMonth() {
        return expMonth;
    }

    /**
     * Sets the value of the expMonth property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExpMonth(String value) {
        this.expMonth = value;
    }

    /**
     * Gets the value of the userId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the ccCd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCcCd() {
        return ccCd;
    }

    /**
     * Sets the value of the ccCd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCcCd(String value) {
        this.ccCd = value;
    }

    /**
     * Gets the value of the orgId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrgId(String value) {
        this.orgId = value;
    }

}
