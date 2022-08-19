
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultaprodcontratado.types;

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
 *         &lt;element name="NumeroCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NombreProducto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TarjetaInteligente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "numeroCuenta", "nombreProducto", "tarjetaInteligente" })
@XmlRootElement(name = "consultaProductoContratado")
public class ConsultaProductoContratado {

    @XmlElement(name = "NumeroCuenta", required = true)
    protected String numeroCuenta;
    @XmlElement(name = "NombreProducto", required = true)
    protected String nombreProducto;
    @XmlElement(name = "TarjetaInteligente")
    protected String tarjetaInteligente;

    /**
     * Gets the value of the numeroCuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Sets the value of the numeroCuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroCuenta(String value) {
        this.numeroCuenta = value;
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

}
