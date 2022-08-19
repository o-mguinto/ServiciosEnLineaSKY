
package mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsebo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapacidadPorDiaType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CapacidadPorDiaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TimeSlots" type="{http://www.sky.com.mx/EnterpriseObjects/Sec/ConsultarCapacidadFSEBO}TimeSlotsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapacidadPorDiaType", propOrder = { "fecha", "timeSlots" })
public class CapacidadPorDiaType {

    @XmlElement(name = "Fecha", required = true)
    protected String fecha;
    @XmlElement(name = "TimeSlots", required = true)
    protected TimeSlotsType timeSlots;

    /**
     * Gets the value of the fecha property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the timeSlots property.
     *
     * @return
     *     possible object is
     *     {@link TimeSlotsType }
     *
     */
    public TimeSlotsType getTimeSlots() {
        return timeSlots;
    }

    /**
     * Sets the value of the timeSlots property.
     *
     * @param value
     *     allowed object is
     *     {@link TimeSlotsType }
     *
     */
    public void setTimeSlots(TimeSlotsType value) {
        this.timeSlots = value;
    }

}
