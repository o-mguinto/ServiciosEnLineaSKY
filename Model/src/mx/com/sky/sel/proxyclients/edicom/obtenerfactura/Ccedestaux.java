
package mx.com.sky.sel.proxyclients.edicom.obtenerfactura;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ccedestaux complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ccedestaux">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numdest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numregid_d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre_d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calle_d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numext_d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numint_d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colonia_d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localidad_d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referencia_d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delmun_d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado_d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pais_d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cp_d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ccedestaux", propOrder = {
    "id",
    "numdest",
    "numregidD",
    "nombreD",
    "calleD",
    "numextD",
    "numintD",
    "coloniaD",
    "localidadD",
    "referenciaD",
    "delmunD",
    "estadoD",
    "paisD",
    "cpD"
})
public class Ccedestaux {

    protected String id;
    protected String numdest;
    @XmlElement(name = "numregid_d")
    protected String numregidD;
    @XmlElement(name = "nombre_d")
    protected String nombreD;
    @XmlElement(name = "calle_d")
    protected String calleD;
    @XmlElement(name = "numext_d")
    protected String numextD;
    @XmlElement(name = "numint_d")
    protected String numintD;
    @XmlElement(name = "colonia_d")
    protected String coloniaD;
    @XmlElement(name = "localidad_d")
    protected String localidadD;
    @XmlElement(name = "referencia_d")
    protected String referenciaD;
    @XmlElement(name = "delmun_d")
    protected String delmunD;
    @XmlElement(name = "estado_d")
    protected String estadoD;
    @XmlElement(name = "pais_d")
    protected String paisD;
    @XmlElement(name = "cp_d")
    protected String cpD;

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
     * Gets the value of the numdest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumdest() {
        return numdest;
    }

    /**
     * Sets the value of the numdest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumdest(String value) {
        this.numdest = value;
    }

    /**
     * Gets the value of the numregidD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumregidD() {
        return numregidD;
    }

    /**
     * Sets the value of the numregidD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumregidD(String value) {
        this.numregidD = value;
    }

    /**
     * Gets the value of the nombreD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreD() {
        return nombreD;
    }

    /**
     * Sets the value of the nombreD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreD(String value) {
        this.nombreD = value;
    }

    /**
     * Gets the value of the calleD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalleD() {
        return calleD;
    }

    /**
     * Sets the value of the calleD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalleD(String value) {
        this.calleD = value;
    }

    /**
     * Gets the value of the numextD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumextD() {
        return numextD;
    }

    /**
     * Sets the value of the numextD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumextD(String value) {
        this.numextD = value;
    }

    /**
     * Gets the value of the numintD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumintD() {
        return numintD;
    }

    /**
     * Sets the value of the numintD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumintD(String value) {
        this.numintD = value;
    }

    /**
     * Gets the value of the coloniaD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColoniaD() {
        return coloniaD;
    }

    /**
     * Sets the value of the coloniaD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColoniaD(String value) {
        this.coloniaD = value;
    }

    /**
     * Gets the value of the localidadD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalidadD() {
        return localidadD;
    }

    /**
     * Sets the value of the localidadD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalidadD(String value) {
        this.localidadD = value;
    }

    /**
     * Gets the value of the referenciaD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaD() {
        return referenciaD;
    }

    /**
     * Sets the value of the referenciaD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaD(String value) {
        this.referenciaD = value;
    }

    /**
     * Gets the value of the delmunD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelmunD() {
        return delmunD;
    }

    /**
     * Sets the value of the delmunD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelmunD(String value) {
        this.delmunD = value;
    }

    /**
     * Gets the value of the estadoD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoD() {
        return estadoD;
    }

    /**
     * Sets the value of the estadoD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoD(String value) {
        this.estadoD = value;
    }

    /**
     * Gets the value of the paisD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisD() {
        return paisD;
    }

    /**
     * Sets the value of the paisD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisD(String value) {
        this.paisD = value;
    }

    /**
     * Gets the value of the cpD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpD() {
        return cpD;
    }

    /**
     * Sets the value of the cpD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpD(String value) {
        this.cpD = value;
    }

}
