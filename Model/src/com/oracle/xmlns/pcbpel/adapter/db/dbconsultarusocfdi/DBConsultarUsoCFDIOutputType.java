
package com.oracle.xmlns.pcbpel.adapter.db.dbconsultarusocfdi;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DBConsultarUsoCFDIOutputType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DBConsultarUsoCFDIOutputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REGIMEN_FISCAL" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="descripcion_regimen_fiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CFI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descripcion_usocfdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PERSONA_FISICA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PERSONA_MORAL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DBConsultarUsoCFDIOutputType",
         propOrder = { "cfdi", "descripcion", "personafisica", "personamoral", "fechainiciovigencia", "fechafinvigencia"
    })
public class DBConsultarUsoCFDIOutputType {

    @XmlElement(name = "PERSONA_FISICA", required = true, nillable = true)
    protected String personafisica;
    @XmlElement(name = "PERSONA_MORAL", required = true, nillable = true)
    protected String personamoral;
    @XmlElement(name = "CFDI", required = true, nillable = true)
    protected String cfdi;
    @XmlElement(name = "DESCRIPCION", required = true, nillable = true)
    protected String descripcion;
    @XmlElement(name = "FECHA_FIN_VIGENCIA", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechafinvigencia;
    @XmlElement(name = "FECHA_INICIO_VIGENCIA", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechainiciovigencia;


    /**
     * Gets the value of the personafisica property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPERSONAFISICA() {
        return personafisica;
    }

    /**
     * Sets the value of the personafisica property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPERSONAFISICA(String value) {
        this.personafisica = value;
    }

    /**
     * Gets the value of the personamoral property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPERSONAMORAL() {
        return personamoral;
    }

    /**
     * Sets the value of the personamoral property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPERSONAMORAL(String value) {
        this.personamoral = value;
    }

    /**
     * Gets the value of the cfdi property.
     *
     * @return
     * possible object is
     * {@link String}
     *
     */
    public String getCFDI() {
        return cfdi;
    }

    /**
     * Gets the value of the descripcion property.
     *
     * @return
     * possible object is
     * {@link String}
     *
     */
    public String getDESCRIPCION() {
        return descripcion;
    }

    /**
     * Gets the value of the fechafinvigencia property.
     *
     * @return
     * possible object is
     * {@link XMLGregorianCalendar}
     *
     */
    public XMLGregorianCalendar getFECHAFINVIGENCIA() {
        return fechafinvigencia;
    }

    /**
     * Gets the value of the fechainiciovigencia property.
     *
     * @return
     * possible object is
     * {@link XMLGregorianCalendar}
     *
     */
    public XMLGregorianCalendar getFECHAINICIOVIGENCIA() {
        return fechainiciovigencia;
    }

    /**
     * Sets the value of the cfdi property.
     *
     * @param value
     * allowed object is
     * {@link String}
     *
     */
    public void setCFDI(String value) {
        this.cfdi = value;
    }

    /**
     * Sets the value of the descripcion property.
     *
     * @param value
     * allowed object is
     * {@link String}
     *
     */
    public void setDESCRIPCION(String value) {
        this.descripcion = value;
    }

    /**
     * Sets the value of the fechafinvigencia property.
     *
     * @param value
     * allowed object is
     * {@link XMLGregorianCalendar}
     *
     */
    public void setFECHAFINVIGENCIA(XMLGregorianCalendar value) {
        this.fechafinvigencia = value;
    }

    /**
     * Sets the value of the fechainiciovigencia property.
     *
     * @param value
     * allowed object is
     * {@link XMLGregorianCalendar}
     *
     */
    public void setFECHAINICIOVIGENCIA(XMLGregorianCalendar value) {
        this.fechainiciovigencia = value;
    }

}
