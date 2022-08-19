
package com.oracle.xmlns.pcbpel.adapter.db.dbunificadoregimenfiscal;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DBUnificadoregimenfiscalOutputType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DBUnificadoregimenfiscalOutputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Regimen_fiscal" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="persona_fisica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="persona_moral" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DBUnificadoregimenfiscalOutputType",
         propOrder = { "regimenFiscal", "descripcion", "personaFisica", "personaMoral" })
public class DBUnificadoregimenfiscalOutputType {

    @XmlElement(name = "Regimen_fiscal", required = true, nillable = true)
    protected BigDecimal regimenFiscal;
    @XmlElement(required = true, nillable = true)
    protected String descripcion;
    @XmlElement(name = "persona_fisica", required = true, nillable = true)
    protected String personaFisica;
    @XmlElement(name = "persona_moral", required = true, nillable = true)
    protected String personaMoral;

    /**
     * Gets the value of the regimenFiscal property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getRegimenFiscal() {
        return regimenFiscal;
    }

    /**
     * Sets the value of the regimenFiscal property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setRegimenFiscal(BigDecimal value) {
        this.regimenFiscal = value;
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
     * Gets the value of the personaFisica property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPersonaFisica() {
        return personaFisica;
    }

    /**
     * Sets the value of the personaFisica property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPersonaFisica(String value) {
        this.personaFisica = value;
    }

    /**
     * Gets the value of the personaMoral property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPersonaMoral() {
        return personaMoral;
    }

    /**
     * Sets the value of the personaMoral property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPersonaMoral(String value) {
        this.personaMoral = value;
    }

}
