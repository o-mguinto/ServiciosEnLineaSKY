
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
 *         &lt;element name="VCONTRATO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VTITULAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VCALLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VNUMEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VNUMINT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VCOLONIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VCP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VCIUDAD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VMUNICIPIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VESTADO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VTI_M" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VIRD_M" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VESTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VCODIGO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VPAQ_INT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
         { "vcontrato", "vtitular", "vcalle", "vnumext", "vnumint", "vcolonia", "vcp", "vciudad", "vmunicipio",
           "vestado", "vtim", "virdm", "vestatus", "vcodigo", "vpaqint"
    })
@XmlRootElement(name = "OutputParameters")
public class OutputParameters {

    @XmlElementRef(name = "VCONTRATO",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> vcontrato;
    @XmlElementRef(name = "VTITULAR",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> vtitular;
    @XmlElementRef(name = "VCALLE",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> vcalle;
    @XmlElementRef(name = "VNUMEXT",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> vnumext;
    @XmlElementRef(name = "VNUMINT",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> vnumint;
    @XmlElementRef(name = "VCOLONIA",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> vcolonia;
    @XmlElementRef(name = "VCP", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> vcp;
    @XmlElementRef(name = "VCIUDAD",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> vciudad;
    @XmlElementRef(name = "VMUNICIPIO",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> vmunicipio;
    @XmlElementRef(name = "VESTADO",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> vestado;
    @XmlElementRef(name = "VTI_M",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> vtim;
    @XmlElementRef(name = "VIRD_M",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> virdm;
    @XmlElementRef(name = "VESTATUS",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> vestatus;
    @XmlElementRef(name = "VCODIGO",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> vcodigo;
    @XmlElementRef(name = "VPAQ_INT",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbDatosCuentaCreceComboSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> vpaqint;

    /**
     * Gets the value of the vcontrato property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getVCONTRATO() {
        return vcontrato;
    }

    /**
     * Sets the value of the vcontrato property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setVCONTRATO(JAXBElement<String> value) {
        this.vcontrato = value;
    }

    /**
     * Gets the value of the vtitular property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getVTITULAR() {
        return vtitular;
    }

    /**
     * Sets the value of the vtitular property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setVTITULAR(JAXBElement<String> value) {
        this.vtitular = value;
    }

    /**
     * Gets the value of the vcalle property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getVCALLE() {
        return vcalle;
    }

    /**
     * Sets the value of the vcalle property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setVCALLE(JAXBElement<String> value) {
        this.vcalle = value;
    }

    /**
     * Gets the value of the vnumext property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getVNUMEXT() {
        return vnumext;
    }

    /**
     * Sets the value of the vnumext property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setVNUMEXT(JAXBElement<String> value) {
        this.vnumext = value;
    }

    /**
     * Gets the value of the vnumint property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getVNUMINT() {
        return vnumint;
    }

    /**
     * Sets the value of the vnumint property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setVNUMINT(JAXBElement<String> value) {
        this.vnumint = value;
    }

    /**
     * Gets the value of the vcolonia property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getVCOLONIA() {
        return vcolonia;
    }

    /**
     * Sets the value of the vcolonia property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setVCOLONIA(JAXBElement<String> value) {
        this.vcolonia = value;
    }

    /**
     * Gets the value of the vcp property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getVCP() {
        return vcp;
    }

    /**
     * Sets the value of the vcp property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setVCP(JAXBElement<String> value) {
        this.vcp = value;
    }

    /**
     * Gets the value of the vciudad property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getVCIUDAD() {
        return vciudad;
    }

    /**
     * Sets the value of the vciudad property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setVCIUDAD(JAXBElement<String> value) {
        this.vciudad = value;
    }

    /**
     * Gets the value of the vmunicipio property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getVMUNICIPIO() {
        return vmunicipio;
    }

    /**
     * Sets the value of the vmunicipio property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setVMUNICIPIO(JAXBElement<String> value) {
        this.vmunicipio = value;
    }

    /**
     * Gets the value of the vestado property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getVESTADO() {
        return vestado;
    }

    /**
     * Sets the value of the vestado property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setVESTADO(JAXBElement<String> value) {
        this.vestado = value;
    }

    /**
     * Gets the value of the vtim property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getVTIM() {
        return vtim;
    }

    /**
     * Sets the value of the vtim property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setVTIM(JAXBElement<String> value) {
        this.vtim = value;
    }

    /**
     * Gets the value of the virdm property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getVIRDM() {
        return virdm;
    }

    /**
     * Sets the value of the virdm property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setVIRDM(JAXBElement<String> value) {
        this.virdm = value;
    }

    /**
     * Gets the value of the vestatus property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getVESTATUS() {
        return vestatus;
    }

    /**
     * Sets the value of the vestatus property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setVESTATUS(JAXBElement<String> value) {
        this.vestatus = value;
    }

    /**
     * Gets the value of the vcodigo property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getVCODIGO() {
        return vcodigo;
    }

    /**
     * Sets the value of the vcodigo property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setVCODIGO(JAXBElement<String> value) {
        this.vcodigo = value;
    }

    /**
     * Gets the value of the vpaqint property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getVPAQINT() {
        return vpaqint;
    }

    /**
     * Sets the value of the vpaqint property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setVPAQINT(JAXBElement<String> value) {
        this.vpaqint = value;
    }

}
