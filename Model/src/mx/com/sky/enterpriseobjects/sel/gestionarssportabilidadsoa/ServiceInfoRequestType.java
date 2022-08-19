
package mx.com.sky.enterpriseobjects.sel.gestionarssportabilidadsoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceInfoRequestType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ServiceInfoRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Origen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Estatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Subestatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NumeroPortar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OperadorDonante" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CURP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NipConfirmation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VigenciaNip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IMEI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FechaPortabilidad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AssetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceInfoRequestType",
         propOrder =
         { "cuenta", "origen", "estatus", "subestatus", "descripcion", "numeroPortar", "operadorDonante", "curp",
           "nipConfirmation", "vigenciaNip", "region", "imei", "fechaPortabilidad", "assetNumber"
    })
public class ServiceInfoRequestType {

    @XmlElement(name = "Cuenta", required = true)
    protected String cuenta;
    @XmlElement(name = "Origen", required = true)
    protected String origen;
    @XmlElement(name = "Estatus", required = true)
    protected String estatus;
    @XmlElement(name = "Subestatus", required = true)
    protected String subestatus;
    @XmlElement(name = "Descripcion", required = true)
    protected String descripcion;
    @XmlElement(name = "NumeroPortar", required = true)
    protected String numeroPortar;
    @XmlElement(name = "OperadorDonante", required = true)
    protected String operadorDonante;
    @XmlElement(name = "CURP", required = true)
    protected String curp;
    @XmlElement(name = "NipConfirmation", required = true)
    protected String nipConfirmation;
    @XmlElement(name = "VigenciaNip", required = true)
    protected String vigenciaNip;
    @XmlElement(name = "Region", required = true)
    protected String region;
    @XmlElement(name = "IMEI", required = true)
    protected String imei;
    @XmlElement(name = "FechaPortabilidad", required = true)
    protected String fechaPortabilidad;
    @XmlElement(name = "AssetNumber", required = true)
    protected String assetNumber;

    /**
     * Gets the value of the cuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Sets the value of the cuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCuenta(String value) {
        this.cuenta = value;
    }

    /**
     * Gets the value of the origen property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Sets the value of the origen property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrigen(String value) {
        this.origen = value;
    }

    /**
     * Gets the value of the estatus property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEstatus() {
        return estatus;
    }

    /**
     * Sets the value of the estatus property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEstatus(String value) {
        this.estatus = value;
    }

    /**
     * Gets the value of the subestatus property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubestatus() {
        return subestatus;
    }

    /**
     * Sets the value of the subestatus property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubestatus(String value) {
        this.subestatus = value;
    }

    /**
     * Gets the value of the descripcion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the numeroPortar property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroPortar() {
        return numeroPortar;
    }

    /**
     * Sets the value of the numeroPortar property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroPortar(String value) {
        this.numeroPortar = value;
    }

    /**
     * Gets the value of the operadorDonante property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOperadorDonante() {
        return operadorDonante;
    }

    /**
     * Sets the value of the operadorDonante property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOperadorDonante(String value) {
        this.operadorDonante = value;
    }

    /**
     * Gets the value of the curp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCURP() {
        return curp;
    }

    /**
     * Sets the value of the curp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCURP(String value) {
        this.curp = value;
    }

    /**
     * Gets the value of the nipConfirmation property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNipConfirmation() {
        return nipConfirmation;
    }

    /**
     * Sets the value of the nipConfirmation property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNipConfirmation(String value) {
        this.nipConfirmation = value;
    }

    /**
     * Gets the value of the vigenciaNip property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVigenciaNip() {
        return vigenciaNip;
    }

    /**
     * Sets the value of the vigenciaNip property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVigenciaNip(String value) {
        this.vigenciaNip = value;
    }

    /**
     * Gets the value of the region property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the imei property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIMEI() {
        return imei;
    }

    /**
     * Sets the value of the imei property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIMEI(String value) {
        this.imei = value;
    }

    /**
     * Gets the value of the fechaPortabilidad property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaPortabilidad() {
        return fechaPortabilidad;
    }

    /**
     * Sets the value of the fechaPortabilidad property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaPortabilidad(String value) {
        this.fechaPortabilidad = value;
    }

    /**
     * Gets the value of the assetNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAssetNumber() {
        return assetNumber;
    }

    /**
     * Sets the value of the assetNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAssetNumber(String value) {
        this.assetNumber = value;
    }

}
