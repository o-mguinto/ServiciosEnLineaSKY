
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultamundialactivo.types;

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
 *         &lt;element name="TipoMercado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "numeroCuenta", "tipoMercado" })
@XmlRootElement(name = "consultaMundialActivo")
public class ConsultaMundialActivo {

    @XmlElement(name = "NumeroCuenta", required = true)
    protected String numeroCuenta;
    @XmlElement(name = "TipoMercado", required = true)
    protected String tipoMercado;

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
     * Gets the value of the tipoMercado property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoMercado() {
        return tipoMercado;
    }

    /**
     * Sets the value of the tipoMercado property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoMercado(String value) {
        this.tipoMercado = value;
    }

}
