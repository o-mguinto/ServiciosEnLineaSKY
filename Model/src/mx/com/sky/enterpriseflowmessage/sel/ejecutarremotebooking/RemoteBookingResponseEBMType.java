
package mx.com.sky.enterpriseflowmessage.sel.ejecutarremotebooking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoteBookingResponseEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RemoteBookingResponseEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SRNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SREstatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SRSubestatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoteBookingResponseEBMType",
         propOrder = { "srNumber", "srEstatus", "srSubestatus"
    })
public class RemoteBookingResponseEBMType {

    @XmlElement(name = "SRNumber", required = true)
    protected String srNumber;
    @XmlElement(name = "SREstatus", required = true)
    protected String srEstatus;
    @XmlElement(name = "SRSubestatus", required = true)
    protected String srSubestatus;

    /**
     * Gets the value of the srNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSRNumber() {
        return srNumber;
    }

    /**
     * Sets the value of the srNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSRNumber(String value) {
        this.srNumber = value;
    }

    /**
     * Gets the value of the srEstatus property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSREstatus() {
        return srEstatus;
    }

    /**
     * Sets the value of the srEstatus property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSREstatus(String value) {
        this.srEstatus = value;
    }

    /**
     * Gets the value of the srSubestatus property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSRSubestatus() {
        return srSubestatus;
    }

    /**
     * Sets the value of the srSubestatus property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSRSubestatus(String value) {
        this.srSubestatus = value;
    }

}
