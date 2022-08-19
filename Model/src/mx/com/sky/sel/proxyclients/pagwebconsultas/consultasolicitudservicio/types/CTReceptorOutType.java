
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultasolicitudservicio.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CTReceptorOutType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CTReceptorOutType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resultadodesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SERIE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MARCA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MODELO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VERSION_SOFT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTReceptorOutType",
         propOrder = { "resultado", "resultadodesc", "serie", "marca", "modelo", "versionsoft" })
public class CTReceptorOutType {

    @XmlElement(required = true)
    protected String resultado;
    @XmlElement(required = true)
    protected String resultadodesc;
    @XmlElement(name = "SERIE", required = true)
    protected String serie;
    @XmlElement(name = "MARCA", required = true)
    protected String marca;
    @XmlElement(name = "MODELO", required = true)
    protected String modelo;
    @XmlElement(name = "VERSION_SOFT", required = true)
    protected String versionsoft;

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
     * Gets the value of the serie property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSERIE() {
        return serie;
    }

    /**
     * Sets the value of the serie property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSERIE(String value) {
        this.serie = value;
    }

    /**
     * Gets the value of the marca property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMARCA() {
        return marca;
    }

    /**
     * Sets the value of the marca property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMARCA(String value) {
        this.marca = value;
    }

    /**
     * Gets the value of the modelo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMODELO() {
        return modelo;
    }

    /**
     * Sets the value of the modelo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMODELO(String value) {
        this.modelo = value;
    }

    /**
     * Gets the value of the versionsoft property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVERSIONSOFT() {
        return versionsoft;
    }

    /**
     * Sets the value of the versionsoft property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVERSIONSOFT(String value) {
        this.versionsoft = value;
    }

}
