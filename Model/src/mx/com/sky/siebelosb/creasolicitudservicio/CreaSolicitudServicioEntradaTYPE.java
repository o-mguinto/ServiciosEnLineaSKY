
package mx.com.sky.siebelosb.creasolicitudservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreaSolicitudServicio_Entrada_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CreaSolicitudServicio_Entrada_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CABECERA" type="{http://www.sky.com.mx/SiebelOSB/CreaSolicitudServicio}Cabecera_Entrada_TYPE"/&gt;
 *         &lt;element name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Origen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SRNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Grupo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Subtipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IMEI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ICCID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Estatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Subestatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Bucket" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DateOFSC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TimeSlotOFSC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TimeFromOFSC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TimeToOFSC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TimeSlotNameOFSC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WorkSkillOFSC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CodOpeOFSC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Red" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TipoActividadOFSC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreaSolicitudServicio_Entrada_TYPE",
         propOrder =
         { "cabecera", "cuenta", "origen", "srNumber", "grupo", "tipo", "subtipo", "trackingNumber", "imei", "iccid",
           "estatus", "subestatus", "descripcion", "bucket", "dateOFSC", "timeSlotOFSC", "timeFromOFSC", "timeToOFSC",
           "timeSlotNameOFSC", "workSkillOFSC", "codOpeOFSC", "red", "tipoActividadOFSC"
    })
public class CreaSolicitudServicioEntradaTYPE {

    @XmlElement(name = "CABECERA", required = true)
    protected CabeceraEntradaTYPE cabecera;
    @XmlElement(name = "Cuenta", required = true)
    protected String cuenta;
    @XmlElement(name = "Origen", required = true)
    protected String origen;
    @XmlElement(name = "SRNumber", required = true)
    protected String srNumber;
    @XmlElement(name = "Grupo", required = true)
    protected String grupo;
    @XmlElement(name = "Tipo", required = true)
    protected String tipo;
    @XmlElement(name = "Subtipo", required = true)
    protected String subtipo;
    @XmlElement(name = "TrackingNumber", required = true)
    protected String trackingNumber;
    @XmlElement(name = "IMEI", required = true)
    protected String imei;
    @XmlElement(name = "ICCID", required = true)
    protected String iccid;
    @XmlElement(name = "Estatus", required = true)
    protected String estatus;
    @XmlElement(name = "Subestatus", required = true)
    protected String subestatus;
    @XmlElement(name = "Descripcion", required = true)
    protected String descripcion;
    @XmlElement(name = "Bucket", required = true)
    protected String bucket;
    @XmlElement(name = "DateOFSC", required = true)
    protected String dateOFSC;
    @XmlElement(name = "TimeSlotOFSC", required = true)
    protected String timeSlotOFSC;
    @XmlElement(name = "TimeFromOFSC", required = true)
    protected String timeFromOFSC;
    @XmlElement(name = "TimeToOFSC", required = true)
    protected String timeToOFSC;
    @XmlElement(name = "TimeSlotNameOFSC", required = true)
    protected String timeSlotNameOFSC;
    @XmlElement(name = "WorkSkillOFSC", required = true)
    protected String workSkillOFSC;
    @XmlElement(name = "CodOpeOFSC", required = true)
    protected String codOpeOFSC;
    @XmlElement(name = "Red", required = true)
    protected String red;
    @XmlElement(name = "TipoActividadOFSC", required = true)
    protected String tipoActividadOFSC;

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
     * Gets the value of the srNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSRNumber() {
        return srNumber;
    }

    /**
     * Sets the value of the srNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSRNumber(String value) {
        this.srNumber = value;
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
     * Gets the value of the subtipo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubtipo() {
        return subtipo;
    }

    /**
     * Sets the value of the subtipo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubtipo(String value) {
        this.subtipo = value;
    }

    /**
     * Gets the value of the trackingNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Sets the value of the trackingNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

    /**
     * Gets the value of the imei property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIMEI() {
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
    public void setIMEI(String value) {
        this.imei = value;
    }

    /**
     * Gets the value of the iccid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getICCID() {
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
    public void setICCID(String value) {
        this.iccid = value;
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
     * Gets the value of the subestatus property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubestatus() {
        return subestatus;
    }

    /**
     * Sets the value of the subestatus property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubestatus(String value) {
        this.subestatus = value;
    }

    /**
     * Gets the value of the descripcion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescripcion() {
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
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the bucket property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * Sets the value of the bucket property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBucket(String value) {
        this.bucket = value;
    }

    /**
     * Gets the value of the dateOFSC property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDateOFSC() {
        return dateOFSC;
    }

    /**
     * Sets the value of the dateOFSC property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDateOFSC(String value) {
        this.dateOFSC = value;
    }

    /**
     * Gets the value of the timeSlotOFSC property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTimeSlotOFSC() {
        return timeSlotOFSC;
    }

    /**
     * Sets the value of the timeSlotOFSC property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTimeSlotOFSC(String value) {
        this.timeSlotOFSC = value;
    }

    /**
     * Gets the value of the timeFromOFSC property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTimeFromOFSC() {
        return timeFromOFSC;
    }

    /**
     * Sets the value of the timeFromOFSC property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTimeFromOFSC(String value) {
        this.timeFromOFSC = value;
    }

    /**
     * Gets the value of the timeToOFSC property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTimeToOFSC() {
        return timeToOFSC;
    }

    /**
     * Sets the value of the timeToOFSC property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTimeToOFSC(String value) {
        this.timeToOFSC = value;
    }

    /**
     * Gets the value of the timeSlotNameOFSC property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTimeSlotNameOFSC() {
        return timeSlotNameOFSC;
    }

    /**
     * Sets the value of the timeSlotNameOFSC property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTimeSlotNameOFSC(String value) {
        this.timeSlotNameOFSC = value;
    }

    /**
     * Gets the value of the workSkillOFSC property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getWorkSkillOFSC() {
        return workSkillOFSC;
    }

    /**
     * Sets the value of the workSkillOFSC property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setWorkSkillOFSC(String value) {
        this.workSkillOFSC = value;
    }

    /**
     * Gets the value of the codOpeOFSC property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodOpeOFSC() {
        return codOpeOFSC;
    }

    /**
     * Sets the value of the codOpeOFSC property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodOpeOFSC(String value) {
        this.codOpeOFSC = value;
    }

    /**
     * Gets the value of the red property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRed() {
        return red;
    }

    /**
     * Sets the value of the red property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRed(String value) {
        this.red = value;
    }

    /**
     * Gets the value of the tipoActividadOFSC property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoActividadOFSC() {
        return tipoActividadOFSC;
    }

    /**
     * Sets the value of the tipoActividadOFSC property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoActividadOFSC(String value) {
        this.tipoActividadOFSC = value;
    }

}
