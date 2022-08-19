
package com.oracle.xmlns.pcbpel.adapter.db.sp.dbventacrecimientoscombosec;

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
 *         &lt;element name="CUENTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VELOCIDAD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROVEEDOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ORIGEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VDISTRIBUIDOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VFECHA_ATEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VHORA_ATEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VLATITUD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VLONGITUD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
         { "cuenta", "velocidad", "proveedor", "origen", "vdistribuidor", "vfechaaten", "vhoraaten", "vlatitud",
           "vlongitud"
    })
@XmlRootElement(name = "InputParameters")
public class InputParameters {

    @XmlElementRef(name = "CUENTA",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> cuenta;
    @XmlElementRef(name = "VELOCIDAD",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> velocidad;
    @XmlElementRef(name = "PROVEEDOR",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> proveedor;
    @XmlElementRef(name = "ORIGEN",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> origen;
    @XmlElementRef(name = "VDISTRIBUIDOR",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> vdistribuidor;
    @XmlElementRef(name = "VFECHA_ATEN",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> vfechaaten;
    @XmlElementRef(name = "VHORA_ATEN",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> vhoraaten;
    @XmlElementRef(name = "VLATITUD",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> vlatitud;
    @XmlElementRef(name = "VLONGITUD",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> vlongitud;

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
     * Gets the value of the velocidad property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getVELOCIDAD() {
        return velocidad;
    }

    /**
     * Sets the value of the velocidad property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setVELOCIDAD(JAXBElement<String> value) {
        this.velocidad = value;
    }

    /**
     * Gets the value of the proveedor property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPROVEEDOR() {
        return proveedor;
    }

    /**
     * Sets the value of the proveedor property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPROVEEDOR(JAXBElement<String> value) {
        this.proveedor = value;
    }

    /**
     * Gets the value of the origen property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getORIGEN() {
        return origen;
    }

    /**
     * Sets the value of the origen property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setORIGEN(JAXBElement<String> value) {
        this.origen = value;
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

    /**
     * Gets the value of the vfechaaten property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getVFECHAATEN() {
        return vfechaaten;
    }

    /**
     * Sets the value of the vfechaaten property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setVFECHAATEN(JAXBElement<String> value) {
        this.vfechaaten = value;
    }

    /**
     * Gets the value of the vhoraaten property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getVHORAATEN() {
        return vhoraaten;
    }

    /**
     * Sets the value of the vhoraaten property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setVHORAATEN(JAXBElement<String> value) {
        this.vhoraaten = value;
    }

    /**
     * Gets the value of the vlatitud property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getVLATITUD() {
        return vlatitud;
    }

    /**
     * Sets the value of the vlatitud property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setVLATITUD(JAXBElement<String> value) {
        this.vlatitud = value;
    }

    /**
     * Gets the value of the vlongitud property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getVLONGITUD() {
        return vlongitud;
    }

    /**
     * Sets the value of the vlongitud property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setVLONGITUD(JAXBElement<String> value) {
        this.vlongitud = value;
    }

}
