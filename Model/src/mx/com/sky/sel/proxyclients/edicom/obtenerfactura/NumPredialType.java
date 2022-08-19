
package mx.com.sky.sel.proxyclients.edicom.obtenerfactura;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for numPredialType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="numPredialType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUMLIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NUMPRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NPREDIAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "numPredialType", propOrder = {
    "numlin",
    "numprd",
    "npredial"
})
public class NumPredialType {

    @XmlElement(name = "NUMLIN")
    protected String numlin;
    @XmlElement(name = "NUMPRD")
    protected String numprd;
    @XmlElement(name = "NPREDIAL")
    protected String npredial;

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
     * Gets the value of the numprd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMPRD() {
        return numprd;
    }

    /**
     * Sets the value of the numprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMPRD(String value) {
        this.numprd = value;
    }

    /**
     * Gets the value of the npredial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPREDIAL() {
        return npredial;
    }

    /**
     * Sets the value of the npredial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPREDIAL(String value) {
        this.npredial = value;
    }

}
