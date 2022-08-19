
package mx.com.sky.sel.proxyclients.pagweb.opinionsugerencias.types;

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
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Sugerencias" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TipoConsulta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NumeroSS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "userID", "sugerencias", "tipoConsulta", "numeroSS" })
@XmlRootElement(name = "Opinion_SugerenciasProcessRequest")
public class OpinionSugerenciasProcessRequest {

    @XmlElement(required = true)
    protected String userID;
    @XmlElement(name = "Sugerencias", required = true)
    protected String sugerencias;
    @XmlElement(name = "TipoConsulta", required = true)
    protected String tipoConsulta;
    @XmlElement(name = "NumeroSS", required = true)
    protected String numeroSS;

    /**
     * Gets the value of the userID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the sugerencias property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSugerencias() {
        return sugerencias;
    }

    /**
     * Sets the value of the sugerencias property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSugerencias(String value) {
        this.sugerencias = value;
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

}
