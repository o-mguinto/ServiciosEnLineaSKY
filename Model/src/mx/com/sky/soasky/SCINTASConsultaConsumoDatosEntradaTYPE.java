
package mx.com.sky.soasky;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SC_INT_AS_ConsultaConsumoDatos_Entrada_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SC_INT_AS_ConsultaConsumoDatos_Entrada_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CABECERA" type="{http://www.sky.com.mx/soasky}Cabecera_Entrada_TYPE"/&gt;
 *         &lt;element name="NumCuenta" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Msisdn" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SC_INT_AS_ConsultaConsumoDatos_Entrada_TYPE",
         propOrder = { "cabecera", "numCuenta", "msisdn", "externalOffer"
    })
public class SCINTASConsultaConsumoDatosEntradaTYPE {

    @XmlElement(name = "CABECERA", required = true)
    protected CabeceraEntradaTYPE cabecera;
    @XmlElement(name = "NumCuenta")
    protected String numCuenta;
    @XmlElement(name = "Msisdn")
    protected String msisdn;
    @XmlElement(name = "ExternalOffer", required = true)
    protected String externalOffer;

    /**
     * Gets the value of the cabecera property.
     *
     * @return
     *     possible object is
     *     {@link CabeceraEntradaTYPE }
     *
     */
    public CabeceraEntradaTYPE getCABECERA() {
        return cabecera;
    }

    /**
     * Sets the value of the cabecera property.
     *
     * @param value
     *     allowed object is
     *     {@link CabeceraEntradaTYPE }
     *
     */
    public void setCABECERA(CabeceraEntradaTYPE value) {
        this.cabecera = value;
    }

    /**
     * Gets the value of the numCuenta property.
     *
     */
    public String getNumCuenta() {
        /*return numCuenta;*/

        return numCuenta;
    }

    /**
     * Sets the value of the numCuenta property.
     *
     */
    public void setNumCuenta(String value) {
        this.numCuenta = value;
    }

    /**
     * Gets the value of the msisdn property.
     *
     */
    public String getMsisdn() {
        /*return msisdn;*/

        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     *
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the externalOffer property.
     *
     * @return
     * possible object is
     * {@link String}
     *
     */
    public String getExternalOffer() {
        return externalOffer;
    }

    /**
     * Sets the value of the externalOffer property.
     *
     * @param value
     * allowed object is
     * {@link String}
     *
     */
    public void setExternalOffer(String value) {
        this.externalOffer = value;
    }

}
