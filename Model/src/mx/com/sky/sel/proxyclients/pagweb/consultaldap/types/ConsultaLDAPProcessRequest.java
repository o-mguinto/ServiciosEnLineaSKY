
package mx.com.sky.sel.proxyclients.pagweb.consultaldap.types;

import java.util.ArrayList;
import java.util.List;

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
 *         &lt;element name="OperacionLDAP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ctaSky" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactoRowID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TarjetaInteligente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apellidoPaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apellidoMaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="titular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelCasaLada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelCasa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelTrabLada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelTrab" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelTrabExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelMovilLada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelMovil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paqueteSky" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusSky" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusBTG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusOTT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusSEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aclBTG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aclOTT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aclSEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Atributos" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Atributo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ValorAtributo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="buscaCuentaParam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buscaCuentaValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreCorp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
         { "operacionLDAP", "ctaSky", "contactoRowID", "tarjetaInteligente", "nombre", "apellidoPaterno",
           "apellidoMaterno", "email", "titular", "telCasaLada", "telCasa", "telTrabLada", "telTrab", "telTrabExt",
           "telMovilLada", "telMovil", "descripcion", "username", "password", "paqueteSky", "statusSky", "statusBTG",
           "statusOTT", "statusSEL", "aclBTG", "aclOTT", "aclSEL", "uid", "atributos", "buscaCuentaParam",
           "buscaCuentaValue", "tipoCuenta", "nombreCorp"
    })
@XmlRootElement(name = "ConsultaLDAPProcessRequest")
public class ConsultaLDAPProcessRequest {

    @XmlElement(name = "OperacionLDAP", required = true)
    protected String operacionLDAP;
    protected String ctaSky;
    protected String contactoRowID;
    @XmlElement(name = "TarjetaInteligente")
    protected String tarjetaInteligente;
    protected String nombre;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
    protected String email;
    protected String titular;
    @XmlElement(name = "TelCasaLada")
    protected String telCasaLada;
    @XmlElement(name = "TelCasa")
    protected String telCasa;
    @XmlElement(name = "TelTrabLada")
    protected String telTrabLada;
    @XmlElement(name = "TelTrab")
    protected String telTrab;
    @XmlElement(name = "TelTrabExt")
    protected String telTrabExt;
    @XmlElement(name = "TelMovilLada")
    protected String telMovilLada;
    @XmlElement(name = "TelMovil")
    protected String telMovil;
    @XmlElement(required = true)
    protected String descripcion;
    protected String username;
    protected String password;
    protected String paqueteSky;
    protected String statusSky;
    protected String statusBTG;
    protected String statusOTT;
    protected String statusSEL;
    protected String aclBTG;
    protected String aclOTT;
    protected String aclSEL;
    @XmlElement(name = "UID")
    protected String uid;
    @XmlElement(name = "Atributos", nillable = true)
    protected List<ConsultaLDAPProcessRequest.Atributos> atributos;
    protected String buscaCuentaParam;
    protected String buscaCuentaValue;
    protected String tipoCuenta;
    protected String nombreCorp;

    /**
     * Gets the value of the operacionLDAP property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOperacionLDAP() {
        return operacionLDAP;
    }

    /**
     * Sets the value of the operacionLDAP property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOperacionLDAP(String value) {
        this.operacionLDAP = value;
    }

    /**
     * Gets the value of the ctaSky property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCtaSky() {
        return ctaSky;
    }

    /**
     * Sets the value of the ctaSky property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCtaSky(String value) {
        this.ctaSky = value;
    }

    /**
     * Gets the value of the contactoRowID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContactoRowID() {
        return contactoRowID;
    }

    /**
     * Sets the value of the contactoRowID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContactoRowID(String value) {
        this.contactoRowID = value;
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
     * Gets the value of the titular property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTitular() {
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
    public void setTitular(String value) {
        this.titular = value;
    }

    /**
     * Gets the value of the telCasaLada property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTelCasaLada() {
        return telCasaLada;
    }

    /**
     * Sets the value of the telCasaLada property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTelCasaLada(String value) {
        this.telCasaLada = value;
    }

    /**
     * Gets the value of the telCasa property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTelCasa() {
        return telCasa;
    }

    /**
     * Sets the value of the telCasa property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTelCasa(String value) {
        this.telCasa = value;
    }

    /**
     * Gets the value of the telTrabLada property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTelTrabLada() {
        return telTrabLada;
    }

    /**
     * Sets the value of the telTrabLada property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTelTrabLada(String value) {
        this.telTrabLada = value;
    }

    /**
     * Gets the value of the telTrab property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTelTrab() {
        return telTrab;
    }

    /**
     * Sets the value of the telTrab property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTelTrab(String value) {
        this.telTrab = value;
    }

    /**
     * Gets the value of the telTrabExt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTelTrabExt() {
        return telTrabExt;
    }

    /**
     * Sets the value of the telTrabExt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTelTrabExt(String value) {
        this.telTrabExt = value;
    }

    /**
     * Gets the value of the telMovilLada property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTelMovilLada() {
        return telMovilLada;
    }

    /**
     * Sets the value of the telMovilLada property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTelMovilLada(String value) {
        this.telMovilLada = value;
    }

    /**
     * Gets the value of the telMovil property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTelMovil() {
        return telMovil;
    }

    /**
     * Sets the value of the telMovil property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTelMovil(String value) {
        this.telMovil = value;
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
     * Gets the value of the username property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUsername() {
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
    public void setUsername(String value) {
        this.username = value;
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
     * Gets the value of the paqueteSky property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaqueteSky() {
        return paqueteSky;
    }

    /**
     * Sets the value of the paqueteSky property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaqueteSky(String value) {
        this.paqueteSky = value;
    }

    /**
     * Gets the value of the statusSky property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatusSky() {
        return statusSky;
    }

    /**
     * Sets the value of the statusSky property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatusSky(String value) {
        this.statusSky = value;
    }

    /**
     * Gets the value of the statusBTG property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatusBTG() {
        return statusBTG;
    }

    /**
     * Sets the value of the statusBTG property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatusBTG(String value) {
        this.statusBTG = value;
    }

    /**
     * Gets the value of the statusOTT property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatusOTT() {
        return statusOTT;
    }

    /**
     * Sets the value of the statusOTT property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatusOTT(String value) {
        this.statusOTT = value;
    }

    /**
     * Gets the value of the statusSEL property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatusSEL() {
        return statusSEL;
    }

    /**
     * Sets the value of the statusSEL property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatusSEL(String value) {
        this.statusSEL = value;
    }

    /**
     * Gets the value of the aclBTG property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAclBTG() {
        return aclBTG;
    }

    /**
     * Sets the value of the aclBTG property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAclBTG(String value) {
        this.aclBTG = value;
    }

    /**
     * Gets the value of the aclOTT property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAclOTT() {
        return aclOTT;
    }

    /**
     * Sets the value of the aclOTT property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAclOTT(String value) {
        this.aclOTT = value;
    }

    /**
     * Gets the value of the aclSEL property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAclSEL() {
        return aclSEL;
    }

    /**
     * Sets the value of the aclSEL property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAclSEL(String value) {
        this.aclSEL = value;
    }

    /**
     * Gets the value of the uid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUID() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUID(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the atributos property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atributos property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAtributos().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultaLDAPProcessRequest.Atributos }
     *
     *
     */
    public List<ConsultaLDAPProcessRequest.Atributos> getAtributos() {
        if (atributos == null) {
            atributos = new ArrayList<ConsultaLDAPProcessRequest.Atributos>();
        }
        return this.atributos;
    }

    /**
     * Gets the value of the buscaCuentaParam property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBuscaCuentaParam() {
        return buscaCuentaParam;
    }

    /**
     * Sets the value of the buscaCuentaParam property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBuscaCuentaParam(String value) {
        this.buscaCuentaParam = value;
    }

    /**
     * Gets the value of the buscaCuentaValue property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBuscaCuentaValue() {
        return buscaCuentaValue;
    }

    /**
     * Sets the value of the buscaCuentaValue property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBuscaCuentaValue(String value) {
        this.buscaCuentaValue = value;
    }

    /**
     * Gets the value of the tipoCuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    /**
     * Sets the value of the tipoCuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoCuenta(String value) {
        this.tipoCuenta = value;
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
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Atributo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ValorAtributo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "atributo", "valorAtributo" })
    public static class Atributos {

        @XmlElement(name = "Atributo")
        protected String atributo;
        @XmlElement(name = "ValorAtributo")
        protected String valorAtributo;

        /**
         * Gets the value of the atributo property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getAtributo() {
            return atributo;
        }

        /**
         * Sets the value of the atributo property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setAtributo(String value) {
            this.atributo = value;
        }

        /**
         * Gets the value of the valorAtributo property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getValorAtributo() {
            return valorAtributo;
        }

        /**
         * Sets the value of the valorAtributo property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setValorAtributo(String value) {
            this.valorAtributo = value;
        }

    }

}
