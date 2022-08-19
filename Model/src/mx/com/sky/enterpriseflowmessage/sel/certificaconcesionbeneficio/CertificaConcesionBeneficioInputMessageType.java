
package mx.com.sky.enterpriseflowmessage.sel.certificaconcesionbeneficio;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertificaConcesionBeneficioInputMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CertificaConcesionBeneficioInputMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Proceso" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Paso" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificaConcesionBeneficioInputMessageType", propOrder = { "proceso", "cuenta", "paso" })
public class CertificaConcesionBeneficioInputMessageType {

    @XmlElement(name = "Proceso", required = true)
    protected String proceso;
    @XmlElement(name = "Cuenta", required = true)
    protected BigInteger cuenta;
    @XmlElement(name = "Paso")
    protected BigInteger paso;

    /**
     * Gets the value of the proceso property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProceso() {
        return proceso;
    }

    /**
     * Sets the value of the proceso property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProceso(String value) {
        this.proceso = value;
    }

    /**
     * Gets the value of the cuenta property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getCuenta() {
        return cuenta;
    }

    /**
     * Sets the value of the cuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setCuenta(BigInteger value) {
        this.cuenta = value;
    }

    /**
     * Gets the value of the paso property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getPaso() {
        return paso;
    }

    /**
     * Sets the value of the paso property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setPaso(BigInteger value) {
        this.paso = value;
    }

}
