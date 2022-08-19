
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultacanalescarta.types;

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
 *         &lt;element name="Paquete" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TipoCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Categoria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "paquete", "tipoCuenta", "hd", "categoria" })
@XmlRootElement(name = "ConsultaCanalesALaCartaProcessRequest")
public class ConsultaCanalesALaCartaProcessRequest {

    @XmlElement(name = "Paquete", required = true)
    protected String paquete;
    @XmlElement(name = "TipoCuenta", required = true)
    protected String tipoCuenta;
    @XmlElement(name = "HD", required = true)
    protected String hd;
    @XmlElement(name = "Categoria", required = true, nillable = true)
    protected String categoria;

    /**
     * Gets the value of the paquete property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaquete() {
        return paquete;
    }

    /**
     * Sets the value of the paquete property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaquete(String value) {
        this.paquete = value;
    }

    /**
     * Gets the value of the tipoCuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    /**
     * Sets the value of the tipoCuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoCuenta(String value) {
        this.tipoCuenta = value;
    }

    /**
     * Gets the value of the hd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHD() {
        return hd;
    }

    /**
     * Sets the value of the hd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHD(String value) {
        this.hd = value;
    }

    /**
     * Gets the value of the categoria property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Sets the value of the categoria property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

}
