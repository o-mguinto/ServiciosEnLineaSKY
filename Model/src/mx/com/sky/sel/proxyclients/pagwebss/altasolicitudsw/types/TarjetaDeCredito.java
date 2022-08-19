
package mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TarjetaDeCredito complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TarjetaDeCredito"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NoTarjeta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FechaExpiracion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NombreTarjetabiente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MesExpiracion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AnioExpiracion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TipoTarjeta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TarjetaDeCredito",
         propOrder =
         { "noTarjeta", "fechaExpiracion", "nombreTarjetabiente", "mesExpiracion", "anioExpiracion", "tipoTarjeta"
    })
public class TarjetaDeCredito {

    @XmlElement(name = "NoTarjeta", required = true)
    protected String noTarjeta;
    @XmlElement(name = "FechaExpiracion", required = true)
    protected String fechaExpiracion;
    @XmlElement(name = "NombreTarjetabiente", required = true)
    protected String nombreTarjetabiente;
    @XmlElement(name = "MesExpiracion", required = true)
    protected String mesExpiracion;
    @XmlElement(name = "AnioExpiracion", required = true)
    protected String anioExpiracion;
    @XmlElement(name = "TipoTarjeta", required = true)
    protected String tipoTarjeta;

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
     * Gets the value of the mesExpiracion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMesExpiracion() {
        return mesExpiracion;
    }

    /**
     * Sets the value of the mesExpiracion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMesExpiracion(String value) {
        this.mesExpiracion = value;
    }

    /**
     * Gets the value of the anioExpiracion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAnioExpiracion() {
        return anioExpiracion;
    }

    /**
     * Sets the value of the anioExpiracion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAnioExpiracion(String value) {
        this.anioExpiracion = value;
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

}
