
package mx.com.sky.sel.proxyclients.edicom.obtenerfactura;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoproceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipocomite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idcontabilidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cine", propOrder = {
    "id",
    "version",
    "tipoproceso",
    "tipocomite",
    "idcontabilidad"
})
public class Cine {

    protected String id;
    protected String version;
    protected String tipoproceso;
    protected String tipocomite;
    protected String idcontabilidad;

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
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the tipoproceso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoproceso() {
        return tipoproceso;
    }

    /**
     * Sets the value of the tipoproceso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoproceso(String value) {
        this.tipoproceso = value;
    }

    /**
     * Gets the value of the tipocomite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipocomite() {
        return tipocomite;
    }

    /**
     * Sets the value of the tipocomite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipocomite(String value) {
        this.tipocomite = value;
    }

    /**
     * Gets the value of the idcontabilidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcontabilidad() {
        return idcontabilidad;
    }

    /**
     * Sets the value of the idcontabilidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcontabilidad(String value) {
        this.idcontabilidad = value;
    }

}
