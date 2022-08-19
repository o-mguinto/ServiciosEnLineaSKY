
package mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsebo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarCapacidadFSResponseType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarCapacidadFSResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Capacidad" type="{http://www.sky.com.mx/EnterpriseObjects/Sec/ConsultarCapacidadFSEBO}CapacidadType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarCapacidadFSResponseType", propOrder = { "capacidad" })
public class ConsultarCapacidadFSResponseType {

    @XmlElement(name = "Capacidad")
    protected CapacidadType capacidad;

    /**
     * Gets the value of the capacidad property.
     *
     * @return
     *     possible object is
     *     {@link CapacidadType }
     *
     */
    public CapacidadType getCapacidad() {
        return capacidad;
    }

    /**
     * Sets the value of the capacidad property.
     *
     * @param value
     *     allowed object is
     *     {@link CapacidadType }
     *
     */
    public void setCapacidad(CapacidadType value) {
        this.capacidad = value;
    }

}
