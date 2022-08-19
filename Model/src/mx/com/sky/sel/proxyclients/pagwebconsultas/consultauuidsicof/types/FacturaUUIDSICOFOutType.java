
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultauuidsicof.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FacturaUUIDSICOFOutType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FacturaUUIDSICOFOutType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CuentaSKY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TipoArchivo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="factura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FechaTimbrado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="id_doc_edicom" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="serie" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacturaUUIDSICOFOutType",
         propOrder =
         { "uuid", "cuentaSKY", "tipoArchivo", "factura", "fechaTimbrado", "descripcion", "idDocEdicom", "serie"
    })
public class FacturaUUIDSICOFOutType {

    @XmlElement(required = true, nillable = true)
    protected String uuid;
    @XmlElement(name = "CuentaSKY", required = true, nillable = true)
    protected String cuentaSKY;
    @XmlElement(name = "TipoArchivo", required = true, nillable = true)
    protected String tipoArchivo;
    @XmlElement(required = true, nillable = true)
    protected String factura;
    @XmlElement(name = "FechaTimbrado", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaTimbrado;
    @XmlElement(name = "Descripcion", required = true, nillable = true)
    protected String descripcion;
    @XmlElement(name = "id_doc_edicom", required = true, type = Integer.class, nillable = true)
    protected Integer idDocEdicom;
    @XmlElement(required = true, nillable = true)
    protected String serie;

    /**
     * Gets the value of the uuid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the cuentaSKY property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCuentaSKY() {
        return cuentaSKY;
    }

    /**
     * Sets the value of the cuentaSKY property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCuentaSKY(String value) {
        this.cuentaSKY = value;
    }

    /**
     * Gets the value of the tipoArchivo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoArchivo() {
        return tipoArchivo;
    }

    /**
     * Sets the value of the tipoArchivo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoArchivo(String value) {
        this.tipoArchivo = value;
    }

    /**
     * Gets the value of the factura property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFactura() {
        return factura;
    }

    /**
     * Sets the value of the factura property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFactura(String value) {
        this.factura = value;
    }

    /**
     * Gets the value of the fechaTimbrado property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaTimbrado() {
        return fechaTimbrado;
    }

    /**
     * Sets the value of the fechaTimbrado property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFechaTimbrado(XMLGregorianCalendar value) {
        this.fechaTimbrado = value;
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
     * Gets the value of the idDocEdicom property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getIdDocEdicom() {
        return idDocEdicom;
    }

    /**
     * Sets the value of the idDocEdicom property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setIdDocEdicom(Integer value) {
        this.idDocEdicom = value;
    }

    /**
     * Gets the value of the serie property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Sets the value of the serie property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSerie(String value) {
        this.serie = value;
    }

}
