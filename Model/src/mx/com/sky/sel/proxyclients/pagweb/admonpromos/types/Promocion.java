
package mx.com.sky.sel.proxyclients.pagweb.admonpromos.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Promocion complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Promocion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdPromocion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IdPais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FechaCreacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="FechaActualizacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Habilitada" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PopUp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Carrusel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Imagen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VeTV" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FechaInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="FechaFin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="paquete" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Promocion",
         propOrder =
         { "idPromocion", "idPais", "fechaCreacion", "fechaActualizacion", "habilitada", "popUp", "carrusel", "nombre",
           "descripcion", "imagen", "veTV", "fechaInicio", "fechaFin", "paquete", "tipoCuenta", "login"
    })
public class Promocion {

    @XmlElement(name = "IdPromocion", required = true)
    protected String idPromocion;
    @XmlElement(name = "IdPais", required = true)
    protected String idPais;
    @XmlElement(name = "FechaCreacion", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCreacion;
    @XmlElement(name = "FechaActualizacion", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaActualizacion;
    @XmlElement(name = "Habilitada", required = true)
    protected String habilitada;
    @XmlElement(name = "PopUp", required = true)
    protected String popUp;
    @XmlElement(name = "Carrusel", required = true)
    protected String carrusel;
    @XmlElement(name = "Nombre", required = true)
    protected String nombre;
    @XmlElement(name = "Descripcion", required = true)
    protected String descripcion;
    @XmlElement(name = "Imagen", required = true)
    protected String imagen;
    @XmlElement(name = "VeTV", required = true)
    protected String veTV;
    @XmlElement(name = "FechaInicio", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaInicio;
    @XmlElement(name = "FechaFin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaFin;
    @XmlElement(required = true)
    protected String paquete;
    @XmlElement(required = true)
    protected String tipoCuenta;
    @XmlElement(required = true)
    protected String login;

    /**
     * Gets the value of the idPromocion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdPromocion() {
        return idPromocion;
    }

    /**
     * Sets the value of the idPromocion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdPromocion(String value) {
        this.idPromocion = value;
    }

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
     * Gets the value of the fechaCreacion property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Sets the value of the fechaCreacion property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFechaCreacion(XMLGregorianCalendar value) {
        this.fechaCreacion = value;
    }

    /**
     * Gets the value of the fechaActualizacion property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaActualizacion() {
        return fechaActualizacion;
    }

    /**
     * Sets the value of the fechaActualizacion property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFechaActualizacion(XMLGregorianCalendar value) {
        this.fechaActualizacion = value;
    }

    /**
     * Gets the value of the habilitada property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHabilitada() {
        return habilitada;
    }

    /**
     * Sets the value of the habilitada property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHabilitada(String value) {
        this.habilitada = value;
    }

    /**
     * Gets the value of the popUp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPopUp() {
        return popUp;
    }

    /**
     * Sets the value of the popUp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPopUp(String value) {
        this.popUp = value;
    }

    /**
     * Gets the value of the carrusel property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCarrusel() {
        return carrusel;
    }

    /**
     * Sets the value of the carrusel property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCarrusel(String value) {
        this.carrusel = value;
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
     * Gets the value of the veTV property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVeTV() {
        return veTV;
    }

    /**
     * Sets the value of the veTV property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVeTV(String value) {
        this.veTV = value;
    }

    /**
     * Gets the value of the fechaInicio property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Sets the value of the fechaInicio property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFechaInicio(XMLGregorianCalendar value) {
        this.fechaInicio = value;
    }

    /**
     * Gets the value of the fechaFin property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaFin() {
        return fechaFin;
    }

    /**
     * Sets the value of the fechaFin property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFechaFin(XMLGregorianCalendar value) {
        this.fechaFin = value;
    }

    /**
     * Gets the value of the paquete property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaquete() {
        return paquete;
    }

    /**
     * Sets the value of the paquete property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaquete(String value) {
        this.paquete = value;
    }

    /**
     * Gets the value of the tipoCuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    /**
     * Sets the value of the tipoCuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoCuenta(String value) {
        this.tipoCuenta = value;
    }

    /**
     * Gets the value of the login property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLogin(String value) {
        this.login = value;
    }

}
