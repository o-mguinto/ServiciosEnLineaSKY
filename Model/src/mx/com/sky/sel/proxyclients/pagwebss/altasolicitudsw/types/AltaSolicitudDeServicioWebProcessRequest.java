
package mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.types;

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
 *         &lt;element name="SolicitudDeServicio" type="{http://xmlns.oracle.com/AltaSolicitudDeServicioWeb}Solicitud"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "solicitudDeServicio" })
@XmlRootElement(name = "AltaSolicitudDeServicioWebProcessRequest")
public class AltaSolicitudDeServicioWebProcessRequest {

    @XmlElement(name = "SolicitudDeServicio", required = true)
    protected Solicitud solicitudDeServicio;

    /**
     * Gets the value of the solicitudDeServicio property.
     *
     * @return
     *     possible object is
     *     {@link Solicitud }
     *
     */
    public Solicitud getSolicitudDeServicio() {
        return solicitudDeServicio;
    }

    /**
     * Sets the value of the solicitudDeServicio property.
     *
     * @param value
     *     allowed object is
     *     {@link Solicitud }
     *
     */
    public void setSolicitudDeServicio(Solicitud value) {
        this.solicitudDeServicio = value;
    }

}
