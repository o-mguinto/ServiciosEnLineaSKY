
package com.oracle.xmlns.pcbpel.adapter.db.sp.dbutilsofscprocesssec;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="PROCESO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CUENTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DISTRIBUIDOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PHD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HMC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NUM_EQUIP_CTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PAIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ESTADO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ALCALDIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_CTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",
         propOrder =
         { "proceso", "cuenta", "distribuidor", "sd", "hd", "phd", "hmc", "numequipcta", "pais", "estado", "alcaldia",
           "tipocta"
    })
@XmlRootElement(name = "InputParameters")
public class InputParameters {

    @XmlElementRef(name = "PROCESO", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> proceso;
    @XmlElementRef(name = "CUENTA", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> cuenta;
    @XmlElementRef(name = "DISTRIBUIDOR",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> distribuidor;
    @XmlElementRef(name = "SD", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> sd;
    @XmlElementRef(name = "HD", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> hd;
    @XmlElementRef(name = "PHD", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> phd;
    @XmlElementRef(name = "HMC", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> hmc;
    @XmlElementRef(name = "NUM_EQUIP_CTA",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> numequipcta;
    @XmlElementRef(name = "PAIS", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> pais;
    @XmlElementRef(name = "ESTADO", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> estado;
    @XmlElementRef(name = "ALCALDIA", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> alcaldia;
    @XmlElementRef(name = "TIPO_CTA", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipocta;

    /**
     * Gets the value of the proceso property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPROCESO() {
        return proceso;
    }

    /**
     * Sets the value of the proceso property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPROCESO(JAXBElement<String> value) {
        this.proceso = value;
    }

    /**
     * Gets the value of the cuenta property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCUENTA() {
        return cuenta;
    }

    /**
     * Sets the value of the cuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCUENTA(JAXBElement<String> value) {
        this.cuenta = value;
    }

    /**
     * Gets the value of the distribuidor property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getDISTRIBUIDOR() {
        return distribuidor;
    }

    /**
     * Sets the value of the distribuidor property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setDISTRIBUIDOR(JAXBElement<String> value) {
        this.distribuidor = value;
    }

    /**
     * Gets the value of the sd property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getSD() {
        return sd;
    }

    /**
     * Sets the value of the sd property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setSD(JAXBElement<String> value) {
        this.sd = value;
    }

    /**
     * Gets the value of the hd property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getHD() {
        return hd;
    }

    /**
     * Sets the value of the hd property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setHD(JAXBElement<String> value) {
        this.hd = value;
    }

    /**
     * Gets the value of the phd property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPHD() {
        return phd;
    }

    /**
     * Sets the value of the phd property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPHD(JAXBElement<String> value) {
        this.phd = value;
    }

    /**
     * Gets the value of the hmc property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getHMC() {
        return hmc;
    }

    /**
     * Sets the value of the hmc property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setHMC(JAXBElement<String> value) {
        this.hmc = value;
    }

    /**
     * Gets the value of the numequipcta property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getNUMEQUIPCTA() {
        return numequipcta;
    }

    /**
     * Sets the value of the numequipcta property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setNUMEQUIPCTA(JAXBElement<String> value) {
        this.numequipcta = value;
    }

    /**
     * Gets the value of the pais property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPAIS() {
        return pais;
    }

    /**
     * Sets the value of the pais property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPAIS(JAXBElement<String> value) {
        this.pais = value;
    }

    /**
     * Gets the value of the estado property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getESTADO() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setESTADO(JAXBElement<String> value) {
        this.estado = value;
    }

    /**
     * Gets the value of the alcaldia property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getALCALDIA() {
        return alcaldia;
    }

    /**
     * Sets the value of the alcaldia property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setALCALDIA(JAXBElement<String> value) {
        this.alcaldia = value;
    }

    /**
     * Gets the value of the tipocta property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getTIPOCTA() {
        return tipocta;
    }

    /**
     * Sets the value of the tipocta property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setTIPOCTA(JAXBElement<String> value) {
        this.tipocta = value;
    }

}
