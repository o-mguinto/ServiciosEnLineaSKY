
package mx.com.sky.sel.proxyclients.pagweb.admonbtgew.types;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BTGEWElementType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="BTGEWElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="idPais" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="habilitada" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="carruselLogin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="paquete" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vetv" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="imagen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="linkActivo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechaInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="fechaFin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="usernameCreador" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="usernameModificador" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechaCreacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="fechaActualizacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BTGEWElementType",
         propOrder =
         { "id", "idPais", "habilitada", "carruselLogin", "tipoCuenta", "paquete", "vetv", "nombre", "imagen",
           "linkActivo", "link", "descripcion", "fechaInicio", "fechaFin", "usernameCreador", "usernameModificador",
           "fechaCreacion", "fechaActualizacion"
    })
public class BTGEWElementType {

    @XmlElement(required = true)
    protected BigDecimal id;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal idPais;
    @XmlElement(required = true, nillable = true)
    protected String habilitada;
    @XmlElement(required = true, nillable = true)
    protected String carruselLogin;
    @XmlElement(required = true, nillable = true)
    protected String tipoCuenta;
    @XmlElement(required = true, nillable = true)
    protected String paquete;
    @XmlElement(required = true, nillable = true)
    protected String vetv;
    @XmlElement(required = true, nillable = true)
    protected String nombre;
    @XmlElement(required = true, nillable = true)
    protected String imagen;
    @XmlElement(required = true, nillable = true)
    protected String linkActivo;
    @XmlElement(required = true, nillable = true)
    protected String link;
    @XmlElement(required = true, nillable = true)
    protected String descripcion;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaInicio;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaFin;
    @XmlElement(required = true, nillable = true)
    protected String usernameCreador;
    @XmlElement(required = true, nillable = true)
    protected String usernameModificador;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCreacion;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaActualizacion;

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setId(BigDecimal value) {
        this.id = value;
    }

    /**
     * Gets the value of the idPais property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getIdPais() {
        return idPais;
    }

    /**
     * Sets the value of the idPais property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setIdPais(BigDecimal value) {
        this.idPais = value;
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
     * Gets the value of the carruselLogin property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCarruselLogin() {
        return carruselLogin;
    }

    /**
     * Sets the value of the carruselLogin property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCarruselLogin(String value) {
        this.carruselLogin = value;
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
     * Gets the value of the vetv property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVetv() {
        return vetv;
    }

    /**
     * Sets the value of the vetv property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVetv(String value) {
        this.vetv = value;
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
     * Gets the value of the linkActivo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLinkActivo() {
        return linkActivo;
    }

    /**
     * Sets the value of the linkActivo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLinkActivo(String value) {
        this.linkActivo = value;
    }

    /**
     * Gets the value of the link property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLink(String value) {
        this.link = value;
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
     * Gets the value of the usernameCreador property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUsernameCreador() {
        return usernameCreador;
    }

    /**
     * Sets the value of the usernameCreador property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUsernameCreador(String value) {
        this.usernameCreador = value;
    }

    /**
     * Gets the value of the usernameModificador property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUsernameModificador() {
        return usernameModificador;
    }

    /**
     * Sets the value of the usernameModificador property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUsernameModificador(String value) {
        this.usernameModificador = value;
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

}
