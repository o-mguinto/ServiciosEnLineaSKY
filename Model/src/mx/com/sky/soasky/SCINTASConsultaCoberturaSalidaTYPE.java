
package mx.com.sky.soasky;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SC_INT_AS_ConsultaCobertura_Salida_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SC_INT_AS_ConsultaCobertura_Salida_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CABECERA" type="{http://www.sky.com.mx/soasky}Cabecera_Salida_TYPE"/&gt;
 *         &lt;element name="Provider" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Coverage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SC_INT_AS_ConsultaCobertura_Salida_TYPE", propOrder = { "cabecera", "provider", "coverage" })
public class SCINTASConsultaCoberturaSalidaTYPE {

    @XmlElement(name = "CABECERA", required = true)
    protected CabeceraSalidaTYPE cabecera;
    @XmlElement(name = "Provider", required = true)
    protected String provider;
    @XmlElement(name = "Coverage", required = true)
    protected String coverage;

    /**
     * Gets the value of the cabecera property.
     *
     * @return
     *     possible object is
     *     {@link CabeceraSalidaTYPE }
     *
     */
    public CabeceraSalidaTYPE getCABECERA() {
        return cabecera;
    }

    /**
     * Sets the value of the cabecera property.
     *
     * @param value
     *     allowed object is
     *     {@link CabeceraSalidaTYPE }
     *
     */
    public void setCABECERA(CabeceraSalidaTYPE value) {
        this.cabecera = value;
    }

    /**
     * Gets the value of the provider property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProvider(String value) {
        this.provider = value;
    }

    /**
     * Gets the value of the coverage property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCoverage() {
        return coverage;
    }

    /**
     * Sets the value of the coverage property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCoverage(String value) {
        this.coverage = value;
    }

}
