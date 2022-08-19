
package com.oracle.xmlns.consultas.pwconsultainformacionfiscal.consultainformacionfiscal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cabeceraEntradaInformacionFiscal complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="cabeceraEntradaInformacionFiscal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aplicativo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cabeceraEntradaInformacionFiscal", propOrder = { "operacion", "aplicativo" })
public class CabeceraEntradaInformacionFiscal {

    @XmlElement(required = true)
    protected String operacion;
    @XmlElement(required = true)
    protected String aplicativo;

    /**
     * Gets the value of the operacion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     * Sets the value of the operacion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOperacion(String value) {
        this.operacion = value;
    }

    /**
     * Gets the value of the aplicativo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAplicativo() {
        return aplicativo;
    }

    /**
     * Sets the value of the aplicativo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAplicativo(String value) {
        this.aplicativo = value;
    }

}
