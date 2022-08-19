
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultacrdirecciones.types;

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
 *         &lt;element name="IdDireccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IdRegion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CodigoPostal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Horario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Notas" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Zona" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Poblacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
         propOrder =
         { "idDireccion", "idRegion", "nombre", "tipo", "codigoPostal", "direccion", "telefono", "fax", "horario",
           "notas", "zona", "poblacion"
    })
public class Direccion {

    @XmlElement(name = "IdDireccion", required = true)
    protected String idDireccion;
    @XmlElement(name = "IdRegion", required = true)
    protected String idRegion;
    @XmlElement(name = "Nombre", required = true)
    protected String nombre;
    @XmlElement(name = "Tipo", required = true)
    protected String tipo;
    @XmlElement(name = "CodigoPostal", required = true)
    protected String codigoPostal;
    @XmlElement(name = "Direccion", required = true)
    protected String direccion;
    @XmlElement(name = "Telefono", required = true)
    protected String telefono;
    @XmlElement(name = "Fax", required = true)
    protected String fax;
    @XmlElement(name = "Horario", required = true)
    protected String horario;
    @XmlElement(name = "Notas", required = true)
    protected String notas;
    @XmlElement(name = "Zona", required = true)
    protected String zona;
    @XmlElement(name = "Poblacion", required = true)
    protected String poblacion;

    /**
     * Gets the value of the idDireccion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdDireccion() {
        return idDireccion;
    }

    /**
     * Sets the value of the idDireccion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdDireccion(String value) {
        this.idDireccion = value;
    }

    /**
     * Gets the value of the idRegion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdRegion() {
        return idRegion;
    }

    /**
     * Sets the value of the idRegion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdRegion(String value) {
        this.idRegion = value;
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
     * Gets the value of the tipo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the codigoPostal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Sets the value of the codigoPostal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoPostal(String value) {
        this.codigoPostal = value;
    }

    /**
     * Gets the value of the direccion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Sets the value of the direccion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Gets the value of the telefono property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Sets the value of the telefono property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Gets the value of the fax property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the horario property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHorario() {
        return horario;
    }

    /**
     * Sets the value of the horario property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHorario(String value) {
        this.horario = value;
    }

    /**
     * Gets the value of the notas property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNotas() {
        return notas;
    }

    /**
     * Sets the value of the notas property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNotas(String value) {
        this.notas = value;
    }

    /**
     * Gets the value of the zona property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getZona() {
        return zona;
    }

    /**
     * Sets the value of the zona property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setZona(String value) {
        this.zona = value;
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

}
