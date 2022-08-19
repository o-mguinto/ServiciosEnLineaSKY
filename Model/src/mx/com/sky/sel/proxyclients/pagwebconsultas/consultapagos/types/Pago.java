
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultapagos.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Pago complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Pago"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NoTarjeta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TipoPago" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Importe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NoReferencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FechaPago" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Estatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EstatusSBL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pago",
         propOrder = { "noTarjeta", "tipoPago", "importe", "noReferencia", "fechaPago", "estatus", "estatusSBL" })
public class Pago {

    @XmlElement(name = "NoTarjeta", required = true)
    protected String noTarjeta;
    @XmlElement(name = "TipoPago", required = true)
    protected String tipoPago;
    @XmlElement(name = "Importe", required = true)
    protected String importe;
    @XmlElement(name = "NoReferencia", required = true)
    protected String noReferencia;
    @XmlElement(name = "FechaPago", required = true)
    protected String fechaPago;
    @XmlElement(name = "Estatus", required = true)
    protected String estatus;
    @XmlElement(name = "EstatusSBL", required = true)
    protected String estatusSBL;

    /**
     * Gets the value of the noTarjeta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNoTarjeta() {
        return noTarjeta;
    }

    /**
     * Sets the value of the noTarjeta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNoTarjeta(String value) {
        this.noTarjeta = value;
    }

    /**
     * Gets the value of the tipoPago property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoPago() {
        return tipoPago;
    }

    /**
     * Sets the value of the tipoPago property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoPago(String value) {
        this.tipoPago = value;
    }

    /**
     * Gets the value of the importe property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getImporte() {
        return importe;
    }

    /**
     * Sets the value of the importe property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setImporte(String value) {
        this.importe = value;
    }

    /**
     * Gets the value of the noReferencia property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNoReferencia() {
        return noReferencia;
    }

    /**
     * Sets the value of the noReferencia property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNoReferencia(String value) {
        this.noReferencia = value;
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
     * Gets the value of the estatusSBL property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEstatusSBL() {
        return estatusSBL;
    }

    /**
     * Sets the value of the estatusSBL property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEstatusSBL(String value) {
        this.estatusSBL = value;
    }

}
