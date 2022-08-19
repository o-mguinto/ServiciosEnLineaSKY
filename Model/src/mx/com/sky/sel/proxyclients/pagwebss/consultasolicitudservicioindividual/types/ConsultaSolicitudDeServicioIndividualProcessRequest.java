
package mx.com.sky.sel.proxyclients.pagwebss.consultasolicitudservicioindividual.types;

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
 *         &lt;element name="NoSolicitud" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "noSolicitud" })
@XmlRootElement(name = "ConsultaSolicitudDeServicioIndividualProcessRequest")
public class ConsultaSolicitudDeServicioIndividualProcessRequest {

    @XmlElement(name = "NoSolicitud", required = true)
    protected String noSolicitud;

    /**
     * Gets the value of the noSolicitud property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNoSolicitud() {
        return noSolicitud;
    }

    /**
     * Sets the value of the noSolicitud property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNoSolicitud(String value) {
        this.noSolicitud = value;
    }

}
