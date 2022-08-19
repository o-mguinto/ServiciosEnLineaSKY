
package mx.com.sky.soasky;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Saldos_consultaSaldosCorrientes_Entrada_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Saldos_consultaSaldosCorrientes_Entrada_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CABECERA" type="{http://www.sky.com.mx/soasky}Cabecera_EntradaConsultaSaldosCorrientes_TYPE"/&gt;
 *         &lt;element name="NUMERO_CUENTA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Saldos_consultaSaldosCorrientes_Entrada_TYPE", propOrder = { "cabecera", "numerocuenta" })
public class SaldosConsultaSaldosCorrientesEntradaTYPE {

    @XmlElement(name = "CABECERA", required = true)
    protected CabeceraEntradaConsultaSaldosCorrientesTYPE cabecera;
    @XmlElement(name = "NUMERO_CUENTA", required = true)
    protected String numerocuenta;

    /**
     * Gets the value of the cabecera property.
     *
     * @return
     *     possible object is
     *     {@link CabeceraEntradaConsultaSaldosCorrientesTYPE }
     *
     */
    public CabeceraEntradaConsultaSaldosCorrientesTYPE getCABECERA() {
        return cabecera;
    }

    /**
     * Sets the value of the cabecera property.
     *
     * @param value
     *     allowed object is
     *     {@link CabeceraEntradaConsultaSaldosCorrientesTYPE }
     *
     */
    public void setCABECERA(CabeceraEntradaConsultaSaldosCorrientesTYPE value) {
        this.cabecera = value;
    }

    /**
     * Gets the value of the numerocuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNUMEROCUENTA() {
        return numerocuenta;
    }

    /**
     * Sets the value of the numerocuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNUMEROCUENTA(String value) {
        this.numerocuenta = value;
    }

}
