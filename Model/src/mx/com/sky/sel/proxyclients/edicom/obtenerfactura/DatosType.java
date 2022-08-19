
package mx.com.sky.sel.proxyclients.edicom.obtenerfactura;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datosType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datosType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rfc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expedidoEn" type="{http://factura.edicom.factura.sky.com.mx}domicilioType" minOccurs="0"/>
 *         &lt;element name="domicilioFiscal" type="{http://factura.edicom.factura.sky.com.mx}domicilioType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosType", propOrder = {
    "rfc",
    "nombre",
    "nif",
    "expedidoEn",
    "domicilioFiscal"
})
public class DatosType {

    @XmlElement(required = true)
    protected String rfc;
    protected String nombre;
    @XmlElement(name = "NIF")
    protected String nif;
    protected DomicilioType expedidoEn;
    @XmlElement(required = true)
    protected DomicilioType domicilioFiscal;

    /**
     * Gets the value of the rfc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Sets the value of the rfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfc(String value) {
        this.rfc = value;
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
     * Gets the value of the nif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIF() {
        return nif;
    }

    /**
     * Sets the value of the nif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIF(String value) {
        this.nif = value;
    }

    /**
     * Gets the value of the expedidoEn property.
     * 
     * @return
     *     possible object is
     *     {@link DomicilioType }
     *     
     */
    public DomicilioType getExpedidoEn() {
        return expedidoEn;
    }

    /**
     * Sets the value of the expedidoEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomicilioType }
     *     
     */
    public void setExpedidoEn(DomicilioType value) {
        this.expedidoEn = value;
    }

    /**
     * Gets the value of the domicilioFiscal property.
     * 
     * @return
     *     possible object is
     *     {@link DomicilioType }
     *     
     */
    public DomicilioType getDomicilioFiscal() {
        return domicilioFiscal;
    }

    /**
     * Sets the value of the domicilioFiscal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomicilioType }
     *     
     */
    public void setDomicilioFiscal(DomicilioType value) {
        this.domicilioFiscal = value;
    }

}
