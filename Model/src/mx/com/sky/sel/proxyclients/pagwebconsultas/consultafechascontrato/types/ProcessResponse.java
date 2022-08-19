
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultafechascontrato.types;

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
 *         &lt;element name="respuestadesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CUENTA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PAQUETE_ACTUAL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FECHA_INICIO_CONTRATO" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="FECHA_FIN_CONTRATO" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ESTATUS_CONTRATO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PLAZO_FORZOSO" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DIASPLAZOFORZOSO" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
         propOrder =
         { "respuesta", "respuestadesc", "cuenta", "paqueteactual", "fechainiciocontrato", "fechafincontrato",
           "estatuscontrato", "plazoforzoso", "diasplazoforzoso"
    })
@XmlRootElement(name = "processResponse")
public class ProcessResponse {

    @XmlElement(required = true)
    protected String respuesta;
    @XmlElement(required = true)
    protected String respuestadesc;
    @XmlElement(name = "CUENTA", required = true, nillable = true)
    protected String cuenta;
    @XmlElement(name = "PAQUETE_ACTUAL", required = true, nillable = true)
    protected String paqueteactual;
    @XmlElement(name = "FECHA_INICIO_CONTRATO", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechainiciocontrato;
    @XmlElement(name = "FECHA_FIN_CONTRATO", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechafincontrato;
    @XmlElement(name = "ESTATUS_CONTRATO", required = true, nillable = true)
    protected String estatuscontrato;
    @XmlElement(name = "PLAZO_FORZOSO", required = true, nillable = true)
    protected BigDecimal plazoforzoso;
    @XmlElement(name = "DIASPLAZOFORZOSO", required = true, nillable = true)
    protected BigDecimal diasplazoforzoso;

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
     * Gets the value of the respuestadesc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRespuestadesc() {
        return respuestadesc;
    }

    /**
     * Sets the value of the respuestadesc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRespuestadesc(String value) {
        this.respuestadesc = value;
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
     * Gets the value of the paqueteactual property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPAQUETEACTUAL() {
        return paqueteactual;
    }

    /**
     * Sets the value of the paqueteactual property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPAQUETEACTUAL(String value) {
        this.paqueteactual = value;
    }

    /**
     * Gets the value of the fechainiciocontrato property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFECHAINICIOCONTRATO() {
        return fechainiciocontrato;
    }

    /**
     * Sets the value of the fechainiciocontrato property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFECHAINICIOCONTRATO(XMLGregorianCalendar value) {
        this.fechainiciocontrato = value;
    }

    /**
     * Gets the value of the fechafincontrato property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFECHAFINCONTRATO() {
        return fechafincontrato;
    }

    /**
     * Sets the value of the fechafincontrato property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFECHAFINCONTRATO(XMLGregorianCalendar value) {
        this.fechafincontrato = value;
    }

    /**
     * Gets the value of the estatuscontrato property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getESTATUSCONTRATO() {
        return estatuscontrato;
    }

    /**
     * Sets the value of the estatuscontrato property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setESTATUSCONTRATO(String value) {
        this.estatuscontrato = value;
    }

    /**
     * Gets the value of the plazoforzoso property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getPLAZOFORZOSO() {
        return plazoforzoso;
    }

    /**
     * Sets the value of the plazoforzoso property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setPLAZOFORZOSO(BigDecimal value) {
        this.plazoforzoso = value;
    }

    /**
     * Gets the value of the diasplazoforzoso property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getDIASPLAZOFORZOSO() {
        return diasplazoforzoso;
    }

    /**
     * Sets the value of the diasplazoforzoso property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setDIASPLAZOFORZOSO(BigDecimal value) {
        this.diasplazoforzoso = value;
    }

}
