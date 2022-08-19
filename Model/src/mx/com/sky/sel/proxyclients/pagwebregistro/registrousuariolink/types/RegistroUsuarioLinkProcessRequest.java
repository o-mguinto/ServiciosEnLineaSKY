
package mx.com.sky.sel.proxyclients.pagwebregistro.registrousuariolink.types;

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
 *         &lt;element name="CodigoPreRegistro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CuentaSky" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TarjetaInteligente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Contrasena" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "codigoPreRegistro", "cuentaSky", "tarjetaInteligente", "contrasena" })
@XmlRootElement(name = "RegistroUsuarioLinkProcessRequest")
public class RegistroUsuarioLinkProcessRequest {

    @XmlElement(name = "CodigoPreRegistro", required = true)
    protected String codigoPreRegistro;
    @XmlElement(name = "CuentaSky", required = true)
    protected String cuentaSky;
    @XmlElement(name = "TarjetaInteligente", required = true)
    protected String tarjetaInteligente;
    @XmlElement(name = "Contrasena", required = true)
    protected String contrasena;

    /**
     * Gets the value of the codigoPreRegistro property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoPreRegistro() {
        return codigoPreRegistro;
    }

    /**
     * Sets the value of the codigoPreRegistro property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoPreRegistro(String value) {
        this.codigoPreRegistro = value;
    }

    /**
     * Gets the value of the cuentaSky property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCuentaSky() {
        return cuentaSky;
    }

    /**
     * Sets the value of the cuentaSky property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCuentaSky(String value) {
        this.cuentaSky = value;
    }

    /**
     * Gets the value of the tarjetaInteligente property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTarjetaInteligente() {
        return tarjetaInteligente;
    }

    /**
     * Sets the value of the tarjetaInteligente property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTarjetaInteligente(String value) {
        this.tarjetaInteligente = value;
    }

    /**
     * Gets the value of the contrasena property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Sets the value of the contrasena property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContrasena(String value) {
        this.contrasena = value;
    }

}
