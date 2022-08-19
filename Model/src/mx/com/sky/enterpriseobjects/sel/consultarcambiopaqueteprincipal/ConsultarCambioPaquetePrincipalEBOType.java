
package mx.com.sky.enterpriseobjects.sel.consultarcambiopaqueteprincipal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarCambioPaquetePrincipalEBOType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarCambioPaquetePrincipalEBOType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NombreProductoCRM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreProductoSEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PartNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListProductFacturacion" type="{http://www.sky.com.mx/EnterpriseObjects/Sel/ConsultarCambioPaquetePrincipal}ListProductFacturacion_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarCambioPaquetePrincipalEBOType",
         propOrder =
         { "nombreProductoCRM", "nombreProductoSEL", "partNum", "descripcion", "minutos", "sms", "datos", "vigencia",
           "precio", "listProductFacturacion"
    })
public class ConsultarCambioPaquetePrincipalEBOType {

    @XmlElement(name = "NombreProductoCRM")
    protected String nombreProductoCRM;
    @XmlElement(name = "NombreProductoSEL")
    protected String nombreProductoSEL;
    @XmlElement(name = "PartNum")
    protected String partNum;
    @XmlElement(name = "Descripcion")
    protected String descripcion;
    @XmlElement(name = "ListProductFacturacion")
    protected ListProductFacturacionType listProductFacturacion;
    @XmlElement(name = "Datos")
    protected String datos;
    @XmlElement(name = "Minutos")
    protected String minutos;
    @XmlElement(name = "Precio")
    protected String precio;
    @XmlElement(name = "SMS")
    protected String sms;
    @XmlElement(name = "Vigencia")
    protected String vigencia;

    /**
     * Gets the value of the nombreProductoCRM property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombreProductoCRM() {
        return nombreProductoCRM;
    }

    /**
     * Sets the value of the nombreProductoCRM property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombreProductoCRM(String value) {
        this.nombreProductoCRM = value;
    }

    /**
     * Gets the value of the nombreProductoSEL property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombreProductoSEL() {
        return nombreProductoSEL;
    }

    /**
     * Sets the value of the nombreProductoSEL property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombreProductoSEL(String value) {
        this.nombreProductoSEL = value;
    }

    /**
     * Gets the value of the partNum property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPartNum() {
        return partNum;
    }

    /**
     * Sets the value of the partNum property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPartNum(String value) {
        this.partNum = value;
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
     * Gets the value of the listProductFacturacion property.
     *
     * @return
     *     possible object is
     *     {@link ListProductFacturacionType }
     *
     */
    public ListProductFacturacionType getListProductFacturacion() {
        return listProductFacturacion;
    }

    /**
     * Sets the value of the listProductFacturacion property.
     *
     * @param value
     *     allowed object is
     *     {@link ListProductFacturacionType }
     *
     */
    public void setListProductFacturacion(ListProductFacturacionType value) {
        this.listProductFacturacion = value;
    }

    /**
     * Gets the value of the datos property.
     *
     * @return
     * possible object is
     * {@link String}
     *
     */
    public String getDatos() {
        return datos;
    }

    /**
     * Gets the value of the minutos property.
     *
     * @return
     * possible object is
     * {@link String}
     *
     */
    public String getMinutos() {
        return minutos;
    }

    /**
     * Gets the value of the precio property.
     *
     * @return
     * possible object is
     * {@link String}
     *
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * Gets the value of the sms property.
     *
     * @return
     * possible object is
     * {@link String}
     *
     */
    public String getSMS() {
        return sms;
    }

    /**
     * Gets the value of the vigencia property.
     *
     * @return
     * possible object is
     * {@link String}
     *
     */
    public String getVigencia() {
        return vigencia;
    }

    /**
     * Sets the value of the datos property.
     *
     * @param value
     * allowed object is
     * {@link String}
     *
     */
    public void setDatos(String value) {
        this.datos = value;
    }

    /**
     * Sets the value of the minutos property.
     *
     * @param value
     * allowed object is
     * {@link String}
     *
     */
    public void setMinutos(String value) {
        this.minutos = value;
    }

    /**
     * Sets the value of the precio property.
     *
     * @param value
     * allowed object is
     * {@link String}
     *
     */
    public void setPrecio(String value) {
        this.precio = value;
    }

    /**
     * Sets the value of the sms property.
     *
     * @param value
     * allowed object is
     * {@link String}
     *
     */
    public void setSMS(String value) {
        this.sms = value;
    }

    /**
     * Sets the value of the vigencia property.
     *
     * @param value
     * allowed object is
     * {@link String}
     *
     */
    public void setVigencia(String value) {
        this.vigencia = value;
    }

}
