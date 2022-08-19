
package com.oracle.xmlns.sky_btgew.modificarcuentaldap.bpel_modificarcuentaldap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="cuentaSky" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="operacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="paquete" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="enviarCorreo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="productos" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "cuentaSky", "operacion", "paquete", "enviarCorreo", "productos" })
@XmlRootElement(name = "ldapProcess")
public class LdapProcess {

    @XmlElement(required = true)
    protected String cuentaSky;
    @XmlElement(required = true)
    protected String operacion;
    @XmlElement(required = true)
    protected String paquete;
    protected boolean enviarCorreo;
    @XmlElement(required = true)
    protected String productos;

    /**
     * Gets the value of the cuentaSky property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCuentaSky() {
        return cuentaSky;
    }

    /**
     * Sets the value of the cuentaSky property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCuentaSky(String value) {
        this.cuentaSky = value;
    }

    /**
     * Gets the value of the operacion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOperacion() {
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
    public void setOperacion(String value) {
        this.operacion = value;
    }

    /**
     * Gets the value of the paquete property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaquete() {
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
    public void setPaquete(String value) {
        this.paquete = value;
    }

    /**
     * Gets the value of the enviarCorreo property.
     *
     */
    public boolean isEnviarCorreo() {
        return enviarCorreo;
    }

    /**
     * Sets the value of the enviarCorreo property.
     *
     */
    public void setEnviarCorreo(boolean value) {
        this.enviarCorreo = value;
    }

    /**
     * Gets the value of the productos property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProductos() {
        return productos;
    }

    /**
     * Sets the value of the productos property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProductos(String value) {
        this.productos = value;
    }

}
