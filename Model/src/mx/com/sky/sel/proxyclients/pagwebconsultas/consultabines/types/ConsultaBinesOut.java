
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultabines.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultaBinesOut complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultaBinesOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bines" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Respuesta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TipoTarjeta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CreditoDebito" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EntidadBancaria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ClearingHouseCD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaBinesOut",
         propOrder = { "bines", "respuesta", "tipoTarjeta", "creditoDebito", "entidadBancaria", "clearingHouseCD"
    })
public class ConsultaBinesOut {

    @XmlElement(name = "Bines", required = true, nillable = true)
    protected String bines;
    @XmlElement(name = "Respuesta", required = true)
    protected String respuesta;
    @XmlElement(name = "TipoTarjeta", required = true, nillable = true)
    protected String tipoTarjeta;
    @XmlElement(name = "CreditoDebito", required = true, nillable = true)
    protected String creditoDebito;
    @XmlElement(name = "EntidadBancaria", required = true)
    protected String entidadBancaria;
    @XmlElement(name = "ClearingHouseCD", required = true)
    protected String clearingHouseCD;

    /**
     * Gets the value of the bines property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBines() {
        return bines;
    }

    /**
     * Sets the value of the bines property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBines(String value) {
        this.bines = value;
    }

    /**
     * Gets the value of the respuesta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * Sets the value of the respuesta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRespuesta(String value) {
        this.respuesta = value;
    }

    /**
     * Gets the value of the tipoTarjeta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    /**
     * Sets the value of the tipoTarjeta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoTarjeta(String value) {
        this.tipoTarjeta = value;
    }

    /**
     * Gets the value of the creditoDebito property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCreditoDebito() {
        return creditoDebito;
    }

    /**
     * Sets the value of the creditoDebito property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreditoDebito(String value) {
        this.creditoDebito = value;
    }

    /**
     * Gets the value of the entidadBancaria property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEntidadBancaria() {
        return entidadBancaria;
    }

    /**
     * Sets the value of the entidadBancaria property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEntidadBancaria(String value) {
        this.entidadBancaria = value;
    }

    /**
     * Gets the value of the clearingHouseCD property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getClearingHouseCD() {
        return clearingHouseCD;
    }

    /**
     * Sets the value of the clearingHouseCD property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setClearingHouseCD(String value) {
        this.clearingHouseCD = value;
    }

}
