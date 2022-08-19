
package mx.com.sky.sel.proxyclients.pagweb.ventacrecimientostya.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="cuentaSKY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="phd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hmc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numEquipos" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="origen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="distribuidor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechaAtencion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="horaAtencion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
         { "cuentaSKY", "sd", "hd", "phd", "hmc", "numEquipos", "origen", "distribuidor", "fechaAtencion",
           "horaAtencion"
    })
@XmlRootElement(name = "ventaCrecimientosTYA")
public class VentaCrecimientosTYA {

    @XmlElement(required = true)
    protected String cuentaSKY;
    @XmlElement(required = true)
    protected String sd;
    @XmlElement(required = true)
    protected String hd;
    @XmlElement(required = true)
    protected String phd;
    @XmlElement(required = true)
    protected String hmc;
    @XmlElement(required = true)
    protected String numEquipos;
    @XmlElement(required = true)
    protected String origen;
    @XmlElement(required = true)
    protected String distribuidor;
    @XmlElement(required = true)
    protected String fechaAtencion;
    @XmlElement(required = true)
    protected String horaAtencion;

    /**
     * Gets the value of the cuentaSKY property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCuentaSKY() {
        return cuentaSKY;
    }

    /**
     * Sets the value of the cuentaSKY property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCuentaSKY(String value) {
        this.cuentaSKY = value;
    }

    /**
     * Gets the value of the sd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSd() {
        return sd;
    }

    /**
     * Sets the value of the sd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSd(String value) {
        this.sd = value;
    }

    /**
     * Gets the value of the hd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHd() {
        return hd;
    }

    /**
     * Sets the value of the hd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHd(String value) {
        this.hd = value;
    }

    /**
     * Gets the value of the phd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPhd() {
        return phd;
    }

    /**
     * Sets the value of the phd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPhd(String value) {
        this.phd = value;
    }

    /**
     * Gets the value of the hmc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHmc() {
        return hmc;
    }

    /**
     * Sets the value of the hmc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHmc(String value) {
        this.hmc = value;
    }

    /**
     * Gets the value of the numEquipos property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumEquipos() {
        return numEquipos;
    }

    /**
     * Sets the value of the numEquipos property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumEquipos(String value) {
        this.numEquipos = value;
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
     * Gets the value of the distribuidor property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDistribuidor() {
        return distribuidor;
    }

    /**
     * Sets the value of the distribuidor property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDistribuidor(String value) {
        this.distribuidor = value;
    }

    /**
     * Gets the value of the fechaAtencion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaAtencion() {
        return fechaAtencion;
    }

    /**
     * Sets the value of the fechaAtencion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaAtencion(String value) {
        this.fechaAtencion = value;
    }

    /**
     * Gets the value of the horaAtencion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHoraAtencion() {
        return horaAtencion;
    }

    /**
     * Sets the value of the horaAtencion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHoraAtencion(String value) {
        this.horaAtencion = value;
    }

}
