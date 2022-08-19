
package mx.com.sky.enterprisemessages.sicof.consultarfactura;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarFacturaRequestType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarFacturaRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumeroCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarFacturaRequestType", propOrder = { "numeroCuenta" })
public class ConsultarFacturaRequestType {

    @XmlElement(name = "NumeroCuenta", required = true)
    protected String numeroCuenta;

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

}
