
package com.oracle.xmlns.pwoperaciones.pwconfiggenerales.bpelpwconfiggenerales;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entrada complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="entrada"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operacionServicio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="entradaSelectConfigGenerales" type="{http://xmlns.oracle.com/PWOperaciones/PWConfigGenerales/BPELPWConfigGenerales}entradaSelectConfigGenerales"/&gt;
 *           &lt;element name="entradaInsertConfigGenerales" type="{http://xmlns.oracle.com/PWOperaciones/PWConfigGenerales/BPELPWConfigGenerales}entradaInsertConfigGenerales"/&gt;
 *           &lt;element name="entradaUpdateConfigGenerales" type="{http://xmlns.oracle.com/PWOperaciones/PWConfigGenerales/BPELPWConfigGenerales}entradaUpdateConfigGenerales"/&gt;
 *           &lt;element name="entradaDeleteConfigGenerales" type="{http://xmlns.oracle.com/PWOperaciones/PWConfigGenerales/BPELPWConfigGenerales}entradaDeleteConfigGenerales"/&gt;
 *           &lt;element name="entradaActivarConfigGenerales" type="{http://xmlns.oracle.com/PWOperaciones/PWConfigGenerales/BPELPWConfigGenerales}entradaActivarConfigGenerales"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entrada",
         propOrder =
         { "operacionServicio", "entradaSelectConfigGenerales", "entradaInsertConfigGenerales",
           "entradaUpdateConfigGenerales", "entradaDeleteConfigGenerales", "entradaActivarConfigGenerales"
    })
public class Entrada {

    @XmlElement(required = true)
    protected String operacionServicio;
    protected EntradaSelectConfigGenerales entradaSelectConfigGenerales;
    protected EntradaInsertConfigGenerales entradaInsertConfigGenerales;
    protected EntradaUpdateConfigGenerales entradaUpdateConfigGenerales;
    protected EntradaDeleteConfigGenerales entradaDeleteConfigGenerales;
    protected EntradaActivarConfigGenerales entradaActivarConfigGenerales;

    /**
     * Gets the value of the operacionServicio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOperacionServicio() {
        return operacionServicio;
    }

    /**
     * Sets the value of the operacionServicio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOperacionServicio(String value) {
        this.operacionServicio = value;
    }

    /**
     * Gets the value of the entradaSelectConfigGenerales property.
     *
     * @return
     *     possible object is
     *     {@link EntradaSelectConfigGenerales }
     *
     */
    public EntradaSelectConfigGenerales getEntradaSelectConfigGenerales() {
        return entradaSelectConfigGenerales;
    }

    /**
     * Sets the value of the entradaSelectConfigGenerales property.
     *
     * @param value
     *     allowed object is
     *     {@link EntradaSelectConfigGenerales }
     *
     */
    public void setEntradaSelectConfigGenerales(EntradaSelectConfigGenerales value) {
        this.entradaSelectConfigGenerales = value;
    }

    /**
     * Gets the value of the entradaInsertConfigGenerales property.
     *
     * @return
     *     possible object is
     *     {@link EntradaInsertConfigGenerales }
     *
     */
    public EntradaInsertConfigGenerales getEntradaInsertConfigGenerales() {
        return entradaInsertConfigGenerales;
    }

    /**
     * Sets the value of the entradaInsertConfigGenerales property.
     *
     * @param value
     *     allowed object is
     *     {@link EntradaInsertConfigGenerales }
     *
     */
    public void setEntradaInsertConfigGenerales(EntradaInsertConfigGenerales value) {
        this.entradaInsertConfigGenerales = value;
    }

    /**
     * Gets the value of the entradaUpdateConfigGenerales property.
     *
     * @return
     *     possible object is
     *     {@link EntradaUpdateConfigGenerales }
     *
     */
    public EntradaUpdateConfigGenerales getEntradaUpdateConfigGenerales() {
        return entradaUpdateConfigGenerales;
    }

    /**
     * Sets the value of the entradaUpdateConfigGenerales property.
     *
     * @param value
     *     allowed object is
     *     {@link EntradaUpdateConfigGenerales }
     *
     */
    public void setEntradaUpdateConfigGenerales(EntradaUpdateConfigGenerales value) {
        this.entradaUpdateConfigGenerales = value;
    }

    /**
     * Gets the value of the entradaDeleteConfigGenerales property.
     *
     * @return
     *     possible object is
     *     {@link EntradaDeleteConfigGenerales }
     *
     */
    public EntradaDeleteConfigGenerales getEntradaDeleteConfigGenerales() {
        return entradaDeleteConfigGenerales;
    }

    /**
     * Sets the value of the entradaDeleteConfigGenerales property.
     *
     * @param value
     *     allowed object is
     *     {@link EntradaDeleteConfigGenerales }
     *
     */
    public void setEntradaDeleteConfigGenerales(EntradaDeleteConfigGenerales value) {
        this.entradaDeleteConfigGenerales = value;
    }

    /**
     * Gets the value of the entradaActivarConfigGenerales property.
     *
     * @return
     *     possible object is
     *     {@link EntradaActivarConfigGenerales }
     *
     */
    public EntradaActivarConfigGenerales getEntradaActivarConfigGenerales() {
        return entradaActivarConfigGenerales;
    }

    /**
     * Sets the value of the entradaActivarConfigGenerales property.
     *
     * @param value
     *     allowed object is
     *     {@link EntradaActivarConfigGenerales }
     *
     */
    public void setEntradaActivarConfigGenerales(EntradaActivarConfigGenerales value) {
        this.entradaActivarConfigGenerales = value;
    }

}
