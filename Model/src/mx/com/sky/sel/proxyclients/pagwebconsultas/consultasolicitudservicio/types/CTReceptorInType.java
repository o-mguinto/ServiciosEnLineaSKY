
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultasolicitudservicio.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CTReceptorInType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CTReceptorInType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IRD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTReceptorInType", propOrder = { "ird" })
public class CTReceptorInType {

    @XmlElement(name = "IRD", required = true)
    protected String ird;

    /**
     * Gets the value of the ird property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIRD() {
        return ird;
    }

    /**
     * Sets the value of the ird property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIRD(String value) {
        this.ird = value;
    }

}
