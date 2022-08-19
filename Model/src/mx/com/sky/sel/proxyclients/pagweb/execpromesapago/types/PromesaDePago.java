
package mx.com.sky.sel.proxyclients.pagweb.execpromesapago.types;

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
 *         &lt;element name="InstitucionPago" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Referencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FechaPago" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromesaDePago", propOrder = { "institucionPago", "referencia", "monto", "fechaPago" })
public class PromesaDePago {

    @XmlElement(name = "InstitucionPago", required = true)
    protected String institucionPago;
    @XmlElement(name = "Referencia", required = true)
    protected String referencia;
    @XmlElement(name = "Monto", required = true)
    protected String monto;
    @XmlElement(name = "FechaPago", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaPago;

    /**
     * Gets the value of the institucionPago property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInstitucionPago() {
        return institucionPago;
    }

    /**
     * Sets the value of the institucionPago property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInstitucionPago(String value) {
        this.institucionPago = value;
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
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMonto() {
        return monto;
    }

    /**
     * Sets the value of the monto property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMonto(String value) {
        this.monto = value;
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

}
