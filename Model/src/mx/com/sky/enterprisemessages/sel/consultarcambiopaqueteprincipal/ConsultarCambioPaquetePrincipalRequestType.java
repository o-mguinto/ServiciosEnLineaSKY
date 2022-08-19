
package mx.com.sky.enterprisemessages.sel.consultarcambiopaqueteprincipal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarCambioPaquetePrincipalRequestType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarCambioPaquetePrincipalRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Proceso" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Categoria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AssetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SecondAssetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarCambioPaquetePrincipalRequestType",
         propOrder = { "proceso", "categoria", "cuenta", "assetNumber", "secondAssetNumber", "pais"
    })
public class ConsultarCambioPaquetePrincipalRequestType {

    @XmlElement(name = "Proceso", required = true)
    protected String proceso;
    @XmlElement(name = "Categoria", required = true)
    protected String categoria;
    @XmlElement(name = "Cuenta", required = true)
    protected String cuenta;
    @XmlElement(name = "AssetNumber", required = true)
    protected String assetNumber;
    @XmlElement(name = "SecondAssetNumber", required = true)
    protected String secondAssetNumber;
    @XmlElement(name = "Pais", required = true)
    protected String pais;

    /**
     * Gets the value of the proceso property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProceso() {
        return proceso;
    }

    /**
     * Sets the value of the proceso property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProceso(String value) {
        this.proceso = value;
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

    /**
     * Gets the value of the cuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Sets the value of the cuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCuenta(String value) {
        this.cuenta = value;
    }

    /**
     * Gets the value of the assetNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAssetNumber() {
        return assetNumber;
    }

    /**
     * Sets the value of the assetNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAssetNumber(String value) {
        this.assetNumber = value;
    }

    /**
     * Gets the value of the secondAssetNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSecondAssetNumber() {
        return secondAssetNumber;
    }

    /**
     * Sets the value of the secondAssetNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSecondAssetNumber(String value) {
        this.secondAssetNumber = value;
    }

    /**
     * Gets the value of the pais property.
     *
     * @return
     * possible object is
     * {@link String}
     *
     */
    public String getPais() {
        return pais;
    }

    /**
     * Sets the value of the pais property.
     *
     * @param value
     * allowed object is
     * {@link String}
     *
     */
    public void setPais(String value) {
        this.pais = value;
    }

}
