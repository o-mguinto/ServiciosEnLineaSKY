
package mx.com.sky.sel.proxyclients.pagweb.execpromesapago.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="CuentaSKY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PromesaDePago" type="{http://xmlns.oracle.com/ExecPromesaDePago}PromesaDePago"/&gt;
 *         &lt;element name="sistema" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CuentaRowID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RowID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="intentos" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pasoBpel" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="estadoPromPago" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="permitePromPago" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechaRegistroPromPago" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="noSolicitud" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idSesion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TipoCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
         { "cuentaSKY", "userID", "promesaDePago", "sistema", "cuentaRowID", "ti", "rowID", "intentos", "pasoBpel",
           "estadoPromPago", "permitePromPago", "fechaRegistroPromPago", "noSolicitud", "idSesion", "tipoCuenta"
    })
@XmlRootElement(name = "ExecPromesaDePagoProcessRequest")
public class ExecPromesaDePagoProcessRequest {

    @XmlElement(name = "CuentaSKY", required = true)
    protected String cuentaSKY;
    @XmlElement(name = "UserID", required = true)
    protected String userID;
    @XmlElement(name = "PromesaDePago", required = true)
    protected PromesaDePago promesaDePago;
    @XmlElement(required = true, nillable = true)
    protected String sistema;
    @XmlElement(name = "CuentaRowID", required = true, nillable = true)
    protected String cuentaRowID;
    @XmlElement(name = "TI", required = true, nillable = true)
    protected String ti;
    @XmlElement(name = "RowID", required = true)
    protected String rowID;
    protected int intentos;
    protected int pasoBpel;
    @XmlElement(required = true)
    protected String estadoPromPago;
    @XmlElement(required = true)
    protected String permitePromPago;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaRegistroPromPago;
    @XmlElement(required = true)
    protected String noSolicitud;
    @XmlElement(required = true)
    protected String idSesion;
    @XmlElement(name = "TipoCuenta", required = true)
    protected String tipoCuenta;

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
     * Gets the value of the userID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the promesaDePago property.
     *
     * @return
     *     possible object is
     *     {@link PromesaDePago }
     *
     */
    public PromesaDePago getPromesaDePago() {
        return promesaDePago;
    }

    /**
     * Sets the value of the promesaDePago property.
     *
     * @param value
     *     allowed object is
     *     {@link PromesaDePago }
     *
     */
    public void setPromesaDePago(PromesaDePago value) {
        this.promesaDePago = value;
    }

    /**
     * Gets the value of the sistema property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSistema() {
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
    public void setSistema(String value) {
        this.sistema = value;
    }

    /**
     * Gets the value of the cuentaRowID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCuentaRowID() {
        return cuentaRowID;
    }

    /**
     * Sets the value of the cuentaRowID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCuentaRowID(String value) {
        this.cuentaRowID = value;
    }

    /**
     * Gets the value of the ti property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTI() {
        return ti;
    }

    /**
     * Sets the value of the ti property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTI(String value) {
        this.ti = value;
    }

    /**
     * Gets the value of the rowID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRowID() {
        return rowID;
    }

    /**
     * Sets the value of the rowID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRowID(String value) {
        this.rowID = value;
    }

    /**
     * Gets the value of the intentos property.
     *
     */
    public int getIntentos() {
        return intentos;
    }

    /**
     * Sets the value of the intentos property.
     *
     */
    public void setIntentos(int value) {
        this.intentos = value;
    }

    /**
     * Gets the value of the pasoBpel property.
     *
     */
    public int getPasoBpel() {
        return pasoBpel;
    }

    /**
     * Sets the value of the pasoBpel property.
     *
     */
    public void setPasoBpel(int value) {
        this.pasoBpel = value;
    }

    /**
     * Gets the value of the estadoPromPago property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEstadoPromPago() {
        return estadoPromPago;
    }

    /**
     * Sets the value of the estadoPromPago property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEstadoPromPago(String value) {
        this.estadoPromPago = value;
    }

    /**
     * Gets the value of the permitePromPago property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPermitePromPago() {
        return permitePromPago;
    }

    /**
     * Sets the value of the permitePromPago property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPermitePromPago(String value) {
        this.permitePromPago = value;
    }

    /**
     * Gets the value of the fechaRegistroPromPago property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaRegistroPromPago() {
        return fechaRegistroPromPago;
    }

    /**
     * Sets the value of the fechaRegistroPromPago property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFechaRegistroPromPago(XMLGregorianCalendar value) {
        this.fechaRegistroPromPago = value;
    }

    /**
     * Gets the value of the noSolicitud property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNoSolicitud() {
        return noSolicitud;
    }

    /**
     * Sets the value of the noSolicitud property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNoSolicitud(String value) {
        this.noSolicitud = value;
    }

    /**
     * Gets the value of the idSesion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdSesion() {
        return idSesion;
    }

    /**
     * Sets the value of the idSesion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdSesion(String value) {
        this.idSesion = value;
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

}
