
package mx.com.sky.sel.proxyclients.pagweb.insertacrecimientostya.types;

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
 *         &lt;element name="vendedor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="distribuidor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechaAtencion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="horaAtencion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sistema" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="phd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hmc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="paquete" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="creceA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="totalCrec" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="equiposActivos" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mig" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
         { "cuentaSKY", "vendedor", "distribuidor", "fechaAtencion", "horaAtencion", "sistema", "sr", "sd", "hd", "phd",
           "hmc", "paquete", "creceA", "totalCrec", "equiposActivos", "mig"
    })
@XmlRootElement(name = "insertaCrecimientosTYA")
public class InsertaCrecimientosTYA {

    @XmlElement(required = true)
    protected String cuentaSKY;
    @XmlElement(required = true)
    protected String vendedor;
    @XmlElement(required = true)
    protected String distribuidor;
    @XmlElement(required = true)
    protected String fechaAtencion;
    @XmlElement(required = true)
    protected String horaAtencion;
    @XmlElement(required = true)
    protected String sistema;
    @XmlElement(required = true)
    protected String sr;
    @XmlElement(required = true)
    protected String sd;
    @XmlElement(required = true)
    protected String hd;
    @XmlElement(required = true)
    protected String phd;
    @XmlElement(required = true)
    protected String hmc;
    @XmlElement(required = true)
    protected String paquete;
    @XmlElement(required = true)
    protected String creceA;
    @XmlElement(required = true)
    protected String totalCrec;
    @XmlElement(required = true)
    protected String equiposActivos;
    @XmlElement(required = true)
    protected String mig;

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
     * Gets the value of the vendedor property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVendedor() {
        return vendedor;
    }

    /**
     * Sets the value of the vendedor property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVendedor(String value) {
        this.vendedor = value;
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

    /**
     * Gets the value of the sistema property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSistema() {
        return sistema;
    }

    /**
     * Sets the value of the sistema property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSistema(String value) {
        this.sistema = value;
    }

    /**
     * Gets the value of the sr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSr() {
        return sr;
    }

    /**
     * Sets the value of the sr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSr(String value) {
        this.sr = value;
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
     * Gets the value of the paquete property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaquete() {
        return paquete;
    }

    /**
     * Sets the value of the paquete property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaquete(String value) {
        this.paquete = value;
    }

    /**
     * Gets the value of the creceA property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCreceA() {
        return creceA;
    }

    /**
     * Sets the value of the creceA property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreceA(String value) {
        this.creceA = value;
    }

    /**
     * Gets the value of the totalCrec property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTotalCrec() {
        return totalCrec;
    }

    /**
     * Sets the value of the totalCrec property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTotalCrec(String value) {
        this.totalCrec = value;
    }

    /**
     * Gets the value of the equiposActivos property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEquiposActivos() {
        return equiposActivos;
    }

    /**
     * Sets the value of the equiposActivos property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEquiposActivos(String value) {
        this.equiposActivos = value;
    }

    /**
     * Gets the value of the mig property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMig() {
        return mig;
    }

    /**
     * Sets the value of the mig property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMig(String value) {
        this.mig = value;
    }

}
