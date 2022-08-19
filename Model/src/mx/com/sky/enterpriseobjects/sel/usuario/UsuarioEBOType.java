
package mx.com.sky.enterpriseobjects.sel.usuario;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UsuarioEBOType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="UsuarioEBOType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumeroCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NombreSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Producto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsuarioEBOType", propOrder = { "numeroCuenta", "nombreSuscriptor", "producto", "nombre", "aPaterno", "aMaterno" })
public class UsuarioEBOType {

    @XmlElement(name = "NumeroCuenta", required = true)
    protected String numeroCuenta;
    @XmlElement(name = "NombreSuscriptor", required = true)
    protected String nombreSuscriptor;
    @XmlElement(name = "Producto", required = true)
    protected String producto;
    
    @XmlElement(name = "Nombre", required = true)
    protected String nombre;
    @XmlElement(name = "APaterno", required = true)
    protected String aPaterno;
    @XmlElement(name = "AMaterno", required = true)
    protected String aMaterno;

    /**
     * Gets the value of the numeroCuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Sets the value of the numeroCuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroCuenta(String value) {
        this.numeroCuenta = value;
    }

    /**
     * Gets the value of the nombreSuscriptor property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombreSuscriptor() {
        return nombreSuscriptor;
    }

    /**
     * Sets the value of the nombreSuscriptor property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombreSuscriptor(String value) {
        this.nombreSuscriptor = value;
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
     * Sets the value of the aPaterno property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */    
    public void setAPaterno(String value) {
        this.aPaterno = value;
    }

    /**
     * Gets the value of the aPaterno property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */    
    public String getAPaterno() {
        return aPaterno;
    }

    /**
     * Sets the value of the aMaterno property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */    
    public void setAMaterno(String value) {
        this.aMaterno = value;
    }

    /**
     * Gets the value of the aMaterno property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAMaterno() {
        return aMaterno;
    }
}
