
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultappv.types;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ppvType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ppvType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ppvEventId" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="displayValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="customerType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="specialEvent" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ppvContentId" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ppvGenreId" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="fecharegistro" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="imagen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sinopsis" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idioma" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="subtitulos" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ppvType",
         propOrder =
         { "ppvEventId", "channel", "displayValue", "price", "country", "currencyCode", "customerType", "specialEvent",
           "startDate", "endDate", "expiryDate", "ppvContentId", "ppvGenreId", "token", "fecharegistro", "imagen",
           "sinopsis", "idioma", "subtitulos", "titulo", "mensaje"
    })
public class PpvType {

    @XmlElement(required = true, nillable = true)
    protected BigDecimal ppvEventId;
    @XmlElement(required = true, nillable = true)
    protected BigInteger channel;
    @XmlElement(required = true, nillable = true)
    protected String displayValue;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal price;
    @XmlElement(required = true, nillable = true)
    protected String country;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal currencyCode;
    @XmlElement(required = true, nillable = true)
    protected String customerType;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal specialEvent;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal ppvContentId;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal ppvGenreId;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal token;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecharegistro;
    @XmlElement(required = true, nillable = true)
    protected String imagen;
    @XmlElement(required = true, nillable = true)
    protected String sinopsis;
    @XmlElement(required = true, nillable = true)
    protected String idioma;
    @XmlElement(required = true, nillable = true)
    protected String subtitulos;
    @XmlElement(required = true, nillable = true)
    protected String titulo;
    @XmlElement(required = true, nillable = true)
    protected String mensaje;

    /**
     * Gets the value of the ppvEventId property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getPpvEventId() {
        return ppvEventId;
    }

    /**
     * Sets the value of the ppvEventId property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setPpvEventId(BigDecimal value) {
        this.ppvEventId = value;
    }

    /**
     * Gets the value of the channel property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setChannel(BigInteger value) {
        this.channel = value;
    }

    /**
     * Gets the value of the displayValue property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDisplayValue() {
        return displayValue;
    }

    /**
     * Sets the value of the displayValue property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDisplayValue(String value) {
        this.displayValue = value;
    }

    /**
     * Gets the value of the price property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the country property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the currencyCode property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCurrencyCode(BigDecimal value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the customerType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerType(String value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the specialEvent property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getSpecialEvent() {
        return specialEvent;
    }

    /**
     * Sets the value of the specialEvent property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setSpecialEvent(BigDecimal value) {
        this.specialEvent = value;
    }

    /**
     * Gets the value of the startDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the expiryDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the ppvContentId property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getPpvContentId() {
        return ppvContentId;
    }

    /**
     * Sets the value of the ppvContentId property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setPpvContentId(BigDecimal value) {
        this.ppvContentId = value;
    }

    /**
     * Gets the value of the ppvGenreId property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getPpvGenreId() {
        return ppvGenreId;
    }

    /**
     * Sets the value of the ppvGenreId property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setPpvGenreId(BigDecimal value) {
        this.ppvGenreId = value;
    }

    /**
     * Gets the value of the token property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setToken(BigDecimal value) {
        this.token = value;
    }

    /**
     * Gets the value of the fecharegistro property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFecharegistro() {
        return fecharegistro;
    }

    /**
     * Sets the value of the fecharegistro property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFecharegistro(XMLGregorianCalendar value) {
        this.fecharegistro = value;
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
     * Gets the value of the idioma property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * Sets the value of the idioma property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdioma(String value) {
        this.idioma = value;
    }

    /**
     * Gets the value of the subtitulos property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubtitulos() {
        return subtitulos;
    }

    /**
     * Sets the value of the subtitulos property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubtitulos(String value) {
        this.subtitulos = value;
    }

    /**
     * Gets the value of the titulo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Sets the value of the titulo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

    /**
     * Gets the value of the mensaje property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Sets the value of the mensaje property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

}
