
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
 *         &lt;element name="GRUPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TIPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SUBTIPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DEF_CORCHETES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CATEGORIACAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DISTVTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_ACT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CVEPAIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ERROR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="X_TEMP_UNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="X_TEMP_DOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="X_TEMP_TRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
         { "grupo", "tipo", "subtipo", "defcorchetes", "categoriacap", "distvta", "tipoact", "cp", "cvepais", "flag",
           "errorcode", "xtempuno", "xtempdos", "xtemptres"
    })
@XmlRootElement(name = "OutputParameters")
public class OutputParameters {

    @XmlElementRef(name = "GRUPO", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> grupo;
    @XmlElementRef(name = "TIPO", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipo;
    @XmlElementRef(name = "SUBTIPO", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> subtipo;
    @XmlElementRef(name = "DEF_CORCHETES",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> defcorchetes;
    @XmlElementRef(name = "CATEGORIACAP",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> categoriacap;
    @XmlElementRef(name = "DISTVTA", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> distvta;
    @XmlElementRef(name = "TIPO_ACT", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoact;
    @XmlElementRef(name = "CP", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> cp;
    @XmlElementRef(name = "CVEPAIS", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> cvepais;
    @XmlElementRef(name = "FLAG", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> flag;
    @XmlElementRef(name = "ERROR_CODE",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorcode;
    @XmlElementRef(name = "X_TEMP_UNO",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> xtempuno;
    @XmlElementRef(name = "X_TEMP_DOS",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> xtempdos;
    @XmlElementRef(name = "X_TEMP_TRES",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbUtilsOfscProcessSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> xtemptres;

    /**
     * Gets the value of the grupo property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getGRUPO() {
        return grupo;
    }

    /**
     * Sets the value of the grupo property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setGRUPO(JAXBElement<String> value) {
        this.grupo = value;
    }

    /**
     * Gets the value of the tipo property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getTIPO() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setTIPO(JAXBElement<String> value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the subtipo property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getSUBTIPO() {
        return subtipo;
    }

    /**
     * Sets the value of the subtipo property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setSUBTIPO(JAXBElement<String> value) {
        this.subtipo = value;
    }

    /**
     * Gets the value of the defcorchetes property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getDEFCORCHETES() {
        return defcorchetes;
    }

    /**
     * Sets the value of the defcorchetes property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setDEFCORCHETES(JAXBElement<String> value) {
        this.defcorchetes = value;
    }

    /**
     * Gets the value of the categoriacap property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCATEGORIACAP() {
        return categoriacap;
    }

    /**
     * Sets the value of the categoriacap property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCATEGORIACAP(JAXBElement<String> value) {
        this.categoriacap = value;
    }

    /**
     * Gets the value of the distvta property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getDISTVTA() {
        return distvta;
    }

    /**
     * Sets the value of the distvta property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setDISTVTA(JAXBElement<String> value) {
        this.distvta = value;
    }

    /**
     * Gets the value of the tipoact property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getTIPOACT() {
        return tipoact;
    }

    /**
     * Sets the value of the tipoact property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setTIPOACT(JAXBElement<String> value) {
        this.tipoact = value;
    }

    /**
     * Gets the value of the cp property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCP() {
        return cp;
    }

    /**
     * Sets the value of the cp property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCP(JAXBElement<String> value) {
        this.cp = value;
    }

    /**
     * Gets the value of the cvepais property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCVEPAIS() {
        return cvepais;
    }

    /**
     * Sets the value of the cvepais property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCVEPAIS(JAXBElement<String> value) {
        this.cvepais = value;
    }

    /**
     * Gets the value of the flag property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getFLAG() {
        return flag;
    }

    /**
     * Sets the value of the flag property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setFLAG(JAXBElement<String> value) {
        this.flag = value;
    }

    /**
     * Gets the value of the errorcode property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getERRORCODE() {
        return errorcode;
    }

    /**
     * Sets the value of the errorcode property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setERRORCODE(JAXBElement<String> value) {
        this.errorcode = value;
    }

    /**
     * Gets the value of the xtempuno property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getXTEMPUNO() {
        return xtempuno;
    }

    /**
     * Sets the value of the xtempuno property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setXTEMPUNO(JAXBElement<String> value) {
        this.xtempuno = value;
    }

    /**
     * Gets the value of the xtempdos property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getXTEMPDOS() {
        return xtempdos;
    }

    /**
     * Sets the value of the xtempdos property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setXTEMPDOS(JAXBElement<String> value) {
        this.xtempdos = value;
    }

    /**
     * Gets the value of the xtemptres property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getXTEMPTRES() {
        return xtemptres;
    }

    /**
     * Sets the value of the xtemptres property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setXTEMPTRES(JAXBElement<String> value) {
        this.xtemptres = value;
    }

}
