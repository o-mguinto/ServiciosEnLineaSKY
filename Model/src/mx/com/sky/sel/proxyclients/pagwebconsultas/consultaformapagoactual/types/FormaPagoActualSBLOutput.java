
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultaformapagoactual.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormaPagoActualSBLOutput complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FormaPagoActualSBLOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CUENTA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PAYMT_METH_CD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormaPagoActualSBLOutput", propOrder = { "cuenta", "paymtmethcd" })
public class FormaPagoActualSBLOutput {

    @XmlElement(name = "CUENTA", required = true, nillable = true)
    protected String cuenta;
    @XmlElement(name = "PAYMT_METH_CD", required = true, nillable = true)
    protected String paymtmethcd;

    /**
     * Gets the value of the cuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCUENTA() {
        return cuenta;
    }

    /**
     * Sets the value of the cuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCUENTA(String value) {
        this.cuenta = value;
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

}
