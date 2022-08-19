
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
 *         &lt;element name="ctaSky" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apellidoPaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apellidoMaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="hijas" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="USERID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="USERNAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="APATERNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="AMATERNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="TELCASALADA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="TELCASA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="TELTRABLADA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="TELTRAB" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="TELTRABEXT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="TELMOVIL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="TELMOVILLADA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="respuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="respuestaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buscaCuentaParam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buscaCuentaValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
         { "ctaSky", "nombre", "apellidoPaterno", "apellidoMaterno", "username", "password", "paqueteSky", "statusSky",
           "statusBTG", "statusOTT", "statusSEL", "aclBTG", "aclOTT", "aclSEL", "uid", "atributos", "hijas",
           "respuesta", "respuestaCode", "buscaCuentaParam", "buscaCuentaValue"
    })
@XmlRootElement(name = "ConsultaLDAPProcessResponse")
public class ConsultaLDAPProcessResponse {

    protected String ctaSky;
    protected String nombre;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
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
    protected List<ConsultaLDAPProcessResponse.Atributos> atributos;
    @XmlElement(required = true)
    protected List<ConsultaLDAPProcessResponse.Hijas> hijas;
    protected String respuesta;
    protected String respuestaCode;
    protected String buscaCuentaParam;
    protected String buscaCuentaValue;

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
     * {@link ConsultaLDAPProcessResponse.Atributos }
     *
     *
     */
    public List<ConsultaLDAPProcessResponse.Atributos> getAtributos() {
        if (atributos == null) {
            atributos = new ArrayList<ConsultaLDAPProcessResponse.Atributos>();
        }
        return this.atributos;
    }

    /**
     * Gets the value of the hijas property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hijas property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHijas().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultaLDAPProcessResponse.Hijas }
     *
     *
     */
    public List<ConsultaLDAPProcessResponse.Hijas> getHijas() {
        if (hijas == null) {
            hijas = new ArrayList<ConsultaLDAPProcessResponse.Hijas>();
        }
        return this.hijas;
    }

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
     * Gets the value of the respuestaCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRespuestaCode() {
        return respuestaCode;
    }

    /**
     * Sets the value of the respuestaCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRespuestaCode(String value) {
        this.respuestaCode = value;
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
     *         &lt;element name="USERID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="USERNAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="APATERNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="AMATERNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="TELCASALADA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="TELCASA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="TELTRABLADA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="TELTRAB" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="TELTRABEXT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="TELMOVIL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="TELMOVILLADA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
             { "userid", "username", "nombre", "apaterno", "amaterno", "email", "telcasalada", "telcasa", "teltrablada",
               "teltrab", "teltrabext", "telmovil", "telmovillada"
        })
    public static class Hijas {

        @XmlElement(name = "USERID", required = true, nillable = true)
        protected String userid;
        @XmlElement(name = "USERNAME", required = true, nillable = true)
        protected String username;
        @XmlElement(name = "NOMBRE", required = true, nillable = true)
        protected String nombre;
        @XmlElement(name = "APATERNO", required = true, nillable = true)
        protected String apaterno;
        @XmlElement(name = "AMATERNO", required = true, nillable = true)
        protected String amaterno;
        @XmlElement(name = "EMAIL", required = true, nillable = true)
        protected String email;
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
        @XmlElement(name = "TELMOVIL", required = true, nillable = true)
        protected String telmovil;
        @XmlElement(name = "TELMOVILLADA")
        protected String telmovillada;

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

    }

}
