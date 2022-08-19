
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultavetvprices.types;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="respuesta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="respuestaCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CONCEPT_PAYMENT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="REGISTRATION_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",
         propOrder = { "respuesta", "respuestaCode", "id", "code", "conceptpayment", "price", "registrationdate" })
@XmlRootElement(name = "ConsultaVeTVPricesProcessResponse")
public class ConsultaVeTVPricesProcessResponse {

    @XmlElement(required = true)
    protected String respuesta;
    @XmlElement(required = true)
    protected String respuestaCode;
    @XmlElement(name = "ID", required = true, nillable = true)
    protected BigDecimal id;
    @XmlElement(name = "CODE", required = true, nillable = true)
    protected String code;
    @XmlElement(name = "CONCEPT_PAYMENT", required = true, nillable = true)
    protected String conceptpayment;
    @XmlElement(name = "PRICE", required = true, nillable = true)
    protected BigDecimal price;
    @XmlElement(name = "REGISTRATION_DATE", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registrationdate;

    /**
     * Gets the value of the respuesta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * Sets the value of the respuesta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRespuesta(String value) {
        this.respuesta = value;
    }

    /**
     * Gets the value of the respuestaCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRespuestaCode() {
        return respuestaCode;
    }

    /**
     * Sets the value of the respuestaCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRespuestaCode(String value) {
        this.respuestaCode = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setID(BigDecimal value) {
        this.id = value;
    }

    /**
     * Gets the value of the code property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCODE() {
        return code;
    }

    /**
     * Sets the value of the code property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCODE(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the conceptpayment property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCONCEPTPAYMENT() {
        return conceptpayment;
    }

    /**
     * Sets the value of the conceptpayment property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCONCEPTPAYMENT(String value) {
        this.conceptpayment = value;
    }

    /**
     * Gets the value of the price property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getPRICE() {
        return price;
    }

    /**
     * Sets the value of the price property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setPRICE(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the registrationdate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getREGISTRATIONDATE() {
        return registrationdate;
    }

    /**
     * Sets the value of the registrationdate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setREGISTRATIONDATE(XMLGregorianCalendar value) {
        this.registrationdate = value;
    }

}
