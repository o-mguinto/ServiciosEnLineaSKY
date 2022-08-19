
package com.oracle.xmlns.pwoperaciones.pwconfiggenerales.bpelpwconfiggenerales;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for salida complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="salida"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="salidaSelectConfigGenerales" type="{http://xmlns.oracle.com/PWOperaciones/PWConfigGenerales/BPELPWConfigGenerales}salidaSelectConfigGenerales"/&gt;
 *         &lt;element name="salidaInsertConfigGenerales" type="{http://xmlns.oracle.com/PWOperaciones/PWConfigGenerales/BPELPWConfigGenerales}salidaInsertConfigGenerales"/&gt;
 *         &lt;element name="salidaUpdateConfigGenerales" type="{http://xmlns.oracle.com/PWOperaciones/PWConfigGenerales/BPELPWConfigGenerales}salidaUpdateConfigGenerales"/&gt;
 *         &lt;element name="salidaDeleteConfigGenerales" type="{http://xmlns.oracle.com/PWOperaciones/PWConfigGenerales/BPELPWConfigGenerales}salidaDeleteConfigGenerales"/&gt;
 *         &lt;element name="salidaActivarConfigGenerales" type="{http://xmlns.oracle.com/PWOperaciones/PWConfigGenerales/BPELPWConfigGenerales}salidaActivarConfigGenerales"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salida",
         propOrder =
         { "salidaSelectConfigGenerales", "salidaInsertConfigGenerales", "salidaUpdateConfigGenerales",
           "salidaDeleteConfigGenerales", "salidaActivarConfigGenerales"
    })
public class Salida {

    protected SalidaSelectConfigGenerales salidaSelectConfigGenerales;
    protected SalidaInsertConfigGenerales salidaInsertConfigGenerales;
    protected SalidaUpdateConfigGenerales salidaUpdateConfigGenerales;
    protected SalidaDeleteConfigGenerales salidaDeleteConfigGenerales;
    protected SalidaActivarConfigGenerales salidaActivarConfigGenerales;

    /**
     * Gets the value of the salidaSelectConfigGenerales property.
     *
     * @return
     *     possible object is
     *     {@link SalidaSelectConfigGenerales }
     *
     */
    public SalidaSelectConfigGenerales getSalidaSelectConfigGenerales() {
        return salidaSelectConfigGenerales;
    }

    /**
     * Sets the value of the salidaSelectConfigGenerales property.
     *
     * @param value
     *     allowed object is
     *     {@link SalidaSelectConfigGenerales }
     *
     */
    public void setSalidaSelectConfigGenerales(SalidaSelectConfigGenerales value) {
        this.salidaSelectConfigGenerales = value;
    }

    /**
     * Gets the value of the salidaInsertConfigGenerales property.
     *
     * @return
     *     possible object is
     *     {@link SalidaInsertConfigGenerales }
     *
     */
    public SalidaInsertConfigGenerales getSalidaInsertConfigGenerales() {
        return salidaInsertConfigGenerales;
    }

    /**
     * Sets the value of the salidaInsertConfigGenerales property.
     *
     * @param value
     *     allowed object is
     *     {@link SalidaInsertConfigGenerales }
     *
     */
    public void setSalidaInsertConfigGenerales(SalidaInsertConfigGenerales value) {
        this.salidaInsertConfigGenerales = value;
    }

    /**
     * Gets the value of the salidaUpdateConfigGenerales property.
     *
     * @return
     *     possible object is
     *     {@link SalidaUpdateConfigGenerales }
     *
     */
    public SalidaUpdateConfigGenerales getSalidaUpdateConfigGenerales() {
        return salidaUpdateConfigGenerales;
    }

    /**
     * Sets the value of the salidaUpdateConfigGenerales property.
     *
     * @param value
     *     allowed object is
     *     {@link SalidaUpdateConfigGenerales }
     *
     */
    public void setSalidaUpdateConfigGenerales(SalidaUpdateConfigGenerales value) {
        this.salidaUpdateConfigGenerales = value;
    }

    /**
     * Gets the value of the salidaDeleteConfigGenerales property.
     *
     * @return
     *     possible object is
     *     {@link SalidaDeleteConfigGenerales }
     *
     */
    public SalidaDeleteConfigGenerales getSalidaDeleteConfigGenerales() {
        return salidaDeleteConfigGenerales;
    }

    /**
     * Sets the value of the salidaDeleteConfigGenerales property.
     *
     * @param value
     *     allowed object is
     *     {@link SalidaDeleteConfigGenerales }
     *
     */
    public void setSalidaDeleteConfigGenerales(SalidaDeleteConfigGenerales value) {
        this.salidaDeleteConfigGenerales = value;
    }

    /**
     * Gets the value of the salidaActivarConfigGenerales property.
     *
     * @return
     *     possible object is
     *     {@link SalidaActivarConfigGenerales }
     *
     */
    public SalidaActivarConfigGenerales getSalidaActivarConfigGenerales() {
        return salidaActivarConfigGenerales;
    }

    /**
     * Sets the value of the salidaActivarConfigGenerales property.
     *
     * @param value
     *     allowed object is
     *     {@link SalidaActivarConfigGenerales }
     *
     */
    public void setSalidaActivarConfigGenerales(SalidaActivarConfigGenerales value) {
        this.salidaActivarConfigGenerales = value;
    }

}
