
package com.oracle.xmlns.pwoperaciones.pwconfiggenerales.bpelpwconfiggenerales;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parametro complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="parametro"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametro", propOrder = { "clave", "valor" })
public class Parametro {

    @XmlElement(required = true)
    protected String clave;
    @XmlElement(required = true)
    protected String valor;

    /**
     * Gets the value of the clave property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getClave() {
        return clave;
    }

    /**
     * Sets the value of the clave property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setClave(String value) {
        this.clave = value;
    }

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

}
