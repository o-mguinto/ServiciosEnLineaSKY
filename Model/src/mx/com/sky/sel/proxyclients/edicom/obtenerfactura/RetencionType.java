
package mx.com.sky.sel.proxyclients.edicom.obtenerfactura;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retencionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retencionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUMLIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="impuesto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="importe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retencionType", propOrder = {
    "numlin",
    "impuesto",
    "importe"
})
public class RetencionType {

    @XmlElement(name = "NUMLIN", required = true)
    protected String numlin;
    @XmlElement(required = true)
    protected String impuesto;
    @XmlElement(required = true)
    protected String importe;

    /**
     * Gets the value of the numlin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMLIN() {
        return numlin;
    }

    /**
     * Sets the value of the numlin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMLIN(String value) {
        this.numlin = value;
    }

    /**
     * Gets the value of the impuesto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpuesto() {
        return impuesto;
    }

    /**
     * Sets the value of the impuesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpuesto(String value) {
        this.impuesto = value;
    }

    /**
     * Gets the value of the importe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporte() {
        return importe;
    }

    /**
     * Sets the value of the importe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporte(String value) {
        this.importe = value;
    }

}
