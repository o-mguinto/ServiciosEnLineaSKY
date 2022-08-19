
package mx.com.sky.enterpriseobjects.sel.gestionarssportabilidadsoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceInfoResponseType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ServiceInfoResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumeroSS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Subestado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceInfoResponseType", propOrder = { "numeroSS", "estado", "subestado" })
public class ServiceInfoResponseType {

    @XmlElement(name = "NumeroSS", required = true)
    protected String numeroSS;
    @XmlElement(name = "Estado", required = true)
    protected String estado;
    @XmlElement(name = "Subestado", required = true)
    protected String subestado;

    /**
     * Gets the value of the numeroSS property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroSS() {
        return numeroSS;
    }

    /**
     * Sets the value of the numeroSS property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroSS(String value) {
        this.numeroSS = value;
    }

    /**
     * Gets the value of the estado property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Gets the value of the subestado property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubestado() {
        return subestado;
    }

    /**
     * Sets the value of the subestado property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubestado(String value) {
        this.subestado = value;
    }

}
