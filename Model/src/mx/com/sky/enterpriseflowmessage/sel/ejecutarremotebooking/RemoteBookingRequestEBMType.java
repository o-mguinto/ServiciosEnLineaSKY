
package mx.com.sky.enterpriseflowmessage.sel.ejecutarremotebooking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoteBookingRequestEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RemoteBookingRequestEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Operacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NumeroCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Origen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Grupo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TarjetaInteligente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NumeroComercial" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IdentificadorCanalUnico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NombreCanal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NombreEvento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EventId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ContentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ContentProvider" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OriginalNetwork" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TransportStream" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SeriesId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ProgramId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FechaInicio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FechaFin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TipoGrabacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Duracion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TipoContenido" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Recurrencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SistemaOrigen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Recordatorio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SessionID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Categoria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Pais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoteBookingRequestEBMType",
         propOrder =
         { "operacion", "numeroCuenta", "origen", "grupo", "tipo",
           "tarjetaInteligente", "numeroComercial", "identificadorCanalUnico",
           "nombreCanal", "nombreEvento", "eventId", "contentId",
           "contentProvider", "originalNetwork", "transportStream", "seriesId",
           "programId", "fechaInicio", "fechaFin", "tipoGrabacion", "duracion",
           "tipoContenido", "recurrencia", "sistemaOrigen", "recordatorio",
           "sessionID", "userName", "categoria", "pais"
    })
public class RemoteBookingRequestEBMType {

    @XmlElement(name = "Operacion", required = true)
    protected String operacion;
    @XmlElement(name = "NumeroCuenta", required = true)
    protected String numeroCuenta;
    @XmlElement(name = "Origen", required = true)
    protected String origen;
    @XmlElement(name = "Grupo", required = true)
    protected String grupo;
    @XmlElement(name = "Tipo", required = true)
    protected String tipo;
    @XmlElement(name = "TarjetaInteligente", required = true)
    protected String tarjetaInteligente;
    @XmlElement(name = "NumeroComercial", required = true)
    protected String numeroComercial;
    @XmlElement(name = "IdentificadorCanalUnico", required = true)
    protected String identificadorCanalUnico;
    @XmlElement(name = "NombreCanal", required = true)
    protected String nombreCanal;
    @XmlElement(name = "NombreEvento", required = true)
    protected String nombreEvento;
    @XmlElement(name = "EventId", required = true)
    protected String eventId;
    @XmlElement(name = "ContentId", required = true)
    protected String contentId;
    @XmlElement(name = "ContentProvider", required = true)
    protected String contentProvider;
    @XmlElement(name = "OriginalNetwork", required = true)
    protected String originalNetwork;
    @XmlElement(name = "TransportStream", required = true)
    protected String transportStream;
    @XmlElement(name = "SeriesId", required = true)
    protected String seriesId;
    @XmlElement(name = "ProgramId", required = true)
    protected String programId;
    @XmlElement(name = "FechaInicio", required = true)
    protected String fechaInicio;
    @XmlElement(name = "FechaFin", required = true)
    protected String fechaFin;
    @XmlElement(name = "TipoGrabacion", required = true)
    protected String tipoGrabacion;
    @XmlElement(name = "Duracion", required = true)
    protected String duracion;
    @XmlElement(name = "TipoContenido", required = true)
    protected String tipoContenido;
    @XmlElement(name = "Recurrencia", required = true)
    protected String recurrencia;
    @XmlElement(name = "SistemaOrigen", required = true)
    protected String sistemaOrigen;
    @XmlElement(name = "Recordatorio", required = true)
    protected String recordatorio;
    @XmlElement(name = "SessionID", required = true)
    protected String sessionID;
    @XmlElement(name = "UserName", required = true)
    protected String userName;
    @XmlElement(name = "Categoria", required = true)
    protected String categoria;
    @XmlElement(name = "Pais", required = true)
    protected String pais;

    /**
     * Gets the value of the operacion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     * Sets the value of the operacion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOperacion(String value) {
        this.operacion = value;
    }

    /**
     * Gets the value of the numeroCuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Sets the value of the numeroCuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroCuenta(String value) {
        this.numeroCuenta = value;
    }

    /**
     * Gets the value of the origen property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Sets the value of the origen property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrigen(String value) {
        this.origen = value;
    }

    /**
     * Gets the value of the grupo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGrupo() {
        return grupo;
    }

    /**
     * Sets the value of the grupo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGrupo(String value) {
        this.grupo = value;
    }

    /**
     * Gets the value of the tipo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the tarjetaInteligente property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTarjetaInteligente() {
        return tarjetaInteligente;
    }

    /**
     * Sets the value of the tarjetaInteligente property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTarjetaInteligente(String value) {
        this.tarjetaInteligente = value;
    }

    /**
     * Gets the value of the numeroComercial property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroComercial() {
        return numeroComercial;
    }

    /**
     * Sets the value of the numeroComercial property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroComercial(String value) {
        this.numeroComercial = value;
    }

    /**
     * Gets the value of the identificadorCanalUnico property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdentificadorCanalUnico() {
        return identificadorCanalUnico;
    }

    /**
     * Sets the value of the identificadorCanalUnico property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdentificadorCanalUnico(String value) {
        this.identificadorCanalUnico = value;
    }

    /**
     * Gets the value of the nombreCanal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombreCanal() {
        return nombreCanal;
    }

    /**
     * Sets the value of the nombreCanal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombreCanal(String value) {
        this.nombreCanal = value;
    }

    /**
     * Gets the value of the nombreEvento property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombreEvento() {
        return nombreEvento;
    }

    /**
     * Sets the value of the nombreEvento property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombreEvento(String value) {
        this.nombreEvento = value;
    }

    /**
     * Gets the value of the eventId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEventId(String value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the contentId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContentId() {
        return contentId;
    }

    /**
     * Sets the value of the contentId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContentId(String value) {
        this.contentId = value;
    }

    /**
     * Gets the value of the contentProvider property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContentProvider() {
        return contentProvider;
    }

    /**
     * Sets the value of the contentProvider property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContentProvider(String value) {
        this.contentProvider = value;
    }

    /**
     * Gets the value of the originalNetwork property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOriginalNetwork() {
        return originalNetwork;
    }

    /**
     * Sets the value of the originalNetwork property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOriginalNetwork(String value) {
        this.originalNetwork = value;
    }

    /**
     * Gets the value of the transportStream property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTransportStream() {
        return transportStream;
    }

    /**
     * Sets the value of the transportStream property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTransportStream(String value) {
        this.transportStream = value;
    }

    /**
     * Gets the value of the seriesId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSeriesId() {
        return seriesId;
    }

    /**
     * Sets the value of the seriesId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSeriesId(String value) {
        this.seriesId = value;
    }

    /**
     * Gets the value of the programId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProgramId() {
        return programId;
    }

    /**
     * Sets the value of the programId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProgramId(String value) {
        this.programId = value;
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
     * Gets the value of the fechaFin property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaFin() {
        return fechaFin;
    }

    /**
     * Sets the value of the fechaFin property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaFin(String value) {
        this.fechaFin = value;
    }

    /**
     * Gets the value of the tipoGrabacion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoGrabacion() {
        return tipoGrabacion;
    }

    /**
     * Sets the value of the tipoGrabacion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoGrabacion(String value) {
        this.tipoGrabacion = value;
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
     * Gets the value of the tipoContenido property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoContenido() {
        return tipoContenido;
    }

    /**
     * Sets the value of the tipoContenido property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoContenido(String value) {
        this.tipoContenido = value;
    }

    /**
     * Gets the value of the recurrencia property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRecurrencia() {
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
    public void setRecurrencia(String value) {
        this.recurrencia = value;
    }

    /**
     * Gets the value of the sistemaOrigen property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSistemaOrigen() {
        return sistemaOrigen;
    }

    /**
     * Sets the value of the sistemaOrigen property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSistemaOrigen(String value) {
        this.sistemaOrigen = value;
    }

    /**
     * Gets the value of the recordatorio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRecordatorio() {
        return recordatorio;
    }

    /**
     * Sets the value of the recordatorio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRecordatorio(String value) {
        this.recordatorio = value;
    }

    /**
     * Gets the value of the sessionID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the userName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUserName(String value) {
        this.userName = value;
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
     * Gets the value of the pais property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPais() {
        return pais;
    }

    /**
     * Sets the value of the pais property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPais(String value) {
        this.pais = value;
    }

}
