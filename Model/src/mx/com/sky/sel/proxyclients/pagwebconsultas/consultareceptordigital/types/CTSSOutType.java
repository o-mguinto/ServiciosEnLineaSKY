
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultareceptordigital.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CTSSOutType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CTSSOutType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CUENTA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SOLICITUD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FECHA_SOLICITUD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ESTATUS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SUB_ESTATUS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="COMENTARIOS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTSSOutType",
         propOrder = { "cuenta", "solicitud", "fechasolicitud", "estatus", "subestatus", "comentarios" })
public class CTSSOutType {

    @XmlElement(name = "CUENTA", required = true)
    protected String cuenta;
    @XmlElement(name = "SOLICITUD", required = true)
    protected String solicitud;
    @XmlElement(name = "FECHA_SOLICITUD", required = true)
    protected String fechasolicitud;
    @XmlElement(name = "ESTATUS", required = true)
    protected String estatus;
    @XmlElement(name = "SUB_ESTATUS", required = true)
    protected String subestatus;
    @XmlElement(name = "COMENTARIOS", required = true)
    protected String comentarios;

    /**
     * Gets the value of the cuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCUENTA() {
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
    public void setCUENTA(String value) {
        this.cuenta = value;
    }

    /**
     * Gets the value of the solicitud property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSOLICITUD() {
        return solicitud;
    }

    /**
     * Sets the value of the solicitud property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSOLICITUD(String value) {
        this.solicitud = value;
    }

    /**
     * Gets the value of the fechasolicitud property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFECHASOLICITUD() {
        return fechasolicitud;
    }

    /**
     * Sets the value of the fechasolicitud property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFECHASOLICITUD(String value) {
        this.fechasolicitud = value;
    }

    /**
     * Gets the value of the estatus property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getESTATUS() {
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
    public void setESTATUS(String value) {
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
    public String getSUBESTATUS() {
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
    public void setSUBESTATUS(String value) {
        this.subestatus = value;
    }

    /**
     * Gets the value of the comentarios property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCOMENTARIOS() {
        return comentarios;
    }

    /**
     * Sets the value of the comentarios property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCOMENTARIOS(String value) {
        this.comentarios = value;
    }

}
