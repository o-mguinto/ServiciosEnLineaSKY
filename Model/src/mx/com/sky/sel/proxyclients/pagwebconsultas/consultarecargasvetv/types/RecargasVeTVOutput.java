
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultarecargasvetv.types;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RecargasVeTVOutput complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RecargasVeTVOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NUM__CUENTA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Estatus_VeTV" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Status_VeTV_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="TIPO_CLIENTE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NUM__CONTRATO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FECHA_INICIO" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="FECHA_FINAL" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="STAT_CD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PLAZO_FORZOSO_VETV" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecargasVeTVOutput",
         propOrder =
         { "numcuenta", "estatusVeTV", "statusVeTVDate", "tipocliente", "numcontrato", "fechainicio", "fechafinal",
           "statcd", "plazoforzosovetv"
    })
public class RecargasVeTVOutput {

    @XmlElement(name = "NUM__CUENTA", required = true, nillable = true)
    protected String numcuenta;
    @XmlElement(name = "Estatus_VeTV", required = true, nillable = true)
    protected String estatusVeTV;
    @XmlElement(name = "Status_VeTV_Date", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusVeTVDate;
    @XmlElement(name = "TIPO_CLIENTE", required = true, nillable = true)
    protected String tipocliente;
    @XmlElement(name = "NUM__CONTRATO", required = true, nillable = true)
    protected String numcontrato;
    @XmlElement(name = "FECHA_INICIO", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechainicio;
    @XmlElement(name = "FECHA_FINAL", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechafinal;
    @XmlElement(name = "STAT_CD", required = true, nillable = true)
    protected String statcd;
    @XmlElement(name = "PLAZO_FORZOSO_VETV", required = true, nillable = true)
    protected BigDecimal plazoforzosovetv;

    /**
     * Gets the value of the numcuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNUMCUENTA() {
        return numcuenta;
    }

    /**
     * Sets the value of the numcuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNUMCUENTA(String value) {
        this.numcuenta = value;
    }

    /**
     * Gets the value of the estatusVeTV property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEstatusVeTV() {
        return estatusVeTV;
    }

    /**
     * Sets the value of the estatusVeTV property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEstatusVeTV(String value) {
        this.estatusVeTV = value;
    }

    /**
     * Gets the value of the statusVeTVDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getStatusVeTVDate() {
        return statusVeTVDate;
    }

    /**
     * Sets the value of the statusVeTVDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setStatusVeTVDate(XMLGregorianCalendar value) {
        this.statusVeTVDate = value;
    }

    /**
     * Gets the value of the tipocliente property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTIPOCLIENTE() {
        return tipocliente;
    }

    /**
     * Sets the value of the tipocliente property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTIPOCLIENTE(String value) {
        this.tipocliente = value;
    }

    /**
     * Gets the value of the numcontrato property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNUMCONTRATO() {
        return numcontrato;
    }

    /**
     * Sets the value of the numcontrato property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNUMCONTRATO(String value) {
        this.numcontrato = value;
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
     * Gets the value of the fechafinal property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFECHAFINAL() {
        return fechafinal;
    }

    /**
     * Sets the value of the fechafinal property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFECHAFINAL(XMLGregorianCalendar value) {
        this.fechafinal = value;
    }

    /**
     * Gets the value of the statcd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSTATCD() {
        return statcd;
    }

    /**
     * Sets the value of the statcd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSTATCD(String value) {
        this.statcd = value;
    }

    /**
     * Gets the value of the plazoforzosovetv property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getPLAZOFORZOSOVETV() {
        return plazoforzosovetv;
    }

    /**
     * Sets the value of the plazoforzosovetv property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setPLAZOFORZOSOVETV(BigDecimal value) {
        this.plazoforzosovetv = value;
    }

}
