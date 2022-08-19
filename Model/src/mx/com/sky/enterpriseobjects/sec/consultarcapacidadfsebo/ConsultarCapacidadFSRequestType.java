
package mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsebo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarCapacidadFSRequestType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarCapacidadFSRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Parametros" type="{http://www.sky.com.mx/EnterpriseObjects/Sec/ConsultarCapacidadFSEBO}ParametrosType" minOccurs="0"/&gt;
 *         &lt;element name="Fechas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Distribuidor" type="{http://www.sky.com.mx/EnterpriseObjects/Sec/ConsultarCapacidadFSEBO}DistribuidorType" minOccurs="0"/&gt;
 *         &lt;element name="CodigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClavePais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoActividad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeterminarAreaPorZonaTrabajo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeterminarCategorias" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EstimarTiempoViaje" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarCapacidadFSRequestType",
         propOrder =
         { "parametros", "fechas", "distribuidor", "codigoPostal", "clavePais", "tipoActividad",
           "determinarAreaPorZonaTrabajo", "determinarCategorias", "estimarTiempoViaje"
    })
public class ConsultarCapacidadFSRequestType {

    @XmlElement(name = "Parametros")
    protected ParametrosType parametros;
    @XmlElement(name = "Fechas")
    protected String fechas;
    @XmlElement(name = "Distribuidor")
    protected DistribuidorType distribuidor;
    @XmlElement(name = "CodigoPostal")
    protected String codigoPostal;
    @XmlElement(name = "ClavePais")
    protected String clavePais;
    @XmlElement(name = "TipoActividad")
    protected String tipoActividad;
    @XmlElement(name = "DeterminarAreaPorZonaTrabajo")
    protected Boolean determinarAreaPorZonaTrabajo;
    @XmlElement(name = "DeterminarCategorias")
    protected Boolean determinarCategorias;
    @XmlElement(name = "EstimarTiempoViaje")
    protected Boolean estimarTiempoViaje;

    /**
     * Gets the value of the parametros property.
     *
     * @return
     *     possible object is
     *     {@link ParametrosType }
     *
     */
    public ParametrosType getParametros() {
        return parametros;
    }

    /**
     * Sets the value of the parametros property.
     *
     * @param value
     *     allowed object is
     *     {@link ParametrosType }
     *
     */
    public void setParametros(ParametrosType value) {
        this.parametros = value;
    }

    /**
     * Gets the value of the fechas property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechas() {
        return fechas;
    }

    /**
     * Sets the value of the fechas property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechas(String value) {
        this.fechas = value;
    }

    /**
     * Gets the value of the distribuidor property.
     *
     * @return
     *     possible object is
     *     {@link DistribuidorType }
     *
     */
    public DistribuidorType getDistribuidor() {
        return distribuidor;
    }

    /**
     * Sets the value of the distribuidor property.
     *
     * @param value
     *     allowed object is
     *     {@link DistribuidorType }
     *
     */
    public void setDistribuidor(DistribuidorType value) {
        this.distribuidor = value;
    }

    /**
     * Gets the value of the codigoPostal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Sets the value of the codigoPostal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoPostal(String value) {
        this.codigoPostal = value;
    }

    /**
     * Gets the value of the clavePais property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getClavePais() {
        return clavePais;
    }

    /**
     * Sets the value of the clavePais property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setClavePais(String value) {
        this.clavePais = value;
    }

    /**
     * Gets the value of the tipoActividad property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoActividad() {
        return tipoActividad;
    }

    /**
     * Sets the value of the tipoActividad property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoActividad(String value) {
        this.tipoActividad = value;
    }

    /**
     * Gets the value of the determinarAreaPorZonaTrabajo property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isDeterminarAreaPorZonaTrabajo() {
        return determinarAreaPorZonaTrabajo;
    }

    /**
     * Sets the value of the determinarAreaPorZonaTrabajo property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setDeterminarAreaPorZonaTrabajo(Boolean value) {
        this.determinarAreaPorZonaTrabajo = value;
    }

    /**
     * Gets the value of the determinarCategorias property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isDeterminarCategorias() {
        return determinarCategorias;
    }

    /**
     * Sets the value of the determinarCategorias property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setDeterminarCategorias(Boolean value) {
        this.determinarCategorias = value;
    }

    /**
     * Gets the value of the estimarTiempoViaje property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isEstimarTiempoViaje() {
        return estimarTiempoViaje;
    }

    /**
     * Sets the value of the estimarTiempoViaje property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setEstimarTiempoViaje(Boolean value) {
        this.estimarTiempoViaje = value;
    }

}
