
package mx.com.sky.enterpriseflowmessages.sel.gestionarpagocontdcguardada;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatosTransaccionPagoInputMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DatosTransaccionPagoInputMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="phaseId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="keyId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idTarjetaPago" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cvv" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="servicio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="montoPago" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="propositoPago" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codigoMoneda" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cuentaSky" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="organizacionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="metodoPago" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosTransaccionPagoInputMessageType",
         propOrder =
         { "phaseId", "keyId", "idTarjetaPago", "cvv", "servicio", "fechaPago",
           "horaPago", "montoPago", "propositoPago", "pais", "token",
           "codigoMoneda", "descripcion", "cuentaSky", "organizacionId",
           "metodoPago", "emailNotificacion"
    })
public class DatosTransaccionPagoInputMessageType {

    @XmlElement(required = true)
    protected String phaseId;
    @XmlElement(required = true)
    protected String keyId;
    @XmlElement(required = true)
    protected String idTarjetaPago;
    @XmlElement(required = true)
    protected String cvv;
    @XmlElement(required = true)
    protected String servicio;
    protected String fechaPago;
    protected String horaPago;
    @XmlElement(required = true)
    protected String montoPago;
    @XmlElement(required = true)
    protected String propositoPago;
    @XmlElement(required = true)
    protected String pais;
    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected String codigoMoneda;
    @XmlElement(required = true)
    protected String descripcion;
    @XmlElement(required = true)
    protected String cuentaSky;
    @XmlElement(required = true)
    protected String organizacionId;
    @XmlElement(required = true)
    protected String metodoPago;
    @XmlElement(required = true)
    protected String emailNotificacion;

    /**
     * Gets the value of the phaseId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPhaseId() {
        return phaseId;
    }

    /**
     * Sets the value of the phaseId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPhaseId(String value) {
        this.phaseId = value;
    }

    /**
     * Gets the value of the keyId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * Sets the value of the keyId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKeyId(String value) {
        this.keyId = value;
    }

    /**
     * Gets the value of the idTarjetaPago property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdTarjetaPago() {
        return idTarjetaPago;
    }

    /**
     * Sets the value of the idTarjetaPago property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdTarjetaPago(String value) {
        this.idTarjetaPago = value;
    }

    /**
     * Gets the value of the cvv property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCvv() {
        return cvv;
    }

    /**
     * Sets the value of the cvv property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCvv(String value) {
        this.cvv = value;
    }

    /**
     * Gets the value of the servicio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getServicio() {
        return servicio;
    }

    /**
     * Sets the value of the servicio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setServicio(String value) {
        this.servicio = value;
    }

    /**
     * Gets the value of the fechaPago property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaPago() {
        return fechaPago;
    }

    /**
     * Sets the value of the fechaPago property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaPago(String value) {
        this.fechaPago = value;
    }

    /**
     * Gets the value of the horaPago property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHoraPago() {
        return horaPago;
    }

    /**
     * Sets the value of the horaPago property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHoraPago(String value) {
        this.horaPago = value;
    }

    /**
     * Gets the value of the montoPago property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMontoPago() {
        return montoPago;
    }

    /**
     * Sets the value of the montoPago property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMontoPago(String value) {
        this.montoPago = value;
    }

    /**
     * Gets the value of the propositoPago property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPropositoPago() {
        return propositoPago;
    }

    /**
     * Sets the value of the propositoPago property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPropositoPago(String value) {
        this.propositoPago = value;
    }

    /**
     * Gets the value of the pais property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPais() {
        return pais;
    }

    /**
     * Sets the value of the pais property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Gets the value of the token property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the codigoMoneda property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    /**
     * Sets the value of the codigoMoneda property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoMoneda(String value) {
        this.codigoMoneda = value;
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
     * Gets the value of the cuentaSky property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCuentaSky() {
        return cuentaSky;
    }

    /**
     * Sets the value of the cuentaSky property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCuentaSky(String value) {
        this.cuentaSky = value;
    }

    /**
     * Gets the value of the organizacionId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrganizacionId() {
        return organizacionId;
    }

    /**
     * Sets the value of the organizacionId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrganizacionId(String value) {
        this.organizacionId = value;
    }

    /**
     * Gets the value of the metodoPago property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMetodoPago() {
        return metodoPago;
    }

    /**
     * Sets the value of the metodoPago property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMetodoPago(String value) {
        this.metodoPago = value;
    }

    /**
     * Gets the value of the emailNotificacion property.
     *
     * @return
     * possible object is
     * {@link String}
     *
     */
    public String getEmailNotificacion() {
        return emailNotificacion;
    }

    /**
     * Sets the value of the emailNotificacion property.
     *
     * @param value
     * allowed object is
     * {@link String}
     *
     */
    public void setEmailNotificacion(String value) {
        this.emailNotificacion = value;
    }

}
