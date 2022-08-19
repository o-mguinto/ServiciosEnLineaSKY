
package mx.com.sky.enterpriseobjects.sel.consultarserviciosadicionales;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarServiciosAdicionalesEBOType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarServiciosAdicionalesEBOType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NombreProductoCRM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreProductoSEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PartNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BolsaDatosCantidad" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="BolsaDatosUnidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TiempoPaquete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UOMTiempoPaquete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SMSPaquete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Imagen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Costo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CostoDiferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListProductFacturacion" type="{http://www.sky.com.mx/EnterpriseObjects/Sel/ConsultarServiciosAdicionales}ListProductFacturacion_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarServiciosAdicionalesEBOType",
         propOrder =
         { "nombreProductoCRM", "nombreProductoSEL", "partNum", "bolsaDatosCantidad", "bolsaDatosUnidad",
           "tiempoPaquete", "uomTiempoPaquete", "smsPaquete", "imagen", "descripcion", "costo", "costoDiferencia",
           "listProductFacturacion"
    })
public class ConsultarServiciosAdicionalesEBOType {

    @XmlElement(name = "NombreProductoCRM")
    protected String nombreProductoCRM;
    @XmlElement(name = "NombreProductoSEL")
    protected String nombreProductoSEL;
    @XmlElement(name = "PartNum")
    protected String partNum;
    @XmlElement(name = "BolsaDatosCantidad")
    protected Float bolsaDatosCantidad;
    @XmlElement(name = "BolsaDatosUnidad")
    protected String bolsaDatosUnidad;
    @XmlElement(name = "TiempoPaquete")
    protected String tiempoPaquete;
    @XmlElement(name = "UOMTiempoPaquete")
    protected String uomTiempoPaquete;
    @XmlElement(name = "SMSPaquete")
    protected String smsPaquete;
    @XmlElement(name = "Imagen")
    protected String imagen;
    @XmlElement(name = "Descripcion")
    protected String descripcion;
    @XmlElement(name = "Costo")
    protected String costo;
    @XmlElement(name = "CostoDiferencia")
    protected String costoDiferencia;
    @XmlElement(name = "ListProductFacturacion")
    protected ListProductFacturacionType listProductFacturacion;

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
     * Gets the value of the bolsaDatosCantidad property.
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public Float getBolsaDatosCantidad() {
        return bolsaDatosCantidad;
    }

    /**
     * Sets the value of the bolsaDatosCantidad property.
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     */
    public void setBolsaDatosCantidad(Float value) {
        this.bolsaDatosCantidad = value;
    }

    /**
     * Gets the value of the bolsaDatosUnidad property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBolsaDatosUnidad() {
        return bolsaDatosUnidad;
    }

    /**
     * Sets the value of the bolsaDatosUnidad property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBolsaDatosUnidad(String value) {
        this.bolsaDatosUnidad = value;
    }

    /**
     * Gets the value of the tiempoPaquete property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTiempoPaquete() {
        return tiempoPaquete;
    }

    /**
     * Sets the value of the tiempoPaquete property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTiempoPaquete(String value) {
        this.tiempoPaquete = value;
    }

    /**
     * Gets the value of the uomTiempoPaquete property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUOMTiempoPaquete() {
        return uomTiempoPaquete;
    }

    /**
     * Sets the value of the uomTiempoPaquete property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUOMTiempoPaquete(String value) {
        this.uomTiempoPaquete = value;
    }

    /**
     * Gets the value of the smsPaquete property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSMSPaquete() {
        return smsPaquete;
    }

    /**
     * Sets the value of the smsPaquete property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSMSPaquete(String value) {
        this.smsPaquete = value;
    }

    /**
     * Gets the value of the imagen property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Sets the value of the imagen property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setImagen(String value) {
        this.imagen = value;
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
     * Gets the value of the costo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCosto() {
        return costo;
    }

    /**
     * Sets the value of the costo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCosto(String value) {
        this.costo = value;
    }

    /**
     * Gets the value of the costoDiferencia property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCostoDiferencia() {
        return costoDiferencia;
    }

    /**
     * Sets the value of the costoDiferencia property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCostoDiferencia(String value) {
        this.costoDiferencia = value;
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

}
