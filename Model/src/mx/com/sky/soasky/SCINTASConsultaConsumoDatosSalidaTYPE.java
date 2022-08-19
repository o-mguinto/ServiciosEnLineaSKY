
package mx.com.sky.soasky;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SC_INT_AS_ConsultaConsumoDatos_Salida_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SC_INT_AS_ConsultaConsumoDatos_Salida_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="CABECERA" type="{http://www.sky.com.mx/soasky}Cabecera_Salida_TYPE"/&gt;
 *           &lt;element name="Msisdn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="Iccid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="Imei" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="Oferta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="Estatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="Coordenadas" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="ListaBolsas" type="{http://www.sky.com.mx/soasky}ListaBolsas_TYPE"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SC_INT_AS_ConsultaConsumoDatos_Salida_TYPE",
         propOrder = { "cabecera", "msisdn", "iccid", "imei", "oferta", "estatus", "coordenadas", "listaBolsas"
    })
public class SCINTASConsultaConsumoDatosSalidaTYPE {

    @XmlElement(name = "CABECERA", required = true)
    protected CabeceraSalidaTYPE cabecera;
    @XmlElement(name = "Msisdn", required = true)
    protected String msisdn;
    @XmlElement(name = "Iccid", required = true)
    protected String iccid;
    @XmlElement(name = "Imei", required = true)
    protected String imei;
    @XmlElement(name = "Oferta", required = true)
    protected String oferta;
    @XmlElement(name = "Estatus", required = true)
    protected String estatus;
    @XmlElement(name = "Coordenadas", required = true)
    protected String coordenadas;
    @XmlElement(name = "ListaBolsas", required = true)
    protected ListaBolsasTYPE listaBolsas;

    /**
     * Gets the value of the cabecera property.
     *
     * @return
     *     possible object is
     *     {@link CabeceraSalidaTYPE }
     *
     */
    public CabeceraSalidaTYPE getCABECERA() {
        return cabecera;
    }

    /**
     * Sets the value of the cabecera property.
     *
     * @param value
     *     allowed object is
     *     {@link CabeceraSalidaTYPE }
     *
     */
    public void setCABECERA(CabeceraSalidaTYPE value) {
        this.cabecera = value;
    }

    /**
     * Gets the value of the msisdn property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the iccid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIccid() {
        return iccid;
    }

    /**
     * Sets the value of the iccid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIccid(String value) {
        this.iccid = value;
    }

    /**
     * Gets the value of the imei property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getImei() {
        return imei;
    }

    /**
     * Sets the value of the imei property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setImei(String value) {
        this.imei = value;
    }

    /**
     * Gets the value of the oferta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOferta() {
        return oferta;
    }

    /**
     * Sets the value of the oferta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOferta(String value) {
        this.oferta = value;
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
     * Gets the value of the coordenadas property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCoordenadas() {
        return coordenadas;
    }

    /**
     * Sets the value of the coordenadas property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCoordenadas(String value) {
        this.coordenadas = value;
    }

    /**
     * Gets the value of the listaBolsas property.
     *
     * @return
     *     possible object is
     *     {@link ListaBolsasTYPE }
     *
     */
    public ListaBolsasTYPE getListaBolsas() {
        return listaBolsas;
    }

    /**
     * Sets the value of the listaBolsas property.
     *
     * @param value
     *     allowed object is
     *     {@link ListaBolsasTYPE }
     *
     */
    public void setListaBolsas(ListaBolsasTYPE value) {
        this.listaBolsas = value;
    }

}
