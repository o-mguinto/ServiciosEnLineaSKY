
package mx.com.sky.sel.proxyclients.rnsoa.generaurlchat.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneraChatRNInputABM_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GeneraChatRNInputABM_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="CodigoPR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoAtencion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoCAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoSubCAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Apellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LineaProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Asunto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Estatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiasEstatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneraChatRNInputABM_TYPE", propOrder = {


    })
public class GeneraChatRNInputABMTYPE {

    @XmlElementRef(name = "CodigoPR",
                   namespace = "http://www.sky.com.mx/EnterpriseObjects/SaaS/RN/GeneraURLChat/Interface",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoPR;
    @XmlElementRef(name = "TipoAtencion",
                   namespace = "http://www.sky.com.mx/EnterpriseObjects/SaaS/RN/GeneraURLChat/Interface",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoAtencion;
    @XmlElementRef(name = "CodigoCAT",
                   namespace = "http://www.sky.com.mx/EnterpriseObjects/SaaS/RN/GeneraURLChat/Interface",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoCAT;
    @XmlElementRef(name = "CodigoSubCAT",
                   namespace = "http://www.sky.com.mx/EnterpriseObjects/SaaS/RN/GeneraURLChat/Interface",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoSubCAT;
    @XmlElementRef(name = "Email",
                   namespace = "http://www.sky.com.mx/EnterpriseObjects/SaaS/RN/GeneraURLChat/Interface",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "Nombre",
                   namespace = "http://www.sky.com.mx/EnterpriseObjects/SaaS/RN/GeneraURLChat/Interface",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombre;
    @XmlElementRef(name = "Apellido",
                   namespace = "http://www.sky.com.mx/EnterpriseObjects/SaaS/RN/GeneraURLChat/Interface",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellido;
    @XmlElementRef(name = "Telefono",
                   namespace = "http://www.sky.com.mx/EnterpriseObjects/SaaS/RN/GeneraURLChat/Interface",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefono;
    @XmlElementRef(name = "Cuenta",
                   namespace = "http://www.sky.com.mx/EnterpriseObjects/SaaS/RN/GeneraURLChat/Interface",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> cuenta;
    @XmlElementRef(name = "Contrato",
                   namespace = "http://www.sky.com.mx/EnterpriseObjects/SaaS/RN/GeneraURLChat/Interface",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> contrato;
    @XmlElementRef(name = "LineaProducto",
                   namespace = "http://www.sky.com.mx/EnterpriseObjects/SaaS/RN/GeneraURLChat/Interface",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineaProducto;
    @XmlElementRef(name = "Asunto",
                   namespace = "http://www.sky.com.mx/EnterpriseObjects/SaaS/RN/GeneraURLChat/Interface",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> asunto;
    @XmlElementRef(name = "Pais", namespace = "http://www.sky.com.mx/EnterpriseObjects/SaaS/RN/GeneraURLChat/Interface",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> pais;
    @XmlElementRef(name = "Estatus",
                   namespace = "http://www.sky.com.mx/EnterpriseObjects/SaaS/RN/GeneraURLChat/Interface",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> estatus;
    @XmlElementRef(name = "DiasEstatus",
                   namespace = "http://www.sky.com.mx/EnterpriseObjects/SaaS/RN/GeneraURLChat/Interface",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> diasEstatus;

    /**
     * Gets the value of the codigoPR property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCodigoPR() {
        return codigoPR;
    }

    /**
     * Sets the value of the codigoPR property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCodigoPR(JAXBElement<String> value) {
        this.codigoPR = value;
    }

    /**
     * Gets the value of the tipoAtencion property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getTipoAtencion() {
        return tipoAtencion;
    }

    /**
     * Sets the value of the tipoAtencion property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setTipoAtencion(JAXBElement<String> value) {
        this.tipoAtencion = value;
    }

    /**
     * Gets the value of the codigoCAT property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCodigoCAT() {
        return codigoCAT;
    }

    /**
     * Sets the value of the codigoCAT property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCodigoCAT(JAXBElement<String> value) {
        this.codigoCAT = value;
    }

    /**
     * Gets the value of the codigoSubCAT property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCodigoSubCAT() {
        return codigoSubCAT;
    }

    /**
     * Sets the value of the codigoSubCAT property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCodigoSubCAT(JAXBElement<String> value) {
        this.codigoSubCAT = value;
    }

    /**
     * Gets the value of the email property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
    }

    /**
     * Gets the value of the nombre property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setNombre(JAXBElement<String> value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the apellido property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getApellido() {
        return apellido;
    }

    /**
     * Sets the value of the apellido property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setApellido(JAXBElement<String> value) {
        this.apellido = value;
    }

    /**
     * Gets the value of the telefono property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getTelefono() {
        return telefono;
    }

    /**
     * Sets the value of the telefono property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setTelefono(JAXBElement<String> value) {
        this.telefono = value;
    }

    /**
     * Gets the value of the cuenta property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCuenta() {
        return cuenta;
    }

    /**
     * Sets the value of the cuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCuenta(JAXBElement<String> value) {
        this.cuenta = value;
    }

    /**
     * Gets the value of the contrato property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getContrato() {
        return contrato;
    }

    /**
     * Sets the value of the contrato property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setContrato(JAXBElement<String> value) {
        this.contrato = value;
    }

    /**
     * Gets the value of the lineaProducto property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getLineaProducto() {
        return lineaProducto;
    }

    /**
     * Sets the value of the lineaProducto property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setLineaProducto(JAXBElement<String> value) {
        this.lineaProducto = value;
    }

    /**
     * Gets the value of the asunto property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getAsunto() {
        return asunto;
    }

    /**
     * Sets the value of the asunto property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setAsunto(JAXBElement<String> value) {
        this.asunto = value;
    }

    /**
     * Gets the value of the pais property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPais() {
        return pais;
    }

    /**
     * Sets the value of the pais property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPais(JAXBElement<String> value) {
        this.pais = value;
    }

    /**
     * Gets the value of the estatus property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getEstatus() {
        return estatus;
    }

    /**
     * Sets the value of the estatus property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setEstatus(JAXBElement<String> value) {
        this.estatus = value;
    }

    /**
     * Gets the value of the diasEstatus property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getDiasEstatus() {
        return diasEstatus;
    }

    /**
     * Sets the value of the diasEstatus property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setDiasEstatus(JAXBElement<String> value) {
        this.diasEstatus = value;
    }

}
