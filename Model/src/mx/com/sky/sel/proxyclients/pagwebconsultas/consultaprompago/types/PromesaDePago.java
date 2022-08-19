
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultaprompago.types;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PromesaDePago complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PromesaDePago"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CuentaSKY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InstitucionDePago" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Referencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Estatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FechaPago" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="FechaRegistro" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="NoSolicitud" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromesaDePago",
         propOrder =
         { "id", "userID", "cuentaSKY", "institucionDePago", "referencia", "monto", "estatus", "fechaPago",
           "fechaRegistro", "noSolicitud", "descripcion"
    })
public class PromesaDePago {

    @XmlElement(name = "ID", required = true)
    protected BigInteger id;
    @XmlElement(name = "UserID", required = true)
    protected String userID;
    @XmlElement(name = "CuentaSKY", required = true)
    protected String cuentaSKY;
    @XmlElement(name = "InstitucionDePago", required = true)
    protected String institucionDePago;
    @XmlElement(name = "Referencia", required = true)
    protected String referencia;
    @XmlElement(name = "Monto")
    protected float monto;
    @XmlElement(name = "Estatus", required = true)
    protected String estatus;
    @XmlElement(name = "FechaPago", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaPago;
    @XmlElement(name = "FechaRegistro", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRegistro;
    @XmlElement(name = "NoSolicitud", required = true)
    protected String noSolicitud;
    @XmlElement(name = "Descripcion", required = true)
    protected String descripcion;

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setID(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the userID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUserID(String value) {
        this.userID = value;
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
     * Gets the value of the institucionDePago property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInstitucionDePago() {
        return institucionDePago;
    }

    /**
     * Sets the value of the institucionDePago property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInstitucionDePago(String value) {
        this.institucionDePago = value;
    }

    /**
     * Gets the value of the referencia property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Sets the value of the referencia property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReferencia(String value) {
        this.referencia = value;
    }

    /**
     * Gets the value of the monto property.
     *
     */
    public float getMonto() {
        return monto;
    }

    /**
     * Sets the value of the monto property.
     *
     */
    public void setMonto(float value) {
        this.monto = value;
    }

    /**
     * Gets the value of the estatus property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEstatus() {
        return estatus;
    }

    /**
     * Sets the value of the estatus property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEstatus(String value) {
        this.estatus = value;
    }

    /**
     * Gets the value of the fechaPago property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaPago() {
        return fechaPago;
    }

    /**
     * Sets the value of the fechaPago property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFechaPago(XMLGregorianCalendar value) {
        this.fechaPago = value;
    }

    /**
     * Gets the value of the fechaRegistro property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Sets the value of the fechaRegistro property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFechaRegistro(XMLGregorianCalendar value) {
        this.fechaRegistro = value;
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

}
