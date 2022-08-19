
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultareenviosenal.types;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ConsultaReenvioSenalBDOutput complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultaReenvioSenalBDOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="USER_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CUENTA_SKY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PAQUETE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PAIS_ISO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FECHA_REGISTRO" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="REENVIO_ACTIVO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaReenvioSenalBDOutput",
         propOrder = { "id", "userid", "cuentasky", "ti", "paquete", "paisiso", "fecharegistro", "reenvioactivo"
    })
public class ConsultaReenvioSenalBDOutput {

    @XmlElement(name = "ID", required = true)
    protected BigDecimal id;
    @XmlElement(name = "USER_ID", required = true)
    protected String userid;
    @XmlElement(name = "CUENTA_SKY", required = true)
    protected String cuentasky;
    @XmlElement(name = "TI", required = true)
    protected String ti;
    @XmlElement(name = "PAQUETE", required = true)
    protected String paquete;
    @XmlElement(name = "PAIS_ISO", required = true)
    protected String paisiso;
    @XmlElement(name = "FECHA_REGISTRO", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecharegistro;
    @XmlElement(name = "REENVIO_ACTIVO", required = true)
    protected String reenvioactivo;

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
     * Gets the value of the userid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUSERID() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUSERID(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the cuentasky property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCUENTASKY() {
        return cuentasky;
    }

    /**
     * Sets the value of the cuentasky property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCUENTASKY(String value) {
        this.cuentasky = value;
    }

    /**
     * Gets the value of the ti property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTI() {
        return ti;
    }

    /**
     * Sets the value of the ti property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTI(String value) {
        this.ti = value;
    }

    /**
     * Gets the value of the paquete property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPAQUETE() {
        return paquete;
    }

    /**
     * Sets the value of the paquete property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPAQUETE(String value) {
        this.paquete = value;
    }

    /**
     * Gets the value of the paisiso property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPAISISO() {
        return paisiso;
    }

    /**
     * Sets the value of the paisiso property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPAISISO(String value) {
        this.paisiso = value;
    }

    /**
     * Gets the value of the fecharegistro property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFECHAREGISTRO() {
        return fecharegistro;
    }

    /**
     * Sets the value of the fecharegistro property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFECHAREGISTRO(XMLGregorianCalendar value) {
        this.fecharegistro = value;
    }

    /**
     * Gets the value of the reenvioactivo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getREENVIOACTIVO() {
        return reenvioactivo;
    }

    /**
     * Sets the value of the reenvioactivo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setREENVIOACTIVO(String value) {
        this.reenvioactivo = value;
    }

}
