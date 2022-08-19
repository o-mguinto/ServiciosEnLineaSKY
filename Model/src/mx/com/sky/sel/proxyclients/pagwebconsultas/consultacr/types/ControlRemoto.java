
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultacr.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ControlRemoto complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ControlRemoto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Producto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Imagen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Manual" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Precio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TIPO_CUENTA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TIPO_EQUIPO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControlRemoto",
         propOrder = { "producto", "descripcion", "imagen", "manual", "precio", "tipocuenta", "tipoequipo" })
public class ControlRemoto {

    @XmlElement(name = "Producto", required = true)
    protected String producto;
    @XmlElement(name = "Descripcion", required = true)
    protected String descripcion;
    @XmlElement(name = "Imagen", required = true)
    protected String imagen;
    @XmlElement(name = "Manual", required = true)
    protected String manual;
    @XmlElement(name = "Precio", required = true)
    protected String precio;
    @XmlElement(name = "TIPO_CUENTA", required = true, nillable = true)
    protected String tipocuenta;
    @XmlElement(name = "TIPO_EQUIPO", required = true, nillable = true)
    protected String tipoequipo;

    /**
     * Gets the value of the producto property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProducto() {
        return producto;
    }

    /**
     * Sets the value of the producto property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProducto(String value) {
        this.producto = value;
    }

    /**
     * Gets the value of the descripcion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the imagen property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Sets the value of the imagen property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setImagen(String value) {
        this.imagen = value;
    }

    /**
     * Gets the value of the manual property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getManual() {
        return manual;
    }

    /**
     * Sets the value of the manual property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setManual(String value) {
        this.manual = value;
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

    /**
     * Gets the value of the tipocuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTIPOCUENTA() {
        return tipocuenta;
    }

    /**
     * Sets the value of the tipocuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTIPOCUENTA(String value) {
        this.tipocuenta = value;
    }

    /**
     * Gets the value of the tipoequipo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTIPOEQUIPO() {
        return tipoequipo;
    }

    /**
     * Sets the value of the tipoequipo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTIPOEQUIPO(String value) {
        this.tipoequipo = value;
    }

}
