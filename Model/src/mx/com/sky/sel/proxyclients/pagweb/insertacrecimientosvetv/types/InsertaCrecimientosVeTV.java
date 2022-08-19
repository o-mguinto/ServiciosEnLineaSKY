
package mx.com.sky.sel.proxyclients.pagweb.insertacrecimientosvetv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cuentaSKY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vendedor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="distribuidor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechaAtencion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="horaAtencion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sistema" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",
         propOrder = { "cuentaSKY", "vendedor", "distribuidor", "fechaAtencion", "horaAtencion", "sistema", "precio" })
@XmlRootElement(name = "insertaCrecimientosVeTV")
public class InsertaCrecimientosVeTV {

    @XmlElement(required = true)
    protected String cuentaSKY;
    @XmlElement(required = true)
    protected String vendedor;
    @XmlElement(required = true)
    protected String distribuidor;
    @XmlElement(required = true)
    protected String fechaAtencion;
    @XmlElement(required = true)
    protected String horaAtencion;
    @XmlElement(required = true)
    protected String sistema;
    @XmlElement(required = true)
    protected String precio;

    /**
     * Gets the value of the cuentaSKY property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCuentaSKY() {
        return cuentaSKY;
    }

    /**
     * Sets the value of the cuentaSKY property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCuentaSKY(String value) {
        this.cuentaSKY = value;
    }

    /**
     * Gets the value of the vendedor property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVendedor() {
        return vendedor;
    }

    /**
     * Sets the value of the vendedor property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVendedor(String value) {
        this.vendedor = value;
    }

    /**
     * Gets the value of the distribuidor property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDistribuidor() {
        return distribuidor;
    }

    /**
     * Sets the value of the distribuidor property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDistribuidor(String value) {
        this.distribuidor = value;
    }

    /**
     * Gets the value of the fechaAtencion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaAtencion() {
        return fechaAtencion;
    }

    /**
     * Sets the value of the fechaAtencion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaAtencion(String value) {
        this.fechaAtencion = value;
    }

    /**
     * Gets the value of the horaAtencion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHoraAtencion() {
        return horaAtencion;
    }

    /**
     * Sets the value of the horaAtencion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHoraAtencion(String value) {
        this.horaAtencion = value;
    }

    /**
     * Gets the value of the sistema property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSistema() {
        return sistema;
    }

    /**
     * Sets the value of the sistema property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSistema(String value) {
        this.sistema = value;
    }

    /**
     * Gets the value of the precio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * Sets the value of the precio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPrecio(String value) {
        this.precio = value;
    }

}
