
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultaactdatosusuario.types;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Select_ActualizaDatosUsuarioOutput complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Select_ActualizaDatosUsuarioOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CODIGO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ESTADO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PASO_BPEL" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="NUMERO_INTENTO" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="FECHA_REGISTRO" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="FECHA_ACTUALIZACION" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CTASKY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="USERNAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="USER_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CONTACTO_ROWID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DESCRIPCION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="APATERNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AMATERNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TITULAR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TELCASALADA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TELCASA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TELTRABLADA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TELTRAB" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TELTRABEXT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TELMOVILLADA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TELMOVIL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TINTELIGENTE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ERROR_DESC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Select_ActualizaDatosUsuarioOutput",
         propOrder =
         { "codigo", "estado", "pasobpel", "numerointento", "fecharegistro", "fechaactualizacion", "ctasky", "username",
           "userid", "contactorowid", "descripcion", "nombre", "apaterno", "amaterno", "email", "titular",
           "telcasalada", "telcasa", "teltrablada", "teltrab", "teltrabext", "telmovillada", "telmovil", "tinteligente",
           "errordesc"
    })
public class SelectActualizaDatosUsuarioOutput {

    @XmlElement(name = "CODIGO", required = true, nillable = true)
    protected String codigo;
    @XmlElement(name = "ESTADO", required = true, nillable = true)
    protected String estado;
    @XmlElement(name = "PASO_BPEL", required = true, nillable = true)
    protected BigDecimal pasobpel;
    @XmlElement(name = "NUMERO_INTENTO", required = true, nillable = true)
    protected BigDecimal numerointento;
    @XmlElement(name = "FECHA_REGISTRO", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecharegistro;
    @XmlElement(name = "FECHA_ACTUALIZACION", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaactualizacion;
    @XmlElement(name = "CTASKY", required = true, nillable = true)
    protected String ctasky;
    @XmlElement(name = "USERNAME", required = true, nillable = true)
    protected String username;
    @XmlElement(name = "USER_ID", required = true, nillable = true)
    protected String userid;
    @XmlElement(name = "CONTACTO_ROWID", required = true, nillable = true)
    protected String contactorowid;
    @XmlElement(name = "DESCRIPCION", required = true, nillable = true)
    protected String descripcion;
    @XmlElement(name = "NOMBRE", required = true, nillable = true)
    protected String nombre;
    @XmlElement(name = "APATERNO", required = true, nillable = true)
    protected String apaterno;
    @XmlElement(name = "AMATERNO", required = true, nillable = true)
    protected String amaterno;
    @XmlElement(name = "EMAIL", required = true, nillable = true)
    protected String email;
    @XmlElement(name = "TITULAR", required = true, nillable = true)
    protected String titular;
    @XmlElement(name = "TELCASALADA", required = true, nillable = true)
    protected String telcasalada;
    @XmlElement(name = "TELCASA", required = true, nillable = true)
    protected String telcasa;
    @XmlElement(name = "TELTRABLADA", required = true, nillable = true)
    protected String teltrablada;
    @XmlElement(name = "TELTRAB", required = true, nillable = true)
    protected String teltrab;
    @XmlElement(name = "TELTRABEXT", required = true, nillable = true)
    protected String teltrabext;
    @XmlElement(name = "TELMOVILLADA", required = true, nillable = true)
    protected String telmovillada;
    @XmlElement(name = "TELMOVIL", required = true, nillable = true)
    protected String telmovil;
    @XmlElement(name = "TINTELIGENTE", required = true, nillable = true)
    protected String tinteligente;
    @XmlElement(name = "ERROR_DESC", required = true, nillable = true)
    protected String errordesc;

    /**
     * Gets the value of the codigo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCODIGO() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCODIGO(String value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the estado property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getESTADO() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setESTADO(String value) {
        this.estado = value;
    }

    /**
     * Gets the value of the pasobpel property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getPASOBPEL() {
        return pasobpel;
    }

    /**
     * Sets the value of the pasobpel property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setPASOBPEL(BigDecimal value) {
        this.pasobpel = value;
    }

    /**
     * Gets the value of the numerointento property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getNUMEROINTENTO() {
        return numerointento;
    }

    /**
     * Sets the value of the numerointento property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setNUMEROINTENTO(BigDecimal value) {
        this.numerointento = value;
    }

    /**
     * Gets the value of the fecharegistro property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFECHAREGISTRO() {
        return fecharegistro;
    }

    /**
     * Sets the value of the fecharegistro property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFECHAREGISTRO(XMLGregorianCalendar value) {
        this.fecharegistro = value;
    }

    /**
     * Gets the value of the fechaactualizacion property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFECHAACTUALIZACION() {
        return fechaactualizacion;
    }

    /**
     * Sets the value of the fechaactualizacion property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFECHAACTUALIZACION(XMLGregorianCalendar value) {
        this.fechaactualizacion = value;
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
     * Gets the value of the userid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUSERID() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUSERID(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the contactorowid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCONTACTOROWID() {
        return contactorowid;
    }

    /**
     * Sets the value of the contactorowid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCONTACTOROWID(String value) {
        this.contactorowid = value;
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
     * Gets the value of the nombre property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNOMBRE() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNOMBRE(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the apaterno property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAPATERNO() {
        return apaterno;
    }

    /**
     * Sets the value of the apaterno property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAPATERNO(String value) {
        this.apaterno = value;
    }

    /**
     * Gets the value of the amaterno property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAMATERNO() {
        return amaterno;
    }

    /**
     * Sets the value of the amaterno property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAMATERNO(String value) {
        this.amaterno = value;
    }

    /**
     * Gets the value of the email property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEMAIL() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEMAIL(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the titular property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTITULAR() {
        return titular;
    }

    /**
     * Sets the value of the titular property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTITULAR(String value) {
        this.titular = value;
    }

    /**
     * Gets the value of the telcasalada property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTELCASALADA() {
        return telcasalada;
    }

    /**
     * Sets the value of the telcasalada property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTELCASALADA(String value) {
        this.telcasalada = value;
    }

    /**
     * Gets the value of the telcasa property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTELCASA() {
        return telcasa;
    }

    /**
     * Sets the value of the telcasa property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTELCASA(String value) {
        this.telcasa = value;
    }

    /**
     * Gets the value of the teltrablada property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTELTRABLADA() {
        return teltrablada;
    }

    /**
     * Sets the value of the teltrablada property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTELTRABLADA(String value) {
        this.teltrablada = value;
    }

    /**
     * Gets the value of the teltrab property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTELTRAB() {
        return teltrab;
    }

    /**
     * Sets the value of the teltrab property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTELTRAB(String value) {
        this.teltrab = value;
    }

    /**
     * Gets the value of the teltrabext property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTELTRABEXT() {
        return teltrabext;
    }

    /**
     * Sets the value of the teltrabext property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTELTRABEXT(String value) {
        this.teltrabext = value;
    }

    /**
     * Gets the value of the telmovillada property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTELMOVILLADA() {
        return telmovillada;
    }

    /**
     * Sets the value of the telmovillada property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTELMOVILLADA(String value) {
        this.telmovillada = value;
    }

    /**
     * Gets the value of the telmovil property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTELMOVIL() {
        return telmovil;
    }

    /**
     * Sets the value of the telmovil property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTELMOVIL(String value) {
        this.telmovil = value;
    }

    /**
     * Gets the value of the tinteligente property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTINTELIGENTE() {
        return tinteligente;
    }

    /**
     * Sets the value of the tinteligente property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTINTELIGENTE(String value) {
        this.tinteligente = value;
    }

    /**
     * Gets the value of the errordesc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getERRORDESC() {
        return errordesc;
    }

    /**
     * Sets the value of the errordesc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setERRORDESC(String value) {
        this.errordesc = value;
    }

}
