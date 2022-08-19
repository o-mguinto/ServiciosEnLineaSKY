
package com.oracle.xmlns.pcbpel.adapter.db.sp.dbvalidacrecimientosppbtisec;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="VALIDO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PRECIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "valido", "precio" })
@XmlRootElement(name = "OutputParameters")
public class OutputParameters {

    @XmlElementRef(name = "VALIDO",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbValidaCrecimientosPpBtiSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> valido;
    @XmlElementRef(name = "PRECIO",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbValidaCrecimientosPpBtiSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> precio;

    /**
     * Gets the value of the valido property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *
     */
    public JAXBElement<BigDecimal> getVALIDO() {
        return valido;
    }

    /**
     * Sets the value of the valido property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *
     */
    public void setVALIDO(JAXBElement<BigDecimal> value) {
        this.valido = value;
    }

    /**
     * Gets the value of the precio property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPRECIO() {
        return precio;
    }

    /**
     * Sets the value of the precio property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPRECIO(JAXBElement<String> value) {
        this.precio = value;
    }

}
