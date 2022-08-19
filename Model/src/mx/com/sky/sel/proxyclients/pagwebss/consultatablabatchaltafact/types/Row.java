
package mx.com.sky.sel.proxyclients.pagwebss.consultatablabatchaltafact.types;

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
 *         &lt;element name="noCuentaSKY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="subArea" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rfc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="compania" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoFactura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="metodoEnvio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="poblacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="delMunicipio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="colonia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codigoPostal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="calle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="noExterior" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="noInterior" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "Row",
         propOrder =
         { "bpelId", "status", "fechaCreacion", "noSolicitud", "noCuentaSKY", "area", "subArea", "rfc", "razonSocial",
           "compania", "tipoFactura", "metodoEnvio", "estado", "poblacion", "delMunicipio", "colonia", "codigoPostal",
           "calle", "noExterior", "noInterior", "nombreCorporativo"
    })
public class Row {

    @XmlElement(required = true)
    protected String bpelId;
    @XmlElement(required = true)
    protected String status;
    @XmlElementRef(name = "fechaCreacion", namespace = "http://xmlns.oracle.com/ConsultaTablaBatchSSAltaFacturacion",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaCreacion;
    @XmlElement(required = true)
    protected String noSolicitud;
    @XmlElement(required = true)
    protected String noCuentaSKY;
    @XmlElement(required = true)
    protected String area;
    @XmlElement(required = true)
    protected String subArea;
    @XmlElement(required = true)
    protected String rfc;
    @XmlElement(required = true)
    protected String razonSocial;
    @XmlElement(required = true)
    protected String compania;
    @XmlElement(required = true)
    protected String tipoFactura;
    @XmlElement(required = true)
    protected String metodoEnvio;
    @XmlElement(required = true)
    protected String estado;
    @XmlElement(required = true)
    protected String poblacion;
    @XmlElement(required = true)
    protected String delMunicipio;
    @XmlElement(required = true)
    protected String colonia;
    @XmlElement(required = true)
    protected String codigoPostal;
    @XmlElement(required = true)
    protected String calle;
    @XmlElement(required = true)
    protected String noExterior;
    @XmlElement(required = true)
    protected String noInterior;
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
     * Gets the value of the noCuentaSKY property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNoCuentaSKY() {
        return noCuentaSKY;
    }

    /**
     * Sets the value of the noCuentaSKY property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNoCuentaSKY(String value) {
        this.noCuentaSKY = value;
    }

    /**
     * Gets the value of the area property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setArea(String value) {
        this.area = value;
    }

    /**
     * Gets the value of the subArea property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubArea() {
        return subArea;
    }

    /**
     * Sets the value of the subArea property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubArea(String value) {
        this.subArea = value;
    }

    /**
     * Gets the value of the rfc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Sets the value of the rfc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRfc(String value) {
        this.rfc = value;
    }

    /**
     * Gets the value of the razonSocial property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Sets the value of the razonSocial property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRazonSocial(String value) {
        this.razonSocial = value;
    }

    /**
     * Gets the value of the compania property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCompania() {
        return compania;
    }

    /**
     * Sets the value of the compania property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCompania(String value) {
        this.compania = value;
    }

    /**
     * Gets the value of the tipoFactura property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoFactura() {
        return tipoFactura;
    }

    /**
     * Sets the value of the tipoFactura property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoFactura(String value) {
        this.tipoFactura = value;
    }

    /**
     * Gets the value of the metodoEnvio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMetodoEnvio() {
        return metodoEnvio;
    }

    /**
     * Sets the value of the metodoEnvio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMetodoEnvio(String value) {
        this.metodoEnvio = value;
    }

    /**
     * Gets the value of the estado property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEstado(String value) {
        this.estado = value;
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

    /**
     * Gets the value of the delMunicipio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDelMunicipio() {
        return delMunicipio;
    }

    /**
     * Sets the value of the delMunicipio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDelMunicipio(String value) {
        this.delMunicipio = value;
    }

    /**
     * Gets the value of the colonia property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * Sets the value of the colonia property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setColonia(String value) {
        this.colonia = value;
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
     * Gets the value of the calle property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Sets the value of the calle property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCalle(String value) {
        this.calle = value;
    }

    /**
     * Gets the value of the noExterior property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNoExterior() {
        return noExterior;
    }

    /**
     * Sets the value of the noExterior property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNoExterior(String value) {
        this.noExterior = value;
    }

    /**
     * Gets the value of the noInterior property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNoInterior() {
        return noInterior;
    }

    /**
     * Sets the value of the noInterior property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNoInterior(String value) {
        this.noInterior = value;
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
