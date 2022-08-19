
package com.oracle.xmlns.pwoperaciones.pwconfiggenerales.bpelpwconfiggenerales;

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
 *         &lt;element name="cabeceraEntrada" type="{http://xmlns.oracle.com/PWOperaciones/PWConfigGenerales/BPELPWConfigGenerales}cabeceraEntrada"/&gt;
 *         &lt;element name="entrada" type="{http://xmlns.oracle.com/PWOperaciones/PWConfigGenerales/BPELPWConfigGenerales}entrada"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "cabeceraEntrada", "entrada" })
@XmlRootElement(name = "proceso")
public class Proceso {

    @XmlElement(required = true)
    protected CabeceraEntrada cabeceraEntrada;
    @XmlElement(required = true)
    protected Entrada entrada;

    /**
     * Gets the value of the cabeceraEntrada property.
     *
     * @return
     *     possible object is
     *     {@link CabeceraEntrada }
     *
     */
    public CabeceraEntrada getCabeceraEntrada() {
        return cabeceraEntrada;
    }

    /**
     * Sets the value of the cabeceraEntrada property.
     *
     * @param value
     *     allowed object is
     *     {@link CabeceraEntrada }
     *
     */
    public void setCabeceraEntrada(CabeceraEntrada value) {
        this.cabeceraEntrada = value;
    }

    /**
     * Gets the value of the entrada property.
     *
     * @return
     *     possible object is
     *     {@link Entrada }
     *
     */
    public Entrada getEntrada() {
        return entrada;
    }

    /**
     * Sets the value of the entrada property.
     *
     * @param value
     *     allowed object is
     *     {@link Entrada }
     *
     */
    public void setEntrada(Entrada value) {
        this.entrada = value;
    }

}
