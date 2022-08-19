
package mx.com.sky.sel.proxyclients.pagweb.validacrecimientostya.types;

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
 *         &lt;element name="valida" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="estatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numEquipos" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="paquete" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="meses" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hmc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codigoError" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descError" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
         propOrder = { "valida", "estatus", "numEquipos", "paquete", "meses", "hmc", "codigoError", "descError" })
@XmlRootElement(name = "validaCrecimientosTYAResponse")
public class ValidaCrecimientosTYAResponse {

    @XmlElement(required = true)
    protected String valida;
    @XmlElement(required = true)
    protected String estatus;
    @XmlElement(required = true)
    protected String numEquipos;
    @XmlElement(required = true)
    protected String paquete;
    @XmlElement(required = true)
    protected String meses;
    @XmlElement(required = true)
    protected String hmc;
    @XmlElement(required = true)
    protected String codigoError;
    @XmlElement(required = true, nillable = true)
    protected String descError;

    /**
     * Gets the value of the valida property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValida() {
        return valida;
    }

    /**
     * Sets the value of the valida property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValida(String value) {
        this.valida = value;
    }

    /**
     * Gets the value of the estatus property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEstatus() {
        return estatus;
    }

    /**
     * Sets the value of the estatus property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEstatus(String value) {
        this.estatus = value;
    }

    /**
     * Gets the value of the numEquipos property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumEquipos() {
        return numEquipos;
    }

    /**
     * Sets the value of the numEquipos property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumEquipos(String value) {
        this.numEquipos = value;
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

    /**
     * Gets the value of the meses property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMeses() {
        return meses;
    }

    /**
     * Sets the value of the meses property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMeses(String value) {
        this.meses = value;
    }

    /**
     * Gets the value of the hmc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHmc() {
        return hmc;
    }

    /**
     * Sets the value of the hmc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHmc(String value) {
        this.hmc = value;
    }

    /**
     * Gets the value of the codigoError property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoError() {
        return codigoError;
    }

    /**
     * Sets the value of the codigoError property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoError(String value) {
        this.codigoError = value;
    }

    /**
     * Gets the value of the descError property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescError() {
        return descError;
    }

    /**
     * Sets the value of the descError property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescError(String value) {
        this.descError = value;
    }

}
