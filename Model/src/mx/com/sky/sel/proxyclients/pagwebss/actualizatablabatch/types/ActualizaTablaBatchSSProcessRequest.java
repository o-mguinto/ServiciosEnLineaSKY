
package mx.com.sky.sel.proxyclients.pagwebss.actualizatablabatch.types;

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
 *         &lt;element name="bpelid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="llaveoperacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechaPPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "bpelid", "llaveoperacion", "status", "fechaPPE" })
@XmlRootElement(name = "ActualizaTablaBatchSSProcessRequest")
public class ActualizaTablaBatchSSProcessRequest {

    @XmlElement(required = true)
    protected String bpelid;
    @XmlElement(required = true)
    protected String llaveoperacion;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String fechaPPE;

    /**
     * Gets the value of the bpelid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBpelid() {
        return bpelid;
    }

    /**
     * Sets the value of the bpelid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBpelid(String value) {
        this.bpelid = value;
    }

    /**
     * Gets the value of the llaveoperacion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLlaveoperacion() {
        return llaveoperacion;
    }

    /**
     * Sets the value of the llaveoperacion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLlaveoperacion(String value) {
        this.llaveoperacion = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the fechaPPE property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaPPE() {
        return fechaPPE;
    }

    /**
     * Sets the value of the fechaPPE property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaPPE(String value) {
        this.fechaPPE = value;
    }

}
