
package mx.com.sky.sel.proxyclients.pagwebss.batchaltasolicitudessw.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InfoPPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="InfoPPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NombreDelEvento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TipoEvento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Costo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MailFechaInicio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MailFechaTermino" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CanalDisplay" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Canal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IDEvento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FechaExpiracion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FechaInicio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Duracion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ZonaHoraria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TokenOverride" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TokenValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ppvGenreId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="providerEventId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SKYTrackingId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoPPE",
         propOrder =
         { "nombreDelEvento", "tipoEvento", "costo", "mailFechaInicio", "mailFechaTermino", "canalDisplay", "canal",
           "idEvento", "fechaExpiracion", "fechaInicio", "duracion", "zonaHoraria", "tokenOverride", "tokenValue",
           "ppvGenreId", "providerEventId", "orderType", "skyTrackingId"
    })
public class InfoPPE {

    @XmlElement(name = "NombreDelEvento", required = true)
    protected String nombreDelEvento;
    @XmlElement(name = "TipoEvento", required = true)
    protected String tipoEvento;
    @XmlElement(name = "Costo", required = true)
    protected String costo;
    @XmlElement(name = "MailFechaInicio", required = true)
    protected String mailFechaInicio;
    @XmlElement(name = "MailFechaTermino", required = true)
    protected String mailFechaTermino;
    @XmlElement(name = "CanalDisplay", required = true)
    protected String canalDisplay;
    @XmlElement(name = "Canal", required = true)
    protected String canal;
    @XmlElement(name = "IDEvento", required = true)
    protected String idEvento;
    @XmlElement(name = "FechaExpiracion", required = true)
    protected String fechaExpiracion;
    @XmlElement(name = "FechaInicio", required = true)
    protected String fechaInicio;
    @XmlElement(name = "Duracion", required = true)
    protected String duracion;
    @XmlElement(name = "ZonaHoraria", required = true)
    protected String zonaHoraria;
    @XmlElement(name = "TokenOverride", required = true)
    protected String tokenOverride;
    @XmlElement(name = "TokenValue", required = true)
    protected String tokenValue;
    @XmlElement(required = true)
    protected String ppvGenreId;
    @XmlElement(required = true)
    protected String providerEventId;
    @XmlElement(required = true)
    protected String orderType;
    @XmlElement(name = "SKYTrackingId", required = true)
    protected String skyTrackingId;

    /**
     * Gets the value of the nombreDelEvento property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombreDelEvento() {
        return nombreDelEvento;
    }

    /**
     * Sets the value of the nombreDelEvento property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombreDelEvento(String value) {
        this.nombreDelEvento = value;
    }

    /**
     * Gets the value of the tipoEvento property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoEvento() {
        return tipoEvento;
    }

    /**
     * Sets the value of the tipoEvento property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoEvento(String value) {
        this.tipoEvento = value;
    }

    /**
     * Gets the value of the costo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCosto() {
        return costo;
    }

    /**
     * Sets the value of the costo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCosto(String value) {
        this.costo = value;
    }

    /**
     * Gets the value of the mailFechaInicio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMailFechaInicio() {
        return mailFechaInicio;
    }

    /**
     * Sets the value of the mailFechaInicio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMailFechaInicio(String value) {
        this.mailFechaInicio = value;
    }

    /**
     * Gets the value of the mailFechaTermino property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMailFechaTermino() {
        return mailFechaTermino;
    }

    /**
     * Sets the value of the mailFechaTermino property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMailFechaTermino(String value) {
        this.mailFechaTermino = value;
    }

    /**
     * Gets the value of the canalDisplay property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCanalDisplay() {
        return canalDisplay;
    }

    /**
     * Sets the value of the canalDisplay property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCanalDisplay(String value) {
        this.canalDisplay = value;
    }

    /**
     * Gets the value of the canal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCanal() {
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
    public void setCanal(String value) {
        this.canal = value;
    }

    /**
     * Gets the value of the idEvento property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIDEvento() {
        return idEvento;
    }

    /**
     * Sets the value of the idEvento property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIDEvento(String value) {
        this.idEvento = value;
    }

    /**
     * Gets the value of the fechaExpiracion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    /**
     * Sets the value of the fechaExpiracion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaExpiracion(String value) {
        this.fechaExpiracion = value;
    }

    /**
     * Gets the value of the fechaInicio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Sets the value of the fechaInicio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaInicio(String value) {
        this.fechaInicio = value;
    }

    /**
     * Gets the value of the duracion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDuracion() {
        return duracion;
    }

    /**
     * Sets the value of the duracion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDuracion(String value) {
        this.duracion = value;
    }

    /**
     * Gets the value of the zonaHoraria property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getZonaHoraria() {
        return zonaHoraria;
    }

    /**
     * Sets the value of the zonaHoraria property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setZonaHoraria(String value) {
        this.zonaHoraria = value;
    }

    /**
     * Gets the value of the tokenOverride property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTokenOverride() {
        return tokenOverride;
    }

    /**
     * Sets the value of the tokenOverride property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTokenOverride(String value) {
        this.tokenOverride = value;
    }

    /**
     * Gets the value of the tokenValue property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTokenValue() {
        return tokenValue;
    }

    /**
     * Sets the value of the tokenValue property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTokenValue(String value) {
        this.tokenValue = value;
    }

    /**
     * Gets the value of the ppvGenreId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPpvGenreId() {
        return ppvGenreId;
    }

    /**
     * Sets the value of the ppvGenreId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPpvGenreId(String value) {
        this.ppvGenreId = value;
    }

    /**
     * Gets the value of the providerEventId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProviderEventId() {
        return providerEventId;
    }

    /**
     * Sets the value of the providerEventId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProviderEventId(String value) {
        this.providerEventId = value;
    }

    /**
     * Gets the value of the orderType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the skyTrackingId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSKYTrackingId() {
        return skyTrackingId;
    }

    /**
     * Sets the value of the skyTrackingId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSKYTrackingId(String value) {
        this.skyTrackingId = value;
    }

}
