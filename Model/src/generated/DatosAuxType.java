
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datosAuxType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="datosAuxType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BPEL_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosAuxType", propOrder = { "bpelid" })
public class DatosAuxType {

    @XmlElement(name = "BPEL_ID", required = true)
    protected String bpelid;

    /**
     * Gets the value of the bpelid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBPELID() {
        return bpelid;
    }

    /**
     * Sets the value of the bpelid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBPELID(String value) {
        this.bpelid = value;
    }

}
