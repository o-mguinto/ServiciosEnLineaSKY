
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultapagosporevento.types;

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
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TipoConsulta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BanderaHD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TipoCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Paquete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "country", "tipoConsulta", "banderaHD", "tipoCuenta", "paquete" })
@XmlRootElement(name = "ConsultaPagosPorEventoProcessRequest")
public class ConsultaPagosPorEventoProcessRequest {

    @XmlElement(name = "Country", required = true)
    protected String country;
    @XmlElement(name = "TipoConsulta", required = true)
    protected String tipoConsulta;
    @XmlElement(name = "BanderaHD", required = true)
    protected String banderaHD;
    @XmlElement(name = "TipoCuenta", required = true)
    protected String tipoCuenta;
    @XmlElement(name = "Paquete")
    protected String paquete;

    /**
     * Gets the value of the country property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the tipoConsulta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoConsulta() {
        return tipoConsulta;
    }

    /**
     * Sets the value of the tipoConsulta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoConsulta(String value) {
        this.tipoConsulta = value;
    }

    /**
     * Gets the value of the banderaHD property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBanderaHD() {
        return banderaHD;
    }

    /**
     * Sets the value of the banderaHD property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBanderaHD(String value) {
        this.banderaHD = value;
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

}
