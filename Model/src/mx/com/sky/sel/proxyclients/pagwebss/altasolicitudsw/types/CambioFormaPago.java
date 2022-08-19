
package mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CambioFormaPago complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CambioFormaPago"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FechaExpiracion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NombreTarjetabiente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NumeroTarjeta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CodigoSeguridad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TipoTarjeta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NombreProducto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PaqueteActual" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AceptaBeneficio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CambioFormaPago",
         propOrder =
         { "fechaExpiracion", "nombreTarjetabiente", "numeroTarjeta", "codigoSeguridad", "tipoTarjeta",
           "nombreProducto", "paqueteActual", "aceptaBeneficio"
    })
public class CambioFormaPago {

    @XmlElement(name = "FechaExpiracion", required = true)
    protected String fechaExpiracion;
    @XmlElement(name = "NombreTarjetabiente", required = true)
    protected String nombreTarjetabiente;
    @XmlElement(name = "NumeroTarjeta", required = true)
    protected String numeroTarjeta;
    @XmlElement(name = "CodigoSeguridad", required = true)
    protected String codigoSeguridad;
    @XmlElement(name = "TipoTarjeta", required = true)
    protected String tipoTarjeta;
    @XmlElement(name = "NombreProducto", required = true)
    protected String nombreProducto;
    @XmlElement(name = "PaqueteActual", required = true)
    protected String paqueteActual;
    @XmlElement(name = "AceptaBeneficio", required = true)
    protected String aceptaBeneficio;

    /**
     * Gets the value of the fechaExpiracion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    /**
     * Sets the value of the fechaExpiracion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaExpiracion(String value) {
        this.fechaExpiracion = value;
    }

    /**
     * Gets the value of the nombreTarjetabiente property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombreTarjetabiente() {
        return nombreTarjetabiente;
    }

    /**
     * Sets the value of the nombreTarjetabiente property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombreTarjetabiente(String value) {
        this.nombreTarjetabiente = value;
    }

    /**
     * Gets the value of the numeroTarjeta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * Sets the value of the numeroTarjeta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroTarjeta(String value) {
        this.numeroTarjeta = value;
    }

    /**
     * Gets the value of the codigoSeguridad property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    /**
     * Sets the value of the codigoSeguridad property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoSeguridad(String value) {
        this.codigoSeguridad = value;
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
     * Gets the value of the nombreProducto property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Sets the value of the nombreProducto property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombreProducto(String value) {
        this.nombreProducto = value;
    }

    /**
     * Gets the value of the paqueteActual property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaqueteActual() {
        return paqueteActual;
    }

    /**
     * Sets the value of the paqueteActual property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaqueteActual(String value) {
        this.paqueteActual = value;
    }

    /**
     * Gets the value of the aceptaBeneficio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAceptaBeneficio() {
        return aceptaBeneficio;
    }

    /**
     * Sets the value of the aceptaBeneficio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAceptaBeneficio(String value) {
        this.aceptaBeneficio = value;
    }

}
