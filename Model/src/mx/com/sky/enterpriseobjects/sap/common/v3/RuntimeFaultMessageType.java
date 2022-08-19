
package mx.com.sky.enterpriseobjects.sap.common.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RuntimeFaultMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RuntimeFaultMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="detail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sistema" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuntimeFaultMessageType", propOrder = { "code", "summary", "detail", "sistema" })
public class RuntimeFaultMessageType {

    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    protected String summary;
    @XmlElement(required = true)
    protected String detail;
    @XmlElement(required = true)
    protected String sistema;

    /**
     * Gets the value of the code property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the summary property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Gets the value of the detail property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDetail(String value) {
        this.detail = value;
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
