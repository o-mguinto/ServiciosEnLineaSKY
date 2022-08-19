
package com.oracle.xmlns.pwoperaciones.pwconfiggenerales.bpelpwconfiggenerales;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for salidaSelectConfigGenerales complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="salidaSelectConfigGenerales"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salidaSelectConfigGenerales", propOrder = { "valor", "descripcion" })
public class SalidaSelectConfigGenerales {

    @XmlElement(required = true, nillable = true)
    protected String valor;
    @XmlElement(required = true, nillable = true)
    protected String descripcion;

    /**
     * Gets the value of the valor property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValor(String value) {
        this.valor = value;
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

}
