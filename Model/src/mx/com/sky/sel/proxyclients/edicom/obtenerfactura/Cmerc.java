
package mx.com.sky.sel.proxyclients.edicom.obtenerfactura;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cmerc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cmerc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nummerc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fracarancel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantaduana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uniaduana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valuniaduana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valdolares" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdesce" type="{http://factura.edicom.factura.sky.com.mx}cdesce" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cmerc", propOrder = {
    "id",
    "nummerc",
    "numident",
    "fracarancel",
    "cantaduana",
    "uniaduana",
    "valuniaduana",
    "valdolares",
    "cdesce"
})
public class Cmerc {

    protected String id;
    protected String nummerc;
    protected String numident;
    protected String fracarancel;
    protected String cantaduana;
    protected String uniaduana;
    protected String valuniaduana;
    protected String valdolares;
    protected List<Cdesce> cdesce;

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
     * Gets the value of the nummerc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNummerc() {
        return nummerc;
    }

    /**
     * Sets the value of the nummerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNummerc(String value) {
        this.nummerc = value;
    }

    /**
     * Gets the value of the numident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumident() {
        return numident;
    }

    /**
     * Sets the value of the numident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumident(String value) {
        this.numident = value;
    }

    /**
     * Gets the value of the fracarancel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFracarancel() {
        return fracarancel;
    }

    /**
     * Sets the value of the fracarancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFracarancel(String value) {
        this.fracarancel = value;
    }

    /**
     * Gets the value of the cantaduana property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantaduana() {
        return cantaduana;
    }

    /**
     * Sets the value of the cantaduana property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantaduana(String value) {
        this.cantaduana = value;
    }

    /**
     * Gets the value of the uniaduana property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniaduana() {
        return uniaduana;
    }

    /**
     * Sets the value of the uniaduana property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniaduana(String value) {
        this.uniaduana = value;
    }

    /**
     * Gets the value of the valuniaduana property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValuniaduana() {
        return valuniaduana;
    }

    /**
     * Sets the value of the valuniaduana property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValuniaduana(String value) {
        this.valuniaduana = value;
    }

    /**
     * Gets the value of the valdolares property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValdolares() {
        return valdolares;
    }

    /**
     * Sets the value of the valdolares property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValdolares(String value) {
        this.valdolares = value;
    }

    /**
     * Gets the value of the cdesce property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cdesce property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCdesce().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cdesce }
     * 
     * 
     */
    public List<Cdesce> getCdesce() {
        if (cdesce == null) {
            cdesce = new ArrayList<Cdesce>();
        }
        return this.cdesce;
    }

}
