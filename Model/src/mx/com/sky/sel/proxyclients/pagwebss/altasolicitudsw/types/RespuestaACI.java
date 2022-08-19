
package mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RespuestaACI complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RespuestaACI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoRespuesta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CodigoAutorizacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FechaAutorizacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CodigoMoneda" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PagoAplicado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MotivoRechazo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NoReferencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EstatusPago" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaACI",
         propOrder =
         { "codigoRespuesta", "codigoAutorizacion", "fechaAutorizacion", "codigoMoneda", "pagoAplicado",
           "motivoRechazo", "noReferencia", "estatusPago"
    })
public class RespuestaACI {

    @XmlElement(name = "CodigoRespuesta", required = true)
    protected String codigoRespuesta;
    @XmlElement(name = "CodigoAutorizacion", required = true)
    protected String codigoAutorizacion;
    @XmlElement(name = "FechaAutorizacion", required = true)
    protected String fechaAutorizacion;
    @XmlElement(name = "CodigoMoneda", required = true)
    protected String codigoMoneda;
    @XmlElement(name = "PagoAplicado", required = true)
    protected String pagoAplicado;
    @XmlElement(name = "MotivoRechazo", required = true)
    protected String motivoRechazo;
    @XmlElement(name = "NoReferencia", required = true)
    protected String noReferencia;
    @XmlElement(name = "EstatusPago", required = true)
    protected String estatusPago;

    /**
     * Gets the value of the codigoRespuesta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoRespuesta() {
        return codigoRespuesta;
    }

    /**
     * Sets the value of the codigoRespuesta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoRespuesta(String value) {
        this.codigoRespuesta = value;
    }

    /**
     * Gets the value of the codigoAutorizacion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoAutorizacion() {
        return codigoAutorizacion;
    }

    /**
     * Sets the value of the codigoAutorizacion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoAutorizacion(String value) {
        this.codigoAutorizacion = value;
    }

    /**
     * Gets the value of the fechaAutorizacion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaAutorizacion() {
        return fechaAutorizacion;
    }

    /**
     * Sets the value of the fechaAutorizacion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaAutorizacion(String value) {
        this.fechaAutorizacion = value;
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
     * Gets the value of the pagoAplicado property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPagoAplicado() {
        return pagoAplicado;
    }

    /**
     * Sets the value of the pagoAplicado property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPagoAplicado(String value) {
        this.pagoAplicado = value;
    }

    /**
     * Gets the value of the motivoRechazo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMotivoRechazo() {
        return motivoRechazo;
    }

    /**
     * Sets the value of the motivoRechazo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMotivoRechazo(String value) {
        this.motivoRechazo = value;
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
     * Gets the value of the estatusPago property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEstatusPago() {
        return estatusPago;
    }

    /**
     * Sets the value of the estatusPago property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEstatusPago(String value) {
        this.estatusPago = value;
    }

}
