
package mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.types;

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
 *         &lt;element name="MontopPago" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FechaPago" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MetodoPago" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DatosTDC" type="{http://xmlns.oracle.com/AltaSolicitudDeServicioWeb}TarjetaDeCredito"/&gt;
 *         &lt;element name="RespuestaACI" type="{http://xmlns.oracle.com/AltaSolicitudDeServicioWeb}RespuestaACI"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pago", propOrder = { "montopPago", "fechaPago", "metodoPago", "datosTDC", "respuestaACI" })
public class Pago {

    @XmlElement(name = "MontopPago", required = true)
    protected String montopPago;
    @XmlElement(name = "FechaPago", required = true)
    protected String fechaPago;
    @XmlElement(name = "MetodoPago", required = true)
    protected String metodoPago;
    @XmlElement(name = "DatosTDC", required = true)
    protected TarjetaDeCredito datosTDC;
    @XmlElement(name = "RespuestaACI", required = true)
    protected RespuestaACI respuestaACI;

    /**
     * Gets the value of the montopPago property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMontopPago() {
        return montopPago;
    }

    /**
     * Sets the value of the montopPago property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMontopPago(String value) {
        this.montopPago = value;
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
     * Gets the value of the datosTDC property.
     *
     * @return
     *     possible object is
     *     {@link TarjetaDeCredito }
     *
     */
    public TarjetaDeCredito getDatosTDC() {
        return datosTDC;
    }

    /**
     * Sets the value of the datosTDC property.
     *
     * @param value
     *     allowed object is
     *     {@link TarjetaDeCredito }
     *
     */
    public void setDatosTDC(TarjetaDeCredito value) {
        this.datosTDC = value;
    }

    /**
     * Gets the value of the respuestaACI property.
     *
     * @return
     *     possible object is
     *     {@link RespuestaACI }
     *
     */
    public RespuestaACI getRespuestaACI() {
        return respuestaACI;
    }

    /**
     * Sets the value of the respuestaACI property.
     *
     * @param value
     *     allowed object is
     *     {@link RespuestaACI }
     *
     */
    public void setRespuestaACI(RespuestaACI value) {
        this.respuestaACI = value;
    }

}
