
package mx.com.sky.enterpriseobjects.sicof.consultarfactura;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ConsultarFacturaEBOType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarFacturaEBOType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CuentaSKY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoArchivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="factura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechacorte" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaTimbrado" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_doc_edicom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarFacturaEBOType",
         propOrder =
         { "uuid", "cuentaSKY", "tipoArchivo", "factura", "fechacorte", "fechaTimbrado", "descripcion", "idDocEdicom",
           "serie", "pac"
    })
public class ConsultarFacturaEBOType {

    @XmlElementRef(name = "uuid", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> uuid;
    @XmlElementRef(name = "CuentaSKY", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> cuentaSKY;
    @XmlElementRef(name = "TipoArchivo", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoArchivo;
    @XmlElementRef(name = "factura", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> factura;
    @XmlElementRef(name = "fechacorte", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechacorte;
    @XmlElementRef(name = "FechaTimbrado", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaTimbrado;
    @XmlElementRef(name = "Descripcion", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcion;
    @XmlElementRef(name = "id_doc_edicom", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idDocEdicom;
    @XmlElementRef(name = "serie", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> serie;
    @XmlElementRef(name = "Pac", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sicof/ConsultarFactura",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> pac;

    /**
     * Gets the value of the uuid property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setUuid(JAXBElement<String> value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the cuentaSKY property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCuentaSKY() {
        return cuentaSKY;
    }

    /**
     * Sets the value of the cuentaSKY property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCuentaSKY(JAXBElement<String> value) {
        this.cuentaSKY = value;
    }

    /**
     * Gets the value of the tipoArchivo property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getTipoArchivo() {
        return tipoArchivo;
    }

    /**
     * Sets the value of the tipoArchivo property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setTipoArchivo(JAXBElement<String> value) {
        this.tipoArchivo = value;
    }

    /**
     * Gets the value of the factura property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getFactura() {
        return factura;
    }

    /**
     * Sets the value of the factura property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setFactura(JAXBElement<String> value) {
        this.factura = value;
    }

    /**
     * Gets the value of the fechacorte property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *
     */
    public JAXBElement<XMLGregorianCalendar> getFechacorte() {
        return fechacorte;
    }

    /**
     * Sets the value of the fechacorte property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *
     */
    public void setFechacorte(JAXBElement<XMLGregorianCalendar> value) {
        this.fechacorte = value;
    }

    /**
     * Gets the value of the fechaTimbrado property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *
     */
    public JAXBElement<XMLGregorianCalendar> getFechaTimbrado() {
        return fechaTimbrado;
    }

    /**
     * Sets the value of the fechaTimbrado property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *
     */
    public void setFechaTimbrado(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaTimbrado = value;
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
     * Gets the value of the idDocEdicom property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *
     */
    public JAXBElement<Integer> getIdDocEdicom() {
        return idDocEdicom;
    }

    /**
     * Sets the value of the idDocEdicom property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *
     */
    public void setIdDocEdicom(JAXBElement<Integer> value) {
        this.idDocEdicom = value;
    }

    /**
     * Gets the value of the serie property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getSerie() {
        return serie;
    }

    /**
     * Sets the value of the serie property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setSerie(JAXBElement<String> value) {
        this.serie = value;
    }

    /**
     * Gets the value of the pac property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPac() {
        return pac;
    }

    /**
     * Sets the value of the pac property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPac(JAXBElement<String> value) {
        this.pac = value;
    }

}
