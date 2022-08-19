
package mx.com.sky.siebelosb.creasolicitudservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreaSolicitudServicio_Salida_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CreaSolicitudServicio_Salida_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CABECERA" type="{http://www.sky.com.mx/SiebelOSB/CreaSolicitudServicio}Cabecera_Salida_TYPE"/&gt;
 *         &lt;element name="SRNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Estatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Subestatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreaSolicitudServicio_Salida_TYPE", propOrder = { "cabecera", "srNumber", "estatus", "subestatus" })
public class CreaSolicitudServicioSalidaTYPE {

    @XmlElement(name = "CABECERA", required = true)
    protected CabeceraSalidaTYPE cabecera;
    @XmlElement(name = "SRNumber", required = true)
    protected String srNumber;
    @XmlElement(name = "Estatus", required = true)
    protected String estatus;
    @XmlElement(name = "Subestatus", required = true)
    protected String subestatus;

    /**
     * Gets the value of the cabecera property.
     *
     * @return
     *     possible object is
     *     {@link CabeceraSalidaTYPE }
     *
     */
    public CabeceraSalidaTYPE getCABECERA() {
        return cabecera;
    }

    /**
     * Sets the value of the cabecera property.
     *
     * @param value
     *     allowed object is
     *     {@link CabeceraSalidaTYPE }
     *
     */
    public void setCABECERA(CabeceraSalidaTYPE value) {
        this.cabecera = value;
    }

    /**
     * Gets the value of the srNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSRNumber() {
        return srNumber;
    }

    /**
     * Sets the value of the srNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSRNumber(String value) {
        this.srNumber = value;
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

}
