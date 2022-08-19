
package mx.com.sky.sel.proxyclients.soainterface.consultappvcontratados.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Suscriptor_consultaPPVContratados_Entrada_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Suscriptor_consultaPPVContratados_Entrada_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CABECERA" type="{http://www.sky.com.mx/soasky}Cabecera_Entrada_TYPE"/>
 *         &lt;element name="TARJETA_INTELIGENTE" type="{http://www.sky.com.mx/soasky}stringLongMin"/>
 *         &lt;element name="FECHA_INICIO" type="{http://www.sky.com.mx/soasky}empty-date" minOccurs="0"/>
 *         &lt;element name="FECHA_FIN" type="{http://www.sky.com.mx/soasky}empty-date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Suscriptor_consultaPPVContratados_Entrada_TYPE", namespace = "http://www.sky.com.mx/soasky", propOrder = {
    "cabecera",
    "tarjetainteligente",
    "fechainicio",
    "fechafin"
})
public class SuscriptorConsultaPPVContratadosEntradaTYPE {

    @XmlElement(name = "CABECERA", required = true)
    protected CabeceraEntradaTYPE cabecera;
    @XmlElement(name = "TARJETA_INTELIGENTE", required = true)
    protected String tarjetainteligente;
    @XmlElement(name = "FECHA_INICIO")
    protected String fechainicio;
    @XmlElement(name = "FECHA_FIN")
    protected String fechafin;

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
     * Gets the value of the tarjetainteligente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTARJETAINTELIGENTE() {
        return tarjetainteligente;
    }

    /**
     * Sets the value of the tarjetainteligente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTARJETAINTELIGENTE(String value) {
        this.tarjetainteligente = value;
    }

    /**
     * Gets the value of the fechainicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHAINICIO() {
        return fechainicio;
    }

    /**
     * Sets the value of the fechainicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHAINICIO(String value) {
        this.fechainicio = value;
    }

    /**
     * Gets the value of the fechafin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHAFIN() {
        return fechafin;
    }

    /**
     * Sets the value of the fechafin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHAFIN(String value) {
        this.fechafin = value;
    }

}
