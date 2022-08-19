
package mx.com.sky.enterprisemessages.sel.administrartarjetapago;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import mx.com.sky.enterpriseobjects.sel.tarjetapagoebo.DatosTarjetaPagoType;


/**
 * <p>Java class for ConsultarTarjetasOutputType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarTarjetasOutputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdTarjeta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numeroCuentaCliente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/TarjetaPagoEBO}DatosTarjetaPago"/&gt;
 *         &lt;element name="fechaRegistro" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="fechaModificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarTarjetasOutputType",
         propOrder =
         { "idTarjeta", "numeroCuentaCliente", "datosTarjetaPago",
           "fechaRegistro", "fechaModificacion"
    })
public class ConsultarTarjetasOutputType {

    @XmlElement(name = "IdTarjeta", required = true)
    protected String idTarjeta;
    @XmlElement(required = true)
    protected String numeroCuentaCliente;
    @XmlElement(name = "DatosTarjetaPago",
                namespace =
                "http://www.sky.com.mx/EnterpriseObjects/Sel/TarjetaPagoEBO",
                required = true)
    protected DatosTarjetaPagoType datosTarjetaPago;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRegistro;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaModificacion;

    /**
     * Gets the value of the idTarjeta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdTarjeta() {
        return idTarjeta;
    }

    /**
     * Sets the value of the idTarjeta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdTarjeta(String value) {
        this.idTarjeta = value;
    }

    /**
     * Gets the value of the numeroCuentaCliente property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroCuentaCliente() {
        return numeroCuentaCliente;
    }

    /**
     * Sets the value of the numeroCuentaCliente property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroCuentaCliente(String value) {
        this.numeroCuentaCliente = value;
    }

    /**
     * Gets the value of the datosTarjetaPago property.
     *
     * @return
     *     possible object is
     *     {@link DatosTarjetaPagoType }
     *
     */
    public DatosTarjetaPagoType getDatosTarjetaPago() {
        return datosTarjetaPago;
    }

    /**
     * Sets the value of the datosTarjetaPago property.
     *
     * @param value
     *     allowed object is
     *     {@link DatosTarjetaPagoType }
     *
     */
    public void setDatosTarjetaPago(DatosTarjetaPagoType value) {
        this.datosTarjetaPago = value;
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
     * Gets the value of the fechaModificacion property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaModificacion() {
        return fechaModificacion;
    }

    /**
     * Sets the value of the fechaModificacion property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFechaModificacion(XMLGregorianCalendar value) {
        this.fechaModificacion = value;
    }

}
