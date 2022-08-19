
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaquete.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Paquete complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Paquete"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Imagen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Paquete", propOrder = { "nombre", "imagen" })
public class Paquete {

    @XmlElement(name = "Nombre", required = true)
    protected String nombre;
    @XmlElement(name = "Imagen", required = true)
    protected String imagen;

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

}
