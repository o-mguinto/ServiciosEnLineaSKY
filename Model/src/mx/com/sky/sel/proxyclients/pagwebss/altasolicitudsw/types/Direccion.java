
package mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Direccion complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Direccion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Poblacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DelMun" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Colonia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Calle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NoExt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NoInt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Direccion",
         propOrder = { "estado", "poblacion", "delMun", "colonia", "cp", "calle", "noExt", "noInt" })
public class Direccion {

    @XmlElement(name = "Estado", required = true)
    protected String estado;
    @XmlElement(name = "Poblacion", required = true)
    protected String poblacion;
    @XmlElement(name = "DelMun", required = true)
    protected String delMun;
    @XmlElement(name = "Colonia", required = true)
    protected String colonia;
    @XmlElement(name = "CP", required = true)
    protected String cp;
    @XmlElement(name = "Calle", required = true)
    protected String calle;
    @XmlElement(name = "NoExt", required = true)
    protected String noExt;
    @XmlElement(name = "NoInt", required = true)
    protected String noInt;

    /**
     * Gets the value of the estado property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Gets the value of the poblacion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPoblacion() {
        return poblacion;
    }

    /**
     * Sets the value of the poblacion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPoblacion(String value) {
        this.poblacion = value;
    }

    /**
     * Gets the value of the delMun property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDelMun() {
        return delMun;
    }

    /**
     * Sets the value of the delMun property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDelMun(String value) {
        this.delMun = value;
    }

    /**
     * Gets the value of the colonia property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * Sets the value of the colonia property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setColonia(String value) {
        this.colonia = value;
    }

    /**
     * Gets the value of the cp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCP() {
        return cp;
    }

    /**
     * Sets the value of the cp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCP(String value) {
        this.cp = value;
    }

    /**
     * Gets the value of the calle property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Sets the value of the calle property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCalle(String value) {
        this.calle = value;
    }

    /**
     * Gets the value of the noExt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNoExt() {
        return noExt;
    }

    /**
     * Sets the value of the noExt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNoExt(String value) {
        this.noExt = value;
    }

    /**
     * Gets the value of the noInt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNoInt() {
        return noInt;
    }

    /**
     * Sets the value of the noInt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNoInt(String value) {
        this.noInt = value;
    }

}
