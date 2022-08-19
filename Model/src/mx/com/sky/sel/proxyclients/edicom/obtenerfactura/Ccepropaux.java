
package mx.com.sky.sel.proxyclients.edicom.obtenerfactura;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ccepropaux complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ccepropaux">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numprop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numregid_p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resfiscal_p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ccepropaux", propOrder = {
    "id",
    "numprop",
    "numregidP",
    "resfiscalP"
})
public class Ccepropaux {

    protected String id;
    protected String numprop;
    @XmlElement(name = "numregid_p")
    protected String numregidP;
    @XmlElement(name = "resfiscal_p")
    protected String resfiscalP;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the numprop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumprop() {
        return numprop;
    }

    /**
     * Sets the value of the numprop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumprop(String value) {
        this.numprop = value;
    }

    /**
     * Gets the value of the numregidP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumregidP() {
        return numregidP;
    }

    /**
     * Sets the value of the numregidP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumregidP(String value) {
        this.numregidP = value;
    }

    /**
     * Gets the value of the resfiscalP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResfiscalP() {
        return resfiscalP;
    }

    /**
     * Sets the value of the resfiscalP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResfiscalP(String value) {
        this.resfiscalP = value;
    }

}
