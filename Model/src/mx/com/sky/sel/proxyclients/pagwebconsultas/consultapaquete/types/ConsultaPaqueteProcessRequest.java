
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaquete.types;

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
 *         &lt;element name="CodigoPais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PaqueteActual" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TipoCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "codigoPais", "paqueteActual", "tipoCuenta" })
@XmlRootElement(name = "ConsultaPaqueteProcessRequest")
public class ConsultaPaqueteProcessRequest {

    @XmlElement(name = "CodigoPais", required = true)
    protected String codigoPais;
    @XmlElement(name = "PaqueteActual", required = true)
    protected String paqueteActual;
    @XmlElement(name = "TipoCuenta", required = true)
    protected String tipoCuenta;

    /**
     * Gets the value of the codigoPais property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoPais() {
        return codigoPais;
    }

    /**
     * Sets the value of the codigoPais property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoPais(String value) {
        this.codigoPais = value;
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
     * Gets the value of the tipoCuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    /**
     * Sets the value of the tipoCuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoCuenta(String value) {
        this.tipoCuenta = value;
    }

}
