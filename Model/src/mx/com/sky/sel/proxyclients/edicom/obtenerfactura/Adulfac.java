
package mx.com.sky.sel.proxyclients.edicom.obtenerfactura;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adulfac complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adulfac">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numlin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numadu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="glnaduana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomaduana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pedimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecpedimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adulfac", propOrder = {
    "id",
    "numlin",
    "numadu",
    "glnaduana",
    "nomaduana",
    "pedimento",
    "fecpedimento"
})
public class Adulfac {

    protected String id;
    protected String numlin;
    protected String numadu;
    protected String glnaduana;
    protected String nomaduana;
    protected String pedimento;
    protected String fecpedimento;

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
     * Gets the value of the numlin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumlin() {
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
    public void setNumlin(String value) {
        this.numlin = value;
    }

    /**
     * Gets the value of the numadu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumadu() {
        return numadu;
    }

    /**
     * Sets the value of the numadu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumadu(String value) {
        this.numadu = value;
    }

    /**
     * Gets the value of the glnaduana property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlnaduana() {
        return glnaduana;
    }

    /**
     * Sets the value of the glnaduana property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlnaduana(String value) {
        this.glnaduana = value;
    }

    /**
     * Gets the value of the nomaduana property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomaduana() {
        return nomaduana;
    }

    /**
     * Sets the value of the nomaduana property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomaduana(String value) {
        this.nomaduana = value;
    }

    /**
     * Gets the value of the pedimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPedimento() {
        return pedimento;
    }

    /**
     * Sets the value of the pedimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPedimento(String value) {
        this.pedimento = value;
    }

    /**
     * Gets the value of the fecpedimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecpedimento() {
        return fecpedimento;
    }

    /**
     * Sets the value of the fecpedimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecpedimento(String value) {
        this.fecpedimento = value;
    }

}
