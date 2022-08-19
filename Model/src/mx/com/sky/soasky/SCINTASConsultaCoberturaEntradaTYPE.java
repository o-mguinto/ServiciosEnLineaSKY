
package mx.com.sky.soasky;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SC_INT_AS_ConsultaCobertura_Entrada_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SC_INT_AS_ConsultaCobertura_Entrada_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CABECERA" type="{http://www.sky.com.mx/soasky}Cabecera_Entrada_TYPE"/&gt;
 *         &lt;element name="Latitude" type="{http://www.sky.com.mx/soasky}stringLongMin"/&gt;
 *         &lt;element name="Longitude" type="{http://www.sky.com.mx/soasky}stringLongMin"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SC_INT_AS_ConsultaCobertura_Entrada_TYPE", propOrder = { "cabecera", "latitude", "longitude" })
public class SCINTASConsultaCoberturaEntradaTYPE {

    @XmlElement(name = "CABECERA", required = true)
    protected CabeceraEntradaTYPE cabecera;
    @XmlElement(name = "Latitude", required = true)
    protected String latitude;
    @XmlElement(name = "Longitude", required = true)
    protected String longitude;

    /**
     * Gets the value of the cabecera property.
     *
     * @return
     *     possible object is
     *     {@link CabeceraEntradaTYPE }
     *
     */
    public CabeceraEntradaTYPE getCABECERA() {
        return cabecera;
    }

    /**
     * Sets the value of the cabecera property.
     *
     * @param value
     *     allowed object is
     *     {@link CabeceraEntradaTYPE }
     *
     */
    public void setCABECERA(CabeceraEntradaTYPE value) {
        this.cabecera = value;
    }

    /**
     * Gets the value of the latitude property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

}
