
package com.oracle.xmlns.consultas.pwconsultainformacionfiscal.consultainformacionfiscal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datosInformacionFiscal complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="datosInformacionFiscal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rfc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="calleFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numeroExtFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numeroIntFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="coloniaFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cuidadFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="delMunFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="estadoFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cpFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoFactura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosInformacionFiscal",
         propOrder =
         { "razonSocial", "rfc", "calleFiscal", "numeroExtFiscal", "numeroIntFiscal", "coloniaFiscal", "cuidadFiscal",
           "delMunFiscal", "estadoFiscal", "cpFiscal", "tipoFactura", "tipopersona", "regimenfiscal", "usocfdi"
    })
public class DatosInformacionFiscal {

    @XmlElement(required = true)
    protected String razonSocial;
    @XmlElement(required = true)
    protected String rfc;
    @XmlElement(required = true)
    protected String calleFiscal;
    @XmlElement(required = true)
    protected String numeroExtFiscal;
    @XmlElement(required = true)
    protected String numeroIntFiscal;
    @XmlElement(required = true)
    protected String coloniaFiscal;
    @XmlElement(required = true)
    protected String cuidadFiscal;
    @XmlElement(required = true)
    protected String delMunFiscal;
    @XmlElement(required = true)
    protected String estadoFiscal;
    @XmlElement(required = true)
    protected String cpFiscal;
    @XmlElement(required = true)
    protected String tipoFactura;
    @XmlElement(required = true)
    protected String regimenfiscal;
    @XmlElement(required = true)
    protected String tipopersona;
    @XmlElement(required = true)
    protected String usocfdi;

    /**
     * Gets the value of the razonSocial property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Sets the value of the razonSocial property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRazonSocial(String value) {
        this.razonSocial = value;
    }

    /**
     * Gets the value of the rfc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Sets the value of the rfc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRfc(String value) {
        this.rfc = value;
    }

    /**
     * Gets the value of the calleFiscal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCalleFiscal() {
        return calleFiscal;
    }

    /**
     * Sets the value of the calleFiscal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCalleFiscal(String value) {
        this.calleFiscal = value;
    }

    /**
     * Gets the value of the numeroExtFiscal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroExtFiscal() {
        return numeroExtFiscal;
    }

    /**
     * Sets the value of the numeroExtFiscal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroExtFiscal(String value) {
        this.numeroExtFiscal = value;
    }

    /**
     * Gets the value of the numeroIntFiscal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroIntFiscal() {
        return numeroIntFiscal;
    }

    /**
     * Sets the value of the numeroIntFiscal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroIntFiscal(String value) {
        this.numeroIntFiscal = value;
    }

    /**
     * Gets the value of the coloniaFiscal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getColoniaFiscal() {
        return coloniaFiscal;
    }

    /**
     * Sets the value of the coloniaFiscal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setColoniaFiscal(String value) {
        this.coloniaFiscal = value;
    }

    /**
     * Gets the value of the cuidadFiscal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCuidadFiscal() {
        return cuidadFiscal;
    }

    /**
     * Sets the value of the cuidadFiscal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCuidadFiscal(String value) {
        this.cuidadFiscal = value;
    }

    /**
     * Gets the value of the delMunFiscal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDelMunFiscal() {
        return delMunFiscal;
    }

    /**
     * Sets the value of the delMunFiscal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDelMunFiscal(String value) {
        this.delMunFiscal = value;
    }

    /**
     * Gets the value of the estadoFiscal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEstadoFiscal() {
        return estadoFiscal;
    }

    /**
     * Sets the value of the estadoFiscal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEstadoFiscal(String value) {
        this.estadoFiscal = value;
    }

    /**
     * Gets the value of the cpFiscal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCpFiscal() {
        return cpFiscal;
    }

    /**
     * Sets the value of the cpFiscal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCpFiscal(String value) {
        this.cpFiscal = value;
    }

    /**
     * Gets the value of the tipoFactura property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoFactura() {
        return tipoFactura;
    }

    /**
     * Sets the value of the tipoFactura property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoFactura(String value) {
        this.tipoFactura = value;
    }

    /**
     * Gets the value of the regimenfiscal property.
     *
     * @return
     * possible object is
     * {@link String}
     *
     */
    public String getRegimenfiscal() {
        return regimenfiscal;
    }

    /**
     * Gets the value of the tipopersona property.
     *
     * @return
     * possible object is
     * {@link String}
     *
     */
    public String getTipopersona() {
        return tipopersona;
    }

    /**
     * Gets the value of the usocfdi property.
     *
     * @return
     * possible object is
     * {@link String}
     *
     */
    public String getUsocfdi() {
        return usocfdi;
    }

    /**
     * Sets the value of the regimenfiscal property.
     *
     * @param value
     * allowed object is
     * {@link String}
     *
     */
    public void setRegimenfiscal(String value) {
        this.regimenfiscal = value;
    }

    /**
     * Sets the value of the tipopersona property.
     *
     * @param value
     * allowed object is
     * {@link String}
     *
     */
    public void setTipopersona(String value) {
        this.tipopersona = value;
    }

    /**
     * Sets the value of the usocfdi property.
     *
     * @param value
     * allowed object is
     * {@link String}
     *
     */
    public void setUsocfdi(String value) {
        this.usocfdi = value;
    }

}
