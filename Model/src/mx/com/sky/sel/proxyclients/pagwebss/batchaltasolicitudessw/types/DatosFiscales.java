
package mx.com.sky.sel.proxyclients.pagwebss.batchaltasolicitudessw.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatosFiscales complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DatosFiscales"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RFC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RazonSocial" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Compania" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TipoFactura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MetodoEnvio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosFiscales",
         propOrder =
         { "rfc", "tipoPersona", "regimenFiscal", "usoCfdi", "razonSocial", "compania", "tipoFactura", "metodoEnvio"
    })
public class DatosFiscales {

    @XmlElement(name = "RFC", required = true)
    protected String rfc;
    @XmlElement(name = "RazonSocial", required = true)
    protected String razonSocial;
    @XmlElement(name = "Compania", required = true)
    protected String compania;
    @XmlElement(name = "TipoFactura", required = true)
    protected String tipoFactura;
    @XmlElement(name = "MetodoEnvio", required = true)
    protected String metodoEnvio;
    @XmlElement(name = "RegimenFiscal", required = true)
    protected String regimenFiscal;
    @XmlElement(name = "TipoPersona", required = true)
    protected String tipoPersona;
    @XmlElement(name = "UsoCfdi", required = true)
    protected String usoCfdi;

    /**
     * Gets the value of the rfc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRFC() {
        return rfc;
    }

    /**
     * Sets the value of the rfc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRFC(String value) {
        this.rfc = value;
    }

    /**
     * Gets the value of the razonSocial property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Sets the value of the razonSocial property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRazonSocial(String value) {
        this.razonSocial = value;
    }

    /**
     * Gets the value of the compania property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCompania() {
        return compania;
    }

    /**
     * Sets the value of the compania property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCompania(String value) {
        this.compania = value;
    }

    /**
     * Gets the value of the tipoFactura property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoFactura() {
        return tipoFactura;
    }

    /**
     * Sets the value of the tipoFactura property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoFactura(String value) {
        this.tipoFactura = value;
    }

    /**
     * Gets the value of the metodoEnvio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMetodoEnvio() {
        return metodoEnvio;
    }

    /**
     * Sets the value of the metodoEnvio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMetodoEnvio(String value) {
        this.metodoEnvio = value;
    }

    /**
     * Gets the value of the regimenFiscal property.
     *
     * @return
     * possible object is
     * {@link String}
     *
     */
    public String getRegimenFiscal() {
        return regimenFiscal;
    }

    /**
     * Gets the value of the tipoPersona property.
     *
     * @return
     * possible object is
     * {@link String}
     *
     */
    public String getTipoPersona() {
        return tipoPersona;
    }

    /**
     * Gets the value of the usoCfdi property.
     *
     * @return
     * possible object is
     * {@link String}
     *
     */
    public String getUsoCfdi() {
        return usoCfdi;
    }

    /**
     * Sets the value of the regimenFiscal property.
     *
     * @param value
     * allowed object is
     * {@link String}
     *
     */
    public void setRegimenFiscal(String value) {
        this.regimenFiscal = value;
    }

    /**
     * Sets the value of the tipoPersona property.
     *
     * @param value
     * allowed object is
     * {@link String}
     *
     */
    public void setTipoPersona(String value) {
        this.tipoPersona = value;
    }

    /**
     * Sets the value of the usoCfdi property.
     *
     * @param value
     * allowed object is
     * {@link String}
     *
     */
    public void setUsoCfdi(String value) {
        this.usoCfdi = value;
    }

}
