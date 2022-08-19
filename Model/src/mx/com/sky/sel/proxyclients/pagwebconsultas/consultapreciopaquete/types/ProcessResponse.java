
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultapreciopaquete.types;

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
 *         &lt;element name="precioLista" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="precioPagoOportuno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechaIniPrecioLista" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",
         propOrder = { "resultado", "resultadodesc", "precioLista", "precioPagoOportuno", "fechaIniPrecioLista" })
@XmlRootElement(name = "processResponse",
                namespace = "http://xmlns.oracle.com/SKYConsultas/ConsultaPaquete/ConsultaPrecioPaquete")
public class ProcessResponse {

    @XmlElement(namespace = "http://xmlns.oracle.com/SKYConsultas/ConsultaPaquete/ConsultaPrecioPaquete",
                required = true)
    protected String resultado;
    @XmlElement(namespace = "http://xmlns.oracle.com/SKYConsultas/ConsultaPaquete/ConsultaPrecioPaquete",
                required = true)
    protected String resultadodesc;
    @XmlElement(namespace = "http://xmlns.oracle.com/SKYConsultas/ConsultaPaquete/ConsultaPrecioPaquete",
                required = true)
    protected String precioLista;
    @XmlElement(namespace = "http://xmlns.oracle.com/SKYConsultas/ConsultaPaquete/ConsultaPrecioPaquete",
                required = true)
    protected String precioPagoOportuno;
    @XmlElement(namespace = "http://xmlns.oracle.com/SKYConsultas/ConsultaPaquete/ConsultaPrecioPaquete",
                required = true)
    protected String fechaIniPrecioLista;

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
     * Gets the value of the precioLista property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPrecioLista() {
        return precioLista;
    }

    /**
     * Sets the value of the precioLista property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPrecioLista(String value) {
        this.precioLista = value;
    }

    /**
     * Gets the value of the precioPagoOportuno property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPrecioPagoOportuno() {
        return precioPagoOportuno;
    }

    /**
     * Sets the value of the precioPagoOportuno property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPrecioPagoOportuno(String value) {
        this.precioPagoOportuno = value;
    }

    /**
     * Gets the value of the fechaIniPrecioLista property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaIniPrecioLista() {
        return fechaIniPrecioLista;
    }

    /**
     * Sets the value of the fechaIniPrecioLista property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaIniPrecioLista(String value) {
        this.fechaIniPrecioLista = value;
    }

}
