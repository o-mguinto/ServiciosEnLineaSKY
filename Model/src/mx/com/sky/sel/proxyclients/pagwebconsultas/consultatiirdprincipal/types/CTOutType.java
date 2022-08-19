
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultatiirdprincipal.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CTOutType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CTOutType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resultadodesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TarjetaInteligente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IRD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTOutType", propOrder = { "resultado", "resultadodesc", "tarjetaInteligente", "ird" })
public class CTOutType {

    @XmlElement(required = true)
    protected String resultado;
    @XmlElement(required = true)
    protected String resultadodesc;
    @XmlElement(name = "TarjetaInteligente", required = true)
    protected String tarjetaInteligente;
    @XmlElement(name = "IRD", required = true)
    protected String ird;

    /**
     * Gets the value of the resultado property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * Sets the value of the resultado property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResultado(String value) {
        this.resultado = value;
    }

    /**
     * Gets the value of the resultadodesc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResultadodesc() {
        return resultadodesc;
    }

    /**
     * Sets the value of the resultadodesc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResultadodesc(String value) {
        this.resultadodesc = value;
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

    /**
     * Gets the value of the ird property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIRD() {
        return ird;
    }

    /**
     * Sets the value of the ird property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIRD(String value) {
        this.ird = value;
    }

}
