
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultaprompago.types;

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
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resultadodesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ListaPromesaDePago" type="{http://xmlns.oracle.com/ConsultaPromesaDePago}PromesaDePagoCollection"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "resultado", "resultadodesc", "listaPromesaDePago" })
@XmlRootElement(name = "ConsultaPromesaDePagoProcessResponse")
public class ConsultaPromesaDePagoProcessResponse {

    @XmlElement(required = true)
    protected String resultado;
    @XmlElement(required = true)
    protected String resultadodesc;
    @XmlElement(name = "ListaPromesaDePago", required = true)
    protected PromesaDePagoCollection listaPromesaDePago;

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
     * Gets the value of the listaPromesaDePago property.
     *
     * @return
     *     possible object is
     *     {@link PromesaDePagoCollection }
     *
     */
    public PromesaDePagoCollection getListaPromesaDePago() {
        return listaPromesaDePago;
    }

    /**
     * Sets the value of the listaPromesaDePago property.
     *
     * @param value
     *     allowed object is
     *     {@link PromesaDePagoCollection }
     *
     */
    public void setListaPromesaDePago(PromesaDePagoCollection value) {
        this.listaPromesaDePago = value;
    }

}
