
package com.oracle.xmlns.pcbpel.adapter.db.sp.dbdatoscuentacrececombosec;

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
 *         &lt;element name="VCUENTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VDISTRIBUIDOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "vcuenta", "vdistribuidor" })
@XmlRootElement(name = "InputParameters")
public class InputParameters {

    @XmlElementRef(name = "VCUENTA",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> vcuenta;
    @XmlElementRef(name = "VDISTRIBUIDOR",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> vdistribuidor;

    /**
     * Gets the value of the vcuenta property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getVCUENTA() {
        return vcuenta;
    }

    /**
     * Sets the value of the vcuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setVCUENTA(JAXBElement<String> value) {
        this.vcuenta = value;
    }

    /**
     * Gets the value of the vdistribuidor property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getVDISTRIBUIDOR() {
        return vdistribuidor;
    }

    /**
     * Sets the value of the vdistribuidor property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setVDISTRIBUIDOR(JAXBElement<String> value) {
        this.vdistribuidor = value;
    }

}
