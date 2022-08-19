
package mx.com.sky.enterpriseobjects.sel.tarjetapagoebo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatosTarjetaPagoType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DatosTarjetaPagoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="anioExp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mesExp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cvv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreTitular" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoTarjeta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="marcaTarjeta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosTarjetaPagoType",
         propOrder =
         { "numero", "anioExp", "mesExp", "cvv", "nombreTitular", "tipoTarjeta",
           "marcaTarjeta"
    })
public class DatosTarjetaPagoType {

    @XmlElement(required = true)
    protected String numero;
    @XmlElement(required = true)
    protected String anioExp;
    @XmlElement(required = true)
    protected String mesExp;
    protected String cvv;
    @XmlElement(required = true)
    protected String nombreTitular;
    @XmlElement(required = true)
    protected String tipoTarjeta;
    @XmlElement(required = true)
    protected String marcaTarjeta;

    /**
     * Gets the value of the numero property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Gets the value of the anioExp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAnioExp() {
        return anioExp;
    }

    /**
     * Sets the value of the anioExp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAnioExp(String value) {
        this.anioExp = value;
    }

    /**
     * Gets the value of the mesExp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMesExp() {
        return mesExp;
    }

    /**
     * Sets the value of the mesExp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMesExp(String value) {
        this.mesExp = value;
    }

    /**
     * Gets the value of the cvv property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCvv() {
        return cvv;
    }

    /**
     * Sets the value of the cvv property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCvv(String value) {
        this.cvv = value;
    }

    /**
     * Gets the value of the nombreTitular property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombreTitular() {
        return nombreTitular;
    }

    /**
     * Sets the value of the nombreTitular property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombreTitular(String value) {
        this.nombreTitular = value;
    }

    /**
     * Gets the value of the tipoTarjeta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    /**
     * Sets the value of the tipoTarjeta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoTarjeta(String value) {
        this.tipoTarjeta = value;
    }

    /**
     * Gets the value of the marcaTarjeta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMarcaTarjeta() {
        return marcaTarjeta;
    }

    /**
     * Sets the value of the marcaTarjeta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMarcaTarjeta(String value) {
        this.marcaTarjeta = value;
    }

}
