
package mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsebo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistribuidorType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DistribuidorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DistribuidorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistribuidorType", propOrder = { "distribuidorId" })
public class DistribuidorType {

    @XmlElement(name = "DistribuidorId")
    protected String distribuidorId;

    /**
     * Gets the value of the distribuidorId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDistribuidorId() {
        return distribuidorId;
    }

    /**
     * Sets the value of the distribuidorId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDistribuidorId(String value) {
        this.distribuidorId = value;
    }

}
