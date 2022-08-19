
package mx.com.sky.sel.proxyclients.btgew.activacion.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for btgewActivacionInType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="btgewActivacionInType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CuentaSKY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PaqueteSKY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OTT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VEO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pasoBpel" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="intento" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numeroSs" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idSesion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enviaASiebel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="nombre_producto_siebel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha_fin_temporada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="origen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "btgewActivacionInType",
         propOrder =
         { "cuentaSKY", "paqueteSKY", "ott", "veo", "pasoBpel", "intento", "numeroSs", "idSesion", "producto",
           "enviaASiebel", "nombreProductoSiebel", "fechaFinTemporada", "origen"
    })
public class BtgewActivacionInType {

    @XmlElement(name = "CuentaSKY", required = true)
    protected String cuentaSKY;
    @XmlElement(name = "PaqueteSKY", required = true)
    protected String paqueteSKY;
    @XmlElement(name = "OTT", required = true)
    protected String ott;
    @XmlElement(name = "VEO", required = true)
    protected String veo;
    protected int pasoBpel;
    protected int intento;
    @XmlElement(required = true)
    protected String numeroSs;
    @XmlElement(required = true)
    protected String idSesion;
    protected String producto;
    @XmlElement(defaultValue = "true")
    protected Boolean enviaASiebel;
    @XmlElement(name = "nombre_producto_siebel")
    protected String nombreProductoSiebel;
    @XmlElement(name = "fecha_fin_temporada")
    protected String fechaFinTemporada;
    protected String origen;

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
     * Gets the value of the paqueteSKY property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaqueteSKY() {
        return paqueteSKY;
    }

    /**
     * Sets the value of the paqueteSKY property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaqueteSKY(String value) {
        this.paqueteSKY = value;
    }

    /**
     * Gets the value of the ott property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOTT() {
        return ott;
    }

    /**
     * Sets the value of the ott property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOTT(String value) {
        this.ott = value;
    }

    /**
     * Gets the value of the veo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVEO() {
        return veo;
    }

    /**
     * Sets the value of the veo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVEO(String value) {
        this.veo = value;
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
     * Gets the value of the intento property.
     *
     */
    public int getIntento() {
        return intento;
    }

    /**
     * Sets the value of the intento property.
     *
     */
    public void setIntento(int value) {
        this.intento = value;
    }

    /**
     * Gets the value of the numeroSs property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroSs() {
        return numeroSs;
    }

    /**
     * Sets the value of the numeroSs property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroSs(String value) {
        this.numeroSs = value;
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
     * Gets the value of the producto property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProducto() {
        return producto;
    }

    /**
     * Sets the value of the producto property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProducto(String value) {
        this.producto = value;
    }

    /**
     * Gets the value of the enviaASiebel property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isEnviaASiebel() {
        return enviaASiebel;
    }

    /**
     * Sets the value of the enviaASiebel property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setEnviaASiebel(Boolean value) {
        this.enviaASiebel = value;
    }

    /**
     * Gets the value of the nombreProductoSiebel property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombreProductoSiebel() {
        return nombreProductoSiebel;
    }

    /**
     * Sets the value of the nombreProductoSiebel property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombreProductoSiebel(String value) {
        this.nombreProductoSiebel = value;
    }

    /**
     * Gets the value of the fechaFinTemporada property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaFinTemporada() {
        return fechaFinTemporada;
    }

    /**
     * Sets the value of the fechaFinTemporada property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaFinTemporada(String value) {
        this.fechaFinTemporada = value;
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

}
