
package mx.com.sky.sel.proxyclients.pagwebss.consultatablabatch.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PwBatchSs complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PwBatchSs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bpelId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="status" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fechaCreacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="noSolicitud" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="llaveOperacion"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="13"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="descripcion" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tipoEvento" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="costoEvento" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="canalDisplay" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="canal" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="idEvento" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fechaExpiracion" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fechaInicio" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="duracion" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nombreEvento" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nombreCorporativo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="500"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="area" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PwBatchSs",
         propOrder =
         { "bpelId", "status", "fechaCreacion", "noSolicitud", "llaveOperacion", "descripcion", "tipoEvento",
           "costoEvento", "canalDisplay", "canal", "idEvento", "fechaExpiracion", "fechaInicio", "duracion",
           "nombreEvento", "nombreCorporativo", "area"
    })
public class PwBatchSs {

    @XmlElement(required = true)
    protected String bpelId;
    @XmlElementRef(name = "status", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "fechaCreacion", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaCreacion;
    @XmlElementRef(name = "noSolicitud", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> noSolicitud;
    @XmlElement(required = true, nillable = true)
    protected String llaveOperacion;
    @XmlElementRef(name = "descripcion", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcion;
    @XmlElementRef(name = "tipoEvento", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoEvento;
    @XmlElementRef(name = "costoEvento", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> costoEvento;
    @XmlElementRef(name = "canalDisplay", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> canalDisplay;
    @XmlElementRef(name = "canal", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> canal;
    @XmlElementRef(name = "idEvento", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> idEvento;
    @XmlElementRef(name = "fechaExpiracion",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaExpiracion;
    @XmlElementRef(name = "fechaInicio", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaInicio;
    @XmlElementRef(name = "duracion", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> duracion;
    @XmlElementRef(name = "nombreEvento", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreEvento;
    @XmlElementRef(name = "nombreCorporativo",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreCorporativo;
    @XmlElementRef(name = "area", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/ConsultaBatchSS",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> area;

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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStatus(JAXBElement<String> value) {
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getNoSolicitud() {
        return noSolicitud;
    }

    /**
     * Sets the value of the noSolicitud property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setNoSolicitud(JAXBElement<String> value) {
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setDescripcion(JAXBElement<String> value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the tipoEvento property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getTipoEvento() {
        return tipoEvento;
    }

    /**
     * Sets the value of the tipoEvento property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setTipoEvento(JAXBElement<String> value) {
        this.tipoEvento = value;
    }

    /**
     * Gets the value of the costoEvento property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCostoEvento() {
        return costoEvento;
    }

    /**
     * Sets the value of the costoEvento property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCostoEvento(JAXBElement<String> value) {
        this.costoEvento = value;
    }

    /**
     * Gets the value of the canalDisplay property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCanalDisplay() {
        return canalDisplay;
    }

    /**
     * Sets the value of the canalDisplay property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCanalDisplay(JAXBElement<String> value) {
        this.canalDisplay = value;
    }

    /**
     * Gets the value of the canal property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCanal() {
        return canal;
    }

    /**
     * Sets the value of the canal property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCanal(JAXBElement<String> value) {
        this.canal = value;
    }

    /**
     * Gets the value of the idEvento property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getIdEvento() {
        return idEvento;
    }

    /**
     * Sets the value of the idEvento property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setIdEvento(JAXBElement<String> value) {
        this.idEvento = value;
    }

    /**
     * Gets the value of the fechaExpiracion property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getFechaExpiracion() {
        return fechaExpiracion;
    }

    /**
     * Sets the value of the fechaExpiracion property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setFechaExpiracion(JAXBElement<String> value) {
        this.fechaExpiracion = value;
    }

    /**
     * Gets the value of the fechaInicio property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Sets the value of the fechaInicio property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setFechaInicio(JAXBElement<String> value) {
        this.fechaInicio = value;
    }

    /**
     * Gets the value of the duracion property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getDuracion() {
        return duracion;
    }

    /**
     * Sets the value of the duracion property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setDuracion(JAXBElement<String> value) {
        this.duracion = value;
    }

    /**
     * Gets the value of the nombreEvento property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getNombreEvento() {
        return nombreEvento;
    }

    /**
     * Sets the value of the nombreEvento property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setNombreEvento(JAXBElement<String> value) {
        this.nombreEvento = value;
    }

    /**
     * Gets the value of the nombreCorporativo property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getNombreCorporativo() {
        return nombreCorporativo;
    }

    /**
     * Sets the value of the nombreCorporativo property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setNombreCorporativo(JAXBElement<String> value) {
        this.nombreCorporativo = value;
    }

    /**
     * Gets the value of the area property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setArea(JAXBElement<String> value) {
        this.area = value;
    }

}
