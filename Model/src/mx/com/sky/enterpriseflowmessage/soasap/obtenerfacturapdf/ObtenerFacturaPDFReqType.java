
package mx.com.sky.enterpriseflowmessage.soasap.obtenerfacturapdf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObtenerFacturaPDFReqType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ObtenerFacturaPDFReqType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaTimbrado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PAC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObtenerFacturaPDFReqType", propOrder = { "uuid", "fechaTimbrado", "pac" })
public class ObtenerFacturaPDFReqType {

    @XmlElement(name = "UUID")
    protected String uuid;
    @XmlElement(name = "FechaTimbrado")
    protected String fechaTimbrado;
    @XmlElement(name = "PAC", required = true)
    protected String pac;

    /**
     * Gets the value of the uuid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the fechaTimbrado property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaTimbrado() {
        return fechaTimbrado;
    }

    /**
     * Sets the value of the fechaTimbrado property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaTimbrado(String value) {
        this.fechaTimbrado = value;
    }

    /**
     * Gets the value of the pac property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPAC() {
        return pac;
    }

    /**
     * Sets the value of the pac property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPAC(String value) {
        this.pac = value;
    }

}
