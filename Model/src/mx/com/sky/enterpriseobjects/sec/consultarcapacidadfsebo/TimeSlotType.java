
package mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsebo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeSlotType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TimeSlotType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HoraInicio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HoraFin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSlotType", propOrder = { "codigo", "descripcion", "horaInicio", "horaFin" })
public class TimeSlotType {

    @XmlElement(name = "Codigo", required = true)
    protected String codigo;
    @XmlElement(name = "Descripcion", required = true)
    protected String descripcion;
    @XmlElement(name = "HoraInicio", required = true)
    protected String horaInicio;
    @XmlElement(name = "HoraFin", required = true)
    protected String horaFin;

    /**
     * Gets the value of the codigo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the descripcion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the horaInicio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHoraInicio() {
        return horaInicio;
    }

    /**
     * Sets the value of the horaInicio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHoraInicio(String value) {
        this.horaInicio = value;
    }

    /**
     * Gets the value of the horaFin property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHoraFin() {
        return horaFin;
    }

    /**
     * Sets the value of the horaFin property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHoraFin(String value) {
        this.horaFin = value;
    }

}
