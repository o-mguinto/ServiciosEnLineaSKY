
package mx.com.sky.sel.proxyclients.pagweb.preactualizadatosusuario.types;

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
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ApellidoPaterno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ApellidoMaterno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cuentaSKY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tarjetaInteligente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TitularCuentaSKY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TelefonoLada" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TelefonoCasa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TelefonoTrabajoLada" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TelefonoTrabajo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TelefonoTrabajoExt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TelefonoMovilLada" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TelefonoMovil" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Intento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PasoBpel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contactoRowid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="paisISO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
         { "userName", "password", "nombre", "apellidoPaterno", "apellidoMaterno", "email", "cuentaSKY",
           "tarjetaInteligente", "titularCuentaSKY", "telefonoLada", "telefonoCasa", "telefonoTrabajoLada",
           "telefonoTrabajo", "telefonoTrabajoExt", "telefonoMovilLada", "telefonoMovil", "intento", "pasoBpel",
           "contactoRowid", "descripcion", "userId", "paisISO"
    })
@XmlRootElement(name = "PreActualizaDatoRequest")
public class PreActualizaDatoRequest {

    @XmlElement(name = "UserName", required = true)
    protected String userName;
    @XmlElement(name = "Password", required = true)
    protected String password;
    @XmlElement(name = "Nombre", required = true)
    protected String nombre;
    @XmlElement(name = "ApellidoPaterno", required = true)
    protected String apellidoPaterno;
    @XmlElement(name = "ApellidoMaterno", required = true)
    protected String apellidoMaterno;
    @XmlElement(name = "Email", required = true)
    protected String email;
    @XmlElement(required = true)
    protected String cuentaSKY;
    @XmlElement(required = true)
    protected String tarjetaInteligente;
    @XmlElement(name = "TitularCuentaSKY", required = true, nillable = true)
    protected String titularCuentaSKY;
    @XmlElement(name = "TelefonoLada", required = true, nillable = true)
    protected String telefonoLada;
    @XmlElement(name = "TelefonoCasa", required = true, nillable = true)
    protected String telefonoCasa;
    @XmlElement(name = "TelefonoTrabajoLada", required = true, nillable = true)
    protected String telefonoTrabajoLada;
    @XmlElement(name = "TelefonoTrabajo", required = true, nillable = true)
    protected String telefonoTrabajo;
    @XmlElement(name = "TelefonoTrabajoExt", required = true, nillable = true)
    protected String telefonoTrabajoExt;
    @XmlElement(name = "TelefonoMovilLada", required = true, nillable = true)
    protected String telefonoMovilLada;
    @XmlElement(name = "TelefonoMovil", required = true, nillable = true)
    protected String telefonoMovil;
    @XmlElement(name = "Intento", required = true, nillable = true)
    protected String intento;
    @XmlElement(name = "PasoBpel", required = true, nillable = true)
    protected String pasoBpel;
    @XmlElement(required = true, nillable = true)
    protected String contactoRowid;
    @XmlElement(required = true, nillable = true)
    protected String descripcion;
    @XmlElement(required = true, nillable = true)
    protected String userId;
    @XmlElement(required = true)
    protected String paisISO;

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
     * Gets the value of the password property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the nombre property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombre() {
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
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the apellidoPaterno property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * Sets the value of the apellidoPaterno property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setApellidoPaterno(String value) {
        this.apellidoPaterno = value;
    }

    /**
     * Gets the value of the apellidoMaterno property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * Sets the value of the apellidoMaterno property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setApellidoMaterno(String value) {
        this.apellidoMaterno = value;
    }

    /**
     * Gets the value of the email property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmail() {
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
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the cuentaSKY property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCuentaSKY() {
        return cuentaSKY;
    }

    /**
     * Sets the value of the cuentaSKY property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCuentaSKY(String value) {
        this.cuentaSKY = value;
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
     * Gets the value of the titularCuentaSKY property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTitularCuentaSKY() {
        return titularCuentaSKY;
    }

    /**
     * Sets the value of the titularCuentaSKY property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTitularCuentaSKY(String value) {
        this.titularCuentaSKY = value;
    }

    /**
     * Gets the value of the telefonoLada property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTelefonoLada() {
        return telefonoLada;
    }

    /**
     * Sets the value of the telefonoLada property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTelefonoLada(String value) {
        this.telefonoLada = value;
    }

    /**
     * Gets the value of the telefonoCasa property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTelefonoCasa() {
        return telefonoCasa;
    }

    /**
     * Sets the value of the telefonoCasa property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTelefonoCasa(String value) {
        this.telefonoCasa = value;
    }

    /**
     * Gets the value of the telefonoTrabajoLada property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTelefonoTrabajoLada() {
        return telefonoTrabajoLada;
    }

    /**
     * Sets the value of the telefonoTrabajoLada property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTelefonoTrabajoLada(String value) {
        this.telefonoTrabajoLada = value;
    }

    /**
     * Gets the value of the telefonoTrabajo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTelefonoTrabajo() {
        return telefonoTrabajo;
    }

    /**
     * Sets the value of the telefonoTrabajo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTelefonoTrabajo(String value) {
        this.telefonoTrabajo = value;
    }

    /**
     * Gets the value of the telefonoTrabajoExt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTelefonoTrabajoExt() {
        return telefonoTrabajoExt;
    }

    /**
     * Sets the value of the telefonoTrabajoExt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTelefonoTrabajoExt(String value) {
        this.telefonoTrabajoExt = value;
    }

    /**
     * Gets the value of the telefonoMovilLada property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTelefonoMovilLada() {
        return telefonoMovilLada;
    }

    /**
     * Sets the value of the telefonoMovilLada property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTelefonoMovilLada(String value) {
        this.telefonoMovilLada = value;
    }

    /**
     * Gets the value of the telefonoMovil property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    /**
     * Sets the value of the telefonoMovil property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTelefonoMovil(String value) {
        this.telefonoMovil = value;
    }

    /**
     * Gets the value of the intento property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIntento() {
        return intento;
    }

    /**
     * Sets the value of the intento property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIntento(String value) {
        this.intento = value;
    }

    /**
     * Gets the value of the pasoBpel property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPasoBpel() {
        return pasoBpel;
    }

    /**
     * Sets the value of the pasoBpel property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPasoBpel(String value) {
        this.pasoBpel = value;
    }

    /**
     * Gets the value of the contactoRowid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContactoRowid() {
        return contactoRowid;
    }

    /**
     * Sets the value of the contactoRowid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContactoRowid(String value) {
        this.contactoRowid = value;
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
     * Gets the value of the userId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the paisISO property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaisISO() {
        return paisISO;
    }

    /**
     * Sets the value of the paisISO property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaisISO(String value) {
        this.paisISO = value;
    }

}
