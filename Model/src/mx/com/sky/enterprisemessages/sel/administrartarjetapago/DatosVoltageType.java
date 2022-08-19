
package mx.com.sky.enterprisemessages.sel.administrartarjetapago;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatosVoltageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DatosVoltageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="phase_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="key_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosVoltageType", propOrder = { "phaseId", "keyId" })
public class DatosVoltageType {

    @XmlElement(name = "phase_id")
    protected String phaseId;
    @XmlElement(name = "key_id")
    protected String keyId;

    /**
     * Gets the value of the phaseId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPhaseId() {
        return phaseId;
    }

    /**
     * Sets the value of the phaseId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPhaseId(String value) {
        this.phaseId = value;
    }

    /**
     * Gets the value of the keyId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * Sets the value of the keyId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKeyId(String value) {
        this.keyId = value;
    }

}
