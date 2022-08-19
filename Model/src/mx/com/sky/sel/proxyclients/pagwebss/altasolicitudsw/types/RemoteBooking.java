
package mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RemoteBooking complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RemoteBooking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MethodType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RecurringFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ExpirationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EventID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RecordingType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RecordConfiguration" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ProductCategory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoteBooking",
         propOrder =
         { "channel", "methodType", "recurringFlag", "startTime", "expirationTime", "duration", "eventID",
           "recordingType", "recordConfiguration", "productCategory"
    })
public class RemoteBooking {

    @XmlElement(name = "Channel", required = true)
    protected String channel;
    @XmlElement(name = "MethodType", required = true)
    protected String methodType;
    @XmlElement(name = "RecurringFlag", required = true)
    protected String recurringFlag;
    @XmlElement(name = "StartTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "ExpirationTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationTime;
    @XmlElement(name = "Duration", required = true)
    protected String duration;
    @XmlElement(name = "EventID", required = true)
    protected String eventID;
    @XmlElement(name = "RecordingType", required = true)
    protected String recordingType;
    @XmlElement(name = "RecordConfiguration", required = true)
    protected String recordConfiguration;
    @XmlElement(name = "ProductCategory", required = true)
    protected String productCategory;

    /**
     * Gets the value of the channel property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * Gets the value of the methodType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMethodType() {
        return methodType;
    }

    /**
     * Sets the value of the methodType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMethodType(String value) {
        this.methodType = value;
    }

    /**
     * Gets the value of the recurringFlag property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRecurringFlag() {
        return recurringFlag;
    }

    /**
     * Sets the value of the recurringFlag property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRecurringFlag(String value) {
        this.recurringFlag = value;
    }

    /**
     * Gets the value of the startTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the expirationTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getExpirationTime() {
        return expirationTime;
    }

    /**
     * Sets the value of the expirationTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setExpirationTime(XMLGregorianCalendar value) {
        this.expirationTime = value;
    }

    /**
     * Gets the value of the duration property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the eventID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEventID() {
        return eventID;
    }

    /**
     * Sets the value of the eventID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEventID(String value) {
        this.eventID = value;
    }

    /**
     * Gets the value of the recordingType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRecordingType() {
        return recordingType;
    }

    /**
     * Sets the value of the recordingType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRecordingType(String value) {
        this.recordingType = value;
    }

    /**
     * Gets the value of the recordConfiguration property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRecordConfiguration() {
        return recordConfiguration;
    }

    /**
     * Sets the value of the recordConfiguration property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRecordConfiguration(String value) {
        this.recordConfiguration = value;
    }

    /**
     * Gets the value of the productCategory property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProductCategory() {
        return productCategory;
    }

    /**
     * Sets the value of the productCategory property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProductCategory(String value) {
        this.productCategory = value;
    }

}
