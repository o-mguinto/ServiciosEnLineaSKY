
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultaapg.types;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Evento complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Evento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Duracion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Fechainicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaFinal" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Sinopsis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Evento",
         propOrder = { "tipo", "titulo", "duracion", "fechainicio", "fechaFinal", "sinopsis", "contentId" })
public class Evento {

    @XmlElementRef(name = "Tipo", namespace = "http://xmlns.oracle.com/consultaProgramacion", type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> tipo;
    @XmlElementRef(name = "Titulo", namespace = "http://xmlns.oracle.com/consultaProgramacion",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> titulo;
    @XmlElementRef(name = "Duracion", namespace = "http://xmlns.oracle.com/consultaProgramacion",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> duracion;
    @XmlElementRef(name = "Fechainicio", namespace = "http://xmlns.oracle.com/consultaProgramacion",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechainicio;
    @XmlElementRef(name = "FechaFinal", namespace = "http://xmlns.oracle.com/consultaProgramacion",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaFinal;
    @XmlElementRef(name = "Sinopsis", namespace = "http://xmlns.oracle.com/consultaProgramacion",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> sinopsis;
    @XmlElementRef(name = "ContentId", namespace = "http://xmlns.oracle.com/consultaProgramacion",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> contentId;

    /**
     * Gets the value of the tipo property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setTipo(JAXBElement<String> value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the titulo property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getTitulo() {
        return titulo;
    }

    /**
     * Sets the value of the titulo property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setTitulo(JAXBElement<String> value) {
        this.titulo = value;
    }

    /**
     * Gets the value of the duracion property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *
     */
    public JAXBElement<BigDecimal> getDuracion() {
        return duracion;
    }

    /**
     * Sets the value of the duracion property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *
     */
    public void setDuracion(JAXBElement<BigDecimal> value) {
        this.duracion = value;
    }

    /**
     * Gets the value of the fechainicio property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *
     */
    public JAXBElement<XMLGregorianCalendar> getFechainicio() {
        return fechainicio;
    }

    /**
     * Sets the value of the fechainicio property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *
     */
    public void setFechainicio(JAXBElement<XMLGregorianCalendar> value) {
        this.fechainicio = value;
    }

    /**
     * Gets the value of the fechaFinal property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *
     */
    public JAXBElement<XMLGregorianCalendar> getFechaFinal() {
        return fechaFinal;
    }

    /**
     * Sets the value of the fechaFinal property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *
     */
    public void setFechaFinal(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaFinal = value;
    }

    /**
     * Gets the value of the sinopsis property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getSinopsis() {
        return sinopsis;
    }

    /**
     * Sets the value of the sinopsis property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setSinopsis(JAXBElement<String> value) {
        this.sinopsis = value;
    }

    /**
     * Gets the value of the contentId property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getContentId() {
        return contentId;
    }

    /**
     * Sets the value of the contentId property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setContentId(JAXBElement<String> value) {
        this.contentId = value;
    }

}
