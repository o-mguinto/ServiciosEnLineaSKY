
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultausers.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="respuesta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="respuestadesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="USERID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="USERNAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NOMBRE_COMPLETO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CTASKY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TIPO_CUENTA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PERMISOS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NombreCorp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PRIMER_SESION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",
         propOrder =
         { "respuesta", "respuestadesc", "userid", "username", "nombrecompleto", "email", "ctasky", "tipocuenta",
           "permisos", "nombreCorp", "primersesion"
    })
@XmlRootElement(name = "ConsultaUsersProcessResponse")
public class ConsultaUsersProcessResponse {

    @XmlElement(required = true)
    protected String respuesta;
    @XmlElement(required = true)
    protected String respuestadesc;
    @XmlElement(name = "USERID", required = true, nillable = true)
    protected String userid;
    @XmlElement(name = "USERNAME", required = true, nillable = true)
    protected String username;
    @XmlElement(name = "NOMBRE_COMPLETO", required = true, nillable = true)
    protected String nombrecompleto;
    @XmlElement(name = "EMAIL", required = true, nillable = true)
    protected String email;
    @XmlElement(name = "CTASKY", required = true, nillable = true)
    protected String ctasky;
    @XmlElement(name = "TIPO_CUENTA", required = true, nillable = true)
    protected String tipocuenta;
    @XmlElement(name = "PERMISOS", required = true, nillable = true)
    protected String permisos;
    @XmlElement(name = "NombreCorp", required = true)
    protected String nombreCorp;
    @XmlElement(name = "PRIMER_SESION", required = true)
    protected String primersesion;

    /**
     * Gets the value of the respuesta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRespuesta() {
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
    public void setRespuesta(String value) {
        this.respuesta = value;
    }

    /**
     * Gets the value of the respuestadesc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRespuestadesc() {
        return respuestadesc;
    }

    /**
     * Sets the value of the respuestadesc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRespuestadesc(String value) {
        this.respuestadesc = value;
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
     * Gets the value of the nombrecompleto property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNOMBRECOMPLETO() {
        return nombrecompleto;
    }

    /**
     * Sets the value of the nombrecompleto property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNOMBRECOMPLETO(String value) {
        this.nombrecompleto = value;
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
     * Gets the value of the tipocuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTIPOCUENTA() {
        return tipocuenta;
    }

    /**
     * Sets the value of the tipocuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTIPOCUENTA(String value) {
        this.tipocuenta = value;
    }

    /**
     * Gets the value of the permisos property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPERMISOS() {
        return permisos;
    }

    /**
     * Sets the value of the permisos property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPERMISOS(String value) {
        this.permisos = value;
    }

    /**
     * Gets the value of the nombreCorp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombreCorp() {
        return nombreCorp;
    }

    /**
     * Sets the value of the nombreCorp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombreCorp(String value) {
        this.nombreCorp = value;
    }

    /**
     * Gets the value of the primersesion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPRIMERSESION() {
        return primersesion;
    }

    /**
     * Sets the value of the primersesion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPRIMERSESION(String value) {
        this.primersesion = value;
    }

}
