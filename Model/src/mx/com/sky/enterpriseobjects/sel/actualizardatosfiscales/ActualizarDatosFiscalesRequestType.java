
package mx.com.sky.enterpriseobjects.sel.actualizardatosfiscales;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActualizarDatosFiscalesRequestType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ActualizarDatosFiscalesRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MetodoEnvio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoFactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RazonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Calle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Colonia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Municipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ciudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroExterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroInterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RFC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Proceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Origen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegimenFiscal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UsoCFDI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SistemaOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SolicitudDeServicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActualizarDatosFiscalesRequestType",
         propOrder =
         { "cuenta", "descripcion", "metodoEnvio", "tipoFactura", "razonSocial", "calle", "colonia", "municipio",
           "ciudad", "codigoPostal", "estado", "nombre", "numeroExterior", "numeroInterior", "rfc", "proceso", "origen",
           "tipoPersona", "regimenFiscal", "usoCFDI", "sistemaOrigen", "solicitudDeServicio"
    })
public class ActualizarDatosFiscalesRequestType {

    @XmlElement(name = "Cuenta")
    protected String cuenta;
    @XmlElement(name = "Descripcion")
    protected String descripcion;
    @XmlElement(name = "MetodoEnvio")
    protected String metodoEnvio;
    @XmlElement(name = "TipoFactura")
    protected String tipoFactura;
    @XmlElement(name = "RazonSocial")
    protected String razonSocial;
    @XmlElement(name = "Calle")
    protected String calle;
    @XmlElement(name = "Colonia")
    protected String colonia;
    @XmlElement(name = "Municipio")
    protected String municipio;
    @XmlElement(name = "Ciudad")
    protected String ciudad;
    @XmlElement(name = "CodigoPostal")
    protected String codigoPostal;
    @XmlElement(name = "Estado")
    protected String estado;
    @XmlElement(name = "Nombre")
    protected String nombre;
    @XmlElement(name = "NumeroExterior")
    protected String numeroExterior;
    @XmlElement(name = "NumeroInterior")
    protected String numeroInterior;
    @XmlElement(name = "RFC")
    protected String rfc;
    @XmlElement(name = "Proceso")
    protected String proceso;
    @XmlElement(name = "Origen")
    protected String origen;
    @XmlElement(name = "TipoPersona")
    protected String tipoPersona;
    @XmlElement(name = "RegimenFiscal")
    protected String regimenFiscal;
    @XmlElement(name = "UsoCFDI")
    protected String usoCFDI;
    @XmlElement(name = "SistemaOrigen")
    protected String sistemaOrigen;
    @XmlElement(name = "SolicitudDeServicio")
    protected String solicitudDeServicio;

    /**
     * Gets the value of the cuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Sets the value of the cuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCuenta(String value) {
        this.cuenta = value;
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
     * Gets the value of the metodoEnvio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMetodoEnvio() {
        return metodoEnvio;
    }

    /**
     * Sets the value of the metodoEnvio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMetodoEnvio(String value) {
        this.metodoEnvio = value;
    }

    /**
     * Gets the value of the tipoFactura property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoFactura() {
        return tipoFactura;
    }

    /**
     * Sets the value of the tipoFactura property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoFactura(String value) {
        this.tipoFactura = value;
    }

    /**
     * Gets the value of the razonSocial property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Sets the value of the razonSocial property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRazonSocial(String value) {
        this.razonSocial = value;
    }

    /**
     * Gets the value of the calle property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Sets the value of the calle property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCalle(String value) {
        this.calle = value;
    }

    /**
     * Gets the value of the colonia property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * Sets the value of the colonia property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setColonia(String value) {
        this.colonia = value;
    }

    /**
     * Gets the value of the municipio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * Sets the value of the municipio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMunicipio(String value) {
        this.municipio = value;
    }

    /**
     * Gets the value of the ciudad property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Sets the value of the ciudad property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCiudad(String value) {
        this.ciudad = value;
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
     * Gets the value of the estado property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEstado(String value) {
        this.estado = value;
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
     * Gets the value of the numeroExterior property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroExterior() {
        return numeroExterior;
    }

    /**
     * Sets the value of the numeroExterior property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroExterior(String value) {
        this.numeroExterior = value;
    }

    /**
     * Gets the value of the numeroInterior property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroInterior() {
        return numeroInterior;
    }

    /**
     * Sets the value of the numeroInterior property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroInterior(String value) {
        this.numeroInterior = value;
    }

    /**
     * Gets the value of the rfc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRFC() {
        return rfc;
    }

    /**
     * Sets the value of the rfc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRFC(String value) {
        this.rfc = value;
    }

    /**
     * Gets the value of the proceso property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProceso() {
        return proceso;
    }

    /**
     * Sets the value of the proceso property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProceso(String value) {
        this.proceso = value;
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

    /**
     * Gets the value of the tipoPersona property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoPersona() {
        return tipoPersona;
    }

    /**
     * Sets the value of the tipoPersona property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoPersona(String value) {
        this.tipoPersona = value;
    }

    /**
     * Gets the value of the regimenFiscal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegimenFiscal() {
        return regimenFiscal;
    }

    /**
     * Sets the value of the regimenFiscal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRegimenFiscal(String value) {
        this.regimenFiscal = value;
    }

    /**
     * Gets the value of the usoCFDI property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUsoCFDI() {
        return usoCFDI;
    }

    /**
     * Sets the value of the usoCFDI property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUsoCFDI(String value) {
        this.usoCFDI = value;
    }

    /**
     * Gets the value of the sistemaOrigen property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSistemaOrigen() {
        return sistemaOrigen;
    }

    /**
     * Sets the value of the sistemaOrigen property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSistemaOrigen(String value) {
        this.sistemaOrigen = value;
    }

    /**
     * Gets the value of the solicitudDeServicio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSolicitudDeServicio() {
        return solicitudDeServicio;
    }

    /**
     * Sets the value of the solicitudDeServicio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSolicitudDeServicio(String value) {
        this.solicitudDeServicio = value;
    }

}
