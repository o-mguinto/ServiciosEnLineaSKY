
package mx.com.sky.sel.proxyclients.pagweb.pwbamoperaciones.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operacionTypeIN complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="operacionTypeIN"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IDSESION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="USERID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="USERNAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CUENTASKY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ESTATUSCUENTA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PAQUETE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OPERACION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FECHAPETICION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ORGANIZATIONTYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MARKETTYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PAIS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TIPOCUENTA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DESCRIPCION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PCMOVIL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "operacionTypeIN",
         propOrder =
         { "id", "idsesion", "userid", "username", "email", "cuentasky", "estatuscuenta", "paquete", "operacion",
           "fechapeticion", "organizationtype", "markettype", "pais", "tipocuenta", "descripcion", "pcmovil", "sistema"
    })
public class OperacionTypeIN {

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "IDSESION", required = true)
    protected String idsesion;
    @XmlElement(name = "USERID", required = true)
    protected String userid;
    @XmlElement(name = "USERNAME", required = true)
    protected String username;
    @XmlElement(name = "EMAIL", required = true)
    protected String email;
    @XmlElement(name = "CUENTASKY", required = true)
    protected String cuentasky;
    @XmlElement(name = "ESTATUSCUENTA", required = true)
    protected String estatuscuenta;
    @XmlElement(name = "PAQUETE", required = true)
    protected String paquete;
    @XmlElement(name = "OPERACION", required = true)
    protected String operacion;
    @XmlElement(name = "FECHAPETICION", required = true)
    protected String fechapeticion;
    @XmlElement(name = "ORGANIZATIONTYPE", required = true)
    protected String organizationtype;
    @XmlElement(name = "MARKETTYPE", required = true)
    protected String markettype;
    @XmlElement(name = "PAIS", required = true)
    protected String pais;
    @XmlElement(name = "TIPOCUENTA", required = true)
    protected String tipocuenta;
    @XmlElement(name = "DESCRIPCION", required = true)
    protected String descripcion;
    @XmlElement(name = "PCMOVIL", required = true)
    protected String pcmovil;
    @XmlElement(name = "SISTEMA", required = true)
    protected String sistema;

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the idsesion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIDSESION() {
        return idsesion;
    }

    /**
     * Sets the value of the idsesion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIDSESION(String value) {
        this.idsesion = value;
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
     * Gets the value of the cuentasky property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCUENTASKY() {
        return cuentasky;
    }

    /**
     * Sets the value of the cuentasky property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCUENTASKY(String value) {
        this.cuentasky = value;
    }

    /**
     * Gets the value of the estatuscuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getESTATUSCUENTA() {
        return estatuscuenta;
    }

    /**
     * Sets the value of the estatuscuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setESTATUSCUENTA(String value) {
        this.estatuscuenta = value;
    }

    /**
     * Gets the value of the paquete property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPAQUETE() {
        return paquete;
    }

    /**
     * Sets the value of the paquete property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPAQUETE(String value) {
        this.paquete = value;
    }

    /**
     * Gets the value of the operacion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOPERACION() {
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
    public void setOPERACION(String value) {
        this.operacion = value;
    }

    /**
     * Gets the value of the fechapeticion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFECHAPETICION() {
        return fechapeticion;
    }

    /**
     * Sets the value of the fechapeticion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFECHAPETICION(String value) {
        this.fechapeticion = value;
    }

    /**
     * Gets the value of the organizationtype property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getORGANIZATIONTYPE() {
        return organizationtype;
    }

    /**
     * Sets the value of the organizationtype property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setORGANIZATIONTYPE(String value) {
        this.organizationtype = value;
    }

    /**
     * Gets the value of the markettype property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMARKETTYPE() {
        return markettype;
    }

    /**
     * Sets the value of the markettype property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMARKETTYPE(String value) {
        this.markettype = value;
    }

    /**
     * Gets the value of the pais property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPAIS() {
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
    public void setPAIS(String value) {
        this.pais = value;
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
