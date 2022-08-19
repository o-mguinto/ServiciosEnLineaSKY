
package com.oracle.xmlns.consultas.pwconsultainformacionfiscal.consultainformacionfiscal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="cabeceraEntrada" type="{http://xmlns.oracle.com/Consultas/PWConsultaInformacionFiscal/ConsultaInformacionFiscal}cabeceraEntradaInformacionFiscal"/&gt;
 *         &lt;element name="numeroCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "cabeceraEntrada", "numeroCuenta" })
@XmlRootElement(name = "proceso")
public class Proceso {

    @XmlElement(required = true)
    protected CabeceraEntradaInformacionFiscal cabeceraEntrada;
    @XmlElement(required = true)
    protected String numeroCuenta;

    /**
     * Gets the value of the cabeceraEntrada property.
     *
     * @return
     *     possible object is
     *     {@link CabeceraEntradaInformacionFiscal }
     *
     */
    public CabeceraEntradaInformacionFiscal getCabeceraEntrada() {
        return cabeceraEntrada;
    }

    /**
     * Sets the value of the cabeceraEntrada property.
     *
     * @param value
     *     allowed object is
     *     {@link CabeceraEntradaInformacionFiscal }
     *
     */
    public void setCabeceraEntrada(CabeceraEntradaInformacionFiscal value) {
        this.cabeceraEntrada = value;
    }

    /**
     * Gets the value of the numeroCuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Sets the value of the numeroCuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroCuenta(String value) {
        this.numeroCuenta = value;
    }

}
