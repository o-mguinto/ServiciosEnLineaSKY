
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultacanalescarta.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CanalALaCarta complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CanalALaCarta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NombreDisplay" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Imagen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Canal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Sinopsis" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CanalDisplay" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Definicion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Categoria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CanalALaCarta",
         propOrder =
         { "nombre", "nombreDisplay", "imagen", "canal", "sinopsis", "canalDisplay", "definicion", "categoria"
    })
public class CanalALaCarta {

    @XmlElement(name = "Nombre", required = true)
    protected String nombre;
    @XmlElement(name = "NombreDisplay", required = true)
    protected String nombreDisplay;
    @XmlElement(name = "Imagen", required = true)
    protected String imagen;
    @XmlElement(name = "Canal", required = true)
    protected String canal;
    @XmlElement(name = "Sinopsis", required = true)
    protected String sinopsis;
    @XmlElement(name = "CanalDisplay", required = true)
    protected String canalDisplay;
    @XmlElement(name = "Definicion", required = true)
    protected String definicion;
    @XmlElement(name = "Categoria", required = true)
    protected String categoria;

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
     * Gets the value of the nombreDisplay property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombreDisplay() {
        return nombreDisplay;
    }

    /**
     * Sets the value of the nombreDisplay property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombreDisplay(String value) {
        this.nombreDisplay = value;
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
     * Gets the value of the canal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCanal() {
        return canal;
    }

    /**
     * Sets the value of the canal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCanal(String value) {
        this.canal = value;
    }

    /**
     * Gets the value of the sinopsis property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSinopsis() {
        return sinopsis;
    }

    /**
     * Sets the value of the sinopsis property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSinopsis(String value) {
        this.sinopsis = value;
    }

    /**
     * Gets the value of the canalDisplay property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCanalDisplay() {
        return canalDisplay;
    }

    /**
     * Sets the value of the canalDisplay property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCanalDisplay(String value) {
        this.canalDisplay = value;
    }

    /**
     * Gets the value of the definicion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDefinicion() {
        return definicion;
    }

    /**
     * Sets the value of the definicion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDefinicion(String value) {
        this.definicion = value;
    }

    /**
     * Gets the value of the categoria property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Sets the value of the categoria property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

}
