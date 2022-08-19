
package mx.com.sky.sel.proxyclients.pagweb.dwhcuentamigrada.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datosCuenta complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="datosCuenta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDBPEL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="USERNAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CUENTASKY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FECHAPETICION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OPERACION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DESCRIPCION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PCMOVIL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosCuenta",
         propOrder =
         { "idbpel", "username", "email", "cuentasky", "fechapeticion", "operacion", "descripcion", "pcmovil"
    })
public class DatosCuenta {

    @XmlElement(name = "IDBPEL", required = true)
    protected String idbpel;
    @XmlElement(name = "USERNAME", required = true)
    protected String username;
    @XmlElement(name = "EMAIL", required = true)
    protected String email;
    @XmlElement(name = "CUENTASKY", required = true)
    protected String cuentasky;
    @XmlElement(name = "FECHAPETICION", required = true)
    protected String fechapeticion;
    @XmlElement(name = "OPERACION", required = true)
    protected String operacion;
    @XmlElement(name = "DESCRIPCION", required = true)
    protected String descripcion;
    @XmlElement(name = "PCMOVIL", required = true)
    protected String pcmovil;

    /**
     * Gets the value of the idbpel property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIDBPEL() {
        return idbpel;
    }

    /**
     * Sets the value of the idbpel property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIDBPEL(String value) {
        this.idbpel = value;
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

}
