
package mx.com.sky.sel.proxyclients.pagweb.pwremotebooking.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remotebookingTypeIN complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="remotebookingTypeIN"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SESSION_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CTA_SKY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="USERNAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CATEGORIA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PAIS_ISO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DESCRIPCION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CANAL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="METODO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RECURRENCIA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SOLICITUD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RESPUESTA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PC_MOVIL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SISTEMA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remotebookingTypeIN",
         propOrder =
         { "sessionid", "ctasky", "username", "categoria", "paisiso", "descripcion", "canal", "metodo", "recurrencia",
           "solicitud", "respuesta", "pcmovil", "sistema"
    })
public class RemotebookingTypeIN {

    @XmlElement(name = "SESSION_ID", required = true)
    protected String sessionid;
    @XmlElement(name = "CTA_SKY", required = true)
    protected String ctasky;
    @XmlElement(name = "USERNAME", required = true)
    protected String username;
    @XmlElement(name = "CATEGORIA", required = true)
    protected String categoria;
    @XmlElement(name = "PAIS_ISO", required = true)
    protected String paisiso;
    @XmlElement(name = "DESCRIPCION", required = true)
    protected String descripcion;
    @XmlElement(name = "CANAL", required = true)
    protected String canal;
    @XmlElement(name = "METODO", required = true)
    protected String metodo;
    @XmlElement(name = "RECURRENCIA", required = true)
    protected String recurrencia;
    @XmlElement(name = "SOLICITUD", required = true)
    protected String solicitud;
    @XmlElement(name = "RESPUESTA", required = true)
    protected String respuesta;
    @XmlElement(name = "PC_MOVIL", required = true)
    protected String pcmovil;
    @XmlElement(name = "SISTEMA", required = true)
    protected String sistema;

    /**
     * Gets the value of the sessionid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSESSIONID() {
        return sessionid;
    }

    /**
     * Sets the value of the sessionid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSESSIONID(String value) {
        this.sessionid = value;
    }

    /**
     * Gets the value of the ctasky property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCTASKY() {
        return ctasky;
    }

    /**
     * Sets the value of the ctasky property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCTASKY(String value) {
        this.ctasky = value;
    }

    /**
     * Gets the value of the username property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUSERNAME() {
        return username;
    }

    /**
     * Sets the value of the username property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUSERNAME(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the categoria property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCATEGORIA() {
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
    public void setCATEGORIA(String value) {
        this.categoria = value;
    }

    /**
     * Gets the value of the paisiso property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPAISISO() {
        return paisiso;
    }

    /**
     * Sets the value of the paisiso property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPAISISO(String value) {
        this.paisiso = value;
    }

    /**
     * Gets the value of the descripcion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDESCRIPCION() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDESCRIPCION(String value) {
        this.descripcion = value;
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
     * Gets the value of the metodo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMETODO() {
        return metodo;
    }

    /**
     * Sets the value of the metodo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMETODO(String value) {
        this.metodo = value;
    }

    /**
     * Gets the value of the recurrencia property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRECURRENCIA() {
        return recurrencia;
    }

    /**
     * Sets the value of the recurrencia property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRECURRENCIA(String value) {
        this.recurrencia = value;
    }

    /**
     * Gets the value of the solicitud property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSOLICITUD() {
        return solicitud;
    }

    /**
     * Sets the value of the solicitud property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSOLICITUD(String value) {
        this.solicitud = value;
    }

    /**
     * Gets the value of the respuesta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRESPUESTA() {
        return respuesta;
    }

    /**
     * Sets the value of the respuesta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRESPUESTA(String value) {
        this.respuesta = value;
    }

    /**
     * Gets the value of the pcmovil property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPCMOVIL() {
        return pcmovil;
    }

    /**
     * Sets the value of the pcmovil property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPCMOVIL(String value) {
        this.pcmovil = value;
    }

    /**
     * Gets the value of the sistema property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSISTEMA() {
        return sistema;
    }

    /**
     * Sets the value of the sistema property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSISTEMA(String value) {
        this.sistema = value;
    }

}
