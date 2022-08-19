
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultavetvfechasrenta.types;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ConsultaFechasSIEBELOutType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultaFechasSIEBELOutType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CUENTA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TARJETA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FECHA_INICIO" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="FECHA_FIN" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="SYSDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DIAS_FIN_RECARGA" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaFechasSIEBELOutType",
         propOrder = { "accountid", "cuenta", "tarjeta", "fechainicio", "fechafin", "sysdate", "diasfinrecarga"
    })
public class ConsultaFechasSIEBELOutType {

    @XmlElement(name = "ACCOUNT_ID", required = true, nillable = true)
    protected String accountid;
    @XmlElement(name = "CUENTA", required = true, nillable = true)
    protected String cuenta;
    @XmlElement(name = "TARJETA", required = true, nillable = true)
    protected String tarjeta;
    @XmlElement(name = "FECHA_INICIO", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechainicio;
    @XmlElement(name = "FECHA_FIN", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechafin;
    @XmlElement(name = "SYSDATE", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sysdate;
    @XmlElement(name = "DIAS_FIN_RECARGA", required = true, nillable = true)
    protected BigDecimal diasfinrecarga;

    /**
     * Gets the value of the accountid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getACCOUNTID() {
        return accountid;
    }

    /**
     * Sets the value of the accountid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setACCOUNTID(String value) {
        this.accountid = value;
    }

    /**
     * Gets the value of the cuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCUENTA() {
        return cuenta;
    }

    /**
     * Sets the value of the cuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCUENTA(String value) {
        this.cuenta = value;
    }

    /**
     * Gets the value of the tarjeta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTARJETA() {
        return tarjeta;
    }

    /**
     * Sets the value of the tarjeta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTARJETA(String value) {
        this.tarjeta = value;
    }

    /**
     * Gets the value of the fechainicio property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFECHAINICIO() {
        return fechainicio;
    }

    /**
     * Sets the value of the fechainicio property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFECHAINICIO(XMLGregorianCalendar value) {
        this.fechainicio = value;
    }

    /**
     * Gets the value of the fechafin property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFECHAFIN() {
        return fechafin;
    }

    /**
     * Sets the value of the fechafin property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFECHAFIN(XMLGregorianCalendar value) {
        this.fechafin = value;
    }

    /**
     * Gets the value of the sysdate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getSYSDATE() {
        return sysdate;
    }

    /**
     * Sets the value of the sysdate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setSYSDATE(XMLGregorianCalendar value) {
        this.sysdate = value;
    }

    /**
     * Gets the value of the diasfinrecarga property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getDIASFINRECARGA() {
        return diasfinrecarga;
    }

    /**
     * Sets the value of the diasfinrecarga property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setDIASFINRECARGA(BigDecimal value) {
        this.diasfinrecarga = value;
    }

}
