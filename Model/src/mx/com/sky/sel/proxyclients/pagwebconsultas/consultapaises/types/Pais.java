
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaises.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Pais complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Pais"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdPais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrgIdSiebel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CodigoKenanOM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CodigoMoneda" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PersonalPaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pais",
         propOrder = { "idPais", "nombre", "orgIdSiebel", "codigoKenanOM", "codigoMoneda", "personalPaymentMethod" })
public class Pais {

    @XmlElement(name = "IdPais", required = true)
    protected String idPais;
    @XmlElement(name = "Nombre", required = true)
    protected String nombre;
    @XmlElement(name = "OrgIdSiebel", required = true)
    protected String orgIdSiebel;
    @XmlElement(name = "CodigoKenanOM", required = true)
    protected String codigoKenanOM;
    @XmlElement(name = "CodigoMoneda", required = true)
    protected String codigoMoneda;
    @XmlElement(name = "PersonalPaymentMethod", required = true)
    protected String personalPaymentMethod;

    /**
     * Gets the value of the idPais property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdPais() {
        return idPais;
    }

    /**
     * Sets the value of the idPais property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdPais(String value) {
        this.idPais = value;
    }

    /**
     * Gets the value of the nombre property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the orgIdSiebel property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrgIdSiebel() {
        return orgIdSiebel;
    }

    /**
     * Sets the value of the orgIdSiebel property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrgIdSiebel(String value) {
        this.orgIdSiebel = value;
    }

    /**
     * Gets the value of the codigoKenanOM property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoKenanOM() {
        return codigoKenanOM;
    }

    /**
     * Sets the value of the codigoKenanOM property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoKenanOM(String value) {
        this.codigoKenanOM = value;
    }

    /**
     * Gets the value of the codigoMoneda property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    /**
     * Sets the value of the codigoMoneda property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoMoneda(String value) {
        this.codigoMoneda = value;
    }

    /**
     * Gets the value of the personalPaymentMethod property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPersonalPaymentMethod() {
        return personalPaymentMethod;
    }

    /**
     * Sets the value of the personalPaymentMethod property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPersonalPaymentMethod(String value) {
        this.personalPaymentMethod = value;
    }

}
