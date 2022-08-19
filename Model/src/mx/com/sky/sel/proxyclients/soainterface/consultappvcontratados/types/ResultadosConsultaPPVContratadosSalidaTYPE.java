
package mx.com.sky.sel.proxyclients.soainterface.consultappvcontratados.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Resultados_consultaPPVContratados_Salida_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Resultados_consultaPPVContratados_Salida_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PRECIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_EVENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CANAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FECHA_TRANSMISION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FECHA_ORDEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TITULO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIPO_SERVICIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ESTATUS_EVENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TARJETA_INTELIGENTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ESTATUS_ORDEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Resultados_consultaPPVContratados_Salida_TYPE", namespace = "http://www.sky.com.mx/soasky", propOrder = {
    "precio",
    "idevento",
    "canal",
    "fechatransmision",
    "fechaorden",
    "titulo",
    "tiposervicio",
    "estatusevento",
    "tarjetainteligente",
    "estatusorden"
})
public class ResultadosConsultaPPVContratadosSalidaTYPE {

    @XmlElement(name = "PRECIO")
    protected String precio;
    @XmlElement(name = "ID_EVENTO")
    protected String idevento;
    @XmlElement(name = "CANAL")
    protected String canal;
    @XmlElement(name = "FECHA_TRANSMISION")
    protected String fechatransmision;
    @XmlElement(name = "FECHA_ORDEN")
    protected String fechaorden;
    @XmlElement(name = "TITULO")
    protected String titulo;
    @XmlElement(name = "TIPO_SERVICIO")
    protected String tiposervicio;
    @XmlElement(name = "ESTATUS_EVENTO")
    protected String estatusevento;
    @XmlElement(name = "TARJETA_INTELIGENTE")
    protected String tarjetainteligente;
    @XmlElement(name = "ESTATUS_ORDEN")
    protected String estatusorden;

    /**
     * Gets the value of the precio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRECIO() {
        return precio;
    }

    /**
     * Sets the value of the precio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRECIO(String value) {
        this.precio = value;
    }

    /**
     * Gets the value of the idevento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDEVENTO() {
        return idevento;
    }

    /**
     * Sets the value of the idevento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDEVENTO(String value) {
        this.idevento = value;
    }

    /**
     * Gets the value of the canal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCANAL() {
        return canal;
    }

    /**
     * Sets the value of the canal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCANAL(String value) {
        this.canal = value;
    }

    /**
     * Gets the value of the fechatransmision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHATRANSMISION() {
        return fechatransmision;
    }

    /**
     * Sets the value of the fechatransmision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHATRANSMISION(String value) {
        this.fechatransmision = value;
    }

    /**
     * Gets the value of the fechaorden property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHAORDEN() {
        return fechaorden;
    }

    /**
     * Sets the value of the fechaorden property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHAORDEN(String value) {
        this.fechaorden = value;
    }

    /**
     * Gets the value of the titulo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITULO() {
        return titulo;
    }

    /**
     * Sets the value of the titulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITULO(String value) {
        this.titulo = value;
    }

    /**
     * Gets the value of the tiposervicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOSERVICIO() {
        return tiposervicio;
    }

    /**
     * Sets the value of the tiposervicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOSERVICIO(String value) {
        this.tiposervicio = value;
    }

    /**
     * Gets the value of the estatusevento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESTATUSEVENTO() {
        return estatusevento;
    }

    /**
     * Sets the value of the estatusevento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESTATUSEVENTO(String value) {
        this.estatusevento = value;
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
     * Gets the value of the estatusorden property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESTATUSORDEN() {
        return estatusorden;
    }

    /**
     * Sets the value of the estatusorden property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESTATUSORDEN(String value) {
        this.estatusorden = value;
    }

}
