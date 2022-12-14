
package mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsebo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeSlotsType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TimeSlotsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimeSlot" type="{http://www.sky.com.mx/EnterpriseObjects/Sec/ConsultarCapacidadFSEBO}TimeSlotType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSlotsType", propOrder = { "timeSlot" })
public class TimeSlotsType {

    @XmlElement(name = "TimeSlot", required = true)
    protected List<TimeSlotType> timeSlot;

    /**
     * Gets the value of the timeSlot property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeSlot property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeSlot().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeSlotType }
     *
     *
     */
    public List<TimeSlotType> getTimeSlot() {
        if (timeSlot == null) {
            timeSlot = new ArrayList<TimeSlotType>();
        }
        return this.timeSlot;
    }

}
