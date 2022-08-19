
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultaformaspago.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormasPagoTYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FormasPagoTYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PAYMT_METH_CD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="No_coincide_con_contrato" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Cargo_cambio_de_forma_de_pago" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormasPagoTYPE",
         propOrder = { "name", "paymtmethcd", "noCoincideConContrato", "cargoCambioDeFormaDePago" })
public class FormasPagoTYPE {

    @XmlElement(name = "NAME", required = true, nillable = true)
    protected String name;
    @XmlElement(name = "PAYMT_METH_CD", required = true, nillable = true)
    protected String paymtmethcd;
    @XmlElement(name = "No_coincide_con_contrato", required = true, nillable = true)
    protected String noCoincideConContrato;
    @XmlElement(name = "Cargo_cambio_de_forma_de_pago", required = true, nillable = true)
    protected String cargoCambioDeFormaDePago;

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the paymtmethcd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPAYMTMETHCD() {
        return paymtmethcd;
    }

    /**
     * Sets the value of the paymtmethcd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPAYMTMETHCD(String value) {
        this.paymtmethcd = value;
    }

    /**
     * Gets the value of the noCoincideConContrato property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNoCoincideConContrato() {
        return noCoincideConContrato;
    }

    /**
     * Sets the value of the noCoincideConContrato property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNoCoincideConContrato(String value) {
        this.noCoincideConContrato = value;
    }

    /**
     * Gets the value of the cargoCambioDeFormaDePago property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCargoCambioDeFormaDePago() {
        return cargoCambioDeFormaDePago;
    }

    /**
     * Sets the value of the cargoCambioDeFormaDePago property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCargoCambioDeFormaDePago(String value) {
        this.cargoCambioDeFormaDePago = value;
    }

}
