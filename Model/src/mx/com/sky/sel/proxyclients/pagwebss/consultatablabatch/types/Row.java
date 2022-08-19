
package mx.com.sky.sel.proxyclients.pagwebss.consultatablabatch.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Row complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Row"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bpelId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechaCreacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="noSolicitud" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="llaveOperacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoEvento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="costoEvento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="canalDisplay" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="canal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idEvento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechaExpiracion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechaInicio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="duracion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nombreEvento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nombreCorporativo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Row", namespace = "http://xmlns.oracle.com/ConsultaTablaBatchSS",
         propOrder =
         { "bpelId", "status", "fechaCreacion", "noSolicitud", "llaveOperacion", "descripcion", "tipoEvento",
           "costoEvento", "canalDisplay", "canal", "idEvento", "fechaExpiracion", "fechaInicio", "duracion",
           "nombreEvento", "nombreCorporativo"
    })
public class Row {

    @XmlElement(required = true)
    protected String bpelId;
    @XmlElement(required = true)
    protected String status;
    @XmlElementRef(name = "fechaCreacion", namespace = "http://xmlns.oracle.com/ConsultaTablaBatchSS",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaCreacion;
    @XmlElement(required = true)
    protected String noSolicitud;
    @XmlElement(required = true)
    protected String llaveOperacion;
    @XmlElement(required = true)
    protected String descripcion;
    @XmlElement(required = true)
    protected String tipoEvento;
    @XmlElement(required = true)
    protected String costoEvento;
    @XmlElement(required = true)
    protected String canalDisplay;
    @XmlElement(required = true)
    protected String canal;
    @XmlElement(required = true)
    protected String idEvento;
    @XmlElement(required = true)
    protected String fechaExpiracion;
    @XmlElement(required = true)
    protected String fechaInicio;
    @XmlElement(required = true)
    protected String duracion;
    @XmlElement(required = true)
    protected String nombreEvento;
    @XmlElement(required = true)
    protected String nombreCorporativo;

    /**
     * Gets the value of the bpelId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBpelId() {
        return bpelId;
    }

    /**
     * Sets the value of the bpelId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBpelId(String value) {
        this.bpelId = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the fechaCreacion property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *
     */
    public JAXBElement<XMLGregorianCalendar> getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Sets the value of the fechaCreacion property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *
     */
    public void setFechaCreacion(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaCreacion = value;
    }

    /**
     * Gets the value of the noSolicitud property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNoSolicitud() {
        return noSolicitud;
    }

    /**
     * Sets the value of the noSolicitud property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNoSolicitud(String value) {
        this.noSolicitud = value;
    }

    /**
     * Gets the value of the llaveOperacion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLlaveOperacion() {
        return llaveOperacion;
    }

    /**
     * Sets the value of the llaveOperacion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLlaveOperacion(String value) {
        this.llaveOperacion = value;
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
     * Gets the value of the tipoEvento property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoEvento() {
        return tipoEvento;
    }

    /**
     * Sets the value of the tipoEvento property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoEvento(String value) {
        this.tipoEvento = value;
    }

    /**
     * Gets the value of the costoEvento property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCostoEvento() {
        return costoEvento;
    }

    /**
     * Sets the value of the costoEvento property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCostoEvento(String value) {
        this.costoEvento = value;
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
     * Gets the value of the idEvento property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdEvento() {
        return idEvento;
    }

    /**
     * Sets the value of the idEvento property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdEvento(String value) {
        this.idEvento = value;
    }

    /**
     * Gets the value of the fechaExpiracion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    /**
     * Sets the value of the fechaExpiracion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaExpiracion(String value) {
        this.fechaExpiracion = value;
    }

    /**
     * Gets the value of the fechaInicio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Sets the value of the fechaInicio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaInicio(String value) {
        this.fechaInicio = value;
    }

    /**
     * Gets the value of the duracion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDuracion() {
        return duracion;
    }

    /**
     * Sets the value of the duracion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDuracion(String value) {
        this.duracion = value;
    }

    /**
     * Gets the value of the nombreEvento property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombreEvento() {
        return nombreEvento;
    }

    /**
     * Sets the value of the nombreEvento property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombreEvento(String value) {
        this.nombreEvento = value;
    }

    /**
     * Gets the value of the nombreCorporativo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombreCorporativo() {
        return nombreCorporativo;
    }

    /**
     * Sets the value of the nombreCorporativo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombreCorporativo(String value) {
        this.nombreCorporativo = value;
    }

}
